import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class125 implements class299 {

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field2075 = 0;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Lve;")
    private static class255 field2080 = class87.method607(25, " from your ignore list first)3");

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Lve;")
    public static class255 field2073 = field2080;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Lve;")
    private static class255 field2081 = class87.method607(117, " is already on your ignore list)3");

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Lve;")
    public static class255 field2072 = field2081;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field2082 = 0;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "J")
    public static long field2077 = 0L;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field2084 = 0;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lrg;")
    public static class88 field2083;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "[I")
    public static int[] field2079;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[[S")
    public static short[][] field2078;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Z", line = 12)
    public static final boolean method922(int arg0, int arg1) {
        field2074++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = 46 / ((28 - arg1) / 48);
        int var3 = class264.field4466[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        return var3 == 1002;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIII)V", line = 37)
    public static final void method923(byte arg0, int arg1, int arg2, int arg3) {
        field2076++;
        class53 var4 = class303.method2112(-1155040160, arg1, 9);
        if (arg0 > -85) {
            field2082 = -60;
        }
        var4.method325((byte) 100);
        var4.field819 = arg3;
        var4.field824 = arg2;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 51)
    public static void method924(int arg0) {
        field2078 = (short[][]) null;
        field2083 = null;
        if (arg0 > -97) {
            method922(62, 96);
        }
        field2081 = null;
        field2080 = null;
        field2073 = null;
        field2072 = null;
        field2079 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([IJIB)Lve;", line = 85)
    public final class255 method925(int[] arg0, long arg1, int arg2, byte arg3) {
        field2085++;
        if (arg2 == 0) {
            class51 var7 = class130.method960(arg0[0], 48000);
            return var7.method307((int) arg1, (byte) -104);
        } else if (arg2 == 1 || arg2 == 10) {
            class192 var6 = class132.method990((byte) -119, (int) arg1);
            return var6.field3112;
        } else if (arg2 == 6 || arg2 == 7) {
            return class130.method960(arg0[0], 48000).method307((int) arg1, (byte) -123);
        } else {
            if (arg3 != 76) {
                method924(-114);
            }
            return null;
        }
    }
}
