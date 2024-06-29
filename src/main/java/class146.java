import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class146 extends class162 {

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "[Lwb;")
    public class28[] field2303;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field2297 = 500;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "[I")
    public static int[] field2300 = new int[1000];

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field2302 = 0;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field2305 = 0;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field2298;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static void method975(byte arg0) {
        field2298 = null;
        field2300 = null;
        if (arg0 >= -94) {
            method975((byte) -40);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Z")
    public final boolean method976(int arg0, int arg1) {
        if (arg1 != 0) {
            method975((byte) 1);
        }
        field2301++;
        return this.field2303[arg0].field354;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)Z")
    public final boolean method977(int arg0, int arg1) {
        field2304++;
        if (arg1 > -62) {
            method975((byte) 102);
        }
        return this.field2303[arg0].field361;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lfa;Lfa;IZ)V")
    public class146(class273 arg0, class273 arg1, int arg2, boolean arg3) {
        class281 var5 = new class281();
        int var6 = arg0.method1890(true, arg2);
        this.field2303 = new class28[var6];
        int[] var7 = arg0.method1875(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1877(var7[var8], arg2, (byte) 121);
            class51 var10 = null;
            int var11 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            for (class51 var12 = (class51) var5.method1959(205); var12 != null; var12 = (class51) var5.method1956(84)) {
                if (var12.field693 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1883((byte) 117, 0, var11);
                } else {
                    var13 = arg1.method1883((byte) 123, var11, 0);
                }
                var10 = new class51(var11, var13);
                var5.method1952(var10, 76);
            }
            this.field2303[var7[var8]] = new class28(var9, var10);
        }
    }
}
