import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 extends class31 {

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
    private int field2773 = 0;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "[S")
    private short[] field2772 = new short[6];

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "I")
    public int field2785 = -1;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    private int field2769 = 128;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    private int field2766 = 128;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    private int field2776 = 0;

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "I")
    private int field2786 = 0;

    @OriginalMember(owner = "client!rc", name = "vb", descriptor = "[S")
    private short[] field2793 = new short[6];

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    public static int field2764 = 0;

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "[I")
    public static int[] field2781 = new int[2048];

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "Lid;")
    private static class60 field2779 = class11.method72("level)2", (byte) -16);

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "Lid;")
    public static class60 field2774 = class11.method72("::qa_op_test", (byte) -20);

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "Lid;")
    public static class60 field2771 = field2779;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "Lid;")
    public static class60 field2780 = class11.method72("oberen Rand der Webseite ausw-=hlen)3", (byte) 5);

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "Lid;")
    private static class60 field2763 = class11.method72("cyan:", (byte) 109);

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "Lid;")
    public static class60 field2775 = field2763;

    @OriginalMember(owner = "client!rc", name = "qb", descriptor = "[Z")
    public static boolean[] field2788 = new boolean[5];

    @OriginalMember(owner = "client!rc", name = "ub", descriptor = "I")
    public static int field2792 = 0;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "Lid;")
    public static class60 field2778 = field2763;

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "Lid;")
    public static class60 field2783 = class11.method72("Hier wechseln", (byte) -51);

    @OriginalMember(owner = "client!rc", name = "rb", descriptor = "I")
    public static int field2789 = 5063219;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    private int field2765;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!rc", name = "pb", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!rc", name = "sb", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!rc", name = "tb", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "Lpa;")
    public static class105 field2777;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILof;)V")
    public final void method939(int arg0, class103 arg1) {
        while (true) {
            int var3 = arg1.method829((byte) 106);
            if (var3 == 0) {
                if (arg0 != 6) {
                    return;
                }
                field2790++;
                return;
            }
            this.method942(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)Lka;")
    public final class70 method940(int arg0, int arg1) {
        field2787++;
        class70 var3 = (class70) class13.field240.method918(117, (long) this.field2770);
        if (arg0 != 31710) {
            this.field2776 = -80;
        }
        if (var3 == null) {
            class96 var4 = class96.method751(class67.field1638, this.field2765, 0);
            if (var4 == null) {
                return null;
            }
            for (int var5 = 0; var5 < 6; var5++) {
                if (this.field2772[0] != 0) {
                    var4.method754(this.field2772[var5], this.field2793[var5]);
                }
            }
            var3 = var4.method749(this.field2776 + 64, this.field2773 + 850, -30, -50, -30);
            class13.field240.method914(var3, (long) this.field2770, (byte) 42);
        }
        class70 var6;
        if (this.field2785 == -1 || arg1 == -1) {
            var6 = var3.method526(true);
        } else {
            var6 = class44.method344(this.field2785, (byte) -58).method360((byte) 16, var3, arg1);
        }
        if (this.field2769 != 128 || this.field2766 != 128) {
            var6.method525(this.field2769, this.field2766, this.field2769);
        }
        if (this.field2786 != 0) {
            if (this.field2786 == 90) {
                var6.method522();
            }
            if (this.field2786 == 180) {
                var6.method522();
                var6.method522();
            }
            if (this.field2786 == 270) {
                var6.method522();
                var6.method522();
                var6.method522();
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static final void method941(byte arg0) {
        if (arg0 != -96) {
            field2775 = null;
        }
        class22.field548 = true;
        field2791++;
        class76.field1851 = true;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lof;IZ)V")
    private final void method942(class103 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field2765 = arg0.method808(-20054);
        } else if (arg1 == 2) {
            this.field2785 = arg0.method808(-20054);
        } else if (arg1 == 4) {
            this.field2769 = arg0.method808(-20054);
        } else if (arg1 == 5) {
            this.field2766 = arg0.method808(-20054);
        } else if (arg1 == 6) {
            this.field2786 = arg0.method808(-20054);
        } else if (arg1 == 7) {
            this.field2776 = arg0.method829((byte) 94);
        } else if (arg1 == 8) {
            this.field2773 = arg0.method829((byte) 36);
        } else if (arg1 >= 40 && arg1 < 50) {
            this.field2772[arg1 - 40] = (short) arg0.method808(-20054);
        } else if (arg1 >= 50 && arg1 < 60) {
            this.field2793[arg1 - 50] = (short) arg0.method808(-20054);
        }
        field2784++;
        if (arg2) {
            this.method939(-75, null);
        }
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public static void method943(int arg0) {
        field2781 = null;
        field2778 = null;
        field2774 = null;
        field2788 = null;
        field2775 = null;
        field2783 = null;
        field2777 = null;
        field2779 = null;
        field2771 = null;
        field2780 = null;
        if (arg0 != -31828) {
            method945(15);
        }
        field2763 = null;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)Lff;")
    public static final class42 method944(int arg0, int arg1) {
        field2767++;
        if (arg0 != -20816) {
            method943(51);
        }
        class42 var2 = (class42) class113.field2708.method918(-24, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class28.field662.method473((byte) 115, 3, arg1);
        class42 var4 = new class42();
        if (var3 != null) {
            var4.method335(0, new class103(var3));
        }
        class113.field2708.method914(var4, (long) arg1, (byte) 62);
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)I")
    public static final int method945(int arg0) {
        if (arg0 != -28933) {
            method943(-33);
        }
        field2768++;
        return 6;
    }
}
