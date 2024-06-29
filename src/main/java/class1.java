import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 {

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lqk;")
    public static class207 field3 = class24.method212(255, "jaune:");

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Z")
    public static boolean field15 = false;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Z")
    public static boolean field10 = true;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lta;")
    public static class254 field5;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lcf;")
    public class92 field2;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "[I")
    public int[] field13;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "[I")
    public int[] field16;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "[I")
    public int[] field26;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[I")
    public int[] field4;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
    public int[] field8;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "[I")
    public int[] field9;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[Lcf;")
    public class92[] field17;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "[[I")
    public int[][] field20;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "[[I")
    public int[][] field27;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([BB)V")
    private final void method1(byte[] arg0, byte arg1) {
        field18++;
        class149 var3 = new class149(class112.method796(arg0, (byte) -52));
        int var4 = var3.method1045((byte) 84);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field24 = var3.method1076(65280);
        } else {
            this.field24 = 0;
        }
        int var5 = var3.method1045((byte) 125);
        this.field6 = var3.method1050(1272006568);
        this.field4 = new int[this.field6];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field6; var8++) {
            this.field4[var8] = var6 += var3.method1050(arg1 + 1272006695);
            if (var7 < this.field4[var8]) {
                var7 = this.field4[var8];
            }
        }
        this.field7 = var7 + 1;
        this.field16 = new int[this.field7];
        if (arg1 != -127) {
            this.field2 = null;
        }
        this.field9 = new int[this.field7];
        this.field27 = new int[this.field7][];
        this.field26 = new int[this.field7];
        this.field8 = new int[this.field7];
        if (var5 != 0) {
            this.field13 = new int[this.field7];
            for (int var9 = 0; var9 < this.field7; var9++) {
                this.field13[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field6; var10++) {
                this.field13[this.field4[var10]] = var3.method1076(65280);
            }
            this.field2 = new class92(this.field13);
        }
        for (int var11 = 0; var11 < this.field6; var11++) {
            this.field26[this.field4[var11]] = var3.method1076(65280);
        }
        for (int var12 = 0; var12 < this.field6; var12++) {
            this.field8[this.field4[var12]] = var3.method1076(65280);
        }
        for (int var13 = 0; var13 < this.field6; var13++) {
            this.field9[this.field4[var13]] = var3.method1050(1272006568);
        }
        for (int var14 = 0; var14 < this.field6; var14++) {
            int var21 = 0;
            int var22 = -1;
            int var23 = this.field4[var14];
            int var24 = this.field9[var23];
            this.field27[var23] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field27[var23][var25] = var21 += var3.method1050(1272006568);
                if (var22 < var26) {
                    var22 = var26;
                }
            }
            this.field16[var23] = var22 + 1;
            if (var22 + 1 == var24) {
                this.field27[var23] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field20 = new int[var7 + 1][];
        this.field17 = new class92[var7 + 1];
        for (int var15 = 0; var15 < this.field6; var15++) {
            int var16 = this.field4[var15];
            int var17 = this.field9[var16];
            this.field20[var16] = new int[this.field16[var16]];
            for (int var18 = 0; var18 < this.field16[var16]; var18++) {
                this.field20[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field27[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field27[var16][var19];
                }
                this.field20[var16][var20] = var3.method1076(65280);
            }
            this.field17[var16] = new class92(this.field20[var16]);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1++;
        int var8 = class21.method123(arg1, -15466, class204.field3580, class204.field3602);
        int var9 = class21.method123(arg6, arg5 ^ 0x3C6F, class204.field3580, class204.field3602);
        int var10 = class21.method123(arg2, -15466, class124.field2158, class88.field1599);
        int var11 = class21.method123(arg7, -15466, class124.field2158, class88.field1599);
        int var12 = class21.method123(arg0 + arg1, -15466, class204.field3580, class204.field3602);
        int var13 = class21.method123(arg6 - arg0, -15466, class204.field3580, class204.field3602);
        for (int var14 = var8; var14 < var12; var14++) {
            class215.method1544(var10, var11, class15.field238[var14], arg3, arg5 - 10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class215.method1544(var10, var11, class15.field238[var15], arg3, 91);
        }
        int var16 = class21.method123(arg2 + arg0, arg5 ^ 0x3C6F, class124.field2158, class88.field1599);
        int var17 = class21.method123(arg7 - arg0, -15466, class124.field2158, class88.field1599);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class15.field238[var18];
            class215.method1544(var10, var16, var19, arg3, 111);
            class215.method1544(var16, var17, var19, arg4, arg5 - 23);
            class215.method1544(var17, var11, var19, arg3, arg5 ^ 0xFFFFFF9C);
        }
        if (arg5 != -7) {
            field14 = -12;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method3(int arg0) {
        field3 = null;
        field5 = null;
        if (arg0 != 0) {
            field11 = -107;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILpk;II)Lob;")
    public static final class130 method4(int arg0, class99 arg1, int arg2, int arg3) {
        if (arg3 > -96) {
            return null;
        } else {
            field12++;
            return class78.method594(arg0, arg1, -101, arg2) ? class5.method36(-3581) : null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)I")
    public static final int method5(byte arg0) {
        field23++;
        return arg0 <= 89 ? -7 : class282.field4958.method1376((byte) 121);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
    public static final int method6(int arg0, int arg1) {
        field19++;
        int var2 = -107 / ((arg1 - 50) / 55);
        return (arg0 & 0x3F9BB) >> 11;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "([BI)V")
    public class1(byte[] arg0, int arg1) {
        this.field25 = class73.method529(arg0.length, -1, arg0);
        if (this.field25 != arg1) {
            throw new RuntimeException();
        }
        this.method1(arg0, (byte) -127);
    }
}
