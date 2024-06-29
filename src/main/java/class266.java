import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class266 extends class32 {

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field4711 = 0;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "Lc;")
    public static class105 field4717 = new class105(64);

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field4720 = 0;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public int field4709;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public int field4713;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public int field4718;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "Lqk;")
    public class207 field4707;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "Lpk;")
    public static class99 field4712;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "[I")
    public int[] field4706;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "[I")
    public int[] field4710;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "[Lqk;")
    public class207[] field4716;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "[Ldk;")
    public class275[] field4708;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "[[[B")
    public static byte[][][] field4719;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BII)V")
    public static final void method1826(byte arg0, int arg1, int arg2) {
        field4715++;
        if (arg0 < 66) {
            method1827(-12, -13, 7, 36, false);
        }
        class90 var3 = class221.method1575(7, arg2, 1651481952);
        var3.method648((byte) -59);
        var3.field1621 = arg1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1827(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class225.field4104 = arg1;
        class279.field4908 = arg2;
        class93.field1643 = arg3;
        class173.field3087 = new class174[arg0][class225.field4104][class279.field4908];
        class3.field47 = new int[arg0][class225.field4104 + 1][class279.field4908 + 1];
        if (arg4) {
            class270.field4782 = new class174[1][class225.field4104][class279.field4908];
            class175.field3174 = new int[class225.field4104][class279.field4908];
            class252.field4536 = new int[1][class225.field4104 + 1][class279.field4908 + 1];
        } else {
            class270.field4782 = null;
            class175.field3174 = null;
            class252.field4536 = null;
        }
        class20.method115(false);
        class92.field1639 = new class115[500];
        class170.field3016 = 0;
        class79.field1442 = new class115[500];
        class151.field2643 = 0;
        class204.field3598 = new int[arg0][class225.field4104 + 1][class279.field4908 + 1];
        class18.field270 = new class288[5000];
        class90.field1617 = 0;
        class48.field947 = new class288[100];
        class217.field3853 = new boolean[class93.field1643 + class93.field1643 + 1][class93.field1643 + class93.field1643 + 1];
        class118.field2045 = new boolean[class93.field1643 + class93.field1643 + 2][class93.field1643 + class93.field1643 + 2];
        class147.field2515 = new byte[arg0][class225.field4104][class279.field4908];
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
    public static void method1828(int arg0) {
        if (arg0 == -22224) {
            field4712 = null;
            field4719 = null;
            field4717 = null;
        }
    }
}
