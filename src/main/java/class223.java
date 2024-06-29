import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class223 extends class128 {

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public int field3629;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field3627 = 0;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field3630 = 0;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Ldk;")
    public static class251 field3624;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "[Lbl;")
    public static class146[] field3625;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)Z")
    public final boolean method1523(int arg0) {
        field3623++;
        if (arg0 != -1) {
            this.method1529(-17);
        }
        return (this.field3629 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
    public final boolean method1524(byte arg0) {
        field3626++;
        if (arg0 == -100) {
            return (this.field3629 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)I")
    public final int method1525(byte arg0) {
        if (arg0 < 2) {
            return -32;
        } else {
            field3636++;
            return this.field3629 >> 18 & 0x7;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZIIIIIIIII)V")
    public static final void method1526(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (class239.field3829.method279(23397) == 2) {
            class150.method1040(arg7, arg0, arg9, arg2, arg3, -10280, arg1, arg10, arg4, arg8, arg6);
        } else if (class239.field3829.method279(23397) <= 2) {
            class291.method1945(arg7, arg9, arg6, arg3, arg1, -110, arg8, arg10, arg0, arg4, arg2);
        } else {
            class78.method529(arg2, arg9, arg0, arg7, arg8, class239.field3829.method279(23397), arg1, true, arg3, arg10, arg4, arg6);
        }
        if (arg5 <= 100) {
            field3627 = 10;
        }
        field3634++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)Z")
    public final boolean method1527(boolean arg0, int arg1) {
        if (!arg0) {
            field3630 = 83;
        }
        field3637++;
        return (this.field3629 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)Lsk;")
    public static final class203 method1528(byte arg0) {
        int var1 = 5 % ((63 - arg0) / 60);
        field3628++;
        return class188.field3049.length > class179.field2919 ? class188.field3049[class179.field2919++] : null;
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)I")
    public final int method1529(int arg0) {
        if (arg0 <= 105) {
            this.method1537(false);
        }
        field3619++;
        return class22.method118((byte) 91, this.field3629);
    }

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)Z")
    public final boolean method1530(int arg0) {
        if (arg0 < 68) {
            this.field3629 = 112;
        }
        field3632++;
        return (this.field3629 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)V")
    public static void method1531(int arg0) {
        if (arg0 != -22990) {
            method1526(91, false, 96, -105, -73, 11, -126, 52, -122, -1, 40);
        }
        field3624 = null;
        field3625 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1532(int arg0, int arg1, String arg2) {
        field3620++;
        class175 var3 = class182.method1317(3, arg0, false);
        if (arg1 != 2) {
            method1533((byte) -62, (String) null);
        }
        var3.method1279((byte) -80);
        var3.field2854 = arg2;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1533(byte arg0, String arg1) {
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        field3635++;
        if (arg0 != -26) {
            return null;
        }
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class63.method445((byte) 112, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)Z")
    public final boolean method1534(boolean arg0) {
        field3639++;
        if (arg0) {
            field3624 = null;
        }
        return (this.field3629 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "(I)Z")
    public final boolean method1535(int arg0) {
        field3641++;
        if (arg0 != -30566) {
            field3630 = 51;
        }
        return (this.field3629 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)Z")
    public final boolean method1536(byte arg0) {
        if (arg0 != -106) {
            field3625 = null;
        }
        field3631++;
        return (this.field3629 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(II)V")
    public class223(int arg0, int arg1) {
        this.field3638 = arg1;
        this.field3629 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)Z")
    public final boolean method1537(boolean arg0) {
        field3622++;
        if (arg0) {
            return false;
        } else {
            return (this.field3629 >> 28 & 0x1) != 0;
        }
    }
}
