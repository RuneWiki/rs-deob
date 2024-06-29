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

@OriginalClass("client!hg")
public class class473 {

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    private int field6167 = -1;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Z")
    private boolean field6155 = true;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    private int field6170;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    private int field6164;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    private int field6163;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "[Lfm;")
    private class251[] field6152;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    private int field6166;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "[Lfm;")
    private class251[] field6160;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lfm;")
    private class251 field6153;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Lgga;")
    public static class462 field6161 = new class462();

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    private int field6157;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    private int field6159;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "Lxa;")
    private class511 field6171;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "[Lbw;")
    public static class24[] field6165;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lcda;B)V", line = 13)
    public static final void method2616(class534 arg0, byte arg1) {
        field6162++;
        class537 var2 = (class537) class692.field9454.method2090(true);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field6991; var4++) {
            if (var2.field6998[var4] != null) {
                if (var2.field6998[var4].field7108 == 2) {
                    var2.field6995[var4] = -5;
                }
                if (var2.field6998[var4].field7108 == 0) {
                    var3 = true;
                }
            }
            if (var2.field6994[var4] != null) {
                if (var2.field6994[var4].field7108 == 2) {
                    var2.field6995[var4] = -6;
                }
                if (var2.field6994[var4].field7108 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg0.field5367;
        arg0.method2353(var2.field6984, (byte) -122);
        for (int var6 = 0; var6 < var2.field6991; var6++) {
            if (var2.field6995[var6] == 0) {
                try {
                    int var7 = var2.field6988[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field6998[var6].field7113;
                        int var9 = var8.getInt(null);
                        arg0.method2352(true, 0);
                        arg0.method2353(var9, (byte) -31);
                    } else if (var7 == 1) {
                        Field var12 = (Field) var2.field6998[var6].field7113;
                        var12.setInt(null, var2.field6985[var6]);
                        arg0.method2352(true, 0);
                    } else if (var7 == 2) {
                        Field var10 = (Field) var2.field6998[var6].field7113;
                        int var11 = var10.getModifiers();
                        arg0.method2352(true, 0);
                        arg0.method2353(var11, (byte) -96);
                    }
                    if (var7 == 3) {
                        Method var15 = (Method) var2.field6994[var6].field7113;
                        byte[][] var16 = var2.field6986[var6];
                        Object[] var17 = new Object[var16.length];
                        for (int var18 = 0; var18 < var16.length; var18++) {
                            ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                            var17[var18] = var19.readObject();
                        }
                        Object var20 = var15.invoke(null, var17);
                        if (var20 == null) {
                            arg0.method2352(true, 0);
                        } else if ((var20 instanceof Number)) {
                            arg0.method2352(true, 1);
                            arg0.method2391((byte) 110, ((Number) var20).longValue());
                        } else if (var20 instanceof String) {
                            arg0.method2352(true, 2);
                            arg0.method2374((String) var20, -104);
                        } else {
                            arg0.method2352(true, 4);
                        }
                    } else if (var7 == 4) {
                        Method var13 = (Method) var2.field6994[var6].field7113;
                        int var14 = var13.getModifiers();
                        arg0.method2352(true, 0);
                        arg0.method2353(var14, (byte) -38);
                    }
                } catch (ClassNotFoundException var21) {
                    arg0.method2352(true, -10);
                } catch (InvalidClassException var22) {
                    arg0.method2352(true, -11);
                } catch (StreamCorruptedException var23) {
                    arg0.method2352(true, -12);
                } catch (OptionalDataException var24) {
                    arg0.method2352(true, -13);
                } catch (IllegalAccessException var25) {
                    arg0.method2352(true, -14);
                } catch (IllegalArgumentException var26) {
                    arg0.method2352(true, -15);
                } catch (InvocationTargetException var27) {
                    arg0.method2352(true, -16);
                } catch (SecurityException var28) {
                    arg0.method2352(true, -17);
                } catch (IOException var29) {
                    arg0.method2352(true, -18);
                } catch (NullPointerException var30) {
                    arg0.method2352(true, -19);
                } catch (Exception var31) {
                    arg0.method2352(true, -20);
                } catch (Throwable var32) {
                    arg0.method2352(true, -21);
                }
            } else {
                arg0.method2352(true, var2.field6995[var6]);
            }
        }
        if (arg1 != -21) {
            method2616(null, (byte) 22);
        }
        arg0.method2368(var5, (byte) -119);
        var2.method2438((byte) 121);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI[JI[Ljava/lang/Object;)V", line = 197)
    public static final void method2617(byte arg0, int arg1, long[] arg2, int arg3, Object[] arg4) {
        if (arg0 != 51) {
            return;
        }
        field6154++;
        if (arg3 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        long var7 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var7;
        Object var9 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg3; var11++) {
            if ((var7 + ((long) (var10 & var11))) > arg2[var11]) {
                long var12 = arg2[var11];
                arg2[var11] = arg2[var6];
                arg2[var6] = var12;
                Object var14 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6++] = var14;
            }
        }
        arg2[arg3] = arg2[var6];
        arg2[var6] = var7;
        arg4[arg3] = arg4[var6];
        arg4[var6] = var9;
        method2617((byte) 51, arg1, arg2, var6 - 1, arg4);
        method2617((byte) 51, var6 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIBILoa;III)V", line = 255)
    public final void method2618(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class43 arg6, int arg7, int arg8, int arg9) {
        field6169++;
        if (arg4 >= -5) {
            this.method2621(96);
        }
        int var11 = arg1 + arg2 & 0x3FFF;
        if (this.field6170 == -1) {
            arg6.method353(arg5, arg3, arg7, arg9, arg8, 0);
        } else {
            class59 var12 = class547.field7106.method3162((byte) -104, this.field6170);
            if (this.field6171 == null && class547.field7106.method3164((byte) -31, this.field6170)) {
                int[] var13 = var12.field812 ? class547.field7106.method3160(false, this.field6159, this.field6170, this.field6159, 0.7F, 38) : class547.field7106.method3158(this.field6159, false, 0.7F, this.field6159, this.field6170, (byte) -56);
                this.field6171 = arg6.method381(var13, 0, this.field6159, this.field6159, this.field6159);
            }
            if (var12.field812) {
                arg6.method353(arg5, arg3, arg7, arg9, arg8, 0);
            }
            if (this.field6171 != null) {
                int var14 = var12.field812 ? 1 : 0;
                int var15 = arg0 * arg9 / -4096;
                int var16;
                for (var16 = (arg7 - arg9) / 2 + (arg9 * var11 / 4096); var16 > arg9; var16 -= arg9) {
                }
                while (var16 < 0) {
                    var16 += arg9;
                }
                while (arg9 < var15) {
                    var15 -= arg9;
                }
                while (var15 < 0) {
                    var15 += arg9;
                }
                for (int var17 = var16 - arg9; var17 < arg7; var17 += arg9) {
                    for (int var18 = var15 - arg9; var18 < arg9; var18 += arg9) {
                        this.field6171.method604(arg5 + var17, arg3 + var18, arg9, arg9, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field6157 - 1; var19 >= 0; var19--) {
            this.field6160[var19].method1598(arg6, arg5, arg3, arg7, arg9, arg0, var11);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Loa;II)Z", line = 339)
    public final boolean method2619(class43 arg0, int arg1, int arg2) {
        if (this.field6167 != arg1) {
            this.field6167 = arg1;
            int var4 = class71.method571(arg1, (byte) 87);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field6159 != var4) {
                this.field6159 = var4;
                this.field6171 = null;
            }
            if (this.field6152 != null) {
                this.field6157 = 0;
                int[] var5 = new int[this.field6152.length];
                for (int var6 = 0; var6 < this.field6152.length; var6++) {
                    class251 var7 = this.field6152[var6];
                    if (var7.method1600(this.field6163, this.field6164, this.field6166, this.field6167)) {
                        var5[this.field6157] = var7.field3437;
                        this.field6160[this.field6157++] = var7;
                    }
                }
                class79.method629(0, this.field6160, this.field6157 - 1, 24, var5);
            }
            this.field6155 = true;
        }
        field6158++;
        boolean var8 = false;
        if (arg2 != 5120) {
            return true;
        }
        if (this.field6155) {
            this.field6155 = false;
            for (int var9 = this.field6157 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field6160[var9].method1596(arg0, this.field6153);
                var8 |= var10;
                this.field6155 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(I[Lfm;IIII)V", line = 460)
    public class473(int arg0, class251[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6170 = arg0;
        this.field6164 = arg4;
        this.field6163 = arg3;
        this.field6152 = arg1;
        this.field6166 = arg5;
        if (arg1 == null) {
            this.field6160 = null;
            this.field6153 = null;
        } else {
            this.field6160 = new class251[arg1.length];
            this.field6153 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 420)
    public static void method2620(boolean arg0) {
        field6161 = null;
        field6165 = null;
        if (!arg0) {
            method2616(null, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 435)
    public final void method2621(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field6156++;
        if (this.field6152 != null) {
            for (int var2 = 0; var2 < this.field6152.length; var2++) {
                this.field6152[var2].method1592();
            }
        }
        this.field6171 = null;
    }
}
