import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class678 implements Runnable {

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "[Lqn;")
    public volatile class65[] field9466 = new class65[2];

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Z")
    public volatile boolean field9464 = false;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Z")
    public volatile boolean field9467 = false;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field9468 = 0;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field9461;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field9465;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Lfl;")
    public class739 field9462;

    @OriginalMember(owner = "client!gi", name = "run", descriptor = "()V")
    public final void run() {
        this.field9467 = true;
        field9459++;
        try {
            while (!this.field9464) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class65 var2 = this.field9466[var1];
                    if (var2 != null) {
                        var2.method507((byte) -122);
                    }
                }
                class267.method1599(0, 10L);
                class407.method2351(this.field9462, 31668, null);
            }
        } catch (Exception var9) {
            class760.method4223(var9, -123, null);
        } finally {
            Object var6 = null;
            this.field9467 = false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lha;BLuca;Lbq;)V")
    public static final void method3850(class60 arg0, byte arg1, class513 arg2, class292 arg3) {
        field9460++;
        class680 var4 = arg3.method1738(arg0, (byte) 92);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method674();
        if (var5 < var4.method676()) {
            var5 = var4.method676();
        }
        byte var6 = 10;
        int var7 = arg2.field6938;
        if (arg1 <= 7) {
            field9463 = 104;
        }
        int var8 = arg2.field6943;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field3901 != null) {
            var9 = class86.field1180.method2217(arg3.field3901, class614.field8609, null, null, -1);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class614.field8609[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class660.field9208.method774(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class660.field9208.method778() * var9 + (class660.field9208.method777() / 2);
        }
        int var15 = var5 / 2 + arg2.field6938;
        if (class642.field8958 + var5 > var7) {
            var15 = var10 / 2 + var6 + var5 / 2 + class642.field8958 + 5;
            var7 = class642.field8958;
        } else if (var7 > (class642.field8965 - var5)) {
            var15 = class642.field8965 - var5 / 2 - (var10 / 2 + var6) - 5;
            var7 = class642.field8965 - var5;
        }
        int var16 = arg2.field6943;
        if ((class642.field8949 + var5) > var8) {
            var16 = var5 / 2 + var6 + class642.field8949;
            var8 = class642.field8949;
        } else if ((class642.field8966 - var5) < var8) {
            var16 = class642.field8966 - var6 - var11 - (var5 / 2);
            var8 = class642.field8966 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg2.field6938), (double) (var8 - arg2.field6943)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method3857((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field3901 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var9 * class660.field9208.method778() + var16 + 3;
            var20 = var18 + var10 + 10;
            if (arg3.field3859 != 0) {
                arg0.method368(var20 - var18, -var16 + var21, var16, arg3.field3859, (byte) -66, var18);
            }
            if (arg3.field3872 != 0) {
                arg0.method393(true, var21 - var16, var20 - var18, arg3.field3872, var18, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class614.field8609[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class660.field9208.method779(arg0, var23, var15, var16, arg3.field3894, true);
                var16 += class660.field9208.method778();
            }
        }
        if (arg3.field3879 == -1 && arg3.field3901 == null) {
            return;
        }
        class617 var24 = new class617(arg2);
        int var25 = var5 >> 1;
        var24.field8657 = var21;
        var24.field8658 = var19;
        var24.field8654 = var20;
        var24.field8656 = var18;
        var24.field8652 = var8 + var25;
        var24.field8659 = var7 + var25;
        var24.field8647 = var7 - var25;
        var24.field8651 = var8 - var25;
        class600.field8354.method725(var24, -20911);
    }
}
