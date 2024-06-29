import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class222 {

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[F")
    public static float[] field3138 = new float[4];

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lup;")
    public static class171 field3144;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Las;")
    public static class100 field3135;

    static {
        new class194(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field3144 = new class171();
        field3145 = 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1372(boolean arg0) {
        field3144 = null;
        field3138 = null;
        if (!arg0) {
            field3145 = 80;
        }
        field3135 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIII)Z", line = 16)
    public static final boolean method1373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3133++;
        if (arg4 != 0) {
            method1376(78, (byte) -68);
        }
        if (arg0 + arg2 > arg6 && arg2 < (arg5 + arg6)) {
            return arg3 < arg1 + arg7 && arg1 < (arg3 + arg8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
    public final String toString() {
        field3134++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 48)
    public static final String method1374(long arg0, byte arg1) {
        field3139++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            int var4 = 36 % ((arg1 + 39) / 58);
            long var5 = arg0;
            while (var5 != 0L) {
                var5 /= 37L;
                var3++;
            }
            StringBuffer var7 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var7.append(class486.field7056[(int) (var8 - (arg0 * 37L))]);
            }
            return var7.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZB)Z", line = 90)
    public static final boolean method1375(boolean arg0, byte arg1) {
        field3143++;
        boolean var2 = class481.field6937.method822();
        if (arg1 > -82) {
            return true;
        } else if (var2 == arg0) {
            return true;
        } else {
            if (!arg0) {
                class481.field6937.method732();
            } else if (!class481.field6937.method765()) {
                arg0 = false;
            }
            if (var2 == arg0) {
                return false;
            } else {
                class118.field1533.field6898 = arg0;
                class118.field1533.method2960(112, class86.field1182);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)V", line = 131)
    public static final void method1376(int arg0, byte arg1) {
        field3136++;
        class338 var2 = class380.method2294((byte) 68, arg0, 10);
        if (arg1 != 50) {
            field3135 = null;
        }
        var2.method2048(123);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IIII)V", line = 151)
    public class222(int arg0, int arg1, int arg2, int arg3) {
        this.field3142 = arg0;
        this.field3141 = arg1;
        this.field3140 = arg3;
        this.field3137 = arg2;
    }
}
