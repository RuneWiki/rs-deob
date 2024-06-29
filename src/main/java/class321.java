import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class321 extends class540 {

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public volatile int field4738 = -1;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field4742;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Lbg;")
    public static class487 field4741;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZII)I", line = 3)
    public static final int method2082(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4740++;
        if (var4 == 0) {
            return arg0;
        } else if (!arg1) {
            return -105;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 139)
    public class321(String arg0) {
        this.field4742 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 31)
    public static void method2083(byte arg0) {
        if (arg0 != 1) {
            field4741 = null;
        }
        field4741 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[Lwq;I)V", line = 42)
    public static final void method2084(int arg0, class176[] arg1, int arg2) {
        field4739++;
        if (arg0 != 5555) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class176 var4 = arg1[var3];
            if (var4 != null && var4.field2661 == arg2 && !client.method2063(var4)) {
                if (var4.field2560 == 0) {
                    method2084(arg0, arg1, var4.field2588);
                    if (var4.field2543 != null) {
                        method2084(arg0, var4.field2543, var4.field2588);
                    }
                    class329 var5 = (class329) class251.field3547.method380((byte) -3, (long) var4.field2588);
                    if (var5 != null) {
                        class48.method310(var5.field4912, -106);
                    }
                }
                if (var4.field2560 == 6 && var4.field2609 != -1) {
                    class129 var6 = class203.field2975.method1931((byte) -81, var4.field2609);
                    if (var6 != null) {
                        var4.field2668 += class55.field755;
                        int var7 = var4.field2506;
                        while (var4.field2668 > var6.field1668[var4.field2506]) {
                            var4.field2668 -= var6.field1668[var4.field2506];
                            var4.field2506++;
                            if (var6.field1684.length <= var4.field2506) {
                                var4.field2506 -= var6.field1692;
                                if (var4.field2506 < 0 || var4.field2506 >= var6.field1684.length) {
                                    var4.field2506 = 0;
                                }
                            }
                            var4.field2670 = var4.field2506 + 1;
                            if (var4.field2670 >= var6.field1684.length) {
                                var4.field2670 -= var6.field1692;
                                if (var4.field2670 < 0 || var6.field1684.length <= var4.field2670) {
                                    var4.field2670 = -1;
                                }
                            }
                            class288.method1923((byte) -19, var4);
                        }
                        if (var4.field2506 != var7) {
                            class384.method2350(var6, (byte) 117, var4.field2506);
                        }
                    }
                }
            }
        }
    }
}
