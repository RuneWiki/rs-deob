import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class270 extends class561 {

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Z")
    public boolean field3428 = true;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public int field3430 = 12800;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public int field3434 = 12800;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public int field3437 = -1;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public int field3427 = -1;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public int field3425 = 0;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public int field3441 = 0;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "Ljava/lang/String;")
    public String field3436;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "Ljava/lang/String;")
    public String field3440;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public int field3429;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "Lbv;")
    public class568 field3444;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "[[[I")
    public static int[][][] field3439;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static void method1647(int arg0) {
        field3439 = null;
        if (arg0 != 12800) {
            method1647(108);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[I)Z")
    public final boolean method1648(int arg0, int arg1, int arg2, int[] arg3) {
        field3424++;
        class444 var5 = (class444) this.field3444.method3188((byte) -100);
        if (arg2 != 0) {
            this.field3428 = true;
        }
        while (var5 != null) {
            if (var5.method2584(arg0, arg1, -121)) {
                var5.method2582(arg1, arg3, arg0, -102);
                return true;
            }
            var5 = (class444) this.field3444.method3182((byte) -87);
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)Z")
    public static final boolean method1649(int arg0, int arg1, int arg2) {
        field3426++;
        if (arg2 < 87) {
            method1649(66, -78, 51);
        }
        return (class359.method2229(arg1, (byte) -106, arg0) | (arg0 & 0x2000) != 0 | class146.method799(arg1, 10754, arg0)) & class389.method2347(arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1650(byte[] arg0, int arg1) {
        field3431++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class205.method1311(arg0, 0, var3, arg1, var2);
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)Z")
    public final boolean method1651(int arg0, int arg1, int arg2) {
        field3443++;
        if (arg2 != 0) {
            this.method1653(null, 99, -89, (byte) -92);
        }
        for (class444 var4 = (class444) this.field3444.method3188((byte) -100); var4 != null; var4 = (class444) this.field3444.method3182((byte) -37)) {
            if (var4.method2585(1, arg1, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public final void method1652(int arg0) {
        field3442++;
        this.field3434 = 12800;
        this.field3430 = 12800;
        this.field3425 = 0;
        int var2 = 13 % ((arg0 + 27) / 58);
        this.field3441 = 0;
        for (class444 var3 = (class444) this.field3444.method3188((byte) -100); var3 != null; var3 = (class444) this.field3444.method3182((byte) -52)) {
            if (this.field3441 < var3.field6137) {
                this.field3441 = var3.field6137;
            }
            if (var3.field6135 < this.field3430) {
                this.field3430 = var3.field6135;
            }
            if (var3.field6140 > this.field3425) {
                this.field3425 = var3.field6140;
            }
            if (this.field3434 > var3.field6141) {
                this.field3434 = var3.field6141;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([IIIB)Z")
    public final boolean method1653(int[] arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -24) {
            this.field3436 = null;
        }
        field3432++;
        for (class444 var5 = (class444) this.field3444.method3188((byte) -100); var5 != null; var5 = (class444) this.field3444.method3182((byte) -58)) {
            if (var5.method2585(1, arg1, arg2)) {
                var5.method2581(arg0, 1, arg2, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[IIII)Z")
    public final boolean method1654(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field3435++;
        if (arg2 > -41) {
            this.method1648(-34, 66, -103, null);
        }
        for (class444 var6 = (class444) this.field3444.method3188((byte) -100); var6 != null; var6 = (class444) this.field3444.method3182((byte) -106)) {
            if (var6.method2580(arg4, arg3, arg0, -52)) {
                var6.method2581(arg1, 1, arg0, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class270(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3437 = arg4;
        this.field3436 = arg2;
        this.field3438 = arg3;
        this.field3428 = arg5;
        this.field3440 = arg1;
        this.field3427 = arg6;
        this.field3429 = arg0;
        if (this.field3427 == 255) {
            this.field3427 = 0;
        }
        this.field3444 = new class568();
    }
}
