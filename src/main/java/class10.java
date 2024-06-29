import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class10 extends class240 {

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "[Lbl;")
    public static class312[] field160 = new class312[14];

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "[I")
    public static int[] field169 = new int[2];

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public int field168;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V", line = 4)
    public static final void method78(int arg0) {
        if (arg0 != 0) {
            field170 = -100;
        }
        field151++;
        for (class297 var1 = (class297) class221.field3547.method1490(200); var1 != null; var1 = (class297) class221.field3547.method1487((byte) 117)) {
            if (var1.field4690 == -1) {
                var1.field4684 = 0;
                class251.method1775((byte) -127, var1);
            } else {
                var1.method1701(-93);
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Ldi;", line = 29)
    public static final class152 method79(int arg0, int arg1) {
        field162++;
        class152 var2 = (class152) class82.field1234.method2017(1022, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 > arg0) {
            var3 = class120.field1930.method467(arg0, 101, 0);
        } else {
            var3 = class320.field4996.method467(arg0 & 0x7FFF, 97, 0);
        }
        class152 var4 = new class152();
        if (var3 != null) {
            var4.method1170(false, new class101(var3));
        }
        if (arg0 >= 32768) {
            var4.method1163(32768);
        }
        class82.field1234.method2018((long) arg0, var4, -87);
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILja;I)Lai;", line = 59)
    public static final class126 method80(int arg0, int arg1, class64 arg2, int arg3) {
        field153++;
        if (class150.method1152(arg2, arg0, 50, arg1)) {
            return arg3 < 70 ? (class126) null : class118.method874((byte) -127);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lpe;I)Lbf;", line = 83)
    public static final class329 method81(class101 arg0, int arg1) {
        field158++;
        return arg1 == 32767 ? new class329(arg0.method780(-17432), arg0.method780(arg1 ^ 0xFFFFC417), arg0.method780(-17432), arg0.method780(arg1 ^ 0xFFFFC417), arg0.method776(-1574267376), arg0.method776(arg1 - 1574300143), arg0.method741(43)) : (class329) null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 98)
    public static void method82(byte arg0) {
        if (arg0 != -89) {
            method81((class101) null, 0);
        }
        field160 = null;
        field169 = null;
    }
}
