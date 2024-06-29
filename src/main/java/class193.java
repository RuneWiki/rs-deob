import java.awt.Color;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class193 extends class111 {

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!su", name = "r", descriptor = "I")
    private int field2739;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    private int field2731;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    private int field2730;

    @OriginalMember(owner = "client!su", name = "t", descriptor = "I")
    private int field2741;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    private int field2736;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    private int field2735;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field2733 = new String[8];

    @OriginalMember(owner = "client!su", name = "u", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2742 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!su", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2743 = new BigInteger("87e6d8cb820fa0f2ae622a9c17863357375d575282d1da4ada3259110e76474395522eccc5c93c403e72f2bd0f93c0cfd259c42b21de91947e4153bb51bb710e9780e6945b0ad9bbb44930733bf6aa34ec7451ca5773492e6ea04508d398275c9796a60f67af61eb2dc1d1d83c0b6fd876de853b61b3718a28db715d6be94a14b49b46b45664ef4aed5a8870694c8eb1c827fe0d950bf984aa4fc04343930739a0bc84b35d99be11c19ac5fa7148f9749869347af09b037417432044cf23f602b33b68fd55983ab5561937ac28e7cb794ce0f203509a589899f5b5661779fa3d2454ad34194c88650fd6ee062cbe8b4003427fccba1205e6f2565c226cc0577e9c2a0d764d08b1dfa60934fabb9ada8917411482bbc0835ca73479ad1eee1adfd09c8404b59ce801406f15e14f28865b31a5df625acbe03ced3a951d501d16fe225d7127ca2bf2be2d2270f98a34d3e3d023836353548a62e136ba34d07eafaea7b77f1327773f0af2ab34286afbecbdd83a96951af9979b0868fed55e5465843fae77ea0ad7b11a2a139a4204c36ef5d21fd72026533c31b98a697b52dfa9234b1073c91652bf24156e397e03269c306746c324d71a5e1b2bd560f279cf2dee27e09ab63980c8ea310d73fe869460a3f60363714118dd5aa66d6a38191e0fe131ae1a3a88738414375651da34cdda0b5602a1a6426afc6dacb88efe3ccd721f", 16);

    @OriginalMember(owner = "client!su", name = "w", descriptor = "Lem;")
    public static class206 field2744 = new class206(74, 8);

    @OriginalMember(owner = "client!su", name = "x", descriptor = "Lch;")
    public static class428 field2745 = new class428(1);

    @OriginalMember(owner = "client!su", name = "y", descriptor = "Llga;")
    public static class663 field2746 = new class663(20);

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V", line = 5)
    public static void method1294(int arg0) {
        field2743 = null;
        field2733 = null;
        field2745 = null;
        if (arg0 != 24243) {
            field2733 = null;
        }
        field2746 = null;
        field2744 = null;
        field2742 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IBI)V", line = 23)
    public final void method807(int arg0, byte arg1, int arg2) {
        if (arg1 != -21) {
            this.method807(125, (byte) 31, 22);
        }
        ++field2740;
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(III)V", line = 34)
    public final void method806(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            ++field2732;
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 51)
    public class193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2734 = arg0;
        this.field2739 = arg2;
        this.field2731 = arg6;
        this.field2730 = arg3;
        this.field2741 = arg4;
        this.field2736 = arg5;
        this.field2737 = arg7;
        this.field2735 = arg1;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(III)V", line = 77)
    public final void method804(int arg0, int arg1, int arg2) {
        ++field2738;
        int var4 = this.field2734 * arg0 >> 12;
        int var5 = this.field2735 * arg1 >> 12;
        int var6 = this.field2739 * arg0 >> 12;
        int var7 = this.field2730 * arg1 >> 12;
        int var8 = this.field2741 * arg0 >> 12;
        int var9 = this.field2736 * arg1 >> 12;
        if (arg2 >= 84) {
            int var10 = this.field2731 * arg0 >> 12;
            int var11 = this.field2737 * arg1 >> 12;
            class171.method1207(var11, var5, var4, super.field1538, (byte) -29, var9, var10, var8, var6, var7);
        }
    }
}
