import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class127 extends class67 {

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "Li;")
    private static class88 field2376 = class208.method1425(105, " seconds)3");

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field2373 = -1;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Li;")
    public static class88 field2372 = field2376;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "Li;")
    public static class88 field2390 = class208.method1425(105, "Passwort: ");

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public int field2378;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public int field2383;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
    public int field2396;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Lla;")
    public class121 field2370;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "Loj;")
    public class162 field2393;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "Lsh;")
    public class204 field2377;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "Ltf;")
    public class213 field2382;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public final void method868(int arg0) {
        this.field2393 = null;
        field2374++;
        if (arg0 != -11515) {
            this.field2380 = 96;
        }
        this.field2377 = null;
        this.field2370 = null;
        this.field2382 = null;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V")
    public static final void method869(byte arg0) {
        field2371++;
        if (arg0 <= 123) {
            method869((byte) -61);
        }
        for (class168 var1 = (class168) class128.field2397.method1049(0); var1 != null; var1 = (class168) class128.field2397.method1050((byte) -73)) {
            int var2 = var1.field3231;
            if (class211.method1447(0, var2)) {
                boolean var3 = true;
                class174[] var4 = class78.field1418[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3412;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1219;
                    class174 var7 = class239.method1581(-64, var6);
                    if (var7 != null) {
                        class200.method1373(65280, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)V")
    public static void method870(boolean arg0) {
        if (!arg0) {
            method869((byte) -33);
        }
        field2390 = null;
        field2372 = null;
        field2376 = null;
    }
}
