import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class111 extends class429 {

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Z")
    public boolean field1360 = false;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "S")
    public short field1366;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1363 = "";

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lea;")
    public static class474 field1361 = new class474(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "Lhb;")
    public static class629 field1369 = new class629(6, 14);

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 7)
    public static final String method684(int arg0, long arg1) {
        field1367++;
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
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class216.field2980[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(arg0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V", line = 57)
    public static void method685(byte arg0) {
        field1369 = null;
        if (arg0 <= -90) {
            field1361 = null;
            field1363 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V", line = 70)
    public static final void method686(int arg0, int arg1) {
        field1364++;
        class467 var2 = class541.method3144(arg1, (byte) -89, 9);
        int var3 = -18 / ((55 - arg0) / 55);
        var2.method2852(0);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIZZ)V", line = 102)
    public class111(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field1366 = (short) arg3;
        this.field1368 = arg0;
        this.field1365 = arg2;
        this.field1362 = arg1;
        this.field1360 = arg5;
    }
}
