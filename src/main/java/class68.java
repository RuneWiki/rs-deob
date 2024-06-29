import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class68 implements class61 {

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    private int field1227 = 50;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "Z")
    private boolean field1248 = false;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Lnb;")
    private class144 field1226;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lnb;")
    private class144 field1235;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Lid;")
    private class92 field1232;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "[B")
    private byte[] field1222;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[Z")
    private boolean[] field1223;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[Z")
    private boolean[] field1252;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[B")
    private byte[] field1224;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "[B")
    private byte[] field1250;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "[Z")
    private boolean[] field1237;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "[Z")
    private boolean[] field1243;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "[Z")
    private boolean[] field1241;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "[B")
    private byte[] field1233;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "[S")
    private short[] field1229;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Li;")
    private static class88 field1228 = class208.method1425(105, "Connecting to update server");

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "Li;")
    public static class88 field1234 = class208.method1425(105, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Li;")
    public static class88 field1238 = class208.method1425(105, " (X");

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "Li;")
    public static class88 field1251 = field1228;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Lod;")
    public static class156 field1236 = new class156(0, 0);

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z")
    public final boolean method434(int arg0, int arg1) {
        if (arg0 != 255) {
            method463(44);
        }
        field1244++;
        return this.field1252[arg1];
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Z")
    public final boolean method436(int arg0, byte arg1) {
        field1247++;
        return arg1 > -60 ? true : this.field1223[arg0];
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(IB)Z")
    public final boolean method439(int arg0, byte arg1) {
        field1239++;
        class199 var3 = this.method462(arg0, (byte) 72);
        if (arg1 != -27) {
            this.field1248 = true;
        }
        return var3 == null ? false : var3.method1370(this, 13042, this.field1235);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)I")
    public final int method438(int arg0, int arg1) {
        if (arg0 <= 117) {
            return 46;
        } else {
            field1242++;
            return this.field1229[arg1] & 0xFFFF;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(IB)Lsc;")
    private final class199 method462(int arg0, byte arg1) {
        field1230++;
        class199 var3 = (class199) this.field1232.method666((long) arg0, arg1 - 72);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1226.method941((byte) 56, 0, arg0);
        if (arg1 != 72) {
            method463(63);
        }
        if (var4 == null) {
            return null;
        } else {
            class46 var5 = new class46(var4);
            class199 var6 = new class199(var5);
            this.field1232.method664((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IB)Z")
    public final boolean method437(int arg0, byte arg1) {
        field1231++;
        if (arg1 > -62) {
            this.method437(-74, (byte) -97);
        }
        return this.field1248 || this.field1237[arg0];
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method463(int arg0) {
        field1251 = null;
        field1238 = null;
        field1234 = null;
        field1228 = null;
        field1236 = null;
        if (arg0 > -29) {
            field1236 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
    public final void method464(int arg0) {
        this.field1232.method671(21);
        if (arg0 >= 59) {
            field1225++;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)[I")
    public final int[] method440(int arg0, int arg1) {
        if (arg1 <= 73) {
            return null;
        } else {
            field1253++;
            class199 var3 = this.method462(arg0, (byte) 72);
            return var3 == null ? null : var3.method1368(this.field1235, this.field1248 || this.field1237[arg0], false, this);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Z")
    public static final boolean method465(int arg0, boolean arg1) {
        field1249++;
        if (!arg1) {
            field1238 = null;
        }
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(II)V")
    public final void method466(int arg0, int arg1) {
        if (arg1 != 28948) {
            method463(98);
        }
        for (class199 var3 = (class199) this.field1232.method672(true); var3 != null; var3 = (class199) this.field1232.method665(0)) {
            if (var3.field3802) {
                var3.method1369(arg0, true);
                var3.field3802 = false;
            }
        }
        field1245++;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lnb;Lnb;Lnb;IZ)V")
    public class68(class144 arg0, class144 arg1, class144 arg2, int arg3, boolean arg4) {
        this.field1248 = arg4;
        this.field1226 = arg0;
        this.field1235 = arg2;
        this.field1227 = arg3;
        this.field1232 = new class92(this.field1227);
        class46 var6 = new class46(arg1.method941((byte) 56, 0, 0));
        int var7 = var6.method301(77);
        this.field1222 = new byte[var7];
        this.field1223 = new boolean[var7];
        this.field1252 = new boolean[var7];
        this.field1224 = new byte[var7];
        this.field1250 = new byte[var7];
        this.field1237 = new boolean[var7];
        this.field1243 = new boolean[var7];
        this.field1241 = new boolean[var7];
        this.field1233 = new byte[var7];
        this.field1229 = new short[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1243[var8] = var6.method347(26119) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1243[var9]) {
                this.field1223[var9] = var6.method347(26119) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1243[var10]) {
                this.field1252[var10] = var6.method347(26119) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1243[var11]) {
                this.field1237[var11] = var6.method347(26119) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1243[var12]) {
                this.field1241[var12] = var6.method347(26119) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1243[var13]) {
                this.field1222[var13] = var6.method324(11);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1243[var14]) {
                this.field1250[var14] = var6.method324(108);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1243[var15]) {
                this.field1224[var15] = var6.method324(22);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1243[var16]) {
                this.field1233[var16] = var6.method324(75);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1243[var17]) {
                this.field1229[var17] = (short) var6.method301(87);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(FIZ)[I")
    public final int[] method435(float arg0, int arg1, boolean arg2) {
        if (arg2) {
            return null;
        }
        class199 var4 = this.method462(arg1, (byte) 72);
        field1246++;
        if (var4 == null) {
            return null;
        } else {
            var4.field3802 = true;
            return var4.method1371(this, arg0, this.field1235, this.field1248 || this.field1237[arg1], false);
        }
    }
}
