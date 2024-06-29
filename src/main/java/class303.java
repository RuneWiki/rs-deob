import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class303 {

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public int field4247;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public int field4249;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public int field4245;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public int field4243;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "Ltw;")
    public static class233 field4244 = new class233();

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field4250 = 0;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!dc", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field4246++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 13)
    public static void method1855(int arg0) {
        int var1 = -17 % ((arg0 - 54) / 54);
        field4244 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLr;)V", line = 27)
    public static final void method1856(byte arg0, class98 arg1) {
        class314.field4361 = new class173[class634.field8978.length];
        field4248++;
        if (arg0 < 88) {
            field4250 = -27;
        }
        for (int var2 = 0; var2 < class634.field8978.length; var2++) {
            int var3 = class634.field8978[var2];
            class490 var4 = class61.method514(class662.field9306, var3, -1);
            class395 var5 = arg1.method804(var4, class628.method3538(class609.field8758, var3), true);
            class314.field4361[var2] = new class173(var5, var4);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 62)
    public static final void method1857(byte arg0) {
        class344.field4826.method648(arg0 ^ 0xFFFFFF9C);
        field4251++;
        class621.field8844.method1869((byte) 117);
        class235.field3484.method3027(-93);
        class14.field224.method2836(false);
        class564.field8259.method3746((byte) 60);
        class430.field6132.method50(-2);
        class480.field6871.method1415((byte) -74);
        class554.field8108.method593(14002);
        class56.field781.method3290(83);
        class545.field8005.method2894(true);
        class625.field8919.method976(-7944);
        class624.field8902.method1501((byte) -105);
        class304.field4255.method2841((byte) -64);
        class659.field9287.method2879(53);
        class237.field3504.method1552(-26061);
        class104.field1715.method3260(true);
        class111.field1777.method502((byte) 73);
        class27.field385.method568((byte) -101);
        class329.field4559.method2242(arg0 ^ 0x1C);
        class667.field9380.method3176((byte) -126);
        class568.method3318(19950);
        class248.method1594((byte) 45);
        class227.method1494((byte) -111);
        class622.method3508(1);
        class152.method1155(-7921);
        class43.field583.method950((byte) -122);
        class696.field9884.method950((byte) -3);
        class477.field6838.method950((byte) 122);
        if (arg0 == -30) {
            class527.field7721.method950((byte) 36);
            class362.field5042.method950((byte) 85);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIII)V", line = 102)
    public class303(int arg0, int arg1, int arg2, int arg3) {
        this.field4247 = arg0;
        this.field4249 = arg3;
        this.field4245 = arg1;
        this.field4243 = arg2;
    }
}
