import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class220 extends class5 {

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3361 = "K";

    @OriginalMember(owner = "client!va", name = "D", descriptor = "B")
    public byte field3367;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "Ljd;")
    public static class95 field3358;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Ljava/lang/String;")
    public String field3360;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "Ljava/lang/String;")
    public String field3365;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "[[B")
    public static byte[][] field3362;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 5)
    public static final void method1565(int arg0) {
        class178.field2831 = null;
        if (arg0 <= 90) {
            field3362 = (byte[][]) ((byte[][]) null);
        }
        class117.method896();
        field3359++;
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V", line = 18)
    public static void method1566(int arg0) {
        field3358 = null;
        field3362 = (byte[][]) null;
        field3361 = null;
        if (arg0 < 125) {
            field3361 = (String) null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I", line = 30)
    public static final int method1567(int arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        if (arg0 != -1260216222) {
            return -111;
        }
        field3363++;
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0xB3333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)I", line = 54)
    public static final int method1568(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Lwm;", line = 83)
    public static final class254 method1569(byte arg0) {
        class254 var1 = new class254(34);
        field3357++;
        var1.method1752(11, -122);
        var1.method1752(class102.field1482, -119);
        var1.method1752(class314.field4871 ? 1 : 0, -109);
        var1.method1752(class322.field4976 ? 1 : 0, -96);
        var1.method1752(class320.field4958 ? 1 : 0, -90);
        var1.method1752(class255.field3884 ? 1 : 0, -98);
        var1.method1752(class267.field4149 ? 1 : 0, -103);
        var1.method1752(class284.field4430 ? 1 : 0, -100);
        var1.method1752(class258.field3983 ? 1 : 0, -95);
        var1.method1752(class134.field2036 ? 1 : 0, -87);
        var1.method1752(class165.field2674, -78);
        var1.method1752(class309.field4812 ? 1 : 0, -110);
        var1.method1752(class122.field1874 ? 1 : 0, -104);
        var1.method1752(class67.field972 ? 1 : 0, -98);
        var1.method1752(class248.field3745, -85);
        var1.method1752(class318.field4915 ? 1 : 0, -126);
        var1.method1752(class311.field4833, -95);
        var1.method1752(class59.field783, -112);
        var1.method1752(class71.field1022, -80);
        var1.method1744(true, class25.field272);
        var1.method1744(true, class169.field2735);
        var1.method1752(class249.method1704(), -93);
        var1.method1773(class146.field2232, false);
        var1.method1752(class216.field3321, -106);
        var1.method1752(class7.field112 ? 1 : 0, -82);
        var1.method1752(class152.field2305 ? 1 : 0, -115);
        var1.method1752(class245.field3705, -108);
        var1.method1752(class235.field3578 ? 1 : 0, -88);
        var1.method1752(class305.field4698 ? 1 : 0, -116);
        if (arg0 >= -73) {
            field3362 = (byte[][]) ((byte[][]) null);
        }
        return var1;
    }
}
