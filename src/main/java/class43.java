import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class43 extends class142 {

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "Ldd;")
    public static class34 field704 = new class34(128);

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "Lai;")
    private static class10 field707 = class44.method278("Unable to connect)3", -104);

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Lai;")
    public static class10 field710 = field707;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "Lai;")
    public static class10 field712 = field707;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "Lai;")
    public static class10 field708 = class44.method278("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", -89);

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(BII)I")
    private final int method271(byte arg0, int arg1, int arg2) {
        ++field713;
        int var4 = arg1 * 57 + arg2;
        if (arg0 >= -90) {
            field704 = null;
        }
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIZ)V")
    public static final void method272(int arg0, int arg1, int arg2, boolean arg3) {
        ++field711;
        if (arg3) {
            if (~arg0 <= -129 && arg2 >= 128 && arg0 <= 13056 && arg2 <= 13056) {
                int var4 = -arg1 + class145.method1003((byte) -110, arg0, arg2, class42.field687);
                int var5 = arg2 - class34.field520;
                int var6 = var4 - class14.field226;
                int var7 = class113.field2124[class207.field4044];
                int var8 = class113.field2124[class120.field2306];
                int var9 = arg0 - class119.field2294;
                int var10 = class113.field2120[class207.field4044];
                int var11 = class113.field2120[class120.field2306];
                int var12 = var5 * var7 + var9 * var10 >> 16;
                int var13 = var5 * var10 + -(var7 * var9) >> 16;
                int var15 = var6 * var11 + -(var8 * var13) >> 16;
                int var16 = var6 * var8 + var11 * var13 >> 16;
                if (~var16 <= -51) {
                    class190.field3619 = (var12 << 9) / var16 + 256;
                    class33.field495 = 167 - -((var15 << 9) / var16);
                } else {
                    class33.field495 = -1;
                    class190.field3619 = -1;
                }
            } else {
                class190.field3619 = -1;
                class33.field495 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class43() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZZZI)Lmb;")
    public static final class111 method273(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        ++field709;
        if (arg4 != 7128) {
            field708 = null;
        }
        class87 var5 = null;
        if (class32.field486 != null) {
            var5 = new class87(arg0, class32.field486, class171.field3301[arg0], 1000000);
        }
        return new class111(var5, class158.field3053, arg0, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(Z)V")
    public static void method274(boolean arg0) {
        field707 = null;
        if (arg0) {
            field707 = null;
        }
        field704 = null;
        field708 = null;
        field712 = null;
        field710 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            int var4 = class13.field212[arg1];
            for (int var5 = 0; ~var5 > ~class133.field2499; ++var5) {
                var3[var5] = this.method271((byte) -102, var4, class79.field1395[var5]) % 4096;
            }
        }
        ++field706;
        return arg0 ? null : var3;
    }
}
