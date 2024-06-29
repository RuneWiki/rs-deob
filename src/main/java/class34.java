import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class34 extends class288 {

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Ljava/lang/String;")
    public String field398;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Ljava/util/Calendar;")
    public static Calendar field396 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field400 = -1;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZBII)V")
    public static final void method212(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field397++;
        class146.field2152 = 0L;
        int var5 = class285.method1903(32113);
        boolean var6 = false;
        if (arg3 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (arg3 <= 0 == var5 > 0) {
            var6 = true;
        }
        if (class56.field666.startsWith("mac") && arg3 > 0) {
            arg1 = true;
        }
        int var7 = -104 / ((57 - arg2) / 50);
        if (arg1 && arg3 > 0) {
            var6 = true;
        }
        class70.method427(-94, arg3, arg1, var6, arg0, var5, arg4);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)Lml;")
    public static final class13 method213(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field395++;
        long var5 = (long) arg0 & 0xFFFFL | ((long) arg1 & 0xFFFFL) << 32 | (long) arg3 << 48 & 0xFFFFL << 48 | ((long) arg2 & 0xFFFFL) << 16;
        class13 var7 = (class13) class28.field336.method65((byte) -98, var5);
        if (var7 != null) {
            return var7;
        } else if (arg4 >= -112) {
            return null;
        } else {
            class65[] var8 = null;
            class223 var9 = class229.method1488(arg0, false);
            if (var9.field3146 != null) {
                var8 = new class65[var9.field3146.length];
                for (int var10 = 0; var10 < var8.length; var10++) {
                    class276 var11 = class240.method1560(var9.field3146[var10], 10214);
                    var8[var10] = new class65(var11.field4194, var11.field4193, var11.field4202, var11.field4197, var11.field4196, var11.field4198, var11.field4203, var11.field4189);
                }
            }
            class13 var12 = new class13(var9.field3154, var8, var9.field3145, arg3, arg1, arg2);
            class28.field336.method64(var5, -1, var12);
            return var12;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public static void method214(int arg0) {
        field396 = null;
        if (arg0 < 121) {
            field401 = -49;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class34() {
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class34(String arg0, int arg1) {
        this.field398 = arg0;
    }
}
