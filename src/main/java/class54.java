import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 extends class51 {

    @OriginalMember(owner = "client!he", name = "jb", descriptor = "[Lk;")
    public class69[] field1342;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "Lic;")
    public static class59 field1326 = class59.method433(0, "null");

    @OriginalMember(owner = "client!he", name = "V", descriptor = "Lic;")
    private static class59 field1328 = class59.method433(0, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!he", name = "ib", descriptor = "Lic;")
    public static class59 field1341 = class59.method433(0, "leuchten1:");

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public static int field1334 = 0;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "[[I")
    public static int[][] field1327 = new int[104][104];

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "Lic;")
    public static class59 field1332 = field1328;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!he", name = "db", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!he", name = "hb", descriptor = "Lwf;")
    public static class159 field1340;

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "Lhf;")
    public static class55 field1337;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static void method399(int arg0) {
        field1340 = null;
        field1326 = null;
        field1341 = null;
        if (arg0 != 16) {
            method399(-106);
        }
        field1327 = null;
        field1328 = null;
        field1337 = null;
        field1332 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ldd;Z)V")
    public static final void method400(class26 arg0, boolean arg1) {
        class125.field2847 = arg0;
        if (!arg1) {
            field1341 = null;
        }
        class33.field897 = class125.field2847.method181(0, 16);
        field1331++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public static final void method401(boolean arg0) {
        if (arg0) {
            method400(null, true);
        }
        field1336++;
        class114.field2695.method676((byte) -123);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lje;Ljava/lang/Object;B)V")
    public static final void method402(class67 arg0, Object arg1, byte arg2) {
        field1330++;
        if (arg0.field1675 == null) {
            return;
        }
        int var3 = 0;
        if (arg2 >= -114) {
            return;
        }
        while (var3 < 50 && arg0.field1675.peekEvent() != null) {
            class126.method962(false, 1L);
            var3++;
        }
        if (arg1 != null) {
            arg0.field1675.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
    public static final int method403(int arg0) {
        if (arg0 != 0) {
            field1327 = null;
        }
        field1339++;
        return class41.field1056++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)Z")
    public final boolean method404(byte arg0, int arg1) {
        field1335++;
        int var3 = -89 / ((arg0 + 24) / 45);
        return this.field1342[arg1].field1764;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBI)I")
    public static final int method405(int arg0, int arg1, byte arg2, int arg3) {
        field1329++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (arg2 != 58) {
            return -117;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1333++;
        class118 var10 = null;
        if (arg9 >= -13) {
            field1340 = null;
        }
        for (class118 var11 = (class118) class22.field525.method682(0); var11 != null; var11 = (class118) class22.field525.method684((byte) -65)) {
            if (var11.field2747 == arg0 && var11.field2739 == arg1 && var11.field2751 == arg2 && var11.field2752 == arg8) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class118();
            var10.field2739 = arg1;
            var10.field2751 = arg2;
            var10.field2752 = arg8;
            var10.field2747 = arg0;
            class21.method115(false, var10);
            class22.field525.method689(var10, (byte) 104);
        }
        var10.field2738 = arg4;
        var10.field2740 = arg5;
        var10.field2753 = arg7;
        var10.field2746 = arg3;
        var10.field2741 = arg6;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ldd;Ldd;IZ)V")
    public class54(class26 arg0, class26 arg1, int arg2, boolean arg3) {
        class83 var5 = new class83();
        int var6 = arg0.method181(0, arg2);
        this.field1342 = new class69[var6];
        int[] var7 = arg0.method190(arg2, false);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method193(false, var7[var8], arg2);
            class22 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class22 var12 = (class22) var5.method682(0); var12 != null; var12 = (class22) var5.method684((byte) -65)) {
                if (var12.field511 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method199(0, var11, (byte) -89);
                } else {
                    var13 = arg1.method199(var11, 0, (byte) -53);
                }
                var10 = new class22(var11, var13);
                var5.method689(var10, (byte) -128);
            }
            this.field1342[var7[var8]] = new class69(var9, var10);
        }
    }
}
