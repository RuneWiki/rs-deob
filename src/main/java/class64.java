import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class64 extends class235 {

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public int field912 = 1;

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public static int field905 = -13423323;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "S")
    public static short field904 = 256;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "[I")
    public static int[] field910 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "C")
    public char field911;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
    public static final void method418(byte arg0, int arg1) {
        field907++;
        if (arg0 < 82) {
            method419(12, -82);
        }
        class127.field1690 = arg1;
        class367.field5457.method212(-123);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)I")
    public static final int method419(int arg0, int arg1) {
        field903++;
        if (arg0 != 15443) {
            method421(97);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILil;)V")
    private final void method420(int arg0, int arg1, class265 arg2) {
        field906++;
        if (arg1 != 1450045411) {
            field902 = 35;
        }
        if (arg0 == 1) {
            this.field911 = class24.method211(112, arg2.method1708((byte) 127));
        } else if (arg0 == 2) {
            this.field912 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    public static void method421(int arg0) {
        if (arg0 == -128) {
            field910 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(BI)V")
    public static final void method422(byte arg0, int arg1) {
        int var2 = -13 % ((arg0 + 16) / 34);
        field909++;
        int var3 = class50.field698 - class323.field4620;
        if (var3 >= 100) {
            class5.field48 = 1;
            return;
        }
        int var4 = (int) class155.field2027;
        if (var4 < class38.field613 >> 8) {
            var4 = class38.field613 >> 8;
        }
        if (class408.field6122[4] && (class395.field5936[4] + 128) > var4) {
            var4 = class395.field5936[4] + 128;
        }
        int var5 = (int) class170.field2244 + class383.field5733 & 0x3FFF;
        class272.method1740(0, class139.method935(class100.field1350.field5298, -106, class100.field1350.field5284, class193.field2688) - 50, (var4 >> 3) * 3 + 600, var4, var5, arg1, class370.field5511, field902);
        float var6 = 1.0F - ((float) ((100 - var3) * (100 - var3) * (100 - var3)) / 1000000.0F);
        class237.field3326 = (int) ((float) (class237.field3326 - class168.field2210) * var6 + (float) class168.field2210);
        class130.field1745 = (int) ((float) (class130.field1745 - class153.field1997) * var6 + (float) class153.field1997);
        class265.field3878 = (int) ((float) (class265.field3878 - class108.field1476) * var6 + (float) class108.field1476);
        class7.field71 = (int) ((float) (class7.field71 - class384.field5751) * var6 + (float) class384.field5751);
        int var7 = class179.field2364 - class244.field3405;
        if (var7 > 8192) {
            var7 -= 16384;
        } else if (var7 < -8192) {
            var7 += 16384;
        }
        class179.field2364 = (int) ((float) var7 * var6 + (float) class244.field3405);
        class179.field2364 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lil;I)V")
    public final void method423(class265 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1697(113);
            if (var3 == 0) {
                field908++;
                if (arg1 != -1) {
                    this.method423((class265) null, -19);
                    return;
                }
                return;
            }
            this.method420(var3, 1450045411, arg0);
        }
    }
}
