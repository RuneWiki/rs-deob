import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class84 extends class280 {

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "Z")
    public boolean field1217;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "[Llk;")
    public class84[] field1231;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field1216 = 0;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "Z")
    public static boolean field1224 = true;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1220 = "Opened title screen";

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "[I")
    public static int[] field1213 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field1210 = 0;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "Log;")
    public class227 field1228;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "Lwb;")
    public class27 field1211;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V")
    public void method481(boolean arg0) {
        field1218++;
        if (arg0) {
            field1210 = -122;
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)I")
    public int method37(int arg0) {
        field1221++;
        if (arg0 != 7952) {
            field1224 = true;
        }
        return -1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)[[I")
    public int[][] method30(int arg0, byte arg1) {
        field1227++;
        if (arg1 != -18) {
            field1223 = -110;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V")
    public static final void method607(int arg0) {
        if (arg0 != 14) {
            field1223 = -29;
        }
        field1212++;
        class50.field734.method1556((byte) 100);
        class286.field4534.method1556((byte) 80);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lqi;I)Lqi;")
    public static final class131 method608(class131 arg0, int arg1) {
        field1209++;
        if (arg0.field2054 != -1) {
            return class122.method891(arg0.field2054, (byte) -121);
        }
        if (arg1 != 10177) {
            field1210 = -90;
        }
        int var2 = arg0.field2073 >>> 16;
        class186 var3 = new class186(class124.field1806);
        for (class17 var4 = (class17) var3.method1381((byte) 25); var4 != null; var4 = (class17) var3.method1380(1)) {
            if (var4.field191 == var2) {
                return class122.method891((int) var4.field4459, (byte) -126);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V")
    public static void method609(int arg0) {
        field1220 = null;
        field1213 = null;
        if (arg0 != 0) {
            field1220 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
    public final void method610(int arg0, int arg1, int arg2) {
        int var4 = this.field1229 == 255 ? arg2 : this.field1229;
        field1225++;
        if (this.field1217) {
            this.field1228 = new class227(var4, arg2, arg0);
        } else {
            this.field1211 = new class27(var4, arg2, arg0);
        }
        if (arg1 != 22879) {
            this.method32(-27);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)[I")
    public int[] method91(byte arg0, int arg1) {
        field1215++;
        if (arg0 >= -125) {
            this.method610(-126, 121, -37);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lv;BI)V")
    public void method31(class152 arg0, byte arg1, int arg2) {
        if (arg1 <= 87) {
            this.method481(true);
        }
        field1222++;
    }

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)V")
    public void method32(int arg0) {
        if (arg0 != 0) {
            this.method481(false);
        }
        field1208++;
        if (this.field1217) {
            this.field1228.method1626(73);
            this.field1228 = null;
        } else {
            this.field1211.method194((byte) 90);
            this.field1211 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)I")
    public int method136(int arg0) {
        if (arg0 != -1) {
            this.method611(-8, (byte) -104, -53);
        }
        field1219++;
        return -1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBI)[[I")
    public final int[][] method611(int arg0, byte arg1, int arg2) {
        if (arg1 >= -23) {
            this.field1229 = 75;
        }
        field1226++;
        if (this.field1231[arg0].field1217) {
            int[] var4 = this.field1231[arg0].method91((byte) -126, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1231[arg0].method30(arg2, (byte) -18);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZ)[I")
    public final int[] method612(int arg0, int arg1, boolean arg2) {
        field1230++;
        if (arg2) {
            this.field1229 = -19;
        }
        return this.field1231[arg0].field1217 ? this.field1231[arg0].method91((byte) -127, arg1) : this.field1231[arg0].method30(arg1, (byte) -18)[0];
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IZ)V")
    public class84(int arg0, boolean arg1) {
        this.field1217 = arg1;
        this.field1231 = new class84[arg0];
    }
}
