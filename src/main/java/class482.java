import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class482 {

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "B")
    private byte field7092;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public int field7082;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public int field7085;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public int field7086;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public int field7080;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public int field7093;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "Lbf;")
    public static class372 field7087 = new class372(11, 18);

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "I")
    public static int field7096 = 1403;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "Lgk;")
    public static class331 field7095 = new class331("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 9)
    public static void method2902(int arg0) {
        field7095 = null;
        field7087 = null;
        if (arg0 != 8) {
            method2906(-105, 71);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)I", line = 21)
    public final int method2903(byte arg0) {
        if (arg0 != -111) {
            this.method2903((byte) -47);
        }
        field7083++;
        return this.field7092 & 0x7;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)I", line = 42)
    public final int method2904(byte arg0) {
        if (arg0 < 86) {
            method2908(-49, (byte) 104);
        }
        field7094++;
        return (this.field7092 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZIZB)V", line = 54)
    public static final void method2905(int arg0, boolean arg1, int arg2, boolean arg3, byte arg4) {
        if (arg4 != 90) {
            method2909(-12);
        }
        class291.method1836(0, arg2, (byte) 42, arg3, class371.field5520.length - 1, arg1, arg0);
        field7088++;
        class299.field4298 = null;
        class401.field5949 = 0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)V", line = 67)
    public static final void method2906(int arg0, int arg1) {
        int var2 = 95 / ((arg1 + 32) / 57);
        field7084++;
        class215 var3 = class171.method1208(arg0, (byte) 119, 1);
        var3.method1469((byte) -93);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZB[BLfd;IIII)Lps;", line = 83)
    public static final class63 method2907(boolean arg0, byte arg1, byte[] arg2, class365 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 > -113) {
            field7095 = null;
        }
        field7089++;
        if (!arg3.field5436 && (!class305.method1900(200, arg4) || !class305.method1900(200, arg5))) {
            return arg3.field5408 ? new class63(arg3, 34037, arg6, arg4, arg5, arg0, arg2, arg7) : new class63(arg3, arg6, arg4, arg5, class118.method934(arg4, 269173057), class118.method934(arg5, 269173057), arg2, arg7);
        } else {
            return new class63(arg3, 3553, arg6, arg4, arg5, arg0, arg2, arg7);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)Lfk;", line = 110)
    public static final class462 method2908(int arg0, byte arg1) {
        field7097++;
        class493[] var2 = class130.field1868;
        synchronized (class130.field1868) {
            if (arg1 != -95) {
                return null;
            }
            class462 var4;
            if (class130.field1868.length <= arg0 || class130.field1868[arg0].method2956((byte) 102)) {
                var4 = new class462();
                var4.field6800 = new class341[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.field6800[var5] = new class341();
                }
            } else {
                var4 = (class462) class130.field1868[arg0].method2951((byte) 110);
                var4.method2322(1024);
                int var10002 = class289.field4151[arg0]--;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V", line = 151)
    public static final void method2909(int arg0) {
        field7081++;
        int[] var1 = new int[class270.field3995.field13];
        int var2 = 0;
        if (arg0 > -105) {
            return;
        }
        for (int var3 = 0; var3 < class270.field3995.field13; var3++) {
            class72 var5 = class270.field3995.method6(22883, var3);
            if (var5.field958 >= 0 || var5.field957 >= 0) {
                var1[var2++] = var3;
            }
        }
        class4.field68 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class4.field68[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V", line = 186)
    public class482() {
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Liv;)V", line = 188)
    public class482(class65 arg0) {
        this.field7092 = arg0.method629(false);
        this.field7082 = arg0.method623((byte) -98);
        this.field7085 = arg0.method616((byte) 123);
        this.field7086 = arg0.method616((byte) 126);
        this.field7080 = arg0.method616((byte) 105);
        this.field7093 = arg0.method616((byte) 95);
    }
}
