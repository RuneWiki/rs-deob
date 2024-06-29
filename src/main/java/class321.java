import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class321 {

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4398 = "slide:";

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public int field4412;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public int field4413;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lpk;")
    public class109 field4401;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lqj;")
    public static class296 field4395;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "[I")
    public int[] field4396;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "[I")
    public int[] field4399;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "[I")
    public int[] field4403;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "[I")
    public int[] field4407;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "[I")
    public int[] field4410;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "[I")
    public int[] field4414;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[Lpk;")
    public class109[] field4400;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "[[I")
    public int[][] field4397;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[[I")
    public int[][] field4408;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 23)
    public static final void method2031(byte arg0) {
        field4402++;
        int var1 = class245.field3391.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class245.field3391[var2] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class326.field4455; var5++) {
                    if (class324.field4432[var2] == class108.field1603[var5]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class108.field1603[class326.field4455] = class324.field4432[var2];
                    var4 = class326.field4455++;
                }
                class371 var6 = new class371(class245.field3391[var2]);
                int var7 = 0;
                while (class245.field3391[var2].length > var6.field5273 && var7 < 511 && class71.field1096 < 1023) {
                    int var8 = var4 | var7++ << 6;
                    int var9 = var6.method2403((byte) 69);
                    int var10 = var9 >> 14;
                    int var11 = (var9 & 0x1FDE) >> 7;
                    int var12 = var9 & 0x3F;
                    int var13 = (class324.field4432[var2] >> 8) * 64 + var11 - class449.field6509;
                    int var14 = (class324.field4432[var2] & 0xFF) * 64 + var12 - class354.field4981;
                    class221 var15 = class393.method2556(var6.method2403((byte) 116), 4);
                    if (class445.field6422[var8] == null && (var15.field2957 & 0x1) > 0 && client.field2349 == var10 && var13 >= 0 && class432.field6220 > var15.field2958 + var13 && var14 >= 0 && class267.field3646 > var15.field2958 + var14) {
                        class445.field6422[var8] = new class437();
                        class445.field6422[var8].field862 = var8;
                        class437 var16 = class445.field6422[var8];
                        class280.field3837[class71.field1096++] = var8;
                        var16.field874 = class35.field541;
                        var16.method2733(var15, -73);
                        var16.method399(var16.field6290.field2958, 16383);
                        var16.field878 = var16.field6290.field2907 << 3;
                        if (var16.field878 == 0) {
                            var16.method417((byte) 14, 0);
                        } else {
                            var16.method417((byte) -112, class389.field5706[var16.field6290.field2953 - 1]);
                        }
                        var16.method396(var16.method410((byte) 102), (byte) 118, var10, var13, var14, true);
                    }
                }
            }
        }
        int var3 = -63 % ((arg0 + 17) / 36);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([BI)V", line = 127)
    private final void method2032(byte[] arg0, int arg1) {
        field4405++;
        class371 var3 = new class371(class386.method2525(-3, arg0));
        int var4 = var3.method2429(arg1);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field4413 = var3.method2413((byte) -30);
        } else {
            this.field4413 = 0;
        }
        int var5 = var3.method2429(0);
        this.field4412 = var3.method2403((byte) 62);
        int var6 = arg1;
        this.field4399 = new int[this.field4412];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field4412; var8++) {
            this.field4399[var8] = var6 += var3.method2403((byte) 97);
            if (var7 < this.field4399[var8]) {
                var7 = this.field4399[var8];
            }
        }
        this.field4404 = var7 + 1;
        this.field4403 = new int[this.field4404];
        this.field4410 = new int[this.field4404];
        this.field4407 = new int[this.field4404];
        this.field4397 = new int[this.field4404][];
        this.field4396 = new int[this.field4404];
        if (var5 != 0) {
            this.field4414 = new int[this.field4404];
            for (int var9 = 0; var9 < this.field4404; var9++) {
                this.field4414[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4412; var10++) {
                this.field4414[this.field4399[var10]] = var3.method2413((byte) -30);
            }
            this.field4401 = new class109(this.field4414);
        }
        for (int var11 = 0; var11 < this.field4412; var11++) {
            this.field4403[this.field4399[var11]] = var3.method2413((byte) -30);
        }
        for (int var12 = 0; var12 < this.field4412; var12++) {
            this.field4407[this.field4399[var12]] = var3.method2413((byte) -30);
        }
        for (int var13 = 0; var13 < this.field4412; var13++) {
            this.field4396[this.field4399[var13]] = var3.method2403((byte) 74);
        }
        for (int var14 = 0; var14 < this.field4412; var14++) {
            int var21 = this.field4399[var14];
            int var22 = this.field4396[var21];
            int var23 = 0;
            int var24 = -1;
            this.field4397[var21] = new int[var22];
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field4397[var21][var25] = var23 += var3.method2403((byte) 124);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field4410[var21] = var24 + 1;
            if ((var24 + 1) == var22) {
                this.field4397[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4408 = new int[var7 + 1][];
        this.field4400 = new class109[var7 + 1];
        for (int var15 = 0; var15 < this.field4412; var15++) {
            int var16 = this.field4399[var15];
            int var17 = this.field4396[var16];
            this.field4408[var16] = new int[this.field4410[var16]];
            for (int var18 = 0; var18 < this.field4410[var16]; var18++) {
                this.field4408[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field4397[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field4397[var16][var19];
                }
                this.field4408[var16][var20] = var3.method2413((byte) -30);
            }
            this.field4400[var16] = new class109(this.field4408[var16]);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V", line = 298)
    public static void method2033(byte arg0) {
        if (arg0 != -54) {
            method2033((byte) 59);
        }
        field4398 = null;
        field4395 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "([BI)V", line = 310)
    public class321(byte[] arg0, int arg1) {
        this.field4409 = class191.method1269(arg0, 376, arg0.length);
        if (this.field4409 != arg1) {
            throw new RuntimeException();
        }
        this.method2032(arg0, 0);
    }
}
