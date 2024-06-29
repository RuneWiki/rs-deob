import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class396 {

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[I")
    public static int[] field5035 = new int[500];

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lju;")
    public static class115 field5036 = new class115();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2239(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field5034++;
            return arg0 == 0 || arg0 == 2 || arg0 == 4;
        }
    }

    @OriginalMember(owner = "client!q", name = "G", descriptor = "(III)V")
    public abstract void method588(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method2240(long arg0, byte arg1) {
        field5031++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else if (arg1 >= -121) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class680.field9257[(int) (var7 - (arg0 * 37L))];
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

    @OriginalMember(owner = "client!q", name = "R", descriptor = "(III[I)V")
    public abstract void method574(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "ra", descriptor = "(I)V")
    public abstract void method593(int arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method584();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method2241(int arg0, int arg1, Random arg2) {
        field5032++;
        if (arg1 <= arg0) {
            throw new IllegalArgumentException();
        } else if (class182.method1084((byte) 87, arg1)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class99.method726(var4, arg1, true);
        }
    }

    @OriginalMember(owner = "client!q", name = "GA", descriptor = "(III)V")
    public abstract void method591(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method2242(int arg0) {
        field5036 = null;
        field5035 = null;
        if (arg0 != 8975) {
            method2243(-77, 34, 57, -123, -23, 116);
        }
    }

    @OriginalMember(owner = "client!q", name = "la", descriptor = "(Lq;)V")
    public abstract void method583(class396 arg0);

    @OriginalMember(owner = "client!q", name = "P", descriptor = "(I)V")
    public abstract void method589(int arg0);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public abstract void method573(int arg0);

    @OriginalMember(owner = "client!q", name = "pa", descriptor = "(IIIIII)V")
    public abstract void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class188.field2224[arg0][var8][var14] == -class58.field745) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class480.field5972) + 1;
            int var10 = (arg3 << class480.field5972) + 2;
            int var11 = class299.field3801[arg0].method201(arg1, arg3) + arg5;
            if (!class224.method1354(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class480.field5972) - 1;
            if (!class224.method1354(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class480.field5972) - 1;
            if (!class224.method1354(var9, var11, var13)) {
                return false;
            } else if (class224.method1354(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class294.method1773(arg0, arg1, arg3)) {
            int var6 = arg1 << class480.field5972;
            int var7 = arg3 << class480.field5972;
            return class224.method1354(var6 + 1, class299.field3801[arg0].method201(arg1, arg3) + arg5, var7 + 1) && class224.method1354(class97.field1256 + var6 - 1, class299.field3801[arg0].method201(arg1 + 1, arg3) + arg5, var7 + 1) && class224.method1354(class97.field1256 + var6 - 1, class299.field3801[arg0].method201(arg1 + 1, arg3 + 1) + arg5, class97.field1256 + var7 - 1) && class224.method1354(var6 + 1, class299.field3801[arg0].method201(arg1, arg3 + 1) + arg5, class97.field1256 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)Ljava/lang/String;")
    public static final String method2244(int arg0) {
        field5033++;
        if (arg0 != 1) {
            method2240(1L, (byte) -27);
        }
        return class367.field4752 || class67.field817 == null ? "" : class67.field817.field6243;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class396 method576();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public abstract void method580(int arg0);

    @OriginalMember(owner = "client!q", name = "S", descriptor = "(I)V")
    public abstract void method579(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static final void method2245(byte arg0) {
        field5037++;
        if (arg0 != -1) {
            return;
        }
        class55.field707.method3699((byte) 77);
        class329.field4092.method46(975653767);
        class124.field1510.method3568((byte) -69);
        class232.field3017.method2356(arg0);
        class46.field620.method3769(-101);
        class504.field6287.method1629((byte) 83);
        class11.field110.method1135((byte) -90);
        class339.field4336.method2159(~arg0);
        class392.field5013.method1356(false);
        class185.field2186.method2092(103);
        class510.field6389.method2904(64);
        class93.field1189.method1005((byte) -45);
        class530.field6699.method92(-12725);
        class434.field5475.method157(9012);
        class46.field617.method1407(-1);
        class7.field77.method1036(~arg0);
        class671.field9178.method2834(arg0 + 1);
        class558.field6987.method2543(-7472);
        class151.field1801.method3559((byte) -48);
        class96.field1247.method837((byte) -125);
        class53.method305(false);
        class111.method771(0);
        class107.method750((byte) 113);
        class670.method3720((byte) 16);
        class532.method2870(105);
        class38.field565.method1224(false);
        class550.field6905.method1224(false);
        class222.field2583.method1224(false);
        class444.field5589.method1224(false);
        class620.field8415.method1224(false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method582(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "O", descriptor = "([I)V")
    public abstract void method578(int[] arg0);
}
