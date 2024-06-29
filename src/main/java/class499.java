import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class499 extends class567 {

    @OriginalMember(owner = "client!pm", name = "I", descriptor = "B")
    public byte field6932;

    @OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
    public int field6927;

    @OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!pm", name = "G", descriptor = "Los;")
    public class374 field6930;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)I")
    public final int method245(boolean arg0) {
        ++field6931;
        if (this.field6930 == null) {
            return 0;
        } else {
            return arg0 ? 14 : this.field6930.field4966 * 100 / (this.field6930.field4929.length + -this.field6932);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZZI)V")
    public static final void method2883(boolean arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg0) {
                class210.field2560 = class206.method1152(class41.field331, 0, (byte) 50, class516.field7285, class491.field6848, 0);
                class210.field2560.method1156(0);
                class216 var3 = class530.method3021(false, 0, class99.field1236, class593.field8621);
                class90 var4 = class210.field2560.method1153(var3, class3.method14(class39.field299, class99.field1236, 0), true);
                class164.method893(class326.field4163.method987(class31.field247, 22), true, var4, 19206);
                class210.field2560.method1123();
                class416.method2373(0);
                class210.field2560.method1103((byte) 94);
            }
            try {
                class210.field2560 = class206.method1152(class41.field331, class565.field8299.field2170 * 2, (byte) 50, class516.field7285, class491.field6848, arg2);
                if (class210.field2560.method1141()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class64 var6;
                    if (var5) {
                        var6 = class210.field2560.method1191(146800640);
                    } else {
                        var6 = class210.field2560.method1191(104857600);
                    }
                    class210.field2560.method1176(var6);
                }
            } catch (Throwable var8) {
                arg2 = 0;
                class210.field2560 = class206.method1152(class41.field331, 0, (byte) 50, class516.field7285, class491.field6848, 0);
            }
        } else {
            class210.field2560 = class206.method1152(class41.field331, class565.field8299.field2170 * 2, (byte) 50, class516.field7285, class491.field6848, 0);
        }
        ++field6928;
        class529.field7429 = arg2;
        class632.method3633(-256);
        if (!class210.field2560.method1105()) {
            class230.field2854 = 1;
        }
        class210.field2560.method272(class230.field2854);
        class210.field2560.method278(0);
        class210.field2560.method1121(8);
        class138.field1681 = class210.field2560.method1150();
        class272.field3527 = class210.field2560.method1150();
        class589.method3416(697608907);
        class210.field2560.method1116(!class565.field8299.field2193);
        if (class210.field2560.method1174()) {
            class367.method2059(class565.field8299.field2169, (byte) 15);
        }
        class426.method2401(class422.field5452 >> 3, class210.field2560, class106.field1289 >> 3, 26879);
        class316.method1751(-46);
        class74.field865 = arg1;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)[B")
    public final byte[] method244(int arg0) {
        ++field6929;
        if (arg0 < 119) {
            this.method244(13);
        }
        if (!super.field8322 && ~(this.field6930.field4929.length + -this.field6932) >= ~this.field6930.field4966) {
            return this.field6930.field4929;
        } else {
            throw new RuntimeException();
        }
    }
}
