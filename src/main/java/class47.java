import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class47 extends class28 {

    @OriginalMember(owner = "client!qea", name = "s", descriptor = "I")
    private int field640;

    @OriginalMember(owner = "client!qea", name = "q", descriptor = "Z")
    private boolean field638;

    @OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
    private int field635;

    @OriginalMember(owner = "client!qea", name = "o", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client!qea", name = "u", descriptor = "I")
    private int field642;

    @OriginalMember(owner = "client!qea", name = "t", descriptor = "I")
    private int field641;

    @OriginalMember(owner = "client!qea", name = "m", descriptor = "Z")
    private boolean field634;

    @OriginalMember(owner = "client!qea", name = "v", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "client!qea", name = "x", descriptor = "I")
    private int field645;

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "[[I")
    public static int[][] field632 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!qea", name = "r", descriptor = "[I")
    public static int[] field639 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!qea", name = "w", descriptor = "Ljj;")
    public static class398 field644 = new class398(58, 12);

    @OriginalMember(owner = "client!qea", name = "y", descriptor = "Lcb;")
    public static class318 field646 = new class318(0, -1);

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "[I")
    public static int[] field647 = new int[200];

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!qea", name = "p", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!qea", name = "A", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public static void method281(int arg0) {
        field646 = null;
        field647 = null;
        field644 = null;
        if (arg0 != 5) {
            method282(-111);
        }
        field632 = null;
        field639 = null;
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
    public static final void method282(int arg0) {
        field637++;
        class276.field3744.method2407(5, (byte) 114);
        class261.field3604.method1123(5, -119);
        class34.field336.method184(5, -1);
        class578.field7980.method1747(5, (byte) 70);
        class318.field4640.method3386(5, (byte) 63);
        class237.field3088.method1350(256, 5);
        class77.field971.method775(5, (byte) -109);
        class236.field3079.method1048(0, 5);
        class150.field1888.method3002(5, (byte) 117);
        class48.field654.method2609(5, (byte) -41);
        class613.field8364.method1871(5, arg0 ^ 0xFFFFFF87);
        class665.field9460.method216(5, 64);
        class70.field916.method1015((byte) -121, 5);
        class191.field2486.method1254(arg0 - 76, 5);
        class559.field7615.method2313(-31159, 5);
        class603.field8243.method2895(5, (byte) -125);
        class502.field6772.method1306((byte) -74, 5);
        if (arg0 != 2) {
            field639 = null;
        }
        class640.field8730.method2496(-122, 5);
        class637.field8698.method1372((byte) -7, 5);
        class67.field876.method3221(false, 5);
        class324.method2082(-57, 5);
        class476.method2666((byte) 117, 50);
        class584.method3271(5, 103);
        class689.method3809((byte) 115, 5);
        class254.field3498.method3129(5, 14583);
        class612.field8348.method3129(5, 14583);
        class154.field1910.method3129(5, 14583);
        class326.field4747.method3129(5, arg0 ^ 0x38F5);
        class317.field4631.method3129(5, 14583);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Ldga;I)V")
    public final void method283(class138 arg0, int arg1) {
        arg0.method951((byte) -82, 2);
        field631++;
        arg0.method951((byte) -82, this.field640);
        arg0.method951((byte) -82, this.field638 ? 1 : 0);
        arg0.method951((byte) -82, this.field635);
        arg0.method951((byte) -82, this.field636);
        if (arg1 < 125) {
            field644 = null;
        }
        arg0.method951((byte) -82, this.field633);
        arg0.method951((byte) -82, this.field641);
        arg0.method951((byte) -82, this.field634 ? 1 : 0);
        arg0.method915(this.field643, 1502242504);
        arg0.method951((byte) -82, this.field642);
        arg0.method932(this.field645, 119);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method284(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field648++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg5 - arg7;
        int var12 = arg0 - arg7;
        int var13 = arg5 * arg5;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = 54 / ((arg4 + 32) / 45);
        int var21 = var15 << 1;
        int var22 = arg0 << 1;
        int var23 = var12 << 1;
        int var24 = (1 - var22) * var13 + var17;
        int var25 = var14 - ((var22 - 1) * var18);
        int var26 = (1 - var23) * var15 + var19;
        int var27 = var16 - ((var23 - 1) * var21);
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var16 << 2;
        int var32 = var17 * 3;
        int var33 = (var22 - 3) * var18;
        int var34 = var19 * 3;
        int var35 = (var23 - 3) * var21;
        int var36 = var29;
        int var37 = (arg0 - 1) * var28;
        int var38 = var31;
        int var39 = (var12 - 1) * var30;
        if (class609.field8313 <= arg6 && arg6 <= class19.field169) {
            int[] var40 = class319.field4673[arg6];
            int var41 = class191.method1226(arg2 - arg5, class398.field5676, class298.field3995, 16);
            int var42 = class191.method1226(arg2 + arg5, class398.field5676, class298.field3995, 16);
            int var43 = class191.method1226(arg2 - var11, class398.field5676, class298.field3995, 16);
            int var44 = class191.method1226(arg2 + var11, class398.field5676, class298.field3995, 16);
            class653.method3620(var43, var41, false, arg3, var40);
            class653.method3620(var44, var43, false, arg1, var40);
            class653.method3620(var42, var44, false, arg3, var40);
        }
        while (var9 > 0) {
            boolean var45 = var9 <= var12;
            if (var45) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var27 += var38;
                        var26 += var34;
                        var38 += var31;
                        var10++;
                        var34 += var31;
                    }
                }
                if (var27 < 0) {
                    var26 += var34;
                    var27 += var38;
                    var38 += var31;
                    var34 += var31;
                    var10++;
                }
                var27 += -var35;
                var26 += -var39;
                var35 -= var30;
                var39 -= var30;
            }
            if (var24 < 0) {
                while (var24 < 0) {
                    var24 += var32;
                    var25 += var36;
                    var8++;
                    var32 += var29;
                    var36 += var29;
                }
            }
            if (var25 < 0) {
                var25 += var36;
                var24 += var32;
                var32 += var29;
                var36 += var29;
                var8++;
            }
            var24 += -var37;
            var25 += -var33;
            var37 -= var28;
            var33 -= var28;
            var9--;
            int var46 = arg6 - var9;
            int var47 = arg6 + var9;
            if (var47 >= class609.field8313 && class19.field169 >= var46) {
                int var48 = class191.method1226(arg2 + var8, class398.field5676, class298.field3995, 16);
                int var49 = class191.method1226(arg2 - var8, class398.field5676, class298.field3995, 16);
                if (var45) {
                    int var50 = class191.method1226(arg2 + var10, class398.field5676, class298.field3995, 16);
                    int var51 = class191.method1226(arg2 - var10, class398.field5676, class298.field3995, 16);
                    if (class609.field8313 <= var46) {
                        int[] var52 = class319.field4673[var46];
                        class653.method3620(var51, var49, false, arg3, var52);
                        class653.method3620(var50, var51, false, arg1, var52);
                        class653.method3620(var48, var50, false, arg3, var52);
                    }
                    if (var47 <= class19.field169) {
                        int[] var53 = class319.field4673[var47];
                        class653.method3620(var51, var49, false, arg3, var53);
                        class653.method3620(var50, var51, false, arg1, var53);
                        class653.method3620(var48, var50, false, arg3, var53);
                    }
                } else {
                    if (var46 >= class609.field8313) {
                        class653.method3620(var48, var49, false, arg3, class319.field4673[var46]);
                    }
                    if (class19.field169 >= var47) {
                        class653.method3620(var48, var49, false, arg3, class319.field4673[var47]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(ZLcr;)V")
    public class47(boolean arg0, class112 arg1) {
        if (arg0) {
            if (class112.field1360.startsWith("win")) {
                this.field640 = 1;
            } else if (class112.field1360.startsWith("mac")) {
                this.field640 = 2;
            } else if (class112.field1360.startsWith("linux")) {
                this.field640 = 3;
            } else {
                this.field640 = 4;
            }
            if (class112.field1351.startsWith("amd64") || class112.field1351.startsWith("x86_64")) {
                this.field638 = true;
            } else {
                this.field638 = false;
            }
            if (class112.field1345.toLowerCase().indexOf("sun") != -1) {
                this.field635 = 1;
            } else if (class112.field1345.toLowerCase().indexOf("microsoft") != -1) {
                this.field635 = 2;
            } else if (class112.field1345.toLowerCase().indexOf("apple") == -1) {
                this.field635 = 4;
            } else {
                this.field635 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class112.field1363.length() > var3) {
                    char var5 = class112.field1363.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = -(-var5 - var4 * 10) - 48;
                    var3++;
                }
            } catch (Exception var15) {
            }
            this.field636 = var4;
            int var6 = class112.field1363.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class112.field1363.length() > var6) {
                    char var8 = class112.field1363.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var6++;
                    var7 = var7 * 10 + (var8 - 48);
                }
            } catch (Exception var14) {
            }
            this.field633 = var7;
            int var9 = class112.field1363.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (class112.field1363.length() > var9) {
                    char var11 = class112.field1363.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = -(-var11 - var10 * 10) - 48;
                }
            } catch (Exception var13) {
            }
            if (this.field636 <= 3) {
                this.field642 = 0;
            } else {
                this.field642 = class334.field4911;
            }
            this.field641 = var10;
            if (arg1.field1356) {
                this.field634 = false;
            } else {
                this.field634 = true;
            }
            this.field643 = class77.field969;
            try {
                this.field645 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field645 = 0;
            }
        }
    }
}
