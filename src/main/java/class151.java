import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class151 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2245 = 0;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2244 = "purple:";

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lsg;")
    public static class163 field2242;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static final void method1004(byte arg0) {
        if (arg0 >= -95) {
            return;
        }
        class95 var1 = (class95) class63.field867.method350(8240);
        field2247++;
        while (var1 != null) {
            class50 var2 = var1.field1471;
            if (class276.field4398 != var2.field686 || var2.field690 < class111.field1684) {
                var1.method784(false);
            } else if (var2.field691 <= class111.field1684) {
                if (var2.field697 > 0) {
                    class56 var3 = class100.field1566[var2.field697 - 1];
                    if (var3 != null && var3.field1226 >= 0 && var3.field1226 < 13312 && var3.field1273 >= 0 && var3.field1273 < 13312) {
                        var2.method372(class99.method658(var3.field1273, var2.field686, var3.field1226, -7185) - var2.field683, var3.field1273, var3.field1226, true, class111.field1684);
                    }
                }
                if (var2.field697 < 0) {
                    int var4 = -var2.field697 - 1;
                    class186 var5;
                    if (class45.field574 == var4) {
                        var5 = class149.field2227;
                    } else {
                        var5 = class153.field2277[var4];
                    }
                    if (var5 != null && var5.field1226 >= 0 && var5.field1226 < 13312 && var5.field1273 >= 0 && var5.field1273 < 13312) {
                        var2.method372(class99.method658(var5.field1273, var2.field686, var5.field1226, -7185) - var2.field683, var5.field1273, var5.field1226, true, class111.field1684);
                    }
                }
                var2.method365((byte) 62, class80.field1166);
                class143.method952(class276.field4398, (int) var2.field700, (int) var2.field687, (int) var2.field672, 60, var2, var2.field654, -1L, false);
            }
            var1 = (class95) class63.field867.method353((byte) -121);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/Object;Lbk;)V")
    public static final void method1005(byte arg0, Object arg1, class20 arg2) {
        field2239++;
        if (arg2.field235 == null || arg0 != 76) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field235.peekEvent() != null; var3++) {
            class170.method1183(1L, (byte) -119);
        }
        if (arg1 != null) {
            arg2.field235.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lef;II)V")
    public static final void method1006(class214[] arg0, int arg1, int arg2) {
        field2246++;
        if (arg2 != -4545) {
            field2244 = null;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class214 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3447 == 0) {
                    if (var4.field3357 != null) {
                        method1006(var4.field3357, arg1, -4545);
                    }
                    class35 var5 = (class35) class2.field22.method665((byte) 122, (long) var4.field3474);
                    if (var5 != null) {
                        class159.method1067(arg1, var5.field456, false);
                    }
                }
                if (arg1 == 0 && var4.field3449 != null) {
                    class142 var6 = new class142();
                    var6.field2086 = var4.field3449;
                    var6.field2079 = var4;
                    class202.method1390(var6, (byte) 100);
                }
                if (arg1 == 1 && var4.field3352 != null) {
                    if (var4.field3471 >= 0) {
                        class214 var7 = class206.method1403((byte) 7, var4.field3474);
                        if (var7 == null || var7.field3357 == null || var7.field3357.length <= var4.field3471 || var7.field3357[var4.field3471] != var4) {
                            continue;
                        }
                    }
                    class142 var8 = new class142();
                    var8.field2086 = var4.field3352;
                    var8.field2079 = var4;
                    class202.method1390(var8, (byte) 112);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method1007(int arg0) {
        if (arg0 == -1) {
            field2244 = null;
            field2242 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IBLjava/lang/String;)V")
    public static final void method1008(String arg0, String arg1, int arg2, byte arg3, String arg4) {
        field2248++;
        class107.method700(-1, arg2, arg4, true, arg1, arg0);
        if (arg3 >= -52) {
            method1008((String) null, (String) null, 32, (byte) -18, (String) null);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILdl;B)Lli;")
    public static final class290 method1009(int arg0, class123 arg1, byte arg2) {
        int var3 = 120 / ((arg2 + 22) / 41);
        field2241++;
        byte[] var4 = arg1.method834(true, arg0);
        return var4 == null ? null : new class290(var4);
    }
}
