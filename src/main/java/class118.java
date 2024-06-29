import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class118 {

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1942 = "Loaded title screen";

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1943 = 0;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1937 = 0;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Ld;")
    public static class238 field1940;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
    public static int[] field1939;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[[[I")
    public static int[][][] field1938;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)J")
    public static final long method861(int arg0, int arg1, int arg2) {
        class134 var3 = class288.field4563[arg0][arg1][arg2];
        return var3 == null || var3.field2143 == null ? 0L : var3.field2143.field4372;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static final String method862(boolean arg0, long arg1) {
        field1944++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            if (!arg0) {
                field1937 = -82;
            }
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class7.field91[(int) (var7 - (arg1 * 37L))];
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

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)I")
    public abstract int method863(int arg0, byte arg1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
    public abstract void method864(int arg0, int arg1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Lo;")
    public abstract class248 method865(int arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)V")
    public static final void method866(int arg0, int arg1, byte arg2) {
        field1941++;
        class259 var3 = class213.method1464((byte) -111, arg0, 12);
        var3.method1766(0);
        if (arg2 < 80) {
            method862(false, -71L);
        }
        var3.field4128 = arg1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method867(Component arg0, int arg1) {
        arg0.removeKeyListener(class72.field1188);
        arg0.removeFocusListener(class72.field1188);
        field1936++;
        class85.field1349 = -1;
        int var2 = -19 % ((-arg1 - 39) / 60);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method868(byte arg0) {
        field1938 = null;
        field1939 = null;
        if (arg0 < 95) {
            method866(38, 94, (byte) 10);
        }
        field1940 = null;
        field1942 = null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IB)[B")
    public abstract byte[] method869(int arg0, byte arg1);
}
