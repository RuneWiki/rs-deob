import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class94 {

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "I")
    public int field990;

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "Z")
    public static boolean field988 = false;

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "Lbga;")
    public static class356 field989 = new class356();

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V", line = 9)
    public static final void method633(int arg0) {
        if (arg0 >= -115) {
            field989 = null;
        }
        field991++;
        if (class392.field5397 == 7) {
            class7.method25(false, (byte) 111);
        } else {
            class185.field2213 = class751.field10504;
            class751.field10504 = null;
            class313.method1860(true, 13);
        }
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)V", line = 30)
    public static void method634(int arg0) {
        if (arg0 != -3707) {
            field988 = true;
        }
        field989 = null;
    }

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "(I)I", line = 40)
    public final int method635(int arg0) {
        if (arg0 == -3073) {
            field994++;
            return this.field992;
        } else {
            return 9;
        }
    }

    @OriginalMember(owner = "client!pia", name = "toString", descriptor = "()Ljava/lang/String;", line = 55)
    public final String toString() {
        field993++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(II)V", line = 64)
    public class94(int arg0, int arg1) {
        this.field990 = arg1;
        this.field992 = arg0;
    }
}
