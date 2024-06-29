import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class111 {

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "[[I")
    public static int[][] field1812 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "B")
    public byte field1815;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public int field1814;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Ljava/lang/String;")
    public String field1813;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "Ljava/lang/String;")
    public String field1817;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "Ljava/lang/String;")
    public String field1819;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 6)
    public static final String method841(int arg0, long arg1) {
        field1810++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % (long) arg0) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class267.field4472[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BJ)V", line = 55)
    public static final void method842(byte arg0, long arg1) {
        if (!class336.field5314) {
            class84.field1426 += (float) arg1 * class357.field5652 / 40.0F;
            class261.field4396 += (float) arg1 * class259.field4357 / 40.0F;
        }
        field1816++;
        int var3 = class313.field4981 + class6.field55.field3577;
        int var4 = class6.field55.field3511 + class245.field4024;
        if ((class282.field4621 - var3) < -500 || class282.field4621 - var3 > 500 || class206.field3259 - var4 < -500 || (class206.field3259 - var4) > 500) {
            class282.field4621 = var3;
            class206.field3259 = var4;
        }
        if (class282.field4621 != var3) {
            int var5 = var3 - class282.field4621;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class282.field4621 += var6;
        }
        if (arg0 >= -33) {
            method842((byte) 41, -110L);
        }
        if (class206.field3259 != var4) {
            int var7 = var4 - class206.field3259;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class206.field3259 += var8;
        }
        class29.method178(256);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 159)
    public static void method843(int arg0) {
        field1812 = (int[][]) null;
        if (arg0 <= 125) {
            field1811 = 13;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)I", line = 169)
    public static final int method844(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field1818++;
        if (var4 == 0) {
            return arg0;
        }
        int var5 = -66 / ((arg2 + 59) / 50);
        if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }
}
