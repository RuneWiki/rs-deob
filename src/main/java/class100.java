import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class100 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1522;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
    public static final String method765(boolean arg0, int arg1, int arg2, int arg3) {
        field1523++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg0 && arg3 >= 0) {
            int var4 = 2;
            for (int var5 = arg3 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[arg2] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg1;
                int var9 = var8 - (arg1 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lhd;I)Lhd;")
    public abstract class213 method766(class213 arg0, int arg1);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method767(int arg0) {
        if (arg0 > -70) {
            field1522 = null;
        }
        field1522 = null;
    }
}
