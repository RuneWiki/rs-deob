import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class293 {

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Las;")
    private class132 field4030 = new class132();

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lst;")
    private class366 field4038 = new class366();

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    private int field4037;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    private int field4040;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Ldea;")
    private class205 field4036;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Z")
    public static boolean field4032 = true;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field4035 = 0;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lmc;I)Ljava/lang/String;")
    public static final String method1879(class114 arg0, int arg1) {
        if (arg1 != 50) {
            method1883((byte) 80, -104, 5, 113, 59, -114, -93);
        }
        field4039++;
        if (client.method1534(arg0).method2897((byte) 116) == 0) {
            return null;
        } else if (arg0.field1826 == null || arg0.field1826.trim().length() == 0) {
            return class168.field2427 ? "Hidden-use" : null;
        } else {
            return arg0.field1826;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BJ)Las;")
    public final class132 method1880(byte arg0, long arg1) {
        field4034++;
        class132 var4 = (class132) this.field4036.method1242(0, arg1);
        if (var4 != null) {
            this.field4038.method2199(-23751, var4);
        }
        if (arg0 != 123) {
            this.field4040 = 9;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public final void method1881(byte arg0) {
        this.field4038.method2201(-102);
        field4033++;
        this.field4036.method1247(0);
        this.field4030 = new class132();
        int var2 = -33 / ((arg0 - 48) / 43);
        this.field4037 = this.field4040;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(JLas;I)V")
    public final void method1882(long arg0, class132 arg1, int arg2) {
        if (this.field4037 == 0) {
            class132 var5 = this.field4038.method2193(-11636);
            var5.method1117(arg2 + 3028);
            var5.method896(0);
            if (this.field4030 == var5) {
                class132 var6 = this.field4038.method2193(arg2 - 8608);
                var6.method1117(arg2 + 3028);
                var6.method896(0);
            }
        } else {
            this.field4037--;
        }
        field4029++;
        this.field4036.method1241(arg1, arg0, -113);
        this.field4038.method2199(arg2 ^ 0x5715, arg1);
        if (arg2 != -3028) {
            this.method1881((byte) -22);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BIIIIII)I")
    public static final int method1883(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg1;
            arg1 = var8;
        }
        field4027++;
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return -arg4 - (-(7 - arg3) - 1);
        } else if (arg0 == 56) {
            return 1 + 7 - arg1 - arg6;
        } else {
            return -121;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
    public class293(int arg0) {
        this.field4037 = arg0;
        this.field4040 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4036 = new class205(var2);
    }
}
