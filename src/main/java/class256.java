import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class256 extends class192 {

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public int field4381 = 0;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "Loh;")
    public static class258 field4385 = class153.method1046(" loggt sich ein)3", 89);

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "Lvj;")
    public static class96 field4383 = new class96(16);

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "Loh;")
    public static class258 field4387 = class153.method1046(")4a=", 111);

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "Lgb;")
    public static class213 field4388;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "Ldb;")
    public static class41 field4389;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lva;B)V", line = 12)
    public final void method1724(class235 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1589(50);
            if (var3 == 0) {
                field4386++;
                if (arg1 != -94) {
                    method1727(45);
                }
                return;
            }
            this.method1726(arg0, (byte) 40, var3);
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(Z)V", line = 49)
    public static final void method1725(boolean arg0) {
        field4382++;
        if (arg0) {
            method1727(88);
        }
        int var1 = class201.field3490;
        int var2 = class218.field3766;
        int var3 = class84.field1414;
        int var4 = class224.field3845;
        int var5 = 6116423;
        if (class257.field4390) {
            class296.method2096(var2, var1, var3, var4, var5);
            class296.method2096(var2 + 1, var1 + 1, var3 - 2, 16, 0);
            class296.method2084(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        } else {
            class211.method1398(var2, var1, var3, var4, var5);
            class211.method1398(var2 + 1, var1 + 1, var3 - 2, 16, 0);
            class211.method1404(var2 + 1, var1 - -18, var3 - 2, var4 + -19, 0);
        }
        class123.field2180.method268(class16.field204, var2 + 3, var1 + 14, var5, -1);
        int var6 = class194.field3423;
        int var7 = class226.field3882;
        for (int var8 = 0; var8 < class69.field1195; var8++) {
            int var9 = (class69.field1195 - var8 - 1) * 15 + (var1 + 31);
            int var10 = 16777215;
            if (var2 < var6 && var6 < (var2 + var3) && var7 > (var9 - 13) && var7 < (var9 + 3)) {
                var10 = 16776960;
            }
            class123.field2180.method268(class63.method488(true, var8), var2 + 3, var9, var10, 0);
        }
        class31.method230(class218.field3766, class84.field1414, class224.field3845, (byte) 19, class201.field3490);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lva;BI)V", line = 114)
    private final void method1726(class235 arg0, byte arg1, int arg2) {
        field4384++;
        if (arg2 == 2) {
            this.field4381 = arg0.method1615(arg1 ^ 0xFFFFFFD5);
        }
        if (arg1 != 40) {
            method1727(67);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 130)
    public static void method1727(int arg0) {
        field4383 = null;
        field4385 = null;
        field4389 = null;
        field4388 = null;
        int var1 = 58 / ((arg0 + 37) / 39);
        field4387 = null;
    }
}
