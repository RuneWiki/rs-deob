import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class344 extends class673 {

    @OriginalMember(owner = "client!qaa", name = "Y", descriptor = "Z")
    public static boolean field4890 = false;

    @OriginalMember(owner = "client!qaa", name = "Z", descriptor = "I")
    public static int field4891 = 1406;

    @OriginalMember(owner = "client!qaa", name = "S", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!qaa", name = "T", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!qaa", name = "U", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!qaa", name = "V", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!qaa", name = "X", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!qaa", name = "W", descriptor = "[B")
    private byte[] field4888;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method2106(int arg0, int arg1, int arg2, byte arg3) {
        field4887++;
        this.field4888 = new byte[arg1 * 2 * arg2 * arg0];
        if (arg3 == 43) {
            this.method4046(arg2, -4995, arg1, arg0);
            return this.field4888;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "(I)V")
    public static final void method2107(int arg0) {
        field4885++;
        for (class160 var1 = (class160) class218.field3198.method3731((byte) -105); var1 != null; var1 = (class160) class218.field3198.method3729((byte) -121)) {
            if (var1.field2485) {
                var1.method4237(-1);
            } else {
                var1.field2483 = true;
                if (var1.field2479 >= 0 && var1.field2488 >= 0 && class192.field2891 > var1.field2479 && class456.field6225 > var1.field2488) {
                    class657.method3685(var1, arg0 ^ 0xFFFFDA0F);
                }
            }
        }
        for (class160 var2 = (class160) class117.field1994.method3731((byte) -94); var2 != null; var2 = (class160) class117.field1994.method3729((byte) -117)) {
            if (var2.field2485) {
                var2.method4237(-1);
            } else {
                var2.field2483 = true;
            }
        }
        if (arg0 != 255) {
            method2107(48);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "()V")
    public class344() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IBB)V")
    public final void method2108(int arg0, byte arg1, byte arg2) {
        field4886++;
        int var4 = arg0 * 2;
        int var5 = arg1 & 0xFF;
        if (arg2 != 53) {
            field4889 = 52;
        }
        this.field4888[var4++] = (byte) (var5 * 3 >> 5);
        this.field4888[var4] = (byte) (var5 * 3 >> 5);
    }
}
