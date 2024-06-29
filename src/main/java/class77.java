import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class77 extends class739 {

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field1111 = 1;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1113 = new Rectangle[100];

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[[B")
    public static byte[][] field1114 = new byte[1000][];

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "[I")
    public static int[] field1116 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)I")
    private final int method638(byte arg0, int arg1, int arg2) {
        ++field1110;
        int var4 = -23 % ((arg0 - 59) / 50);
        int var5 = arg2 - -(arg1 * 57);
        int var6 = var5 ^ var5 << 1;
        return -(((var6 * 15731 * var6 + 789221) * var6 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field1115;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int var4 = class19.field185[arg1];
            for (int var5 = 0; var5 < class399.field5703; ++var5) {
                var3[var5] = this.method638((byte) -74, var4, class604.field8580[var5]) % 4096;
            }
        }
        if (arg0) {
            method639(-53);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
    public static final void method639(int arg0) {
        ++field1112;
        if (class670.field9546 != null) {
            try {
                class670.field9546.close();
            } catch (IOException var1) {
            }
        }
        if (arg0 >= -99) {
            field1114 = null;
        }
        class670.field9546 = null;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class77() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V")
    public static void method640(byte arg0) {
        if (arg0 == -83) {
            field1116 = null;
            field1114 = null;
            field1113 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B[Ltd;)V")
    public static final void method641(byte arg0, class515[] arg1) {
        class595.field8455 = arg1.length;
        ++field1109;
        class637.field9005 = new class515[class595.field8455 + 10];
        class42.field708 = new int[class595.field8455 + 10];
        class85.method680(arg1, 0, class637.field9005, 0, class595.field8455);
        for (int var2 = 0; ~var2 > ~class595.field8455; ++var2) {
            class42.field708[var2] = class637.field9005[var2].method780();
        }
        int var3 = 96 % ((arg0 - -46) / 54);
        for (int var4 = class595.field8455; var4 < class637.field9005.length; ++var4) {
            class42.field708[var4] = 12;
        }
    }
}
