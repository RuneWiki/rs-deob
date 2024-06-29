import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class313 {

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public int field5275;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "[Lqd;")
    public class40[] field5291;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "[I")
    public int[] field5295;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "[S")
    public short[] field5292;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "[B")
    public byte[] field5281;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "[S")
    public short[] field5272;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Lqd;")
    public static class40 field5276 = class147.method1106("leuchten2:", (byte) -98);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "[I")
    public static int[] field5273 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field5285 = 0;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Lqd;")
    private static class40 field5289 = class147.method1106("wave:", (byte) -63);

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Lqd;")
    public static class40 field5288 = field5289;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Lqd;")
    public static class40 field5283 = field5289;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "Lqd;")
    private static class40 field5293 = class147.method1106("yellow:", (byte) -49);

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "Lqd;")
    public static class40 field5286 = field5293;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Lqd;")
    public static class40 field5274 = field5293;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Lce;")
    public static class239 field5287;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Z", line = 14)
    public final boolean method2159(int arg0, int arg1) {
        field5282++;
        if (arg0 != -1) {
            method2162((byte) -53);
        }
        return (this.field5281[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V", line = 34)
    public static final void method2160(int arg0, int arg1, int arg2) {
        class177 var3 = class177.method1310(122, 12, arg2);
        var3.method1302(arg1 ^ 0x4E47);
        var3.field2908 = arg0;
        field5278++;
        if (arg1 != -1) {
            field5276 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLrb;I)Lqd;", line = 47)
    public static final class40 method2161(boolean arg0, class213 arg1, int arg2) {
        field5280++;
        if (!class76.method561(127, arg2, client.method1720(arg1)) && arg1.field3542 == null) {
            return null;
        } else if (arg1.field3432 == null || arg1.field3432.length <= arg2 || arg1.field3432[arg2] == null || arg1.field3432[arg2].method364(-91).method350(arg0) == 0) {
            return class126.field2176 ? class153.method1192(new class40[] { class213.field3450, class276.method1927((byte) -90, arg2) }, (byte) -20) : null;
        } else {
            if (!arg0) {
                field5288 = (class40) null;
            }
            return arg1.field3432[arg2];
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 83)
    public static void method2162(byte arg0) {
        field5287 = null;
        field5293 = null;
        field5274 = null;
        field5276 = null;
        if (arg0 != 6) {
            field5274 = (class40) null;
        }
        field5283 = null;
        field5288 = null;
        field5273 = null;
        field5289 = null;
        field5286 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)I", line = 106)
    public final int method2163(byte arg0, int arg1) {
        field5284++;
        int var3 = 50 % ((70 - arg0) / 49);
        return this.field5281[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIIIII)V", line = 154)
    public static final void method2164(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5290++;
        if (arg0 != 105) {
            return;
        }
        if (arg3 == arg5) {
            class48.method429((byte) -110, arg5, arg1, arg4, arg2);
        } else if (class125.field2164 <= arg2 - arg5 && arg2 + arg5 <= class48.field941 && arg1 - arg3 >= class220.field3664 && (arg1 + arg3) <= class72.field1275) {
            class301.method2052(-1, arg1, arg2, arg5, arg4, arg3);
        } else {
            class80.method605(arg4, arg1, arg0 ^ 0xFFFFFB57, arg2, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)V", line = 179)
    public static final void method2165(int arg0, boolean arg1) {
        field5277++;
        class39.field705.method1348(0, arg0);
        if (!arg1) {
            method2165(-17, true);
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I)V", line = 188)
    public class313(int arg0) {
        this.field5275 = arg0;
        this.field5291 = new class40[this.field5275];
        this.field5295 = new int[this.field5275];
        this.field5292 = new short[this.field5275];
        this.field5281 = new byte[this.field5275];
        this.field5272 = new short[this.field5275];
    }
}
