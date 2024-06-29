import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class174 {

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "[I")
    public static int[] field2649 = new int[128];

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "[I")
    public static int[] field2653 = new int[50];

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field2655 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lsb;")
    public static class230 field2646;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lpf;")
    public static class294 field2651;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lpf;")
    public static class294 field2657;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Ljava/awt/Image;")
    public Image field2654;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[I")
    public int[] field2647;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method1072(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)I")
    public static final int method1073(byte arg0) {
        field2652++;
        if (arg0 < 54) {
            field2646 = null;
        }
        return 6;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public abstract void method1074(int arg0, int arg1, Graphics arg2, byte arg3);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static final void method1075(int arg0) {
        if (arg0 >= -28) {
            method1073((byte) -19);
        }
        field2644++;
        class219.field3299.method1775(27147);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    public static void method1076(byte arg0) {
        field2657 = null;
        field2646 = null;
        field2649 = null;
        field2653 = null;
        field2651 = null;
        if (arg0 < 28) {
            method1075(111);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public final void method1077(int arg0) {
        class111.method708(this.field2647, this.field2656, this.field2650);
        int var2 = 118 % ((-arg0 - 18) / 50);
        field2645++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBILjava/awt/Component;)V")
    public abstract void method1078(int arg0, byte arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    protected class174() {
    }
}
