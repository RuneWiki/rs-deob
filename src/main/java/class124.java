import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class124 {

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public int field1916 = -1;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[I")
    public static int[] field1911 = new int[] { 0, -2, 0, 0, 0, 0, 4, 0, 0, 0, 0, 4, 0, 8, 0, 3, 6, 1, 0, 0, 0, 0, -2, 0, 3, 0, 0, 0, 0, 0, 0, 0, -1, 2, 0, 6, -2, -1, 0, 0, 0, 0, 0, 4, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, 10, 6, 0, 0, 0, 0, 0, -1, 6, 0, 0, -2, 0, 0, 5, 0, 5, 6, 0, 5, 0, -1, 7, 0, 0, 0, 0, 0, 0, 15, -2, 0, 0, 4, 6, 4, -2, 5, 0, -2, 3, 0, 0, 14, 0, 1, -2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 5, -1, 0, 0, 1, 2, -2, 1, 0, -2, 0, 0, 9, 0, 0, 10, 0, 7, 0, 0, 0, 0, 0, 2, 0, 0, 0, 3, 5, 0, 6, 8, 2, 0, 0, 4, 0, 6, 0, 0, 0, 0, 6, -2, 0, 0, 0, 2, 0, 6, 0, 0, 0, 0, 8, 0, 1, 0, 0, 3, 0, 0, 0, 0, 24, 3, 0, 0, 0, 0, 0, -1, 0, -1, 15, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 5, 0, -2, 4, -2, 0, 0, 0, 2, 0, 6, 7, 0, 0, 4, 8, 0, 0, 0, 12, 0, 0, 0, 20, 2, 0, -1, 0, 0, 10, 0, 0, 0, 0, 0, -1, 0, 0, -1, 6, 7, 0, 0, 0, 0, 0, 0, -1, 6, 8, 0, 0, 0 };

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[S")
    public static short[] field1915 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1923 = -1;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lrl;")
    public class299 field1914;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[I")
    public int[] field1913;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "[Luf;")
    public class168[] field1920;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([BIZ)I", line = 5)
    public static final int method879(byte[] arg0, int arg1, boolean arg2) {
        if (arg2) {
            method879((byte[]) null, -56, true);
        }
        field1921++;
        return class253.method1735(arg1, 0, arg0, (byte) 94);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;)Luf;", line = 17)
    public static final class168 method880(int arg0, String arg1) {
        field1912++;
        if (arg0 != 15170) {
            method884((byte) -98);
        }
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class168 var4 = new class168();
        var4.field2716 = var2;
        var4.field2692 = 0;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field2692++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V", line = 52)
    public static void method881(int arg0) {
        field1915 = null;
        field1911 = null;
        if (arg0 != -19129) {
            method883(false, 26);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V", line = 66)
    public static final void method882(int arg0, int arg1) {
        class145.field2240.method1428(arg0, 29946);
        class285.field4821.method1428(arg0, 29946);
        field1924++;
        int var2 = 116 / ((arg1 + 42) / 42);
        class132.field2043.method1428(arg0, 29946);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V", line = 88)
    public static final void method883(boolean arg0, int arg1) {
        int var2 = 1 % ((arg1 + 28) / 55);
        field1918++;
        class155.field2440 = arg0;
        class175.field2829 = !class155.method1102(127);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 106)
    public static final void method884(byte arg0) {
        if (arg0 != 46) {
            return;
        }
        class91.field1395.method1429((byte) 120);
        field1917++;
        class143.field2204.method1429((byte) 120);
        class79.field1126.method1429((byte) 120);
        class77.field1036.method1429((byte) 120);
    }
}
