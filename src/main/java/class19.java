import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class19 extends class116 {

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field264 = 0;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "Lda;")
    public static class275 field266 = null;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "[[I")
    public static int[][] field278 = new int[104][104];

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field275 = 0;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "[I")
    public static int[] field273 = new int[25];

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "Lda;")
    public static class275 field281 = class255.method1672(98, ")4j");

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "Lma;")
    public static class105 field277;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "Lda;")
    public class275 field271;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "[I")
    public int[] field270;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "[I")
    public int[] field272;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "[Lda;")
    public class275[] field265;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "[Loa;")
    public class276[] field279;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "[[I")
    public static int[][] field280;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public static void method96(int arg0) {
        field277 = null;
        if (arg0 != -1) {
            method99(15, 125, -48);
        }
        field281 = null;
        field266 = null;
        field278 = null;
        field273 = null;
        field280 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
    public static final void method97(int arg0, int arg1) {
        class34.field536.method988(arg1, -100);
        if (arg0 == 104) {
            class267.field4639.method988(arg1, -100);
            field276++;
            class92.field1558.method988(arg1, -82);
            class75.field1234.method988(arg1, -87);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)I")
    public static int method98(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
    public static final void method99(int arg0, int arg1, int arg2) {
        class69.field1111 = true;
        class170.field2964 = arg0;
        class86.field1442 = arg1;
        class87.field1469 = arg2;
        class30.field464 = -1;
        class193.field3321 = -1;
    }
}
