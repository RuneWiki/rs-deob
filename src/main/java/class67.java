import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class67 extends class349 {

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "[I")
    public static int[] field937 = new int[99];

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "Lle;")
    public static class65 field940;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "Lhc;")
    public static class368 field942;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "[Lpc;")
    public static class34[] field944;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field937[var1] = var0 / 4;
        }
        field940 = new class65(16);
        field942 = new class368("wave:", "", "", "");
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method539(boolean arg0) {
        if (class398.field5513 != null) {
            class398.field5513.method1324(127);
            class398.field5513 = null;
        }
        field939++;
        class217.method1443(-119);
        class323.method1970();
        for (int var1 = 0; var1 < 4; var1++) {
            class403.field5567[var1].method1987(32);
        }
        class387.method2383(arg0, false);
        System.gc();
        class277.method1745(2, -127);
        class133.field1993 = false;
        class354.field4762 = -1;
        class436.method2681((byte) -86, true);
        class56.field731 = false;
        class371.field5148 = 0;
        class26.field335 = 0;
        class133.field1988 = 0;
        class6.field65 = 0;
        for (int var2 = 0; var2 < class273.field3733.length; var2++) {
            class273.field3733[var2] = null;
        }
        class53.field674 = 0;
        class11.field86 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class87.field1227[var3] = null;
            class149.field2170[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class428.field5951[var4] = null;
        }
        class417.field5771.method843(-1);
        class269.method1712(-118);
        class230.field3244 = 0;
        class393.method2436(-114);
        class232.method1514((byte) 126);
        class435.method2678((byte) 101);
        class428.method2634(true, 11539);
        try {
            class9.method49(class122.field1839.field1086, "loggedout", -112);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)V", line = 77)
    public static final void method540(int arg0, byte arg1) {
        class230.field3230 = arg0;
        field938++;
        class408 var2 = class43.field571;
        synchronized (class43.field571) {
            class43.field571.method2530((byte) -118);
        }
        if (arg1 <= -78) {
            class408 var3 = class146.field2124;
            synchronized (class146.field2124) {
                class146.field2124.method2530((byte) -52);
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V", line = 100)
    public static void method541(byte arg0) {
        field944 = null;
        if (arg0 == -33) {
            field937 = null;
            field940 = null;
            field942 = null;
        }
    }
}
