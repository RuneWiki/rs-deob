import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class35 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lbg;")
    public static class464 field445 = new class464();

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Z")
    public static volatile boolean field447 = false;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method196(int arg0) {
        if (arg0 == -27527) {
            field445 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z")
    public static final boolean method197(int arg0, int arg1, int arg2) {
        if (arg2 != 458752) {
            field445 = null;
        }
        field443++;
        return class576.method3292((byte) 48, arg1, arg0) | (arg1 & 0x70000) != 0 || class661.method3623((byte) 84, arg0, arg1);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method198(int arg0, int arg1, boolean arg2) {
        field444++;
        if (arg2) {
            return true;
        } else {
            return (arg1 & 0x8000) != 0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([BI)V")
    public static final void method199(byte[] arg0, int arg1) {
        field446++;
        if (arg1 != 16143) {
            field445 = null;
        }
        class675 var2 = new class675(arg0);
        while (true) {
            int var3 = var2.method3750((byte) 35);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class94.field1104 = var2.method3757((byte) -65);
            }
        }
    }
}
