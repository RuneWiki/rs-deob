import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class110 {

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[I")
    public static int[] field1589 = new int[2048];

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1591 = "Loading fonts - ";

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lrd;")
    public static class149 field1593 = null;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Ltk;")
    public class219 field1586;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "[[[I")
    public static int[][][] field1587;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lve;BII)Z")
    public static final boolean method718(class233 arg0, byte arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method1538(arg3, arg2, (byte) 92);
        field1584++;
        if (var4 == null) {
            return false;
        }
        class120.method822(var4, -19262);
        if (arg1 != -117) {
            method718((class233) null, (byte) 112, 28, -92);
        }
        return true;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLve;)V")
    public static final void method719(byte arg0, class233 arg1) {
        class171.field2455 = arg1.method1522(7233, "titlebg");
        if (arg0 == 57) {
            field1590++;
            class266.field4012 = arg1.method1522(7233, "logo");
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method720(int arg0) {
        field1591 = null;
        field1589 = null;
        if (arg0 >= -76) {
            field1587 = null;
        }
        field1587 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method721(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1588++;
        if (arg4 < 128 || arg1 < 128 || arg4 > 13056 || arg1 > 13056) {
            class195.field2809 = -1;
            class148.field2111 = -1;
            return;
        }
        int var8 = class81.method542(arg4, -1, class163.field2364, arg1) - arg2;
        int var9 = class18.field261[class146.field2097];
        int var10 = arg1 - class223.field3341;
        int var11 = arg4 - class89.field1355;
        int var12 = class18.field259[class146.field2097];
        int var13 = class18.field261[class30.field439];
        int var14 = var8 - class169.field2442;
        if (arg5 > -37) {
            method721(125, 5, -20, 123, -47, (byte) -107, -32, 52);
        }
        int var15 = class18.field259[class30.field439];
        int var16 = var10 * var13 + (var11 * var15) >> 16;
        int var17 = var10 * var15 - (var11 * var13) >> 16;
        int var19 = var12 * var14 - (var9 * var17) >> 16;
        int var20 = var9 * var14 + var12 * var17 >> 16;
        if (var20 >= 50) {
            class148.field2111 = arg3 + ((var16 << 9) / var20);
            class195.field2809 = arg6 + ((var19 << 9) / var20);
        } else {
            class195.field2809 = -1;
            class148.field2111 = -1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public static final void method722(int arg0, int arg1, int arg2) {
        field1585++;
        class270 var3 = class190.method1213(25702, arg0, arg2);
        var3.method1808((byte) 62);
        var3.field4226 = arg1;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static final void method723(int arg0) {
        class181.field2596.method257(false);
        field1592++;
        if (arg0 != 1010970288) {
            field1589 = null;
        }
    }
}
