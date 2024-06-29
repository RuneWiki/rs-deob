import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class41 extends class325 {

    @OriginalMember(owner = "client!al", name = "M", descriptor = "Ljava/lang/String;")
    public static String field599 = "flash2:";

    @OriginalMember(owner = "client!al", name = "P", descriptor = "[I")
    public static int[] field602 = new int[100];

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "Lii;")
    private class250 field596;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)I", line = 6)
    public final int method310(int arg0, byte arg1, int arg2) {
        field598++;
        if (this.field596 == null) {
            return arg2;
        } else if (arg1 == 17) {
            class293 var4 = (class293) this.field596.method1716(-1, (long) arg0);
            return var4 == null ? arg2 : var4.field4519;
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lwm;I)V", line = 29)
    public final void method311(class254 arg0, int arg1) {
        if (arg1 != -1) {
            method313((byte) -12, (class95) null, (class95) null);
        }
        while (true) {
            int var3 = arg0.method1774((byte) 30);
            if (var3 == 0) {
                field593++;
                return;
            }
            this.method314(var3, -124, arg0);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZLjava/lang/String;)Ljava/lang/String;", line = 51)
    public final String method312(int arg0, boolean arg1, String arg2) {
        field601++;
        if (this.field596 == null) {
            return arg2;
        }
        class78 var4 = (class78) this.field596.method1716(-1, (long) arg0);
        if (arg1) {
            return (String) null;
        } else if (var4 == null) {
            return arg2;
        } else {
            return var4.field1144;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BLjd;Ljd;)V", line = 72)
    public static final void method313(byte arg0, class95 arg1, class95 arg2) {
        field595++;
        class71.field1023 = arg1;
        if (arg0 != 91) {
            method317(53, -108, -115);
        }
        class314.field4872 = arg2;
        class47.field656 = class314.field4872.method685((byte) 15, 3);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILwm;)V", line = 88)
    private final void method314(int arg0, int arg1, class254 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method1774((byte) -104);
            if (this.field596 == null) {
                int var5 = class312.method2135(984942384, var4);
                this.field596 = new class250(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1774((byte) -112) == 1;
                int var8 = arg2.method1758((byte) 113);
                class5 var9;
                if (var7) {
                    var9 = new class78(arg2.method1778(1258));
                } else {
                    var9 = new class293(arg2.method1741(-32769));
                }
                this.field596.method1708((long) var8, (byte) -79, var9);
            }
        }
        if (arg1 > -74) {
            field591 = -52;
        }
        field594++;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V", line = 148)
    public static void method315(byte arg0) {
        field599 = null;
        if (arg0 >= -72) {
            method315((byte) 78);
        }
        field602 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZIZI)V", line = 160)
    public static final void method316(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        class103.method784(-53, class157.field2393.length - 1, 0, arg4, arg0, arg1, arg3);
        if (arg2 == 17124) {
            field597++;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(III)I", line = 172)
    public static final int method317(int arg0, int arg1, int arg2) {
        int var3 = class89.method651((byte) -34, arg0 + 91923, 4, arg2 + 45365) - (128 - (class89.method651((byte) -34, arg0 + 37821, 2, arg2 + 10294) - 128 >> 1) - (class89.method651((byte) -34, arg0, 1, arg2) + -128 >> 2));
        field600++;
        if (arg1 != 60) {
            return -119;
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
