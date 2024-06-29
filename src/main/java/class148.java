import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class148 {

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Z")
    public static boolean field1997 = false;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field1999 = 0;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field1994 = 0;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field2000 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Ll;")
    public static class199 field1993;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "Lsk;")
    public static class341 field1996;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static final void method901(int arg0) {
        field1995++;
        class307.field4813.method1301(((float) class141.field1911.field6114 * 0.1F + 0.7F) * class33.field342);
        class307.field4813.method1249(class416.field6322, class80.field1185, class15.field161, (float) (class71.field1073 << 0), (float) (class401.field6041 << 0), (float) (class483.field7344 << 0));
        int var1 = 42 % ((arg0 - 33) / 46);
        class307.field4813.method1252(class137.field1885);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)I")
    public static final int method902(boolean arg0) {
        field1998++;
        if ((double) class194.field2875 == 3.0D) {
            return 37;
        } else if ((double) class194.field2875 == 4.0D) {
            return 50;
        } else if ((double) class194.field2875 == 6.0D) {
            return 75;
        } else if ((double) class194.field2875 == 8.0D) {
            return 100;
        } else {
            if (arg0) {
                field2000 = -31;
            }
            return 200;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
    public static void method903(byte arg0) {
        field1993 = null;
        int var1 = 100 % ((arg0 + 35) / 60);
        field1996 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)V")
    public static final void method904(byte arg0, int arg1) {
        class298.field4688 = arg1;
        field1992++;
        class328 var2 = class524.field7739;
        synchronized (class524.field7739) {
            class524.field7739.method2189(false);
        }
        class328 var3 = class211.field3462;
        synchronized (class211.field3462) {
            class211.field3462.method2189(false);
        }
        if (arg0 != -124) {
            method902(false);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "()V")
    public static final void method905() {
        if (class513.field7614 != null) {
            for (int var0 = 0; var0 < class513.field7614.length; var0++) {
                for (int var1 = 0; var1 < class252.field4075; var1++) {
                    for (int var2 = 0; var2 < class131.field1773; var2++) {
                        if (class513.field7614[var0][var1][var2] != null) {
                            class513.field7614[var0][var1][var2].method2612((byte) 0);
                        }
                        class513.field7614[var0][var1][var2] = null;
                    }
                }
            }
        }
        class513.field7614 = null;
        class244.field3956 = null;
        if (class165.field2386 != null) {
            for (int var3 = 0; var3 < class165.field2386.length; var3++) {
                for (int var4 = 0; var4 < class252.field4075; var4++) {
                    for (int var5 = 0; var5 < class131.field1773; var5++) {
                        if (class165.field2386[var3][var4][var5] != null) {
                            class165.field2386[var3][var4][var5].method2612((byte) 0);
                        }
                        class165.field2386[var3][var4][var5] = null;
                    }
                }
            }
        }
        class165.field2386 = null;
        class103.field1520 = null;
        class217.field3699 = null;
        class53.field732 = null;
        class360.field5584 = 0;
        if (class222.field3745 != null) {
            for (int var6 = 0; var6 < class360.field5584; var6++) {
                class222.field3745[var6] = null;
            }
        }
        if (class137.field1880 != null) {
            for (int var7 = 0; var7 < class518.field7686; var7++) {
                class137.field1880[var7] = null;
            }
            class518.field7686 = 0;
        }
        if (class60.field950 != null) {
            for (int var8 = 0; var8 < class368.field5683; var8++) {
                class60.field950[var8] = null;
            }
            for (int var9 = 0; var9 < class297.field4675; var9++) {
                for (int var10 = 0; var10 < class252.field4075; var10++) {
                    for (int var11 = 0; var11 < class131.field1773; var11++) {
                        class311.field4882[var9][var10][var11] = 0L;
                    }
                }
            }
            class368.field5683 = 0;
        }
        class122.field1662 = null;
        class329.method2205((byte) 24);
        class92.field1348.method2618(-9974);
        class413.field6247 = null;
        class476.field7285 = null;
        class350.field5453 = null;
        class409.field6200 = null;
        class24.field274 = null;
        class104.field1523 = null;
    }
}
