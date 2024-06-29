import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class129 extends class136 {

    @OriginalMember(owner = "client!li", name = "L", descriptor = "[Lsa;")
    public class197[] field2423;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "Li;")
    public static class88 field2419 = class208.method1425(105, "Sprites geladen)3");

    @OriginalMember(owner = "client!li", name = "J", descriptor = "Li;")
    public static class88 field2421 = class208.method1425(105, "Spieler");

    @OriginalMember(owner = "client!li", name = "S", descriptor = "Li;")
    private static class88 field2429 = class208.method1425(105, "Select a world");

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "Li;")
    public static class88 field2427 = field2429;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "Llj;")
    public static class130 field2418;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "Lnb;")
    public static class144 field2424;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "Lq;")
    public static class174 field2428;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "Lab;")
    public static class3 field2416;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)I")
    public static final int method874(int arg0, int arg1) {
        field2425++;
        int var2 = 35 % ((arg0 + 19) / 32);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    public static void method875(int arg0) {
        field2424 = null;
        field2419 = null;
        if (arg0 != 11604) {
            method876(-60, -52, -123, 68, -68);
        }
        field2427 = null;
        field2429 = null;
        field2428 = null;
        field2416 = null;
        field2421 = null;
        field2418 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
    public static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg2; var5 < class206.field3925; var5++) {
            if (class81.field1455[var5] + class133.field2487[var5] > arg0 && class81.field1455[var5] < arg0 + arg3 && class132.field2473[var5] + class80.field1447[var5] > arg4 && arg1 + arg4 > class132.field2473[var5]) {
                class211.field4007[var5] = true;
            }
        }
        field2422++;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lnb;Lnb;IZ)V")
    public class129(class144 arg0, class144 arg1, int arg2, boolean arg3) {
        class248 var5 = new class248();
        int var6 = arg0.method944(128, arg2);
        this.field2423 = new class197[var6];
        int[] var7 = arg0.method950(39, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method941((byte) 56, var7[var8], arg2);
            int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            class78 var11 = null;
            for (class78 var12 = (class78) var5.method1612(false); var12 != null; var12 = (class78) var5.method1621(82)) {
                if (var12.field1412 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method949(var10, -6, 0);
                } else {
                    var13 = arg1.method949(0, -6, var10);
                }
                var11 = new class78(var10, var13);
                var5.method1624(var11, 74);
            }
            this.field2423[var7[var8]] = new class197(var9, var11);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)Z")
    public final boolean method877(boolean arg0, int arg1) {
        field2415++;
        if (!arg0) {
            method874(-118, 41);
        }
        return this.field2423[arg1].field3779;
    }
}
