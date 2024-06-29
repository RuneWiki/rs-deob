import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class80 {

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Lno;")
    public static class5 field1309 = new class5(5000);

    @OriginalMember(owner = "client!on", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1316 = "Loaded title screen";

    @OriginalMember(owner = "client!on", name = "u", descriptor = "J")
    public static long field1319 = 0L;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public int field1308;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "Lcn;")
    public class292 field1314;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "Lcg;")
    public static class49 field1318;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "[I")
    public int[] field1301;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "[I")
    public int[] field1303;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "[I")
    public int[] field1306;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "[I")
    public int[] field1310;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "[I")
    public int[] field1311;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "[I")
    public int[] field1313;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "[Lcn;")
    public class292[] field1307;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "[[I")
    public int[][] field1302;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "[[I")
    public int[][] field1305;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lql;Lql;IIZZI)I", line = 4)
    public static final int method738(class20 arg0, class20 arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field1315++;
        int var7 = class166.method1304(arg0, arg1, arg5, 7, arg3);
        if (var7 != 0) {
            return arg5 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class166.method1304(arg0, arg1, arg4, 7, arg6);
            if (arg2 < 15) {
                field1317 = -110;
            }
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 38)
    public static void method739(int arg0) {
        field1316 = null;
        if (arg0 != 0) {
            method738((class20) null, (class20) null, 84, 6, false, false, -27);
        }
        field1318 = null;
        field1309 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[B)V", line = 77)
    private final void method740(int arg0, byte[] arg1) {
        field1312++;
        class336 var3 = new class336(class147.method1173((byte) 97, arg1));
        int var4 = var3.method2364(-9069);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field1308 = 0;
        } else {
            this.field1308 = var3.method2338((byte) 85);
        }
        int var5 = var3.method2364(-9069);
        int var6 = 0;
        this.field1304 = var3.method2339((byte) -46);
        int var7 = -1;
        if (arg0 != -19861) {
            return;
        }
        this.field1303 = new int[this.field1304];
        for (int var8 = 0; var8 < this.field1304; var8++) {
            this.field1303[var8] = var6 += var3.method2339((byte) -46);
            if (this.field1303[var8] > var7) {
                var7 = this.field1303[var8];
            }
        }
        this.field1300 = var7 + 1;
        this.field1310 = new int[this.field1300];
        this.field1313 = new int[this.field1300];
        this.field1302 = new int[this.field1300][];
        this.field1301 = new int[this.field1300];
        this.field1311 = new int[this.field1300];
        if (var5 != 0) {
            this.field1306 = new int[this.field1300];
            for (int var9 = 0; var9 < this.field1300; var9++) {
                this.field1306[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1304; var10++) {
                this.field1306[this.field1303[var10]] = var3.method2338((byte) 36);
            }
            this.field1314 = new class292(this.field1306);
        }
        for (int var11 = 0; var11 < this.field1304; var11++) {
            this.field1301[this.field1303[var11]] = var3.method2338((byte) 103);
        }
        for (int var12 = 0; var12 < this.field1304; var12++) {
            this.field1313[this.field1303[var12]] = var3.method2338((byte) 49);
        }
        for (int var13 = 0; var13 < this.field1304; var13++) {
            this.field1310[this.field1303[var13]] = var3.method2339((byte) -46);
        }
        for (int var14 = 0; var14 < this.field1304; var14++) {
            int var15 = 0;
            int var16 = this.field1303[var14];
            int var17 = -1;
            int var18 = this.field1310[var16];
            this.field1302[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field1302[var16][var19] = var15 += var3.method2339((byte) -46);
                if (var20 > var17) {
                    var17 = var20;
                }
            }
            this.field1311[var16] = var17 + 1;
            if (var17 + 1 == var18) {
                this.field1302[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1307 = new class292[var7 + 1];
        this.field1305 = new int[var7 + 1][];
        for (int var21 = 0; var21 < this.field1304; var21++) {
            int var22 = this.field1303[var21];
            int var23 = this.field1310[var22];
            this.field1305[var22] = new int[this.field1311[var22]];
            for (int var24 = 0; var24 < this.field1311[var22]; var24++) {
                this.field1305[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field1302[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field1302[var22][var25];
                }
                this.field1305[var22][var26] = var3.method2338((byte) 121);
            }
            this.field1307[var22] = new class292(this.field1305[var22]);
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "([BI)V", line = 265)
    public class80(byte[] arg0, int arg1) {
        this.field1320 = class37.method323(0, arg0, arg0.length);
        if (this.field1320 != arg1) {
            throw new RuntimeException();
        }
        this.method740(-19861, arg0);
    }
}
