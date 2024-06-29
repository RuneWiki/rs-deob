import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class98 extends class9 {

    @OriginalMember(owner = "client!oda", name = "E", descriptor = "I")
    public int field1205 = 12800;

    @OriginalMember(owner = "client!oda", name = "C", descriptor = "I")
    public int field1203 = 0;

    @OriginalMember(owner = "client!oda", name = "A", descriptor = "I")
    public int field1201 = 0;

    @OriginalMember(owner = "client!oda", name = "M", descriptor = "Z")
    public boolean field1213 = true;

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "I")
    public int field1200 = 12800;

    @OriginalMember(owner = "client!oda", name = "H", descriptor = "I")
    public int field1208 = -1;

    @OriginalMember(owner = "client!oda", name = "J", descriptor = "I")
    public int field1210 = -1;

    @OriginalMember(owner = "client!oda", name = "w", descriptor = "Ljava/lang/String;")
    public String field1197;

    @OriginalMember(owner = "client!oda", name = "S", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!oda", name = "R", descriptor = "Ljava/lang/String;")
    public String field1218;

    @OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!oda", name = "B", descriptor = "Lui;")
    public class193 field1202;

    @OriginalMember(owner = "client!oda", name = "F", descriptor = "I")
    public static int field1206 = 0;

    @OriginalMember(owner = "client!oda", name = "O", descriptor = "I")
    public static int field1215 = 0;

    @OriginalMember(owner = "client!oda", name = "T", descriptor = "I")
    public static int field1220 = 0;

    @OriginalMember(owner = "client!oda", name = "y", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!oda", name = "D", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!oda", name = "G", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!oda", name = "I", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!oda", name = "K", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!oda", name = "N", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!oda", name = "P", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!oda", name = "U", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!oda", name = "Q", descriptor = "Ln;")
    public static class17 field1217;

    @OriginalMember(owner = "client!oda", name = "L", descriptor = "[Lha;")
    public static class52[] field1212;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(III)I")
    public static final int method598(int arg0, int arg1, int arg2) {
        field1204++;
        if (arg2 != 19099) {
            field1199 = 24;
        }
        int var3 = arg0 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg0 & 0xFF00) * var3 & 0xFF0000 | (arg0 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "([IIII)Z")
    public final boolean method599(int[] arg0, int arg1, int arg2, int arg3) {
        field1211++;
        class80 var5 = (class80) this.field1202.method1050((byte) 73);
        if (arg1 != 6378) {
            this.method603(false, null, -9, 1, 39);
        }
        while (var5 != null) {
            if (var5.method470(arg3, true, arg2)) {
                var5.method463((byte) -126, arg2, arg3, arg0);
                return true;
            }
            var5 = (class80) this.field1202.method1047(-7962);
        }
        return false;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lbk;I)I")
    public static final int method600(class314 arg0, int arg1) {
        field1221++;
        if (class241.field3007 == arg0) {
            return 9216;
        } else if (class546.field8041 == arg0) {
            return 34065;
        } else if (class50.field411 == arg0) {
            return 34066;
        } else {
            if (arg1 != 34066) {
                field1206 = -43;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I[III)Z")
    public final boolean method601(int arg0, int[] arg1, int arg2, int arg3) {
        field1216++;
        class80 var5 = (class80) this.field1202.method1050((byte) 73);
        if (arg0 != 0) {
            this.method599(null, 55, 22, -121);
        }
        while (var5 != null) {
            if (var5.method460(arg0 - 1, arg3, arg2)) {
                var5.method469(arg2, 0, arg1, arg3);
                return true;
            }
            var5 = (class80) this.field1202.method1047(arg0 ^ 0xFFFFE0E6);
        }
        return false;
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(I)V")
    public static void method602(int arg0) {
        field1217 = null;
        field1212 = null;
        if (arg0 > -27) {
            method602(116);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z[IIII)Z")
    public final boolean method603(boolean arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field1214++;
        class80 var6 = (class80) this.field1202.method1050((byte) 73);
        if (!arg0) {
            this.field1201 = -39;
        }
        while (var6 != null) {
            if (var6.method467(arg4, !arg0, arg3, arg2)) {
                var6.method469(arg3, 0, arg1, arg2);
                return true;
            }
            var6 = (class80) this.field1202.method1047(-7962);
        }
        return false;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V")
    public final void method604(byte arg0) {
        this.field1205 = 12800;
        this.field1200 = 12800;
        this.field1201 = 0;
        this.field1203 = 0;
        field1207++;
        if (arg0 != 123) {
            method598(-28, 22, 20);
        }
        for (class80 var2 = (class80) this.field1202.method1050((byte) 73); var2 != null; var2 = (class80) this.field1202.method1047(arg0 - 8085)) {
            if (this.field1200 > var2.field961) {
                this.field1200 = var2.field961;
            }
            if (this.field1201 < var2.field962) {
                this.field1201 = var2.field962;
            }
            if (this.field1205 > var2.field949) {
                this.field1205 = var2.field949;
            }
            if (var2.field951 > this.field1203) {
                this.field1203 = var2.field951;
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class98(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field1197 = arg1;
        this.field1219 = arg0;
        this.field1218 = arg2;
        this.field1198 = arg3;
        this.field1210 = arg6;
        this.field1213 = arg5;
        this.field1208 = arg4;
        if (this.field1210 == 255) {
            this.field1210 = 0;
        }
        this.field1202 = new class193();
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZII)Z")
    public final boolean method605(boolean arg0, int arg1, int arg2) {
        field1209++;
        for (class80 var4 = (class80) this.field1202.method1050((byte) 73); var4 != null; var4 = (class80) this.field1202.method1047(-7962)) {
            if (var4.method460(-1, arg1, arg2)) {
                return true;
            }
        }
        return arg0;
    }
}
