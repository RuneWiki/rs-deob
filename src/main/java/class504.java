import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class504 {

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "Z")
    public boolean field7448 = true;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    private int field7447 = -1;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "Lvj;")
    private class303 field7436;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Llv;")
    private class306 field7438;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    private int field7442;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
    private int field7451;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    private int field7434;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Lmf;")
    private class286 field7437;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "Lu;")
    private class52 field7444;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Ltp;")
    private class370 field7452;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "Lmq;")
    public static class350 field7446 = null;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "Luj;")
    public static class259 field7439 = new class259();

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "Liv;")
    public static class64 field7454 = new class64(67, 12);

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "[[[I")
    public static int[][][] field7445;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public final void method3016(int arg0) {
        this.method3022(this.field7434, this.field7444, (byte) 97);
        if (arg0 == -13660) {
            field7453++;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
    public static void method3017(boolean arg0) {
        field7454 = null;
        field7445 = null;
        field7446 = null;
        if (!arg0) {
            method3017(true);
        }
        field7439 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)V")
    public static final void method3018(int arg0, byte arg1) {
        class115.field1909 = arg0;
        class528.field7794 = -1;
        field7435++;
        class475.field7104 = 100;
        class443.field6619 = 3;
        if (arg1 > -37) {
            method3019(-114);
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)Z")
    public static final boolean method3019(int arg0) {
        field7449++;
        try {
            int var1 = 60 % ((arg0 + 36) / 50);
            return class339.method2172(-59);
        } catch (IOException var5) {
            class149.method1144(2);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + (class277.field4001 == null ? -1 : class277.field4001.method545(-12431)) + "," + (class158.field2463 == null ? -1 : class158.field2463.method545(-12431)) + "," + (class298.field4247 == null ? -1 : class298.field4247.method545(-12431)) + " - " + class34.field666 + "," + (class139.field2224.field7692[0] + class200.field2931) + "," + (class403.field6059 + class139.field2224.field7694[0]) + " - ";
            for (int var4 = 0; var4 < class34.field666 && var4 < 50; var4++) {
                var3 = var3 + class92.field1573.field2270[var4] + ",";
            }
            class320.method2087(0, var6, var3);
            class217.method1446(false);
            return true;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[BI)V")
    public final void method3020(int arg0, int arg1, byte[] arg2, int arg3) {
        this.field7452.method466(arg0, 19971, arg2, arg3 * this.field7436.method1978(arg0, -14063));
        field7443++;
        if (arg1 >= -111) {
            field7439 = null;
        }
        this.method3022(arg3, this.field7452, (byte) 38);
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V")
    private final void method3021(int arg0) {
        field7441++;
        if (!this.field7448) {
            return;
        }
        this.field7448 = false;
        byte[] var2 = this.field7438.field4686;
        byte[] var3 = class76.field1271;
        int var4 = 0;
        int var5 = this.field7438.field4674;
        int var6 = this.field7438.field4674 * this.field7451 + this.field7442;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var14 = -128; var14 < 0; var14++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field7437 != null && this.field7447 == var4) {
            this.field7448 = false;
            return;
        }
        this.field7447 = var4;
        int var8 = 0;
        int var9 = 89 % ((arg0 + 69) / 40);
        int var10 = this.field7451 * var5 + this.field7442;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var10] == 0) {
                    int var13 = 0;
                    if (var2[var10 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var10 - var5] != 0) {
                        var13++;
                    }
                    if (var2[var5 + var10] != 0) {
                        var13++;
                    }
                    var3[var8++] = (byte) (var13 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var10++;
            }
            var10 += this.field7438.field4674 - 128;
        }
        if (this.field7437 == null) {
            this.field7437 = new class286(this.field7436, 3553, 6406, 128, 128, false, class76.field1271, 6406, false);
            this.field7437.method1818(false, (byte) 105, false);
            this.field7437.method2929((byte) -123, true);
        } else {
            this.field7437.method1821(false, 128, -101, 128, 0, 0, 0, class76.field1271, 6406, 0);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILu;B)V")
    private final void method3022(int arg0, class52 arg1, byte arg2) {
        field7450++;
        if (arg0 == 0) {
            return;
        }
        this.method3021(-110);
        if (arg2 < 34) {
            this.field7442 = -62;
        }
        this.field7436.method1990(this.field7437, 11864);
        this.field7436.method1988(arg0, arg1, 0, false, 4);
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lvj;Llv;Lsi;IIIII)V")
    public class504(class303 arg0, class306 arg1, class390 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7436 = arg0;
        this.field7438 = arg1;
        this.field7442 = arg6;
        this.field7451 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field673 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field5889[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field7434 = var10;
        if (var10 <= 0) {
            this.field7437 = null;
        } else {
            class145 var14 = new class145(var10 * 2);
            if (this.field7436.field4599) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field673 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field5889[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method1094(1618659784, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field673 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field5889[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method1066(-2012325976, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field7444 = this.field7436.method1920(var14.field2289, var14.field2270, false, 255, 5123);
            this.field7452 = new class370(this.field7436, 5123, null, 1);
        }
    }
}
