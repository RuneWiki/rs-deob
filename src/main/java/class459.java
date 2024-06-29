import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class459 {

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Z")
    public static boolean field6413 = false;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Lhb;")
    public static class250 field6414 = new class250(60, -1);

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "S")
    public static short field6419 = 320;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "Lpi;")
    public static class340 field6420 = new class340(102, -2);

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "Z")
    public static boolean field6421 = false;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "Lup;")
    public static class275 field6418;

    @OriginalMember(owner = "client!gp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6415++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
    public static void method2710(byte arg0) {
        field6418 = null;
        int var1 = -6 / ((arg0 - 40) / 60);
        field6414 = null;
        field6420 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "()V")
    public static final void method2711() {
        if (class188.field2468 != null) {
            for (int var0 = 0; var0 < class188.field2468.length; var0++) {
                for (int var1 = 0; var1 < class166.field2155; var1++) {
                    for (int var2 = 0; var2 < class13.field230; var2++) {
                        if (class188.field2468[var0][var1][var2] != null) {
                            class188.field2468[var0][var1][var2].method3027(123);
                        }
                        class188.field2468[var0][var1][var2] = null;
                    }
                }
            }
        }
        class188.field2468 = null;
        class405.field5436 = null;
        if (class354.field4550 != null) {
            for (int var3 = 0; var3 < class354.field4550.length; var3++) {
                for (int var4 = 0; var4 < class166.field2155; var4++) {
                    for (int var5 = 0; var5 < class13.field230; var5++) {
                        if (class354.field4550[var3][var4][var5] != null) {
                            class354.field4550[var3][var4][var5].method3027(119);
                        }
                        class354.field4550[var3][var4][var5] = null;
                    }
                }
            }
        }
        class354.field4550 = null;
        class283.field3620 = null;
        class470.field6877 = null;
        class92.field1285 = null;
        class292.field3750 = 0;
        if (class301.field3904 != null) {
            for (int var6 = 0; var6 < class292.field3750; var6++) {
                class301.field3904[var6] = null;
            }
        }
        if (class179.field2305 != null) {
            for (int var7 = 0; var7 < class171.field2218; var7++) {
                class179.field2305[var7] = null;
            }
            class171.field2218 = 0;
        }
        if (class121.field1683 != null) {
            for (int var8 = 0; var8 < class278.field3564; var8++) {
                class121.field1683[var8] = null;
            }
            for (int var9 = 0; var9 < class412.field5495; var9++) {
                for (int var10 = 0; var10 < class166.field2155; var10++) {
                    for (int var11 = 0; var11 < class13.field230; var11++) {
                        class83.field1033[var9][var10][var11] = 0L;
                    }
                }
            }
            class278.field3564 = 0;
        }
        class180.field2347 = null;
        class495.method2960(true);
        class193.field2500.method2128((byte) 80);
        class507.field7443 = null;
        class203.field2667 = null;
        class187.field2443 = null;
        class522.field7748 = null;
        class370.field4774 = null;
        class372.field4831 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)Lef;")
    public static final class436 method2712(int arg0, int arg1, int arg2) {
        field6416++;
        class436 var3 = (class436) class56.field751.method2085((long) arg1 | (long) arg0 << 32, -5423);
        if (arg2 != -1759243680) {
            method2711();
        }
        if (var3 == null) {
            var3 = new class436(arg0, arg1);
            class56.field751.method2096(var3.field7456, var3, (byte) 76);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(II)V")
    public class459(int arg0, int arg1) {
    }
}
