import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class269 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lsi;")
    public static class512 field3729 = new class512(12, 16);

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 4)
    public static void method1716(int arg0) {
        if (arg0 != -445444664) {
            field3729 = null;
        }
        field3729 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZ)Z", line = 24)
    public static final boolean method1717(boolean arg0, boolean arg1) {
        field3730++;
        if (arg0) {
            field3733 = 116;
        }
        boolean var2 = class337.field5242.method1146();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class337.field5242.method1143();
        } else if (!class337.field5242.method1124()) {
            arg1 = false;
        }
        if (var2 == arg1) {
            return false;
        } else {
            class96.field1399.field5211 = arg1;
            class96.field1399.method1731(true, class419.field6254);
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)V", line = 61)
    public static final void method1718(int arg0, byte arg1, int arg2) {
        field3727++;
        class377 var3 = class99.method672(arg2, false, 6);
        var3.method2340((byte) 127);
        var3.field5763 = arg0;
        if (arg1 != -121) {
            field3733 = -93;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 79)
    public static final void method1719(byte arg0) {
        field3731++;
        if (arg0 != -116) {
            return;
        }
        for (int var1 = 0; var1 < class25.field411; var1++) {
            int var2 = class259.field3609[var1];
            class194 var3 = class151.field2174[var2];
            if (var3 != null) {
                class242.method1614(var3.field2768.field5083, var3, -1536);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIII)I", line = 106)
    public static final int method1720(byte arg0, int arg1, int arg2, int arg3) {
        field3728++;
        if (arg0 < 78) {
            method1717(true, false);
        }
        int var4 = ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
        int var5 = 255 - arg2;
        return (((arg3 & 0xFF00) * var5 & 0xFF0000 | (arg3 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }
}
