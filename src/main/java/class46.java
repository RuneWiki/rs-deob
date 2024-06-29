import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class46 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Ldh;")
    public class120 field579 = new class120();

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[C")
    public static char[] field581 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Z")
    public static boolean field586 = false;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "[J")
    public static long[] field590 = new long[100];

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "[[B")
    public static byte[][] field584 = new byte[50][];

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "Ldh;")
    private class120 field596;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "[S")
    public static short[] field591;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)Ldh;")
    public final class120 method344(byte arg0) {
        field592++;
        if (arg0 != -5) {
            this.method350(-77);
        }
        class120 var2 = this.field579.field1752;
        if (this.field579 == var2) {
            return null;
        } else {
            var2.method784(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lbk;I)V")
    public static final void method345(class20 arg0, int arg1) {
        class59.field835 = 3;
        field588++;
        class76.method517(false, true);
        class185.field2900 = 0;
        class184.field2893 = true;
        class261.field4220 = 0;
        class143.field2098 = true;
        class229.field3703 = 0;
        class239.field3814 = true;
        class182.field2882 = true;
        class76.field1074 = 127;
        class195.field3073 = true;
        class192.field3041 = 0;
        class65.field912 = 2;
        class199.field3114 = true;
        class50.field693 = true;
        class264.field4255 = true;
        class132 var2 = null;
        if (arg1 != 382) {
            method348(-8);
        }
        class3.field37 = true;
        class60.field841 = 127;
        class16.field192 = true;
        class219.field3553 = 255;
        class123.field1815 = true;
        if (class69.field967 < 96) {
            class217.method1469(0);
        } else {
            class217.method1469(2);
        }
        class238.field3807 = 0;
        class80.field1167 = true;
        class8.field124 = 0;
        class141.field2068 = false;
        class18.field215 = 0;
        class244.field3910 = false;
        class264.field4251 = false;
        try {
            class208 var3 = arg0.method145("runescape", 10);
            while (var3.field3247 == 0) {
                class170.method1183(1L, (byte) 126);
            }
            if (var3.field3247 == 1) {
                var2 = (class132) var3.field3249;
                byte[] var4 = new byte[(int) var2.method901(true)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method903(var5, var4.length - var5, 113, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class237.method1610(92, new class25(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method898((byte) 5);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
    public final void method346(boolean arg0) {
        if (!arg0) {
            return;
        }
        field582++;
        while (true) {
            class120 var2 = this.field579.field1752;
            if (this.field579 == var2) {
                this.field596 = null;
                return;
            }
            var2.method784(false);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ldl;Ldl;I)V")
    public static final void method347(class123 arg0, class123 arg1, int arg2) {
        class54.field740 = arg1;
        class77.field1085 = arg0;
        if (arg2 <= 102) {
            method348(-115);
        }
        class172.field2695 = class77.field1085.method820(3, 112);
        field587++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method348(int arg0) {
        field590 = null;
        field584 = null;
        field581 = null;
        if (arg0 != 8482) {
            method345((class20) null, -97);
        }
        field591 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ldh;Z)V")
    public final void method349(class120 arg0, boolean arg1) {
        field589++;
        if (arg0.field1749 != null) {
            arg0.method784(!arg1);
        }
        arg0.field1752 = this.field579;
        if (!arg1) {
            this.method354((byte) 114);
        }
        arg0.field1749 = this.field579.field1749;
        arg0.field1749.field1752 = arg0;
        arg0.field1752.field1749 = arg0;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Ldh;")
    public final class120 method350(int arg0) {
        field594++;
        class120 var2 = this.field579.field1752;
        if (this.field579 == var2) {
            this.field596 = null;
            return null;
        } else {
            this.field596 = var2.field1752;
            return arg0 == 8240 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ldh;I)V")
    public final void method351(class120 arg0, int arg1) {
        if (arg0.field1749 != null) {
            arg0.method784(false);
        }
        field593++;
        int var3 = -85 / ((-arg1 - 20) / 43);
        arg0.field1752 = this.field579.field1752;
        arg0.field1749 = this.field579;
        arg0.field1749.field1752 = arg0;
        arg0.field1752.field1749 = arg0;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)Ldh;")
    public final class120 method352(byte arg0) {
        field580++;
        int var2 = -32 % ((arg0 - 71) / 47);
        class120 var3 = this.field596;
        if (this.field579 == var3) {
            this.field596 = null;
            return null;
        } else {
            this.field596 = var3.field1749;
            return var3;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)Ldh;")
    public final class120 method353(byte arg0) {
        if (arg0 >= -112) {
            method347((class123) null, (class123) null, 81);
        }
        class120 var2 = this.field596;
        field595++;
        if (this.field579 == var2) {
            this.field596 = null;
            return null;
        } else {
            this.field596 = var2.field1752;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)Ldh;")
    public final class120 method354(byte arg0) {
        if (arg0 != -105) {
            field590 = null;
        }
        field585++;
        class120 var2 = this.field579.field1749;
        if (this.field579 == var2) {
            this.field596 = null;
            return null;
        } else {
            this.field596 = var2.field1749;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class46() {
        this.field579.field1752 = this.field579;
        this.field579.field1749 = this.field579;
    }
}
