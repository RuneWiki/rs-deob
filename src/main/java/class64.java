import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class64 extends class182 {

    @OriginalMember(owner = "client!h", name = "H", descriptor = "Z")
    public boolean field1183;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "[Lh;")
    public class64[] field1188;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public static int field1180 = -1;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "[I")
    public static int[] field1184 = new int[128];

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field1189 = -1;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "Lna;")
    public static class118 field1197 = new class118(0, 0);

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "Lsg;")
    public static class169 field1200 = class165.method1060("<)4col>", 1536);

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "Lsg;")
    public static class169 field1201 = class165.method1060("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 1536);

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "Lsg;")
    public static class169 field1202 = class165.method1060("Keine Antwort vom Anmelde)2Server)3", 1536);

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public int field1186;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "Lce;")
    public class25 field1195;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Lab;")
    public class3 field1192;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)I")
    public int method393(boolean arg0) {
        field1181++;
        if (!arg0) {
            method399(false, null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)[I")
    public final int[] method394(int arg0, int arg1, int arg2) {
        field1170++;
        if (arg0 != 20331) {
            this.method14((byte) -5, null, 9);
        }
        return this.field1188[arg1].field1183 ? this.field1188[arg1].method16(arg2, (byte) 19) : this.field1188[arg1].method59((byte) -40, arg2)[0];
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public static final void method395(int arg0) {
        int var1 = -18 / ((arg0 + 77) / 42);
        class13.field297 = new class22();
        field1182++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[[I")
    public int[][] method59(byte arg0, int arg1) {
        if (arg0 == -40) {
            field1196++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public final void method396(int arg0) {
        if (arg0 != -11745) {
            this.field1188 = null;
        }
        if (this.field1183) {
            this.field1192.method26(-107);
            this.field1192 = null;
        } else {
            this.field1195.method178(0);
            this.field1195 = null;
        }
        field1193++;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)I")
    public int method397(int arg0) {
        int var2 = 126 / ((62 - arg0) / 45);
        field1198++;
        return -1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lsg;ZLsg;IILke;)V")
    public static final void method398(class169 arg0, boolean arg1, class169 arg2, int arg3, int arg4, class95 arg5) {
        field1174++;
        if (arg4 <= 86) {
            field1189 = 90;
        }
        int var6 = arg5.method553(-42, arg0);
        int var7 = arg5.method562(var6, arg2, 25284);
        class65.method409(arg5, var7, -20801, arg1, arg3, var6);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)[I")
    public int[] method16(int arg0, byte arg1) {
        field1176++;
        if (arg1 != 19) {
            field1197 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLoa;I)V")
    public void method14(byte arg0, class127 arg1, int arg2) {
        field1194++;
        int var4 = -78 % ((arg0 + 60) / 36);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLv;)V")
    public static final void method399(boolean arg0, class189 arg1) {
        if (class162.field3107 == arg1.field3718 || arg1.field3697 == -1 || arg1.field3668 != 0 || arg1.field3688 + 1 > class159.method1021((byte) 93, arg1.field3697).field3384[arg1.field3706]) {
            int var2 = class162.field3107 - arg1.field3693;
            int var3 = arg1.field3718 - arg1.field3693;
            int var4 = arg1.field3711 * 64 + arg1.field3686 * 128;
            int var5 = arg1.field3669 * 128 + arg1.field3711 * 64;
            int var6 = arg1.field3711 * 64 + arg1.field3674 * 128;
            int var7 = arg1.field3711 * 64 + arg1.field3666 * 128;
            arg1.field3679 = ((var3 - var2) * var5 + var2 * var7) / var3;
            arg1.field3698 = ((var3 - var2) * var4 + var2 * var6) / var3;
        }
        if (arg1.field3728 == 0) {
            arg1.field3681 = 1024;
        }
        field1173++;
        arg1.field3670 = 0;
        if (arg1.field3728 == 1) {
            arg1.field3681 = 1536;
        }
        if (arg1.field3728 == 2) {
            arg1.field3681 = 0;
        }
        if (arg1.field3728 == 3) {
            arg1.field3681 = 512;
        }
        arg1.field3719 = arg1.field3681;
        if (arg0) {
            method399(false, null);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ltc;IZIII)V")
    public static final void method400(class174 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1177++;
        if (class103.field1886 >= 50) {
            return;
        }
        if (arg3 != -7541) {
            method398(null, true, null, -14, 49, null);
        }
        if (arg0.field3372 == null || arg4 >= arg0.field3372.length) {
            return;
        }
        int var6 = arg0.field3372[arg4];
        if (var6 == 0) {
            return;
        }
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        int var9 = var6 & 0xF;
        if (var9 == 0) {
            if (arg2) {
                class187.method1232(0, (byte) 64, var8, var7);
            }
        } else if (class20.field435 != 0) {
            class118.field2200[class103.field1886] = var7;
            class66.field1245[class103.field1886] = var8;
            class158.field3031[class103.field1886] = 0;
            class51.field894[class103.field1886] = null;
            int var10 = (arg1 - 64) / 128;
            int var11 = (arg5 - 64) / 128;
            class90.field1640[class103.field1886] = (var10 << 16) + (var11 << 8) + var9;
            class103.field1886++;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II[BIII[Lvb;IBI)V")
    public static final void method401(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, class191[] arg6, int arg7, byte arg8, int arg9) {
        field1172++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg1 + var10 > 0 && arg1 + var10 < 103 && arg9 + var15 > 0 && arg9 + var15 < 103) {
                    arg6[arg3].field3776[arg1 + var10][arg9 + var15] = class150.method984(arg6[arg3].field3776[arg1 + var10][arg9 + var15], -16777217);
                }
            }
        }
        if (arg8 != -125) {
            field1189 = -81;
        }
        class127 var11 = new class127(arg2);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg0 == var12 && var13 >= arg5 && arg5 + 8 > var13 && var14 >= arg7 && var14 < arg7 + 8) {
                        class32.method221(class164.method1054(var14 & 0x7, var13 & 0x7, arg4, -1) + arg1, arg8 + 242, arg3, arg9 + class111.method689(var13 & 0x7, arg4, var14 & 0x7, 2), var11, arg4, 0, 0);
                    } else {
                        class32.method221(-1, arg8 ^ -4, 0, -1, var11, 0, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZII)[[I")
    public final int[][] method402(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method401(18, -105, null, 68, 104, -48, null, -24, (byte) 103, -126);
        }
        field1187++;
        if (this.field1188[arg2].field1183) {
            int[] var4 = this.field1188[arg2].method16(arg1, (byte) 19);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1188[arg2].method59((byte) -40, arg1);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V")
    public void method17(boolean arg0) {
        if (!arg0) {
            field1185++;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(III)V")
    public final void method403(int arg0, int arg1, int arg2) {
        field1190++;
        int var4 = this.field1186 == arg0 ? arg2 : this.field1186;
        if (this.field1183) {
            this.field1192 = new class3(var4, arg2, arg1);
        } else {
            this.field1195 = new class25(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILqf;)V")
    public static final void method404(int arg0, class150 arg1) {
        field1175++;
        if (arg0 < 91) {
            method398(null, true, null, -25, -119, null);
        }
        if (class105.field1924 == arg1.field2798) {
            class118.field2201[arg1.field2851] = true;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(IZ)V")
    public class64(int arg0, boolean arg1) {
        this.field1183 = arg1;
        this.field1188 = new class64[arg0];
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
    public static void method405(int arg0) {
        field1184 = null;
        field1202 = null;
        field1200 = null;
        field1197 = null;
        field1201 = null;
        if (arg0 != 0) {
            field1202 = null;
        }
    }
}
