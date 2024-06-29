import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class428 extends class7 {

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "Luv;")
    public static class3 field5833 = new class3(83, 8);

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "Lvt;")
    public static class344 field5841 = new class344("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "I")
    public static int field5845 = -1;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    public int field5840;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
    public int field5843;

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
    public int field5844;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "J")
    public long field5836;

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "[Lha;")
    public static class116[] field5842;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)I")
    public final int method29(byte arg0) {
        if (arg0 >= -61) {
            method2507(-107);
        }
        field5837++;
        return this.field5840;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)I")
    public final int method30(byte arg0) {
        int var2 = 19 / ((arg0 + 8) / 40);
        field5835++;
        return 0;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)I")
    public final int method32(int arg0) {
        if (arg0 == 32679) {
            field5832++;
            return this.field5843;
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBLjq;I)V")
    public static final void method2506(int arg0, byte arg1, class447 arg2, int arg3) {
        if (arg2.field6243 == 0) {
            arg2.field6335 = arg2.field6236;
        } else if (arg2.field6243 == 1) {
            arg2.field6335 = (arg3 - arg2.field6330) / 2 + arg2.field6236;
        } else if (arg2.field6243 == 2) {
            arg2.field6335 = arg3 - arg2.field6330 - arg2.field6236;
        } else if (arg2.field6243 == 3) {
            arg2.field6335 = arg2.field6236 * arg3 >> 14;
        } else if (arg2.field6243 == 4) {
            arg2.field6335 = (arg3 - arg2.field6330) / 2 + (arg2.field6236 * arg3 >> 14);
        } else {
            arg2.field6335 = arg3 - (arg2.field6236 * arg3 >> 14) - arg2.field6330;
        }
        if (arg2.field6307 == 0) {
            arg2.field6270 = arg2.field6276;
        } else if (arg2.field6307 == 1) {
            arg2.field6270 = (arg0 - arg2.field6218) / 2 + arg2.field6276;
        } else if (arg2.field6307 == 2) {
            arg2.field6270 = arg0 - arg2.field6276 - arg2.field6218;
        } else if (arg2.field6307 == 3) {
            arg2.field6270 = arg2.field6276 * arg0 >> 14;
        } else if (arg2.field6307 == 4) {
            arg2.field6270 = (arg0 - arg2.field6218) / 2 + (arg2.field6276 * arg0 >> 14);
        } else {
            arg2.field6270 = arg0 - (arg2.field6276 * arg0 >> 14) - arg2.field6218;
        }
        field5831++;
        if (class427.field5824 && (client.method3572(arg2).field6885 != 0 || arg2.field6336 == 0)) {
            if (arg2.field6335 < 0) {
                arg2.field6335 = 0;
            } else if ((arg2.field6335 + arg2.field6330) > arg3) {
                arg2.field6335 = arg3 - arg2.field6330;
            }
            if (arg2.field6270 < 0) {
                arg2.field6270 = 0;
            } else if (arg0 < (arg2.field6270 + arg2.field6218)) {
                arg2.field6270 = arg0 - arg2.field6218;
            }
        }
        if (arg1 != 93) {
            method2506(81, (byte) -94, null, -12);
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)J")
    public final long method31(int arg0) {
        field5838++;
        if (arg0 != 0) {
            field5845 = -64;
        }
        return this.field5836;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)I")
    public final int method27(int arg0) {
        if (arg0 == 2) {
            field5839++;
            return this.field5844;
        } else {
            return -98;
        }
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "(I)V")
    public static void method2507(int arg0) {
        field5841 = null;
        field5833 = null;
        if (arg0 < 81) {
            field5833 = null;
        }
        field5842 = null;
    }
}
