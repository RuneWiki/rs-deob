import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class236 {

    @OriginalMember(owner = "client!km", name = "h", descriptor = "B")
    public byte field3458;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "S")
    public short field3453;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "B")
    public byte field3464;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "S")
    public short field3454;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Z")
    public boolean field3452;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "S")
    public short field3457;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lbg;")
    public static class324 field3455 = new class324(43, 3);

    @OriginalMember(owner = "client!km", name = "m", descriptor = "[I")
    public static int[] field3463 = new int[13];

    @OriginalMember(owner = "client!km", name = "k", descriptor = "Lpn;")
    public static class523 field3461 = new class523("", 13);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIII)Lkm;", line = 3)
    public final class236 method1570(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 53 / ((arg2 - 36) / 50);
        field3456++;
        return new class236(arg1, arg4, arg3, arg0, this.field3454, this.field3453, this.field3457, this.field3464, this.field3458, this.field3452);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lqm;I)I", line = 18)
    public static final int method1571(class97 arg0, int arg1) {
        if (arg1 != 3) {
            method1571(null, 49);
        }
        field3459++;
        String var2 = class87.method768(-96, arg0);
        int[] var3 = null;
        if (class293.method1857(arg0.field1307, 0)) {
            var3 = class270.field3995.method6(22883, (int) arg0.field1308).field923;
        } else if (arg0.field1299 != -1) {
            var3 = class270.field3995.method6(22883, arg0.field1299).field923;
        } else if (class478.method2889(arg0.field1307, (byte) -112)) {
            class461 var6 = class250.field3690[(int) arg0.field1308];
            if (var6 != null) {
                class100 var7 = var6.field6790;
                if (var7.field1364 != null) {
                    var7 = var7.method848(false, class253.field3739);
                }
                if (var7 != null) {
                    var3 = var7.field1404;
                }
            }
        } else if (class9.method58(-110, arg0.field1307)) {
            Object var4 = null;
            class222 var5;
            if (arg0.field1307 == 1010) {
                var5 = class384.field5645.method786((int) arg0.field1308, 0);
            } else {
                var5 = class384.field5645.method786((int) (arg0.field1308 >>> 32 & 0x7FFFFFFFL), 0);
            }
            if (var5.field3233 != null) {
                var5 = var5.method1509(class253.field3739, (byte) -29);
            }
            if (var5 != null) {
                var3 = var5.field3245;
            }
        }
        if (var3 != null) {
            var2 = var2 + class213.method1463(var3, 124);
        }
        int var8 = class387.field5731.method1971(var2, arg1 ^ 0x78, class436.field6393);
        if (arg0.field1298) {
            var8 += class370.field5496.method110() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(CZ)Z", line = 90)
    public static final boolean method1572(char arg0, boolean arg1) {
        field3451++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class176.method1235(-107, arg0)) {
            return true;
        } else {
            char[] var2 = class355.field4949;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            char[] var4 = class433.field6362;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            if (arg1) {
                field3462 = -102;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 154)
    public static void method1573(int arg0) {
        field3461 = null;
        field3463 = null;
        if (arg0 != -10933) {
            field3463 = null;
        }
        field3455 = null;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 165)
    public class236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field3458 = (byte) arg8;
        this.field3453 = (short) arg5;
        this.field3464 = (byte) arg7;
        this.field3460 = arg0;
        this.field3454 = (short) arg4;
        this.field3452 = arg9;
        this.field3457 = (short) arg6;
    }
}
