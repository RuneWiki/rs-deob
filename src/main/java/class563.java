import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class563 {

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Ljava/lang/String;")
    public String field7814;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "Ljava/lang/String;")
    public String field7817;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "Ljava/lang/String;")
    public String field7820;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "[I")
    public static int[] field7811 = new int[3];

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "[I")
    public static int[] field7810 = new int[13];

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "Lmaa;")
    public static class508 field7815 = new class508(0, 19);

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "[I")
    public static int[] field7819 = new int[2];

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "Ljg;")
    public static class246 field7818;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 6)
    public static void method3304(int arg0) {
        field7810 = null;
        field7815 = null;
        field7811 = null;
        field7818 = null;
        field7819 = null;
        if (arg0 <= 38) {
            method3305(33, 75);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V", line = 20)
    public static final void method3305(int arg0, int arg1) {
        field7812++;
        class346 var2 = class299.method1976(0, 7, arg1);
        var2.method2208(-1719);
        if (arg0 > -2) {
            method3305(84, -45);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "([IIBLwq;)V", line = 43)
    public static final void method3306(int[] arg0, int arg1, byte arg2, class679 arg3) {
        if (arg3.field7105 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg3.field7105.length; var5++) {
                if (arg3.field7105[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field7132 != -1) {
                class57 var6 = class607.field8188.method3001(-12575, arg3.field7132);
                int var7 = var6.field818;
                if (var7 == 1) {
                    arg3.field7164 = 1;
                    arg3.field7123 = 0;
                    arg3.field7127 = 0;
                    arg3.field7170 = arg1;
                    arg3.field7131 = 0;
                    if (!arg3.field7134) {
                        class123.method765(arg3.field7127, arg3, var6, false);
                    }
                }
                if (var7 == 2) {
                    arg3.field7123 = 0;
                }
            }
        }
        field7813++;
        boolean var8 = true;
        if (arg2 >= -88) {
            method3307(6, -124, -84);
        }
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg3.field7105 == null || arg3.field7105[var9] == -1 || class607.field8188.method3001(-12575, arg0[var9]).field815 >= class607.field8188.method3001(-12575, arg3.field7105[var9]).field815) {
                arg3.field7105 = arg0;
                arg3.field7199 = arg3.field7203;
                arg3.field7170 = arg1;
            }
        }
        if (var8) {
            arg3.field7105 = arg0;
            arg3.field7199 = arg3.field7203;
            arg3.field7170 = arg1;
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 140)
    public class563(String arg0, String arg1, String arg2) {
        this.field7814 = arg2;
        this.field7817 = arg1;
        this.field7820 = arg0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)I", line = 150)
    public static final int method3307(int arg0, int arg1, int arg2) {
        field7816++;
        if (arg1 != 21834) {
            return 77;
        } else if (arg0 == -1) {
            return 12345678;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }
}
