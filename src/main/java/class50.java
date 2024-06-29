import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class50 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    private int field823 = -1;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Z")
    public boolean field838 = false;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    private int field828 = -1;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    private int field841 = -1;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public int field840 = -1;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "[Ljava/lang/String;")
    public String[] field833 = new String[5];

    @OriginalMember(owner = "client!ed", name = "F", descriptor = "I")
    private int field849 = -1;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public int field831 = -1;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Z")
    public boolean field832 = true;

    @OriginalMember(owner = "client!ed", name = "A", descriptor = "I")
    public int field845 = -1;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "Z")
    public boolean field854 = true;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    private int field820 = -1;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
    public int field847 = 0;

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
    public int field848 = -1;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "Z")
    public boolean field857 = true;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "Lqd;")
    public static class173 field837 = new class173(32);

    @OriginalMember(owner = "client!ed", name = "G", descriptor = "Ljava/lang/String;")
    public static String field850 = "slide:";

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    private int field822;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public int field830;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public int field836;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ed", name = "J", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    private int field855;

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    private int field856;

    @OriginalMember(owner = "client!ed", name = "I", descriptor = "Ldk;")
    public static class251 field852;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Ljava/lang/String;")
    public String field819;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Ljava/lang/String;")
    public String field844;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "[I")
    public int[] field829;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lwd;I)V")
    public final void method349(class162 arg0, int arg1) {
        int var3 = 120 / ((-arg1 - 38) / 58);
        while (true) {
            int var4 = arg0.method1133((byte) 53);
            if (var4 == 0) {
                field825++;
                return;
            }
            this.method352(arg0, (byte) 114, var4);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
    public static final int method350(int arg0, int arg1) {
        field851++;
        if (arg1 > -90) {
            method350(-22, 85);
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZZI)Lhg;")
    public final class220 method351(boolean arg0, boolean arg1, int arg2) {
        field842++;
        int var4 = arg1 ? this.field848 : this.field831;
        class220 var5 = (class220) class72.field1214.method1261(0, (long) ((arg1 ? 65536 : 0) | var4));
        if (var5 != null) {
            return var5;
        } else if (class259.field4189.method1698((byte) 65, var4)) {
            class260 var6 = class218.method1506((byte) -76, class259.field4189, 0, var4);
            if (arg2 <= 46) {
                method354(73);
            }
            if (var6 != null) {
                var6.field3597 = var6.field3603;
                var6.field3604 = 0;
                var6.field3601 = var6.field3605;
                var6.field3599 = 0;
                class72.field1214.method1264(-1, (long) (var4 | (arg1 ? 65536 : 0)), var6);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lwd;BI)V")
    private final void method352(class162 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field831 = arg0.method1142(-18970);
        } else if (arg2 == 2) {
            this.field848 = arg0.method1142(-18970);
        } else if (arg2 == 3) {
            this.field819 = arg0.method1152(-46);
        } else if (arg2 == 4) {
            this.field821 = arg0.method1137(31155);
        } else if (arg2 == 5) {
            this.field840 = arg0.method1137(31155);
        } else if (arg2 == 6) {
            this.field847 = arg0.method1133((byte) 53);
        } else if (arg2 == 7) {
            int var4 = arg0.method1133((byte) 53);
            if ((var4 & 0x1) == 0) {
                this.field832 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field838 = true;
            }
        } else if (arg2 == 8) {
            this.field854 = arg0.method1133((byte) 53) == 1;
        } else if (arg2 == 9) {
            this.field849 = arg0.method1142(-18970);
            if (this.field849 == 65535) {
                this.field849 = -1;
            }
            this.field823 = arg0.method1142(-18970);
            if (this.field823 == 65535) {
                this.field823 = -1;
            }
            this.field855 = arg0.method1157(65280);
            this.field843 = arg0.method1157(65280);
        } else if (arg2 >= 10 && arg2 <= 14) {
            this.field833[arg2 - 10] = arg0.method1152(-109);
        } else if (arg2 == 15) {
            int var5 = arg0.method1133((byte) 53);
            this.field829 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field829[var6] = arg0.method1146(2);
            }
            this.field836 = arg0.method1157(65280);
            this.field830 = arg0.method1157(65280);
        } else if (arg2 == 16) {
            this.field857 = false;
        } else if (arg2 == 17) {
            this.field844 = arg0.method1152(-105);
        } else if (arg2 == 18) {
            this.field841 = arg0.method1142(-18970);
        } else if (arg2 == 19) {
            this.field845 = arg0.method1142(-18970);
        } else if (arg2 == 20) {
            this.field828 = arg0.method1142(-18970);
            if (this.field828 == 65535) {
                this.field828 = -1;
            }
            this.field820 = arg0.method1142(-18970);
            if (this.field820 == 65535) {
                this.field820 = -1;
            }
            this.field822 = arg0.method1157(65280);
            this.field856 = arg0.method1157(65280);
        } else if (arg2 == 21) {
            this.field846 = arg0.method1157(65280);
        } else if (arg2 == 22) {
            this.field827 = arg0.method1157(65280);
        }
        field839++;
        if (arg1 <= 107) {
            this.field833 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Lsa;")
    public final class260 method353(int arg0) {
        field835++;
        class260 var2 = (class260) class72.field1214.method1261(arg0, (long) (this.field841 | 0x20000));
        if (var2 != null) {
            return var2;
        }
        class259.field4189.method1698((byte) 58, this.field841);
        class260 var3 = class218.method1506((byte) -76, class259.field4189, 0, this.field841);
        if (var3 != null) {
            var3.field3597 = var3.field3603;
            var3.field3599 = 0;
            var3.field3601 = var3.field3605;
            var3.field3604 = 0;
            class72.field1214.method1264(-1, (long) (this.field841 | 0x20000), var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)I")
    public static final int method354(int arg0) {
        if (arg0 != -32224) {
            method355(-123);
        }
        field826++;
        return ((class214.field3548 == 0 ? 0 : 1) << 21) + ((class183.field3011 == 0 ? 0 : 1) << 20) + (class188.field3051 & 0x3 << 11) + ((class165.field2656 ? 1 : 0) << 10) + ((class42.field610 ? 1 : 0) << 8) + ((class1.field15 ? 1 : 0) << 6) + ((class100.field1609 ? 1 : 0) << 5) + ((class86.field1419 ? 1 : 0) << 4) + (class77.field1289 & 0x7) + ((class26.field328 ? 1 : 0) << 3) + (((class100.field1624 ? 1 : 0) << 7) + ((class262.field4210 ? 1 : 0) << 9) - (-((class126.field1996 ? 1 : 0) << 13) + -((class66.field1101 ? 1 : 0) << 15) - ((class239.field3831 ? 1 : 0) << 16)) - -(class312.field4979 << 17)) - (-((class247.field3931 ? 1 : 0) << 19) + -((class32.field481 == 0 ? 0 : 1) << 22) + -(class171.method1244() << 23));
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
    public static void method355(int arg0) {
        field837 = null;
        field850 = null;
        if (arg0 != 1) {
            method355(46);
        }
        field852 = null;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)Z")
    public final boolean method356(int arg0) {
        field824++;
        if (arg0 != 1223) {
            return true;
        } else if (this.field823 == -1 && this.field849 == -1) {
            return true;
        } else {
            boolean var2 = false;
            int var3;
            if (this.field823 == -1) {
                var3 = class295.method1960(255, this.field849);
            } else {
                var3 = class195.field3160[this.field823];
            }
            if (this.field855 > var3 || var3 > this.field843) {
                return false;
            } else if (this.field820 == -1 && this.field828 == -1) {
                return true;
            } else {
                boolean var4 = false;
                int var5;
                if (this.field820 == -1) {
                    var5 = class295.method1960(255, this.field828);
                } else {
                    var5 = class195.field3160[this.field820];
                }
                return var5 >= this.field822 && this.field856 >= var5;
            }
        }
    }
}
