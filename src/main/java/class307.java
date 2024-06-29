import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class307 {

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public int field4370 = 2048;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public int field4371 = 2048;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public int field4366 = 0;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public int field4368 = 0;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "S")
    public static short field4365 = 320;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "Lku;")
    public static class232 field4375 = new class232(64);

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "Ldt;")
    public static class145 field4372;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "Lii;")
    public static class358 field4374;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Lwh;")
    public static class90 field4373;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)Lwm;")
    public static final class364 method1899(int arg0, int arg1, int arg2) {
        class88 var3 = class330.field4786[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1066;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILrp;)V")
    private final void method1900(int arg0, int arg1, class276 arg2) {
        if (arg1 != 31) {
            this.field4368 = -125;
        }
        if (arg0 == 1) {
            this.field4368 = arg2.method1701(-23121);
        } else if (arg0 == 2) {
            this.field4370 = arg2.method1729(65280);
        } else if (arg0 == 3) {
            this.field4371 = arg2.method1729(65280);
        } else if (arg0 == 4) {
            this.field4366 = arg2.method1702(arg1 - 96);
        }
        field4369++;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(JIII)V")
    public static final void method1901(long arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 20710) {
            method1901(97L, -120, -36, 91);
        }
        field4364++;
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = ((int) arg0 & 0x331674) >> 20;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class279.method1768(true, var5, false, 0, 0, arg1, var6, arg2, 0);
            return;
        }
        class453 var8 = class156.field2325.method808(var7, arg3 ^ 0x50E6);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field6385;
            var9 = var8.field6325;
        } else {
            var9 = var8.field6385;
            var10 = var8.field6325;
        }
        int var11 = var8.field6349;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class279.method1768(true, 0, false, var9, var11, arg1, 0, arg2, var10);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lrp;B)V")
    public final void method1902(class276 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1701(-23121);
            if (var3 == 0) {
                field4367++;
                int var4 = -76 / ((arg1 - 6) / 58);
                return;
            }
            this.method1900(var3, 31, arg0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
    public static void method1903(int arg0) {
        if (arg0 != -26858) {
            field4373 = null;
        }
        field4374 = null;
        field4375 = null;
        field4372 = null;
        field4373 = null;
    }
}
