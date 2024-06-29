import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class94 extends class6 {

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "Z")
    public static boolean field1404 = false;

    @OriginalMember(owner = "client!bi", name = "kb", descriptor = "I")
    public static int field1406 = 0;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "[Lsg;")
    public static class166[] field1399;

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "[Lsi;")
    public static class204[] field1403;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "[[[B")
    public static byte[][][] field1402;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Lcl;")
    public static final class200 method736(int arg0, int arg1) {
        ++field1401;
        class200 var2 = (class200) class73.field1053.method310(-24190, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class229.field3696.method643(arg1, arg0, false);
            class200 var4 = new class200();
            if (var3 != null) {
                var4.method1473(new class152(var3), -1);
            }
            class73.field1053.method312((long) arg1, var4, (byte) -41);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method737(byte arg0, String arg1) throws ClassNotFoundException {
        if (arg0 > -119) {
            return null;
        } else {
            ++field1400;
            if (arg1.equals("B")) {
                return Byte.TYPE;
            } else if (arg1.equals("I")) {
                return Integer.TYPE;
            } else if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Lij;")
    public static final class201 method738(int arg0, int arg1, int arg2) {
        class201 var3 = (class201) class160.field2624.method1034((long) arg2 << 32 | (long) arg1, (byte) 21);
        if (arg0 > -50) {
            field1404 = false;
        }
        if (var3 == null) {
            var3 = new class201(arg2, arg1);
            class160.field2624.method1032(false, var3, var3.field4459);
        }
        ++field1405;
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        int[][] var3 = super.field1211.method193((byte) -124, arg0);
        if (super.field1211.field321 && this.method38((byte) -44)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = arg0 % super.field54 * super.field54;
            int[] var7 = var3[1];
            for (int var8 = 0; ~class20.field221 < ~var8; ++var8) {
                int var9 = super.field55[var8 % super.field50 + var6];
                var5[var8] = class179.method1337(var9 << 4, 4080);
                var7[var8] = class179.method1337(var9 >> 4, 4080);
                var4[var8] = class179.method1337(16711680, var9) >> 12;
            }
        }
        ++field1398;
        if (arg1 != -18) {
            method738(-127, 118, 60);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)V")
    public static void method739(int arg0) {
        field1402 = null;
        field1403 = null;
        field1399 = null;
        if (arg0 != 4080) {
            field1403 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)Z")
    public static final boolean method740(byte arg0) {
        ++field1397;
        if (arg0 < 80) {
            field1399 = null;
        }
        try {
            if (class145.field2379 == 2) {
                if (class67.field994 == null) {
                    class67.field994 = class237.method1668(class225.field3618, class141.field2280, class27.field312);
                    if (class67.field994 == null) {
                        return false;
                    }
                }
                if (class46.field661 == null) {
                    class46.field661 = new class242(class132.field2178, class67.field996);
                }
                if (class254.field4191.method1706(true, class209.field3352, 22050, class46.field661, class67.field994)) {
                    class254.field4191.method1730((byte) -111);
                    class254.field4191.method1714(class266.field4302, (byte) -82);
                    class254.field4191.method1703(class67.field994, -12540, class242.field3869);
                    class145.field2379 = 0;
                    class225.field3618 = null;
                    class67.field994 = null;
                    class46.field661 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class254.field4191.method1738(-122);
            class145.field2379 = 0;
            class46.field661 = null;
            class67.field994 = null;
            class225.field3618 = null;
        }
        return false;
    }
}
