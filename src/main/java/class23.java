import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 extends class272 {

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Lkr;")
    public static class486 field298 = new class486();

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "[I")
    public static int[] field306 = new int[5];

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "Ldk;")
    public static class326 field307 = new class326("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "Z")
    public static boolean field308 = false;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Lcp;")
    private class470 field297;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "[I")
    public static int[] field309;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I")
    public final int method160(int arg0, int arg1, int arg2) {
        field305++;
        if (this.field297 == null) {
            return arg1;
        } else {
            int var4 = -19 / ((arg2 + 51) / 36);
            class324 var5 = (class324) this.field297.method2761((long) arg0, (byte) -112);
            return var5 == null ? arg1 : var5.field4676;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILrp;)V")
    private final void method161(int arg0, int arg1, class276 arg2) {
        field296++;
        if (arg1 == 249) {
            int var4 = arg2.method1701(-23121);
            if (this.field297 == null) {
                int var5 = class276.method1708(1256978000, var4);
                this.field297 = new class470(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1701(-23121) == 1;
                int var8 = arg2.method1748(false);
                class238 var9;
                if (var7) {
                    var9 = new class349(arg2.method1750(-115));
                } else {
                    var9 = new class324(arg2.method1688(20402));
                }
                this.field297.method2767(-1, (long) var8, var9);
            }
        }
        if (arg0 != -28468) {
            field307 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)Lvr;")
    public static final class80 method162(int arg0) {
        field299++;
        if (arg0 != 14) {
            return null;
        } else if (class395.field5609 == null || class330.field4774 == null) {
            return null;
        } else {
            class330.field4774.method2620((byte) 71, class395.field5609);
            class80 var1 = (class80) class330.field4774.method2621(1);
            if (var1 == null) {
                return null;
            } else {
                class19 var2 = class395.field5604.method490(36, var1.field980);
                return var2 != null && var2.field256 && var2.method129((byte) 94, class395.field5602) ? var1 : class440.method2580((byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
    public static final void method163(int arg0, int arg1) {
        class250.method1565(1);
        field303++;
        int var2 = class229.field3460.method497(-124, arg1).field5671;
        if (var2 == 0) {
            return;
        }
        int var3 = 17 % ((13 - arg0) / 59);
        int var4 = class140.field1859.field6450[arg1];
        if (var2 == 5) {
            class26.field339 = var4;
        }
        if (var2 == 6) {
            class112.field1418 = var4;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method164(int arg0, String arg1, int arg2) {
        field300++;
        if (arg0 != -6) {
            return null;
        } else if (this.field297 == null) {
            return arg1;
        } else {
            class349 var4 = (class349) this.field297.method2761((long) arg2, (byte) -112);
            return var4 == null ? arg1 : var4.field5053;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public static void method165(int arg0) {
        field307 = null;
        if (arg0 != 12129) {
            field308 = false;
        }
        field298 = null;
        field306 = null;
        field309 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
    public static final void method166(int arg0, boolean arg1) {
        field301++;
        class489 var2 = class116.method731(-625541408, 14, arg0);
        if (arg1) {
            var2.method2861(-229012000);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lrp;Z)V")
    public final void method167(class276 arg0, boolean arg1) {
        field304++;
        while (true) {
            int var3 = arg0.method1701(-23121);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.method164(-89, (String) null, 73);
                    return;
                }
            }
            this.method161(-28468, var3, arg0);
        }
    }
}
