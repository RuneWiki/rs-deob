import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class1 extends class78 {

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    private final int field9;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    private final int field7;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    private final int field4;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "I")
    private final int field13;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Z")
    public static boolean field8 = true;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "[B")
    public static byte[] field3 = new byte[520];

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "Z")
    public static boolean field12 = false;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "[I")
    public static int[] field1 = new int[128];

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)Z", line = 4)
    public static final boolean method1(int arg0) {
        field2++;
        class95 var1 = class306.field5135;
        synchronized (class306.field5135) {
            if (class98.field1753 == class257.field4280) {
                return false;
            }
            class199.field3186 = class285.field4812[class257.field4280];
            class65.field1222 = class96.field1729[class257.field4280];
            class257.field4280 = class257.field4280 + 1 & 0x7F;
            if (arg0 >= -56) {
                field8 = true;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIII)V", line = 23)
    public class1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9 = arg0;
        this.field7 = arg3;
        this.field4 = arg2;
        this.field13 = arg1;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)V", line = 38)
    public final void method2(int arg0, int arg1, int arg2) {
        field10++;
        if (arg0 <= 33) {
            field3 = (byte[]) null;
        }
        int var4 = this.field9 * arg1 >> 12;
        int var5 = this.field4 * arg1 >> 12;
        int var6 = this.field7 * arg2 >> 12;
        int var7 = this.field13 * arg2 >> 12;
        class180.method1317(this.field1317, 29106, var7, this.field1325, var4, var6, var5);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBI)V", line = 61)
    public final void method3(int arg0, byte arg1, int arg2) {
        field5++;
        if (arg1 > -71) {
            return;
        }
        int var4 = this.field9 * arg2 >> 12;
        int var5 = this.field4 * arg2 >> 12;
        int var6 = this.field7 * arg0 >> 12;
        int var7 = this.field13 * arg0 >> 12;
        class48.method431(var6, var4, this.field1325, 1, var7, this.field1321, var5, this.field1317);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V", line = 98)
    public static void method4(byte arg0) {
        field1 = null;
        if (arg0 >= -82) {
            method1(-20);
        }
        field3 = null;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(III)V", line = 117)
    public final void method5(int arg0, int arg1, int arg2) {
        field11++;
        if (arg2 != -1) {
            this.method5(84, 54, -54);
        }
        int var4 = this.field4 * arg0 >> 12;
        int var5 = this.field9 * arg0 >> 12;
        int var6 = this.field13 * arg1 >> 12;
        int var7 = this.field7 * arg1 >> 12;
        class217.method1524(this.field1321, var5, var4, var6, var7, arg2 ^ 0x31);
    }
}
