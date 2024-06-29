import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class51 {

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field1055 = 0;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field1056 = 0;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Lok;")
    public static class149 field1062;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lbj;")
    public class55 field1044;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lom;")
    public static class70 field1051;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
    public int[] field1045;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
    public int[] field1047;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
    public int[] field1050;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[I")
    public int[] field1053;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[I")
    public int[] field1060;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "[I")
    public int[] field1064;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "[Lrj;")
    public static class18[] field1066;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "[Lbj;")
    public class55[] field1054;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "[[I")
    public int[][] field1057;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[[I")
    public int[][] field1058;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIILlg;I)V", line = 12)
    public static final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, class123 arg5, int arg6) {
        field1048++;
        if (arg0 < 93) {
            method431((byte) 121);
        }
        boolean var7 = false;
        boolean var8 = false;
        long var9 = 0L;
        boolean var11 = true;
        if (arg4 == 0) {
            var9 = class102.method861(arg1, arg6, arg3);
        } else if (arg4 == 1) {
            var9 = class123.method969(arg1, arg6, arg3);
        } else if (arg4 == 2) {
            var9 = class184.method1422(arg1, arg6, arg3);
        } else if (arg4 == 3) {
            var9 = class266.method1907(arg1, arg6, arg3);
        }
        int var12 = (int) var9 >> 20 & 0x3;
        int var13 = (int) (var9 >>> 32) & Integer.MAX_VALUE;
        class264 var14 = class252.method1808(var13, (byte) 4);
        if (var14.method1888(0)) {
            class211.method1546(arg1, arg6, var14, 0, arg3);
        }
        int var15 = (int) var9 >> 14 & 0x1F;
        if (var9 == 0L) {
            return;
        }
        class108 var16 = null;
        class108 var17 = null;
        if (arg4 == 0) {
            class17 var18 = class321.method2260(arg1, arg6, arg3);
            if (var18 != null) {
                var17 = var18.field525;
                var16 = var18.field522;
            }
            if (var14.field4704 != 0) {
                arg5.method975(arg3, false, var15, arg6, var12, var14.field4751);
            }
        } else if (arg4 == 1) {
            class235 var19 = class185.method1431(arg1, arg6, arg3);
            if (var19 != null) {
                var16 = var19.field4091;
                var17 = var19.field4099;
            }
        } else if (arg4 == 2) {
            class18 var20 = class194.method1459(arg1, arg6, arg3);
            if (var20 != null) {
                var16 = var20.field563;
            }
            if (var14.field4704 != 0 && arg6 + var14.field4766 < 104 && (var14.field4766 + arg3) < 104 && (var14.field4733 + arg6) < 104 && (var14.field4733 + arg3) < 104) {
                arg5.method980(arg3, var12, var14.field4751, true, var14.field4733, var14.field4766, arg6);
            }
        } else if (arg4 == 3) {
            class243 var21 = class79.method658(arg1, arg6, arg3);
            if (var21 != null) {
                var16 = var21.field4316;
            }
            if (var14.field4704 == 1) {
                arg5.method977(arg6, true, arg3);
            }
        }
        if (!class97.field1824 || !var14.field4715) {
            return;
        }
        if (var15 == 2) {
            if (var16 instanceof class216) {
                ((class216) var16).method1590(42);
            } else {
                class149.method1189(arg6, arg2, 0, false, var14, 0, var12 + 4, arg3, var15);
            }
            if ((var17 instanceof class216)) {
                ((class216) var17).method1590(55);
            } else {
                class149.method1189(arg6, arg2, 0, false, var14, 0, var12 + 1 & 0x3, arg3, var15);
            }
        } else if (var15 == 5) {
            if ((var16 instanceof class216)) {
                ((class216) var16).method1590(84);
            } else {
                class149.method1189(arg6, arg2, class81.field1560[var12] * 8, false, var14, class125.field2276[var12] * 8, var12, arg3, 4);
            }
        } else if (var15 == 6) {
            if ((var16 instanceof class216)) {
                ((class216) var16).method1590(120);
            } else {
                class149.method1189(arg6, arg2, class54.field1188[var12] * 8, false, var14, class24.field611[var12] * 8, var12 + 4, arg3, 4);
            }
        } else if (var15 == 7) {
            if ((var16 instanceof class216)) {
                ((class216) var16).method1590(104);
            } else {
                class149.method1189(arg6, arg2, 0, false, var14, 0, (var12 + 2 & 0x3) + 4, arg3, 4);
            }
        } else if (var15 == 8) {
            if ((var16 instanceof class216)) {
                ((class216) var16).method1590(88);
            } else {
                class149.method1189(arg6, arg2, class54.field1188[var12] * 8, false, var14, class24.field611[var12] * 8, var12 + 4, arg3, 4);
            }
            if (var17 instanceof class216) {
                ((class216) var17).method1590(76);
            } else {
                class149.method1189(arg6, arg2, class54.field1188[var12] * 8, false, var14, class24.field611[var12] * 8, (var12 + 2 & 0x3) + 4, arg3, 4);
            }
        } else if (var15 == 11) {
            if ((var16 instanceof class216)) {
                ((class216) var16).method1590(79);
            } else {
                class149.method1189(arg6, arg2, 0, false, var14, 0, var12 + 4, arg3, 10);
            }
        } else if (var16 instanceof class216) {
            ((class216) var16).method1590(108);
        } else {
            class149.method1189(arg6, arg2, 0, false, var14, 0, var12, arg3, var15);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 207)
    public static void method431(byte arg0) {
        field1051 = null;
        if (arg0 >= -42) {
            field1056 = -18;
        }
        field1062 = null;
        field1066 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BZ)V", line = 233)
    public static final void method432(byte arg0, boolean arg1) {
        class35.method309((byte) 31);
        field1059++;
        if (class53.field1111 != 30 && class53.field1111 != 25) {
            return;
        }
        class233.field4086++;
        if (class233.field4086 < 50 && !arg1) {
            return;
        }
        class233.field4086 = 0;
        if (!class231.field4052 && class202.field3603 != null) {
            class314.field5534.method1634(10, 0);
            try {
                class202.field3603.method2021(class314.field5534.field1142, class314.field5534.field1168, 0, 3);
                class314.field5534.field1142 = 0;
            } catch (IOException var3) {
                class231.field4052 = true;
            }
            class13.field404++;
        }
        class35.method309((byte) 98);
        if (arg0 != -100) {
            field1055 = 89;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BI)V", line = 284)
    private final void method433(byte[] arg0, int arg1) {
        field1049++;
        class53 var3 = new class53(class261.method1869(arg0, 83));
        int var4 = var3.method483(-103);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field1052 = var3.method453(1);
        } else {
            this.field1052 = 0;
        }
        int var5 = var3.method483(-114);
        int var6 = arg1;
        int var7 = 0;
        this.field1061 = var3.method468(28214);
        this.field1045 = new int[this.field1061];
        for (int var8 = 0; var8 < this.field1061; var8++) {
            this.field1045[var8] = var7 += var3.method468(28214);
            if (this.field1045[var8] > var6) {
                var6 = this.field1045[var8];
            }
        }
        this.field1046 = var6 + 1;
        this.field1064 = new int[this.field1046];
        this.field1057 = new int[this.field1046][];
        this.field1050 = new int[this.field1046];
        this.field1053 = new int[this.field1046];
        this.field1060 = new int[this.field1046];
        if (var5 != 0) {
            this.field1047 = new int[this.field1046];
            for (int var9 = 0; var9 < this.field1046; var9++) {
                this.field1047[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1061; var10++) {
                this.field1047[this.field1045[var10]] = var3.method453(class13.method92(arg1, -2));
            }
            this.field1044 = new class55(this.field1047);
        }
        for (int var11 = 0; var11 < this.field1061; var11++) {
            this.field1060[this.field1045[var11]] = var3.method453(1);
        }
        for (int var12 = 0; var12 < this.field1061; var12++) {
            this.field1053[this.field1045[var12]] = var3.method453(1);
        }
        for (int var13 = 0; var13 < this.field1061; var13++) {
            this.field1050[this.field1045[var13]] = var3.method468(28214);
        }
        for (int var14 = 0; var14 < this.field1061; var14++) {
            int var15 = 0;
            int var16 = this.field1045[var14];
            int var17 = this.field1050[var16];
            this.field1057[var16] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field1057[var16][var19] = var15 += var3.method468(28214);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field1064[var16] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field1057[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field1058 = new int[var6 + 1][];
        this.field1054 = new class55[var6 + 1];
        for (int var21 = 0; var21 < this.field1061; var21++) {
            int var22 = this.field1045[var21];
            int var23 = this.field1050[var22];
            this.field1058[var22] = new int[this.field1064[var22]];
            for (int var24 = 0; var24 < this.field1064[var22]; var24++) {
                this.field1058[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field1057[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field1057[var22][var25];
                }
                this.field1058[var22][var26] = var3.method453(arg1 + 2);
            }
            this.field1054[var22] = new class55(this.field1058[var22]);
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([BI)V", line = 452)
    public class51(byte[] arg0, int arg1) {
        this.field1065 = class124.method988(arg0, arg0.length, (byte) 118);
        if (this.field1065 != arg1) {
            throw new RuntimeException();
        }
        this.method433(arg0, -1);
    }
}
