import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public abstract class class303 {

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "[I")
    public static int[] field4362 = new int[5];

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "Ljw;")
    public static class581 field4361 = new class581(82, 6);

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "Z")
    public static boolean field4363 = false;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4364 = new Rectangle[100];

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "[J")
    public static long[] field4365 = new long[10];

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
    public static int field4368 = 0;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "Z")
    public static volatile boolean field4367 = false;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
    public abstract void method985(int arg0);

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)V")
    public abstract void method981(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "()Luu;")
    public abstract class303 method963();

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
    public static final void method1912(int arg0) {
        field4360++;
        class104.field1433++;
        class267 var1 = class545.method3099((byte) 76, class269.field3966, class52.field745);
        var1.field3938.method2380(65280, arg0);
        class617.method3392(var1, true);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIII)V")
    public abstract void method984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(III[I)V")
    public abstract void method975(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(III[I)V")
    public abstract void method974(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(III[I)V")
    public abstract void method979(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "([I)V")
    public abstract void method982(int[] arg0);

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
    public abstract void method978(int arg0);

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)V")
    public abstract void method969(int arg0);

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)V")
    public abstract void method970(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
    public static void method1913(byte arg0) {
        field4362 = null;
        field4361 = null;
        if (arg0 != -74) {
            method1913((byte) 76);
        }
        field4364 = null;
        field4365 = null;
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)V")
    public abstract void method968(int arg0);

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Luu;)V")
    public abstract void method986(class303 arg0);

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "(I)V")
    public abstract void method976(int arg0);

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "()V")
    public abstract void method967();

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "(I)V")
    public abstract void method972(int arg0);
}
