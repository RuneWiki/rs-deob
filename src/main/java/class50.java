import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class50 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
    public static int[] field709;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
    public abstract int method391(int arg0, int arg1);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)[B")
    public abstract byte[] method392(int arg0, int arg1);

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(II)I")
    public static final int method393(int arg0, int arg1) {
        field708++;
        if (arg1 != -22825) {
            method397((byte) -16);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Lrb;")
    public abstract class199 method394(int arg0);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)I")
    public static final int method395(int arg0, byte arg1) {
        field707++;
        if (arg1 != 94) {
            field709 = null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(II)V")
    public abstract void method396(int arg0, int arg1);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method397(byte arg0) {
        field709 = null;
        if (arg0 != -96) {
            field709 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static final void method398(int arg0) {
        class106 var1 = class170.field2750;
        synchronized (class170.field2750) {
            class64.field899 = class166.field2713;
            class76.field1044++;
            if (class253.field4046 >= 0) {
                while (class253.field4046 != class106.field1845) {
                    int var3 = class241.field3873[class106.field1845];
                    class106.field1845 = class106.field1845 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class247.field3975[var3] = true;
                    } else {
                        class247.field3975[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class247.field3975[var2] = false;
                }
                class253.field4046 = class106.field1845;
            }
            class166.field2713 = class67.field946;
        }
        field710++;
        if (arg0 != 12147) {
            field709 = null;
        }
    }
}
