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

@OriginalClass("client!ni")
public class class360 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public int field4850;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Z")
    public boolean field4859;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Z")
    public boolean field4852;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "[S")
    public short[] field4868;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    private int field4858;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public int field4866;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    private int field4856;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    private int field4857;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    private int field4860;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    private int field4863;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "Lor;")
    public class451 field4867;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
    public final void method2096(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4857 = arg2;
        field4853++;
        this.field4856 = arg0;
        this.field4860 = arg3;
        this.field4863 = arg1;
        if (arg4 <= 68) {
            method2101(-46, -65, 109, -13, -54, -114, 73);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIBIILqa;)V")
    private final void method2097(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class162 arg6) {
        if (arg3 != 61) {
            this.field4858 = 116;
        }
        this.field4867 = arg6.method588(arg0, arg1, arg2, arg4, arg5, 1.0F);
        field4849++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    private final void method2098(int arg0) {
        field4851++;
        int var2 = this.field4866;
        if (var2 == 2) {
            this.field4857 = 2048;
            this.field4860 = 0;
            this.field4856 = 2048;
            this.field4863 = 1;
        } else if (var2 == 3) {
            this.field4863 = 1;
            this.field4856 = 2048;
            this.field4857 = 4096;
            this.field4860 = 0;
        } else if (var2 == 4) {
            this.field4860 = 0;
            this.field4856 = 2048;
            this.field4857 = 2048;
            this.field4863 = 4;
        } else if (var2 == 5) {
            this.field4857 = 8192;
            this.field4856 = 2048;
            this.field4863 = 4;
            this.field4860 = 0;
        } else if (var2 == 12) {
            this.field4860 = 0;
            this.field4857 = 2048;
            this.field4863 = 2;
            this.field4856 = 2048;
        } else if (var2 == 13) {
            this.field4863 = 2;
            this.field4856 = 2048;
            this.field4860 = 0;
            this.field4857 = 8192;
        } else if (var2 == 10) {
            this.field4860 = 1536;
            this.field4856 = 512;
            this.field4857 = 2048;
            this.field4863 = 3;
        } else if (var2 == 11) {
            this.field4860 = 1536;
            this.field4857 = 4096;
            this.field4856 = 512;
            this.field4863 = 3;
        } else if (var2 == 6) {
            this.field4860 = 1280;
            this.field4863 = 3;
            this.field4857 = 2048;
            this.field4856 = 768;
        } else if (var2 == 7) {
            this.field4856 = 768;
            this.field4860 = 1280;
            this.field4863 = 3;
            this.field4857 = 4096;
        } else if (var2 == 8) {
            this.field4860 = 1024;
            this.field4856 = 1024;
            this.field4863 = 3;
            this.field4857 = 2048;
        } else if (var2 == 9) {
            this.field4860 = 1024;
            this.field4857 = 4096;
            this.field4863 = 3;
            this.field4856 = 1024;
        } else if (var2 == 14) {
            this.field4863 = 1;
            this.field4857 = 2048;
            this.field4860 = 1280;
            this.field4856 = 768;
        } else if (var2 == 15) {
            this.field4860 = 1536;
            this.field4863 = 1;
            this.field4856 = 512;
            this.field4857 = 4096;
        } else if (var2 == 16) {
            this.field4863 = 1;
            this.field4856 = 256;
            this.field4857 = 8192;
            this.field4860 = 1792;
        } else {
            this.field4860 = 0;
            this.field4856 = 2048;
            this.field4857 = 2048;
            this.field4863 = 0;
        }
        if (arg0 <= 83) {
            this.method2098(120);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLhq;I)V")
    public static final void method2099(byte arg0, class108 arg1, int arg2) {
        field4854++;
        if (arg0 != 7) {
            return;
        }
        while (true) {
            class232 var3 = (class232) class485.field6744.method1672((byte) -103);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3113; var5++) {
                if (var3.field3117[var5] != null) {
                    if (var3.field3117[var5].field6100 == 2) {
                        var3.field3123[var5] = -5;
                    }
                    if (var3.field3117[var5].field6100 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3114[var5] != null) {
                    if (var3.field3114[var5].field6100 == 2) {
                        var3.field3123[var5] = -6;
                    }
                    if (var3.field3114[var5].field6100 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method749((byte) 68, arg2);
            arg1.method2200(7, 0);
            int var6 = arg1.field5173;
            arg1.method2214(106, var3.field3115);
            for (int var7 = 0; var7 < var3.field3113; var7++) {
                if (var3.field3123[var7] == 0) {
                    try {
                        int var8 = var3.field3124[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3117[var7].field6104;
                            int var13 = var12.getInt(null);
                            arg1.method2200(7, 0);
                            arg1.method2214(39, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field3117[var7].field6104;
                            var9.setInt(null, var3.field3122[var7]);
                            arg1.method2200(arg0, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field3117[var7].field6104;
                            int var11 = var10.getModifiers();
                            arg1.method2200(7, 0);
                            arg1.method2214(arg0 + 9, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3114[var7].field6104;
                            byte[][] var17 = var3.field3127[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method2200(arg0, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method2200(7, 1);
                                arg1.method2193(((Number) var21).longValue(), -112);
                            } else if (var21 instanceof String) {
                                arg1.method2200(arg0, 2);
                                arg1.method2216((String) var21, -119);
                            } else {
                                arg1.method2200(7, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3114[var7].field6104;
                            int var15 = var14.getModifiers();
                            arg1.method2200(7, 0);
                            arg1.method2214(41, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method2200(7, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method2200(7, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method2200(7, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method2200(7, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method2200(arg0, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method2200(7, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method2200(arg0, -16);
                    } catch (SecurityException var29) {
                        arg1.method2200(arg0, -17);
                    } catch (IOException var30) {
                        arg1.method2200(7, -18);
                    } catch (NullPointerException var31) {
                        arg1.method2200(7, -19);
                    } catch (Exception var32) {
                        arg1.method2200(arg0, -20);
                    } catch (Throwable var33) {
                        arg1.method2200(7, -21);
                    }
                } else {
                    arg1.method2200(7, var3.field3123[var7]);
                }
            }
            arg1.method2234(0, var6);
            arg1.method2210(arg1.field5173 - var6, (byte) 80);
            var3.method300(false);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)I")
    public static final int method2100(int arg0, int arg1, int arg2, int arg3) {
        field4864++;
        if (class320.field4194 < 100) {
            return -2;
        }
        int var4 = -2;
        if (arg1 != 2048) {
            return 28;
        }
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class6.field175;
        int var7 = arg2 - class6.field172;
        for (class228 var8 = (class228) class6.field163.method1672((byte) -110); var8 != null; var8 = (class228) class6.field163.method1668(arg1 - 2049)) {
            if (var8.field3078 == arg0) {
                int var9 = var8.field3073;
                int var10 = var8.field3065;
                int var11 = var10 + class6.field172 | var9 - -class6.field175 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                if (var4 < 0 || var5 > var12) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class233.method1449(arg0, 126);
        field4865++;
        int var7 = 0;
        int var8 = arg0 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -81 % ((arg2 - 29) / 53);
        int var11 = -arg0;
        int var12 = var8;
        int var13 = -var8;
        int var14 = -1;
        int var15 = -1;
        if (class353.field4777 <= arg5 && class300.field3971 >= arg5) {
            int[] var16 = class457.field6299[arg5];
            int var17 = class99.method710(arg1 - arg0, (byte) -29, class71.field1077, class308.field4055);
            int var18 = class99.method710(arg0 + arg1, (byte) -29, class71.field1077, class308.field4055);
            int var19 = class99.method710(arg1 - var8, (byte) -29, class71.field1077, class308.field4055);
            int var20 = class99.method710(arg1 + var8, (byte) -29, class71.field1077, class308.field4055);
            class427.method2465(var16, var19, var17, -7, arg3);
            class427.method2465(var16, var20, var19, -7, arg6);
            class427.method2465(var16, var18, var20, -7, arg3);
        }
        while (var9 > var7) {
            var14 += 2;
            var15 += 2;
            var11 += var14;
            var13 += var15;
            if (var13 >= 0 && var12 >= 1) {
                var12--;
                class522.field7720[var12] = var7;
                var13 -= var12 << 1;
            }
            var7++;
            if (var11 >= 0) {
                var9--;
                var11 -= var9 << 1;
                int var21 = arg5 - var9;
                int var22 = arg5 + var9;
                if (class353.field4777 <= var22 && var21 <= class300.field3971) {
                    if (var8 <= var9) {
                        int var23 = class99.method710(arg1 + var7, (byte) -29, class71.field1077, class308.field4055);
                        int var24 = class99.method710(arg1 - var7, (byte) -29, class71.field1077, class308.field4055);
                        if (class300.field3971 >= var22) {
                            class427.method2465(class457.field6299[var22], var23, var24, -7, arg3);
                        }
                        if (class353.field4777 <= var21) {
                            class427.method2465(class457.field6299[var21], var23, var24, -7, arg3);
                        }
                    } else {
                        int var25 = class522.field7720[var9];
                        int var26 = class99.method710(arg1 + var7, (byte) -29, class71.field1077, class308.field4055);
                        int var27 = class99.method710(arg1 - var7, (byte) -29, class71.field1077, class308.field4055);
                        int var28 = class99.method710(arg1 + var25, (byte) -29, class71.field1077, class308.field4055);
                        int var29 = class99.method710(arg1 - var25, (byte) -29, class71.field1077, class308.field4055);
                        if (var22 <= class300.field3971) {
                            int[] var30 = class457.field6299[var22];
                            class427.method2465(var30, var29, var27, -7, arg3);
                            class427.method2465(var30, var28, var29, -7, arg6);
                            class427.method2465(var30, var26, var28, -7, arg3);
                        }
                        if (var21 >= class353.field4777) {
                            int[] var31 = class457.field6299[var21];
                            class427.method2465(var31, var29, var27, -7, arg3);
                            class427.method2465(var31, var28, var29, -7, arg6);
                            class427.method2465(var31, var26, var28, -7, arg3);
                        }
                    }
                }
            }
            int var32 = arg5 - var7;
            int var33 = arg5 + var7;
            if (class353.field4777 <= var33 && class300.field3971 >= var32) {
                int var34 = arg1 + var9;
                int var35 = arg1 - var9;
                if (var34 >= class308.field4055 && var35 <= class71.field1077) {
                    int var36 = class99.method710(var34, (byte) -29, class71.field1077, class308.field4055);
                    int var37 = class99.method710(var35, (byte) -29, class71.field1077, class308.field4055);
                    if (var8 <= var7) {
                        if (var33 <= class300.field3971) {
                            class427.method2465(class457.field6299[var33], var36, var37, -7, arg3);
                        }
                        if (var32 >= class353.field4777) {
                            class427.method2465(class457.field6299[var32], var36, var37, -7, arg3);
                        }
                    } else {
                        int var38 = var12 >= var7 ? var12 : class522.field7720[var7];
                        int var39 = class99.method710(arg1 + var38, (byte) -29, class71.field1077, class308.field4055);
                        int var40 = class99.method710(arg1 - var38, (byte) -29, class71.field1077, class308.field4055);
                        if (class300.field3971 >= var33) {
                            int[] var41 = class457.field6299[var33];
                            class427.method2465(var41, var40, var37, -7, arg3);
                            class427.method2465(var41, var39, var40, -7, arg6);
                            class427.method2465(var41, var36, var39, -7, arg3);
                        }
                        if (var32 >= class353.field4777) {
                            int[] var42 = class457.field6299[var32];
                            class427.method2465(var42, var40, var37, -7, arg3);
                            class427.method2465(var42, var39, var40, -7, arg6);
                            class427.method2465(var42, var36, var39, -7, arg3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZI)V")
    public final void method2102(int arg0, boolean arg1, int arg2) {
        field4862++;
        if (arg0 != -20) {
            return;
        }
        int var6;
        if (arg1) {
            var6 = 2048;
        } else {
            int var4 = this.field4857 * arg2 / 50 + this.field4858 & 0x7FF;
            int var5 = this.field4863;
            if (var5 == 1) {
                var6 = (class305.field4019[var4 << 3] >> 5) + 1024;
            } else if (var5 == 3) {
                var6 = class455.field6216[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field4867.method170(arg0 + 83, (float) ((this.field4856 * var6 >> 11) + this.field4860) / 2048.0F);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    protected class360() {
        if (class455.field6216 == null) {
            class105.method733((byte) 118);
        }
        this.method2098(101);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lqa;Lmd;I)V")
    public class360(class162 arg0, class379 arg1, int arg2) {
        if (class455.field6216 == null) {
            class105.method733((byte) 106);
        }
        this.field4850 = arg1.method2238(255);
        this.field4859 = (this.field4850 & 0x10) != 0;
        this.field4852 = (this.field4850 & 0x8) != 0;
        this.field4850 &= 0x7;
        int var4 = arg1.method2212((byte) 83) << arg2;
        int var5 = arg1.method2212((byte) 83) << arg2;
        int var6 = arg1.method2212((byte) 83) << arg2;
        int var7 = arg1.method2238(255);
        int var8 = var7 * 2 + 1;
        this.field4868 = new short[var8];
        for (int var9 = 0; var9 < this.field4868.length; var9++) {
            short var13 = (short) arg1.method2212((byte) 83);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field4868[var9] = (short) class191.method1230(var15, var14 << 8);
        }
        int var10 = (var7 << class530.field7813) + class497.field6892;
        int var11 = class180.field2600 == null ? class80.field1185[class479.method2745(53, arg1.method2212((byte) 83)) & 0xFFFF] : class180.field2600[arg1.method2212((byte) 83)];
        int var12 = arg1.method2238(255);
        this.field4858 = (var12 & 0xE0) << 3;
        this.field4866 = var12 & 0x1F;
        if (this.field4866 != 31) {
            this.method2098(85);
        }
        this.method2097(var4, var6, var5, (byte) 61, var10, var11, arg0);
    }
}
