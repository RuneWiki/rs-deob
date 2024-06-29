import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class120 extends class19 {

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "[Lfh;")
    public class55[] field2350;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "Lsd;")
    public static class166 field2353 = class135.method935("Lade Wordpack )2 ", 0);

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public static int field2351 = 99;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "Lsd;")
    private static class166 field2352 = class135.method935("Welcome to RuneScape", 0);

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "Z")
    public static boolean field2355 = false;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "Lsd;")
    public static class166 field2346 = field2352;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field2357 = 0;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "Ldc;")
    public static class32 field2349 = new class32();

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "Lcb;")
    public static class22 field2348;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "[Lre;")
    public static class158[] field2358;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Z")
    public final boolean method865(int arg0, byte arg1) {
        field2354++;
        return arg1 > -47 ? true : this.field2350[arg0].field1025;
    }

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)V")
    public static void method866(int arg0) {
        field2346 = null;
        if (arg0 != 0) {
            field2348 = null;
        }
        field2349 = null;
        field2352 = null;
        field2358 = null;
        field2353 = null;
        field2348 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZILvd;)Lsd;")
    public static final class166 method867(boolean arg0, int arg1, class193 arg2) {
        if (arg0) {
            return null;
        }
        field2347++;
        if (!class69.method561(arg1, true, class140.method955(-80, arg2)) && arg2.field3707 == null) {
            return null;
        } else if (arg2.field3696 == null || arg2.field3696.length <= arg1 || arg2.field3696[arg1] == null || arg2.field3696[arg1].method1150(false).method1143(true) == 0) {
            return class8.field163 ? class22.method148(new class166[] { class111.field2161, class174.method1192(false, arg1) }, 0) : null;
        } else {
            return arg2.field3696[arg1];
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lf;Lf;IZ)V")
    public class120(class47 arg0, class47 arg1, int arg2, boolean arg3) {
        class165 var5 = new class165();
        int var6 = arg0.method358(arg2, -1);
        this.field2350 = new class55[var6];
        int[] var7 = arg0.method350(true, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method353(arg2, var7[var8], -64);
            class172 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class172 var12 = (class172) var5.method1109((byte) -95); var12 != null; var12 = (class172) var5.method1115((byte) 88)) {
                if (var12.field3290 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method365(var11, 0, (byte) 78);
                } else {
                    var13 = arg1.method365(0, var11, (byte) 78);
                }
                var10 = new class172(var11, var13);
                var5.method1112(-1250931468, var10);
            }
            this.field2350[var7[var8]] = new class55(var9, var10);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static final void method868(byte arg0) {
        field2356++;
        class190.field3620 = null;
        class102.field1981 = null;
        class110.field2123 = null;
        if (arg0 > -93) {
            return;
        }
        class108.field2099 = null;
        class138.field2685 = null;
        class74.field1538 = null;
        class150.field2917 = null;
        class25.field452 = null;
        class156.field2991 = null;
        class5.field98 = null;
        class187.field3572 = null;
        class206.field4055 = null;
    }
}
