import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class192 {

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Lna;")
    public static class26 field3000 = class69.method505("Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3", (byte) -119);

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lna;")
    public static class26 field3003 = class69.method505("Verbindung abgebrochen)3", (byte) -126);

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "Lna;")
    public static class26 field3004 = class69.method505("comp-Btence ", (byte) -118);

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lim;")
    public static class180 field3001;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Lm;")
    public static class48 field2996;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "Ljava/lang/Thread;")
    public static Thread field2997;

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 51)
    public class192() {
        new class68();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILfe;)V", line = 72)
    public static final void method1300(int arg0, class241 arg1) {
        field3002++;
        if (arg1.field3916 == 0) {
            return;
        }
        class236 var2 = arg1.method1656(false);
        if (arg1.field3909 != -1 && arg1.field3909 < 32768) {
            class324 var3 = class185.field2877[arg1.field3909];
            if (var3 != null) {
                int var4 = arg1.field3972 - var3.field3972;
                int var5 = arg1.field3962 - var3.field3962;
                if (var5 != 0 || var4 != 0) {
                    arg1.field3946 = (int) (Math.atan2((double) var5, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field3909 >= 32768) {
            int var6 = arg1.field3909 - 32768;
            if (class327.field5668 == var6) {
                var6 = 2047;
            }
            class159 var7 = class268.field4427[var6];
            if (var7 != null) {
                int var8 = arg1.field3972 - var7.field3972;
                int var9 = arg1.field3962 - var7.field3962;
                if (var9 != 0 || var8 != 0) {
                    arg1.field3946 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3923 != 0 || arg1.field3898 != 0) && (arg1.field3959 == 0 || arg1.field3967 > 0)) {
            int var10 = arg1.field3962 - ((arg1.field3923 - class12.field157 - class12.field157) * 64);
            int var11 = arg1.field3972 - ((arg1.field3898 - class165.field2568 - class165.field2568) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field3946 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field3898 = 0;
            arg1.field3923 = 0;
        }
        int var12 = arg1.field3946 - arg1.field3922 & 0x7FF;
        if (var12 == 0) {
            arg1.field3926 = 0;
            arg1.field3964 = 0;
        } else if (var2.field3752 == 0) {
            arg1.field3926++;
            if (var12 > 1024) {
                arg1.field3922 -= arg1.field3916;
                boolean var13 = true;
                if (var12 < arg1.field3916 || var12 > 2048 - arg1.field3916) {
                    arg1.field3922 = arg1.field3946;
                    var13 = false;
                }
                if (arg1.field3901 == var2.field3751 && (arg1.field3926 > 25 || var13)) {
                    if (var2.field3750 == -1) {
                        arg1.field3901 = var2.field3768;
                    } else {
                        arg1.field3901 = var2.field3750;
                    }
                }
            } else {
                boolean var14 = true;
                arg1.field3922 += arg1.field3916;
                if (arg1.field3916 > var12 || var12 > (2048 - arg1.field3916)) {
                    var14 = false;
                    arg1.field3922 = arg1.field3946;
                }
                if (arg1.field3901 == var2.field3751 && (arg1.field3926 > 25 || var14)) {
                    if (var2.field3795 == -1) {
                        arg1.field3901 = var2.field3768;
                    } else {
                        arg1.field3901 = var2.field3795;
                    }
                }
            }
            arg1.field3922 &= 0x7FF;
        } else {
            if (arg1.field3901 == var2.field3751 && arg1.field3926 > 25) {
                if (var2.field3795 == -1) {
                    arg1.field3901 = var2.field3768;
                } else {
                    arg1.field3901 = var2.field3795;
                }
            }
            int var15 = arg1.field3946 << 5;
            if (arg1.field3949 != var15) {
                arg1.field3928 = 0;
                arg1.field3949 = var15;
                int var16 = var15 - arg1.field3917 & 0xFFFF;
                int var17 = arg1.field3964 * arg1.field3964 / (var2.field3752 * 2);
                if (arg1.field3964 > 0 && var16 >= var17 && var16 - var17 < 32768) {
                    arg1.field3943 = var16 / 2;
                    arg1.field3906 = true;
                    int var18 = var2.field3739 * var2.field3739 / (var2.field3752 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (var18 < arg1.field3943) {
                        arg1.field3943 = var16 - var18;
                    }
                } else if (arg1.field3964 < 0 && var17 <= 65536 - var16 && 65536 - var16 - var17 < 32768) {
                    arg1.field3943 = (65536 - var16) / 2;
                    arg1.field3906 = true;
                    int var19 = var2.field3739 * var2.field3739 / (var2.field3752 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg1.field3943) {
                        arg1.field3943 = 65536 - (var16 + var19);
                    }
                } else {
                    arg1.field3906 = false;
                }
            }
            if (arg1.field3964 == 0) {
                int var20 = arg1.field3949 - arg1.field3917 & 0xFFFF;
                if (var20 < var2.field3752) {
                    arg1.field3917 = arg1.field3949;
                } else {
                    arg1.field3928 = 0;
                    int var21 = var2.field3739 * var2.field3739 / (var2.field3752 * 2);
                    arg1.field3906 = true;
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 >= 32768) {
                        arg1.field3964 = -var2.field3752;
                        arg1.field3943 = (65536 - var20) / 2;
                        if (var21 < arg1.field3943) {
                            arg1.field3943 = 65536 - (var20 + var21);
                        }
                    } else {
                        arg1.field3964 = var2.field3752;
                        arg1.field3943 = var20 / 2;
                        if (var21 < arg1.field3943) {
                            arg1.field3943 = var20 - var21;
                        }
                    }
                }
            } else if (arg1.field3964 <= 0) {
                if (arg1.field3928 >= arg1.field3943) {
                    arg1.field3906 = false;
                }
                if (!arg1.field3906) {
                    arg1.field3964 += var2.field3752;
                    if (arg1.field3964 > 0) {
                        arg1.field3964 = 0;
                    }
                } else if ((-var2.field3739) < arg1.field3964) {
                    arg1.field3964 -= var2.field3752;
                }
            } else {
                if (arg1.field3943 <= arg1.field3928) {
                    arg1.field3906 = false;
                }
                if (!arg1.field3906) {
                    arg1.field3964 -= var2.field3752;
                    if (arg1.field3964 < 0) {
                        arg1.field3964 = 0;
                    }
                } else if (arg1.field3964 < var2.field3739) {
                    arg1.field3964 += var2.field3752;
                }
            }
            arg1.field3917 += arg1.field3964;
            arg1.field3917 &= 0xFFFF;
            if (arg1.field3964 <= 0) {
                arg1.field3928 -= arg1.field3964;
            } else {
                arg1.field3928 += arg1.field3964;
            }
            arg1.field3922 = arg1.field3917 >> 5;
        }
        if (arg0 != 65536) {
            method1300(-93, (class241) null);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 351)
    public static void method1301(int arg0) {
        field2996 = null;
        field3003 = null;
        field3004 = null;
        field3000 = null;
        field3001 = null;
        if (arg0 != -24912) {
            field3001 = (class180) null;
        }
        field2997 = null;
    }
}
