import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 extends class99 {

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Lr;")
    private static class118 field216 = class153.method1136(98, "flash1:");

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field217 = 0;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "Lr;")
    public static class118 field230 = class153.method1136(119, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "Lr;")
    private static class118 field224 = class153.method1136(126, "Username: ");

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "Lr;")
    public static class118 field226 = field216;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Lr;")
    public static class118 field238 = class153.method1136(116, "gleiten:");

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "Lr;")
    public static class118 field220 = field224;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "Lr;")
    public static class118 field233 = field216;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "Lr;")
    public static class118 field239 = class153.method1136(126, "<col=ffff00>*V");

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "Lr;")
    public static class118 field227 = class153.method1136(123, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "Lge;")
    public static class47 field225 = new class47(30);

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Lvb;")
    public class148 field221;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Ldf;")
    public static class28 field228;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Lha;")
    public class50 field231;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "Lha;")
    public class50 field244;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
    public int[] field219;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "[Lvd;")
    public static class150[] field218;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
    public static final void method77(int arg0, int arg1) {
        if (arg0 != 6) {
            return;
        }
        field241++;
        class97 var2 = (class97) class64.field1464.method297((long) arg1, -1);
        if (var2 != null) {
            var2.method768(-1);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static void method78(int arg0) {
        field227 = null;
        field216 = null;
        field218 = null;
        field224 = null;
        field225 = null;
        field228 = null;
        field226 = null;
        field233 = null;
        field230 = null;
        if (arg0 < 109) {
            field238 = null;
        }
        field239 = null;
        field220 = null;
        field238 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lea;I)V")
    public static final void method79(class30 arg0, int arg1) {
        arg0.field765 = arg0.field766;
        field246++;
        if (arg0.field726 == 0) {
            arg0.field736 = 0;
            return;
        }
        if (arg0.field746 != -1 && arg0.field747 == 0) {
            class153 var2 = class125.method970((byte) -68, arg0.field746);
            if (arg0.field713 > 0 && var2.field3447 == 0) {
                arg0.field736++;
                return;
            }
            if (arg0.field713 <= 0 && var2.field3441 == 0) {
                arg0.field736++;
                return;
            }
        }
        int var3 = arg0.field712;
        if (arg1 != 3370) {
            method79(null, -12);
        }
        int var4 = arg0.field760;
        int var5 = arg0.field710[arg0.field726 - 1] * 128 + arg0.field733 * 64;
        int var6 = arg0.field755[arg0.field726 - 1] * 128 + arg0.field733 * 64;
        if (var5 - var4 > 256 || var5 - var4 < -256 || var6 - var3 > 256 || var6 - var3 < -256) {
            arg0.field760 = var5;
            arg0.field712 = var6;
            return;
        }
        if (var4 < var5) {
            if (var6 > var3) {
                arg0.field756 = 1280;
            } else if (var6 >= var3) {
                arg0.field756 = 1536;
            } else {
                arg0.field756 = 1792;
            }
        } else if (var5 >= var4) {
            if (var6 > var3) {
                arg0.field756 = 1024;
            } else if (var6 < var3) {
                arg0.field756 = 0;
            }
        } else if (var3 < var6) {
            arg0.field756 = 768;
        } else if (var6 < var3) {
            arg0.field756 = 256;
        } else {
            arg0.field756 = 512;
        }
        int var7 = arg0.field756 - arg0.field768 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field762;
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field764;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field767;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field761;
        }
        if (var8 == -1) {
            var8 = arg0.field764;
        }
        arg0.field765 = var8;
        boolean var10 = true;
        if (arg0 instanceof class83) {
            var10 = ((class83) arg0).field1989.field2580;
        }
        if (var10) {
            if (arg0.field768 != arg0.field756 && arg0.field731 == -1 && arg0.field729 != 0) {
                var9 = 2;
            }
            if (arg0.field726 > 2) {
                var9 = 6;
            }
            if (arg0.field726 > 3) {
                var9 = 8;
            }
            if (arg0.field736 > 0 && arg0.field726 > 1) {
                arg0.field736--;
                var9 = 8;
            }
        } else {
            if (arg0.field726 > 1) {
                var9 = 6;
            }
            if (arg0.field726 > 2) {
                var9 = 8;
            }
            if (arg0.field736 > 0 && arg0.field726 > 1) {
                var9 = 8;
                arg0.field736--;
            }
        }
        if (arg0.field778[arg0.field726 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var3) {
            arg0.field712 += var9;
            if (arg0.field712 > var6) {
                arg0.field712 = var6;
            }
        } else if (var3 > var6) {
            arg0.field712 -= var9;
            if (arg0.field712 < var6) {
                arg0.field712 = var6;
            }
        }
        if (var4 < var5) {
            arg0.field760 += var9;
            if (var5 < arg0.field760) {
                arg0.field760 = var5;
            }
        } else if (var4 > var5) {
            arg0.field760 -= var9;
            if (var5 > arg0.field760) {
                arg0.field760 = var5;
            }
        }
        if (arg0.field760 == var5 && arg0.field712 == var6) {
            if (arg0.field713 > 0) {
                arg0.field713--;
            }
            arg0.field726--;
        }
        if (var9 >= 8 && arg0.field765 == arg0.field764 && arg0.field750 != -1) {
            arg0.field765 = arg0.field750;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        field237++;
        int var2 = this.field232;
        if (arg0 != 0) {
            this.method80(67);
        }
        class148 var3 = this.field221.method1085(~arg0);
        if (var3 == null) {
            this.field223 = 0;
            this.field242 = 0;
            this.field232 = -1;
            this.field219 = null;
            this.field229 = 0;
        } else {
            this.field219 = var3.field3309;
            this.field232 = var3.field3326;
            this.field229 = var3.field3335;
            this.field242 = var3.field3272 * 128;
            this.field223 = var3.field3301;
        }
        if (this.field232 != var2 && this.field244 != null) {
            class94.field2239.method765(this.field244);
            this.field244 = null;
        }
    }
}
