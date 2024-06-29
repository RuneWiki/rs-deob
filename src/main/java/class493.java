import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class493 {

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[B")
    private byte[] field6875;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[I")
    private int[] field6868;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[I")
    private int[] field6870;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lrg;")
    public static class548 field6873 = new class548(81, 3);

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lcea;")
    public static class180 field6876 = new class180("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Lvj;")
    public static class373 field6877 = new class373(47, -2);

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Lcu;")
    public static class185 field6878 = new class185(9, 7);

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lcu;")
    public static class185 field6879 = new class185(7, -1);

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Lvj;")
    public static class373 field6880 = new class373(101, 6);

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static final void method2842(int arg0) {
        class76.field881 = arg0;
        for (int var1 = 0; var1 < class238.field2985; var1++) {
            for (int var2 = 0; var2 < class548.field8061; var2++) {
                if (class383.field5070[arg0][var1][var2] == null) {
                    class383.field5070[arg0][var1][var2] = new class349(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static final void method2843(int arg0) {
        class343.field4422.method2642(true);
        field6869++;
        class520.field7307.method2067(124);
        class316.field4044.method2067(125);
        if (arg0 != 4393) {
            field6879 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIB[BI[B)I")
    public final int method2844(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, byte[] arg5) {
        field6871++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg4;
        int var8 = 0;
        if (arg2 >= -76) {
            return -45;
        }
        int var9 = arg1;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field6870[var8];
            }
            int var11;
            if ((var11 = this.field6870[var8]) < 0) {
                arg5[arg4++] = (byte) (~var11);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field6870[var8];
            }
            int var12;
            if ((var12 = this.field6870[var8]) < 0) {
                arg5[arg4++] = (byte) (~var12);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field6870[var8];
            }
            int var13;
            if ((var13 = this.field6870[var8]) < 0) {
                arg5[arg4++] = (byte) (~var13);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field6870[var8];
            }
            int var14;
            if ((var14 = this.field6870[var8]) < 0) {
                arg5[arg4++] = (byte) (~var14);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field6870[var8];
            }
            int var15;
            if ((var15 = this.field6870[var8]) < 0) {
                arg5[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field6870[var8];
            }
            int var16;
            if ((var16 = this.field6870[var8]) < 0) {
                arg5[arg4++] = (byte) (~var16);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field6870[var8];
            }
            int var17;
            if ((var17 = this.field6870[var8]) < 0) {
                arg5[arg4++] = (byte) (~var17);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field6870[var8];
            }
            int var18;
            if ((var18 = this.field6870[var8]) < 0) {
                arg5[arg4++] = (byte) (~var18);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[B[BIII)I")
    public final int method2845(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field6872++;
        int var7 = 0;
        if (arg3 != 32234) {
            return 78;
        }
        int var8 = arg4 + arg5;
        int var9 = arg0 << 3;
        while (arg5 < var8) {
            int var10 = arg2[arg5] & 0xFF;
            int var11 = this.field6868[var10];
            byte var12 = this.field6875[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class42.method223(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg5++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static void method2846(boolean arg0) {
        field6879 = null;
        field6876 = null;
        field6880 = null;
        field6873 = null;
        field6878 = null;
        field6877 = null;
        if (arg0) {
            method2842(-76);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZIIII)V")
    public static final void method2847(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg4 <= 105) {
            return;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        field6874++;
        int var6 = arg0 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class537.field7645 + ((class64.field636 - class537.field7645) * var6 / 100);
        if (var7 < class207.field2488) {
            var7 = class207.field2488;
        } else if (var7 > class103.field1262) {
            var7 = class103.field1262;
        }
        int var8 = arg0 * var7 * 512 / (arg3 * 334);
        if (var8 < class360.field4736) {
            short var12 = class360.field4736;
            var7 = arg3 * var12 * 334 / (arg0 * 512);
            if (class103.field1262 < var7) {
                var7 = class103.field1262;
                int var13 = arg0 * var7 * 512 / (var12 * 334);
                int var14 = (arg3 - var13) / 2;
                if (arg1) {
                    class210.field2560.method1182();
                    class210.field2560.method1118(-16777216, (byte) 89, var14, arg5, arg2, arg0);
                    class210.field2560.method1118(-16777216, (byte) 69, var14, arg3 + arg5 - var14, arg2, arg0);
                }
                arg3 -= var14 * 2;
                arg5 += var14;
            }
        } else if (class311.field3976 < var8) {
            short var9 = class311.field3976;
            var7 = arg3 * 334 * var9 / (arg0 * 512);
            if (var7 < class207.field2488) {
                var7 = class207.field2488;
                int var10 = arg3 * 334 * var9 / (var7 * 512);
                int var11 = (arg0 - var10) / 2;
                if (arg1) {
                    class210.field2560.method1182();
                    class210.field2560.method1118(-16777216, (byte) 108, arg3, arg5, arg2, var11);
                    class210.field2560.method1118(-16777216, (byte) 109, arg3, arg5, arg0 + arg2 - var11, var11);
                }
                arg0 -= var11 * 2;
                arg2 += var11;
            }
        }
        class244.field3141 = arg0 * var7 / 334;
        class116.field1459 = (short) arg3;
        class265.field3447 = arg5;
        class535.field7503 = (short) arg0;
        class50.field426 = arg2;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
    public class493(byte[] arg0) {
        int var2 = arg0.length;
        this.field6875 = arg0;
        this.field6868 = new int[var2];
        this.field6870 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6868[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class42.method223(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field6870[var14] == 0) {
                            this.field6870[var14] = var4;
                        }
                        var14 = this.field6870[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field6870.length) {
                        int[] var18 = new int[this.field6870.length * 2];
                        for (int var19 = 0; var19 < this.field6870.length; var19++) {
                            var18[var19] = this.field6870[var19];
                        }
                        this.field6870 = var18;
                    }
                }
                this.field6870[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
