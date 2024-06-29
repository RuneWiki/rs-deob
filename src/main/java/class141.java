import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class141 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field2241 = 0;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2244 = "Loading interfaces - ";

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field2245 = 5063219;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[I")
    public static int[] field2247 = new int[128];

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Ltd;")
    public static class241 field2239;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lja;")
    public static class64 field2242;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Z")
    public static boolean field2238;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V", line = 9)
    public static final void method1076(int arg0, int arg1) {
        class36.method298(arg1 ^ 0x95);
        field2248++;
        class157.method1182(-9764);
        int var2 = class324.method2214(arg1 ^ 0xFFFFFFB4, arg0).field556;
        if (var2 == 0) {
            return;
        }
        int var3 = class278.field4304[arg0];
        if (var2 == 6) {
            class162.field2542 = var3;
        }
        if (arg1 == var2) {
            class76.field1170 = var3;
        }
        if (var2 == 9) {
            class243.field3764 = var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)I", line = 38)
    public static final int method1077(int arg0, int arg1) {
        field2243++;
        if (arg1 != 128) {
            field2245 = 34;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 59)
    public static void method1079(int arg0) {
        field2244 = null;
        field2239 = null;
        field2247 = null;
        field2242 = null;
        if (arg0 != 128) {
            method1079(108);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILpe;)V", line = 78)
    public static final void method1081(int arg0, class101 arg1) {
        field2246++;
        int var2 = arg1.method738(-957401312);
        class162.field2548 = new class125[var2];
        int var3 = 0;
        if (arg0 > -2) {
            method1077(33, -30);
        }
        while (var3 < var2) {
            class162.field2548[var3] = new class125();
            class162.field2548[var3].field1989 = arg1.method738(-957401312);
            class162.field2548[var3].field1991 = arg1.method771(128);
            var3++;
        }
        class298.field4709 = arg1.method738(-957401312);
        class34.field564 = arg1.method738(-957401312);
        class239.field3724 = arg1.method738(-957401312);
        class147.field2367 = new class120[class34.field564 + 1 - class298.field4709];
        for (int var4 = 0; var4 < class239.field3724; var4++) {
            int var5 = arg1.method738(-957401312);
            class120 var6 = class147.field2367[var5] = new class120();
            var6.field4913 = arg1.method741(116);
            var6.field4919 = arg1.method775(-89);
            var6.field1932 = class298.field4709 + var5;
            var6.field1927 = arg1.method771(128);
            var6.field1931 = arg1.method771(128);
        }
        class128.field2044 = arg1.method775(123);
        class196.field3123 = true;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
    public abstract int method1075(int arg0, int arg1);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Lhm;")
    public abstract class20 method1078(byte arg0);

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)[B")
    public abstract byte[] method1080(int arg0, int arg1);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
    public abstract void method1082(int arg0, byte arg1);
}
