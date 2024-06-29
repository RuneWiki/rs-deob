import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class19 {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "J")
    public long field364 = 0L;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field372 = -1;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "Lok;")
    public static class146 field374 = class235.method1724(-12908, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "Lok;")
    public static class146 field378 = class235.method1724(-12908, "mapflag");

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Lbf;")
    public class322 field371;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "Lbf;")
    public class322 field373;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 4)
    public static void method139(byte arg0) {
        field378 = null;
        field374 = null;
        if (arg0 != -105) {
            method141(50, -114, -6, 32);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method140(boolean arg0) {
        if (arg0) {
            field372 = -90;
        }
        field365++;
        class280.field4809.method793((byte) -124);
        class122.field2001.method793((byte) -81);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)I", line = 58)
    public static final int method141(int arg0, int arg1, int arg2, int arg3) {
        field368++;
        if (class174.field2914 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        if (arg3 < 116) {
            method139((byte) 31);
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1;
        int var8 = arg2 & 0x7F;
        if (arg1 < 3 && (class46.field775[1][var4][var5] & 0x2) == 2) {
            var7 = arg1 + 1;
        }
        int var9 = (128 - var6) * class174.field2914[var7][var4][var5] + class174.field2914[var7][var4 + 1][var5] * var6 >> 7;
        int var10 = (128 - var6) * class174.field2914[var7][var4][var5 + 1] + class174.field2914[var7][var4 + 1][var5 + 1] * var6 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZIBII)Lje;", line = 103)
    public static final class70 method142(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        field380++;
        if (arg3 != 15) {
            field378 = (class146) null;
        }
        int var7 = (arg4 << 19) + (arg1 ? 65536 : 0) + (arg2 << 17) + arg0;
        long var8 = (long) arg5 * 3147483667L + ((long) var7 * 3849834839L);
        class70 var10 = (class70) class200.field3344.method799((byte) 52, var8);
        if (var10 != null) {
            return var10;
        }
        class109.field1754 = false;
        class70 var11 = class116.method785(arg4, false, 48, arg1, arg2, false, arg0, arg5);
        if (var11 != null && !class109.field1754) {
            class200.field3344.method797(var11, 0, var8);
        }
        return var11;
    }
}
