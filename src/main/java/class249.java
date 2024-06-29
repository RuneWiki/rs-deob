import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class249 {

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lta;")
    public static class262 field3839 = new class262(64);

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "[I")
    public static int[] field3842 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Z")
    public static boolean field3844 = false;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field3843 = 0;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
    public static int[] field3841 = new int[100];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lbf;")
    public class205 field3836;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lhl;")
    public static class40 field3835;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method1669(int arg0) {
        if (arg0 == 100) {
            field3839 = null;
            field3841 = null;
            field3842 = null;
            field3835 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method1670(int arg0, int arg1) {
        class130.field2023.method1778(arg0, -19);
        if (arg1 == -14413) {
            field3834++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Z")
    public static final boolean method1671(int arg0) {
        field3837++;
        class132 var1 = class258.field3955;
        synchronized (class258.field3955) {
            if (class73.field1214 == class41.field671) {
                return false;
            } else {
                class229.field3584 = class267.field4261[class41.field671];
                class256.field3932 = class242.field3739[class41.field671];
                class41.field671 = arg0 & class41.field671 + 1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZBLu;)V")
    public static final void method1672(boolean arg0, byte arg1, class120 arg2) {
        field3838++;
        int var3 = (int) arg2.field1408;
        int var4 = arg2.field1852;
        arg2.method693(-117);
        if (arg0) {
            class154.method1037(var4, (byte) 111);
        }
        class127.method906(var4, (byte) 94);
        class188 var5 = class5.method57((byte) -95, var3);
        if (var5 != null) {
            class246.method1663(255, var5);
        }
        int var6 = class220.field3450;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class165.method1096(3, class80.field1341[var7])) {
                class177.method1180(var7, -86);
            }
        }
        if (arg1 < 41) {
            method1669(123);
        }
        if (class220.field3450 == 1) {
            class64.field1025 = false;
            class178.method1187(0, class154.field2353, class139.field2139, class273.field4313, class92.field1478);
        } else {
            class178.method1187(0, class154.field2353, class139.field2139, class273.field4313, class92.field1478);
            int var8 = class123.field1925.method10(class215.field3315);
            for (int var9 = 0; var9 < class220.field3450; var9++) {
                int var10 = class123.field1925.method10(class57.method454(15827, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class92.field1478 = class220.field3450 * 15 + (class23.field336 ? 26 : 22);
            class273.field4313 = var8 + 8;
        }
        if (class34.field544 != -1) {
            class205.method1374(class34.field544, 1, 1);
        }
    }
}
