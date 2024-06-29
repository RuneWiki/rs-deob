import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class446 {

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "Z")
    public boolean field6485;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    public static int field6482 = 0;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "[[I")
    public static int[][] field6478 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "Lega;")
    public class184 field6484;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "Lega;")
    public class184 field6486;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Lfo;")
    public static class606 field6477;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Z")
    public boolean field6481;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILps;I)V")
    public static final void method2638(int arg0, int arg1, class5 arg2, int arg3) {
        field6479++;
        if (arg2 == null) {
            return;
        }
        if (arg0 != 6) {
            field6477 = null;
        }
        if (arg2.field106 != null) {
            class303 var4 = new class303();
            var4.field4499 = arg2;
            var4.field4500 = arg2.field106;
            class195.method1270(var4);
        }
        class279.field3689 = arg2.field59;
        class492.field7003 = arg2.field53;
        class142.field2061 = arg2.field47;
        class222.field2943 = arg2.field165;
        class2.field21 = arg3;
        class412.field6116 = arg2.field65;
        class282.field3771 = arg1;
        class240.field3164 = true;
        class284.method1679(arg2, -58);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V")
    public final void method2639(boolean arg0) {
        if (this.field6486 != null) {
            this.field6486.method987(64);
        }
        field6480++;
        this.field6481 = false;
        if (!arg0) {
            field6482 = 3;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2640(int arg0, byte arg1, int arg2) {
        int var3 = -87 % ((arg1 + 25) / 51);
        field6487++;
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z")
    public final boolean method2641(int arg0) {
        if (arg0 < 16) {
            method2640(76, (byte) 30, -14);
        }
        field6483++;
        return this.field6481 && !this.field6485;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public static void method2642(int arg0) {
        int var1 = -65 / ((-arg0 - 49) / 49);
        field6477 = null;
        field6478 = null;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Z)V")
    public class446(boolean arg0) {
        this.field6485 = arg0;
    }
}
