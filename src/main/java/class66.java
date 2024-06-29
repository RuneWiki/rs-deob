import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class66 extends class14 {

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    private final int field1148;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    private final int field1146;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    private final int field1134;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    private final int field1153;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1135 = 0;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1137 = 0;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "[J")
    public static long[] field1152 = new long[100];

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "Lgb;")
    public static class158 field1145 = new class158(64);

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public static int field1155 = 0;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field1154 = 0;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Lbh;")
    public static class258 field1144;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "Lcb;")
    public static class267 field1136;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "Lcb;")
    public static class267 field1138;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Lcb;")
    public static class267 field1140;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "Lcb;")
    public static class267 field1150;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "[[[B")
    public static byte[][][] field1147;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V", line = 7)
    public final void method13(int arg0, int arg1, int arg2) {
        field1149++;
        int var4 = this.field1134 * arg0 >> 12;
        int var5 = this.field1146 * arg0 >> 12;
        if (arg2 <= 58) {
            this.method4(30, false, 24);
        }
        int var6 = this.field1148 * arg1 >> 12;
        int var7 = this.field1153 * arg1 >> 12;
        class203.method1506(var7, var4, 2, var5, this.field184, var6);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 28)
    public static void method558(int arg0) {
        field1150 = null;
        field1152 = null;
        field1145 = null;
        field1147 = (byte[][][]) null;
        field1136 = null;
        field1144 = null;
        field1138 = null;
        if (arg0 != 255) {
            field1145 = (class158) null;
        }
        field1140 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZI)V", line = 59)
    public final void method4(int arg0, boolean arg1, int arg2) {
        field1141++;
        if (arg1) {
            this.method8(48, -105, -6);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(ZI)I", line = 71)
    public static final int method559(boolean arg0, int arg1) {
        field1151++;
        if (!(arg1 < 65 || arg1 > 90) || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else if (arg0) {
            return -99;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;Z)Lwa;", line = 103)
    public static final class75 method560(String arg0, boolean arg1) {
        byte[] var2 = arg0.getBytes();
        field1139++;
        int var3 = var2.length;
        class75 var4 = new class75();
        int var5 = 0;
        var4.field1296 = new byte[var3];
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1296[var4.field1280++] = (byte) ((var6 - 40) * 43 + (var7 - 48));
            } else if (var6 != 0) {
                var4.field1296[var4.field1280++] = (byte) var6;
            }
        }
        var4.method623(arg1);
        return var4.method621((byte) -91);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I", line = 154)
    public static final int method561(int arg0) {
        if (arg0 != -366) {
            method561(-102);
        }
        field1142++;
        return 16;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V", line = 168)
    public final void method8(int arg0, int arg1, int arg2) {
        field1156++;
        int var4 = this.field1146 * arg2 >> 12;
        if (arg0 == 100) {
            int var5 = this.field1134 * arg2 >> 12;
            int var6 = this.field1148 * arg1 >> 12;
            int var7 = this.field1153 * arg1 >> 12;
            class138.method1056(this.field183, this.field184, (byte) -122, this.field189, var5, var4, var7, var6);
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIIIII)V", line = 195)
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1148 = arg3;
        this.field1146 = arg0;
        this.field1134 = arg2;
        this.field1153 = arg1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B[Lwa;)Lwa;", line = 209)
    public static final class75 method562(byte arg0, class75[] arg1) {
        int var2 = -50 / ((54 - arg0) / 59);
        field1143++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class30.method207(0, arg1, arg1.length, -28540);
    }
}
