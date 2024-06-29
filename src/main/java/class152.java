import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class152 extends class217 {

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public int field2284 = -1;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public int field2282 = 0;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "Lek;")
    public static class184 field2290 = null;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "[I")
    public static int[] field2291 = new int[5];

    @OriginalMember(owner = "client!in", name = "w", descriptor = "[I")
    public static int[] field2293 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!in", name = "s", descriptor = "[Le;")
    public static class160[] field2289 = new class160[14];

    @OriginalMember(owner = "client!in", name = "q", descriptor = "Z")
    public static boolean field2287 = false;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public int field2278;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public int field2280;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public int field2281;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public int field2285;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public int field2286;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    public int field2288;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public int field2295;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "Lcb;")
    public static class283 field2283;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "[[[I")
    public static int[][][] field2294;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 7)
    public static void method1120(int arg0) {
        field2293 = null;
        if (arg0 != -22216) {
            method1120(-36);
        }
        field2290 = null;
        field2294 = (int[][][]) null;
        field2289 = null;
        field2291 = null;
        field2283 = null;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V", line = 22)
    public static final void method1121(byte arg0) {
        field2296++;
        if (!class36.field534 || class287.field4433) {
            return;
        }
        class99[][][] var1 = class250.field3746;
        if (arg0 != 99) {
            return;
        }
        for (int var2 = 0; var2 < var1.length; var2++) {
            class99[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class99 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field1472 != null && var6.field1472.field2560 instanceof class165) {
                            class165 var7 = (class165) var6.field1472.field2560;
                            if ((Long.MIN_VALUE & var6.field1472.field2568) == 0L) {
                                var7.method1185(false, true, true, true, false, true, true);
                            } else {
                                var7.method1185(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field1474 != null) {
                            if (var6.field1474.field4563 instanceof class165) {
                                class165 var8 = (class165) var6.field1474.field4563;
                                if ((var6.field1474.field4550 & Long.MIN_VALUE) == 0L) {
                                    var8.method1185(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1185(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field1474.field4549 instanceof class165) {
                                class165 var9 = (class165) var6.field1474.field4549;
                                if ((var6.field1474.field4550 & Long.MIN_VALUE) == 0L) {
                                    var9.method1185(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1185(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field1486 != null) {
                            if (var6.field1486.field98 instanceof class165) {
                                class165 var10 = (class165) var6.field1486.field98;
                                if ((Long.MIN_VALUE & var6.field1486.field91) == 0L) {
                                    var10.method1185(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1185(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field1486.field94 instanceof class165) {
                                class165 var11 = (class165) var6.field1486.field94;
                                if ((var6.field1486.field91 & Long.MIN_VALUE) == 0L) {
                                    var11.method1185(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1185(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field1488; var12++) {
                            if (var6.field1471[var12].field1326 instanceof class165) {
                                class165 var13 = (class165) var6.field1471[var12].field1326;
                                if ((Long.MIN_VALUE & var6.field1471[var12].field1327) == 0L) {
                                    var13.method1185(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1185(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class287.field4433 = true;
    }
}
