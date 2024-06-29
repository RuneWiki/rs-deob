import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class501 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field7238 = -1;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field7242 = 0;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBIIII)V")
    public static final void method3017(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 > -15) {
            field7242 = 21;
        }
        if ((arg4 - arg6) >= class147.field1870 && class237.field3019 >= (arg4 + arg6) && class533.field7845 <= arg3 - arg6 && class289.field3694 >= arg3 + arg6) {
            class11.method74(true, arg5, arg6, arg0, arg3, arg4, arg1);
        } else {
            class507.method3044(arg0, arg3, arg4, 0, arg6, arg5, arg1);
        }
        field7239++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BIIII)V")
    public static final void method3018(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -113) {
            field7242 = 64;
        }
        for (int var5 = 0; var5 < class65.field840; var5++) {
            Rectangle var6 = class463.field6651[var5];
            if (arg2 < (var6.x + var6.width) && (arg2 + arg4) > var6.x && var6.y + var6.height > arg3 && (arg3 + arg1) > var6.y) {
                class229.field2928[var5] = true;
            }
        }
        field7243++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
    public static final String method3019(int arg0, String[] arg1, int arg2, int arg3) {
        field7241++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == arg3) {
            String var4 = arg1[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg0;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }
}
