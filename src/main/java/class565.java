import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class565 {

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Lps;")
    public static class5 field8252 = null;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field8250 = -1;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "[I")
    public static int[] field8251 = new int[1000];

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field8255 = 0;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "[[I")
    public static int[][] field8253;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public static void method3256(boolean arg0) {
        if (!arg0) {
            field8253 = null;
        }
        field8252 = null;
        field8251 = null;
        field8253 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
    public static final void method3257(byte arg0) {
        class373.method2299(true);
        field8256++;
        class149.field2111 = 0;
        class334.field4862 = null;
        class389.field5816.field7956 = 0;
        class160.field2275 = null;
        class617.field8919 = null;
        class543.field8034 = null;
        class297.field4376 = 0;
        class47.field746 = 0;
        class417.method2537(-121);
        class574.method3300(-1);
        int var1 = 71 % ((arg0 + 75) / 49);
        for (int var2 = 0; var2 < 2048; var2++) {
            class35.field551[var2] = null;
        }
        class321.field4681 = null;
        for (int var3 = 0; var3 < class378.field5678; var3++) {
            class53 var5 = class13.field299[var3].field2476;
            if (var5 != null) {
                var5.field7423 = -1;
            }
        }
        class486.method2780((byte) 124);
        class150.field2120 = -1;
        class250.field3280 = -1;
        class684.field9659 = 1;
        class322.method2003(0, 10);
        for (int var4 = 0; var4 < 100; var4++) {
            class394.field5969[var4] = true;
        }
        class392.method2431(1698664816);
        class141.field2040 = 0L;
        class464.field6701 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)V")
    public static final void method3258(int arg0, byte arg1) {
        field8258++;
        class365.field5348 = arg0;
        class222.field2941.method3890(-1);
        if (arg1 <= 103) {
            method3260(102, null);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static final void method3259(int arg0) {
        if (arg0 != -28871) {
            return;
        }
        class46.field711 = null;
        field8254++;
        class541.field8023 = null;
        class200.field2722 = null;
        class552.field8120 = null;
        class612.field8821 = null;
        class177.field2473 = null;
        class652.field9332 = null;
        class699.field9837 = null;
        class386.field5772 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILu;)V")
    public static final void method3260(int arg0, class53 arg1) {
        field8257++;
        if (arg0 != 0) {
            return;
        }
        for (class65 var2 = (class65) class232.field3072.method1904(false); var2 != null; var2 = (class65) class232.field3072.method1901(125)) {
            if (var2.field1015 == arg1) {
                if (var2.field1034 != null) {
                    class556.field8166.method2205(var2.field1034);
                    var2.field1034 = null;
                }
                var2.method2360((byte) 66);
                return;
            }
        }
    }
}
