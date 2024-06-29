import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class141 {

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "S")
    public static short field2270 = 320;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lui;")
    public static class98 field2271 = new class98(64);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field2275 = 0;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2276 = "Examine";

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field2277 = 5063219;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lnm;")
    public static class221 field2269;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lqh;")
    public static class35 field2278;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)I", line = 15)
    public static final int method998(byte arg0, int arg1) {
        field2273++;
        if (arg1 > 0) {
            return 1;
        } else {
            if (arg0 != -72) {
                method998((byte) 9, -110);
            }
            return arg1 >= 0 ? 0 : -1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[B", line = 34)
    public static final synchronized byte[] method999(int arg0, int arg1) {
        field2272++;
        if (arg0 == 100 && class123.field1825 > 0) {
            byte[] var2 = class235.field3734[--class123.field1825];
            class235.field3734[class123.field1825] = null;
            return var2;
        }
        if (arg1 != 0) {
            method998((byte) 15, -103);
        }
        if (arg0 == 5000 && class47.field683 > 0) {
            byte[] var3 = class352.field5613[--class47.field683];
            class352.field5613[class47.field683] = null;
            return var3;
        } else if (arg0 == 30000 && class107.field1540 > 0) {
            byte[] var4 = class191.field2968[--class107.field1540];
            class191.field2968[class107.field1540] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 70)
    public static final void method1000(boolean arg0) {
        if (!arg0) {
            field2267++;
            class7.method53(0, 0, true);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 85)
    public static void method1001(int arg0) {
        if (arg0 >= -124) {
            field2270 = 5;
        }
        field2276 = null;
        field2271 = null;
        field2278 = null;
        field2269 = null;
    }
}
