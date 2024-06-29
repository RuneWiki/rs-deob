import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class137 extends class34 {

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field2390 = 0;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "Lke;")
    public static class256 field2384 = class316.method2202("(U (X", 27626);

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "Z")
    public static boolean field2392 = false;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public int field2378;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public int field2379;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "Lng;")
    public static class138 field2391;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "Lke;")
    public class256 field2382;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "[I")
    public int[] field2380;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "[I")
    public int[] field2386;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "[Lrj;")
    public class254[] field2388;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "[Lke;")
    public class256[] field2393;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V", line = 11)
    public static void method988(int arg0) {
        int var1 = 119 % ((-arg0) / 47);
        field2384 = null;
        field2391 = null;
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V", line = 30)
    public static final void method989(int arg0) {
        if (arg0 != -47) {
            field2384 = (class256) null;
        }
        field2394++;
        int var1 = client.field2149 + class121.field2124.field1192;
        int var2 = class86.field1558 + class121.field2124.field1197;
        if (class75.field1435 - var1 < -500 || (class75.field1435 - var1) > 500 || class40.field734 - var2 < -500 || (class40.field734 - var2) > 500) {
            class75.field1435 = var1;
            class40.field734 = var2;
        }
        if (class40.field734 != var2) {
            class40.field734 += (var2 - class40.field734) / 16;
        }
        if (class75.field1435 != var1) {
            class75.field1435 += (var1 - class75.field1435) / 16;
        }
        if (class154.field2746) {
            for (int var3 = 0; var3 < class208.field3767; var3++) {
                int var4 = class50.field925[var3];
                if (var4 == 98) {
                    class114.field2014 = class114.field2014 + 47 & 0xFFFFFFF0;
                } else if (var4 == 99) {
                    class114.field2014 = class114.field2014 - 17 & 0xFFFFFFF0;
                } else if (var4 == 96) {
                    class289.field5001 = class289.field5001 - 65 & 0xFFFFFF80;
                } else if (var4 == 97) {
                    class289.field5001 = class289.field5001 + 191 & 0xFFFFFF80;
                }
            }
        } else {
            if (class140.field2468[96]) {
                class135.field2357 += (-class135.field2357 - 24) / 2;
            } else if (class140.field2468[97]) {
                class135.field2357 += (24 - class135.field2357) / 2;
            } else {
                class135.field2357 /= 2;
            }
            if (class140.field2468[98]) {
                class279.field4861 += (12 - class279.field4861) / 2;
            } else if (class140.field2468[99]) {
                class279.field4861 += (-class279.field4861 - 12) / 2;
            } else {
                class279.field4861 /= 2;
            }
            class114.field2014 += class279.field4861 / 2;
            class289.field5001 += class135.field2357 / 2;
        }
        class37.method276(-1);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lfb;", line = 148)
    public static final class292 method990(int arg0, int arg1) {
        field2395++;
        if (arg0 != 10474) {
            return (class292) null;
        }
        class292 var2 = (class292) class186.field3266.method1260(arg0 - 10567, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class148.field2603.method1016(class203.method1444(arg0 ^ 0xFFFFD77E, arg1), 100, class63.method491(arg1, (byte) 86));
        class292 var4 = new class292();
        if (var3 != null) {
            var4.method2027(true, new class41(var3));
        }
        class186.field3266.method1259(var4, (long) arg1, 0);
        return var4;
    }
}
