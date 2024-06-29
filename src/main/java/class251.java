import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class251 {

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field4472 = -1;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[I")
    public static int[] field4475 = new int[32];

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public int field4469;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "J")
    public long field4466;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lbb;")
    public class75 field4467;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lli;Z)Z")
    public static final boolean method1705(class185 arg0, boolean arg1) {
        field4470++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1) {
            return false;
        }
        while (class126.field2253 > var2) {
            if (arg0.method1312(class128.field2290[var2], -30055)) {
                return true;
            }
            var2++;
        }
        return arg0.method1312(class241.field4310.field3514, -30055);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILp;I)V")
    public static final void method1706(int arg0, int arg1, class82 arg2, int arg3) {
        if (arg3 > -38) {
            method1706(-108, 120, (class82) null, -126);
        }
        field4468++;
        if (class149.field2813 != null || class112.field2027 || arg2 == null || class122.method896(arg2, false) == null) {
            return;
        }
        class149.field2813 = arg2;
        class178.field3263 = class122.method896(arg2, false);
        class78.field1358 = 0;
        class200.field3674 = arg0;
        class259.field4595 = arg1;
        class180.field3305 = false;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static final void method1707(byte arg0) {
        field4471++;
        int[] var1 = new int[class142.field2676];
        int var2 = 0;
        if (arg0 <= 7) {
            method1705((class185) null, false);
        }
        for (int var3 = 0; var3 < class142.field2676; var3++) {
            class134 var5 = class165.method1179(102, var3);
            if (var5.field2464 >= 0 || var5.field2397 >= 0) {
                var1[var2++] = var3;
            }
        }
        class21.field360 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class21.field360[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method1708(int arg0) {
        if (arg0 == -1) {
            field4475 = null;
        }
    }
}
