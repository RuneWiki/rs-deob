import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class88 extends class398 {

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
    public static int field1232 = 0;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "Lcr;")
    public static class189 field1231 = new class189(8);

    @OriginalMember(owner = "client!hp", name = "S", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!hp", name = "T", descriptor = "[[I")
    public static int[][] field1240 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!hp", name = "O", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hp", name = "Q", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!hp", name = "R", descriptor = "[I")
    public static int[] field1238;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZLii;Llm;)V")
    public static final void method619(boolean arg0, class405 arg1, class347 arg2) {
        field1230++;
        if (class26.field379) {
            return;
        }
        arg1.method1686(0);
        if (arg0) {
            return;
        }
        class273.field3971 = arg1.method1710(class441.method2776(arg2, class367.field5301), true);
        class273.field3971.method454((class138.field1907 - class273.field3971.method411()) / 2, (class92.field1294 - class273.field3971.method409()) / 2);
        class267.field3859 = arg1.method1710(class441.method2776(arg2, class125.field1757), true);
        class267.field3859.method454((class138.field1907 - class267.field3859.method411()) / 2, 18);
        class26.field379 = true;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lwd;B)V")
    public static final void method620(class36 arg0, byte arg1) {
        field1237++;
        class416.field6106 = 3;
        class44.method316(true, true);
        class339.field4891 = true;
        class423.field6238 = 2;
        class213.field2853 = true;
        class416.field6114 = 1;
        class411.field6069 = true;
        class115.field1611 = 0;
        class406.field6030 = 0;
        class166.field2240 = true;
        class211.field2801 = true;
        class431.field6338 = true;
        class299.field4384 = true;
        class359.field5186 = 127;
        class286.field4145 = 0;
        class93.field1342 = true;
        class400.field5969 = 255;
        class122.field1692 = 0;
        class120.field1678 = true;
        class42.field584 = true;
        class156.field2123 = 127;
        if (class134.field1867 >= 96) {
            class377.method2448(2, (byte) -2);
        } else {
            class377.method2448(0, (byte) -2);
        }
        class71.field1022 = 0;
        class275.field3987 = false;
        class184.field2496 = false;
        class11.field171 = 2;
        class275.field3984 = true;
        class434.field6387 = true;
        class324.field4753 = false;
        class196.field2622 = 2;
        class365.field5288 = 0;
        class350 var2 = null;
        try {
            int var3 = 22 / ((-arg1 - 31) / 56);
            class429 var4 = arg0.method266((byte) 44);
            while (var4.field6308 == 0) {
                class144.method918(1L, true);
            }
            if (var4.field6308 == 1) {
                var2 = (class350) var4.field6309;
                byte[] var5 = new byte[(int) var2.method2307((byte) -103)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var2.method2308(var5, var5.length - var6, -5921, var6);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class397.method2552(new class228(var5), -15);
            }
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method2304(-17644);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
    public class88() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIB)I")
    public static final int method621(int arg0, int arg1, int arg2, byte arg3) {
        field1233++;
        if ((class103.field1430[arg2][arg0][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg3 == -19) {
            return arg2 <= 0 || (class103.field1430[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return -20;
        }
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)V")
    public static final void method622(byte arg0) {
        if (arg0 != 88) {
            return;
        }
        field1234++;
        try {
            if (class375.field5452 == 1) {
                int var1 = class321.field4733.method504(arg0 + 15708);
                if (var1 > 0 && class321.field4733.method484(2)) {
                    int var2 = var1 - class9.field151;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class321.field4733.method493(var2, -125);
                } else {
                    class321.field4733.method507(-112);
                    class321.field4733.method511((byte) -125);
                    class165.field2230 = null;
                    if (class129.field1785 == null) {
                        class375.field5452 = 0;
                    } else {
                        class375.field5452 = 2;
                    }
                    class228.field3004 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class321.field4733.method507(-85);
            class165.field2230 = null;
            class228.field3004 = null;
            class129.field1785 = null;
            class375.field5452 = 0;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        field1235++;
        return arg1 == 0 ? class375.field5448 : null;
    }

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)V")
    public static void method623(int arg0) {
        field1240 = null;
        if (arg0 != 8) {
            field1231 = null;
        }
        field1231 = null;
        field1238 = null;
    }
}
