import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class632 extends class303 {

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
    public int field9099;

    @OriginalMember(owner = "client!wo", name = "O", descriptor = "Z")
    public boolean field9103;

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "F")
    public float field9101;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "F")
    public float field9100;

    @OriginalMember(owner = "client!wo", name = "U", descriptor = "I")
    public int field9109;

    @OriginalMember(owner = "client!wo", name = "N", descriptor = "I")
    public static int field9102 = 0;

    @OriginalMember(owner = "client!wo", name = "V", descriptor = "Lcea;")
    public static class180 field9110 = new class180("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!wo", name = "W", descriptor = "[Lcb;")
    public static class441[] field9111 = new class441[6];

    @OriginalMember(owner = "client!wo", name = "P", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!wo", name = "Q", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!wo", name = "R", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!wo", name = "S", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!wo", name = "T", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!wo", name = "Y", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!wo", name = "X", descriptor = "[J")
    public static long[] field9112;

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lmh;IIIZ[I)V")
    public class632(class537 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field9099 = arg3;
        if (super.field2973 != 34037) {
            this.field9103 = true;
            this.field9100 = this.field9101 = 1.0F;
        } else {
            this.field9101 = (float) arg3;
            this.field9103 = false;
            this.field9100 = (float) arg2;
        }
        this.field9109 = arg2;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lmh;IIIIIZ)V")
    public class632(class537 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field9109 = arg4;
        if (super.field2973 == 34037) {
            this.field9103 = false;
            this.field9101 = (float) arg5;
            this.field9100 = (float) arg4;
        } else {
            this.field9103 = true;
            this.field9100 = this.field9101 = 1.0F;
        }
        this.field9099 = arg5;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILkj;I)Z")
    public static final boolean method3631(int arg0, class484 arg1, int arg2) {
        ++field9107;
        int var3 = arg1.method2813(2, 121);
        if (~var3 == -1) {
            if (~arg1.method2813(1, -29) != -1) {
                method3631(-60, arg1, arg2);
            }
            int var4 = arg1.method2813(6, -11);
            int var5 = arg1.method2813(6, 113);
            boolean var6 = ~arg1.method2813(1, 99) == -2;
            if (var6) {
                class42.field334[class306.field3893++] = arg2;
            }
            if (class459.field6329[arg2] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class253 var7 = class57.field529[arg2];
                class545 var8 = class459.field6329[arg2] = new class545();
                var8.field6399 = arg2;
                if (class639.field9194[arg2] != null) {
                    var8.method3192(-19939, class639.field9194[arg2]);
                }
                var8.method2706(true, 111, var7.field3269);
                var8.field6479 = var7.field3270;
                int var9 = var7.field3265;
                int var10 = var9 >> 28;
                int var11 = (4179410 & var9) >> 14;
                int var12 = var9 & 255;
                var8.field7986 = var7.field3268;
                var8.field6482[0] = class518.field7298[arg2];
                var8.field8660 = (byte) var10;
                var8.method3198((var11 << 6) + var4 - field9113, 0, (var12 << 6) + -class119.field1504 - -var5);
                var8.field7985 = false;
                class57.field529[arg2] = null;
                return true;
            }
        } else if (~var3 == -2) {
            int var13 = arg1.method2813(2, 15);
            int var14 = class57.field529[arg2].field3265;
            class57.field529[arg2].field3265 = (((var14 >> 28) - -var13 & 3) << 28) + (var14 & 268435455);
            return false;
        } else if (~var3 == -3) {
            int var15 = arg1.method2813(5, 111);
            int var16 = var15 >> 3;
            int var17 = var15 & 7;
            int var18 = class57.field529[arg2].field3265;
            int var19 = 3 & (var18 >> 28) + var16;
            int var20 = (var18 & 4182776) >> 14;
            int var21 = 255 & var18;
            if (var17 == 0) {
                --var21;
                --var20;
            }
            if (~var17 == -2) {
                --var21;
            }
            if (~var17 == -3) {
                ++var20;
                --var21;
            }
            if (var17 == 3) {
                --var20;
            }
            if (~var17 == -5) {
                ++var20;
            }
            if (var17 == 5) {
                --var20;
                ++var21;
            }
            if (var17 == 6) {
                ++var21;
            }
            if (~var17 == -8) {
                ++var20;
                ++var21;
            }
            class57.field529[arg2].field3265 = (var20 << 14) + (var19 << 28) + var21;
            return false;
        } else {
            int var22 = arg1.method2813(18, -68);
            int var23 = var22 >> 16;
            int var24 = 255 & var22 >> 8;
            int var25 = 255 & var22;
            int var26 = class57.field529[arg2].field3265;
            int var27 = (var26 >> 28) - -var23 & 3;
            int var28 = 255 & (var26 >> 14) + var24;
            int var29 = 255 & var25 + var26;
            if (arg0 > -50) {
                method3633(-54);
            }
            class57.field529[arg2].field3265 = (var27 << 28) + (var28 << 14) - -var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)V")
    public static void method3632(int arg0) {
        field9110 = null;
        if (arg0 != -1883) {
            method3633(102);
        }
        field9111 = null;
        field9112 = null;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lmh;IIII[I)V")
    public class632(class537 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field9099 = arg2;
        this.field9109 = arg1;
        this.method1668(arg5, arg2, true, (byte) -23, 0, 0, arg1, 0, 0);
        this.field9101 = (float) arg2 / (float) arg4;
        this.field9103 = false;
        this.field9100 = (float) arg1 / (float) arg3;
        this.method1671((byte) -46, false, false);
    }

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)V")
    public static final void method3633(int arg0) {
        ++field9105;
        if (arg0 != -256) {
            method3632(65);
        }
        if (class319.field4068 != null) {
            class319.field4068.method1103((byte) 94);
            class416.field5421 = null;
            class319.field4068 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method3634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        ++field9106;
        if (arg5 >= 128 && arg8 >= 128 && class106.field1289 * 128 + -256 >= arg5 && ~(class422.field5452 * 128 + -256) <= ~arg8) {
            int var10 = class426.method2400(-1, arg8, arg5, arg2) + -arg3;
            if (arg9 == 63) {
                class138.field1681.method655(arg7, 0, 0);
                class210.field2560.method1160(class138.field1681);
                class210.field2560.method1112(arg5, var10, arg8, class34.field271);
                class138.field1681.method655(-arg7, 0, 0);
                class210.field2560.method1160(class138.field1681);
            }
        } else {
            class34.field271[0] = class34.field271[1] = -1;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IFI[BIIFFIFIFLtp;I)V")
    public static final void method3635(int arg0, float arg1, int arg2, byte[] arg3, int arg4, int arg5, float arg6, float arg7, int arg8, float arg9, int arg10, float arg11, class454 arg12, int arg13) {
        ++field9108;
        int var14 = arg0 * arg5;
        float[] var15 = new float[var14];
        for (int var16 = 0; ~arg2 < ~var16; ++var16) {
            arg12.method503(0, arg0, arg1 * 127.0F, arg6 / (float) arg8, arg10, 1, arg7 / (float) arg5, arg8, arg5, arg11 / (float) arg0, var15);
            int var20 = arg4;
            arg7 *= 2.0F;
            arg6 *= 2.0F;
            for (int var21 = 0; var21 < var14; ++var21) {
                arg3[var20] = (byte) ((int) ((float) arg3[var20] + var15[var21]));
                ++var20;
            }
            arg11 *= 2.0F;
            arg1 *= arg9;
        }
        int var17 = -2 % ((arg13 - 8) / 50);
        int var18 = arg4;
        for (int var19 = 0; ~var14 < ~var19; ++var19) {
            arg3[var18] = (byte) (arg3[var18] + 127);
            ++var18;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lmh;IIIIZ[BI)V")
    public class632(class537 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field9109 = arg3;
        if (super.field2973 == 34037) {
            this.field9103 = false;
            this.field9101 = (float) arg4;
            this.field9100 = (float) arg3;
        } else {
            this.field9103 = true;
            this.field9100 = this.field9101 = 1.0F;
        }
        this.field9099 = arg4;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIII)V")
    public static final void method3636(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 79) {
            field9111 = null;
        }
        class173.field2109 = arg4;
        ++field9104;
        class83.field1017 = arg1;
        class78.field917 = arg3;
        class384.field5073 = arg2;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lmh;IIIII[BI)V")
    public class632(class537 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field9109 = arg2;
        this.field9099 = arg3;
        this.method1673(true, arg7, arg6, 0, arg3, 0, 0, arg2, false, 0);
        this.field9103 = false;
        this.field9101 = (float) arg3 / (float) arg5;
        this.field9100 = (float) arg2 / (float) arg4;
        this.method1671((byte) -46, false, false);
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lmh;IIIIIIZ)V")
    public class632(class537 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field9101 = (float) arg4 / (float) arg6;
        this.field9109 = arg3;
        this.field9099 = arg4;
        this.field9100 = (float) arg3 / (float) arg5;
        this.field9103 = false;
        this.method1671((byte) -46, false, false);
    }
}
