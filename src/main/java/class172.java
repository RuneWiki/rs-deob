import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class172 extends RuntimeException {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3436;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Ljava/lang/String;")
    public String field3439;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    public static int[] field3440 = new int[25];

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lth;")
    public static class187 field3438 = new class187();

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Ldd;")
    private static class35 field3443 = class180.method1196((byte) -89, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Ldd;")
    public static class35 field3442 = field3443;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lja;")
    public static class90 field3441 = new class90(5000);

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Ldd;")
    private static class35 field3445 = class180.method1196((byte) 126, "Invalid username or password)3");

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Ldd;")
    public static class35 field3447 = field3445;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Ldd;")
    public static class35 field3446 = class180.method1196((byte) -17, "<col=ffb000>");

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;Lag;Lag;B)V")
    public static final void method1117(Component arg0, class8 arg1, class8 arg2, byte arg3) {
        field3435++;
        if (class52.field1194) {
            return;
        }
        class140.method968();
        byte[] var4 = arg2.method39(class62.field1507, -1, 0);
        class3.field42 = new class12(var4, arg0);
        class187.field3806 = class3.field42.method104();
        class55.field1305 = class22.method200(class107.field2394, -21755, arg1);
        class206.field4110 = class22.method200(class205.field4098, -21755, arg1);
        class91.field2024 = class22.method200(class130.field2803, -21755, arg1);
        class132.field2838 = class183.method1219(class161.field3277, arg1, false);
        class205.field4074 = class183.method1219(class178.field3663, arg1, false);
        class72.field1729 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class72.field1729[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class72.field1729[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class72.field1729[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class72.field1729[var8 + 192] = 16777215;
        }
        class9.field186 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class9.field186[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class9.field186[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class9.field186[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class9.field186[var12 + 192] = 16777215;
        }
        class13.field234 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class13.field234[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class13.field234[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class13.field234[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class13.field234[var16 + 192] = 16777215;
        }
        class23.field461 = new int[256];
        class40.field873 = new int[32768];
        class82.field1902 = new int[32768];
        class58.method505(null, false);
        if (class69.field1670 == 0) {
            class49.field1078 = true;
        } else {
            class49.field1078 = false;
        }
        class134.field2867 = class134.field2864;
        int var17 = 31 / ((2 - arg3) / 32);
        class107.field2388 = false;
        class110.field2437 = new int[32768];
        class134.field2849 = class134.field2864;
        class67.field1582 = 0;
        class75.field1800 = new int[32768];
        if (class49.field1078) {
            class166.method1094(2, 0);
        } else {
            class157.method1052(0, 2, 255, false, class57.field1427, true, class162.field3293);
        }
        class155.method1045(false, true);
        class52.field1194 = true;
        class3.field42.method93(0, 0);
        class187.field3806.method93(382, 0);
        class55.field1305.method162(382 - class55.field1305.field358 / 2, 18);
        class43.field944 = new class12(128, 254);
        class155.field3191 = new class12(128, 254);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class172(Throwable arg0, String arg1) {
        this.field3436 = arg0;
        this.field3439 = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1118(int arg0) {
        field3441 = null;
        if (arg0 != 64) {
            return;
        }
        field3446 = null;
        field3447 = null;
        field3438 = null;
        field3442 = null;
        field3440 = null;
        field3445 = null;
        field3443 = null;
    }
}
