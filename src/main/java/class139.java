import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class139 {

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "Lln;")
    public static class256 field2224;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public static void method1039(int arg0) {
        if (arg0 <= 112) {
            field2224 = null;
        }
        field2224 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method1040(int arg0, int arg1, byte arg2) {
        field2225++;
        int var3 = arg1 - arg0;
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
        } else {
            if (arg2 != -68) {
                method1042(-100, null);
            }
            if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(I)V")
    public static final void method1041(int arg0) {
        if (arg0 != -3) {
            method1043(null, -87, '8');
        }
        field2226++;
        if (class171.field2648) {
            class171.field2648 = false;
            class416.field6214 = null;
            class275.field3980 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILna;)V")
    public static final void method1042(int arg0, class35 arg1) {
        class88.field1546[arg0] = arg1;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
    public static final String[] method1043(String arg0, int arg1, char arg2) {
        field2227++;
        int var3 = class168.method1234(arg1, arg0, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }
}
