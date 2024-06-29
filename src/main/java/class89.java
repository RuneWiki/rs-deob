import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class89 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Z")
    public static boolean field1598 = false;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Z")
    public static boolean field1606 = false;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1603 = -1;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lpl;")
    public static class186 field1608 = new class186(64);

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "Lqd;")
    public static class40 field1613 = class147.method1106("titlebg", (byte) -62);

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "Lqd;")
    public static class40 field1612 = class147.method1106("cross", (byte) -124);

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[Leg;")
    public static class291[] field1611 = new class291[0];

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lgl;")
    public static class184 field1610;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lce;")
    public static class239 field1607;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "[[[B")
    public static byte[][][] field1609;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Leg;", line = 10)
    public static final class291 method687(byte arg0) {
        field1602++;
        if (arg0 == 69) {
            return field1611.length > class272.field4521 ? field1611[class272.field4521++] : null;
        } else {
            return (class291) null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)[Lmm;", line = 38)
    public static final class249[] method688(byte arg0) {
        int var1 = 62 % ((arg0 - 66) / 57);
        class249[] var2 = new class249[class121.field2108];
        field1604++;
        for (int var3 = 0; var3 < class121.field2108; var3++) {
            if (class21.field350) {
                var2[var3] = new class79(class102.field1799, class169.field2787, class12.field208[var3], class256.field4265[var3], class102.field1802[var3], class210.field3356[var3], class22.field387[var3], class171.field2797);
            } else {
                var2[var3] = new class114(class102.field1799, class169.field2787, class12.field208[var3], class256.field4265[var3], class102.field1802[var3], class210.field3356[var3], class22.field387[var3], class171.field2797);
            }
        }
        class181.method1324(72);
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZB)V", line = 62)
    public static final void method689(boolean arg0, byte arg1) {
        if (arg1 != -7) {
            field1598 = false;
        }
        field1599++;
        if (class72.field1279 != arg0) {
            class72.field1279 = arg0;
            class280.method1956((byte) -114);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)Z", line = 78)
    public static final boolean method690(int arg0, byte arg1) {
        if (arg1 <= 48) {
            field1612 = (class40) null;
        }
        field1601++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 105)
    public static void method691(int arg0) {
        field1613 = null;
        if (arg0 != -5592) {
            field1612 = (class40) null;
        }
        field1607 = null;
        field1612 = null;
        field1608 = null;
        field1609 = (byte[][][]) null;
        field1611 = null;
        field1610 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 121)
    public static final void method692(int arg0) {
        field1605++;
        if (class10.field161 || class188.field3049 == 2) {
            return;
        }
        try {
            if (arg0 != 27755) {
                method690(45, (byte) 9);
            }
            class162.field2697.method368(class312.field5265, (byte) -80);
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZIFIIII)[I", line = 140)
    public static final int[] method693(int arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5, int arg6, int arg7) {
        field1600++;
        class251 var8 = new class251();
        var8.field4163 = arg0;
        var8.field4164 = arg4;
        var8.field4172 = arg7;
        var8.field4160 = arg5;
        int[] var9 = new int[arg2];
        var8.field4151 = arg1;
        var8.field4167 = (int) (arg3 * 4096.0F);
        var8.method61((byte) 4);
        class57.method480(false, 1, arg2);
        var8.method1776(0, var9, -1522113588);
        int var10 = 6 % ((arg6 - 49) / 60);
        return var9;
    }
}
