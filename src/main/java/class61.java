import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class61 {

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "S")
    public static short field727 = 320;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "S")
    public static short field731 = 32767;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
    public static int[] field733 = new int[14];

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Ljava/lang/String;")
    public static String field724 = "level: ";

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lbc;")
    public static class282 field723;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "[Lpk;")
    public static class43[] field734;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
    public static final void method375(boolean arg0, int arg1) {
        field725++;
        class66 var2 = class6.method34(5, arg0, arg1);
        var2.method410(121);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lbc;Lbc;Lji;ILbc;)Z")
    public static final boolean method376(class282 arg0, class282 arg1, class145 arg2, int arg3, class282 arg4) {
        class296.field4684 = arg2;
        class153.field2213 = arg4;
        class122.field1756 = arg0;
        class77.field932 = arg1;
        if (arg3 == -21958) {
            field735++;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lwe;I)Z")
    public static final boolean method377(class82 arg0, int arg1) {
        field728++;
        if (arg0.field978 == null) {
            return false;
        } else if (arg1 == 32767) {
            for (int var2 = 0; var2 < arg0.field978.length; var2++) {
                int var3 = class228.method1479(var2, arg0, (byte) 63);
                int var4 = arg0.field1002[var2];
                if (arg0.field978[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg0.field978[var2] == 3) {
                    if (var4 >= var3) {
                        return false;
                    }
                } else if (arg0.field978[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Loe;I)V")
    public static final void method378(class54 arg0, int arg1) {
        field729++;
        if (arg1 != 14) {
            field733 = null;
        }
        for (class116 var2 = (class116) class254.field3665.method1532(-114); var2 != null; var2 = (class116) class254.field3665.method1523(arg1 - 67)) {
            if (var2.field1627 == arg0) {
                if (var2.field1610 != null) {
                    class14.field178.method189(var2.field1610);
                    var2.field1610 = null;
                }
                var2.method1935(120);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BII)Ljava/lang/String;")
    public static final String method379(byte arg0, int arg1, int arg2) {
        int var3 = arg1 - arg2;
        if (arg0 <= 59) {
            field727 = 119;
        }
        field732++;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILbc;I)Lpg;")
    public static final class187 method380(int arg0, int arg1, class282 arg2, int arg3) {
        field730++;
        return class282.method1875(arg2, arg3, arg0, arg1) ? class116.method749(arg0) : null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method381(int arg0) {
        field733 = null;
        field734 = null;
        field724 = null;
        if (arg0 != -1) {
            method376((class282) null, (class282) null, (class145) null, 45, (class282) null);
        }
        field723 = null;
    }
}
