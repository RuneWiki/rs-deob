import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class123 extends class24 {

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field1902 = 1;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[I")
    public static int[] field1905;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZB)V", line = 6)
    public static final void method874(boolean arg0, byte arg1) {
        class254.method1750((byte) -66);
        field1907++;
        if (class193.field3143 != 30 && class193.field3143 != 25) {
            return;
        }
        class303.field5107++;
        if (class303.field5107 < 50 && !arg0) {
            return;
        }
        class303.field5107 = 0;
        if (!class267.field4512 && class157.field2493 != null) {
            class249.field4262.method726(237, 2138389379);
            try {
                class157.field2493.method1233((byte) 125, class249.field4262.field2359, class249.field4262.field2367, 0);
                class249.field4262.field2367 = 0;
            } catch (IOException var3) {
                class267.field4512 = true;
            }
            class289.field4870++;
        }
        if (arg1 <= -78) {
            class254.method1750((byte) 92);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V", line = 46)
    public static final void method875(int arg0, int arg1, int arg2) {
        field1900++;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var4[0] = arg0;
        var3[0] = arg1;
        int var5 = 1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class197.field3261[var6] != arg0) {
                var4[var5] = class197.field3261[var6];
                var3[var5] = class113.field1771[var6];
                var5++;
            }
        }
        class197.field3261 = var4;
        class113.field1771 = var3;
        if (arg2 != -27631) {
            field1902 = -15;
        }
        class136.method950(0, class73.field977.length - 1, class73.field977, -4);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 84)
    public static final void method876(int arg0) {
        field1906++;
        class256.field4359.method1431((byte) 120);
        if (arg0 != -13912) {
            field1904 = 126;
        }
        class291.field4883.method1431((byte) 121);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 109)
    public static void method877(int arg0) {
        field1905 = null;
        if (arg0 != 0) {
            method875(-23, 18, -24);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)Z", line = 121)
    public final boolean method878(int arg0, int arg1, int arg2) {
        field1901++;
        if (arg1 > -7) {
            this.field1903 = 87;
        }
        return arg2 >= this.field1903 && arg2 <= this.field1908 && this.field1910 <= arg0 && this.field1909 >= arg0;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIII)V", line = 138)
    public class123(int arg0, int arg1, int arg2, int arg3) {
        this.field1910 = arg1;
        this.field1908 = arg2;
        this.field1903 = arg0;
        this.field1909 = arg3;
    }
}
