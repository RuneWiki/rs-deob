import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class26 {

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    private int field346 = 0;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    private int field338 = -1;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lkl;")
    private class64 field337 = new class64();

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Z")
    public boolean field354 = false;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "[Lk;")
    private class17[] field333;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[[I")
    private int[][] field342;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field336 = 0;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Ltl;")
    public static class59 field335 = class85.method639("Untersuchen", 9588);

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field343 = -1;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Ltl;")
    public static class59 field339 = class85.method639("Zugewiesener Speicher)3", 9588);

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "Z")
    public static boolean field351 = false;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static volatile int field344 = 0;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "[Loj;")
    public static class260[] field353;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)[I", line = 16)
    public final int[] method165(int arg0, byte arg1) {
        field348++;
        if (arg1 != -11) {
            method167(-71, (class102) null, false, -80);
        }
        if (this.field352 == this.field340) {
            this.field354 = this.field333[arg0] == null;
            this.field333[arg0] = class73.field1146;
            return this.field342[arg0];
        } else if (this.field352 == 1) {
            this.field354 = this.field338 != arg0;
            this.field338 = arg0;
            return this.field342[0];
        } else {
            class17 var3 = this.field333[arg0];
            if (var3 == null) {
                this.field354 = true;
                if (this.field352 <= this.field346) {
                    class17 var4 = (class17) this.field337.method529(false);
                    var3 = new class17(arg0, var4.field219);
                    this.field333[var4.field220] = null;
                    var4.method2000(123);
                } else {
                    var3 = new class17(arg0, this.field346);
                    this.field346++;
                }
                this.field333[arg0] = var3;
            } else {
                this.field354 = false;
            }
            this.field337.method534(var3, false);
            return this.field342[var3.field219];
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 97)
    public final void method166(int arg0) {
        for (int var2 = 0; var2 < this.field352; var2++) {
            this.field342[var2] = null;
        }
        this.field342 = (int[][]) null;
        this.field333 = null;
        if (arg0 != -20016) {
            this.method165(-38, (byte) 39);
        }
        this.field337.method530(-15068);
        this.field337 = null;
        field347++;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(III)V", line = 530)
    public class26(int arg0, int arg1, int arg2) {
        this.field352 = arg0;
        this.field340 = arg1;
        this.field333 = new class17[this.field340];
        this.field342 = new int[this.field352][arg2];
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILch;ZI)V", line = 142)
    public static final void method167(int arg0, class102 arg1, boolean arg2, int arg3) {
        if ((arg0 & 0x80) != 0) {
            arg1.field1772 = class18.field236.method1234(-128);
            if (arg1.field1772 == 65535) {
                arg1.field1772 = -1;
            }
        }
        if ((arg0 & 0x200) != 0) {
            arg1.field1722 = class18.field236.method1246(-8);
            arg1.field1757 = class18.field236.method1221(85);
            arg1.field1748 = class18.field236.method1221(72);
            arg1.field1768 = class18.field236.method1221(83);
            arg1.field1780 = class18.field236.method1214(-18254) + class30.field420;
            arg1.field1770 = class18.field236.method1226(23760) + class30.field420;
            arg1.field1764 = class18.field236.method1221(85);
            arg1.field1790 = 1;
            arg1.field1779 = 0;
        }
        if ((arg0 & 0x40) != 0) {
            int var4 = class18.field236.method1214(-18254);
            int var5 = class18.field236.method1248(83);
            int var6 = class18.field236.method1246(-8);
            int var7 = class18.field236.field2787;
            boolean var8 = (var4 & 0x8000) != 0;
            if (arg1.field1663 != null && arg1.field1685 != null) {
                long var9 = arg1.field1663.method488((byte) 106);
                boolean var11 = false;
                if (var5 <= 1) {
                    if (!var8 && class27.field356 == 1 || class143.field2365 == 1) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; var12 < class156.field2548; var12++) {
                            if (class305.field5166[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class255.field4239 == 0) {
                    int var13 = -1;
                    class20.field264.field2787 = 0;
                    class18.field236.method1204(class20.field264.field2758, 0, true, var6);
                    class20.field264.field2787 = 0;
                    class59 var15;
                    if (var8) {
                        var4 &= 0x7FFF;
                        class248 var14 = class171.method1259((byte) 48, class20.field264);
                        var13 = var14.field4133;
                        var15 = var14.field4132.method110(-5377, class20.field264);
                    } else {
                        var15 = class95.method708(class45.method321(class20.field264, -4032).method482(-27509));
                    }
                    arg1.field1762 = var15.method452(255);
                    arg1.field1728 = var4 >> 8;
                    arg1.field1724 = var4 & 0xFF;
                    arg1.field1784 = 150;
                    if (var5 == 2) {
                        class200.method1439(var15, class233.method1630(new class59[] { class303.field5164, arg1.method771(569) }, -2883), var13, (class59) null, 27, var8 ? 17 : 1);
                    } else if (var5 == 1) {
                        class200.method1439(var15, class233.method1630(new class59[] { class58.field847, arg1.method771(569) }, -2883), var13, (class59) null, 92, var8 ? 17 : 1);
                    } else {
                        class200.method1439(var15, arg1.method771(569), var13, (class59) null, 82, var8 ? 17 : 2);
                    }
                }
            }
            class18.field236.field2787 = var6 + var7;
        }
        field341++;
        if (arg2) {
            return;
        }
        if ((arg0 & 0x2) != 0) {
            int var16 = class18.field236.method1248(66);
            byte[] var17 = new byte[var16];
            class170 var18 = new class170(var17);
            class18.field236.method1204(var17, 0, true, var16);
            class299.field5119[arg3] = var18;
            arg1.method775(var18, 653112528);
        }
        if ((arg0 & 0x100) != 0) {
            int var19 = class18.field236.method1221(108);
            int var20 = class18.field236.method1223((byte) -128);
            arg1.method796(var20, arg2, class30.field420, var19);
        }
        if ((arg0 & 0x20) != 0) {
            int var21 = class18.field236.method1226(23760);
            int var22 = class18.field236.method1246(-8);
            if (var21 == 65535) {
                var21 = -1;
            }
            class137.method998(var22, arg1, (byte) 107, var21);
        }
        if ((arg0 & 0x8) != 0) {
            int var23 = class18.field236.method1248(96);
            int var24 = class18.field236.method1223((byte) -120);
            arg1.method796(var24, arg2, class30.field420, var23);
            arg1.field1727 = class30.field420 + 300;
            arg1.field1735 = class18.field236.method1246(-8);
        }
        if ((arg0 & 0x1) != 0) {
            arg1.field1742 = class18.field236.method1214(-18254);
            arg1.field1743 = class18.field236.method1254(-54);
        }
        if ((arg0 & 0x10) != 0) {
            arg1.field1762 = class18.field236.method1250(false);
            if (arg1.field1762.method492(0, -114) == 126) {
                arg1.field1762 = arg1.field1762.method497(1, (byte) 60);
                class288.method2003(arg1.method771(569), 2, -122, arg1.field1762);
            } else if (class286.field4920 == arg1) {
                class288.method2003(arg1.method771(569), 2, 19, arg1.field1762);
            }
            arg1.field1724 = 0;
            arg1.field1728 = 0;
            arg1.field1784 = 150;
        }
        if ((arg0 & 0x400) == 0) {
            return;
        }
        arg1.field1749 = class18.field236.method1234(-128);
        int var25 = class18.field236.method1233((byte) -77);
        if (arg1.field1749 == 65535) {
            arg1.field1749 = -1;
        }
        arg1.field1792 = 0;
        arg1.field1760 = 0;
        arg1.field1744 = (var25 & 0xFFFF) + class30.field420;
        arg1.field1730 = var25 >> 16;
        if (arg1.field1744 > class30.field420) {
            arg1.field1792 = -1;
        }
        if (arg1.field1749 == -1 || class30.field420 != arg1.field1744) {
            return;
        }
        int var26 = class221.method1533(arg1.field1749, (byte) -44).field5250;
        if (var26 != -1) {
            class129 var27 = class265.method1834((byte) -39, var26);
            if (var27 != null && var27.field2118 != null) {
                class29.method182(1048575, class286.field4920 == arg1, arg1.field1774, var27, 0, arg1.field1769);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I", line = 376)
    public static final int method168(int arg0, int arg1) {
        field334++;
        if (class21.field284 != null) {
            class21.field284.method1257(1185568552);
            class21.field284 = null;
        }
        class90.field1403++;
        if (class90.field1403 > 4) {
            class90.field1403 = 0;
            class248.field4124 = 0;
            return arg0;
        }
        if (class99.field1594 == class14.field201) {
            class14.field201 = class296.field5079;
        } else {
            class14.field201 = class99.field1594;
        }
        class248.field4124 = arg1;
        return -1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZLme;I)Lgg;", line = 415)
    public static final class47 method169(int arg0, boolean arg1, class295 arg2, int arg3) {
        field350++;
        if (arg1) {
            return class33.method222(6, arg0, arg3, arg2) ? class86.method647(-26) : null;
        } else {
            return (class47) null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 429)
    public static final void method170(int arg0) {
        class21.field282 = 0;
        field345++;
        class255.field4242 = 0;
        class138.method1003(107);
        class300.method2097((byte) 110);
        class314.method2166(-1);
        for (int var1 = 0; var1 < class21.field282; var1++) {
            int var2 = class38.field583[var1];
            if (class30.field420 != class23.field311[var2].field1761) {
                if (class23.field311[var2].field314.method889(5)) {
                    class300.method2098(class23.field311[var2], (byte) 46);
                }
                class23.field311[var2].field314 = null;
                class23.field311[var2] = null;
            }
        }
        if (class146.field2387 != class18.field236.field2787) {
            throw new RuntimeException("gnp1 pos:" + class18.field236.field2787 + " psize:" + class146.field2387);
        }
        for (int var3 = 0; var3 < class185.field3107; var3++) {
            if (class23.field311[class232.field3816[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class185.field3107);
            }
        }
        if (arg0 >= -4) {
            field353 = (class260[]) null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 481)
    public static void method171(byte arg0) {
        if (arg0 != -60) {
            method170(-32);
        }
        field339 = null;
        field335 = null;
        field353 = null;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)[[I", line = 508)
    public final int[][] method172(int arg0) {
        field349++;
        if (this.field352 != this.field340) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field352; var2++) {
            this.field333[var2] = class73.field1146;
        }
        if (arg0 != -4532) {
            method167(76, (class102) null, true, 94);
        }
        return this.field342;
    }
}
