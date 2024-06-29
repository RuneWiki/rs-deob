import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class89 {

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field1230 = 0;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "Log;")
    public static class157 field1234 = null;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "Lul;")
    public class231 field1244;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "[I")
    public int[] field1224;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "[I")
    public int[] field1225;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "[I")
    public int[] field1231;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "[I")
    public int[] field1233;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "[I")
    public int[] field1239;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "[I")
    public int[] field1243;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "[Lul;")
    public class231[] field1223;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "[[I")
    public int[][] field1241;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "[[I")
    public int[][] field1245;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BC)C", line = 7)
    public static final char method601(byte arg0, char arg1) {
        field1227++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else {
            if (arg0 > -102) {
                method603(102);
            }
            if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)Lv;", line = 44)
    public static final class113 method602(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class113 var4 = var3.field3347;
            var3.field3347 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 69)
    public static void method603(int arg0) {
        int var1 = -18 / ((-arg0 - 53) / 32);
        field1234 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[B)V", line = 77)
    private final void method604(int arg0, byte[] arg1) {
        field1240++;
        class44 var3 = new class44(class144.method1062(0, arg1));
        int var4 = var3.method286((byte) -99);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1242 = var3.method238((byte) 82);
        } else {
            this.field1242 = 0;
        }
        int var5 = var3.method286((byte) -89);
        int var6 = 0;
        int var7 = -1;
        this.field1228 = var3.method271(21081);
        this.field1224 = new int[this.field1228];
        if (arg0 >= -122) {
            field1234 = (class157) null;
        }
        for (int var8 = 0; var8 < this.field1228; var8++) {
            this.field1224[var8] = var6 += var3.method271(21081);
            if (var7 < this.field1224[var8]) {
                var7 = this.field1224[var8];
            }
        }
        this.field1237 = var7 + 1;
        this.field1231 = new int[this.field1237];
        this.field1225 = new int[this.field1237];
        this.field1241 = new int[this.field1237][];
        this.field1239 = new int[this.field1237];
        this.field1243 = new int[this.field1237];
        if (var5 != 0) {
            this.field1233 = new int[this.field1237];
            for (int var9 = 0; var9 < this.field1237; var9++) {
                this.field1233[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1228; var10++) {
                this.field1233[this.field1224[var10]] = var3.method238((byte) 82);
            }
            this.field1244 = new class231(this.field1233);
        }
        for (int var11 = 0; var11 < this.field1228; var11++) {
            this.field1243[this.field1224[var11]] = var3.method238((byte) 82);
        }
        for (int var12 = 0; var12 < this.field1228; var12++) {
            this.field1225[this.field1224[var12]] = var3.method238((byte) 82);
        }
        for (int var13 = 0; var13 < this.field1228; var13++) {
            this.field1231[this.field1224[var13]] = var3.method271(21081);
        }
        for (int var14 = 0; var14 < this.field1228; var14++) {
            int var15 = this.field1224[var14];
            int var16 = this.field1231[var15];
            int var17 = 0;
            this.field1241[var15] = new int[var16];
            int var18 = -1;
            for (int var19 = 0; var19 < var16; var19++) {
                int var20 = this.field1241[var15][var19] = var17 += var3.method271(21081);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field1239[var15] = var18 + 1;
            if (var18 + 1 == var16) {
                this.field1241[var15] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1245 = new int[var7 + 1][];
        this.field1223 = new class231[var7 + 1];
        for (int var21 = 0; var21 < this.field1228; var21++) {
            int var22 = this.field1224[var21];
            int var23 = this.field1231[var22];
            this.field1245[var22] = new int[this.field1239[var22]];
            for (int var24 = 0; var24 < this.field1239[var22]; var24++) {
                this.field1245[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field1241[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field1241[var22][var25];
                }
                this.field1245[var22][var26] = var3.method238((byte) 82);
            }
            this.field1223[var22] = new class231(this.field1245[var22]);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lak;I)Z", line = 259)
    public static final boolean method605(class172 arg0, int arg1) {
        if (arg1 != 1) {
            method601((byte) 116, 'I');
        }
        field1226++;
        return arg0.method1276(class316.field4900, -56);
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "([BI)V", line = 272)
    public class89(byte[] arg0, int arg1) {
        this.field1236 = class179.method1341((byte) -81, arg0.length, arg0);
        if (this.field1236 != arg1) {
            throw new RuntimeException();
        }
        this.method604(-125, arg0);
    }
}
