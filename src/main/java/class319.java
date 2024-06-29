import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class319 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2239(int arg0) {
        class267.field4161 = new class311(32);
        field5045++;
        if (arg0 != -8641) {
            method2240(116, 26, true, -118, -22);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZII)V", line = 16)
    public static final void method2240(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            method2241((byte) 39, (class136) null);
        }
        for (int var5 = 0; var5 < class310.field4829; var5++) {
            if ((class170.field2798[var5] + class170.field2794[var5]) > arg1 && (arg1 + arg0) > class170.field2798[var5] && class322.field5083[var5] + class164.field2660[var5] > arg4 && arg3 + arg4 > class322.field5083[var5]) {
                class231.field3607[var5] = true;
            }
        }
        field5047++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLcd;)V", line = 46)
    public static final void method2241(byte arg0, class136 arg1) {
        field5048++;
        class136 var2 = class322.method2273(arg1, (byte) -128);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class95.field1258;
            var4 = class127.field1841;
        } else {
            var4 = var2.field2137;
            var3 = var2.field2078;
        }
        class286.method2024(var3, false, arg1, true, var4);
        class25.method239(var3, arg1, (byte) -4, var4);
        if (arg0 != 96) {
            method2242((byte) -46, (byte) -72);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BB)C", line = 75)
    public static final char method2242(byte arg0, byte arg1) {
        int var2 = arg0 & 0xFF;
        if (arg1 != -17) {
            method2241((byte) -117, (class136) null);
        }
        field5046++;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class59.field856[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILih;)Lih;")
    public abstract class320 method2067(int arg0, class320 arg1);
}
