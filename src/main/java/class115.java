import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class115 {

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field2196 = 3353893;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field2194 = 0;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Lbj;")
    public static class151 field2195;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Lwb;")
    public static class26 field2199;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public abstract void method18(int arg0);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BJ)V")
    public static final void method812(byte arg0, long arg1) {
        field2193++;
        if (arg1 == 0L || arg0 >= -116) {
            return;
        }
        for (int var3 = 0; var3 < class97.field1928; var3++) {
            if (class209.field3780[var3] == arg1) {
                class97.field1928--;
                class173.field3173++;
                for (int var4 = var3; var4 < class97.field1928; var4++) {
                    class100.field1957[var4] = class100.field1957[var4 + 1];
                    class98.field1944[var4] = class98.field1944[var4 + 1];
                    class207.field3755[var4] = class207.field3755[var4 + 1];
                    class209.field3780[var4] = class209.field3780[var4 + 1];
                    class140.field2664[var4] = class140.field2664[var4 + 1];
                    class137.field2610[var4] = class137.field2610[var4 + 1];
                }
                class177.field3207 = class27.field621;
                class36.field809.method1356(0, true);
                class36.field809.method1399((byte) -54, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static final void method813(int arg0) {
        field2192++;
        class36.field809.method1356(229, true);
        class252.field4480++;
        if (arg0 < -5) {
            class36.field809.method1388(-38, class173.method1236(-89));
            class36.field809.method1428((byte) -19, class4.field53);
            class36.field809.method1428((byte) -121, class248.field4414);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public static void method814(int arg0) {
        if (arg0 != 3353893) {
            field2194 = -99;
        }
        field2195 = null;
        field2199 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BII)I")
    public abstract int method23(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)I")
    public static final int method815(int arg0, boolean arg1) {
        field2197++;
        if (arg0 > -94) {
            return 65;
        }
        long var2 = class253.method1711((byte) -75);
        for (class92 var4 = arg1 ? (class92) class136.field2600.method1709(-82) : (class92) class136.field2600.method1704(-89); var4 != null; var4 = (class92) class136.field2600.method1704(-90)) {
            if (var2 > (var4.field1868 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field1868 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field3759;
                    class273.field4805[var5] = class72.field1460[var5];
                    var4.method1477(1);
                    return var5;
                }
                var4.method1477(1);
            }
        }
        return -1;
    }
}
