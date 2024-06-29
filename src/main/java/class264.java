import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class264 extends class29 {

    @OriginalMember(owner = "client!he", name = "B", descriptor = "Lth;")
    public static class55 field4094 = new class55();

    @OriginalMember(owner = "client!he", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4097 = "flash2:";

    @OriginalMember(owner = "client!he", name = "F", descriptor = "Z")
    public static boolean field4098 = false;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "[I")
    public static int[] field4099 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!he", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4101 = "white:";

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field4102 = 0;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V", line = 4)
    public static void method1759(int arg0) {
        field4097 = null;
        field4101 = null;
        field4099 = null;
        if (arg0 == 4823) {
            field4094 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 22)
    public static final void method1760(byte arg0) {
        field4095++;
        if (class318.field4808 < 0) {
            class345.field5353 = -1;
            class318.field4808 = 0;
            class336.field5148 = -1;
        }
        if (class318.field4808 > class163.field2629) {
            class336.field5148 = -1;
            class345.field5353 = -1;
            class318.field4808 = class163.field2629;
        }
        if (class250.field3923 < 0) {
            class250.field3923 = 0;
            class345.field5353 = -1;
            class336.field5148 = -1;
        }
        if (arg0 != -12) {
            field4094 = (class55) null;
        }
        if (class250.field3923 > class9.field199) {
            class345.field5353 = -1;
            class336.field5148 = -1;
            class250.field3923 = class9.field199;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V", line = 65)
    public static final void method1761(byte arg0) {
        field4100++;
        if (class177.field2860 != null) {
            class177.field2860.method607((byte) -76);
            class177.field2860 = null;
        }
        class188.method1198(96);
        class71.method543();
        for (int var1 = 0; var1 < 4; var1++) {
            class326.field4990[var1].method216(-126);
        }
        class225.method1489(false, (byte) -54);
        System.gc();
        class177.method1117(2, -96);
        class328.field5039 = -1;
        if (arg0 <= 49) {
            method1762(false, -3);
        }
        class146.field2389 = false;
        class344.method2386(-1, true);
        class246.field3818 = 0;
        class101.field1769 = 0;
        class121.field2093 = false;
        class14.field270 = 0;
        class303.field4597 = 0;
        for (int var2 = 0; var2 < class342.field5313.length; var2++) {
            class342.field5313[var2] = null;
        }
        class285.field4417 = 0;
        class305.field4623 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class97.field1715[var3] = null;
            class51.field1026[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class8.field179[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class62.field1186[var5][var6][var7] = null;
                }
            }
        }
        class327.method2265(0);
        class79.field1565 = 0;
        class159.method1028(1000);
        class9.method82(106, true);
        try {
            class102.method666(class177.field2849.field2139, false, "loggedout");
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V", line = 172)
    public static final void method1762(boolean arg0, int arg1) {
        field4093++;
        if (class47.field961 == arg0) {
            return;
        }
        class47.field961 = arg0;
        class146.method950(32);
        if (arg1 != 2) {
            field4101 = (String) null;
        }
    }
}
