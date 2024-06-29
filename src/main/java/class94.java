import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class94 {

    @OriginalMember(owner = "client!cea", name = "i", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!cea", name = "j", descriptor = "I")
    public static int field1398 = 100;

    @OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
    public static int field1402 = -1;

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "F")
    public static float field1395;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!cea", name = "k", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "Lq;")
    public class152 field1394;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "Lcea;")
    public class94 field1390;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)Lcea;", line = 9)
    public final class94 method719(int arg0, int arg1) {
        field1403++;
        if (arg1 != 0) {
            field1402 = -9;
        }
        return new class94(this.field1401, arg0);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 24)
    public static final byte[] method720(String arg0, boolean arg1) {
        field1399++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        } else if (arg1) {
            return null;
        } else {
            int var3 = var2 + 3 & 0xFFFFFFFC;
            int var4 = var3 / 4 * 3;
            if (var3 - 2 >= var2 || class343.method2060(arg0.charAt(var3 - 2), 0) == -1) {
                var4 -= 2;
            } else if (var2 <= (var3 - 1) || class343.method2060(arg0.charAt(var3 - 1), 0) == -1) {
                var4--;
            }
            byte[] var5 = new byte[var4];
            class28.method264(var5, arg0, 117, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZI)V", line = 65)
    public static final void method721(boolean arg0, int arg1) {
        if (arg0) {
            method720(null, true);
        }
        field1404++;
        class449 var2 = class611.method3463(arg1, (byte) -113, 10);
        var2.method2614(103);
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(II)V", line = 82)
    public class94(int arg0, int arg1) {
        this.field1397 = arg1;
        this.field1401 = arg0;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)Lrba;", line = 92)
    public final class102 method722(boolean arg0) {
        if (arg0) {
            this.method722(false);
        }
        field1392++;
        return class648.method3636(this.field1401, arg0);
    }
}
