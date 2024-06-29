import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class145 {

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field2386 = 0;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Z")
    public static boolean field2388 = true;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field2389 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Lhi;")
    public static final class170 method1071(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class170 var4 = var3.field2816;
            var3.field2816 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([I[I[ILvd;I)V")
    public static final void method1072(int[] arg0, int[] arg1, int[] arg2, class307 arg3, int arg4) {
        field2383++;
        if (arg4 > -71) {
            field2385 = 44;
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var6 != 0 && var9 < arg3.field799.length; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg3.field799[var9] = null;
                    } else {
                        class163 var10 = class34.method211(var7, 3);
                        int var11 = var10.field2658;
                        class313 var12 = arg3.field799[var9];
                        if (var12 != null) {
                            if (var12.field5040 == var7) {
                                if (var11 == 0) {
                                    var12 = arg3.field799[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5034 = var8;
                                    var12.field5045 = 1;
                                    var12.field5052 = 0;
                                    var12.field5053 = 0;
                                    var12.field5051 = 0;
                                    class131.method980(false, arg3.field771, arg3.field715, 0, (byte) -104, var10);
                                } else if (var11 == 2) {
                                    var12.field5053 = 0;
                                }
                            } else if (var10.field2662 >= class34.method211(var12.field5040, 3).field2662) {
                                var12 = arg3.field799[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class313 var13 = arg3.field799[var9] = new class313();
                            var13.field5051 = 0;
                            var13.field5052 = 0;
                            var13.field5040 = var7;
                            var13.field5053 = 0;
                            var13.field5034 = var8;
                            var13.field5045 = 1;
                            class131.method980(false, arg3.field771, arg3.field715, 0, (byte) -82, var10);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BIILbb;)V")
    public static final void method1073(byte arg0, int arg1, int arg2, class49 arg3) {
        class294.field4831.method317(arg0 + 174);
        field2384++;
        if (class72.field1256) {
            return;
        }
        if (arg0 != -62) {
            field2390 = -115;
        }
        for (class206 var4 = (class206) arg3.method309(0); var4 != null; var4 = (class206) arg3.method312((byte) -63)) {
            class195 var5 = class22.method146((byte) -44, var4.field3327);
            if (class299.method2046(true, var5)) {
                class130.method971(arg1, -431, var4, var5, arg2);
                if (var4.field3322) {
                    class274.method1930((byte) -115, var4, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIB)V")
    public static final void method1074(int arg0, int arg1, byte arg2) {
        field2382++;
        if (arg2 != 92) {
            field2388 = false;
        }
        if (class4.field116 != arg1) {
            class207.field3415 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class207.field3415[var3] = (var3 << 12) / arg1;
            }
            class4.field116 = arg1;
            class103.field1644 = arg1 - 1;
            class109.field1802 = arg1 * 32;
        }
        if (class16.field318 == arg0) {
            return;
        }
        if (class4.field116 == arg0) {
            class66.field1112 = class207.field3415;
        } else {
            class66.field1112 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class66.field1112[var4] = (var4 << 12) / arg0;
            }
        }
        class16.field318 = arg0;
        class107.field1749 = arg0 - 1;
    }
}
