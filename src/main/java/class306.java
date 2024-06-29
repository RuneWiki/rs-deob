import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class306 extends class230 {

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "Ljava/lang/Object;")
    private Object field4920;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "Lne;")
    public static class52 field4918;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI[Lcc;)V")
    public static final void method2050(byte arg0, int arg1, class222[] arg2) {
        field4919++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class222 var4 = arg2[var3];
            if (var4 != null && var4.field3392 == arg1 && (!var4.field3441 || !client.method1146(var4))) {
                if (var4.field3552 == 0) {
                    if (!var4.field3441 && client.method1146(var4) && class43.field729 != var4) {
                        continue;
                    }
                    method2050((byte) -108, var4.field3554, arg2);
                    if (var4.field3526 != null) {
                        method2050((byte) -115, var4.field3554, var4.field3526);
                    }
                    class288 var5 = (class288) class48.field787.method2043((long) var4.field3554, -1);
                    if (var5 != null) {
                        class74.method587(var5.field4505, 22608);
                    }
                }
                if (var4.field3552 == 6) {
                    if (var4.field3462 != -1 || var4.field3397 != -1) {
                        boolean var6 = class106.method805(var4, 20574);
                        int var7;
                        if (var6) {
                            var7 = var4.field3397;
                        } else {
                            var7 = var4.field3462;
                        }
                        if (var7 != -1) {
                            class103 var8 = class250.method1700(var7, -112);
                            if (var8 != null) {
                                var4.field3498 += class209.field3230;
                                while (var4.field3498 > var8.field1602[var4.field3442]) {
                                    var4.field3498 -= var8.field1602[var4.field3442];
                                    var4.field3442++;
                                    if (var4.field3442 >= var8.field1606.length) {
                                        var4.field3442 -= var8.field1592;
                                        if (var4.field3442 < 0 || var4.field3442 >= var8.field1606.length) {
                                            var4.field3442 = 0;
                                        }
                                    }
                                    var4.field3470 = var4.field3442 + 1;
                                    if (var8.field1606.length <= var4.field3470) {
                                        var4.field3470 -= var8.field1592;
                                        if (var4.field3470 < 0 || var8.field1606.length <= var4.field3470) {
                                            var4.field3470 = -1;
                                        }
                                    }
                                    class80.method628((byte) -76, var4);
                                }
                            }
                        }
                    }
                    if (var4.field3482 != 0 && !var4.field3441) {
                        int var9 = var4.field3482 << 16 >> 16;
                        int var10 = class209.field3230 * var9;
                        int var11 = var4.field3482 >> 16;
                        var4.field3448 = var4.field3448 + var10 & 0x7FF;
                        int var12 = class209.field3230 * var11;
                        var4.field3406 = var4.field3406 + var12 & 0x7FF;
                        class80.method628((byte) -94, var4);
                    }
                }
            }
        }
        if (arg0 > -106) {
            field4918 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)V")
    public static final void method2051(int arg0, int arg1, byte arg2) {
        field4914++;
        class69 var3 = class255.method1723((byte) 32, arg0, 1);
        var3.method556((byte) -101);
        var3.field1091 = arg1;
        if (arg2 != -63) {
            field4918 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public static void method2052(boolean arg0) {
        field4918 = null;
        if (!arg0) {
            method2050((byte) -95, 20, (class222[]) null);
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z")
    public final boolean method347(byte arg0) {
        field4915++;
        if (arg0 >= -2) {
            this.method347((byte) -102);
        }
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method348(int arg0) {
        field4916++;
        return arg0 > -40 ? null : this.field4920;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILub;)Lej;")
    public static final class51 method2053(int arg0, int arg1, int arg2, class92 arg3) {
        field4917++;
        if (class246.method1668(arg1, arg3, arg2, arg0 - 1)) {
            return arg0 == 0 ? class14.method113((byte) 126) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class306(Object arg0) {
        this.field4920 = arg0;
    }
}
