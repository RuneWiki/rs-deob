import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class258 {

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public static int field3327 = 0;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "Lcq;")
    public static class72 field3319 = new class72("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    public static int field3339 = -1;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public int field3335;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "Lwo;")
    public static class285 field3326;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Lgk;")
    public class398 field3320;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "[I")
    public int[] field3323;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "[I")
    public int[] field3329;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "[I")
    public int[] field3330;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "[I")
    public int[] field3331;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "[I")
    public int[] field3336;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "[I")
    public int[] field3337;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "[Lgk;")
    public class398[] field3328;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "[[I")
    public int[][] field3321;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "[[I")
    public int[][] field3334;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "([BB)V", line = 15)
    private final void method1632(byte[] arg0, byte arg1) {
        field3338++;
        class242 var3 = new class242(class97.method601(arg0, -2));
        int var4 = var3.method1563(-128);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3332 = 0;
        } else {
            this.field3332 = var3.method1576((byte) 126);
        }
        int var5 = var3.method1563(-128);
        this.field3324 = var3.method1587((byte) -102);
        int var6 = 0;
        int var7 = -1;
        this.field3336 = new int[this.field3324];
        if (arg1 != 86) {
            this.field3323 = null;
        }
        for (int var8 = 0; var8 < this.field3324; var8++) {
            this.field3336[var8] = var6 += var3.method1587((byte) -102);
            if (var7 < this.field3336[var8]) {
                var7 = this.field3336[var8];
            }
        }
        this.field3335 = var7 + 1;
        this.field3323 = new int[this.field3335];
        this.field3337 = new int[this.field3335];
        this.field3331 = new int[this.field3335];
        this.field3330 = new int[this.field3335];
        this.field3321 = new int[this.field3335][];
        if (var5 != 0) {
            this.field3329 = new int[this.field3335];
            for (int var9 = 0; var9 < this.field3335; var9++) {
                this.field3329[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3324; var10++) {
                this.field3329[this.field3336[var10]] = var3.method1576((byte) 125);
            }
            this.field3320 = new class398(this.field3329);
        }
        for (int var11 = 0; var11 < this.field3324; var11++) {
            this.field3330[this.field3336[var11]] = var3.method1576((byte) 121);
        }
        for (int var12 = 0; var12 < this.field3324; var12++) {
            this.field3323[this.field3336[var12]] = var3.method1576((byte) 126);
        }
        for (int var13 = 0; var13 < this.field3324; var13++) {
            this.field3331[this.field3336[var13]] = var3.method1587((byte) -102);
        }
        for (int var14 = 0; var14 < this.field3324; var14++) {
            int var21 = this.field3336[var14];
            int var22 = 0;
            int var23 = this.field3331[var21];
            this.field3321[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field3321[var21][var25] = var22 += var3.method1587((byte) -102);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field3337[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field3321[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3328 = new class398[var7 + 1];
        this.field3334 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field3324; var15++) {
            int var16 = this.field3336[var15];
            int var17 = this.field3331[var16];
            this.field3334[var16] = new int[this.field3337[var16]];
            for (int var18 = 0; var18 < this.field3337[var16]; var18++) {
                this.field3334[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3321[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3321[var16][var19];
                }
                this.field3334[var16][var20] = var3.method1576((byte) 124);
            }
            this.field3328[var16] = new class398(this.field3334[var16]);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIBIIIIII)V", line = 185)
    public static final void method1633(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 > -78) {
            method1635((byte) -75);
        }
        field3322++;
        if (class192.method1185(-3201, arg6)) {
            client.method2689(class362.field4903[arg6], -1, arg9, arg5, arg1, arg8, arg2, arg0, arg7, arg4);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Luo;Z)V", line = 201)
    public static final void method1634(class118 arg0, boolean arg1) {
        field3325++;
        if (arg1 || class333.field4544.method1694((byte) 28) == 0) {
            return;
        }
        if (class20.field220 == 0 || class20.field220 == 2) {
            for (class101 var4 = (class101) class333.field4544.method1690((byte) -107); var4 != null; var4 = (class101) class333.field4544.method1699((byte) 46)) {
                class370.method2332(arg0, false, 0, var4.field1183, var4.field1180, class363.field4933, var4.field1178, false, arg0, var4.field1175, var4.field1173 ? class143.field1684.field1466 : null, var4.field1181);
                var4.method263(false);
            }
            class11.method53(16026);
            return;
        }
        if (class427.field5840 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class427.field5840 = class118.method700((byte) 75, class450.field6292, 0, var2, class401.field5525, 0);
            class308.field4183 = class427.field5840.method747(class181.method1132(class231.field3042, 0, (byte) 45, class201.field2370), class132.method853(class15.field177, class231.field3042, 0), true);
        }
        for (class101 var3 = (class101) class333.field4544.method1690((byte) -112); var3 != null; var3 = (class101) class333.field4544.method1699((byte) 15)) {
            class370.method2332(class427.field5840, false, 0, var3.field1183, var3.field1180, class308.field4183, var3.field1178, false, arg0, var3.field1175, var3.field1173 ? class143.field1684.field1466 : null, var3.field1181);
            var3.method263(false);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V", line = 268)
    public static void method1635(byte arg0) {
        field3326 = null;
        field3319 = null;
        if (arg0 != -23) {
            method1634((class118) null, false);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "([BI)V", line = 285)
    public class258(byte[] arg0, int arg1) {
        this.field3333 = class106.method637(arg0, arg0.length, -55);
        if (this.field3333 != arg1) {
            throw new RuntimeException();
        }
        this.method1632(arg0, (byte) 86);
    }
}
