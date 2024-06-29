import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class36 extends class134 {

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Llga;")
    public static class710 field383;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Llga;")
    public static class710 field387 = field383 = new class710(false);

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "J")
    public static long field394;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "[I")
    public int[] field388;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "[I")
    public int[] field389;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "[I")
    public int[] field390;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[Lsb;")
    public class290[] field384;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "[Lsb;")
    public class290[] field395;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "[[[B")
    public byte[][][] field391;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static void method164(int arg0) {
        field387 = null;
        field383 = null;
        if (arg0 != 7979) {
            method166(true, 14, (byte) -59, null);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static final long method165(String arg0, boolean arg1) {
        field392++;
        int var2 = arg0.length();
        long var3 = 0L;
        int var5 = 0;
        if (arg1) {
            return 20L;
        }
        while (var2 > var5) {
            var3 = (var3 << 5) - (var3 - (long) arg0.charAt(var5));
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZIBLjava/lang/String;)V")
    public static final void method166(boolean arg0, int arg1, byte arg2, String arg3) {
        field393++;
        class445.method2760(-123);
        if (arg1 == 0) {
            class275.field3370 = class93.method632(class100.field1044, class654.field9334.field9852.method3133(112) * 2, class179.field2100, 0, 0, class618.field8849);
            if (arg3 != null) {
                class275.field3370.method378(0);
                class535 var12 = class353.method2088(class330.field4275, class630.field9062, 0, -94);
                class59 var13 = class275.field3370.method373(var12, class155.method958(class394.field5410, class630.field9062, 0), true);
                class161.method997(arg2 + 106);
                class192.method1170(var13, true, -8069, class275.field3370, arg3, var12);
            }
        } else {
            class58 var4 = null;
            if (arg3 != null) {
                var4 = class93.method632(class100.field1044, 0, class179.field2100, 0, 0, class618.field8849);
                var4.method378(0);
                class535 var5 = class353.method2088(class330.field4275, class630.field9062, 0, -122);
                class59 var6 = var4.method373(var5, class155.method958(class394.field5410, class630.field9062, 0), true);
                class161.method997(0);
                class192.method1170(var6, true, -8069, var4, arg3, var5);
            }
            try {
                class275.field3370 = class93.method632(class100.field1044, class654.field9334.field9852.method3133(-126) * 2, class179.field2100, 0, arg1, class618.field8849);
                if (arg3 != null) {
                    var4.method378(0);
                    class535 var7 = class353.method2088(class330.field4275, class630.field9062, 0, -110);
                    class59 var8 = var4.method373(var7, class155.method958(class394.field5410, class630.field9062, 0), true);
                    class161.method997(arg2 ^ 0xFFFFFF96);
                    class192.method1170(var8, true, -8069, var4, arg3, var7);
                }
                if (class275.field3370.method359()) {
                    boolean var9 = true;
                    try {
                        var9 = class463.field6618.field2979 > 256;
                    } catch (Throwable var15) {
                    }
                    class413 var10;
                    if (var9) {
                        var10 = class275.field3370.method408(146800640);
                    } else {
                        var10 = class275.field3370.method408(104857600);
                    }
                    class275.field3370.method385(var10);
                }
            } catch (Throwable var16) {
                int var11 = class654.field9334.field9850.method1512(11);
                if (var11 == 2) {
                    class38.field432 = true;
                }
                class654.field9334.method3924(true, class654.field9334.field9850, 0);
                method166(arg0, var11, (byte) -106, arg3);
                return;
            }
            if (var4 != null) {
                try {
                    var4.method336(-125);
                } catch (Throwable var14) {
                }
            }
        }
        class654.field9334.field9850.method1510(arg2 + 108, !arg0);
        class654.field9334.method3924(true, class654.field9334.field9850, arg1);
        class324.method1930(-80);
        class275.field3370.method366(10000);
        class275.field3370.method398(32);
        class667.field9490 = class275.field3370.method352();
        class672.field9542 = class275.field3370.method352();
        class374.method2182((byte) 11);
        class275.field3370.method407(class654.field9334.field9838.method3694(81) == 1);
        if (class275.field3370.method353()) {
            class463.method2820(1, class654.field9334.field9826.method4205(-122) == 1);
        }
        class714.method3991(class489.field6976 >> 3, (byte) -86, class153.field1677 >> 3, class275.field3370);
        if (arg2 != -106) {
            field394 = -35L;
        }
        class341.method2026(arg2 ^ 0xFFFFDB13);
        class698.field9825 = true;
        class361.field4632 = false;
        class747.field10420 = null;
        class161.method998(false);
    }
}
