import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class224 implements class121 {

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "Lpe;")
    private class615 field2925;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "Ljava/lang/String;")
    private String field2921;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field2918 = 0;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Ljd;")
    public static class559 field2920;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)I", line = 4)
    public final int method901(boolean arg0) {
        field2924++;
        if (this.field2925.method3352(this.field2921, -1)) {
            return 100;
        } else {
            if (arg0) {
                method1414(true);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V", line = 19)
    public static void method1413(int arg0) {
        if (arg0 != 0) {
            field2920 = null;
        }
        field2920 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)Lev;", line = 29)
    public final class144 method900(int arg0) {
        if (arg0 < 1) {
            this.field2925 = null;
        }
        field2919++;
        return class144.field1885;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)V", line = 40)
    public static final void method1414(boolean arg0) {
        class114.method864(0);
        field2923++;
        class703.field9808 = null;
        class230.field3069.field5367 = 0;
        class159.field1991 = null;
        class112.field1466 = 0;
        class187.field2386 = 0;
        class88.field1169 = 0;
        class378.field4845 = null;
        class455.field5941 = null;
        class40.method315(-107);
        class572.method3054((byte) -112);
        for (int var1 = 0; var1 < 2048; var1++) {
            class592.field8019[var1] = null;
        }
        class233.field3130 = null;
        for (int var2 = 0; var2 < class480.field6406; var2++) {
            class532 var4 = class93.field1230[var2].field3131;
            if (var4 != null) {
                var4.field3001 = -1;
            }
        }
        class77.method620(55);
        class704.field9810 = 1;
        class442.method2508(10, 1);
        for (int var3 = 0; var3 < 100; var3++) {
            class53.field719[var3] = true;
        }
        if (!arg0) {
            field2918 = 33;
        }
        class154.method1112((byte) -116);
        class363.field4686 = 0L;
        class268.field3583 = null;
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)Z", line = 102)
    public static final boolean method1415(int arg0) {
        field2922++;
        if (class566.field7391 < 1) {
            return false;
        } else {
            if (arg0 != -3) {
                field2918 = -63;
            }
            return class555.field7261 != class119.field1536 || class54.field741 >= 2;
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lpe;Ljava/lang/String;)V", line = 122)
    public class224(class615 arg0, String arg1) {
        this.field2925 = arg0;
        this.field2921 = arg1;
    }
}
