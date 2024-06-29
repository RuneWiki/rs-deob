import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class103 extends class55 {

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "Lkba;")
    public static class108 field1381 = new class108();

    @OriginalMember(owner = "client!eda", name = "u", descriptor = "[Ljea;")
    public static class452[] field1388 = new class452[14];

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "Lfha;")
    public static class382 field1384 = new class382(10, 7);

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!eda", name = "t", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "Lbi;")
    public class481 field1379;

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "Llga;")
    public class712 field1378;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
    public static void method704(byte arg0) {
        if (arg0 != -90) {
            method705(-18, (byte) 126);
        }
        field1381 = null;
        field1388 = null;
        field1384 = null;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IB)V")
    public static final void method705(int arg0, byte arg1) {
        class362.field4796.method1569((byte) 62, arg0);
        field1387++;
        int var2 = -64 / ((arg1 + 10) / 50);
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(B)V")
    public final void method706(byte arg0) {
        field1380++;
        if (class189.field2274 < class86.field1188.length) {
            if (arg0 != 6) {
                method705(-24, (byte) -11);
            }
            class86.field1188[class189.field2274++] = this;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z[S[Ljava/lang/String;)V")
    public static final void method707(boolean arg0, short[] arg1, String[] arg2) {
        class681.method3866(47, arg1, arg2, arg2.length - 1, 0);
        if (!arg0) {
            method704((byte) 9);
        }
        field1383++;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BI)V")
    public static final void method708(byte arg0, int arg1) {
        field1385++;
        class585 var2 = (class585) class604.field8417.method2552((long) arg1, arg0 - 68);
        if (var2 != null) {
            var2.field8189.method3698(8);
            class757.method4213(-1, var2.field8186, var2.field8192);
            var2.method315(69);
        }
        if (arg0 != 67) {
            method707(true, null, null);
        }
    }
}
