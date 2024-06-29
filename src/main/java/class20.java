import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public abstract class class20 extends class42 {

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "[I")
    public int[] field216;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIBILjava/awt/Graphics;)V")
    public abstract void method110(int arg0, int arg1, int arg2, byte arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public abstract void method111(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
    public static final void method112(byte arg0) {
        if (class269.field4057 <= 0) {
            class504.field7294 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class290.field4298.length; var2++) {
                if (class290.field4298[var2].startsWith("--> ")) {
                    int var10000 = ~class269.field4057;
                    var1++;
                    if (var10000 == ~var1) {
                        class504.field7294 = class290.field4298[var2].substring(4);
                        break;
                    }
                }
            }
        }
        if (arg0 == 2) {
            field217++;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
    public abstract void method113(byte arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IJZIZZILjava/lang/String;Ljava/lang/String;II)V")
    public static final void method114(int arg0, long arg1, boolean arg2, int arg3, boolean arg4, boolean arg5, int arg6, String arg7, String arg8, int arg9, int arg10) {
        field215++;
        if (!class248.field3714 && class430.field6184 < 500 && arg2) {
            int var12 = arg6 == -1 ? class276.field4122 : arg6;
            class341 var13 = new class341(arg8, arg7, var12, arg0, arg9, arg1, arg3, arg10, arg5, arg4);
            class258.field3829.method866((byte) 10, var13);
            class430.field6184++;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(BIIZ)Ljava/lang/String;")
    public static final String method115(byte arg0, int arg1, int arg2, boolean arg3) {
        field218++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg3 && arg1 >= 0) {
            int var4 = 2;
            int var5 = arg1 / arg2;
            if (arg0 <= 109) {
                method112((byte) -88);
            }
            while (var5 != 0) {
                var5 /= arg2;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg2;
                int var9 = var8 - (arg1 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg2);
        }
    }
}
