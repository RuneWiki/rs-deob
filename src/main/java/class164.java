import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class164 extends class617 {

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field1823 = new String[200];

    @OriginalMember(owner = "client!gca", name = "C", descriptor = "Z")
    public static boolean field1826 = false;

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!gca", name = "B", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "Lwa;")
    private class661 field1827;

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "Ltf;")
    public static class701 field1828;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(III)I", line = 4)
    public final int method886(int arg0, int arg1, int arg2) {
        field1829++;
        if (this.field1827 == null) {
            return arg0;
        } else if (arg1 == 17420) {
            class22 var4 = (class22) this.field1827.method3669((long) arg2, -1);
            return var4 == null ? arg0 : var4.field168;
        } else {
            return 35;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZLnp;)V", line = 26)
    public final void method887(boolean arg0, class115 arg1) {
        if (arg0) {
            this.method890(null, (byte) 117, 81);
        }
        while (true) {
            int var3 = arg1.method620((byte) -14);
            if (var3 == 0) {
                field1822++;
                return;
            }
            this.method890(arg1, (byte) 105, var3);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILjava/lang/String;Z)Ljava/lang/String;", line = 47)
    public final String method888(int arg0, String arg1, boolean arg2) {
        field1825++;
        if (!arg2) {
            field1828 = null;
        }
        if (this.field1827 == null) {
            return arg1;
        } else {
            class302 var4 = (class302) this.field1827.method3669((long) arg0, -1);
            return var4 == null ? arg1 : var4.field3752;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILce;)V", line = 77)
    public static final void method889(int arg0, class445 arg1) {
        field1824++;
        if (arg0 != 1265482928) {
            method889(-15, null);
        }
        for (int var2 = 0; var2 < class293.field3662; var2++) {
            int var3 = class624.field8805[var2];
            class236 var4 = class139.field1540[var3];
            int var5 = arg1.method620((byte) -127);
            if ((var5 & 0x80) != 0) {
                var5 += arg1.method620((byte) 18) << 8;
            }
            if ((var5 & 0x800) != 0) {
                var5 += arg1.method620((byte) 96) << 16;
            }
            class13.method64(var4, arg1, 19946, var3, var5);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lnp;BI)V", line = 111)
    private final void method890(class115 arg0, byte arg1, int arg2) {
        int var4 = -90 / ((arg1 + 13) / 35);
        field1821++;
        if (arg2 != 249) {
            return;
        }
        int var5 = arg0.method620((byte) 16);
        if (this.field1827 == null) {
            int var6 = class553.method3138(1781323777, var5);
            this.field1827 = new class661(var6);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            boolean var8 = arg0.method620((byte) 117) == 1;
            int var9 = arg0.method675(-127);
            class333 var10;
            if (var8) {
                var10 = new class302(arg0.method626(97));
            } else {
                var10 = new class22(arg0.method631(false));
            }
            this.field1827.method3671(false, var10, (long) var9);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V", line = 159)
    public static void method891(int arg0) {
        field1828 = null;
        field1823 = null;
        if (arg0 != 200) {
            method891(-81);
        }
    }
}
