import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class18 {

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "[Lqb;")
    public class59[] field18;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)Z")
    public final boolean method10(int arg0, boolean arg1) {
        field20++;
        if (arg1) {
            this.field18 = null;
        }
        return this.field18[arg0].field968;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Z")
    public final boolean method11(int arg0, byte arg1) {
        int var3 = -105 % ((-arg1 - 26) / 48);
        field16++;
        return this.field18[arg0].field967;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lhc;[Ljb;Z)V")
    public static final void method12(class235 arg0, class276[] arg1, boolean arg2) {
        class275.field4382 = arg0;
        field17++;
        class251.field4047 = arg1;
        class152.field2378 = new boolean[class251.field4047.length];
        if (!arg2) {
            return;
        }
        class244.field3974.method290(-7981);
        int var3 = class275.field4382.method1603(-121, "details");
        int[] var4 = class275.field4382.method1611(var3, 0);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class244.field3974.method281(1, (long) var4[var5], class208.method1400(var4[var5], 1, new class88(class275.field4382.method1590(var4[var5], (byte) -25, var3))));
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILsd;Lma;ILwc;I)V")
    public static final void method13(int arg0, int arg1, int arg2, class45 arg3, class193 arg4, int arg5, class236 arg6, int arg7) {
        class11 var8 = new class11();
        var8.field185 = arg0 * 128;
        var8.field182 = arg5 * 128;
        var8.field186 = arg1;
        if (arg4 != null) {
            var8.field204 = arg4.field3003;
            var8.field188 = arg4.field3001;
            var8.field197 = arg4;
            var8.field184 = arg4.field3007;
            var8.field196 = arg4.field2999 * 128;
            int var9 = arg4.field3063;
            var8.field198 = arg4.field3056;
            var8.field205 = arg4.field3064;
            int var10 = arg4.field3028;
            if (arg2 == 1 || arg2 == 3) {
                var9 = arg4.field3028;
                var10 = arg4.field3063;
            }
            var8.field190 = (arg5 + var9) * 128;
            var8.field202 = (arg0 + var10) * 128;
            if (arg4.field2997 != null) {
                var8.field200 = true;
                var8.method108(-128);
            }
            if (var8.field205 != null) {
                var8.field203 = var8.field204 + ((int) (Math.random() * (double) (var8.field198 - var8.field204)));
            }
            class185.field2857.method1219(false, var8);
        } else if (arg3 != null) {
            class60 var11 = arg3.field645;
            var8.field201 = arg3;
            if (var11.field1020 != null) {
                var8.field200 = true;
                var11 = var11.method459(true);
            }
            if (var11 != null) {
                var8.field190 = (var11.field977 + arg5) * 128;
                var8.field202 = (var11.field977 + arg0) * 128;
                var8.field188 = class185.method1248(-1, arg3);
                var8.field184 = var11.field1031;
                var8.field196 = var11.field991 * 128;
            }
            class102.field1699.method1219(false, var8);
        } else if (arg6 != null) {
            var8.field193 = arg6;
            var8.field190 = (arg6.method971(65535) + arg5) * 128;
            var8.field202 = (arg6.method971(65535) + arg0) * 128;
            var8.field188 = class90.method693(16, arg6);
            var8.field196 = arg6.field3812 * 128;
            var8.field184 = arg6.field3822;
            class30.field444.method281(1, class148.method1000(arg6.field3803, 934), var8);
        }
        if (arg7 <= 100) {
            method12((class235) null, (class276[]) null, true);
        }
        field19++;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lhc;Lhc;IZ)V")
    public class3(class235 arg0, class235 arg1, int arg2, boolean arg3) {
        class180 var5 = new class180();
        int var6 = arg0.method1616(arg2, -12772);
        this.field18 = new class59[var6];
        int[] var7 = arg0.method1611(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1590(var7[var8], (byte) -25, arg2);
            class209 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class209 var12 = (class209) var5.method1221(124); var12 != null; var12 = (class209) var5.method1227(-10626)) {
                if (var12.field3260 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1593(110, 0, var11);
                } else {
                    var13 = arg1.method1593(104, var11, 0);
                }
                var10 = new class209(var11, var13);
                var5.method1219(false, var10);
            }
            this.field18[var7[var8]] = new class59(var9, var10);
        }
    }
}
