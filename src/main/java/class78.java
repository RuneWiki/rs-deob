import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class78 extends class273 {

    @OriginalMember(owner = "client!id", name = "O", descriptor = "Leg;")
    public static class188 field1162 = new class188(4);

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field1163 = 0;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field1164 = 128;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method331(int arg0, int arg1) {
        if (arg1 != -14650) {
            method546((byte) 47, -42);
        }
        field1158++;
        return class151.field2384;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V", line = 16)
    public static void method545(int arg0) {
        if (arg0 != -1201147760) {
            method545(126);
        }
        field1162 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V", line = 35)
    public static final void method546(byte arg0, int arg1) {
        field1157++;
        class15 var2 = (class15) class247.field3868.method1558((long) arg1, false);
        if (var2 != null) {
            if (arg0 <= 125) {
                field1164 = 21;
            }
            var2.method1284(0);
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(II)Ljh;", line = 53)
    public static final class207 method547(int arg0, int arg1) {
        int var2 = arg0 >> 16;
        field1160++;
        if (arg1 < 93) {
            return (class207) null;
        }
        int var3 = arg0 & 0xFFFF;
        if (class219.field3487[var2] == null || class219.field3487[var2][var3] == null) {
            boolean var4 = class183.method1263(0, var2);
            if (!var4) {
                return null;
            }
        }
        return class219.field3487[var2][var3];
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 76)
    public class78() {
        super(0, true);
    }
}
