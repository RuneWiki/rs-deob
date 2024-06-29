import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 extends class20 {

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public static volatile int field2324 = 0;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "Lsc;")
    private static class128 field2322 = class129.method1017(false, "FULL");

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
    public static int field2333 = 0;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "Lsc;")
    public static class128 field2334 = class129.method1017(false, "sl_stars");

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "Lsc;")
    public static class128 field2327 = field2322;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "Lsc;")
    public static class128 field2328 = class129.method1017(false, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "[I")
    public static int[] field2336 = new int[128];

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "Lsc;")
    public static class128 field2332 = class129.method1017(false, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "Lrb;")
    public static class120 field2329 = new class120(200);

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public int field2323;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "Lfa;")
    public class37 field2321;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "Lae;")
    public class6 field2337;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "[B")
    public byte[] field2330;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
    public static final void method769(int arg0, boolean arg1) {
        field2338++;
        if (!arg1) {
            return;
        }
        if (arg0 == -1 && !class67.field1511) {
            class35.method255((byte) -70);
        } else if (arg0 != -1 && class141.field3305 != arg0 && class149.field3440 != 0 && !class67.field1511) {
            class41.method293(0, false, arg0, 2, arg1, class36.field701, class149.field3440);
        }
        class141.field3305 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static final void method770(int arg0) {
        field2325++;
        if (!class105.field2399) {
            return;
        }
        class119.field2704 = null;
        class115.field2604 = null;
        class6.field94 = null;
        class112.field2513 = null;
        class151.field3475 = null;
        class35.field653 = null;
        class72.field1610 = null;
        if (arg0 != -27784) {
            method772((byte) 75, -39);
        }
        class148.field3422 = null;
        class54.field1101 = null;
        class152.field3514 = null;
        class108.field2455 = null;
        class43.field798 = null;
        class9.field135 = null;
        class53.field1044 = null;
        class20.field389 = null;
        class43.field812 = null;
        class43.field813 = null;
        class105.field2397 = null;
        class27.field533 = null;
        class20.field387 = null;
        class124.method944(217, 2);
        class108.method842(true, -2727);
        class105.field2399 = false;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public static void method771(byte arg0) {
        field2334 = null;
        int var1 = -41 / ((31 - arg0) / 33);
        field2328 = null;
        field2329 = null;
        field2322 = null;
        field2332 = null;
        field2336 = null;
        field2327 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)V")
    public static final void method772(byte arg0, int arg1) {
        field2331++;
        if (arg1 == -1 || (arg0 != -60 || !class65.method488((byte) 120, arg1))) {
            return;
        }
        class54[] var2 = class123.field2791[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class54 var4 = var2[var3];
            if (var4.field1191 != null) {
                class18 var5 = new class18();
                var5.field314 = var4;
                var5.field321 = var4.field1191;
                class46.method341(var5, -2601);
            }
        }
    }
}
