import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class95 extends class106 {

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field1958 = 0;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "Leh;")
    private static class47 field1969 = class195.method1282((byte) -4, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "Leh;")
    private static class47 field1964 = class195.method1282((byte) -4, "Loaded interfaces");

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field1961 = 0;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "Leh;")
    public static class47 field1968 = class195.method1282((byte) -4, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "Leh;")
    public static class47 field1955 = field1964;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "Leh;")
    public static class47 field1965 = field1969;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "Lpa;")
    public static class136 field1957 = new class136(5);

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public static int field1972 = -1;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field1973 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public int field1959;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLhd;)V")
    public final void method754(byte arg0, class68 arg1) {
        while (true) {
            int var3 = arg1.method604((byte) -127);
            if (var3 == 0) {
                field1970++;
                int var4 = -45 / ((arg0 - 48) / 33);
                return;
            }
            this.method756(arg1, var3, 124);
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
    public static final void method755(int arg0) {
        field1963++;
        class109.field2270 = null;
        class198.field3850 = null;
        class64.field1390 = null;
        class96.field1979 = null;
        class69.field1516 = null;
        class69.field1511 = null;
        if (arg0 > -9) {
            field1972 = -85;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lhd;II)V")
    private final void method756(class68 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1967 = arg0.method569(26496);
            this.field1959 = arg0.method604((byte) -125);
            this.field1960 = arg0.method604((byte) -125);
        }
        if (arg2 <= 28) {
            field1955 = null;
        }
        field1956++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILhd;)V")
    public static final void method757(int arg0, class68 arg1) {
        field1966++;
        byte[] var2 = new byte[24];
        if (class126.field2532 != null) {
            try {
                int var3 = 0;
                class126.field2532.method294(0L, -55);
                class126.field2532.method298(var2, (byte) 82);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg0 <= 27) {
            field1971 = -92;
        }
        arg1.method571(var2, -1, 24, 0);
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
    public static void method758(int arg0) {
        field1955 = null;
        field1965 = null;
        field1968 = null;
        field1957 = null;
        field1964 = null;
        field1969 = null;
        if (arg0 >= -57) {
            field1957 = null;
        }
    }
}
