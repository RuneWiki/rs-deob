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

@OriginalClass("client!qh")
public class class182 extends class46 {

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
    public static int field3335 = -1;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "Lmb;")
    private static class132 field3334 = class166.method1092("slide:", 123);

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field3342 = -1;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "Lmb;")
    public static class132 field3344 = field3334;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "Z")
    public static boolean field3345 = false;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "Lmb;")
    public static class132 field3346 = field3334;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "Lkg;")
    public static class115 field3339 = new class115(200);

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "[Lqi;")
    public static class183[] field3349 = new class183[500];

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "[Ltf;")
    public static class210[] field3351 = new class210[4];

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "Lmb;")
    public static class132 field3350 = class166.method1092("Sie befinden sich in einem Mitglieder)2Gebiet(Q", 112);

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "Z")
    public static boolean field3352 = true;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "B")
    public static byte field3338;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public int field3337;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lkd;I)V")
    public final void method1167(class112 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method716(-1308);
            if (var3 == 0) {
                field3336++;
                if (arg1 != 22426) {
                    this.method1170((byte) 51, -74, null);
                    return;
                }
                return;
            }
            this.method1170((byte) 76, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(B)V")
    public static void method1168(byte arg0) {
        field3334 = null;
        field3344 = null;
        field3351 = null;
        if (arg0 < -15) {
            field3346 = null;
            field3350 = null;
            field3349 = null;
            field3339 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
    public static final void method1169(boolean arg0) {
        if (class9.field85[96]) {
            class13.field171 += (-class13.field171 - 24) / 2;
        } else if (class9.field85[97]) {
            class13.field171 += (24 - class13.field171) / 2;
        } else {
            class13.field171 /= 2;
        }
        field3341++;
        if (!arg0) {
            return;
        }
        class230.field4153 += class13.field171 / 2;
        int var1 = class220.field4021 + class210.field3854.field673;
        int var2 = class210.field3854.field723 + class141.field2640;
        if (class9.field85[98]) {
            class138.field2587 += (12 - class138.field2587) / 2;
        } else if (class9.field85[99]) {
            class138.field2587 += (-class138.field2587 - 12) / 2;
        } else {
            class138.field2587 /= 2;
        }
        class229.field4130 += class138.field2587 / 2;
        if (class187.field3460 - var1 < -500 || class187.field3460 - var1 > 500 || class21.field310 - var2 < -500 || class21.field310 - var2 > 500) {
            class187.field3460 = var1;
            class21.field310 = var2;
        }
        if (class21.field310 != var2) {
            class21.field310 += (var2 - class21.field310) / 16;
        }
        if (class187.field3460 != var1) {
            class187.field3460 += (var1 - class187.field3460) / 16;
        }
        class220.method1371(-108);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BILkd;)V")
    private final void method1170(byte arg0, int arg1, class112 arg2) {
        if (arg0 != 76) {
            this.method1167(null, -105);
        }
        if (arg1 == 1) {
            this.field3347 = arg2.method739(86);
            this.field3337 = arg2.method716(-1308);
            this.field3340 = arg2.method716(-1308);
        }
        field3348++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjh;I)V")
    public static final void method1171(int arg0, class106 arg1, int arg2) {
        field3343++;
        if (arg0 != -11) {
            field3338 = 73;
        }
        while (true) {
            class10 var3 = (class10) class211.field3872.method119(true);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field118; var5++) {
                if (var3.field115[var5] != null) {
                    if (var3.field115[var5].field2264 == 2) {
                        var3.field108[var5] = -5;
                    }
                    if (var3.field115[var5].field2264 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field114[var5] != null) {
                    if (var3.field114[var5].field2264 == 2) {
                        var3.field108[var5] = -6;
                    }
                    if (var3.field114[var5].field2264 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method660(arg2, arg0 + 14);
            arg1.method747(0, (byte) -62);
            int var6 = arg1.field2133;
            arg1.method726((byte) -95, var3.field110);
            for (int var7 = 0; var7 < var3.field118; var7++) {
                if (var3.field108[var7] == 0) {
                    try {
                        int var8 = var3.field105[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field115[var7].field2269;
                            int var10 = var9.getInt(null);
                            arg1.method747(0, (byte) -124);
                            arg1.method726((byte) 101, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field115[var7].field2269;
                            var11.setInt(null, var3.field104[var7]);
                            arg1.method747(0, (byte) -109);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field115[var7].field2269;
                            int var13 = var12.getModifiers();
                            arg1.method747(0, (byte) -33);
                            arg1.method726((byte) 88, var13);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field114[var7].field2269;
                            byte[][] var17 = var3.field112[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method747(0, (byte) -99);
                            } else if (var21 instanceof Number) {
                                arg1.method747(1, (byte) -49);
                                arg1.method709(arg0 - 27330, ((Number) var21).longValue());
                            } else if (var21 instanceof class132) {
                                arg1.method747(2, (byte) -128);
                                arg1.method722((class132) var21, -1607065512);
                            } else {
                                arg1.method747(4, (byte) -51);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field114[var7].field2269;
                            int var15 = var14.getModifiers();
                            arg1.method747(0, (byte) -51);
                            arg1.method726((byte) -70, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method747(-10, (byte) -31);
                    } catch (InvalidClassException var23) {
                        arg1.method747(-11, (byte) -91);
                    } catch (StreamCorruptedException var24) {
                        arg1.method747(-12, (byte) -82);
                    } catch (OptionalDataException var25) {
                        arg1.method747(-13, (byte) -37);
                    } catch (IllegalAccessException var26) {
                        arg1.method747(-14, (byte) -65);
                    } catch (IllegalArgumentException var27) {
                        arg1.method747(-15, (byte) -88);
                    } catch (InvocationTargetException var28) {
                        arg1.method747(-16, (byte) -51);
                    } catch (SecurityException var29) {
                        arg1.method747(-17, (byte) -60);
                    } catch (IOException var30) {
                        arg1.method747(-18, (byte) -84);
                    } catch (NullPointerException var31) {
                        arg1.method747(-19, (byte) -52);
                    } catch (Exception var32) {
                        arg1.method747(-20, (byte) -114);
                    } catch (Throwable var33) {
                        arg1.method747(-21, (byte) -93);
                    }
                } else {
                    arg1.method747(var3.field108[var7], (byte) -102);
                }
            }
            arg1.method740(var6, true);
            arg1.method731(-15826, arg1.field2133 - var6);
            var3.method995((byte) 117);
        }
    }
}
