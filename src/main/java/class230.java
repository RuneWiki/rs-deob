import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class230 {

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "Lfe;")
    public static class384 field3213 = new class384(8);

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "[I")
    public static int[] field3218 = new int[25];

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "Ltq;")
    public static class426 field3219;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "[I")
    public static int[] field3223;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "Lum;")
    public static class347 field3220;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3224;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field3222;

    static {
        new class194("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field3219 = new class426(10, 6);
        field3223 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
        field3220 = new class347();
        field3224 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILeq;)V", line = 5)
    public static final void method1401(int arg0, class134 arg1) {
        field3216++;
        if (class270.field3778 != class415.field6145.field2956 && class358.field5312 != null && arg0 == 3 && class506.method3044(-118, class415.field6145.field2956, arg1)) {
            class270.field3778 = class415.field6145.field2956;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BIIIII)V", line = 26)
    public static final void method1402(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3214++;
        int var6 = arg3 - arg2;
        int var7 = arg4 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class318.method1918(arg2, -47, arg5, arg4, arg1);
            }
        } else if (var7 == 0) {
            class358.method2174(arg2, arg1, arg3, arg5, false);
        } else {
            if (arg0 != -121) {
                method1401(-97, null);
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class473.field6839) {
                var11 = class473.field6839;
                var10 = (class473.field6839 * var8 >> 12) + var9;
            } else if (class63.field933 < arg2) {
                var10 = (class63.field933 * var8 >> 12) + var9;
                var11 = class63.field933;
            } else {
                var10 = arg5;
                var11 = arg2;
            }
            int var12;
            int var13;
            if (arg3 < class473.field6839) {
                var13 = (class473.field6839 * var8 >> 12) + var9;
                var12 = class473.field6839;
            } else if (class63.field933 >= arg3) {
                var12 = arg3;
                var13 = arg4;
            } else {
                var12 = class63.field933;
                var13 = (class63.field933 * var8 >> 12) + var9;
            }
            if (class7.field131 > var13) {
                var13 = class7.field131;
                var12 = (class7.field131 - var9 << 12) / var8;
            } else if (class92.field1252 < var13) {
                var13 = class92.field1252;
                var12 = (class92.field1252 - var9 << 12) / var8;
            }
            if (class7.field131 > var10) {
                var10 = class7.field131;
                var11 = (class7.field131 - var9 << 12) / var8;
            } else if (var10 > class92.field1252) {
                var10 = class92.field1252;
                var11 = (class92.field1252 - var9 << 12) / var8;
            }
            class348.method2113(var10, var13, var12, var11, -71, arg1);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)V", line = 134)
    public static final void method1403(boolean arg0, int arg1) {
        class33.field540 = arg1;
        if (!arg0) {
            class440.field6432 = 3;
            class440.field6424 = -1;
            field3222++;
            class135.field1729 = 100;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZZIIIIIII)Z", line = 148)
    public static final boolean method1404(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3215++;
        int var9 = class415.field6145.field4279[0];
        int var10 = class415.field6145.field4282[0];
        if (var9 < 0 || class362.field5442 <= var9 || var10 < 0 || var10 >= class203.field2813) {
            return false;
        } else if (arg2 >= 0 && arg2 < class362.field5442 && arg4 >= 0 && arg4 < class203.field2813) {
            int var11 = class491.method2951(class415.field6145.method1773(-114), class169.field2234[class415.field6145.field2956], arg7, arg8, arg6, var10, var9, arg3, arg5, arg4, class506.field7721, -1, class238.field3329, arg2, arg0);
            if (var11 < 1) {
                return false;
            }
            class495.field7547 = class506.field7721[var11 - 1];
            if (arg1) {
                class2.field33 = class238.field3329[var11 - 1];
                class358.field5314 = false;
                class65.method459(-1);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V", line = 182)
    public static void method1405(int arg0) {
        field3223 = null;
        field3219 = null;
        if (arg0 != -32666) {
            field3220 = null;
        }
        field3213 = null;
        field3224 = null;
        field3220 = null;
        field3218 = null;
    }
}
