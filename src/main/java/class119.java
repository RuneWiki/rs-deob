import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class119 extends class32 {

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "Lqk;")
    public static class207 field2060 = class24.method212(255, "Atteindre");

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "[I")
    public static int[] field2059 = new int[25];

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "Lqk;")
    public static class207 field2063 = class24.method212(255, "::rebuild");

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "[Lv;")
    public static class149[] field2064 = new class149[2048];

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    private int field2062;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "Lqk;")
    public class207 field2067;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBLv;)V")
    private final void method847(int arg0, byte arg1, class149 arg2) {
        field2058++;
        int var4 = 99 / ((arg1 - 46) / 35);
        if (arg0 == 1) {
            this.field2062 = arg2.method1045((byte) 112);
        } else if (arg0 == 2) {
            this.field2061 = arg2.method1076(65280);
        } else if (arg0 == 5) {
            this.field2067 = arg2.method1034(-27220);
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V")
    public static void method848(int arg0) {
        field2060 = null;
        field2064 = null;
        field2063 = null;
        if (arg0 > 118) {
            field2059 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lv;I)V")
    public final void method849(class149 arg0, int arg1) {
        if (arg1 != 13289) {
            this.method847(35, (byte) 109, (class149) null);
        }
        field2057++;
        while (true) {
            int var3 = arg0.method1045((byte) -30);
            if (var3 == 0) {
                return;
            }
            this.method847(var3, (byte) -72, arg0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)I")
    public static final int method850(int arg0, int arg1) {
        if (arg1 != 2160) {
            field2059 = null;
        }
        field2055++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)V")
    public static final void method851(int arg0, boolean arg1) {
        class21.method129((byte) 8);
        field2056++;
        if (class250.field4524 != 30 && class250.field4524 != 25) {
            return;
        }
        class82.field1511++;
        if (class82.field1511 < 50 && !arg1) {
            return;
        }
        class82.field1511 = 0;
        if (!class167.field2930 && class98.field1738 != null) {
            class178.field3211++;
            class261.field4645.method767(10, (byte) 113);
            try {
                class98.field1738.method894(0, class261.field4645.field2568, class261.field4645.field2593, -110);
                class261.field4645.field2593 = 0;
            } catch (IOException var2) {
                class167.field2930 = true;
            }
        }
        class21.method129((byte) 8);
        if (arg0 != 22705) {
            field2059 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)V")
    public static final void method852(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class174.field3126[var1] = false;
        }
        class137.field2369 = 0;
        class132.field2290 = 1;
        if (arg0 == 35) {
            class25.field532 = -1;
            field2065++;
            class237.field4373 = 0;
            class256.field4587 = -1;
        }
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)Z")
    public final boolean method853(int arg0) {
        field2066++;
        if (arg0 == -116) {
            return this.field2062 == 115;
        } else {
            return false;
        }
    }
}
