import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class572 {

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "[S")
    public short[] field8093;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[S")
    public short[] field8092;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[I")
    public int[] field8085;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "J")
    public long field8091;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "Z")
    public static boolean field8088 = false;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method3310(boolean arg0) {
        if (arg0) {
            return;
        }
        field8089++;
        try {
            if (class152.field2350 == 1) {
                int var1 = class520.field7449.method2148((byte) 70);
                if (var1 > 0 && class520.field7449.method2129((byte) 47)) {
                    int var2 = var1 - class242.field3529;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class520.field7449.method2127(var2, true);
                    return;
                }
                class520.field7449.method2150((byte) -41);
                class520.field7449.method2145(16);
                if (class354.field5152 == null) {
                    class152.field2350 = 0;
                } else {
                    class152.field2350 = 2;
                }
                class533.field7670 = null;
                class470.field6861 = null;
            }
            if (class152.field2350 == 3) {
                int var3 = class520.field7449.method2148((byte) 68);
                if (class758.field10600 > var3 && class520.field7449.method2129((byte) 97)) {
                    int var4 = class183.field2803 + var3;
                    if (class758.field10600 < var4) {
                        var4 = class758.field10600;
                    }
                    class520.field7449.method2127(var4, true);
                } else {
                    class183.field2803 = 0;
                    class152.field2350 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class520.field7449.method2150((byte) -41);
            class2.field18 = null;
            class470.field6861 = null;
            class533.field7670 = null;
            class354.field5152 = null;
            class152.field2350 = 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 74)
    public static final void method3311(byte arg0) {
        if (arg0 != -78) {
            field8088 = false;
        }
        for (class194 var1 = (class194) class154.field2501.method2283(false); var1 != null; var1 = (class194) class154.field2501.method2282((byte) 47)) {
            if (var1.field2939) {
                var1.field2939 = false;
            } else {
                class755.method4212(false, var1.field2934);
            }
        }
        field8086++;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V", line = 104)
    public static final void method3312(byte arg0) {
        field8087++;
        if (class183.field2805 != null) {
            for (int var1 = 0; var1 < class183.field2805.length; var1++) {
                for (int var2 = 0; var2 < class183.field2805[var1].length; var2++) {
                    class183.field2805[var1][var2] = class31.field324;
                }
            }
        }
        if (arg0 > -113) {
            field8088 = true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[BI)I", line = 139)
    public static final int method3313(int arg0, int arg1, byte[] arg2, int arg3) {
        field8090++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = class602.field8511[(arg2[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return arg1 <= 89 ? -46 : ~var4;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(J[I[S[S)V", line = 161)
    public class572(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field8093 = arg2;
        this.field8092 = arg3;
        this.field8085 = arg1;
        this.field8091 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 171)
    protected class572() {
    }
}
