import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class59 {

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field837 = -2;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lcc;")
    public static class216 field832 = new class216(64);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "[[[B")
    public static byte[][][] field830;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method423(int arg0) {
        class49.field709++;
        class220.field3532.method557(arg0, 8);
        class220.field3532.method1074(class243.method1724(88), arg0 - 4);
        field835++;
        class220.field3532.method1094(-700861976, class23.field265);
        class220.field3532.method1094(-700861976, class154.field2543);
        class220.field3532.method1074(class198.field3201, arg0 ^ 0x37);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static void method424(int arg0) {
        if (arg0 > -35) {
            method424(-28);
        }
        field832 = null;
        field830 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
    public static final void method425(int arg0, int arg1) {
        class145.field2379 = 1;
        if (arg0 > -121) {
            return;
        }
        class141.field2280 = -1;
        class27.field312 = -1;
        class242.field3869 = false;
        class191.field3086 = arg1;
        class225.field3618 = null;
        field836++;
        class266.field4302 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
    public static final void method426(int arg0, int arg1) {
        field831++;
        if (arg0 >= -72) {
            field837 = -88;
        }
        class201 var2 = class94.method738(-97, arg1, 3);
        var2.method1475(-743577184);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)I")
    public static final int method427(int arg0) {
        field834++;
        if (arg0 > -123) {
            field837 = 81;
        }
        return class57.field812.method1557((byte) 97);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V")
    public static final void method428(byte arg0, int arg1) {
        field833++;
        if (arg1 == -1 || !class184.method1364(arg1, (byte) 74)) {
            return;
        }
        class131[] var2 = class113.field1631[arg1];
        if (arg0 != 12) {
            field837 = -120;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class131 var4 = var2[var3];
            if (var4.field2092 != null) {
                class294 var5 = new class294();
                var5.field4668 = var4;
                var5.field4664 = var4.field2092;
                class243.method1716(2000000, var5, -7);
            }
        }
    }
}
