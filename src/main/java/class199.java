import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class199 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[S")
    public static short[] field3149;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "[[B")
    public static byte[][] field3148;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLim;)Lnb;")
    public static final class300 method1384(byte arg0, class170 arg1) {
        arg1.method1218(-35);
        int var2 = 43 / ((arg0 + 12) / 52);
        field3144++;
        int var3 = arg1.method1218(-35);
        class300 var4 = class235.method1653((byte) 45, var3);
        var4.field4785 = arg1.method1218(-23);
        int var5 = arg1.method1218(-80);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.method1218(90);
            var4.method35(arg1, (byte) -61, var7);
        }
        var4.method144(127);
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method1385(int arg0) {
        field3149 = null;
        if (arg0 == -1) {
            field3148 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static final void method1386(byte arg0) {
        field3145++;
        if (arg0 != 120) {
            return;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class173.field2721 - 1); var2++) {
                if (class192.field3056[var2] < 1000 && class192.field3056[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class43.field521[var2];
                    class43.field521[var2] = class43.field521[var2 + 1];
                    class43.field521[var2 + 1] = var3;
                    String var4 = class186.field2925[var2];
                    class186.field2925[var2] = class186.field2925[var2 + 1];
                    class186.field2925[var2 + 1] = var4;
                    int var5 = class92.field1378[var2];
                    class92.field1378[var2] = class92.field1378[var2 + 1];
                    class92.field1378[var2 + 1] = var5;
                    int var6 = class180.field2830[var2];
                    class180.field2830[var2] = class180.field2830[var2 + 1];
                    class180.field2830[var2 + 1] = var6;
                    int var7 = class163.field2495[var2];
                    class163.field2495[var2] = class163.field2495[var2 + 1];
                    class163.field2495[var2 + 1] = var7;
                    short var8 = class192.field3056[var2];
                    class192.field3056[var2] = class192.field3056[var2 + 1];
                    class192.field3056[var2 + 1] = var8;
                    long var9 = class150.field2205[var2];
                    class150.field2205[var2] = class150.field2205[var2 + 1];
                    class150.field2205[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILim;)V")
    public static final void method1387(int arg0, class170 arg1) {
        field3147++;
        for (int var2 = 0; var2 < class296.field4734; var2++) {
            int var3 = arg1.method1162(-129);
            int var4 = arg1.method1186((byte) -78);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class61.field888[var3] != null) {
                class61.field888[var3].field3819 = var4;
            }
        }
        if (arg0 != 255) {
            field3149 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)[Lnj;")
    public static final class215[] method1388(boolean arg0) {
        class215[] var1 = new class215[class139.field2000];
        field3146++;
        for (int var2 = 0; var2 < class139.field2000; var2++) {
            int var3 = class64.field924[var2] * class284.field4603[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class190.field2959[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class229.field3539[class205.method1411(255, var5[var6])];
            }
            var1[var2] = new class48(class15.field215, class86.field1308, class166.field2569[var2], class277.field4480[var2], class64.field924[var2], class284.field4603[var2], var4);
        }
        if (!arg0) {
            method1385(83);
        }
        class115.method762((byte) -111);
        return var1;
    }
}
