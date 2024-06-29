import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class422 {

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public static int field6221 = -1;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "B")
    public byte field6228;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public int field6224;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "Lwl;")
    public static class273 field6227;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "Lcq;")
    public static class67 field6218;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Ljava/lang/String;")
    public String field6219;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "Ljava/lang/String;")
    public String field6222;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "Ljava/lang/String;")
    public String field6229;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZB)V", line = 7)
    public static final void method2693(boolean arg0, byte arg1) {
        if (arg1 != -104) {
            method2694((byte) 53);
        }
        field6226++;
        if (class211.field2800 != arg0) {
            class211.field2800 = arg0;
            class167.method1030(4096);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V", line = 25)
    public static void method2694(byte arg0) {
        if (arg0 == 6) {
            field6218 = null;
            field6227 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BJ)V", line = 43)
    public static final void method2695(byte arg0, long arg1) {
        class185.field2507.field3029 = 0;
        field6231++;
        class185.field2507.method1346(21, 32767);
        class185.field2507.method1372(arg1, 1883835216);
        class47.field661 = 0;
        class275.field3989 = 0;
        class163.field2190 = 1;
        class214.field2856 = -3;
        int var3 = 27 % ((-arg0 - 58) / 41);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Z", line = 60)
    public static final boolean method2696(int arg0, int arg1) {
        field6225++;
        if (arg1 == 15 || arg1 == 30 || arg1 == 19 || arg1 == 47 || arg1 == 2 || arg1 == 34 || arg1 == 22 || arg1 == 5) {
            return true;
        } else if (arg1 == 36 || arg1 == 32 || arg1 == 1004 || arg1 == 1003) {
            return true;
        } else if (~arg1 == arg0 || arg1 == 1 || arg1 == 23 || arg1 == 10 || arg1 == 25) {
            return true;
        } else {
            return arg1 == 18 || arg1 == 39 || arg1 == 16 || arg1 == 58 || arg1 == 46 || arg1 == 6;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V", line = 88)
    public static final void method2697(boolean arg0) {
        class189 var1 = class182.field2476;
        synchronized (class182.field2476) {
            class182.field2476.method1136((byte) -84);
        }
        field6232++;
        class189 var2 = class27.field388;
        synchronized (class27.field388) {
            if (!arg0) {
                method2697(true);
            }
            class27.field388.method1136((byte) -85);
        }
        class189 var3 = class93.field1340;
        synchronized (class93.field1340) {
            class93.field1340.method1136((byte) -98);
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(II)V", line = 111)
    public static final void method2698(int arg0, int arg1) {
        field6220++;
        class263 var2 = class47.method337(9, 0, arg0);
        if (arg1 != -28239) {
            field6230 = 27;
        }
        var2.method1806(false);
    }
}
