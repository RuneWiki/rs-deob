import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class283 implements class617 {

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Lin;")
    private class91 field3962;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lot;")
    private class590 field3957;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lin;")
    private class91 field3961;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
    public static int[] field3959 = new int[14];

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lmi;")
    public static class496 field3954;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lda;")
    private class60 field3960;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static void method1858(int arg0) {
        if (arg0 == 1) {
            field3954 = null;
            field3959 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)V")
    public final void method1475(byte arg0, boolean arg1) {
        if (arg1) {
            int var3 = this.field3957.field8064.method892(class478.field6661, this.field3957.field8047, (byte) -119) + this.field3957.field8063;
            int var4 = this.field3957.field8061.method1644(class22.field488, this.field3957.field8052, arg0 + 1644) + this.field3957.field8048;
            this.field3960.method646(null, this.field3957.field8053, this.field3957.field8056, null, this.field3957.field8051, this.field3957.field8062, this.field3957.field8052, null, var4, 0, 0, this.field3957.field8047, var3, false, this.field3957.field8059, this.field3957.field8058);
        }
        if (arg0 == -49) {
            field3953++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Z")
    public final boolean method1470(byte arg0) {
        field3955++;
        boolean var2 = true;
        if (!this.field3961.method874(false, this.field3957.field8060)) {
            var2 = false;
        }
        if (!this.field3962.method874(false, this.field3957.field8060)) {
            var2 = false;
        }
        int var3 = -53 % ((arg0 - 25) / 52);
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Z")
    public static final boolean method1859(int arg0) {
        field3956++;
        if (class591.field8067) {
            try {
                class43.method542((byte) 125, class675.field9193, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -2511) {
            method1858(-67);
        }
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public final void method1474(int arg0) {
        field3958++;
        class597 var2 = class507.method2982((byte) -45, this.field3957.field8060, this.field3962);
        if (arg0 == 10286) {
            this.field3960 = class272.field3822.method216(var2, class267.method1782(this.field3961, this.field3957.field8060), true);
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lin;Lin;Lot;)V")
    public class283(class91 arg0, class91 arg1, class590 arg2) {
        this.field3962 = arg1;
        this.field3957 = arg2;
        this.field3961 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lga;II)V")
    public static final void method1860(class404[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class404 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field5934;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field5934 > (var7 & 0x1) + var6) {
                class404 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1860(arg0, arg1, var4 - 1);
        method1860(arg0, var4 + 1, arg2);
    }
}
