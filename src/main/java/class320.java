import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class320 {

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5014 = "Loading world list data";

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Z")
    public static boolean field5011 = false;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5012 = "Starting 3d Library";

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5016 = "Loaded sprites";

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lpe;")
    public static class109 field5013;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Lpk;")
    public static class120 field5017;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)I", line = 9)
    public static final int method2256(byte arg0) {
        field5019++;
        if (arg0 != 39) {
            field5013 = (class109) null;
        }
        return 15;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lbk;I)V", line = 22)
    public static final void method2257(class69 arg0, int arg1) {
        class343.field5310 = 3;
        field5015++;
        class154.method1148(true, -75);
        int var2 = -33 % ((-arg1 - 53) / 48);
        class146.field2393 = 0;
        class80.field1253 = 255;
        class154.field2511 = true;
        class124.field2007 = 0;
        class55.field846 = true;
        class73.field1105 = 0;
        class1.field70 = true;
        class257.field3810 = true;
        class151.field2474 = 2;
        class229.field3531 = true;
        class315.field4973 = 0;
        class140.field2267 = true;
        class60.field881 = true;
        class56.field853 = true;
        class73.field1106 = 127;
        class90.field1436 = true;
        class22.field398 = 127;
        class265 var3 = null;
        class149.field2435 = true;
        class109.field1777 = true;
        if (class178.field2841 >= 96) {
            class236.method1688(2);
        } else {
            class236.method1688(0);
        }
        class126.field2018 = false;
        class144.field2326 = 0;
        class137.field2240 = 0;
        class306.field4859 = false;
        class52.field772 = true;
        class151.field2467 = false;
        class101.field1636 = 0;
        try {
            class23 var4 = arg0.method542("runescape", 3);
            while (var4.field405 == 0) {
                class245.method1729(123, 1L);
            }
            if (var4.field405 == 1) {
                var3 = (class265) var4.field409;
                byte[] var5 = new byte[(int) var3.method1828(-1)];
                int var7;
                for (int var6 = 0; var6 < var5.length; var6 += var7) {
                    var7 = var3.method1833(var5.length - var6, var5, var6, false);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class202.method1451(30, new class1(var5));
            }
        } catch (Exception var11) {
        }
        try {
            if (var3 != null) {
                var3.method1829(-126);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 113)
    public static void method2258(int arg0) {
        if (arg0 != 0) {
            method2256((byte) 34);
        }
        field5017 = null;
        field5013 = null;
        field5014 = null;
        field5012 = null;
        field5016 = null;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V", line = 140)
    public static final void method2259(byte arg0) {
        class315.field4969 = null;
        field5020++;
        class115.field1871 = null;
        int var1 = -63 / ((arg0 + 58) / 36);
        class57.field859 = null;
    }
}
