import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class386 extends class245 {

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "Ltn;")
    public static class60 field5419 = new class60(20, -1);

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "Ldu;")
    public static class242 field5420 = new class242(3, 19);

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "Leh;")
    public static class246 field5421 = new class246(102, 2);

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public static int field5422 = 0;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field5423 = new String[100];

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "Leh;")
    public static class246 field5424 = new class246(25, 4);

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "[[I")
    public static int[][] field5425 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method2237(byte arg0) {
        field5421 = null;
        field5420 = null;
        int var1 = 19 / ((arg0 - 17) / 40);
        field5419 = null;
        field5425 = null;
        field5423 = null;
        field5424 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIILfu;)V")
    public static final void method2238(byte arg0, int arg1, int arg2, int arg3, class270 arg4) {
        field5418++;
        if (arg0 < 105) {
            method2237((byte) -54);
        }
        for (class136 var5 = (class136) class26.field317.method2655(15152); var5 != null; var5 = (class136) class26.field317.method2660((byte) 67)) {
            if (var5.field1779 == arg2 && (arg3 << 7) == var5.field1792 && arg1 << 7 == var5.field1791 && var5.field1774.field3952 == arg4.field3952) {
                if (var5.field1780 != null) {
                    class138.field1810.method2312(var5.field1780);
                    var5.field1780 = null;
                }
                if (var5.field1777 != null) {
                    class138.field1810.method2312(var5.field1777);
                    var5.field1777 = null;
                }
                var5.method2891(32);
                return;
            }
        }
    }
}
