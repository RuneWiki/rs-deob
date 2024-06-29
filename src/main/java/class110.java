import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class110 extends class20 {

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Lhe;")
    public static class54 field2473 = null;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "[Lwa;")
    public static class154[] field2482 = new class154[50];

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "[I")
    public static int[] field2480 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "Lsc;")
    private static class128 field2484 = class129.method1017(false, "Welcome to RuneScape");

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "Lsc;")
    public static class128 field2475 = field2484;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field2483 = -2;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "[[[B")
    public static byte[][][] field2485 = new byte[4][104][104];

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "Lrc;")
    public static class121 field2479 = new class121();

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "Z")
    public static boolean field2487 = false;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Lsc;")
    public static class128 field2486 = null;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "Lsc;")
    public static class128 field2489 = class129.method1017(false, "jlv");

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "[I")
    public static int[] field2490 = new int[50];

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "[[B")
    public static byte[][] field2488;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public static final void method849(int arg0) {
        Object var1 = class131.field3039;
        synchronized (class131.field3039) {
            if (arg0 != 0) {
                method849(-26);
            }
            if (class119.field2708 != 0) {
                class119.field2708 = 1;
                try {
                    class131.field3039.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field2481++;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
    public static void method850(byte arg0) {
        field2489 = null;
        field2488 = null;
        field2485 = null;
        int var1 = 87 % ((-arg0 - 54) / 63);
        field2475 = null;
        field2479 = null;
        field2486 = null;
        field2490 = null;
        field2482 = null;
        field2473 = null;
        field2484 = null;
        field2480 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IJ)V")
    public static final void method851(int arg0, long arg1) {
        field2476++;
        try {
            if (arg0 == 23315) {
                Thread.sleep(arg1);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
    public static final void method852(int arg0) {
        field2474++;
        if (arg0 != 104) {
            method849(-71);
        }
        class69 var1 = class148.field3417;
        synchronized (class148.field3417) {
            class147.field3400 = class104.field2357;
            class64.field1380 = class9.field151;
            class18.field330 = class72.field1611;
            class120.field2726 = class159.field3661;
            class43.field806 = class157.field3610;
            class9.field133 = class102.field2324;
            class121.field2766 = class104.field2362;
            class159.field3661 = 0;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class110() {
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V")
    public class110(int arg0) {
        this.field2478 = arg0;
    }
}
