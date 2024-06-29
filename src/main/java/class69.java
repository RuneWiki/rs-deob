import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class69 extends class167 {

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "Le;")
    public static class191 field1216 = null;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field1217 = 0;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "Le;")
    public static class191 field1215 = class54.method368(" zuerst von Ihrer Freunde)2Liste(Q", 2047);

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field1205 = 0;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Lpk;")
    public static class66 field1213 = new class66(64);

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    public static int field1222 = 0;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "[I")
    public static int[] field1223 = new int[4096];

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "[I")
    public int[] field1209;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "[I")
    private int[] field1212;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "[Le;")
    private class191[] field1204;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "[[B")
    public static byte[][] field1214;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "[[I")
    private int[][] field1211;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[ILji;)V")
    public final void method454(int arg0, int[] arg1, class225 arg2) {
        field1221++;
        if (this.field1212 == null) {
            return;
        }
        for (int var4 = 0; this.field1212.length > var4 && var4 < arg1.length; var4++) {
            int var5 = class148.field2514[this.method459(-19524, var4)];
            if (var5 > 0) {
                arg2.method1603(true, var5, (long) arg1[var4]);
            }
        }
        if (arg0 > -12) {
            this.field1209 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
    public static void method455(int arg0) {
        field1223 = null;
        if (arg0 == -26390) {
            field1216 = null;
            field1215 = null;
            field1213 = null;
            field1214 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)I")
    public final int method456(int arg0) {
        field1203++;
        if (this.field1212 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field1212 = null;
            }
            return this.field1212.length;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)I")
    public final int method457(int arg0, int arg1, byte arg2) {
        int var4 = 51 % ((arg2 + 73) / 34);
        field1210++;
        if (this.field1212 == null || arg1 < 0 || this.field1212.length < arg1) {
            return -1;
        } else if (this.field1211[arg1] == null || arg0 < 0 || this.field1211[arg1].length < arg0) {
            return -1;
        } else {
            return this.field1211[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V")
    public final void method458(int arg0) {
        if (this.field1209 != null) {
            for (int var2 = 0; var2 < this.field1209.length; var2++) {
                this.field1209[var2] = class217.method1476(this.field1209[var2], 32768);
            }
        }
        field1219++;
        if (arg0 < 2) {
            this.method462(78, (class225) null);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)I")
    public final int method459(int arg0, int arg1) {
        field1220++;
        if (arg0 != -19524) {
            this.field1211 = null;
        }
        return this.field1212 == null || arg1 < 0 || arg1 > this.field1212.length ? -1 : this.field1212[arg1];
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLji;)V")
    public final void method460(byte arg0, class225 arg1) {
        if (arg0 != 5) {
            return;
        }
        field1207++;
        while (true) {
            int var3 = arg1.method1580(-117);
            if (var3 == 0) {
                return;
            }
            this.method461(var3, arg1, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILji;B)V")
    private final void method461(int arg0, class225 arg1, byte arg2) {
        field1206++;
        if (arg2 <= 105) {
            field1217 = -10;
        }
        if (arg0 == 1) {
            this.field1204 = arg1.method1596((byte) 37).method1344((byte) 125, 60);
        } else if (arg0 == 2) {
            int var4 = arg1.method1580(-16);
            this.field1209 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1209[var5] = arg1.method1593(true);
            }
            return;
        } else if (arg0 == 3) {
            int var6 = arg1.method1580(-10);
            this.field1211 = new int[var6][];
            this.field1212 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1593(true);
                this.field1212[var7] = var8;
                this.field1211[var7] = new int[class182.field3130[var8]];
                for (int var9 = 0; var9 < class182.field3130[var8]; var9++) {
                    this.field1211[var7][var9] = arg1.method1593(true);
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILji;)Le;")
    public final class191 method462(int arg0, class225 arg1) {
        int var3 = 110 / ((44 - arg0) / 54);
        field1218++;
        class191 var4 = class167.method1123(-4636, 80);
        if (this.field1212 != null) {
            for (int var5 = 0; var5 < this.field1212.length; var5++) {
                var4.method1326((byte) -9, this.field1204[var5]);
                var4.method1326((byte) -9, class151.method1027((byte) -29, arg1.method1556(class17.field234[this.field1212[var5]], 8), this.field1212[var5], this.field1211[var5]));
            }
        }
        var4.method1326((byte) -9, this.field1204[this.field1204.length - 1]);
        return var4.method1307((byte) 86);
    }

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "(I)Le;")
    public final class191 method463(int arg0) {
        if (arg0 != -1) {
            return null;
        }
        field1208++;
        class191 var2 = class167.method1123(-4636, 80);
        if (this.field1204 == null) {
            return class123.field2033;
        }
        var2.method1326((byte) -9, this.field1204[0]);
        for (int var3 = 1; var3 < this.field1204.length; var3++) {
            var2.method1326((byte) -9, class159.field2700);
            var2.method1326((byte) -9, this.field1204[var3]);
        }
        return var2.method1307((byte) 92);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1223[var0] = class258.method1782(var0, 1263456684);
        }
    }
}
