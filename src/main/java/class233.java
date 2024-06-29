import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class233 extends class240 {

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    private int field3927 = 12288;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    private int field3932 = 0;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    private int field3930 = 0;

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "I")
    private int field3940 = 2048;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    private int field3939 = 8192;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "I")
    private int field3938 = 4096;

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "I")
    private int field3942 = 2048;

    @OriginalMember(owner = "client!le", name = "gb", descriptor = "Lig;")
    public static class168 field3944 = new class168(64);

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!le", name = "db", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!le", name = "fb", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!le", name = "hb", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method12(int arg0, int arg1) {
        int[] var3 = this.field4094.method179(arg1, true);
        if (arg0 != 64) {
            this.field3927 = 70;
        }
        field3926++;
        if (this.field4094.field344) {
            int var4 = class268.field4615[arg1] - 2048;
            for (int var5 = 0; var5 < class169.field2936; var5++) {
                int var6 = class74.field1408[var5] - 2048;
                int var7 = this.field3942 + var6;
                int var8 = this.field3932 + var6;
                int var9 = var7 < -2048 ? var7 + 4096 : var7;
                int var10 = this.field3940 + var4;
                int var11 = var9 > 2048 ? var9 - 4096 : var9;
                int var12 = this.field3930 + var4;
                int var13 = var10 >= -2048 ? var10 : var10 + 4096;
                int var14 = var12 < -2048 ? var12 + 4096 : var12;
                int var15 = var14 <= 2048 ? var14 : var14 - 4096;
                int var16 = var8 >= -2048 ? var8 : var8 + 4096;
                int var17 = var13 > 2048 ? var13 - 4096 : var13;
                int var18 = var16 > 2048 ? var16 - 4096 : var16;
                var3[var5] = this.method1675(var15, var11, (byte) -92) || this.method1674(var18, var17, 32157) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V", line = 254)
    public class233() {
        super(0, true);
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 71)
    public final void method288(int arg0) {
        if (arg0 == 17772) {
            field3943++;
            class92.method692(0);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZB)V", line = 86)
    public static final void method1669(boolean arg0, byte arg1) {
        field3928++;
        if (class164.field2887 == arg0) {
            return;
        }
        class164.field2887 = arg0;
        class44.method338(-128);
        if (arg1 >= -41) {
            field3944 = (class168) null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lcd;Lcd;IB)V", line = 102)
    public static final void method1670(class64 arg0, class64 arg1, int arg2, byte arg3) {
        if (arg3 < -102) {
            field3941++;
            class104.method767(-1, arg0, 32406, arg2, (class64) null, arg1);
        }
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V", line = 113)
    public static void method1671(int arg0) {
        if (arg0 != -2087918676) {
            field3937 = -86;
        }
        field3944 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)I", line = 124)
    public static final int method1672(int arg0, int arg1) {
        if (arg0 >= -88) {
            method1673((class45) null, -100, -110, -77, -100, -99, 29, false);
        }
        field3929++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Llm;IIIIIIZ)V", line = 142)
    public static final void method1673(class45 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field731.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field731[var9] - class165.field2900;
            int var11 = arg0.field730[var9] - class159.field2796;
            int var12 = arg0.field736[var9] - class249.field4331;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field743 != null) {
                class45.field728[var9] = var13;
                class45.field740[var9] = var16;
                class45.field732[var9] = var17;
            }
            class45.field737[var9] = (var13 << 9) / var17 + class50.field832;
            class45.field729[var9] = (var16 << 9) / var17 + class50.field823;
        }
        class50.field831 = 0;
        int var19 = arg0.field738.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field738[var20];
            int var22 = arg0.field727[var20];
            int var23 = arg0.field747[var20];
            int var24 = class45.field737[var21];
            int var25 = class45.field737[var22];
            int var26 = class45.field737[var23];
            int var27 = class45.field729[var21];
            int var28 = class45.field729[var22];
            int var29 = class45.field729[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class156.field2761 && class6.method65(class50.field832 + class264.field4541, class50.field823 + class227.field3859, var27, var28, var29, var24, var25, var26)) {
                    class252.field4383 = arg5;
                    class202.field3457 = arg6;
                }
                if (!class123.field2216 && !arg7) {
                    class50.field825 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class50.field819 || var25 > class50.field819 || var26 > class50.field819) {
                        class50.field825 = true;
                    }
                    if (arg0.field743 == null || arg0.field743[var20] == -1) {
                        if (arg0.field739[var20] != 12345678) {
                            class50.method364(var27, var28, var29, var24, var25, var26, arg0.field739[var20], arg0.field734[var20], arg0.field742[var20]);
                        }
                    } else if (!class109.field2015) {
                        int var30 = class50.field816.method666(true, arg0.field743[var20]);
                        class50.method364(var27, var28, var29, var24, var25, var26, class173.method1216(var30, arg0.field739[var20]), class173.method1216(var30, arg0.field734[var20]), class173.method1216(var30, arg0.field742[var20]));
                    } else if (arg0.field741) {
                        class50.method378(var27, var28, var29, var24, var25, var26, arg0.field739[var20], arg0.field734[var20], arg0.field742[var20], class45.field728[0], class45.field728[1], class45.field728[3], class45.field740[0], class45.field740[1], class45.field740[3], class45.field732[0], class45.field732[1], class45.field732[3], arg0.field743[var20]);
                    } else {
                        class50.method378(var27, var28, var29, var24, var25, var26, arg0.field739[var20], arg0.field734[var20], arg0.field742[var20], class45.field728[var21], class45.field728[var22], class45.field728[var23], class45.field740[var21], class45.field740[var22], class45.field740[var23], class45.field732[var21], class45.field732[var22], class45.field732[var23], arg0.field743[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILkh;)V", line = 259)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 != 2) {
            field3944 = (class168) null;
        }
        if (arg1 == 0) {
            this.field3942 = arg2.method112((byte) 92);
        } else if (arg1 == 1) {
            this.field3930 = arg2.method112((byte) 92);
        } else if (arg1 == 2) {
            this.field3932 = arg2.method112((byte) 92);
        } else if (arg1 == 3) {
            this.field3940 = arg2.method112((byte) 92);
        } else if (arg1 == 4) {
            this.field3927 = arg2.method112((byte) 92);
        } else if (arg1 == 5) {
            this.field3938 = arg2.method112((byte) 92);
        } else if (arg1 == 6) {
            this.field3939 = arg2.method112((byte) 92);
        }
        field3936++;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(III)Z", line = 343)
    private final boolean method1674(int arg0, int arg1, int arg2) {
        field3935++;
        if (arg2 != 32157) {
            this.field3927 = -41;
        }
        int var4 = (arg1 + arg0) * this.field3927 >> 12;
        int var5 = class268.field4619[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field3927;
        int var7 = (var6 << 12) / this.field3939;
        int var8 = this.field3938 * var7 >> 12;
        return (arg1 - arg0) < var8 && (arg1 - arg0) > (-var8);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIB)Z", line = 374)
    private final boolean method1675(int arg0, int arg1, byte arg2) {
        field3933++;
        int var4 = (arg0 - arg1) * this.field3927 >> 12;
        int var5 = class268.field4619[(var4 * 255 & 0xFF79D) >> 12];
        int var6 = (var5 << 12) / this.field3927;
        int var7 = (var6 << 12) / this.field3939;
        int var8 = this.field3938 * var7 >> 12;
        if (arg2 >= -54) {
            this.method1675(15, -76, (byte) 93);
        }
        return (arg0 + arg1) < var8 && -var8 < arg0 + arg1;
    }
}
