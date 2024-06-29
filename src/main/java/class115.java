import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class115 implements class58 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Ldf;")
    public static class51 field1949 = class46.method233(":assist:", 100);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1954 = 100;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Ldf;")
    public static class51 field1960 = class46.method233("www", 100);

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[I")
    public static int[] field1955 = new int[1000];

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Ldf;")
    public static class51 field1957 = class46.method233("<col=ffff00>", 100);

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lu;")
    public static class111 field1950;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "[I")
    public static int[] field1952;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B[IIJ)Ldf;")
    public final class51 method369(byte arg0, int[] arg1, int arg2, long arg3) {
        field1951++;
        if (arg2 == 0) {
            class52 var6 = class49.method252(-1, arg1[0]);
            return var6.method334((int) arg3, (byte) 41);
        } else if (arg2 == 1 || arg2 == 10) {
            class222 var7 = class219.method1508((int) arg3, (byte) -61);
            return var7.field3907;
        } else {
            if (arg0 != 34) {
                field1950 = null;
            }
            return arg2 == 6 || arg2 == 7 ? class49.method252(arg0 - 35, arg1[0]).method334((int) arg3, (byte) 41) : null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Ldi;")
    public static final class166 method843(byte arg0, int arg1) {
        field1958++;
        class166 var2 = (class166) class89.field1477.method1357((byte) 65, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class24.field361.method828(16, (byte) 107, arg1);
        class166 var4 = new class166();
        if (var3 != null) {
            var4.method1159(new class121(var3), 56);
        }
        class89.field1477.method1351(var4, 2, (long) arg1);
        if (arg0 != -51) {
            field1949 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILu;II)Ljg;")
    public static final class158 method844(int arg0, class111 arg1, int arg2, int arg3) {
        field1959++;
        if (arg3 >= -127) {
            return null;
        } else if (class69.method480(arg2, 57, arg0, arg1)) {
            return class3.method11(108);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
    public static void method845(boolean arg0) {
        field1957 = null;
        field1960 = null;
        field1950 = null;
        field1952 = null;
        field1949 = null;
        if (arg0) {
            field1955 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static final void method846(int arg0) {
        field1956++;
        if (arg0 <= -97) {
            class95.field1575.method424((byte) 75, 83);
            class252.field4432++;
            class95.field1575.method885(0L, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Lvf;")
    public static final class95 method847(int arg0, int arg1) {
        field1961++;
        class95 var2 = (class95) class80.field1290.method1357((byte) -88, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class77.field1233.method828(4, (byte) 118, arg0);
        if (arg1 < 107) {
            field1949 = null;
        }
        class95 var4 = new class95();
        if (var3 != null) {
            var4.method706(new class121(var3), arg0, 110);
        }
        class80.field1290.method1351(var4, 2, (long) arg0);
        return var4;
    }
}
