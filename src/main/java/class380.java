import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class380 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Lad;")
    private class19 field5142 = new class19(64);

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "Lad;")
    public class19 field5153 = new class19(60);

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Ltf;")
    public class701 field5149;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "Ltf;")
    private class701 field5152;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Lcq;")
    public static class110 field5147 = new class110(3, 8);

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "[I")
    public static int[] field5151 = new int[200];

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public int field5154;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
    public final void method2189(int arg0, int arg1) {
        field5144++;
        this.field5154 = arg0;
        class19 var3 = this.field5153;
        synchronized (this.field5153) {
            this.field5153.method88(112);
            if (arg1 != -1) {
                this.method2194(23);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public static void method2190(int arg0) {
        field5151 = null;
        field5147 = null;
        if (arg0 < 96) {
            method2190(117);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)Lraa;")
    public final class681 method2191(boolean arg0, int arg1) {
        field5145++;
        class19 var3 = this.field5142;
        class681 var4;
        synchronized (this.field5142) {
            var4 = (class681) this.field5142.method78(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field5152;
        byte[] var6;
        synchronized (this.field5152) {
            var6 = this.field5152.method3854((byte) 32, class352.method2084((byte) -118, arg1), class162.method882(255, arg1));
        }
        class681 var7 = new class681();
        var7.field9599 = arg1;
        var7.field9616 = this;
        if (var6 != null) {
            var7.method3784(new class115(var6), -71);
        }
        class19 var8 = this.field5142;
        synchronized (this.field5142) {
            if (arg0) {
                field5151 = null;
            }
            this.field5142.method92(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    public final void method2192(int arg0) {
        field5146++;
        class19 var2 = this.field5142;
        synchronized (this.field5142) {
            this.field5142.method80((byte) 58);
        }
        class19 var3 = this.field5153;
        synchronized (this.field5153) {
            this.field5153.method80((byte) -116);
        }
        if (arg0 != -1) {
            this.method2194(108);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)V")
    public final void method2193(int arg0, byte arg1) {
        int var3 = 49 / ((-arg1 - 15) / 53);
        class19 var4 = this.field5142;
        synchronized (this.field5142) {
            this.field5142.method83((byte) -2, arg0);
        }
        field5143++;
        class19 var5 = this.field5153;
        synchronized (this.field5153) {
            this.field5153.method83((byte) -2, arg0);
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
    public final void method2194(int arg0) {
        class19 var2 = this.field5142;
        synchronized (this.field5142) {
            if (arg0 != 64) {
                this.method2192(43);
            }
            this.field5142.method88(110);
        }
        field5148++;
        class19 var3 = this.field5153;
        synchronized (this.field5153) {
            this.field5153.method88(73);
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lqh;ILtf;Ltf;)V")
    public class380(class320 arg0, int arg1, class701 arg2, class701 arg3) {
        this.field5149 = arg3;
        this.field5152 = arg2;
        int var5 = this.field5152.method3877(100) - 1;
        this.field5152.method3883(var5, 0);
    }
}
