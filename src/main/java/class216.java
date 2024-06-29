import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class216 {

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lnj;")
    private class162 field3004 = new class162(64);

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Lmg;")
    private class101 field3006;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Lmg;")
    public class101 field3013;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field3005 = 0;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field3009 = 0;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "[I")
    public static int[] field3011 = new int[8];

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lwj;")
    public static class270 field3003 = new class270(83, 2);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "F")
    public static float field3002;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lg;", line = 8)
    public final class107 method1335(int arg0, int arg1) {
        field3007++;
        class162 var3 = this.field3004;
        class107 var4;
        synchronized (this.field3004) {
            var4 = (class107) this.field3004.method1073((long) arg1, false);
            int var5 = -46 % ((-arg0 - 8) / 57);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field3006.method727(arg1, 3, 54);
        class107 var7 = new class107();
        var7.field1608 = this;
        if (var6 != null) {
            var7.method784(new class391(var6), -15);
        }
        class162 var8 = this.field3004;
        synchronized (this.field3004) {
            this.field3004.method1072((long) arg1, var7, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V", line = 37)
    public final void method1336(int arg0, int arg1) {
        if (arg0 < 11) {
            this.method1341(-73);
        }
        field3012++;
        class162 var3 = this.field3004;
        synchronized (this.field3004) {
            this.field3004.method1065((byte) -95, arg1);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 55)
    public static void method1337(byte arg0) {
        if (arg0 != 59) {
            field3008 = 76;
        }
        field3003 = null;
        field3011 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)I", line = 67)
    public static final int method1338(int arg0, int arg1, int arg2) {
        if (arg1 != 83) {
            return -92;
        }
        field3000++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V", line = 95)
    public final void method1339(byte arg0) {
        if (arg0 != 109) {
            return;
        }
        class162 var2 = this.field3004;
        synchronized (this.field3004) {
            this.field3004.method1068(0);
        }
        field3015++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[FI)[F", line = 112)
    public static final float[] method1340(int arg0, float[] arg1, int arg2) {
        field2999++;
        float[] var3 = new float[arg2];
        class91.method677(arg1, arg0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 123)
    public final void method1341(int arg0) {
        class162 var2 = this.field3004;
        synchronized (this.field3004) {
            this.field3004.method1066(4080);
            if (arg0 != 1) {
                method1337((byte) 68);
            }
        }
        field3001++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lal;ILmg;Lmg;)V", line = 155)
    public class216(class66 arg0, int arg1, class101 arg2, class101 arg3) {
        this.field3006 = arg2;
        this.field3013 = arg3;
        this.field3006.method753(3, -111);
    }
}
