import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class38 extends class1 {

    @OriginalMember(owner = "client!gb", name = "Gb", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!gb", name = "Mb", descriptor = "I")
    private int field929;

    @OriginalMember(owner = "client!gb", name = "Hb", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "client!gb", name = "Nb", descriptor = "I")
    private int field930;

    @OriginalMember(owner = "client!gb", name = "Ib", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!gb", name = "Eb", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "client!gb", name = "Db", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "client!gb", name = "Ab", descriptor = "Lh;")
    private class45 field917;

    @OriginalMember(owner = "client!gb", name = "Kb", descriptor = "I")
    private int field927;

    @OriginalMember(owner = "client!gb", name = "Cb", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "client!gb", name = "Bb", descriptor = "Lgd;")
    private static class40 field918 = class14.method90(false, "Too many connections from your address)3");

    @OriginalMember(owner = "client!gb", name = "Jb", descriptor = "Lgd;")
    public static class40 field926 = field918;

    @OriginalMember(owner = "client!gb", name = "Qb", descriptor = "I")
    public static int field933 = 0;

    @OriginalMember(owner = "client!gb", name = "Rb", descriptor = "Lba;")
    public static class7 field934 = new class7(64);

    @OriginalMember(owner = "client!gb", name = "Sb", descriptor = "Lgd;")
    public static class40 field935 = class14.method90(false, "runes");

    @OriginalMember(owner = "client!gb", name = "Tb", descriptor = "Lgd;")
    public static class40 field936 = class14.method90(false, "null");

    @OriginalMember(owner = "client!gb", name = "Yb", descriptor = "J")
    public static long field941 = 0L;

    @OriginalMember(owner = "client!gb", name = "Xb", descriptor = "Lgd;")
    public static class40 field940 = class14.method90(false, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!gb", name = "Vb", descriptor = "I")
    public static int field938 = 0;

    @OriginalMember(owner = "client!gb", name = "Zb", descriptor = "Lgd;")
    public static class40 field942 = class14.method90(false, "");

    @OriginalMember(owner = "client!gb", name = "Wb", descriptor = "Lde;")
    public static class24 field939 = new class24(32);

    @OriginalMember(owner = "client!gb", name = "ac", descriptor = "[Lrd;")
    public static class106[] field943 = new class106[50];

    @OriginalMember(owner = "client!gb", name = "bc", descriptor = "Lba;")
    public static class7 field944 = new class7(64);

    @OriginalMember(owner = "client!gb", name = "cc", descriptor = "Lgd;")
    public static class40 field945 = class14.method90(false, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!gb", name = "Fb", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!gb", name = "Lb", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!gb", name = "Ob", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!gb", name = "Pb", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!gb", name = "Ub", descriptor = "Lhd;")
    public static class46 field937;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)Lqb;", line = 13)
    public final class97 method2(byte arg0) {
        if (this.field917 != null) {
            int var2 = class10.field242 - this.field927;
            if (var2 > 100 && this.field917.field1142 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (this.field917.field1123[this.field919] >= var2) {
                            break label42;
                        }
                        var2 -= this.field917.field1123[this.field919];
                        this.field919++;
                    } while (this.field919 < this.field917.field1155.length);
                    this.field919 -= this.field917.field1142;
                } while (this.field919 >= 0 && this.field919 < this.field917.field1155.length);
                this.field917 = null;
            }
            this.field927 = class10.field242 - var2;
        }
        field932++;
        class14 var3 = class114.method884(this.field924, (byte) -56);
        if (var3.field361 != null) {
            var3 = var3.method88(4);
        }
        if (arg0 > -110) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            return var3.method91(this.field921, this.field919, this.field920, this.field929, this.field925, 1, this.field917, this.field930, this.field923);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V", line = 69)
    public static final void method234(int arg0, int arg1, int arg2) {
        field928++;
        int var3 = 0;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class30.field664[var4] != null) {
                int var5 = class52.field1316[var4];
                int var6 = class130.field3134 + 70 + 4 - var3 * 14;
                if (var6 < -20) {
                    break;
                }
                class40 var7 = class10.field247[var4];
                if (var7 != null && var7.method276(36, class7.field196)) {
                    var7 = var7.method240(-28427, 5);
                }
                if (var5 == 0) {
                    var3++;
                }
                if (var7 != null && var7.method276(36, class55.field1408)) {
                    var7 = var7.method240(arg1 ^ 0x5FD4, 5);
                }
                if ((var5 == 1 || var5 == 2) && (var5 == 1 || class1.field23 == 0 || class1.field23 == 1 && class66.method478(true, var7))) {
                    var3++;
                    if (var6 - 14 < arg2 && arg2 <= var6 && !var7.method269(class13.field332.field2210, arg1 + 12449)) {
                        class35.field881++;
                        if (class107.field2610 >= 1) {
                            class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, var7 }), class128.field3061, 58, 0, -1);
                            class63.field1539++;
                        }
                        class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, var7 }), class106.field2577, 9, 0, -1);
                        class40.field978++;
                        class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, var7 }), class56.field1452, 27, 0, -1);
                    }
                }
                if ((var5 == 3 || var5 == 7) && class74.field1713 == 0 && (var5 == 7 || class94.field2163 == 0 || class94.field2163 == 1 && class66.method478(true, var7))) {
                    if (arg2 > var6 - 14 && arg2 <= var6) {
                        class40.field978++;
                        if (class107.field2610 >= 1) {
                            class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, var7 }), class128.field3061, 58, 0, -1);
                            class63.field1539++;
                        }
                        class35.field881++;
                        class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, var7 }), class106.field2577, 9, 0, -1);
                        class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, var7 }), class56.field1452, 27, 0, -1);
                    }
                    var3++;
                }
                if (var5 == 4 && (class76.field1765 == 0 || class76.field1765 == 1 && class66.method478(true, var7))) {
                    if (var6 - 14 < arg2 && arg2 <= var6) {
                        class76.field1742++;
                        class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, var7 }), class91.field2076, 44, 0, -1);
                    }
                    var3++;
                }
                if ((var5 == 5 || var5 == 6) && class74.field1713 == 0 && class94.field2163 < 2) {
                    var3++;
                }
                if (var5 == 8 && (class76.field1765 == 0 || class76.field1765 == 1 && class66.method478(true, var7))) {
                    if (var6 - 14 < arg2 && arg2 <= var6) {
                        class98.method686(0, 0, client.method114(true, new class40[] { class112.field2720, var7 }), class85.field1900, 23, 0, arg1 ^ 0x30DE);
                        class21.field483++;
                    }
                    var3++;
                }
            }
        }
        if (arg1 != -12511) {
            method234(-94, 100, -59);
        }
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V", line = 225)
    public static final void method235(int arg0) {
        if (arg0 != 9) {
            return;
        }
        for (int var1 = 0; var1 < class44.field1114; var1++) {
            int var2 = class104.field2519[var1];
            class23 var3 = class130.field3142[var2];
            int var4 = class100.field2376.method798((byte) -90);
            if ((var4 & 0x8) != 0) {
                var3.field796 = class100.field2376.method765(13101);
                var3.field817 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var5 = class100.field2376.method800((byte) -13);
                int var6 = class100.field2376.method798((byte) -106);
                var3.method199(class10.field242, var5, var6, 12765);
                var3.field764 = class10.field242 + 300;
                var3.field834 = class100.field2376.method795(arg0 + 685);
                var3.field765 = class100.field2376.method798((byte) -85);
            }
            if ((var4 & 0x20) != 0) {
                int var7 = class100.field2376.method795(arg0 ^ 0x2BF);
                int var8 = class100.field2376.method798((byte) -79);
                var3.method199(class10.field242, var7, var8, 12765);
                var3.field764 = class10.field242 + 300;
                var3.field834 = class100.field2376.method800((byte) -13);
                var3.field765 = class100.field2376.method758(14);
            }
            if ((var4 & 0x80) != 0) {
                var3.field766 = class100.field2376.method757((byte) 96);
                if (var3.field766 == 65535) {
                    var3.field766 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field827 = class100.field2376.method810((byte) -87);
                int var9 = class100.field2376.method755((byte) -89);
                var3.field795 = var9 >> 16;
                var3.field806 = 0;
                if (var3.field827 == 65535) {
                    var3.field827 = -1;
                }
                var3.field832 = 0;
                var3.field776 = (var9 & 0xFFFF) + class10.field242;
                if (var3.field776 > class10.field242) {
                    var3.field806 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field784 = class100.field2376.method757((byte) 91);
                var3.field774 = class100.field2376.method797(-7916);
            }
            if ((var4 & 0x10) != 0) {
                var3.field531 = class80.method533((byte) 118, class100.field2376.method757((byte) 103));
                var3.field814 = var3.field531.field3049;
                var3.field794 = var3.field531.field3030;
                var3.field830 = var3.field531.field3062;
                var3.field811 = var3.field531.field3024;
                var3.field808 = var3.field531.field3052;
                var3.field825 = var3.field531.field3044;
                var3.field837 = var3.field531.field3046;
                var3.field797 = var3.field531.field3065;
                var3.field785 = var3.field531.field3040;
            }
            if ((var4 & 0x2) != 0) {
                int var10 = class100.field2376.method810((byte) -96);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class100.field2376.method758(127);
                if (var3.field813 == var10 && var10 != -1) {
                    int var12 = class22.method126((byte) -87, var10).field1159;
                    if (var12 == 1) {
                        var3.field804 = var11;
                        var3.field799 = 0;
                        var3.field816 = 0;
                        var3.field824 = 0;
                    }
                    if (var12 == 2) {
                        var3.field824 = 0;
                    }
                } else if (var10 == -1 || var3.field813 == -1 || class22.method126((byte) -61, var10).field1125 >= class22.method126((byte) 79, var3.field813).field1125) {
                    var3.field804 = var11;
                    var3.field824 = 0;
                    var3.field799 = 0;
                    var3.field816 = 0;
                    var3.field813 = var10;
                    var3.field770 = var3.field791;
                }
            }
        }
        field922++;
    }

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "(I)V", line = 385)
    public static final void method236(int arg0) {
        class35.field885.method40((byte) -101);
        class41.field1013.method40((byte) -101);
        class1.field20.method40((byte) -101);
        field931++;
        if (arg0 > -28) {
            method234(77, -8, 2);
        }
    }

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)V", line = 402)
    public static void method237(int arg0) {
        int var1 = 76 / (-arg0 / 61);
        field918 = null;
        field939 = null;
        field943 = null;
        field926 = null;
        field945 = null;
        field940 = null;
        field942 = null;
        field935 = null;
        field937 = null;
        field944 = null;
        field934 = null;
        field936 = null;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIIIZLaa;)V", line = 429)
    public class38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class1 arg9) {
        this.field923 = arg6;
        this.field929 = arg4;
        this.field924 = arg0;
        this.field930 = arg5;
        this.field925 = arg3;
        this.field921 = arg1;
        this.field920 = arg2;
        if (arg7 != -1) {
            this.field917 = class22.method126((byte) -127, arg7);
            this.field927 = class10.field242 - 1;
            this.field919 = 0;
            if (this.field917.field1159 == 0 && arg9 != null && arg9 instanceof class38) {
                class38 var11 = (class38) arg9;
                if (this.field917 == var11.field917) {
                    this.field919 = var11.field919;
                    this.field927 = var11.field927;
                    return;
                }
            }
            if (arg8 && this.field917.field1142 != -1) {
                this.field919 = (int) ((double) this.field917.field1155.length * Math.random());
                this.field927 -= (int) ((double) this.field917.field1123[this.field919] * Math.random());
                return;
            }
        }
    }
}
