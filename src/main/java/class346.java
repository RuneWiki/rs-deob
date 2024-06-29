import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class346 {

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lqt;")
    public class297 field4479 = new class297();

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "F")
    public static float field4483;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lqt;")
    private class297 field4484;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I", line = 8)
    public final int method2027(int arg0) {
        field4476++;
        int var2 = 0;
        if (arg0 <= 59) {
            return -69;
        }
        class297 var3 = this.field4479.field3857;
        while (this.field4479 != var3) {
            var3 = var3.field3857;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)Lqt;", line = 30)
    public final class297 method2028(int arg0) {
        field4474++;
        class297 var2 = this.field4479.field3857;
        if (arg0 != -9254) {
            this.method2033((byte) -37);
        }
        if (this.field4479 == var2) {
            this.field4484 = null;
            return null;
        } else {
            this.field4484 = var2.field3857;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)I", line = 52)
    public static final int method2029(int arg0) {
        int var1 = -42 / ((arg0 + 76) / 44);
        field4482++;
        return class125.field1502;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 195)
    public class346() {
        this.field4479.field3857 = this.field4479;
        this.field4479.field3855 = this.field4479;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 69)
    public static final void method2030(byte arg0) {
        class114 var1 = class618.field8650;
        synchronized (class618.field8650) {
            if (arg0 >= -18) {
                field4483 = 0.4206482F;
            }
            class618.field8650.method776((byte) 123);
        }
        field4480++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILqt;)V", line = 85)
    public final void method2031(int arg0, class297 arg1) {
        if (arg1.field3855 != null) {
            arg1.method1768((byte) 125);
        }
        field4475++;
        arg1.field3855 = this.field4479.field3855;
        arg1.field3857 = this.field4479;
        arg1.field3855.field3857 = arg1;
        if (arg0 != 1) {
            field4483 = 0.4709422F;
        }
        arg1.field3857.field3855 = arg1;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Lqt;", line = 104)
    public final class297 method2032(int arg0) {
        field4477++;
        class297 var2 = this.field4484;
        if (this.field4479 == var2) {
            this.field4484 = null;
            return null;
        }
        if (arg0 != 26764) {
            this.method2031(-116, null);
        }
        this.field4484 = var2.field3857;
        return var2;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V", line = 125)
    public final void method2033(byte arg0) {
        while (true) {
            class297 var2 = this.field4479.field3857;
            if (this.field4479 == var2) {
                if (arg0 != 45) {
                    field4483 = -0.5074698F;
                }
                field4481++;
                this.field4484 = null;
                return;
            }
            var2.method1768((byte) 125);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III[BIII)Z", line = 146)
    public static final boolean method2034(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field4478++;
        int var7 = arg5 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg1 + arg4 + arg6) / arg4);
        int var10 = -((arg5 - (1 - arg4)) / arg4);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg2] == 0) {
                    return true;
                }
                arg2 += arg4;
            }
            int var13 = arg2 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg2 = arg0 + var13;
        }
        return false;
    }
}
