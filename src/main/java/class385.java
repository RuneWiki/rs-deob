import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class385 extends class382 {

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[S")
    public static short[] field5628 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public int field5621;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field5623;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field5625;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Lng;")
    public static class229 field5622;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lvs;")
    public class421 field5624;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "[I")
    public static int[] field5619;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "[Lpr;")
    public class313[] field5620;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Ljava/lang/String;", line = 3)
    public static final String method2360(int arg0) {
        field5627++;
        String var1 = "www";
        if (class522.field7582 == class428.field6410) {
            var1 = "www-wtrc";
        } else if (class522.field7582 == class436.field6492) {
            var1 = "www-wtqa";
        } else if (class522.field7582 == class515.field7472) {
            var1 = "www-wtwip";
        }
        if (arg0 != 957) {
            method2361(-92, 8, -110, null, null);
        }
        String var2 = "";
        if (class27.field437 != null) {
            var2 = "/p=" + class27.field437;
        }
        return "http://" + var1 + "." + class424.field6366.field5125 + ".com/l=" + class146.field2452 + "/a=" + class242.field3745 + var2 + "/";
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILne;Lne;)V", line = 34)
    public static final void method2361(int arg0, int arg1, int arg2, class210 arg3, class210 arg4) {
        class234 var5 = class455.method2715(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field3605 = arg3;
            var5.field3602 = arg4;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 48)
    public static void method2362(int arg0) {
        field5622 = null;
        if (arg0 >= -46) {
            field5622 = null;
        }
        field5619 = null;
        field5628 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILza;IB)Z", line = 63)
    public final boolean method2363(int arg0, class288 arg1, int arg2, byte arg3) {
        if (arg3 != 71) {
            this.field5624 = null;
        }
        field5626++;
        if (this.field5620 != null) {
            for (int var5 = 0; var5 < this.field5620.length; var5++) {
                if (this.field5620[var5].method1988(arg2, arg0) && this.field5624.method14(false, arg1, arg0, arg2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZIB)Ljava/lang/String;", line = 91)
    public static final String method2364(int arg0, boolean arg1, int arg2, byte arg3) {
        field5618++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg1 && arg2 >= 0) {
            int var4 = 2;
            for (int var5 = arg2 / arg0; var5 != 0; var5 /= arg0) {
                var4++;
            }
            if (arg3 < 125) {
                return null;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg0;
                int var9 = var8 - (arg0 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg0);
        }
    }
}
