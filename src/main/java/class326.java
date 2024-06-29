import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class326 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field5064 = new CRC32();

    @OriginalMember(owner = "client!km", name = "e", descriptor = "[S")
    public static short[] field5068 = new short[500];

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[I")
    public static int[] field5069 = new int[14];

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Z")
    public static boolean field5067 = false;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Llb;")
    public static class211 field5070;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 10)
    public static final void method2234(byte arg0) {
        if (arg0 < 51) {
            method2234((byte) -127);
        }
        for (int var1 = 0; var1 < class122.field1923; var1++) {
            int var2 = class126.field1995[var1];
            class45 var3 = class161.field2394[var2];
            if (var3 != null) {
                class230.method1637(var3, var3.field698.field2750, -18967);
            }
        }
        field5065++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 39)
    public static void method2235(int arg0) {
        if (arg0 != 48) {
            field5068 = (short[]) null;
        }
        field5069 = null;
        field5070 = null;
        field5064 = null;
        field5068 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILqb;IIII)Z", line = 82)
    public static final boolean method2236(int arg0, int arg1, class101 arg2, int arg3, int arg4, int arg5, int arg6) {
        field5066++;
        class73 var7 = class32.method226(arg0 - 20008, arg2.field1526);
        if (var7.field1056 == -1) {
            return true;
        }
        int var9;
        if (arg2.field1523) {
            int var8 = arg2.field1554 + arg6;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class70 var10 = var7.method607(var9, -21279);
        if (var10 == null) {
            return false;
        }
        if (arg0 != 23732) {
            method2236(26, 26, (class101) null, -102, 106, -2, -40);
        }
        int var11 = arg2.field1533;
        int var12 = arg2.field1524;
        if ((var9 & 0x1) == 1) {
            var12 = arg2.field1533;
            var11 = arg2.field1524;
        }
        int var13 = var10.field4582;
        int var14 = var10.field4578;
        if (var7.field1057) {
            var14 = var12 * 4;
            var13 = var11 * 4;
        }
        if (var7.field1049 == 0) {
            var10.method592(arg1 * 4 + 48, (-arg5 + 104 - var12) * 4 + 48, var13, var14);
        } else {
            var10.method585(arg1 * 4 + 48, 48 - -((-arg5 + 104 + -var12) * 4), var13, var14, var7.field1049);
        }
        return true;
    }
}
