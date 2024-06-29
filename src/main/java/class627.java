import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class627 extends InputStream {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Ltd;")
    public static class691 field8525 = new class691();

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field8530 = 0;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!wf", name = "read", descriptor = "()I")
    public final int read() {
        class660.method3668(-1, 30000L);
        field8527++;
        return -1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method3422(int arg0) {
        field8525 = null;
        if (arg0 != -1) {
            method3422(-63);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static final void method3423(byte arg0) {
        if (class653.field9250 >= 0) {
            long var1 = class669.method3713(0);
            class653.field9250 = (int) ((long) class653.field9250 - (var1 - class257.field3571));
            if (class653.field9250 > 0) {
                int var3 = (class653.field9250 << 8) / class453.field6186;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class629.field8552 = ((class546.field7483 & 0xFF00FF) * var3 + (class388.field5603.field2722 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class546.field7483 & 0xFF00) * var3 + (class388.field5603.field2722 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                float var6 = 1.0F - var5;
                class494.field6685 = class240.field3149 * var3 + class388.field5603.field2734 * var4 >> 8;
                class38.field420 = (class388.field5603.field2727 - class356.field5172) * var6 + class356.field5172;
                class539.field7389 = ((class219.field2846 & 0xFF00) * var3 + ((class388.field5603.field2723 & 0xFF00) * var4) & 0xFF0000) + ((class219.field2846 & 0xFF00FF) * var3 + (class388.field5603.field2723 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class509.field6871 = (class388.field5603.field2720 - class462.field6304) * var6 + class462.field6304;
                class436.field6017 = (class388.field5603.field2730 - class525.field7258) * var6 + class525.field7258;
                class575.field7956 = (class388.field5603.field2718 - class286.field3872) * var6 + class286.field3872;
                class79.field1006 = (class388.field5603.field2726 - class460.field6257) * var6 + class460.field6257;
                class74.field946 = (class388.field5603.field2721 - class39.field485) * var6 + class39.field485;
                if (class190.field2473 != class388.field5603.field2735) {
                    class250.field3380 = class606.field8280.method796(class190.field2473, class388.field5603.field2735, var6, class250.field3380);
                }
            } else {
                class38.field420 = class388.field5603.field2727;
                class629.field8552 = class388.field5603.field2722;
                class494.field6685 = class388.field5603.field2734;
                class436.field6017 = class388.field5603.field2730;
                class509.field6871 = class388.field5603.field2720;
                class539.field7389 = class388.field5603.field2723;
                class653.field9250 = -1;
                class74.field946 = class388.field5603.field2721;
                class575.field7956 = class388.field5603.field2718;
                class250.field3380 = class388.field5603.field2735;
                class79.field1006 = class388.field5603.field2726;
            }
            class257.field3571 = var1;
        }
        if (arg0 != 54) {
            field8529 = -9;
        }
        field8526++;
    }
}
