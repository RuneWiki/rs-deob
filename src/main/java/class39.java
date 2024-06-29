import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class39 extends class452 {

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "Lqu;")
    public static class65 field530 = new class65(15, 0, 1, 0);

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public static int field532 = 0;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "[[Lgq;")
    public static class358[][] field531;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)V")
    public static final void method373(int arg0, int arg1, int arg2, int arg3) {
        field527++;
        class211 var4 = class452.method2749(9, 127, arg0);
        var4.method1463(0);
        var4.field3440 = arg1;
        var4.field3441 = arg3;
        if (arg2 > -46) {
            method375(-20, 72, false, 86, 46, -119);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method374(int arg0);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZIII)V")
    public static final void method375(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field529++;
        class299.field4545 = arg3;
        class412.field6175 = arg5;
        class197.field3290 = arg4;
        class121.field1828 = arg0;
        if (!arg2) {
            method373(116, -59, -29, 123);
        }
        class398.field5952 = arg1;
        if (class412.field6175 >= 100) {
            int var6 = class121.field1828 * 128 + 64;
            int var7 = class299.field4545 * 128 + 64;
            int var8 = class172.method1153(class154.field2286, -4, var6, var7) - class398.field5952;
            int var9 = var6 - class412.field6180;
            int var10 = var8 - class473.field6831;
            int var11 = var7 - class71.field1024;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class419.field6263 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class396.field5932 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class419.field6263 < 1024) {
                class419.field6263 = 1024;
            }
            class364.field5380 = 0;
            if (class419.field6263 > 3072) {
                class419.field6263 = 3072;
            }
        }
        class176.field2611 = 2;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static void method376(boolean arg0) {
        field531 = null;
        field530 = null;
        if (!arg0) {
            field532 = -117;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
    public class39(int arg0) {
        this.field528 = arg0;
    }

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "(I)Z")
    public abstract boolean method377(int arg0);
}
