import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class41 {

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "[I")
    public int[] field36 = new int[5];

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "[Lfd;")
    public class40[] field34 = new class40[5];

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public int field54 = 0;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "Lic;")
    public static class59 field45 = new class59(new byte[5000]);

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "Lu;")
    public static class135 field57 = class87.method676((byte) -124, "rot:");

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "Lu;")
    private static class135 field56 = class87.method676((byte) -120, "M");

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
    public static int field63 = 5063219;

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "Lu;")
    public static class135 field66 = field56;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "[I")
    public static int[] field58 = new int[128];

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "Lu;")
    private static class135 field64 = class87.method676((byte) -105, "Examine");

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "Lu;")
    private static class135 field69 = class87.method676((byte) -92, "Click to continue");

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "Lu;")
    public static class135 field59 = field69;

    @OriginalMember(owner = "client!aa", name = "lb", descriptor = "Lu;")
    public static class135 field70 = class87.method676((byte) -61, "Einloggen");

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "Lu;")
    public static class135 field67 = field64;

    @OriginalMember(owner = "client!aa", name = "nb", descriptor = "Lu;")
    public static class135 field72 = class87.method676((byte) -52, ": ");

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "Lu;")
    public static class135 field68 = class87.method676((byte) -77, ":duelreq:");

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public int field41;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public int field52;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "Lpb;")
    public class106 field42;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "Ltc;")
    public class132 field47;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lve;")
    public static class146 field60;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "Lwd;")
    public class151 field48;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "Laa;")
    public class2 field46;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "Lea;")
    public class30 field49;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "Lab;")
    public class3 field33;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "Lme;")
    public class88 field53;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "Z")
    public boolean field35;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "Z")
    public boolean field38;

    @OriginalMember(owner = "client!aa", name = "mb", descriptor = "Z")
    public boolean field71;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "[Lae;")
    public static class6[] field61;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lff;")
    public static final class42 method8(int arg0, int arg1) {
        class42 var2 = (class42) class90.field2106.method239(9325, (long) arg1);
        field31++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class98.field2377.method324(0, arg1, 3);
        class42 var4 = new class42();
        int var5 = -24 / ((arg0 - 49) / 58);
        if (var3 != null) {
            var4.method313(new class59(var3), true);
        }
        class90.field2106.method241(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Lrb;")
    public static final class119 method9(boolean arg0, int arg1) {
        field32++;
        class119 var2 = (class119) class103.field2493.method239(9325, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method8(125, 118);
        }
        byte[] var3 = class131.field3134.method324(0, arg1, 6);
        class119 var4 = new class119();
        var4.field2873 = arg1;
        if (var3 != null) {
            var4.method950(-1, new class59(var3));
        }
        var4.method948(0);
        if (var4.field2892) {
            var4.field2834 = 0;
            var4.field2862 = false;
        }
        class103.field2493.method241(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)V")
    public static final void method10(int arg0, int arg1) {
        field30++;
        if (arg0 == -3) {
            class60.method502((byte) 116, class79.field1880, class14.field328, class78.field1836);
        } else if (arg0 == -2) {
            class60.method502((byte) 116, class65.field1622, class14.field342, class14.field317);
        } else if (arg0 == -1) {
            class60.method502((byte) 116, class79.field1872, class14.field311, class126.field3006);
        } else if (arg0 == 3) {
            class60.method502((byte) 116, class80.field1894, class14.field332, class14.field301);
        } else if (arg0 == 4) {
            class60.method502((byte) 116, class49.field1157, class14.field339, class83.field1972);
        } else if (arg0 == 5) {
            class60.method502((byte) 116, class132.field3195, class14.field330, class12.field273);
        } else if (arg0 == 6) {
            class60.method502((byte) 116, class35.field810, class14.field326, class43.field1053);
        } else if (arg0 == 7) {
            class60.method502((byte) 116, class25.field587, class14.field341, class25.field608);
        } else if (arg0 == 8) {
            class60.method502((byte) 116, class68.field1673, class14.field305, class49.field1170);
        } else if (arg0 == 9) {
            class60.method502((byte) 116, class63.field1569, class14.field337, class40.field921);
        } else if (arg0 == 10) {
            class60.method502((byte) 116, class23.field570, class14.field338, class49.field1171);
        } else if (arg0 == 11) {
            class60.method502((byte) 116, class68.field1678, class14.field313, class42.field983);
        } else if (arg0 == 12) {
            class60.method502((byte) 116, class148.field3685, class14.field333, class145.field3543);
        } else if (arg0 == 13) {
            class60.method502((byte) 116, class79.field1889, class14.field350, class77.field1827);
        } else if (arg0 == 14) {
            class60.method502((byte) 116, class35.field821, class14.field310, class47.field1115);
        } else if (arg0 == 16) {
            class60.method502((byte) 116, class38.field856, class14.field315, class80.field1910);
        } else if (arg0 == 17) {
            class60.method502((byte) 116, class133.field3205, class14.field312, class122.field2932);
        } else if (arg0 == 18) {
            class60.method502((byte) 116, class136.field3288, class14.field319, class25.field616);
        } else if (arg0 == 19) {
            class60.method502((byte) 116, class152.field3756, class25.field598, class130.field3121);
        } else if (arg0 == 20) {
            class60.method502((byte) 116, class79.field1883, class14.field307, class83.field1968);
        } else if (arg0 == 22) {
            class60.method502((byte) 116, class126.field2999, class14.field299, class102.field2460);
        } else if (arg0 == 23) {
            class60.method502((byte) 116, class35.field804, class14.field324, class138.field3353);
        } else if (arg0 == 24) {
            class60.method502((byte) 116, class97.field2350, class14.field348, class44.field1076);
        } else if (arg0 == 25) {
            class60.method502((byte) 116, class79.field1874, class14.field306, class69.field1705);
        } else if (arg0 == 26) {
            class60.method502((byte) 116, class94.field2286, class14.field308, class83.field1966);
        } else if (arg0 == 27) {
            class60.method502((byte) 116, class65.field1647, class14.field320, class14.field344);
        } else {
            class60.method502((byte) 116, class79.field1870, class14.field303, class15.field356);
        }
        if (arg1 != 18847) {
            method10(68, 14);
        }
        class125.method978(10, 1);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
    public static void method11(byte arg0) {
        field66 = null;
        field69 = null;
        field58 = null;
        field59 = null;
        field56 = null;
        if (arg0 != 9) {
            method11((byte) 30);
        }
        field45 = null;
        field72 = null;
        field60 = null;
        field70 = null;
        field57 = null;
        field68 = null;
        field64 = null;
        field61 = null;
        field67 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B[BI)I")
    public static final int method12(byte arg0, byte[] arg1, int arg2) {
        if (arg0 != -19) {
            method11((byte) -63);
        }
        field29++;
        return class93.method755(arg0 - 66, arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
    public class2(int arg0, int arg1, int arg2) {
        this.field51 = arg1;
        this.field37 = arg2;
        this.field44 = this.field50 = arg0;
    }
}
