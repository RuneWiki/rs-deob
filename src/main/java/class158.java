import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class158 extends class51 {

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "Lea;")
    public static class38 field3315 = class9.method46((byte) 113, "Nehmen");

    @OriginalMember(owner = "client!rf", name = "cb", descriptor = "Lea;")
    public static class38 field3316 = class9.method46((byte) 115, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
    public static int field3317 = 0;

    @OriginalMember(owner = "client!rf", name = "gb", descriptor = "Lea;")
    public static class38 field3320 = class9.method46((byte) 107, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!rf", name = "fb", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(Z)V")
    public static void method1141(boolean arg0) {
        field3315 = null;
        field3316 = null;
        field3320 = null;
        if (arg0) {
            field3316 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLef;Lea;)Lea;")
    public static final class38 method1142(byte arg0, class43 arg1, class38 arg2) {
        if (~arg2.method260(-119, class12.field270) != 0) {
            label62: while (true) {
                int var3 = arg2.method260(125, class185.field3673);
                if (~var3 == 0) {
                    while (true) {
                        int var4 = arg2.method260(-106, class67.field1699);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method260(103, class188.field3736);
                                if (~var5 == 0) {
                                    while (true) {
                                        int var6 = arg2.method260(-105, class75.field1825);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method260(42, class105.field2342);
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg2.method260(-111, class125.field2684);
                                                        if (~var8 == 0) {
                                                            break label62;
                                                        }
                                                        class38 var9 = class70.field1731;
                                                        if (class187.field3726 != null) {
                                                            var9 = class96.method801(-21952, class187.field3726.field1485);
                                                            try {
                                                                if (class187.field3726.field1490 != null) {
                                                                    byte[] var10 = ((String) class187.field3726.field1490).getBytes("ISO-8859-1");
                                                                    var9 = class74.method589((byte) -17, var10.length, var10, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class163.method1168(123, new class38[] { arg2.method273(0, 0, var8), var9, arg2.method262(var8 + 4, -1) });
                                                    }
                                                }
                                                arg2 = class163.method1168(25, new class38[] { arg2.method273(0, 0, var7), class117.method905(class101.method828(-29842, 4, arg1), (byte) -123), arg2.method262(var7 - -2, -1) });
                                            }
                                        }
                                        arg2 = class163.method1168(-28, new class38[] { arg2.method273(0, 0, var6), class117.method905(class101.method828(-29842, 3, arg1), (byte) -128), arg2.method262(var6 - -2, -1) });
                                    }
                                }
                                arg2 = class163.method1168(19, new class38[] { arg2.method273(0, 0, var5), class117.method905(class101.method828(-29842, 2, arg1), (byte) -125), arg2.method262(var5 + 2, -1) });
                            }
                        }
                        arg2 = class163.method1168(-27, new class38[] { arg2.method273(0, 0, var4), class117.method905(class101.method828(-29842, 1, arg1), (byte) -120), arg2.method262(var4 - -2, -1) });
                    }
                }
                arg2 = class163.method1168(-119, new class38[] { arg2.method273(0, 0, var3), class117.method905(class101.method828(-29842, 0, arg1), (byte) -117), arg2.method262(var3 + 2, -1) });
            }
        }
        ++field3313;
        return arg0 > -20 ? null : arg2;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field3318;
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            for (int var4 = 0; ~var4 > ~class86.field2008; ++var4) {
                var3[var4] = class196.field3854[var4];
            }
        }
        return arg0 > -125 ? null : var3;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class158() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILef;)Lef;")
    public static final class43 method1143(int arg0, class43 arg1) {
        ++field3314;
        class43 var2 = class109.method871(arg1, false);
        if (var2 == null) {
            var2 = arg1.field1024;
        }
        int var3 = -27 / ((arg0 - -82) / 32);
        return var2;
    }
}
