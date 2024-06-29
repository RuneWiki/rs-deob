import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class35 extends class93 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lqu;")
    public static class364 field393 = new class364(80, 2);

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field399 = 104;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V", line = 3)
    public static final void method176(int arg0, int arg1, int arg2) {
        if (arg1 <= -35) {
            field397++;
            if (class159.method929(0, arg2)) {
                class190.method1238(arg0, class251.field3650[arg2], (byte) -50);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Llba;)V", line = 19)
    public static final void method177(class237 arg0) {
        for (int var1 = arg0.field3469; var1 <= arg0.field3459; var1++) {
            for (int var2 = arg0.field3472; var2 <= arg0.field3462; var2++) {
                class415 var3 = class526.field7777[arg0.field3457][var1][var2];
                if (var3 != null) {
                    class639 var4 = var3.field5981;
                    class639 var5 = null;
                    while (var4 != null) {
                        if (var4.field9288 == arg0) {
                            if (var5 == null) {
                                var3.field5981 = var4.field9291;
                            } else {
                                var5.field9291 = var4.field9291;
                            }
                            var4.method3699((byte) 122);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field9291;
                    }
                    var3.field5992 = 0;
                    for (class639 var6 = var3.field5981; var6 != null; var6 = var6.field9291) {
                        var3.field5992 = (byte) (var3.field5992 | var6.field9289);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 74)
    public static void method178(byte arg0) {
        if (arg0 <= -50) {
            field393 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 84)
    public static final void method179(int arg0) {
        class97.field1206.method1332(-22538);
        if (arg0 < -124) {
            field394++;
            class163.field2178.method1332(-22538);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[B)[B", line = 96)
    public static final byte[] method180(int arg0, int arg1, byte[] arg2) {
        if (arg1 == 19101) {
            field398++;
            byte[] var3 = new byte[arg0];
            class473.method2883(arg2, 0, var3, 0, arg0);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIB)Z", line = 116)
    public static final boolean method181(int arg0, int arg1, byte arg2) {
        if (arg2 != 82) {
            method180(-64, 70, null);
        }
        field396++;
        return (arg1 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lwca;Lqa;I)V", line = 130)
    public static final void method182(class311 arg0, class167 arg1, int arg2) {
        if (arg2 != 0) {
            method177(null);
        }
        field395++;
        boolean var3 = class216.field3204.method3364(arg1, arg0.field4661, arg0.field4527, arg0.field4557 | 0xFF000000, arg0.field4597, arg0.field4526, -6728, arg0.field4615 ? class239.field3493.field2711 : null) == null;
        if (var3) {
            class554.field8234.method2492(new class581(arg0.field4661, arg0.field4527, arg0.field4597, arg0.field4557 | 0xFF000000, arg0.field4526, arg0.field4615), (byte) -102);
            class619.method3586(26, arg0);
        }
    }
}
