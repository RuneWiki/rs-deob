import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class279 extends class115 {

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    private int field3930 = 4096;

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3937 = "wave2:";

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
    public static int field3935 = 104;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field3934;
        int[] var3 = super.field1340.method14(arg1 + 105, arg0);
        if (super.field1340.field35) {
            int[] var4 = this.method631(true, 0, arg0 + -1 & class315.field4488);
            int[] var5 = this.method631(true, 0, arg0);
            int[] var6 = this.method631(true, 0, class315.field4488 & arg0 + 1);
            for (int var7 = 0; ~class218.field2979 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3930;
                int var9 = (var5[class92.field1013 & var7 + 1] - var5[class92.field1013 & var7 + -1]) * this.field3930;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        if (arg1 != 0) {
            this.method149((byte) -45, (class211) null, 84);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
    public class279() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(B)V")
    public static final void method1760(byte arg0) {
        class331 var1 = class83.field936;
        synchronized (class83.field936) {
            class83.field936.method2043(-72);
        }
        ++field3931;
        if (arg0 < 45) {
            method1761(true, 113);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg0 <= 83) {
            method1763(false);
        }
        ++field3929;
        if (arg2 == 0) {
            this.field3930 = arg1.method1355(32136);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)I")
    public static final int method1761(boolean arg0, int arg1) {
        int var7 = arg1 - 1;
        ++field3933;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg0) {
            return -72;
        } else {
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)V")
    public static final void method1762(int arg0, int arg1) {
        if (arg0 <= 17) {
            field3937 = null;
        }
        ++field3936;
        class348 var2 = class385.method2464(6, 1302, arg1);
        var2.method2214((byte) 121);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V")
    public static void method1763(boolean arg0) {
        if (!arg0) {
            field3937 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIIII)V")
    public static final void method1764(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg4 <= ~class20.field209 && class407.field5914 >= arg4) {
            int var5 = class115.method640((byte) -113, class128.field1785, arg1, class143.field2029);
            int var6 = class115.method640((byte) -91, class128.field1785, arg3, class143.field2029);
            class326.method2008(arg4, (byte) -95, arg2, var5, var6);
        }
        ++field3938;
        int var7 = -30 / ((20 - arg0) / 47);
    }
}
