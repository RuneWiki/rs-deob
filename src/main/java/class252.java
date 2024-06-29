import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class252 extends class184 {

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public int field3630;

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
    public int field3629;

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "Z")
    public boolean field3634;

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "I")
    public int field3636;

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field3635 = new String[5];

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "Lqe;")
    public static class469 field3637 = new class469(37, -2);

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method1658(int arg0, int arg1, int arg2, int arg3) {
        field3633++;
        int var4 = arg1 / arg2;
        int var5 = arg1 & arg2 - 1;
        int var6 = arg0 / arg2;
        int var7 = arg0 & arg2 + arg3;
        int var8 = class454.method2781(-73, var4, var6);
        int var9 = class454.method2781(-82, var4 + 1, var6);
        int var10 = class454.method2781(arg3 - 103, var4, var6 + 1);
        int var11 = class454.method2781(arg3 ^ 0x79, var4 + 1, var6 + 1);
        int var12 = class228.method1537(arg2, var8, var9, var5, (byte) -88);
        int var13 = class228.method1537(arg2, var10, var11, var5, (byte) -124);
        return class228.method1537(arg2, var12, var13, var7, (byte) -45);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 38)
    public static void method1659(int arg0) {
        field3637 = null;
        if (arg0 != 1) {
            field3635 = null;
        }
        field3635 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(III)V", line = 51)
    public static final void method1660(int arg0, int arg1, int arg2) {
        boolean var3 = class80.field1136[0][arg1][arg2] != null && class80.field1136[0][arg1][arg2].field2842 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class80.field1136[var4][arg1][arg2] == null) {
                class186 var5 = class80.field1136[var4][arg1][arg2] = new class186(var4);
                if (var3) {
                    var5.field2831++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II[Ljava/lang/String;[SB)V", line = 72)
    public static final void method1661(int arg0, int arg1, String[] arg2, short[] arg3, byte arg4) {
        if (arg1 > arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg0; var9 < arg1; var9++) {
                if (var7 == null || arg2[var9] != null && (var9 & 0x1) > arg2[var9].compareTo(var7)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method1661(arg0, var6 - 1, arg2, arg3, (byte) -127);
            method1661(var6 + 1, arg1, arg2, arg3, (byte) 3);
        }
        field3631++;
        int var12 = -44 % ((-arg4 - 62) / 57);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "()V", line = 132)
    public static final void method1662() {
        if (class375.field5686 != null) {
            for (int var0 = 0; var0 < class375.field5686.length; var0++) {
                for (int var1 = 0; var1 < class34.field356; var1++) {
                    for (int var2 = 0; var2 < class565.field8040; var2++) {
                        if (class375.field5686[var0][var1][var2] != null) {
                            class375.field5686[var0][var1][var2].method1306(-1);
                        }
                        class375.field5686[var0][var1][var2] = null;
                    }
                }
            }
        }
        class375.field5686 = null;
        class531.field7566 = null;
        if (class277.field3946 != null) {
            for (int var3 = 0; var3 < class277.field3946.length; var3++) {
                for (int var4 = 0; var4 < class34.field356; var4++) {
                    for (int var5 = 0; var5 < class565.field8040; var5++) {
                        if (class277.field3946[var3][var4][var5] != null) {
                            class277.field3946[var3][var4][var5].method1306(-1);
                        }
                        class277.field3946[var3][var4][var5] = null;
                    }
                }
            }
        }
        class277.field3946 = null;
        class46.field568 = null;
        class80.field1136 = null;
        class582.field8287 = null;
        class464.field6819 = null;
        class582.field8264 = null;
        class364.field5242 = null;
        class727.field10148 = null;
        class760.field10608 = null;
        class530.method3097(0);
        if (class187.field2850 != null) {
            for (int var6 = 0; var6 < class425.field6313; var6++) {
                class187.field2850[var6] = null;
            }
            class425.field6313 = 0;
        }
        class577.field8153 = null;
        class614.field8664 = null;
        class374.field5677 = null;
        if (class518.field7395 != null) {
            for (int var7 = 0; var7 < class518.field7395.length; var7++) {
                class518.field7395[var7] = null;
            }
            class91.field1277 = 0;
        }
        if (class274.field3907 != null) {
            for (int var8 = 0; var8 < class274.field3907.length; var8++) {
                class274.field3907[var8] = null;
            }
            class630.field8794 = 0;
        }
        if (class234.field3410 != null) {
            for (int var9 = 0; var9 < class625.field8752; var9++) {
                class234.field3410[var9] = null;
            }
            for (int var10 = 0; var10 < class409.field6165; var10++) {
                for (int var11 = 0; var11 < class34.field356; var11++) {
                    for (int var12 = 0; var12 < class565.field8040; var12++) {
                        class146.field1947[var10][var11][var12] = 0L;
                    }
                }
            }
            class625.field8752 = 0;
        }
        class393.method2517((byte) 113);
        class177.field2736 = class177.field2746;
        class177.field2736.method893((byte) -104);
        class289.field4115 = null;
        class624.field8740 = null;
        class21.field225 = null;
        if (class449.field6662 != null) {
            class705.method4010();
            class118.field1620.method486(1);
            class118.field1620.method471(0);
        }
        if (class379.field5736 != null) {
            class379.field5736 = null;
        }
        class118.field1620 = null;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(IIIIIZ)V", line = 302)
    public class252(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3630 = arg1;
        this.field3632 = arg2;
        this.field3629 = arg3;
        this.field3634 = arg5;
        this.field3636 = arg0;
        this.field3638 = arg4;
    }
}
