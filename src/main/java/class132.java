import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class132 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field1836 = 0;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Z")
    public static final boolean method839(int arg0) {
        field1838++;
        if (arg0 != -9463) {
            field1836 = -109;
        }
        if (class48.field695) {
            try {
                if ((Boolean) class172.method1097("showingVideoAd", true, class45.field667.field744)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lnh;ZBILnh;)Lel;")
    public static final class82 method840(class305 arg0, boolean arg1, byte arg2, int arg3, class305 arg4) {
        field1839++;
        boolean var5 = true;
        int[] var6 = arg4.method2071(arg2 + 4840, arg3);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method2063(arg3, var6[var7], (byte) 74);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method2063(0, var9, (byte) 126);
                } else {
                    var10 = arg0.method2063(var9, 0, (byte) 80);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        if (arg2 != 6) {
            method840((class305) null, false, (byte) -69, -42, (class305) null);
        }
        try {
            return new class82(arg4, arg0, arg3, arg1);
        } catch (Exception var11) {
            return null;
        }
    }
}
