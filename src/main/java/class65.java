import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class65 {

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public int field1293 = -1;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "[I")
    public static int[] field1303 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!om", name = "n", descriptor = "Lcd;")
    public static class64 field1302 = class44.method335((byte) 71, "::gc");

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public int field1289;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public int field1291;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "Lqm;")
    public static class222 field1299;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "[I")
    public static int[] field1295;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 4)
    public static void method545(int arg0) {
        field1302 = null;
        field1303 = null;
        field1299 = null;
        field1295 = null;
        if (arg0 != 0) {
            field1295 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V", line = 56)
    public static final void method546(int arg0, int arg1) {
        field1297++;
        class198.method1386(0);
        class107.method786(arg1 ^ 0x70EE);
        int var2 = class24.method220(arg0, (byte) 67).field5178;
        if (var2 == 0) {
            return;
        }
        int var3 = class289.field4941[arg0];
        if (var2 == 5) {
            class146.field2591 = var3;
        }
        if (~var2 == arg1) {
            class70.field1355 = var3;
        }
        if (var2 == 6) {
            class299.field5149 = var3;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 94)
    public static final void method547(boolean arg0) {
        if (!arg0) {
            method545(-58);
        }
        class168.field2926.method1187(0);
        field1300++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lqm;II)Ldb;", line = 105)
    public static final class175 method548(class222 arg0, int arg1, int arg2) {
        field1305++;
        if (class56.method432(arg0, arg2, arg1 ^ 0x8817AAAF)) {
            if (arg1 != -23677) {
                field1303 = (int[]) null;
            }
            return class153.method1103((byte) -57);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(La;III)V", line = 118)
    public static final void method549(class262 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class146.field2588) {
            class295 var4 = class304.field5203[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field5095 != null && var4.field5095.field599.method1069()) {
                arg0.method1071(var4.field5095.field599, 128, 0, 0, true);
            }
        }
        if (arg3 < class146.field2588) {
            class295 var5 = class304.field5203[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field5095 != null && var5.field5095.field599.method1069()) {
                arg0.method1071(var5.field5095.field599, 0, 0, 128, true);
            }
        }
        if (arg2 < class146.field2588 && arg3 < class314.field5327) {
            class295 var6 = class304.field5203[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field5095 != null && var6.field5095.field599.method1069()) {
                arg0.method1071(var6.field5095.field599, 128, 0, 128, true);
            }
        }
        if (arg2 < class146.field2588 && arg3 > 0) {
            class295 var7 = class304.field5203[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field5095 != null && var7.field5095.field599.method1069()) {
                arg0.method1071(var7.field5095.field599, 128, 0, -128, true);
            }
        }
    }
}
