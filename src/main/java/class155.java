import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class155 extends class18 {

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "[B")
    public byte[] field2410;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2409 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
    public static boolean field2407 = true;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field2414 = 0;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "F")
    public static float field2412;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lre;B)Z")
    public static final boolean method1038(class228 arg0, byte arg1) {
        field2411++;
        if (arg0.field3581 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field3581.length; var2++) {
            int var3 = class132.method915((byte) 48, arg0, var2);
            int var4 = arg0.field3639[var2];
            if (arg0.field3581[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field3581[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field3581[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg1 != 5) {
            method1041(-16, -83);
        }
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)V")
    public static final void method1039(byte arg0) {
        if (arg0 <= 44) {
            method1038((class228) null, (byte) -55);
        }
        field2408++;
        class271.field4344.method1898((byte) 54);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static void method1040(boolean arg0) {
        if (arg0) {
            field2409 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(II)I")
    public static final int method1041(int arg0, int arg1) {
        if (arg1 > -13) {
            method1038((class228) null, (byte) -93);
        }
        field2413++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V")
    public class155(byte[] arg0) {
        this.field2410 = arg0;
    }
}
