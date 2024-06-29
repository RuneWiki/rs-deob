import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class349 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public int field5057;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public int field5058;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public int field5061;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)Z")
    public static final boolean method2153(int arg0, int arg1, int arg2) {
        if (arg2 != -274) {
            method2155(69, 59, -90, null);
        }
        field5056++;
        return class230.method1588(arg0, (byte) 4, arg1) & class49.method550(arg0, (byte) -34, arg1);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)I")
    public static final int method2154(int arg0) {
        if (arg0 < 112) {
            method2155(118, -119, -71, null);
        }
        field5059++;
        int var1 = class572.field8054.method1585(94);
        if (var1 < class412.field6003.length - 1) {
            class572.field8054 = class412.field6003[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILjava/lang/Class;)Lmw;")
    public static final class454 method2155(int arg0, int arg1, int arg2, Class arg3) {
        class40 var4 = class153.field2210[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class106 var5 = var4.field671; var5 != null; var5 = var5.field1641) {
            class454 var6 = var5.field1638;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6524 == arg1 && var6.field6521 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V")
    public static final void method2156(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5060++;
        for (int var5 = arg0; var5 < class28.field407; var5++) {
            Rectangle var6 = class210.field2933[var5];
            if (arg2 < (var6.x + var6.width) && (arg2 + arg4) > var6.x && arg1 < (var6.y + var6.height) && var6.y < arg1 + arg3) {
                class508.field7177[var5] = true;
            }
        }
    }
}
