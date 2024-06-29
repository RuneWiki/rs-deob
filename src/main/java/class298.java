import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class298 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field5183 = -1;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lsf;")
    public static class108 field5185 = class140.method973(255, "mapdots");

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lsf;")
    public static class108 field5187 = class140.method973(255, "M-Bmoire en cours d(Wattribution");

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lsf;")
    public static class108 field5189 = class140.method973(255, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "[Lvd;")
    public static class135[] field5188;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 12)
    public static void method2105(byte arg0) {
        if (arg0 == -41) {
            field5187 = null;
            field5185 = null;
            field5189 = null;
            field5188 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V", line = 25)
    public static final void method2106(byte arg0) {
        field5190++;
        if (class14.field161 != null) {
            class14.field161.method1487(13881);
            class14.field161 = null;
        }
        class303.method2130(0);
        class119.method837();
        for (int var1 = 0; var1 < 4; var1++) {
            class330.field5644[var1].method2248(arg0 ^ 0x10FF);
        }
        class68.method456((byte) -73, false);
        System.gc();
        class128.method883((byte) 123, 2);
        class155.field2797 = -1;
        class95.field1524 = false;
        class172.method1225(true, (byte) -107);
        class304.field5277 = false;
        class137.field2421 = 0;
        class324.field5526 = 0;
        class305.field5295 = 0;
        class45.field653 = 0;
        for (int var2 = 0; var2 < class121.field2075.length; var2++) {
            class121.field2075[var2] = null;
        }
        if (arg0 != 95) {
            method2105((byte) 69);
        }
        class61.field969 = 0;
        class43.field569 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class96.field1558[var3] = null;
            class209.field3740[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class159.field2863[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class182.field3333[var5][var6][var7] = null;
                }
            }
        }
        class63.method437(false);
        class196.field3542 = 0;
        class171.method1213((byte) -59);
        class101.method699(true, (byte) -114);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILik;)Lse;", line = 138)
    public static final class12 method2107(int arg0, int arg1, int arg2, class262 arg3) {
        field5184++;
        if (arg1 != 0) {
            field5188 = (class135[]) null;
        }
        return class167.method1166(arg3, arg0, (byte) -56, arg2) ? class8.method45(-17289) : null;
    }
}
