import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class63 extends class21 {

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    private int field1203 = 8;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    private int field1202 = 0;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    private int field1206 = 4;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    private int field1214 = 1024;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    private int field1218 = 81;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    private int field1213 = 1024;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    private int field1217 = 204;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    private int field1207 = 409;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "Z")
    public static boolean field1219 = false;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "Lbm;")
    public static class307 field1205;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "[I")
    private int[] field1209;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "[[I")
    private int[][] field1204;

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "[[I")
    private int[][] field1221;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V", line = 5)
    public final void method183(byte arg0) {
        field1208++;
        if (arg0 <= 82) {
            method486((class307) null, (byte) -14);
        }
        this.method484(-1);
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V", line = 20)
    private final void method484(int arg0) {
        field1222++;
        Random var2 = new Random((long) this.field1203);
        this.field1220 = 4096 / this.field1206;
        this.field1215 = 4096 / this.field1203;
        this.field1204 = new int[this.field1203][this.field1206 - arg0];
        this.field1212 = this.field1218 / 2;
        int var3 = this.field1220 / 2;
        int var4 = this.field1215 / 2;
        this.field1209 = new int[this.field1203 + 1];
        this.field1221 = new int[this.field1203][this.field1206];
        this.field1209[0] = 0;
        for (int var5 = 0; var5 < this.field1203; var5++) {
            if (var5 > 0) {
                int var6 = this.field1215;
                int var7 = (class220.method1462(var2, -861395680, 4096) - 2048) * this.field1217 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1209[var5] = this.field1209[var5 - 1] + var8;
            }
            this.field1204[var5][0] = 0;
            for (int var9 = 0; var9 < this.field1206; var9++) {
                if (var9 > 0) {
                    int var10 = this.field1220;
                    int var11 = (class220.method1462(var2, -861395680, 4096) - 2048) * this.field1207 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1204[var5][var9] = this.field1204[var5][var9 - 1] + var12;
                }
                this.field1221[var5][var9] = this.field1213 <= 0 ? 4096 : 4096 - class220.method1462(var2, class331.method2296(arg0, 861395679), this.field1213);
            }
            this.field1204[var5][this.field1206] = 4096;
        }
        this.field1209[this.field1203] = 4096;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V", line = 78)
    public static void method485(int arg0) {
        if (arg0 != 5939) {
            field1219 = true;
        }
        field1205 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILag;)V", line = 91)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            return;
        }
        if (arg1 == 0) {
            this.field1206 = arg2.method1317((byte) -117);
        } else if (arg1 == 1) {
            this.field1203 = arg2.method1317((byte) -126);
        } else if (arg1 == 2) {
            this.field1207 = arg2.method1315(14289);
        } else if (arg1 == 3) {
            this.field1217 = arg2.method1315(14289);
        } else if (arg1 == 4) {
            this.field1214 = arg2.method1315(14289);
        } else if (arg1 == 5) {
            this.field1202 = arg2.method1315(14289);
        } else if (arg1 == 6) {
            this.field1218 = arg2.method1315(arg0 ^ 0xFFFFC913);
        } else if (arg1 == 7) {
            this.field1213 = arg2.method1315(14289);
        }
        field1210++;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 377)
    public class63() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[I", line = 196)
    public final int[] method177(int arg0, int arg1) {
        field1223++;
        int[] var3 = this.field443.method1040(arg1, false);
        int var4 = 28 % ((33 - arg0) / 36);
        if (this.field443.field2637) {
            int var5 = 0;
            int var6;
            for (var6 = class330.field5058[arg1] + this.field1202; var6 < 0; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (this.field1203 > var5 && this.field1209[var5] <= var6) {
                var5++;
            }
            boolean var7 = (var5 & 0x1) == 0;
            int var8 = var5 - 1;
            int var9 = this.field1209[var5];
            int var10 = this.field1209[var5 - 1];
            if (this.field1212 + var10 < var6 && var9 - this.field1212 > var6) {
                for (int var11 = 0; var11 < class294.field4489; var11++) {
                    int var12 = 0;
                    int var13 = var7 ? this.field1214 : -this.field1214;
                    int var14;
                    for (var14 = (this.field1220 * var13 >> 12) + class51.field1027[var11]; var14 < 0; var14 += 4096) {
                    }
                    while (var14 > 4096) {
                        var14 -= 4096;
                    }
                    while (var12 < this.field1206 && var14 >= this.field1204[var8][var12]) {
                        var12++;
                    }
                    int var15 = var12 - 1;
                    int var16 = this.field1204[var8][var15];
                    int var17 = this.field1204[var8][var12];
                    if (var14 > var16 + this.field1212 && var14 < var17 - this.field1212) {
                        var3[var11] = this.field1221[var8][var15];
                    } else {
                        var3[var11] = 0;
                    }
                }
            } else {
                class129.method854(var3, 0, class294.field4489, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lbm;B)V", line = 306)
    public static final void method486(class307 arg0, byte arg1) {
        field1216++;
        class93.field1678 = class71.method546(arg0, (byte) 3, class118.field2054);
        class21.field452 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class276.field4216[var2] & 0xFF0000) >> 16);
            int var4 = (class276.field4216[var2 + 1] & 0xFF0000) >> 16;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) ((class276.field4216[var2] & 0xFF00) >> 8);
            int var7 = (class276.field4216[var2 + 1] & 0xFF00) >> 8;
            float var8 = ((float) var7 - var6) / 64.0F;
            int var9 = class276.field4216[var2 + 1] & 0xFF;
            float var10 = (float) (class276.field4216[var2] & 0xFF);
            float var11 = ((float) var9 - var10) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class21.field452[var2 * 64 + var12] = class212.method1434(class212.method1434((int) var6 << 8, (int) var3 << 16), (int) var10);
                var3 += var5;
                var10 += var11;
                var6 += var8;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class21.field452[var13] = class276.field4216[3];
        }
        class271.field4177 = new int[32768];
        class255.field3994 = new int[32768];
        class220.method1464((byte) -89, (class113) null);
        class54.field1079 = new int[32768];
        class174.field2793 = new int[32768];
        if (arg1 < 103) {
            field1219 = false;
        }
        class234.field3681 = new class206(128, 254);
    }
}
