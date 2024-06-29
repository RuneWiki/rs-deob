import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class274 extends class252 {

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public static int field3857;

    static {
        new class572("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "([I[I[IBLks;)V", line = 5)
    public static final void method1719(int[] arg0, int[] arg1, int[] arg2, byte arg3, class373 arg4) {
        field3857++;
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg4.field1917.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field1917[var9] = null;
                    } else {
                        class78 var10 = class463.field6521.method2983(var6, -121);
                        int var11 = var10.field1056;
                        class46 var12 = arg4.field1917[var9];
                        if (var12 != null) {
                            if (var12.field554 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field1917[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field550 = var8;
                                    var12.field547 = 1;
                                    var12.field552 = 0;
                                    var12.field551 = 0;
                                    var12.field558 = 0;
                                    class163.method1179(-1721201176, arg4.field8496, var10, class541.field8119 == arg4, arg4.field8501, arg4.field8500, 0);
                                } else if (var11 == 2) {
                                    var12.field552 = 0;
                                }
                            } else if (var10.field1042 >= class463.field6521.method2983(var12.field554, -120).field1042) {
                                var12 = arg4.field1917[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class46 var13 = arg4.field1917[var9] = new class46();
                            var13.field554 = var6;
                            var13.field547 = 1;
                            var13.field552 = 0;
                            var13.field558 = 0;
                            var13.field550 = var8;
                            var13.field551 = 0;
                            class163.method1179(-1721201176, arg4.field8496, var10, class541.field8119 == arg4, arg4.field8501, arg4.field8500, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg3 == -57) {
            ;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIBI[B[BII)V", line = 109)
    public static final void method1720(int arg0, int arg1, int arg2, byte arg3, int arg4, byte[] arg5, byte[] arg6, int arg7, int arg8) {
        field3856++;
        int var9 = -91 % ((-arg3 - 58) / 34);
        int var10 = -(arg4 >> 2);
        int var11 = -(arg4 & 0x3);
        for (int var12 = -arg8; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg5[var10001] += arg6[arg0++];
                int var15 = arg7++;
                arg5[var15] += arg6[arg0++];
                int var16 = arg7++;
                arg5[var16] += arg6[arg0++];
                int var17 = arg7++;
                arg5[var17] += arg6[arg0++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                var10001 = arg7++;
                arg5[var10001] += arg6[arg0++];
            }
            arg0 += arg1;
            arg7 += arg2;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZLgw;)V", line = 154)
    public static final void method1721(boolean arg0, class148 arg1) {
        field3855++;
        int var2 = arg1.method1055(1957696096);
        class24.field227 = new class309[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class24.field227[var3] = new class309();
            class24.field227[var3].field4270 = arg1.method1055(1957696096);
            class24.field227[var3].field4263 = arg1.method1039(-19);
        }
        class169.field2637 = arg1.method1055(1957696096);
        class561.field8337 = arg1.method1055(1957696096);
        if (arg0) {
            method1720(56, -82, 21, (byte) -120, -24, null, null, -99, 63);
        }
        class18.field172 = arg1.method1055(1957696096);
        class61.field769 = new class187[class561.field8337 - (class169.field2637 - 1)];
        for (int var4 = 0; var4 < class18.field172; var4++) {
            int var5 = arg1.method1055(1957696096);
            class187 var6 = class61.field769[var5] = new class187();
            var6.field5518 = arg1.method1032((byte) -33);
            var6.field5529 = arg1.method1026(-917302120);
            var6.field2784 = var5 + class169.field2637;
            var6.field2789 = arg1.method1039(124);
            var6.field2788 = arg1.method1039(117);
        }
        class79.field1066 = arg1.method1026(-917302120);
        class617.field9126 = true;
    }
}
