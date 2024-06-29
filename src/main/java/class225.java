import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class225 extends class217 {

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "[Lv;")
    public class60[] field4077;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field4075 = 0;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "Llc;")
    public static class143 field4081 = class66.method374("Ladevorgang )2 bitte warten Sie)3", -1);

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "Lob;")
    public static class256 field4078 = new class256();

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "Llc;")
    private static class143 field4082 = class66.method374(")1a2)1m", -1);

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "Z")
    public static boolean field4083 = true;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Z")
    public final boolean method1544(int arg0, int arg1) {
        if (arg0 == 133627240) {
            field4079++;
            return this.field4077[arg1].field1145;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)Z")
    public static final boolean method1545(int arg0, int arg1) {
        field4080++;
        class133 var2 = class207.method1448(127, arg1);
        if (var2 == null) {
            return false;
        } else if (class81.field1473 == 1 || class81.field1473 == 2 || class235.field4290 == 2) {
            byte[] var3 = var2.field2335.method889((byte) 6);
            class229.field4194 = new String(var3, 0, var3.length);
            class23.field380 = var2.field2331;
            if (class235.field4290 != 0) {
                class209.field3843 = class23.field380 + 50000;
                class92.field1656 = class23.field380 + 40000;
                class266.field4778 = class92.field1656;
            }
            return true;
        } else {
            if (arg0 <= 34) {
                field4075 = -71;
            }
            class143 var4 = class274.field4871;
            if (class235.field4290 != 0) {
                var4 = class25.method179(0, new class143[] { class184.field3352, class274.method1806(var2.field2331 + 7000, true) });
            }
            class143 var5 = class274.field4871;
            if (class173.field3104 != null) {
                var5 = class25.method179(0, new class143[] { class247.field4439, class173.field3104 });
            }
            class143 var6 = class25.method179(0, new class143[] { class107.field1891, var2.field2335, var4, class200.field3660, class274.method1806(class141.field2467, true), class276.field4884, class274.method1806(class188.field3414, true), var5, class262.field4679, class247.field4440 ? class153.field2775 : class168.field3002, class139.field2421, class182.field3260 ? class153.field2775 : class168.field3002, field4082, class112.field1971 ? class153.field2775 : class168.field3002 });
            try {
                class63.field1201.getAppletContext().showDocument(var6.method893(13272), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lgf;Lgf;IZ)V")
    public class225(class7 arg0, class7 arg1, int arg2, boolean arg3) {
        class191 var5 = new class191();
        int var6 = arg0.method60(-122, arg2);
        this.field4077 = new class60[var6];
        int[] var7 = arg0.method43(arg2, (byte) -106);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method41(-18328, arg2, var7[var8]);
            class72 var10 = null;
            int var11 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            for (class72 var12 = (class72) var5.method1294(false); var12 != null; var12 = (class72) var5.method1292((byte) 99)) {
                if (var12.field1356 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method44(0, -1, var11);
                } else {
                    var13 = arg1.method44(var11, -1, 0);
                }
                var10 = new class72(var11, var13);
                var5.method1290((byte) -44, var10);
            }
            this.field4077[var7[var8]] = new class60(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
    public static void method1546(int arg0) {
        field4082 = null;
        field4078 = null;
        if (arg0 != 1) {
            field4082 = null;
        }
        field4081 = null;
    }
}
