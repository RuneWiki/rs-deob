import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class501 extends RuntimeException {

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7657;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Ljava/lang/String;")
    public String field7659;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Liu;")
    public static class390 field7656 = new class390(98, 6);

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[I")
    public static int[] field7658 = new int[4096];

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 3)
    public static void method3015(int arg0) {
        field7658 = null;
        int var1 = -36 % ((arg0 - 16) / 63);
        field7656 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IC)Z", line = 13)
    public static final boolean method3016(int arg0, char arg1) {
        if (arg0 != 255) {
            return false;
        }
        field7653++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class409.field6005;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLqp;Lqp;IZ)I", line = 47)
    public static final int method3017(byte arg0, class450 arg1, class450 arg2, int arg3, boolean arg4) {
        field7652++;
        if (arg3 == 1) {
            int var5 = arg1.field2721;
            int var6 = arg2.field2721;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class483.method2813(-116, arg1.method2622(-2040516573).field6579, arg2.method2622(-2040516573).field6579, class81.field1122);
        } else if (arg3 == 3) {
            if (arg1.field6561.equals("-")) {
                if (arg2.field6561.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field6561.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class483.method2813(-116, arg1.field6561, arg2.field6561, class81.field1122);
            }
        } else if (arg3 != 4) {
            int var7 = 26 / ((arg0 + 10) / 57);
            if (arg3 == 5) {
                if (arg1.method1206(-1)) {
                    return arg2.method1206(-1) ? 0 : 1;
                } else if (arg2.method1206(-1)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 6) {
                if (arg1.method1207((byte) 123)) {
                    return arg2.method1207((byte) 120) ? 0 : 1;
                } else if (arg2.method1207((byte) 124)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 7) {
                if (arg1.method1211(-43)) {
                    return arg2.method1211(-117) ? 0 : 1;
                } else if (arg2.method1211(101)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 8) {
                int var8 = arg1.field6564;
                int var9 = arg2.field6564;
                if (arg4) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var9 == 1000) {
                        var9 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var9 == -1) {
                        var9 = 1000;
                    }
                }
                return var8 - var9;
            } else {
                return arg1.field6560 - arg2.field6560;
            }
        } else if (arg1.method1210(false)) {
            return arg2.method1210(false) ? 0 : 1;
        } else if (arg2.method1210(false)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V", line = 148)
    public static final void method3018(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class483.field6999 = arg4;
        class504.field7696 = arg2;
        if (arg1 == 31077) {
            field7655++;
            class494.field7533 = arg3;
            client.field2674 = arg0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lhe;II)Lmo;", line = 167)
    public static final class507 method3019(class239 arg0, int arg1, int arg2) {
        field7661++;
        byte[] var3 = arg0.method1465(0, arg2);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -1) {
                field7658 = null;
            }
            return new class507(var3);
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 196)
    public class501(Throwable arg0, String arg1) {
        this.field7657 = arg0;
        this.field7659 = arg1;
    }
}
