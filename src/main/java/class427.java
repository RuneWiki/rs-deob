import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class427 {

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "Lad;")
    private class19 field6074 = new class19(64);

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "Lad;")
    public class19 field6077 = new class19(2);

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "Ltf;")
    public class701 field6072;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "Ltf;")
    private class701 field6076;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BI)V")
    public final void method2464(byte arg0, int arg1) {
        class19 var3 = this.field6074;
        synchronized (this.field6074) {
            this.field6074.method83((byte) -2, arg1);
        }
        field6069++;
        class19 var4 = this.field6077;
        synchronized (this.field6077) {
            this.field6077.method83((byte) -2, arg1);
            int var5 = -63 % ((arg0 - 35) / 33);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public final void method2465(int arg0) {
        field6068++;
        class19 var2 = this.field6074;
        synchronized (this.field6074) {
            this.field6074.method88(80);
        }
        class19 var3 = this.field6077;
        synchronized (this.field6077) {
            if (arg0 <= -66) {
                this.field6077.method88(78);
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
    public final void method2466(int arg0) {
        class19 var2 = this.field6074;
        synchronized (this.field6074) {
            if (arg0 >= -68) {
                return;
            }
            this.field6074.method80((byte) -95);
        }
        field6070++;
        class19 var3 = this.field6077;
        synchronized (this.field6077) {
            this.field6077.method80((byte) -75);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)[B")
    public static final byte[] method2467(int arg0, int arg1) {
        if (arg0 != 24122) {
            return null;
        }
        field6071++;
        class200 var2 = (class200) class210.field2540.method1927((long) arg1, 0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class304.method1756(var4, var7, -1304107232);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class200(var3);
            class210.field2540.method1928(arg0 - 23996, var2, (long) arg1);
        }
        return var2.field2356;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)Z")
    public static final boolean method2468(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            field6073++;
            return (arg2 & 0x84080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(II)Lqba;")
    public final class590 method2469(int arg0, int arg1) {
        field6075++;
        class19 var3 = this.field6074;
        class590 var4;
        synchronized (this.field6074) {
            var4 = (class590) this.field6074.method78(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field6076;
        byte[] var6;
        synchronized (this.field6076) {
            var6 = this.field6076.method3854((byte) 65, 33, arg0);
        }
        class590 var7 = new class590();
        var7.field8335 = this;
        if (var6 != null) {
            var7.method3326(new class115(var6), (byte) 85);
        }
        class19 var8 = this.field6074;
        synchronized (this.field6074) {
            this.field6074.method92(1, (long) arg0, var7);
            if (arg1 >= -118) {
                this.method2469(-85, -117);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lqh;ILtf;Ltf;)V")
    public class427(class320 arg0, int arg1, class701 arg2, class701 arg3) {
        this.field6072 = arg3;
        this.field6076 = arg2;
        this.field6076.method3883(33, 0);
    }
}
