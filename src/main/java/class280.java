import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class280 extends class128 {

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public int field4489;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field4485 = 3353893;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "Lag;")
    public static class211 field4486;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "Ldk;")
    public static class251 field4487;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
    public static void method1882(int arg0) {
        if (arg0 == 0) {
            field4487 = null;
            field4486 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lbc;[I[IB[I)V")
    public static final void method1883(class299 arg0, int[] arg1, int[] arg2, byte arg3, int[] arg4) {
        int var5 = 0;
        int var6 = 89 % ((28 - arg3) / 52);
        while (arg2.length > var5) {
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            int var9 = arg4[var5];
            for (int var10 = 0; var8 != 0 && var10 < arg0.field662.length; var10++) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg0.field662[var10] = null;
                    } else {
                        class307 var11 = class22.method121(var7, true);
                        int var12 = var11.field4893;
                        class313 var13 = arg0.field662[var10];
                        if (var13 != null) {
                            if (var13.field4993 == var7) {
                                if (var12 == 0) {
                                    var13 = arg0.field662[var10] = null;
                                } else if (var12 == 1) {
                                    var13.field4987 = 0;
                                    var13.field4994 = var9;
                                    var13.field4984 = 0;
                                    var13.field4983 = 1;
                                    var13.field4988 = 0;
                                    class274.method1838(arg0.field710, class239.field3829 == arg0, var11, 0, (byte) -114, arg0.field637);
                                } else if (var12 == 2) {
                                    var13.field4988 = 0;
                                }
                            } else if (var11.field4898 >= class22.method121(var13.field4993, true).field4898) {
                                var13 = arg0.field662[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class313 var14 = arg0.field662[var10] = new class313();
                            var14.field4988 = 0;
                            var14.field4993 = var7;
                            var14.field4987 = 0;
                            var14.field4983 = 1;
                            var14.field4984 = 0;
                            var14.field4994 = var9;
                            class274.method1838(arg0.field710, class239.field3829 == arg0, var11, 0, (byte) -107, arg0.field637);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
            var5++;
        }
        field4490++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
    public static final void method1884(int arg0, int arg1) {
        field4481++;
        class175 var2 = class182.method1317(arg0, arg1, false);
        var2.method1278((byte) -64);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(II)V")
    public class280(int arg0, int arg1) {
        this.field4489 = arg0;
        this.field4488 = arg1;
    }
}
