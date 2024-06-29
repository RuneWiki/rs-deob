import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class163 {

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Ljk;")
    private class449 field2070 = new class449(256);

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lqn;")
    private class47 field2068;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field2065 = 0;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field2066 = -1;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "Z")
    public static boolean field2075 = false;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Lup;")
    public static class181 field2073 = new class181(7, 16);

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "[I")
    public static int[] field2076 = new int[14];

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 3)
    public final void method1044(byte arg0) {
        class449 var2 = this.field2070;
        synchronized (this.field2070) {
            this.field2070.method2642(0);
        }
        field2074++;
        int var3 = 85 / ((arg0 + 68) / 38);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([BB)Z", line = 16)
    public static final boolean method1045(byte[] arg0, byte arg1) {
        field2062++;
        class463 var2 = new class463(arg0);
        int var3 = var2.method2737(false);
        if (var3 != 2) {
            return false;
        } else if (arg1 == -4) {
            boolean var4 = var2.method2737(false) == 1;
            if (var4) {
                class496.method2997((byte) -48, var2);
            }
            class414.method2447(var2, 60);
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V", line = 46)
    public final void method1046(int arg0, int arg1) {
        class449 var3 = this.field2070;
        synchronized (this.field2070) {
            if (arg0 <= 108) {
                this.field2068 = null;
            }
            this.field2070.method2648(false, arg1);
        }
        field2071++;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V", line = 61)
    public static void method1047(byte arg0) {
        if (arg0 <= 43) {
            field2073 = null;
        }
        field2073 = null;
        field2076 = null;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)Lbb;", line = 76)
    public final class219 method1048(int arg0, int arg1) {
        field2069++;
        class449 var3 = this.field2070;
        class219 var4;
        synchronized (this.field2070) {
            var4 = (class219) this.field2070.method2647(arg0 - 133, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field2068;
        byte[] var6;
        synchronized (this.field2068) {
            var6 = this.field2068.method481(arg0, arg1, -128);
        }
        class219 var7 = new class219();
        if (var6 != null) {
            var7.method1348(new class463(var6), (byte) -94);
        }
        class449 var8 = this.field2070;
        synchronized (this.field2070) {
            this.field2070.method2635((long) arg1, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 103)
    public static final String method1049(int arg0, long arg1) {
        field2067++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (arg0 > -11) {
                return null;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class506.field7285[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)V", line = 154)
    public final void method1050(byte arg0) {
        field2063++;
        int var2 = 51 % ((-arg0 - 59) / 35);
        class449 var3 = this.field2070;
        synchronized (this.field2070) {
            this.field2070.method2640(111);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 169)
    public static final String method1051(String arg0, int arg1) {
        field2064++;
        if (arg1 != 21670) {
            field2066 = 122;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZBIII)V", line = 226)
    public static final void method1052(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2072++;
        class356.field4576 = 0L;
        int var5 = class191.method1184(false);
        if (arg4 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (arg1 > 39) {
            if (!class33.field416.method339()) {
                arg0 = true;
            }
            class63.method573(var5, arg0, arg3, arg2, -4, arg4);
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lae;ILqn;)V", line = 255)
    public class163(class165 arg0, int arg1, class47 arg2) {
        this.field2068 = arg2;
        this.field2068.method469(30322, 26);
    }
}
