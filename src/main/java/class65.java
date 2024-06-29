import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class65 {

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "[I")
    public static int[] field890 = new int[4];

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZI)[B")
    public static final synchronized byte[] method430(boolean arg0, int arg1) {
        field889++;
        if (arg1 == 100 && class473.field6657 > 0) {
            byte[] var2 = class292.field4160[--class473.field6657];
            class292.field4160[class473.field6657] = null;
            return var2;
        } else if (arg1 == 5000 && class731.field9897 > 0) {
            byte[] var3 = class380.field5536[--class731.field9897];
            class380.field5536[class731.field9897] = null;
            return var3;
        } else if (!arg0) {
            return null;
        } else if (arg1 == 30000 && class605.field8201 > 0) {
            byte[] var4 = class303.field4253[--class605.field8201];
            class303.field4253[class605.field8201] = null;
            return var4;
        } else {
            if (class356.field5192 != null) {
                for (int var5 = 0; var5 < class764.field10493.length; var5++) {
                    if (class764.field10493[var5] == arg1 && class582.field7912[var5] > 0) {
                        byte[] var6 = class356.field5192[var5][--class582.field7912[var5]];
                        class356.field5192[var5][class582.field7912[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Luq;ILha;)V")
    public static final void method431(class172 arg0, int arg1, class66 arg2) {
        field891++;
        class162[] var3 = class162.method1122(arg0, class479.field6728, 0);
        class464.field6584 = new class140[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class464.field6584[var4] = arg2.method466(var3[var4], true);
        }
        class162[] var5 = class162.method1122(arg0, class582.field7908, 0);
        class545.field7530 = new class140[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class545.field7530[var6] = arg2.method466(var5[var6], true);
        }
        class162[] var7 = class162.method1122(arg0, class208.field2673, 0);
        class761.field10457 = new class140[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class761.field10457[var8] = arg2.method466(var7[var8], true);
        }
        class162[] var9 = class162.method1122(arg0, class220.field2860, 0);
        class583.field7917 = new class140[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class583.field7917[var10] = arg2.method466(var9[var10], true);
        }
        class162[] var11 = class162.method1122(arg0, class670.field8980, 0);
        class412.field5916 = new class140[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class412.field5916[var12] = arg2.method466(var11[var12], true);
        }
        class162[] var13 = class162.method1122(arg0, class538.field7451, 0);
        class405.field5744 = new class140[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class405.field5744[var14] = arg2.method466(var13[var14], true);
        }
        class162[] var15 = class162.method1122(arg0, class109.field1520, 0);
        class704.field9635 = new class140[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class704.field9635[var16] = arg2.method466(var15[var16], true);
        }
        class162[] var17 = class162.method1122(arg0, class785.field10788, 0);
        if (arg1 >= -61) {
            method430(false, 65);
        }
        class249.field3295 = new class140[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class249.field3295[var18] = arg2.method466(var17[var18], true);
        }
        class162[] var19 = class162.method1122(arg0, class303.field4245, 0);
        class559.field7669 = new class140[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class559.field7669[var20] = arg2.method466(var19[var20], true);
        }
        class162[] var21 = class162.method1122(arg0, class171.field2241, 0);
        class346.field4860 = new class140[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class346.field4860[var22] = arg2.method466(var21[var22], true);
        }
        class162[] var23 = class162.method1122(arg0, class357.field5201, 0);
        class780.field10701 = new class140[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class780.field10701[var24] = arg2.method466(var23[var24], true);
        }
        class162[] var25 = class162.method1122(arg0, class106.field1498, 0);
        class603.field8192 = new class140[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class603.field8192[var26] = arg2.method466(var25[var26], true);
        }
        class348.field5050 = arg2.method466(class162.method1115(arg0, class328.field4661, 0), true);
        class180.field2366 = arg2.method466(class162.method1115(arg0, class512.field7135, 0), true);
        class162[] var27 = class162.method1122(arg0, class749.field10089, 0);
        class124.field1716 = new class140[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class124.field1716[var28] = arg2.method466(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([BB)V")
    public static final synchronized void method432(byte[] arg0, byte arg1) {
        field892++;
        if (arg0.length == 100 && class473.field6657 < 1000) {
            class292.field4160[class473.field6657++] = arg0;
        } else if (arg0.length == 5000 && class731.field9897 < 250) {
            class380.field5536[class731.field9897++] = arg0;
        } else {
            if (arg1 != 119) {
                field890 = null;
            }
            if (arg0.length == 30000 && class605.field8201 < 50) {
                class303.field4253[class605.field8201++] = arg0;
            } else if (class356.field5192 != null) {
                for (int var2 = 0; var2 < class764.field10493.length; var2++) {
                    if (class764.field10493[var2] == arg0.length && class356.field5192[var2].length > class582.field7912[var2]) {
                        class356.field5192[var2][class582.field7912[var2]++] = arg0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)V")
    public static void method433(boolean arg0) {
        if (arg0) {
            method430(true, -2);
        }
        field890 = null;
    }
}
