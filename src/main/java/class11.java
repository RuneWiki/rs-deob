import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class11 extends class424 {

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field119 = -1;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "[I")
    public static int[] field121 = new int[16];

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Lnj;")
    public class415 field116;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Lcda;")
    public class534 field114;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 4)
    public final void method56(byte arg0) {
        field118++;
        if (class322.field4178 < class274.field3604.length) {
            class274.field3604[class322.field4178++] = this;
            if (arg0 <= 45) {
                method59((byte) -113);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)I", line = 19)
    public static final int method57(byte arg0) {
        field122++;
        int var1 = 50 / ((arg0 - 36) / 55);
        if ((double) class706.field9836 == 3.0D) {
            return 37;
        } else if ((double) class706.field9836 == 4.0D) {
            return 50;
        } else if ((double) class706.field9836 == 6.0D) {
            return 75;
        } else if ((double) class706.field9836 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 45)
    public static final void method58(int arg0, int arg1) {
        field115++;
        class646.method3557((byte) 76, arg0, class604.field8136.method3280((byte) -101, class144.field1890));
        if (arg1 >= -78) {
            field117 = 16;
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V", line = 62)
    public static void method59(byte arg0) {
        field121 = null;
        if (arg0 > -10) {
            method59((byte) 112);
        }
    }
}
