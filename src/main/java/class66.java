import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class66 extends class137 implements class591 {

    @OriginalMember(owner = "client!qr", name = "E", descriptor = "[F")
    public static float[] field946 = new float[16384];

    @OriginalMember(owner = "client!qr", name = "J", descriptor = "[F")
    public static float[] field951 = new float[16384];

    @OriginalMember(owner = "client!qr", name = "L", descriptor = "Ljava/lang/String;")
    public static String field953;

    @OriginalMember(owner = "client!qr", name = "C", descriptor = "B")
    private byte field945;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!qr", name = "x", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!qr", name = "A", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!qr", name = "I", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!qr", name = "N", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!qr", name = "y", descriptor = "Lru;")
    public static class195 field941;

    @OriginalMember(owner = "client!qr", name = "K", descriptor = "Lda;")
    public static class61 field952;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field951[var2] = (float) Math.sin((double) var2 * var0);
            field946[var2] = (float) Math.cos((double) var2 * var0);
        }
        field953 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z", line = 4)
    public final boolean method298(int arg0, int arg1, int arg2, Source arg3) {
        this.field945 = (byte) arg0;
        int var5 = -54 % ((-49 - arg1) / 44);
        ++field944;
        super.method1007(arg2, arg3, true);
        return true;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)Z", line = 18)
    public final boolean method299(int arg0) {
        if (arg0 != 2581) {
            field954 = -90;
        }
        ++field942;
        return super.method1004(super.field1962.field4477, (byte) 126);
    }

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "(I)I", line = 35)
    public final int method613(int arg0) {
        if (arg0 != 15629) {
            this.method294((byte) 116);
        }
        ++field938;
        return this.field945;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(IZII)I", line = 46)
    public static final int method614(int arg0, boolean arg1, int arg2, int arg3) {
        ++field947;
        if (~(8 & class305.field4001[arg2][arg3][arg0]) != -1) {
            return 0;
        } else if (~arg2 < -1 && (2 & class305.field4001[1][arg3][arg0]) != 0) {
            return arg2 + -1;
        } else {
            if (!arg1) {
                field951 = null;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)I", line = 64)
    public final int method297(int arg0) {
        if (arg0 != 2) {
            this.method299(40);
        }
        ++field950;
        return super.method297(2);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)Z", line = 79)
    public final boolean method296(int arg0, int arg1, int arg2) {
        if (arg2 != 20442) {
            field941 = null;
        }
        this.field945 = (byte) arg0;
        ++field940;
        super.method1008(arg1, 23833);
        return true;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 95)
    public final Buffer method295(boolean arg0, int arg1) {
        ++field949;
        if (arg1 != -32022) {
            field946 = null;
        }
        return super.method1010(arg0, super.field1962.field4477, (byte) -121);
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Ltk;Z)V", line = 106)
    public class66(class347 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V", line = 112)
    public static void method615(byte arg0) {
        field952 = null;
        if (arg0 != 53) {
            field952 = null;
        }
        field953 = null;
        field951 = null;
        field946 = null;
        field941 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V", line = 130)
    public final void method294(byte arg0) {
        ++field939;
        super.method294(arg0);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V", line = 139)
    public static final void method616(boolean arg0) {
        for (class580 var1 = (class580) class669.field9385.method157((byte) -41); var1 != null; var1 = (class580) class669.field9385.method157((byte) 52)) {
            class706.method3952(arg0, var1);
        }
        ++field943;
        int var2;
        int var3;
        if (class748.field10451.field10412.method1806((byte) -114) == 1) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class440.field5865;
            var2 = class440.field5865;
        }
        client.method1816();
        if (!arg0) {
            method614(45, true, 109, 41);
        }
        for (int var4 = var2; ~var4 >= ~var3; ++var4) {
            client.method1828();
            client.method1832(var4);
            client.method1824(var4);
        }
        client.method1838();
        client.method1825();
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIB)Z", line = 187)
    public static final boolean method617(int arg0, int arg1, byte arg2) {
        if (arg2 != 56) {
            method617(-124, -106, (byte) -37);
        }
        ++field948;
        return ~(arg1 & 2048) != -1;
    }
}
