import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class408 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[[Z")
    public static boolean[][] field5719 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5722 = "red:";

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/String;)I", line = 4)
    public static final int method2528(int arg0, String arg1) {
        if (arg0 > -40) {
            method2530(31);
        }
        field5720++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 15)
    public static final void method2529(int arg0) {
        field5721++;
        while (class417.field5851.method1803(class213.field2961, true) >= 27) {
            int var1 = class417.field5851.method1808(15, -11904);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class298.field4012[var1] == null) {
                class298.field4012[var1] = new class127();
                var2 = true;
                class298.field4012[var1].field4957 = var1;
            }
            class127 var3 = class298.field4012[var1];
            class209.field2891[class221.field3055++] = var1;
            var3.field4937 = class414.field5793;
            if (var3.field1784 != null && var3.field1784.method80((byte) -121)) {
                class322.method2043(arg0 - 1, var3);
            }
            int var4 = class417.field5851.method1808(5, arg0 ^ 0xFFFFD181);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class417.field5851.method1808(5, -11904);
            var3.method993(class330.method2102(class417.field5851.method1808(14, arg0 - 11905), arg0 - 55), arg0 ^ 0x81);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class88.field1309[class417.field5851.method1808(3, -11904)];
            int var7 = class417.field5851.method1808(1, -11904);
            int var8 = class417.field5851.method1808(1, -11904);
            if (var8 == 1) {
                class344.field4664[class166.field2464++] = var1;
            }
            var3.method2282((byte) -41, var3.field1784.field133);
            var3.field4953 = var3.field1784.field115 << 3;
            if (var3.field4953 == 0) {
                var3.method2274((byte) -79, 0);
            } else if (var2) {
                var3.method2274((byte) -60, var6);
            }
            var3.method2272(var7 == 1, 30867, var3.method2146(-124), class95.field1379.field5005[0] + var4, class95.field1379.field4998[0] + var5, class69.field1046);
            if (var3.field1784.method80((byte) -127)) {
                class199.method1410(var3, var3.field5005[0], class69.field1046, (class338) null, (class372) null, arg0, var3.field4998[0], 0);
            }
        }
        if (arg0 != 1) {
            method2530(-51);
        }
        class417.field5851.method1807(16855);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 97)
    public static void method2530(int arg0) {
        field5719 = null;
        field5722 = null;
        if (arg0 != -6206) {
            method2530(-8);
        }
    }
}
