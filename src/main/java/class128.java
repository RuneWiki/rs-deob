import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class128 {

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public int field2210 = 128;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public int field2203 = 128;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "Z")
    public static boolean field2196;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Lvv;")
    public static class313 field2206;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "F")
    public static float field2212;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "[Lsh;")
    public static class194[] field2200;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBLap;)V")
    public static final void method990(int arg0, byte arg1, class340 arg2) {
        int var3 = 108 % ((arg1 + 54) / 39);
        field2205++;
        while (true) {
            class3 var4 = (class3) class116.field2068.method2538(-3);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field32; var6++) {
                if (var4.field26[var6] != null) {
                    if (var4.field26[var6].field2692 == 2) {
                        var4.field30[var6] = -5;
                    }
                    if (var4.field26[var6].field2692 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field20[var6] != null) {
                    if (var4.field20[var6].field2692 == 2) {
                        var4.field30[var6] = -6;
                    }
                    if (var4.field20[var6].field2692 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg2.method2156(arg0, -3498);
            arg2.method163(0, (byte) 49);
            int var7 = arg2.field301;
            arg2.method152(var4.field24, (byte) -38);
            for (int var8 = 0; var8 < var4.field32; var8++) {
                if (var4.field30[var8] == 0) {
                    try {
                        int var9 = var4.field28[var8];
                        if (var9 == 0) {
                            Field var10 = (Field) var4.field26[var8].field2695;
                            int var11 = var10.getInt(null);
                            arg2.method163(0, (byte) 49);
                            arg2.method152(var11, (byte) -38);
                        } else if (var9 == 1) {
                            Field var14 = (Field) var4.field26[var8].field2695;
                            var14.setInt(null, var4.field19[var8]);
                            arg2.method163(0, (byte) 49);
                        } else if (var9 == 2) {
                            Field var12 = (Field) var4.field26[var8].field2695;
                            int var13 = var12.getModifiers();
                            arg2.method163(0, (byte) 49);
                            arg2.method152(var13, (byte) -38);
                        }
                        if (var9 == 3) {
                            Method var15 = (Method) var4.field20[var8].field2695;
                            byte[][] var16 = var4.field22[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var18 < var16.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke(null, var17);
                            if (var20 == null) {
                                arg2.method163(0, (byte) 49);
                            } else if ((var20 instanceof Number)) {
                                arg2.method163(1, (byte) 49);
                                arg2.method135(16056, ((Number) var20).longValue());
                            } else if ((var20 instanceof String)) {
                                arg2.method163(2, (byte) 49);
                                arg2.method145((String) var20, (byte) 0);
                            } else {
                                arg2.method163(4, (byte) 49);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field20[var8].field2695;
                            int var22 = var21.getModifiers();
                            arg2.method163(0, (byte) 49);
                            arg2.method152(var22, (byte) -38);
                        }
                    } catch (ClassNotFoundException var23) {
                        arg2.method163(-10, (byte) 49);
                    } catch (InvalidClassException var24) {
                        arg2.method163(-11, (byte) 49);
                    } catch (StreamCorruptedException var25) {
                        arg2.method163(-12, (byte) 49);
                    } catch (OptionalDataException var26) {
                        arg2.method163(-13, (byte) 49);
                    } catch (IllegalAccessException var27) {
                        arg2.method163(-14, (byte) 49);
                    } catch (IllegalArgumentException var28) {
                        arg2.method163(-15, (byte) 49);
                    } catch (InvocationTargetException var29) {
                        arg2.method163(-16, (byte) 49);
                    } catch (SecurityException var30) {
                        arg2.method163(-17, (byte) 49);
                    } catch (IOException var31) {
                        arg2.method163(-18, (byte) 49);
                    } catch (NullPointerException var32) {
                        arg2.method163(-19, (byte) 49);
                    } catch (Exception var33) {
                        arg2.method163(-20, (byte) 49);
                    } catch (Throwable var34) {
                        arg2.method163(-21, (byte) 49);
                    }
                } else {
                    arg2.method163(var4.field30[var8], (byte) 49);
                }
            }
            arg2.method147(255, var7);
            arg2.method140(arg2.field301 - var7, true);
            var4.method1821((byte) 30);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILpq;)V")
    public final void method991(int arg0, class128 arg1) {
        this.field2210 = arg1.field2210;
        this.field2203 = arg1.field2203;
        this.field2194 = arg1.field2194;
        this.field2209 = arg1.field2209;
        this.field2193 = arg1.field2193;
        if (arg0 != 5694) {
            method990(-85, (byte) -56, null);
        }
        this.field2204 = arg1.field2204;
        field2199++;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Lpq;")
    public final class128 method992(int arg0) {
        field2202++;
        if (arg0 != -3) {
            field2201 = -106;
        }
        return new class128(this.field2204, this.field2203, this.field2210, this.field2194, this.field2209, this.field2193);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
    public static void method993(byte arg0) {
        field2200 = null;
        field2206 = null;
        if (arg0 > -38) {
            field2212 = 1.1150767F;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBI)I")
    public static final int method994(int arg0, byte arg1, int arg2) {
        field2198++;
        if (arg1 < 80) {
            field2208 = -102;
        }
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(I)V")
    public class128(int arg0) {
        this.field2204 = arg0;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(IIIIII)V")
    private class128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2194 = arg3;
        this.field2209 = arg4;
        this.field2204 = arg0;
        this.field2210 = arg2;
        this.field2193 = arg5;
        this.field2203 = arg1;
    }

    static {
        new class306(null, "der Spieler ist momentan nicht verfügbar.", null, null);
        field2196 = false;
        field2201 = 0;
        field2208 = 0;
        field2206 = new class313(62, 12);
    }
}
