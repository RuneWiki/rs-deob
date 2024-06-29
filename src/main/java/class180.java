import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public abstract class class180 {

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "S")
    public static short field3087 = 32767;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field3085 = 0;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lrb;")
    public static class254 field3089 = new class254(20);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Lfh;")
    public class180 method567(int arg0, int arg1, int arg2) {
        field3091++;
        return this;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZIII)V")
    public void method264(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3084++;
        if (arg1) {
            this.method88();
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)V")
    public static final void method1153(int arg0, boolean arg1) {
        class174.field2910 = -1;
        if (!arg1) {
            field3087 = -60;
        }
        class242.field4205 = arg0;
        class109.field2045 = -1;
        field3090++;
        class103.method629((byte) -72);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public static void method1154(boolean arg0) {
        field3089 = null;
        if (!arg0) {
            field3088 = 111;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()Z")
    public boolean method550() {
        field3083++;
        return false;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()I")
    public abstract int method88();

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lfh;IIIZ)V")
    public void method558(class180 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3086++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1155(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3092++;
        if (arg4 >= -19) {
            return;
        }
        if (arg2 == arg6) {
            class243.method1618(arg1, arg3, arg5, arg6, arg7, arg0, false);
        } else if ((arg0 - arg6) >= class125.field2234 && class19.field331 >= arg0 + arg6 && (arg5 - arg2) >= class161.field2718 && (arg2 + arg5) <= class46.field817) {
            class237.method1578(arg3, arg0, arg1, arg6, arg7, 22069, arg5, arg2);
        } else {
            class32.method163(arg7, arg2, false, arg6, arg5, arg3, arg1, arg0);
        }
    }
}
