import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class58 extends class149 {

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "Z")
    public boolean field1080 = false;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "Lai;")
    private class10 field1082;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "Z")
    public boolean field1079;

    @OriginalMember(owner = "client!gb", name = "hb", descriptor = "Z")
    public boolean field1088;

    @OriginalMember(owner = "client!gb", name = "pb", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "I")
    private int field1087;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "client!gb", name = "sb", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "Lsg;")
    public static class169 field1073 = class165.method1060(" steht bereits auf Ihrer Freunde)2Liste(Q", 1536);

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field1078 = 1;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "Lsg;")
    private static class169 field1085 = class165.method1060("Too many incorrect logins from your address)3", 1536);

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "[Lsg;")
    public static class169[] field1084 = new class169[1000];

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lsg;")
    public static class169 field1081 = class165.method1060("Update)2Liste geladen)3", 1536);

    @OriginalMember(owner = "client!gb", name = "ob", descriptor = "Lsg;")
    public static class169 field1095 = class165.method1060("welle:", 1536);

    @OriginalMember(owner = "client!gb", name = "jb", descriptor = "[I")
    public static int[] field1090 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!gb", name = "nb", descriptor = "Lsg;")
    public static class169 field1094 = field1085;

    @OriginalMember(owner = "client!gb", name = "lb", descriptor = "[I")
    public static int[] field1092 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gb", name = "qb", descriptor = "Lsg;")
    public static class169 field1097 = class165.method1060("headicons_hint", 1536);

    @OriginalMember(owner = "client!gb", name = "rb", descriptor = "I")
    public static int field1098 = -1;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "F")
    private float field1072;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!gb", name = "ib", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!gb", name = "mb", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!gb", name = "kb", descriptor = "[I")
    private int[] field1091;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)V")
    public final void method363(int arg0, int arg1) {
        field1093++;
        if (arg1 != -22826) {
            field1081 = null;
        }
        if (this.field1091 == null) {
            return;
        }
        if (this.field1083 != 0) {
            if (class122.field2246 == null || this.field1091.length > class122.field2246.length) {
                class122.field2246 = new int[this.field1091.length];
            }
            short var3;
            if (this.field1091.length == 4096) {
                var3 = 64;
            } else {
                var3 = 128;
            }
            int var4 = this.field1091.length;
            int var5 = this.field1087 * var3 * arg0;
            int var6 = var4 - 1;
            if (this.field1083 == 2) {
                var5 = -var5;
            }
            for (int var7 = 0; var7 < var4; var7++) {
                int var9 = var6 & var5 + var7;
                class122.field2246[var7] = this.field1091[var9];
            }
            int[] var8 = this.field1091;
            this.field1091 = class122.field2246;
            class122.field2246 = var8;
        }
        if (this.field1099 == 0) {
            return;
        }
        if (class122.field2246 == null || class122.field2246.length < this.field1091.length) {
            class122.field2246 = new int[this.field1091.length];
        }
        short var10;
        if (this.field1091.length == 4096) {
            var10 = 64;
        } else {
            var10 = 128;
        }
        int var11 = this.field1091.length;
        int var12 = this.field1087 * arg0;
        if (this.field1099 == 1) {
            var12 = -var12;
        }
        int var13 = var10 - 1;
        for (int var14 = 0; var14 < var11; var14 += var10) {
            for (int var16 = 0; var16 < var10; var16++) {
                int var17 = var14 + (var16 + var12 & var13);
                int var18 = var14 + var16;
                class122.field2246[var18] = this.field1091[var17];
            }
        }
        int[] var15 = this.field1091;
        this.field1091 = class122.field2246;
        class122.field2246 = var15;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lke;ILqb;)Z")
    public final boolean method364(class95 arg0, int arg1, class146 arg2) {
        if (arg1 != 0) {
            this.method364(null, 124, null);
        }
        field1086++;
        return this.field1082.method54(arg2, arg0, (byte) -113);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lqb;IFLke;B)[I")
    public final int[] method365(class146 arg0, int arg1, float arg2, class95 arg3, byte arg4) {
        field1077++;
        int var6 = -85 % ((75 - arg4) / 43);
        if (this.field1091 == null || this.field1072 != arg2) {
            if (!this.field1082.method54(arg0, arg3, (byte) 90)) {
                return null;
            }
            int var7 = arg1 < this.field1096 ? arg1 : this.field1096;
            this.field1091 = this.field1082.method52(arg3, var7, var7, 3, (double) arg2, true, arg0);
            this.field1072 = arg2;
        }
        return this.field1091;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILqb;ZLke;)[I")
    public final int[] method366(int arg0, class146 arg1, boolean arg2, class95 arg3) {
        field1074++;
        if (!arg2) {
            return null;
        } else if (this.field1082.method54(arg1, arg3, (byte) 119)) {
            int var5 = arg0 < this.field1096 ? arg0 : this.field1096;
            return this.field1082.method52(arg3, var5, var5, 3, 1.0D, false, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field1076++;
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
    public static void method367(int arg0) {
        field1095 = null;
        field1092 = null;
        if (arg0 != 247) {
            method367(-116);
        }
        field1081 = null;
        field1084 = null;
        field1073 = null;
        field1094 = null;
        field1097 = null;
        field1090 = null;
        field1085 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method368(String arg0, int arg1) throws ClassNotFoundException {
        field1089++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg1 < 7) {
            return null;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Loa;)V")
    public class58(class127 arg0) {
        this.field1082 = new class10(arg0);
        int var2 = arg0.method819((byte) 22);
        this.field1079 = (var2 & 0x2) != 0;
        this.field1088 = (var2 & 0x1) != 0;
        this.field1096 = arg0.method819((byte) 22);
        this.field1071 = arg0.method785(true);
        this.field1075 = arg0.method819((byte) 22);
        if (this.field1075 == 255) {
            this.field1075 = 256;
        }
        int var3 = arg0.method819((byte) 22);
        int var4 = arg0.method819((byte) 22);
        this.field1087 = (var4 & 0x3F) - 6;
        this.field1083 = var4 >> 6 & 0x3;
        this.field1099 = var3 >> 6 & 0x3;
        arg0.method819((byte) 22);
        arg0.method819((byte) 22);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class58() {
        this.field1082 = new class10();
        this.field1088 = true;
        this.field1096 = 1;
    }
}
