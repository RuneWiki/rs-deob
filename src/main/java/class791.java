import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class791 extends class766 {

    @OriginalMember(owner = "client!wv", name = "R", descriptor = "I")
    private int field10848;

    @OriginalMember(owner = "client!wv", name = "A", descriptor = "Z")
    private boolean field10832;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
    private int field10824;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    private int field10819;

    @OriginalMember(owner = "client!wv", name = "H", descriptor = "I")
    private int field10839;

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
    private int field10829;

    @OriginalMember(owner = "client!wv", name = "K", descriptor = "I")
    private int field10841;

    @OriginalMember(owner = "client!wv", name = "O", descriptor = "Z")
    private boolean field10845;

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
    private int field10825;

    @OriginalMember(owner = "client!wv", name = "L", descriptor = "I")
    private int field10842;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
    private int field10821;

    @OriginalMember(owner = "client!wv", name = "N", descriptor = "I")
    public int field10844;

    @OriginalMember(owner = "client!wv", name = "J", descriptor = "I")
    private int field10840;

    @OriginalMember(owner = "client!wv", name = "M", descriptor = "I")
    private int field10843;

    @OriginalMember(owner = "client!wv", name = "w", descriptor = "I")
    private int field10828;

    @OriginalMember(owner = "client!wv", name = "Q", descriptor = "Ljava/lang/String;")
    private String field10847;

    @OriginalMember(owner = "client!wv", name = "G", descriptor = "Ljava/lang/String;")
    private String field10838;

    @OriginalMember(owner = "client!wv", name = "u", descriptor = "Ljava/lang/String;")
    private String field10826;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "Ljava/lang/String;")
    private String field10822;

    @OriginalMember(owner = "client!wv", name = "B", descriptor = "Z")
    public static boolean field10833 = false;

    @OriginalMember(owner = "client!wv", name = "P", descriptor = "I")
    public static int field10846 = 0;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public static int field10820;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
    public static int field10823;

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
    private int field10827;

    @OriginalMember(owner = "client!wv", name = "y", descriptor = "I")
    public static int field10830;

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "I")
    public static int field10831;

    @OriginalMember(owner = "client!wv", name = "C", descriptor = "I")
    public static int field10834;

    @OriginalMember(owner = "client!wv", name = "D", descriptor = "I")
    public static int field10835;

    @OriginalMember(owner = "client!wv", name = "E", descriptor = "I")
    public static int field10836;

    @OriginalMember(owner = "client!wv", name = "F", descriptor = "I")
    private int field10837;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BC)Z", line = 20)
    public static final boolean method4320(byte arg0, char arg1) {
        field10835++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class355.method2143((byte) -105, arg1)) {
            return true;
        } else {
            char[] var2 = class616.field8742;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            if (arg0 != 109) {
                method4324(null, 5);
            }
            char[] var4 = class162.field2496;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)I", line = 68)
    public final int method4321(int arg0) {
        field10836++;
        byte var2 = 23;
        int var3 = var2 + class673.method3768(this.field10822, 18016);
        int var4 = var3 + class673.method3768(this.field10826, 18016);
        int var5 = var4 + class673.method3768(this.field10838, 18016);
        int var6 = var5 + class673.method3768(this.field10847, 18016);
        if (arg0 < 24) {
            method4325((byte) 118, 80, -15, 58);
        }
        return var6;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V", line = 87)
    private final void method4322(boolean arg0) {
        field10830++;
        if (this.field10822.length() > 40) {
            this.field10822 = this.field10822.substring(0, 40);
        }
        if (!arg0) {
            return;
        }
        if (this.field10826.length() > 40) {
            this.field10826 = this.field10826.substring(0, 40);
        }
        if (this.field10838.length() > 10) {
            this.field10838 = this.field10838.substring(0, 10);
        }
        if (this.field10847.length() > 10) {
            this.field10847 = this.field10847.substring(0, 10);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lol;Z)V", line = 113)
    public final void method4323(class431 arg0, boolean arg1) {
        arg0.method2524(false, 5);
        field10823++;
        arg0.method2524(false, this.field10848);
        arg0.method2524(false, this.field10832 ? 1 : 0);
        arg0.method2524(arg1, this.field10824);
        arg0.method2524(arg1, this.field10819);
        arg0.method2524(false, this.field10839);
        arg0.method2524(false, this.field10829);
        arg0.method2524(arg1, this.field10841);
        arg0.method2524(arg1, this.field10845 ? 1 : 0);
        arg0.method2546(!arg1, this.field10842);
        arg0.method2524(false, this.field10825);
        arg0.method2535((byte) 108, this.field10844);
        arg0.method2546(true, this.field10828);
        arg0.method2524(false, this.field10843);
        arg0.method2524(false, this.field10821);
        arg0.method2524(false, this.field10840);
        arg0.method2545(this.field10822, -124);
        arg0.method2545(this.field10826, 81);
        arg0.method2545(this.field10838, 3);
        arg0.method2545(this.field10847, -1);
        arg0.method2524(false, this.field10837);
        arg0.method2546(true, this.field10827);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lha;I)V", line = 143)
    public static final void method4324(class475 arg0, int arg1) {
        field10834++;
        int var2 = 0;
        int var3 = 0;
        if (class593.field8489) {
            var2 = class45.method342(false);
            var3 = class87.method771(arg1 ^ 0xFE);
        }
        int var4 = -10660793;
        class312.method1907(class414.field5678, class72.field1137, -11342, arg0, -16777216, class295.field4297 + var2, var4, class389.field5438 + var3);
        class670.field9398.method2628(var4, class563.field7822.method3281(class423.field5892, arg1 ^ 0xFF), class295.field4297 + var2 + 3, -108, class389.field5438 - -var3 - -14, -1);
        int var5 = class754.field10496.method3065(-28062) + var2;
        if (arg1 != -256) {
            field10831 = -56;
        }
        int var6 = var3 + class754.field10496.method3066(72);
        if (field10833) {
            int var10 = 0;
            for (class551 var11 = (class551) class496.field6807.method249(arg1 ^ 0xFFFFB8C3); var11 != null; var11 = (class551) class496.field6807.method254((byte) -64)) {
                int var15 = class389.field5438 + (var10 * 16) + var3 + 31;
                if (var11.field7643 == 1) {
                    class653.method3675(-256, (class554) var11.field7645.field332.field6213, var6, var5, 22, var15, -1, class414.field5678, class295.field4297 + var2, class389.field5438 + var3, arg0, class72.field1137);
                } else {
                    class535.method3110(arg0, var6, var15, var5, -256, var11, 66, class295.field4297 + var2, class389.field5438 - -var3, class414.field5678, class72.field1137, -1);
                }
                var10++;
            }
            if (class346.field4933 != null) {
                class312.method1907(class362.field5138, class778.field10681, -11342, arg0, -16777216, class653.field9248, var4, class541.field7494);
                int var12 = 0;
                class670.field9398.method2628(var4, class346.field4933.field7652, class653.field9248 + 3, -104, class541.field7494 + 14, -1);
                for (class554 var13 = (class554) class346.field4933.field7645.method249(18371); var13 != null; var13 = (class554) class346.field4933.field7645.method254((byte) -64)) {
                    int var14 = class541.field7494 + (var12 * 16) + 31;
                    class653.method3675(-256, var13, var6, var5, arg1 + 336, var14, -1, class362.field5138, class653.field9248, class541.field7494, arg0, class778.field10681);
                    var12++;
                }
                class640.method3633(class653.field9248, class778.field10681, class541.field7494, arg1 + 128, class362.field5138);
            }
        } else {
            int var7 = 0;
            for (class554 var8 = (class554) class521.field7310.method3731((byte) -75); var8 != null; var8 = (class554) class521.field7310.method3729((byte) -128)) {
                int var9 = (class624.field8863 - var7 - 1) * 16 + class389.field5438 + var3 + 31;
                var7++;
                class653.method3675(-256, var8, var6, var5, 75, var9, -1, class414.field5678, class295.field4297 + var2, class389.field5438 - -var3, arg0, class72.field1137);
            }
        }
        class640.method3633(class295.field4297 + var2, class72.field1137, class389.field5438 + var3, -56, class414.field5678);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BIII)V", line = 234)
    public static final void method4325(byte arg0, int arg1, int arg2, int arg3) {
        field10820++;
        int var4 = 75 % ((-arg0 - 41) / 55);
        class371 var5 = class490.method2867((byte) -73, 9, (long) arg1);
        var5.method2212(-111);
        var5.field5225 = arg2;
        var5.field5233 = arg3;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V", line = 261)
    public class791() {
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(ZLcea;)V", line = 263)
    public class791(boolean arg0, class111 arg1) {
        if (arg0) {
            if (class111.field1584.startsWith("win")) {
                this.field10848 = 1;
            } else if (class111.field1584.startsWith("mac")) {
                this.field10848 = 2;
            } else if (class111.field1584.startsWith("linux")) {
                this.field10848 = 3;
            } else {
                this.field10848 = 4;
            }
            if (class111.field1596.startsWith("amd64") || class111.field1596.startsWith("x86_64")) {
                this.field10832 = true;
            } else {
                this.field10832 = false;
            }
            if (this.field10848 == 1) {
                if (class111.field1597.indexOf("4.0") != -1) {
                    this.field10824 = 1;
                } else if (class111.field1597.indexOf("4.1") != -1) {
                    this.field10824 = 2;
                } else if (class111.field1597.indexOf("4.9") != -1) {
                    this.field10824 = 3;
                } else if (class111.field1597.indexOf("5.0") != -1) {
                    this.field10824 = 4;
                } else if (class111.field1597.indexOf("5.1") != -1) {
                    this.field10824 = 5;
                } else if (class111.field1597.indexOf("6.0") != -1) {
                    this.field10824 = 6;
                } else if (class111.field1597.indexOf("6.1") != -1) {
                    this.field10824 = 7;
                }
            } else if (this.field10848 == 2) {
                if (class111.field1597.indexOf("10.4") != -1) {
                    this.field10824 = 20;
                } else if (class111.field1597.indexOf("10.5") != -1) {
                    this.field10824 = 21;
                } else if (class111.field1597.indexOf("10.6") != -1) {
                    this.field10824 = 22;
                }
            }
            if (class111.field1591.toLowerCase().indexOf("sun") != -1) {
                this.field10819 = 1;
            } else if (class111.field1591.toLowerCase().indexOf("microsoft") != -1) {
                this.field10819 = 2;
            } else if (class111.field1591.toLowerCase().indexOf("apple") == -1) {
                this.field10819 = 4;
            } else {
                this.field10819 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class111.field1592.length() > var3) {
                    char var5 = class111.field1592.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - 48);
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field10839 = var4;
            int var6 = 0;
            int var7 = class111.field1592.indexOf(46, 2) + 1;
            try {
                while (class111.field1592.length() > var7) {
                    char var8 = class111.field1592.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7++;
                    var6 = var6 * 10 - (48 - var8);
                }
            } catch (Exception var15) {
            }
            this.field10829 = var6;
            int var9 = class111.field1592.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class111.field1592.length()) {
                    char var11 = class111.field1592.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = var10 * 10 + var11 - 48;
                }
            } catch (Exception var14) {
            }
            this.field10841 = var10;
            if (arg1.field1585) {
                this.field10845 = false;
            } else {
                this.field10845 = true;
            }
            if (this.field10839 > 3) {
                this.field10825 = class501.field6873;
            } else {
                this.field10825 = 0;
            }
            this.field10842 = class139.field2293;
            try {
                int[] var12 = HardwareInfo.getCPUInfo();
                if (var12 != null && var12.length == 7) {
                    this.field10821 = var12[4];
                    this.field10844 = var12[6];
                    this.field10840 = var12[5];
                    this.field10843 = var12[3];
                    this.field10828 = var12[2];
                }
            } catch (Throwable var13) {
                this.field10844 = 0;
            }
        }
        if (this.field10847 == null) {
            this.field10847 = "";
        }
        if (this.field10838 == null) {
            this.field10838 = "";
        }
        if (this.field10826 == null) {
            this.field10826 = "";
        }
        if (this.field10822 == null) {
            this.field10822 = "";
        }
        this.method4322(true);
    }
}
