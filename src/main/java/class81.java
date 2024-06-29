import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class81 {

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "Z")
    public static boolean field901 = false;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "Lfba;")
    public static class27 field900 = new class27(78, -1);

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "Lbu;")
    public static class21 field903 = new class21(125, 8);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
    public static void method621(int arg0) {
        field903 = null;
        if (arg0 != -25604) {
            method621(-53);
        }
        field900 = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I[Lmea;I)V")
    public static final void method622(int arg0, class451[] arg1, int arg2) {
        if (arg0 != -1) {
            method622(-113, null, 77);
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class451 var4 = arg1[var3];
            if (var4 != null && var4.field6233 == arg2 && !client.method2034(var4)) {
                if (var4.field6210 == 0) {
                    method622(-1, arg1, var4.field6222);
                    if (var4.field6270 != null) {
                        method622(arg0, var4.field6270, var4.field6222);
                    }
                    class744 var5 = (class744) class11.field217.method2242((long) var4.field6222, -1);
                    if (var5 != null) {
                        class250.method1649(122, var5.field10314);
                    }
                }
                if (var4.field6210 == 6 && var4.field6167 != -1) {
                    class607 var6 = class563.field7993.method651(var4.field6167, (byte) 107);
                    if (var6 != null) {
                        var4.field6324 += class471.field6608;
                        int var7 = var4.field6339;
                        while (var4.field6324 > var6.field8494[var4.field6339]) {
                            var4.field6324 -= var6.field8494[var4.field6339];
                            var4.field6339++;
                            if (var6.field8492.length <= var4.field6339) {
                                var4.field6339 -= var6.field8495;
                                if (var4.field6339 < 0 || var4.field6339 >= var6.field8492.length) {
                                    var4.field6339 = 0;
                                }
                            }
                            var4.field6228 = var4.field6339 + 1;
                            if (var4.field6228 >= var6.field8492.length) {
                                var4.field6228 -= var6.field8495;
                                if (var4.field6228 < 0 || var4.field6228 >= var6.field8492.length) {
                                    var4.field6228 = -1;
                                }
                            }
                            class564.method3329(var4, 8195);
                        }
                        if (var4.field6339 != var7) {
                            class662.method3776(var6, var4.field6339, 122);
                        }
                    }
                }
            }
        }
        field897++;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
    public static final void method623(int arg0) {
        if (arg0 != 0) {
            field896 = 0;
        }
        field898++;
        class485.field6825++;
        class312 var1 = class353.method2245(class87.field971, class15.field291, (byte) 78);
        var1.field4445.method2957(class234.field3518, arg0 + 1267307848);
        class208.method1440(var1, 50);
    }
}
