import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class36 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[B")
    private byte[] field767;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
    private int[] field770;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "[I")
    private int[] field777;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lrd;")
    public static class173 field768 = class133.method843("<img=0>", -110);

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lrd;")
    private static class173 field773 = class133.method843("Loaded config", 95);

    @OriginalMember(owner = "client!de", name = "j", descriptor = "[I")
    public static int[] field776 = new int[100];

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lrd;")
    public static class173 field772 = field773;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "Lrd;")
    public static class173 field779 = class133.method843(" zuerst von Ihrer Freunde)2Liste(Q", 45);

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field771 = Calendar.getInstance();

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lrd;")
    public static class173 field782 = class133.method843(")4lang)4de", 47);

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lrd;")
    public static class173 field781 = class133.method843(" <col=00ff80>", -73);

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field783 = 0;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[BI[BI)I")
    public final int method277(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = 0;
        int var8 = arg3 + arg5;
        field778++;
        int var9 = arg0 << 3;
        if (arg1 != -1) {
            return 52;
        }
        while (var8 > arg5) {
            int var10 = arg2[arg5] & 0xFF;
            byte var11 = this.field767[var10];
            int var12 = this.field770[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var11;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var14 + var11 - 1 >> 3);
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class21.method181(var15, var12 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var7 = var12 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var7 = var12 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var7 = var12 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var7 = var12 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class108.field2025[arg0][var8][var14] == -class122.field2291) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class124.field2328[arg0][arg1][arg3] + arg5;
            if (!class89.method570(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class89.method570(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class89.method570(var9, var11, var13)) {
                return false;
            } else if (class89.method570(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class212.method1394(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class89.method570(var6 + 1, class124.field2328[arg0][arg1][arg3] + arg5, var7 + 1) && class89.method570(var6 + 128 - 1, class124.field2328[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class89.method570(var6 + 128 - 1, class124.field2328[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class89.method570(var6 + 1, class124.field2328[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method279(int arg0) {
        field782 = null;
        field781 = null;
        if (arg0 != -249) {
            method279(64);
        }
        field779 = null;
        field772 = null;
        field771 = null;
        field773 = null;
        field776 = null;
        field768 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII[B[B)I")
    public final int method280(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field775++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg1;
        int var8 = arg3;
        int var9 = arg2;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field777[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field777[var8]) < 0) {
                arg5[arg1++] = (byte) ~var11;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field777[var8];
            }
            int var12;
            if ((var12 = this.field777[var8]) < 0) {
                arg5[arg1++] = (byte) ~var12;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field777[var8];
            }
            int var13;
            if ((var13 = this.field777[var8]) < 0) {
                arg5[arg1++] = (byte) ~var13;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field777[var8];
            }
            int var14;
            if ((var14 = this.field777[var8]) < 0) {
                arg5[arg1++] = (byte) ~var14;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field777[var8];
            }
            int var15;
            if ((var15 = this.field777[var8]) < 0) {
                arg5[arg1++] = (byte) ~var15;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field777[var8];
            }
            int var16;
            if ((var16 = this.field777[var8]) < 0) {
                arg5[arg1++] = (byte) ~var16;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field777[var8];
            }
            int var17;
            if ((var17 = this.field777[var8]) < 0) {
                arg5[arg1++] = (byte) ~var17;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field777[var8];
            }
            int var18;
            if ((var18 = this.field777[var8]) < 0) {
                arg5[arg1++] = (byte) ~var18;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "([B)V")
    public class36(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = 0;
        int var4 = arg0.length;
        this.field767 = arg0;
        this.field770 = new int[var4];
        this.field777 = new int[8];
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field770[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class21.method181(var12, var11);
                    }
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field777[var14] == 0) {
                            this.field777[var14] = var3;
                        }
                        var14 = this.field777[var14];
                    }
                    if (var14 >= this.field777.length) {
                        int[] var17 = new int[this.field777.length * 2];
                        for (int var18 = 0; var18 < this.field777.length; var18++) {
                            var17[var18] = this.field777[var18];
                        }
                        this.field777 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
                this.field777[var14] = ~var5;
            }
        }
    }
}
