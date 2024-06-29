import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class96 {

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1270 = null;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lclient;")
    public static client field1266;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 8)
    public static void method680(byte arg0) {
        if (arg0 < 85) {
            field1270 = (String) null;
        }
        field1266 = null;
        field1270 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILug;Lug;)I", line = 30)
    public static final int method681(int arg0, class253 arg1, class253 arg2) {
        field1272++;
        int var3 = 0;
        if (arg1.method1837(126, class34.field506)) {
            var3++;
        }
        if (arg0 <= 62) {
            return 75;
        }
        if (arg1.method1837(111, class172.field2838)) {
            var3++;
        }
        if (arg1.method1837(100, class249.field3914)) {
            var3++;
        }
        if (arg2.method1837(89, class34.field506)) {
            var3++;
        }
        if (arg2.method1837(99, class172.field2838)) {
            var3++;
        }
        if (arg2.method1837(83, class249.field3914)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V", line = 74)
    public static final void method682(byte arg0, int arg1) {
        field1271++;
        class111 var2 = (class111) class267.field4161.method2168((long) arg1, (byte) -95);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field1547.length; var3++) {
            var2.field1547[var3] = -1;
            var2.field1552[var3] = 0;
        }
        if (arg0 != -25) {
            field1267 = 42;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V", line = 101)
    public static final void method683(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -22156) {
            return;
        }
        for (int var5 = 0; var5 < class310.field4829; var5++) {
            if (arg3 < (class170.field2798[var5] + class170.field2794[var5]) && class170.field2798[var5] < (arg1 + arg3) && (class322.field5083[var5] + class164.field2660[var5]) > arg0 && class322.field5083[var5] < arg0 + arg2) {
                class97.field1277[var5] = true;
            }
        }
        field1269++;
    }
}
