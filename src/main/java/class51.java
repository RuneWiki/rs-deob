import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class51 extends class27 {

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Ljava/lang/String;")
    public static String field768 = "shake:";

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "Lqf;")
    public static class359 field764 = null;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "Ljava/lang/String;")
    public static String field771 = "glow3:";

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field774 = 0;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(B)V", line = 6)
    public static void method423(byte arg0) {
        field768 = null;
        field764 = null;
        field771 = null;
        if (arg0 != 113) {
            method423((byte) -117);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I", line = 23)
    public final int[] method18(int arg0, byte arg1) {
        field770++;
        int[] var3 = this.field375.method2087(-50, arg0);
        if (arg1 != -62) {
            method431((String) null, 121, true);
        }
        if (this.field375.field4382) {
            int[][] var4 = this.method168(0, -21, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class209.field3053; var8++) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V", line = 60)
    public static final void method424(int arg0, int arg1) {
        field775++;
        if (!class256.method1887(arg1, -1)) {
            return;
        }
        class359[] var2 = class119.field1677[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class359 var4 = var2[var3];
            if (var4 != null) {
                var4.field5593 = 0;
                var4.field5519 = 0;
                var4.field5621 = 1;
            }
        }
        if (arg0 != 1) {
            method423((byte) 122);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IC)Z", line = 96)
    public static final boolean method425(int arg0, char arg1) {
        field773++;
        if (arg0 != 57) {
            method426((byte) -22, (class190) null);
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLsb;)V", line = 116)
    public static final void method426(byte arg0, class190 arg1) {
        int var2 = arg1.method1372(-127);
        field765++;
        if (arg0 >= -100) {
            field768 = (String) null;
        }
        class354.field5437 = new class324[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class354.field5437[var3] = new class324();
            class354.field5437[var3].field4881 = arg1.method1372(-64);
            class354.field5437[var3].field4882 = arg1.method1358(-22675);
        }
        class22.field338 = arg1.method1372(-74);
        class232.field3504 = arg1.method1372(-104);
        class294.field4431 = arg1.method1372(-124);
        class338.field5248 = new class316[class232.field3504 + 1 - class22.field338];
        for (int var4 = 0; var4 < class294.field4431; var4++) {
            int var5 = arg1.method1372(-78);
            class316 var6 = class338.field5248[var5] = new class316();
            var6.field4064 = arg1.method1319(255);
            var6.field4061 = arg1.method1371(-4);
            var6.field4686 = class22.field338 + var5;
            var6.field4696 = arg1.method1358(-22675);
            var6.field4690 = arg1.method1358(-22675);
        }
        class4.field112 = arg1.method1371(-4);
        class178.field2556 = true;
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)Lgi;", line = 162)
    public static final class287 method427(int arg0) {
        field766++;
        if (class105.field1505 == null) {
            return null;
        }
        int var1 = -17 / ((-arg0 - 5) / 36);
        class40.field578.method2080(class105.field1505, (byte) 115);
        class287 var2 = (class287) class40.field578.method2082(64);
        class200 var3 = class349.method2447(var2.field4350, (byte) -9);
        return var3 != null && var3.field2935 && var3.method1455(127) ? var2 : class236.method1762(-10201);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILsb;)Lvo;", line = 186)
    public static final class179 method428(int arg0, class190 arg1) {
        int var2 = 46 / ((-arg0 - 43) / 50);
        field769++;
        return new class179(arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1347((byte) 61), arg1.method1312(103), arg1.method1319(255));
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(B)V", line = 198)
    public static final void method429(byte arg0) {
        field772++;
        if (!class273.field4150) {
            return;
        }
        if (arg0 > -41) {
            field764 = (class359) null;
        }
        class359 var1 = class165.method1172(class67.field976, -1, class88.field1234);
        if (var1 != null && var1.field5671 != null) {
            class300 var2 = new class300();
            var2.field4494 = var1.field5671;
            var2.field4491 = var1;
            class48.method412(var2, 200000);
        }
        class133.field1949 = -1;
        class273.field4150 = false;
        class83.method676(var1, (byte) 113);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;Z)J", line = 232)
    public static final long method430(String arg0, boolean arg1) {
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1) {
            field771 = (String) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 = (var2 << 5) + (long) arg0.charAt(var5) - var2;
        }
        field763++;
        return var2;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;IZ)V", line = 252)
    public static final void method431(String arg0, int arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        int var4 = 0;
        field767++;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class240.field3578; var6++) {
            class122 var7 = class175.method1228((byte) 54, var6);
            if ((!arg2 || var7.field1751) && var7.field1758 == -1 && var7.field1763 == -1 && var7.field1764 == 0 && var7.field1742.toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 250) {
                    class262.field3981 = null;
                    class334.field5205 = -1;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        class334.field5205 = var4;
        class262.field3981 = var5;
        class130.field1882 = 0;
        if (arg1 != 122) {
            return;
        }
        String[] var10 = new String[class334.field5205];
        for (int var11 = 0; var11 < class334.field5205; var11++) {
            var10[var11] = class175.method1228((byte) 54, var5[var11]).field1742;
        }
        class37.method274((byte) 88, class262.field3981, var10);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 323)
    public class51() {
        super(1, true);
    }
}
