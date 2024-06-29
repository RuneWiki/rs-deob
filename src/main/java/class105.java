import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 {

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Z")
    public static boolean field2399 = false;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Ln;")
    public static class90 field2385 = new class90(64);

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field2401 = 0;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "[I")
    public static int[] field2404 = new int[200];

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "Loa;")
    private static class98 field2410 = class38.method349(255, "FULL");

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "Loa;")
    private static class98 field2411 = class38.method349(255, "Enter name of friend to add to list");

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "Loa;")
    private static class98 field2415 = class38.method349(255, "Connecting to friendserver");

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Loa;")
    public static class98 field2406 = field2415;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "[I")
    public static int[] field2413 = new int[100];

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field2414 = 0;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field2402 = 0;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "Loa;")
    public static class98 field2409 = field2411;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "Loa;")
    private static class98 field2405 = class38.method349(255, "No reply from loginserver)3");

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Loa;")
    public static class98 field2407 = field2405;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "Loa;")
    private static class98 field2418 = class38.method349(255, "Add ignore");

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "Loa;")
    public static class98 field2412 = field2418;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "Loa;")
    public static class98 field2419 = class38.method349(255, "Wordpack geladen)3");

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "Loa;")
    public static class98 field2420 = field2410;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "Loc;")
    public static class100 field2417;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "Lrc;")
    public static class119 field2403;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lnd;")
    public class94 field2397;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "[I")
    public static int[] field2408;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII)I")
    public static final int method884(byte arg0, int arg1, int arg2) {
        field2392++;
        int var3 = 0;
        if (arg0 >= -43) {
            method884((byte) 62, 111, 45);
        }
        while (arg1 > 0) {
            arg1--;
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Z")
    public static final boolean method885(int arg0, int arg1) {
        field2398++;
        if (arg0 != 12004) {
            method886((byte) -61);
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method886(byte arg0) {
        field2404 = null;
        field2419 = null;
        field2403 = null;
        field2420 = null;
        field2407 = null;
        field2417 = null;
        field2410 = null;
        field2415 = null;
        field2412 = null;
        field2408 = null;
        field2413 = null;
        field2409 = null;
        field2411 = null;
        field2406 = null;
        field2385 = null;
        field2405 = null;
        if (arg0 != -57) {
            field2418 = null;
        }
        field2418 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z[Loa;)[Loa;")
    public static final class98[] method887(boolean arg0, class98[] arg1) {
        field2386++;
        class98[] var2 = new class98[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class102.method840(new class98[] { class132.method1074(var3, (byte) 125), class4.field69 }, 10);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class102.method840(new class98[] { var2[var3], arg1[var3] }, 10);
            }
        }
        if (!arg0) {
            field2413 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static final void method888(int arg0) {
        if (arg0 > 36) {
            field2383++;
            class3.field40.method714(-75);
            class66.method534();
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static final void method889(int arg0) {
        class58.field1278 = arg0;
        class74.field1603 = 0;
        class41.method358((byte) 57);
        class16.method158(107);
        field2396++;
        class57.method463((byte) 1);
        class150.method1202(-7482);
        for (int var1 = 0; var1 < class58.field1278; var1++) {
            int var3 = class8.field190[var1];
            if (class119.field2680 != class33.field832[var3].field3609) {
                class33.field832[var3] = null;
            }
        }
        if (class88.field2028 != class36.field890.field182) {
            throw new RuntimeException("gpp1 pos:" + class36.field890.field182 + " psize:" + class88.field2028);
        }
        for (int var2 = 0; var2 < class131.field3082; var2++) {
            if (class33.field832[class65.field1394[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class131.field3082);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method890(Component arg0, boolean arg1) {
        Method var2 = class72.field1504;
        if (!arg1) {
            method889(43);
        }
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        field2393++;
        arg0.addKeyListener(class141.field3436);
        arg0.addFocusListener(class141.field3436);
    }
}
