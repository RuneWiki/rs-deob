import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class73 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1064 = new CRC32();

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "[I")
    public static int[] field1075 = new int[128];

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "[[Lpb;")
    public static class2[][] field1070;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 5)
    public static void method602(int arg0) {
        if (arg0 != 7843) {
            method604(-66, (byte) 56);
        }
        field1070 = (class2[][]) null;
        field1064 = null;
        field1075 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V", line = 18)
    public static final void method603(int arg0, int arg1) {
        if (arg0 < -124) {
            field1068++;
            if (class256.method1887(arg1, -1)) {
                class137.method971(-1, class119.field1677[arg1], (byte) -12);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Lbn;", line = 38)
    public static final class241 method604(int arg0, byte arg1) {
        field1071++;
        class241 var2 = (class241) class241.field3591.method461((byte) 120, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 68) {
            method608(28, 121, 75);
        }
        byte[] var3 = class20.field312.method2520(1, arg0, (byte) -25);
        class241 var4 = new class241();
        var4.field3590 = arg0;
        if (var3 != null) {
            var4.method1775((byte) 63, new class190(var3));
        }
        var4.method1777(0);
        if (var4.field3592 == 2 && class184.field2646.method1405((long) arg0, false) == null) {
            class184.field2646.method1400((long) arg0, 115, new class35(class18.field290));
            class117.field1655[class18.field290++] = var4;
        }
        class241.field3591.method460(var4, -26089, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/StringBuffer;IIC)Ljava/lang/StringBuffer;", line = 78)
    public static final StringBuffer method605(StringBuffer arg0, int arg1, int arg2, char arg3) {
        field1066++;
        int var4 = arg0.length();
        arg0.setLength(arg1);
        for (int var5 = var4; var5 < arg1; var5++) {
            arg0.setCharAt(var5, arg3);
        }
        if (arg2 < 7) {
            field1070 = (class2[][]) ((class2[][]) null);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([BI)Lvf;", line = 102)
    public static final class42 method606(byte[] arg0, int arg1) {
        field1067++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -1) {
            method606((byte[]) null, -124);
        }
        class42 var2 = new class42(arg0, class199.field2896, class160.field2319, class59.field871, class225.field3397, class225.field3385);
        class321.method2235(-2182);
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)I", line = 121)
    public static final int method607(int arg0, byte arg1, int arg2) {
        field1065++;
        class206 var3 = (class206) class135.field1968.method1405((long) arg2, false);
        if (var3 == null) {
            return 0;
        }
        if (arg1 > -45) {
            method605((StringBuffer) null, 20, 6, '7');
        }
        if (arg0 == -1) {
            return 0;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field3014.length; var5++) {
            if (var3.field3008[var5] == arg0) {
                var4 += var3.field3014[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V", line = 163)
    public static final void method608(int arg0, int arg1, int arg2) {
        field1072++;
        if (arg2 > 33) {
            class95 var3 = class227.method1699(12, -1855723168, arg0);
            var3.method738((byte) 111);
            var3.field1328 = arg1;
        }
    }
}
