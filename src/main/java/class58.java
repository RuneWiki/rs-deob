import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class58 extends OutputStream {

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lhd;")
    public static class117 field1017 = new class117(100);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[[[Lse;")
    public static class11[][][] field1018;

    @OriginalMember(owner = "client!de", name = "write", descriptor = "(I)V", line = 11)
    public final void write(int arg0) throws IOException {
        field1015++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 19)
    public static void method455(boolean arg0) {
        field1017 = null;
        if (!arg0) {
            field1018 = (class11[][][]) null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLr;I)Lok;", line = 30)
    public static final class146 method456(byte arg0, class264 arg1, int arg2) {
        field1013++;
        if (!class98.method676(arg2, 65535, client.method1789(arg1)) && arg1.field4471 == null) {
            return null;
        } else if (arg1.field4485 == null || arg2 >= arg1.field4485.length || arg1.field4485[arg2] == null || arg1.field4485[arg2].method1096((byte) -89).method1094((byte) -77) == 0) {
            return class128.field2096 ? class112.method758(-97, new class146[] { class259.field4302, class82.method585(14744, arg2) }) : null;
        } else {
            if (arg0 < 9) {
                method456((byte) -52, (class264) null, -58);
            }
            return arg1.field4485[arg2];
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V", line = 61)
    public static final void method457(int arg0, int arg1) {
        field1014++;
        class264.method1915((byte) 96);
        if (arg1 != -11917) {
            method456((byte) 40, (class264) null, 69);
        }
        class66.method500((byte) 127);
        int var2 = class273.method1998(arg0, -125).field2242;
        if (var2 == 0) {
            return;
        }
        int var3 = class75.field1221[arg0];
        if (var2 == 6) {
            class278.field4778 = var3;
        }
        if (var2 == 9) {
            class123.field2007 = var3;
        }
        if (var2 == 5) {
            class98.field1581 = var3;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)Z", line = 92)
    public static final boolean method458(boolean arg0, int arg1) {
        field1016++;
        if (arg0) {
            return false;
        } else {
            return (arg1 >> 29 & 0x1) != 0;
        }
    }
}
