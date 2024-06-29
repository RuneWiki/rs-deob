import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class529 extends class11 {

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "Llt;")
    public static class633 field7048 = new class633("WIP", 2);

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public int field7044;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public int field7045;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
    public int field7052;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public int field7059;

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "Lo;")
    public static class28 field7057;

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "Ljv;")
    public class73 field7054;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "Ljava/lang/String;")
    public String field7047;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "[I")
    public int[] field7046;

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "[I")
    public int[] field7050;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "[Ljw;")
    public class520[] field7060;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field7051;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V", line = 4)
    public static final void method2952(byte arg0) {
        field7053++;
        if (arg0 == 100) {
            class472.method2658(arg0 ^ 0x4AF1, 11);
            class587.method3232(arg0 - 101);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIBI)I", line = 19)
    public static final int method2953(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field7058++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            if (arg2 != -40) {
                method2954(65L, false);
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 43)
    public static final String method2954(long arg0, boolean arg1) {
        class173.field2670.setTime(new Date(arg0));
        if (arg1) {
            return null;
        }
        field7055++;
        int var3 = class173.field2670.get(7);
        int var4 = class173.field2670.get(5);
        int var5 = class173.field2670.get(2);
        int var6 = class173.field2670.get(1);
        int var7 = class173.field2670.get(11);
        int var8 = class173.field2670.get(12);
        int var9 = class173.field2670.get(13);
        return class563.field7468[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class677.field9562[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZBLgba;II)V", line = 70)
    public static final void method2955(boolean arg0, byte arg1, class625 arg2, int arg3, int arg4) {
        field7049++;
        int var5 = arg2.field8350;
        if (arg1 > -1) {
            field7057 = null;
        }
        int var6 = arg2.field8361;
        if (arg2.field8368 == 0) {
            arg2.field8350 = arg2.field8443;
        } else if (arg2.field8368 == 1) {
            arg2.field8350 = arg4 - arg2.field8443;
        } else if (arg2.field8368 == 2) {
            arg2.field8350 = arg2.field8443 * arg4 >> 14;
        }
        if (arg2.field8379 == 0) {
            arg2.field8361 = arg2.field8387;
        } else if (arg2.field8379 == 1) {
            arg2.field8361 = arg3 - arg2.field8387;
        } else if (arg2.field8379 == 2) {
            arg2.field8361 = arg2.field8387 * arg3 >> 14;
        }
        if (arg2.field8368 == 4) {
            arg2.field8350 = arg2.field8361 * arg2.field8277 / arg2.field8324;
        }
        if (arg2.field8379 == 4) {
            arg2.field8361 = arg2.field8350 * arg2.field8324 / arg2.field8277;
        }
        if (class295.field4171 && (client.method1701(arg2).field725 != 0 || arg2.field8421 == 0)) {
            if (arg2.field8361 < 5 && arg2.field8350 < 5) {
                arg2.field8361 = 5;
                arg2.field8350 = 5;
            } else {
                if (arg2.field8361 <= 0) {
                    arg2.field8361 = 5;
                }
                if (arg2.field8350 <= 0) {
                    arg2.field8350 = 5;
                }
            }
        }
        if (class697.field9792 == arg2.field8402) {
            class153.field2412 = arg2;
        }
        if (arg0 && arg2.field8291 != null && arg2.field8350 != var5 || arg2.field8361 != var6) {
            class48 var7 = new class48();
            var7.field692 = arg2;
            var7.field681 = arg2.field8291;
            class46.field658.method3265(var7, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(B)V", line = 160)
    public static void method2956(byte arg0) {
        field7057 = null;
        field7048 = null;
        if (arg0 != -39) {
            field7057 = null;
        }
    }
}
