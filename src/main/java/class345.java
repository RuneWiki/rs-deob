import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class345 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Leg;")
    public static class188 field5347 = new class188(64);

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field5351 = 0;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public int field5348;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field5355;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public int field5356;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2394(byte arg0) {
        class107.field1652 = null;
        class154.field2417 = null;
        field5349++;
        class123.field1919 = null;
        class68.field1011 = null;
        class276.field4257 = null;
        class46.field644 = (byte[][]) null;
        if (arg0 != -92) {
            method2395(true, false);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZ)V", line = 20)
    public static final void method2395(boolean arg0, boolean arg1) {
        if (arg1) {
            if (class253.field3936 != -1) {
                class323.method2189(class253.field3936, 0);
            }
            for (class45 var2 = (class45) class166.field2557.method1549((byte) 90); var2 != null; var2 = (class45) class166.field2557.method1546(-1)) {
                class157.method1095(var2, true, -18772);
            }
            class253.field3936 = -1;
            class166.field2557 = new class227(8);
            class126.method847(53);
            class253.field3936 = class299.field4642;
            class221.method1479(false, 12918);
            class13.method110(61);
            class313.method2148(-1, class253.field3936);
        }
        class161.field2499 = -1;
        field5354++;
        class95.method648(class226.field3613, 116);
        class79.field1173 = new class82();
        class79.field1173.field519 = 3000;
        class79.field1173.field537 = 3000;
        if (!arg0) {
            method2394((byte) 97);
        }
        if (!class333.field5166 && class2.field25 == 0) {
            class38.method275(class121.field1859, (byte) -122);
            class231.method1583(10, (byte) 122);
            return;
        }
        if (class219.field3489 == 2) {
            class298.field4598 = class131.field2067 << 7;
            class225.field3592 = class269.field4147 << 7;
        } else {
            class104.method707(65535);
        }
        if (class333.field5166) {
            class323.method2186(-123);
        }
        class131.method900(-1);
        class231.method1583(28, (byte) 107);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Ljava/lang/String;", line = 86)
    public static final String method2396(int arg0, int arg1) {
        field5353++;
        int var2 = -126 / ((24 - arg1) / 43);
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 96)
    public static void method2397(int arg0) {
        if (arg0 == 30968) {
            field5347 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZLgn;)V", line = 113)
    private final void method2398(int arg0, boolean arg1, class303 arg2) {
        if (arg0 == 1) {
            this.field5356 = arg2.method1994(arg1);
            this.field5348 = arg2.method2043((byte) -105);
            this.field5355 = arg2.method2043((byte) -125);
        }
        field5357++;
        if (arg1) {
            this.field5356 = 115;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLgn;)V", line = 138)
    public final void method2399(byte arg0, class303 arg1) {
        if (arg0 > -11) {
            return;
        }
        field5358++;
        while (true) {
            int var3 = arg1.method2043((byte) -123);
            if (var3 == 0) {
                return;
            }
            this.method2398(var3, false, arg1);
        }
    }
}
