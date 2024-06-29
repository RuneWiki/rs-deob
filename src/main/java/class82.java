import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class82 extends class201 {

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public int field1485 = 12800;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public int field1494 = 0;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "Z")
    public boolean field1487 = true;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    public int field1499 = 0;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
    public int field1500 = -1;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "I")
    public int field1505 = 12800;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "Ljd;")
    public class85 field1488;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "Ljd;")
    public class85 field1486;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "Lwe;")
    public class15 field1491;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "[I")
    public static int[] field1495 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "[Lae;")
    public static class165[] field1503 = new class165[4];

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    public static int field1498 = 0;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "Ljd;")
    public static class85 field1501 = class221.method1499("", (byte) 105);

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "Lff;")
    public static class18 field1502;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "[I")
    public static int[] field1496;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "[[I")
    public static int[][] field1484;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)I")
    public static final int method566(int arg0, byte arg1) {
        field1490++;
        class101 var2 = class132.method883(arg0, (byte) -34);
        int var3 = var2.field1803;
        if (arg1 != 127) {
            method566(34, (byte) -126);
        }
        int var4 = var2.field1800;
        int var5 = var2.field1798;
        int var6 = class27.field417[var5 - var4];
        return class256.field4563[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
    public final void method567(int arg0) {
        this.field1499 = 0;
        this.field1494 = 0;
        this.field1505 = 12800;
        field1497++;
        this.field1485 = 12800;
        if (arg0 != 234) {
            return;
        }
        for (class3 var2 = (class3) this.field1491.method110(64); var2 != null; var2 = (class3) this.field1491.method117((byte) 111)) {
            if (this.field1494 < var2.field26) {
                this.field1494 = var2.field26;
            }
            if (var2.field32 > this.field1499) {
                this.field1499 = var2.field32;
            }
            if (this.field1505 > var2.field30) {
                this.field1505 = var2.field30;
            }
            if (this.field1485 > var2.field31) {
                this.field1485 = var2.field31;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
    public static void method568(int arg0) {
        field1501 = null;
        field1484 = null;
        field1496 = null;
        field1495 = null;
        field1503 = null;
        field1502 = null;
        if (arg0 != 26078) {
            field1498 = -111;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method569(byte[] arg0, int arg1, boolean arg2) {
        field1493++;
        if (arg1 < 77) {
            method566(53, (byte) -18);
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class118.field2109) {
            try {
                class198 var3 = (class198) Class.forName("fk").getDeclaredConstructor().newInstance();
                var3.method107((byte) -123, arg0);
                return var3;
            } catch (Throwable var4) {
                class118.field2109 = true;
            }
        }
        return arg2 ? class116.method815(arg0, true) : arg0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z")
    public final boolean method570(int arg0, int arg1, int arg2) {
        field1504++;
        if (arg1 < this.field1485 || arg1 > this.field1499 || arg0 < this.field1505 || this.field1494 < arg0) {
            return false;
        }
        for (class3 var4 = (class3) this.field1491.method110(arg2 + 3); var4 != null; var4 = (class3) this.field1491.method117((byte) 66)) {
            if (var4.method12(arg1, arg2 ^ 0xFFFFFFC2, arg0)) {
                return true;
            }
        }
        if (arg2 != 61) {
            field1502 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljd;Ljd;IIIZ)V")
    public class82(class85 arg0, class85 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1489 = arg2;
        this.field1500 = arg4;
        this.field1488 = arg0;
        this.field1486 = arg1;
        this.field1492 = arg3;
        this.field1487 = arg5;
        this.field1491 = new class15();
    }
}
