import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class569 {

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public int field8086;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public int field8087;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
    public int field8089;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(II)V", line = 7)
    public static final void method3262(int arg0, int arg1) {
        class255.field3490 = arg1;
        class266.field3598 = arg0;
        field8085++;
        class14.field152 = -1;
        class560.method3127((byte) 123);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 18)
    public static final void method3263(String arg0, int arg1, int arg2) {
        class585.method3331((byte) -15);
        field8088++;
        class523.method2980(64);
        class55.method417(true);
        class109.method789(arg2, arg0, 0);
        class64.method547((byte) -1);
        class24.method237(class334.field4506, 10);
        class574.method3276((byte) 20, class334.field4506);
        class375.method2156(class334.field4506, class508.field6961, 0);
        class187.method1286(-2);
        class623.method3462(class382.field5248, arg1 ^ 0xFFFFB7DF);
        class314.method1905(-101);
        class628.method3511((byte) -108);
        if (class285.field3921 == 3) {
            class178.method1232(4, (byte) -76);
        } else if (class285.field3921 == 7) {
            class178.method1232(8, (byte) 93);
        } else if (class285.field3921 == 10) {
            class178.method1232(11, (byte) 120);
        } else if (class285.field3921 == 1 || class285.field3921 == 2) {
            class329.method1957(arg1 - 4);
        }
        if (arg1 == 4) {
            ;
        }
    }
}
