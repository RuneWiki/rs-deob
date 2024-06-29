import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class667 {

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
    public int field9554;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "[B")
    private byte[] field9559;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public int field9552;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public int field9555;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
    public int field9563;

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
    public static int field9564;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "Lpi;")
    public class463 field9553;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "[I")
    public int[] field9550;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "[I")
    public int[] field9557;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "[I")
    public int[] field9558;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "[I")
    public int[] field9560;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "[I")
    public int[] field9565;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "[I")
    public int[] field9566;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "[Lpi;")
    public class463[] field9556;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "[[B")
    public byte[][] field9561;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "[[I")
    public int[][] field9551;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "[[I")
    public int[][] field9562;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([BI)V", line = 15)
    private final void method3776(byte[] arg0, int arg1) {
        field9564++;
        class389 var3 = new class389(class690.method3900((byte) -105, arg0));
        int var4 = var3.method2229(255);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field9555 = 0;
        } else {
            this.field9555 = var3.method2255(255);
        }
        int var5 = var3.method2229(arg1 ^ 0xFF);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        this.field9552 = var3.method2260(arg1 ^ 0xFFFFFFC0);
        int var8 = 0;
        this.field9566 = new int[this.field9552];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field9552; var10++) {
            this.field9566[var10] = var8 += var3.method2260(class570.method3340(arg1, -45));
            if (this.field9566[var10] > var9) {
                var9 = this.field9566[var10];
            }
        }
        this.field9563 = var9 + 1;
        this.field9560 = new int[this.field9563];
        this.field9550 = new int[this.field9563];
        if (var7) {
            this.field9561 = new byte[this.field9563][];
        }
        this.field9558 = new int[this.field9563];
        this.field9557 = new int[this.field9563];
        this.field9562 = new int[this.field9563][];
        if (var6) {
            this.field9565 = new int[this.field9563];
            for (int var11 = 0; var11 < this.field9563; var11++) {
                this.field9565[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field9552; var12++) {
                this.field9565[this.field9566[var12]] = var3.method2255(255);
            }
            this.field9553 = new class463(this.field9565);
        }
        for (int var13 = 0; var13 < this.field9552; var13++) {
            this.field9557[this.field9566[var13]] = var3.method2255(255);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field9552; var14++) {
                byte[] var15 = new byte[64];
                var3.method2250(-1, 64, var15, 0);
                this.field9561[this.field9566[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field9552; var16++) {
            this.field9550[this.field9566[var16]] = var3.method2255(255);
        }
        for (int var17 = 0; var17 < this.field9552; var17++) {
            this.field9558[this.field9566[var17]] = var3.method2260(-51);
        }
        for (int var18 = arg1; var18 < this.field9552; var18++) {
            int var25 = this.field9566[var18];
            int var26 = 0;
            int var27 = this.field9558[var25];
            int var28 = -1;
            this.field9562[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field9562[var25][var29] = var26 += var3.method2260(-110);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field9560[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field9562[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field9556 = new class463[var9 + 1];
        this.field9551 = new int[var9 + 1][];
        for (int var19 = 0; var19 < this.field9552; var19++) {
            int var20 = this.field9566[var19];
            int var21 = this.field9558[var20];
            this.field9551[var20] = new int[this.field9560[var20]];
            for (int var22 = 0; var22 < this.field9560[var20]; var22++) {
                this.field9551[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field9562[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field9562[var20][var23];
                }
                this.field9551[var20][var24] = var3.method2255(255);
            }
            this.field9556[var20] = new class463(this.field9551[var20]);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lna;Z)Z", line = 214)
    public static final boolean method3777(class43 arg0, boolean arg1) {
        boolean var2 = class340.field4500 == class155.field1899;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method164(105);
        if (arg0.field769 < 0 || arg0.field768 < 0 || arg0.field770 >= class455.field6393 || arg0.field765 >= class302.field4057) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field769; var7 <= arg0.field770; var7++) {
            for (int var11 = arg0.field768; var11 <= arg0.field765; var11++) {
                class433 var12 = class222.method1354(arg0.field532, var7, var11);
                if (var12 != null) {
                    class182 var13 = class627.method3604(arg0, (byte) -69);
                    class182 var14 = var12.field6218;
                    if (var14 == null) {
                        var12.field6218 = var13;
                    } else {
                        while (var14.field2226 != null) {
                            var14 = var14.field2226;
                        }
                        var14.field2226 = var13;
                    }
                    if (var2 && (class16.field315[var7][var11] & 0xFF000000) != 0) {
                        var3 = class16.field315[var7][var11];
                        var4 = class285.field3860[var7][var11];
                        var5 = class206.field2475[var7][var11];
                    }
                    if (!arg1 && var12.field6221 != null && var12.field6221.field7691 > var6) {
                        var6 = var12.field6221.field7691;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field769; var8 <= arg0.field770; var8++) {
                for (int var9 = arg0.field768; var9 <= arg0.field765; var9++) {
                    if ((class16.field315[var8][var9] & 0xFF000000) == 0) {
                        class16.field315[var8][var9] = var3;
                        class285.field3860[var8][var9] = var4;
                        class206.field2475[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class172.field2097[class300.field4041++] = arg0;
        } else {
            int var10 = class340.field4500 == class155.field1899 ? 1 : 0;
            if (!arg0.method175(0)) {
                class67.field1036[var10][class571.field8344[var10]++] = arg0;
            } else if (arg0.method165((byte) -45)) {
                class516.field7547[var10][class596.field8613[var10]++] = arg0;
            } else {
                class549.field7969[var10][class196.field2370[var10]++] = arg0;
            }
        }
        if (arg1) {
            arg0.field527 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "([BI[B)V", line = 327)
    public class667(byte[] arg0, int arg1, byte[] arg2) {
        this.field9554 = class365.method2113(arg0.length, (byte) -100, arg0);
        if (this.field9554 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field9559 = class500.method2910((byte) 120, arg0.length, arg0, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field9559[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3776(arg0, 0);
    }
}
