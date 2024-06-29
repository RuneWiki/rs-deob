import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class273 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4306 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "[Lql;")
    public static class223[] field4304 = new class223[14];

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field4305 = 0;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4311 = "Loaded interfaces";

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4308 = 99;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "[[[I")
    public static int[][][] field4310;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static final void method1838(boolean arg0) {
        if (arg0) {
            return;
        }
        field4309++;
        class239.field3692.method1256(8);
        int var1 = class239.field3692.method1253((byte) -118, 8);
        if (class62.field1006 > var1) {
            for (int var2 = var1; var2 < class62.field1006; var2++) {
                class296.field4675[class214.field3305++] = class198.field3113[var2];
            }
        }
        if (class62.field1006 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class62.field1006 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class198.field3113[var3];
            class32 var5 = class72.field1144[var4];
            int var6 = class239.field3692.method1253((byte) -99, 1);
            if (var6 == 0) {
                class198.field3113[class62.field1006++] = var4;
                var5.field4161 = class267.field4256;
            } else {
                int var7 = class239.field3692.method1253((byte) -92, 2);
                if (var7 == 0) {
                    class198.field3113[class62.field1006++] = var4;
                    var5.field4161 = class267.field4256;
                    class36.field576[class17.field269++] = var4;
                } else if (var7 == 1) {
                    class198.field3113[class62.field1006++] = var4;
                    var5.field4161 = class267.field4256;
                    int var8 = class239.field3692.method1253((byte) -114, 3);
                    var5.method1796(var8, (byte) 108, 1);
                    int var9 = class239.field3692.method1253((byte) -100, 1);
                    if (var9 == 1) {
                        class36.field576[class17.field269++] = var4;
                    }
                } else if (var7 == 2) {
                    class198.field3113[class62.field1006++] = var4;
                    var5.field4161 = class267.field4256;
                    if (class239.field3692.method1253((byte) -90, 1) == 1) {
                        int var11 = class239.field3692.method1253((byte) -78, 3);
                        var5.method1796(var11, (byte) 102, 2);
                        int var12 = class239.field3692.method1253((byte) -98, 3);
                        var5.method1796(var12, (byte) 101, 2);
                    } else {
                        int var10 = class239.field3692.method1253((byte) -116, 3);
                        var5.method1796(var10, (byte) 111, 0);
                    }
                    int var13 = class239.field3692.method1253((byte) -106, 1);
                    if (var13 == 1) {
                        class36.field576[class17.field269++] = var4;
                    }
                } else if (var7 == 3) {
                    class296.field4675[class214.field3305++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method1839(int arg0) {
        if (arg0 != 32233) {
            method1842(80);
        }
        field4312++;
        class244.field3782.method1782(112);
        class130.field2018.method1782(125);
        class126.field1980.method1782(arg0 ^ 0xFFFF8226);
        class159.field2442.method1782(arg0 - 32280);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static final void method1840(byte arg0) {
        if (class140.field2155 < 0) {
            class197.field3094 = -1;
            class116.field1808 = -1;
            class140.field2155 = 0;
        }
        if (class188.field3010 < class140.field2155) {
            class140.field2155 = class188.field3010;
            class116.field1808 = -1;
            class197.field3094 = -1;
        }
        field4314++;
        int var1 = 127 / ((arg0 - 14) / 47);
        if (class250.field3848 < 0) {
            class116.field1808 = -1;
            class250.field3848 = 0;
            class197.field3094 = -1;
        }
        if (class250.field3848 > class221.field3453) {
            class250.field3848 = class221.field3453;
            class197.field3094 = -1;
            class116.field1808 = -1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V")
    public static final void method1841(boolean arg0) {
        field4307++;
        class33.field532.method1783(0);
        if (arg0) {
            method1842(93);
        }
        class80.field1338.method1783(0);
        class74.field1243.method1783(0);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method1842(int arg0) {
        field4311 = null;
        field4304 = null;
        field4310 = null;
        if (arg0 != 95) {
            field4313 = 60;
        }
    }
}
