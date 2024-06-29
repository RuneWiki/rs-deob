import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 extends class119 {

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    private int field2700 = 0;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public int field2710 = -1;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    private int field2713 = 0;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    private int field2705 = 0;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    private int field2697 = 128;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    private int field2717 = 128;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "Lv;")
    private static class146 field2694 = class159.method1226((byte) -37, "Members object");

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "Lv;")
    public static class146 field2690 = class159.method1226((byte) -37, "huffman");

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "Lv;")
    public static class146 field2709 = class159.method1226((byte) -37, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "Lv;")
    public static class146 field2703 = class159.method1226((byte) -37, "mapmarker");

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lv;")
    public static class146 field2711 = class159.method1226((byte) -37, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "Lv;")
    public static class146 field2692 = class159.method1226((byte) -37, "Hier wechseln");

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "Lv;")
    public static class146 field2718 = class159.method1226((byte) -37, "(Y");

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "Lv;")
    public static class146 field2715 = field2694;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "Lv;")
    private static class146 field2720 = class159.method1226((byte) -37, "The server is being updated)3");

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lv;")
    public static class146 field2712 = field2720;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    private int field2706;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Lje;")
    public static class67 field2696;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "[I")
    public static int[] field2716;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "[S")
    private short[] field2691;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "[S")
    private short[] field2695;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "[S")
    private short[] field2699;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "[S")
    private short[] field2702;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
    public static final void method889(byte arg0, int arg1) {
        field2708++;
        if (arg1 == -1 || !class54.method365(29657, arg1)) {
            return;
        }
        if (arg0 > -84) {
            method892(69);
        }
        class26[] var2 = class34.field736[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class26 var4 = var2[var3];
            if (var4.field490 != null) {
                class120 var5 = new class120();
                var5.field2787 = var4;
                var5.field2790 = var4.field490;
                class25.method157(var5, 5);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILne;Z)V")
    private final void method890(int arg0, class95 arg1, boolean arg2) {
        field2719++;
        if (!arg2) {
            this.method894((byte) 77, null);
        }
        if (arg0 == 1) {
            this.field2706 = arg1.method795(1);
        } else if (arg0 == 2) {
            this.field2710 = arg1.method795(1);
        } else if (arg0 == 4) {
            this.field2717 = arg1.method795(1);
        } else if (arg0 == 5) {
            this.field2697 = arg1.method795(1);
        } else if (arg0 == 6) {
            this.field2705 = arg1.method795(1);
        } else if (arg0 == 7) {
            this.field2713 = arg1.method790((byte) 73);
        } else if (arg0 == 8) {
            this.field2700 = arg1.method790((byte) 73);
            return;
        } else if (arg0 == 40) {
            int var4 = arg1.method790((byte) 73);
            this.field2691 = new short[var4];
            this.field2695 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2695[var5] = (short) arg1.method795(1);
                this.field2691[var5] = (short) arg1.method795(1);
            }
            return;
        } else if (arg0 == 41) {
            int var6 = arg1.method790((byte) 73);
            this.field2702 = new short[var6];
            this.field2699 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2702[var7] = (short) arg1.method795(1);
                this.field2699[var7] = (short) arg1.method795(1);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lu;")
    public final class139 method891(int arg0, int arg1) {
        field2714++;
        class139 var3 = (class139) class115.field2668.method1045((long) this.field2701, 120);
        if (var3 == null) {
            class129 var4 = class129.method957(class52.field1169, this.field2706, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2695 != null) {
                for (int var5 = 0; var5 < this.field2695.length; var5++) {
                    var4.method966(this.field2695[var5], this.field2691[var5]);
                }
            }
            if (this.field2702 != null) {
                for (int var6 = 0; var6 < this.field2702.length; var6++) {
                    var4.method964(this.field2702[var6], this.field2699[var6]);
                }
            }
            var3 = var4.method961(this.field2713 + 64, this.field2700 + 850, -30, -50, -30);
            class115.field2668.method1047(arg0 ^ 0xFFFFB350, var3, (long) this.field2701);
        }
        if (arg0 != 19631) {
            field2715 = null;
        }
        class139 var7;
        if (this.field2710 == -1 || arg1 == -1) {
            var7 = var3.method1041(true);
        } else {
            var7 = class141.method1052(true, this.field2710).method521(var3, arg1, arg0 ^ 0x4CA3);
        }
        if (this.field2717 != 128 || this.field2697 != 128) {
            var7.method1038(this.field2717, this.field2697, this.field2717);
        }
        if (this.field2705 != 0) {
            if (this.field2705 == 90) {
                var7.method1029();
            }
            if (this.field2705 == 180) {
                var7.method1029();
                var7.method1029();
            }
            if (this.field2705 == 270) {
                var7.method1029();
                var7.method1029();
                var7.method1029();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
    public static void method892(int arg0) {
        field2692 = null;
        field2715 = null;
        if (arg0 > -101) {
            return;
        }
        field2709 = null;
        field2696 = null;
        field2720 = null;
        field2694 = null;
        field2690 = null;
        field2716 = null;
        field2711 = null;
        field2703 = null;
        field2712 = null;
        field2718 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)I")
    public static final int method893(byte arg0, int arg1, int arg2) {
        field2693++;
        if (arg0 != -117) {
            field2716 = null;
        }
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLne;)V")
    public final void method894(byte arg0, class95 arg1) {
        if (arg0 != -38) {
            field2698 = 43;
        }
        field2704++;
        while (true) {
            int var3 = arg1.method790((byte) 73);
            if (var3 == 0) {
                return;
            }
            this.method890(var3, arg1, true);
        }
    }
}
