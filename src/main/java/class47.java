import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class47 extends class125 {

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "[Lnc;")
    public class128[] field1021;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field1026 = -1;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "Ljd;")
    public static class92 field1027 = class202.method1325((byte) 90, "Standort");

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "Lmg;")
    public static class123 field1022;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
    public static final void method291(boolean arg0, int arg1) {
        field1020++;
        if (class123.field2485 == null) {
            return;
        }
        if (arg1 != 128) {
            field1026 = 41;
        }
        try {
            class70 var2 = new class70(4);
            var2.method428(arg0 ? 2 : 3, arg1 - 38);
            var2.method439(0, (byte) 127);
            class123.field2485.method324(0, var2.field1493, 4, arg1 ^ 0x8A4);
        } catch (IOException var4) {
            try {
                class123.field2485.method319(true);
            } catch (Exception var3) {
            }
            class123.field2485 = null;
            class43.field975++;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Z")
    public final boolean method292(int arg0, byte arg1) {
        if (arg1 >= -103) {
            method295((byte) 8);
        }
        field1025++;
        return this.field1021[arg0].field2583;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)I")
    public static final int method293(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 111) {
            return -41;
        } else {
            int var4 = 256 - arg2;
            field1019++;
            return ((arg0 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + (arg3 & 0xFF00) * arg2 & 0xFF0000) >> 8;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIILtg;JZ)V")
    public static final void method294(int arg0, int arg1, int arg2, int arg3, class186 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class28 var8 = new class28();
        var8.field633 = arg4;
        var8.field617 = arg1 * 128 + 64;
        var8.field623 = arg2 * 128 + 64;
        var8.field620 = arg3;
        var8.field632 = arg5;
        if (class31.field698[arg0][arg1][arg2] == null) {
            class31.field698[arg0][arg1][arg2] = new class43(arg0, arg1, arg2);
        }
        class31.field698[arg0][arg1][arg2].field969 = var8;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lnh;Lnh;IZ)V")
    public class47(class133 arg0, class133 arg1, int arg2, boolean arg3) {
        class18 var5 = new class18();
        int var6 = arg0.method886(-99, arg2);
        this.field1021 = new class128[var6];
        int[] var7 = arg0.method877(arg2, (byte) 76);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method899((byte) 87, arg2, var7[var8]);
            class45 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class45 var12 = (class45) var5.method103(57); var12 != null; var12 = (class45) var5.method100(-49)) {
                if (var12.field1003 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method874(var11, 0, 32588);
                } else {
                    var13 = arg1.method874(0, var11, 32588);
                }
                var10 = new class45(var11, var13);
                var5.method101(var10, (byte) -117);
            }
            this.field1021[var7[var8]] = new class128(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
    public static void method295(byte arg0) {
        field1027 = null;
        field1022 = null;
        if (arg0 != 94) {
            field1026 = 43;
        }
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
    public static final void method296(int arg0) {
        if (arg0 != 0) {
            field1026 = -91;
        }
        field1024++;
        class4.field256.method923(arg0 - 117);
    }
}
