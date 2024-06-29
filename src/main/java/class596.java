import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class596 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lh;")
    private class571 field8618 = new class571(64);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lan;")
    private class21 field8615;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[F")
    public static float[] field8614 = new float[16];

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field8617 = 1401;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field8621 = 100;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Ldm;")
    public static class46 field8616 = new class46();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field8620;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)Lfu;")
    public final class328 method3522(int arg0, byte arg1) {
        field8619++;
        class571 var3 = this.field8618;
        class328 var4;
        synchronized (this.field8618) {
            if (arg1 != 14) {
                this.field8618 = null;
            }
            var4 = (class328) this.field8618.method3252((long) arg0, (byte) -85);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field8615;
        byte[] var6;
        synchronized (this.field8615) {
            var6 = this.field8615.method240(5, arg0, (byte) -124);
        }
        class328 var7 = new class328();
        if (var6 != null) {
            var7.method2021((byte) -69, new class11(var6));
        }
        class571 var8 = this.field8618;
        synchronized (this.field8618) {
            this.field8618.method3243(var7, (long) arg0, 89);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method3523(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field8620++;
        int var7 = class646.method3722(arg4, class264.field3687, class591.field8435, false);
        int var8 = class646.method3722(arg1, class264.field3687, class591.field8435, false);
        int var9 = class646.method3722(arg0, class326.field4387, field8621, false);
        int var10 = class646.method3722(arg6, class326.field4387, field8621, false);
        int var11 = class646.method3722(arg3 + arg4, class264.field3687, class591.field8435, false);
        int var12 = class646.method3722(arg1 - arg3, class264.field3687, class591.field8435, false);
        for (int var13 = var7; var13 < var11; var13++) {
            class266.method1742(26844, class182.field2580[var13], var10, arg2, var9);
        }
        if (arg5 != -99) {
            field8616 = null;
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class266.method1742(26844, class182.field2580[var14], var10, arg2, var9);
        }
        int var15 = class646.method3722(arg0 + arg3, class326.field4387, field8621, false);
        int var16 = class646.method3722(arg6 - arg3, class326.field4387, field8621, false);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class182.field2580[var17];
            class266.method1742(arg5 ^ 0xFFFF9741, var18, var15, arg2, var9);
            class266.method1742(26844, var18, var10, arg2, var16);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public static void method3524(boolean arg0) {
        if (!arg0) {
            method3523(26, -53, 12, -37, -21, (byte) -79, 75);
        }
        field8614 = null;
        field8616 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class596(class111 arg0, int arg1, class21 arg2) {
        this.field8615 = arg2;
        this.field8615.method231(5, -123);
    }
}
