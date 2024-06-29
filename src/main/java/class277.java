import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class277 {

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lhn;")
    private class509 field3680 = new class509(64);

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lfo;")
    private class361 field3682;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lfo;")
    private class361 field3681;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3678 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[J")
    public static long[] field3677 = new long[100];

    @OriginalMember(owner = "client!je", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3687 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B[B)Lnc;")
    public static final class21 method1681(byte arg0, byte[] arg1) {
        field3684++;
        if (arg0 < 7) {
            method1686(-89, null);
        }
        class21 var2 = new class21();
        class396 var3 = new class396(arg1);
        var3.field5729 = var3.field5761.length - 2;
        int var4 = var3.method2386(-23648);
        int var5 = var3.field5761.length - var4 - 12 - 2;
        var3.field5729 = var5;
        int var6 = var3.method2406((byte) -99);
        var2.field195 = var3.method2386(-23648);
        var2.field192 = var3.method2386(-23648);
        var2.field200 = var3.method2386(-23648);
        var2.field191 = var3.method2386(-23648);
        int var7 = var3.method2388((byte) -117);
        if (var7 > 0) {
            var2.field199 = new class50[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2386(-23648);
                class50 var10 = new class50(class111.method682(-124, var9));
                var2.field199[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2406((byte) -83);
                    int var12 = var3.method2406((byte) -123);
                    var10.method291((long) var11, new class488(var12), -105);
                }
            }
        }
        var3.field5729 = 0;
        var2.field186 = var3.method2385(-64);
        var2.field193 = new String[var6];
        var2.field190 = new int[var6];
        var2.field203 = new int[var6];
        int var13 = 0;
        while (var3.field5729 < var5) {
            int var14 = var3.method2386(-23648);
            if (var14 == 3) {
                var2.field193[var13] = var3.method2432((byte) 125).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field203[var13] = var3.method2388((byte) -126);
            } else {
                var2.field203[var13] = var3.method2406((byte) -96);
            }
            var2.field190[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)Lja;")
    public static final class184 method1682(int arg0, int arg1, int arg2) {
        field3683++;
        class184 var3 = (class184) class9.field109.method295((long) arg1 << 32 | (long) arg0, -125);
        if (var3 == null) {
            var3 = new class184(arg1, arg0);
            class9.field109.method291(var3.field6348, var3, -43);
        }
        if (arg2 >= -52) {
            field3678 = -86;
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public static void method1683(boolean arg0) {
        field3687 = null;
        if (!arg0) {
            method1683(true);
        }
        field3677 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V")
    public static final void method1684(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            field3678 = -31;
        }
        if (arg1 > arg0) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                class5.field54[var5][arg3] = arg4;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; var6++) {
                class5.field54[var6][arg3] = arg4;
            }
        }
        field3686++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lep;")
    public final class291 method1685(int arg0, int arg1) {
        field3679++;
        class291 var3 = (class291) this.field3680.method3032(3589, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field3681.method2130(0, arg1, arg0 ^ 0xFFFFFFB5);
        } else {
            var4 = this.field3682.method2130(0, arg1 & 0x7FFF, arg0 ^ 0xFFFFFF86);
        }
        class291 var5 = new class291();
        if (arg0 != 0) {
            this.field3682 = null;
        }
        if (var4 != null) {
            var5.method1753(new class396(var4), true);
        }
        if (arg1 >= 32768) {
            var5.method1750(arg0 ^ 0x7A);
        }
        this.field3680.method3046((long) arg1, var5, arg0 ^ 0x1);
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(ILfo;Lfo;)V")
    public class277(int arg0, class361 arg1, class361 arg2) {
        this.field3682 = arg2;
        this.field3681 = arg1;
        if (this.field3681 != null) {
            this.field3681.method2136(-66, 0);
        }
        if (this.field3682 != null) {
            this.field3682.method2136(-82, 0);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1686(int arg0, String arg1) {
        field3685++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class437.method2684(-110, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class327.field4351; var3++) {
            String var4 = class384.field5591[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class437.method2684(-102, var4);
            if (var5 != null && var5.equals(var2)) {
                class327.field4351--;
                for (int var6 = var3; var6 < class327.field4351; var6++) {
                    class384.field5591[var6] = class384.field5591[var6 + 1];
                    class428.field6226[var6] = class428.field6226[var6 + 1];
                    class161.field2091[var6] = class161.field2091[var6 + 1];
                    class130.field1677[var6] = class130.field1677[var6 + 1];
                    class127.field1646[var6] = class127.field1646[var6 + 1];
                }
                class381.field5519 = class106.field1448;
                class209.field2792++;
                class492.method2979(class17.field163, 48);
                class106.field1443.method2449((byte) 116, class424.method2613(arg0 ^ 0xFFFFA7B1, arg1));
                class106.field1443.method2415(arg1, 21742);
                break;
            }
        }
        if (arg0 != -22608) {
            method1686(-16, null);
        }
    }
}
