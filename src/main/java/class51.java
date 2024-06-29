import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 extends class124 {

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    private int field1217 = 0;

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    private int field1225 = 128;

    @OriginalMember(owner = "client!hb", name = "hb", descriptor = "I")
    private int field1233 = 128;

    @OriginalMember(owner = "client!hb", name = "gb", descriptor = "I")
    private int field1232 = 0;

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "I")
    private int field1230 = 0;

    @OriginalMember(owner = "client!hb", name = "ib", descriptor = "I")
    public int field1234 = -1;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field1214 = 0;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "[Lnf;")
    public static class96[] field1218 = new class96[50];

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "Lr;")
    public static class118 field1224 = class153.method1136(102, "Texturen geladen)3");

    @OriginalMember(owner = "client!hb", name = "jb", descriptor = "Lr;")
    public static class118 field1235 = class153.method1136(99, "headicons_hint");

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "[[I")
    public static int[][] field1229 = new int[104][104];

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field1213 = 0;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "Lr;")
    private static class118 field1222 = class153.method1136(120, "wave:");

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "Lr;")
    public static class118 field1221 = class153.method1136(124, "(Y<)4col>");

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "Lr;")
    public static class118 field1216 = field1222;

    @OriginalMember(owner = "client!hb", name = "mb", descriptor = "Lr;")
    public static class118 field1238 = field1222;

    @OriginalMember(owner = "client!hb", name = "nb", descriptor = "B")
    public static byte field1239;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!hb", name = "fb", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!hb", name = "lb", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client!hb", name = "ob", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "Ljf;")
    public static class68 field1223;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "[S")
    private short[] field1220;

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "[S")
    private short[] field1226;

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "[S")
    private short[] field1227;

    @OriginalMember(owner = "client!hb", name = "kb", descriptor = "[S")
    private short[] field1236;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Lwb;")
    public final class155 method455(byte arg0, int arg1) {
        field1240++;
        class155 var3 = (class155) class41.field963.method395((byte) -48, (long) this.field1219);
        if (var3 == null) {
            class17 var4 = class17.method167(class136.field3069, this.field1237, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field1226 != null) {
                for (int var5 = 0; var5 < this.field1226.length; var5++) {
                    var4.method155(this.field1226[var5], this.field1236[var5]);
                }
            }
            if (this.field1220 != null) {
                for (int var6 = 0; var6 < this.field1220.length; var6++) {
                    var4.method169(this.field1220[var6], this.field1227[var6]);
                }
            }
            var3 = var4.method168(this.field1217 + 64, this.field1232 + 850, -30, -50, -30);
            class41.field963.method391(var3, (long) this.field1219, true);
        }
        if (arg0 != 73) {
            return null;
        }
        class155 var7;
        if (this.field1234 == -1 || arg1 == -1) {
            var7 = var3.method1210(true);
        } else {
            var7 = class125.method970((byte) -68, this.field1234).method1134(-10046, arg1, var3);
        }
        if (this.field1233 != 128 || this.field1225 != 128) {
            var7.method1206(this.field1233, this.field1225, this.field1233);
        }
        if (this.field1230 != 0) {
            if (this.field1230 == 90) {
                var7.method1198();
            }
            if (this.field1230 == 180) {
                var7.method1198();
                var7.method1198();
            }
            if (this.field1230 == 270) {
                var7.method1198();
                var7.method1198();
                var7.method1198();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILpa;I)V")
    private final void method456(int arg0, class105 arg1, int arg2) {
        field1228++;
        if (arg2 == 1) {
            this.field1237 = arg1.method838((byte) 5);
        } else if (arg2 == 2) {
            this.field1234 = arg1.method838((byte) 5);
        } else if (arg2 == 4) {
            this.field1233 = arg1.method838((byte) 5);
        } else if (arg2 == 5) {
            this.field1225 = arg1.method838((byte) 5);
        } else if (arg2 == 6) {
            this.field1230 = arg1.method838((byte) 5);
        } else if (arg2 == 7) {
            this.field1217 = arg1.method831((byte) 76);
        } else if (arg2 == 8) {
            this.field1232 = arg1.method831((byte) 76);
        } else if (arg2 == 40) {
            int var4 = arg1.method831((byte) 76);
            this.field1226 = new short[var4];
            this.field1236 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1226[var5] = (short) arg1.method838((byte) 5);
                this.field1236[var5] = (short) arg1.method838((byte) 5);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method831((byte) 76);
            this.field1227 = new short[var6];
            this.field1220 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1220[var7] = (short) arg1.method838((byte) 5);
                this.field1227[var7] = (short) arg1.method838((byte) 5);
            }
        }
        if (arg0 != -8) {
            this.field1234 = -99;
        }
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    public static void method457(int arg0) {
        field1224 = null;
        if (arg0 >= -41) {
            field1223 = null;
        }
        field1223 = null;
        field1238 = null;
        field1218 = null;
        field1235 = null;
        field1216 = null;
        field1221 = null;
        field1222 = null;
        field1229 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB)V")
    public static final void method458(int arg0, int arg1, byte arg2) {
        field1231++;
        if (arg2 >= -122) {
            method458(28, 14, (byte) 6);
        }
        if (class59.field1386 != 0 && arg0 != -1) {
            class100.method773(0, class59.field1386, client.field518, 6116423, false, arg0);
            class85.field2059 = true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLpa;)V")
    public final void method459(byte arg0, class105 arg1) {
        if (arg0 <= 39) {
            field1214 = 14;
        }
        field1215++;
        while (true) {
            int var3 = arg1.method831((byte) 76);
            if (var3 == 0) {
                return;
            }
            this.method456(-8, arg1, var3);
        }
    }
}
