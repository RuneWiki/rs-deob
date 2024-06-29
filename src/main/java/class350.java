import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class350 extends class739 {

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
    private int field5192 = 0;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    private int field5193 = 20;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
    private int field5196 = 1365;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    private int field5195 = 0;

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
    public static int field5200 = 1406;

    @OriginalMember(owner = "client!bo", name = "G", descriptor = "D")
    public static double field5199;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "F")
    public static float field5204;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!bo", name = "I", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "[Luv;")
    public static class750[] field5202;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 3)
    public static final void method2237(int arg0, String arg1, boolean arg2) {
        if (arg2) {
            field5202 = null;
        }
        ++field5198;
        class503 var3 = class512.method3112(3, arg0, 0);
        var3.method3075((byte) 126);
        var3.field7314 = arg1;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V", line = 19)
    public class350() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lsl;IB)V", line = 31)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field5205;
        if (arg2 != 1) {
            this.field5195 = 64;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 == 3) {
                        this.field5195 = arg0.method2882(arg2 + -2);
                    }
                } else {
                    this.field5192 = arg0.method2882(-1);
                }
            } else {
                this.field5193 = arg0.method2882(-1);
            }
        } else {
            this.field5196 = arg0.method2882(-1);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILqk;)Lqk;", line = 85)
    public static final class146 method2238(int arg0, class146 arg1) {
        ++field5201;
        if (arg0 != 100) {
            field5199 = -0.98986204879217D;
        }
        class146 var2 = client.method2724(arg1);
        if (var2 == null) {
            var2 = arg1.field2061;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)I", line = 102)
    public static final int method2239(int arg0) {
        ++field5194;
        class543 var1 = class211.field3164;
        boolean var2 = false;
        if (class243.field3580.field7975.method3775(false) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class68.method612(0, false, 0, (class423) null, var3, (class267) null);
            var2 = true;
        }
        long var4 = class465.method2818(255);
        for (int var6 = 0; ~var6 > -10001; ++var6) {
            var1.method234(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (-var4 + class465.method2818(255));
        var1.method3263((byte) -123, 0, arg0, 100, 0, -16777216);
        if (var2) {
            var1.method3266(1);
        }
        return var7;
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(Z)V", line = 152)
    public static void method2240(boolean arg0) {
        if (arg0) {
            field5204 = 1.8383213F;
        }
        field5202 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)[I", line = 171)
    public final int[] method445(boolean arg0, int arg1) {
        ++field5203;
        if (arg0) {
            return null;
        } else {
            int[] var3 = super.field10317.method1042(0, arg1);
            if (super.field10317.field2170) {
                for (int var4 = 0; ~class399.field5703 < ~var4; ++var4) {
                    int var5 = (class604.field8580[var4] << 12) / this.field5196 + this.field5192;
                    int var6 = (class19.field185[arg1] << 12) / this.field5196 - -this.field5195;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (var11 - -var12 < 16384 && ~var13 > ~this.field5193) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var7 + var11 - var12;
                        var11 = var9 * var9 >> 12;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = var13 >= this.field5193 + -1 ? 0 : (var13 << 12) / this.field5193;
                }
            }
            return var3;
        }
    }
}
