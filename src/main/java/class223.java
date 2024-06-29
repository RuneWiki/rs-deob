import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class223 {

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "Ljava/lang/String;")
    private String field3189 = "null";

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "[I")
    public static int[] field3172 = new int[4096];

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Z")
    public static volatile boolean field3175 = false;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "Ldi;")
    public static class83 field3182 = new class83(28, 2);

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "C")
    public char field3188;

    @OriginalMember(owner = "client!vu", name = "t", descriptor = "C")
    public char field3191;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
    private int field3185;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!vu", name = "s", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "Lmn;")
    public class247 field3174;

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "Lmn;")
    private class247 field3176;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)I", line = 4)
    public final int method1382(int arg0, byte arg1) {
        field3173++;
        if (this.field3174 == null) {
            return this.field3185;
        } else if (arg1 > -7) {
            return -12;
        } else {
            class500 var3 = (class500) this.field3174.method1492((long) arg0, 6340);
            return var3 == null ? this.field3185 : var3.field7369;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V", line = 25)
    private final void method1383(byte arg0) {
        field3186++;
        this.field3176 = new class247(this.field3174.method1491((byte) 108));
        if (arg0 < -60) {
            for (class450 var2 = (class450) this.field3174.method1494(0); var2 != null; var2 = (class450) this.field3174.method1493((byte) 119)) {
                class511 var3 = new class511(var2.field6619, (int) var2.field3615);
                this.field3176.method1487(-82, class176.method1133(0, var2.field6619), var3);
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)Z", line = 54)
    public final boolean method1384(int arg0, int arg1) {
        field3183++;
        if (this.field3174 == null) {
            return false;
        }
        if (arg0 != 4096) {
            this.field3188 = 'p';
        }
        if (this.field3176 == null) {
            this.method1389((byte) 116);
        }
        class500 var3 = (class500) this.field3176.method1492((long) arg1, 6340);
        return var3 != null;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "([Ljava/lang/Object;[JZ)V", line = 76)
    public static final void method1385(Object[] arg0, long[] arg1, boolean arg2) {
        if (!arg2) {
            field3177 = 118;
        }
        field3180++;
        class217.method1348(arg0, arg1.length - 1, (byte) 43, 0, arg1);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 90)
    public final boolean method1386(byte arg0, String arg1) {
        field3178++;
        if (this.field3174 == null) {
            return false;
        }
        if (this.field3176 == null) {
            this.method1383((byte) -121);
        }
        if (arg0 != -86) {
            this.field3191 = 'U';
        }
        for (class511 var3 = (class511) this.field3176.method1492(class176.method1133(arg0 ^ 0xFFFFFFAA, arg1), arg0 ^ 0xFFFFE76E); var3 != null; var3 = (class511) this.field3176.method1488(1)) {
            if (var3.field7571.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)Ljava/lang/String;", line = 123)
    public final String method1387(int arg0, int arg1) {
        field3179++;
        if (this.field3174 == null) {
            return this.field3189;
        } else if (arg0 == 17489) {
            class450 var3 = (class450) this.field3174.method1492((long) arg1, 6340);
            return var3 == null ? this.field3189 : var3.field6619;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V", line = 151)
    public static void method1388(int arg0) {
        field3172 = null;
        field3182 = null;
        if (arg0 != 3) {
            method1385(null, null, true);
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V", line = 163)
    private final void method1389(byte arg0) {
        this.field3176 = new class247(this.field3174.method1491((byte) 74));
        field3187++;
        if (arg0 != 116) {
            this.method1383((byte) 90);
        }
        for (class500 var2 = (class500) this.field3174.method1494(arg0 - 116); var2 != null; var2 = (class500) this.field3174.method1493((byte) 122)) {
            class500 var3 = new class500((int) var2.field3615);
            this.field3176.method1487(-114, (long) var2.field7369, var3);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLsi;)V", line = 188)
    public final void method1390(byte arg0, class391 arg1) {
        field3184++;
        if (arg0 != 24) {
            this.method1386((byte) -109, null);
        }
        while (true) {
            int var3 = arg1.method2348(-2);
            if (var3 == 0) {
                return;
            }
            this.method1391((byte) -97, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLsi;I)V", line = 211)
    private final void method1391(byte arg0, class391 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3188 = class52.method452(30668, arg1.method2337(-1));
        } else if (arg2 == 2) {
            this.field3191 = class52.method452(30668, arg1.method2337(-1));
        } else if (arg2 == 3) {
            this.field3189 = arg1.method2347((byte) 114);
        } else if (arg2 == 4) {
            this.field3185 = arg1.method2361((byte) -56);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method2353((byte) 78);
            this.field3174 = new class247(class508.method3034(var4, true));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2361((byte) -56);
                class260 var7;
                if (arg2 == 5) {
                    var7 = new class450(arg1.method2347((byte) 67));
                } else {
                    var7 = new class500(arg1.method2361((byte) -56));
                }
                this.field3174.method1487(arg0, (long) var6, var7);
            }
        }
        field3181++;
        if (arg0 != -97) {
            method1388(-121);
        }
    }
}
