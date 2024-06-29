import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class604 extends class4 {

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public int field8154 = 0;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "Z")
    public boolean field8160 = true;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public int field8157 = -1;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public int field8158 = 12800;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public int field8165 = 0;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public int field8151 = -1;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public int field8168 = 12800;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "Ljava/lang/String;")
    public String field8167;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Ljava/lang/String;")
    public String field8163;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public int field8166;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public int field8161;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Lmba;")
    public class646 field8156;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Luu;")
    public static class237 field8153;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z")
    public final boolean method3436(int arg0, int arg1, int arg2) {
        field8155++;
        for (class81 var4 = (class81) this.field8156.method3618(-101); var4 != null; var4 = (class81) this.field8156.method3619(0)) {
            if (var4.method592(91, arg1, arg2)) {
                return true;
            }
        }
        if (arg0 != 12800) {
            this.field8166 = -73;
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[II)Z")
    public final boolean method3437(int arg0, int arg1, int[] arg2, int arg3) {
        field8152++;
        class81 var5 = (class81) this.field8156.method3618(-97);
        if (arg0 != -1996) {
            this.field8156 = null;
        }
        while (var5 != null) {
            if (var5.method592(16, arg1, arg3)) {
                var5.method590(arg3, arg2, false, arg1);
                return true;
            }
            var5 = (class81) this.field8156.method3619(0);
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method3438(byte arg0) {
        field8153 = null;
        if (arg0 != -87) {
            field8153 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)V")
    public static final void method3439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -397) {
            method3439(72, -74, 1, 68, 34, -26);
        }
        if (class332.field4707.field4782.method1140(0) != 0 && arg4 != 0 && class12.field108 < 50 && arg0 != -1) {
            class669.field9235[class12.field108++] = new class396((byte) 1, arg0, arg4, arg5, arg3, 0, arg2, null);
        }
        field8164++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([IIZI)Z")
    public final boolean method3440(int[] arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            return true;
        }
        field8169++;
        for (class81 var5 = (class81) this.field8156.method3618(80); var5 != null; var5 = (class81) this.field8156.method3619(0)) {
            if (var5.method586(arg3, arg1, -117)) {
                var5.method591(arg1, -14119, arg3, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[IB)Z")
    public final boolean method3441(int arg0, int arg1, int arg2, int[] arg3, byte arg4) {
        if (arg4 != 1) {
            return true;
        }
        field8159++;
        for (class81 var6 = (class81) this.field8156.method3618(-51); var6 != null; var6 = (class81) this.field8156.method3619(0)) {
            if (var6.method589(arg2, arg0, arg1, arg4 - 1)) {
                var6.method590(arg0, arg3, false, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public final void method3442(int arg0) {
        this.field8158 = 12800;
        this.field8154 = 0;
        this.field8165 = 0;
        field8170++;
        this.field8168 = 12800;
        for (class81 var2 = (class81) this.field8156.method3618(103); var2 != null; var2 = (class81) this.field8156.method3619(0)) {
            if (var2.field1177 < this.field8168) {
                this.field8168 = var2.field1177;
            }
            if (var2.field1169 > this.field8154) {
                this.field8154 = var2.field1169;
            }
            if (var2.field1171 > this.field8165) {
                this.field8165 = var2.field1171;
            }
            if (var2.field1164 < this.field8158) {
                this.field8158 = var2.field1164;
            }
        }
        if (arg0 <= 11) {
            this.field8165 = 86;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BZ)V")
    public static final void method3443(byte arg0, boolean arg1) {
        field8162++;
        if (class155.field2184 == null) {
            class227.method1339((byte) 47);
        }
        if (arg0 == 7 && arg1) {
            class155.field2184.method2776(-27995);
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class604(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field8167 = arg2;
        this.field8163 = arg1;
        this.field8151 = arg4;
        this.field8160 = arg5;
        this.field8166 = arg0;
        this.field8161 = arg3;
        this.field8157 = arg6;
        if (this.field8157 == 255) {
            this.field8157 = 0;
        }
        this.field8156 = new class646();
    }
}
