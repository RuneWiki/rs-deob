import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public abstract class class286 extends class320 {

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "Z")
    public volatile boolean field4435 = true;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
    public static int field4434 = -1;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "Z")
    public boolean field4437;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "Z")
    public boolean field4444;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "[[Z")
    public static boolean[][] field4445;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V", line = 16)
    public static final void method2069(int arg0, int arg1) {
        class294.method2125(10250);
        field4438++;
        class355.method2498(9);
        if (arg0 < 33) {
            method2069(-73, -102);
        }
        int var2 = class123.method1063(16, arg1).field1108;
        if (var2 == 0) {
            return;
        }
        int var3 = class160.field2538[arg1];
        if (var2 == 9) {
            class363.field5745 = var3;
        }
        if (var2 == 6) {
            class61.field947 = var3;
        }
        if (var2 == 5) {
            class120.field1865 = var3;
        }
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V", line = 46)
    public static final void method2070(int arg0) {
        field4443++;
        class128.field2122.method148(true);
        if (arg0 > -91) {
            field4445 = (boolean[][]) ((boolean[][]) null);
        }
        class42.field671 = 1;
        class337.field5185 = null;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 65)
    public static void method2071(boolean arg0) {
        if (!arg0) {
            method2069(9, -98);
        }
        field4445 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)Ldd;", line = 75)
    public static final class46 method2072(int arg0, int arg1) {
        if (arg0 != -10) {
            method2070(96);
        }
        class46 var2 = (class46) class112.field1715.method654(-103, (long) arg1);
        field4441++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class44.field702.method187(30, arg1, -1);
        class46 var4 = new class46();
        if (var3 != null) {
            var4.method460((byte) 112, arg1, new class25(var3));
        }
        class112.field1715.method652(arg0 ^ 0x56, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IC)Z", line = 100)
    public static final boolean method2073(int arg0, char arg1) {
        field4436++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (~arg1 != arg0) {
            char[] var2 = class71.field1068;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)V", line = 144)
    public static final void method2074(int arg0) {
        if (arg0 >= 13) {
            field4440++;
            class263.field4079.method656(0);
            class9.field125.method656(0);
            class187.field2935.method656(0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)[B")
    public abstract byte[] method871(byte arg0);

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)I")
    public abstract int method870(boolean arg0);
}
