import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class182 extends class278 {

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field2702 = -1;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "Lfr;")
    public static class497 field2705;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "[B")
    private byte[] field2698;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "[S")
    public static short[] field2706;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZIII)V")
    public static final void method1238(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2701++;
        if (arg5 != -200) {
            field2705 = null;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class32.field452 + ((class122.field1856 - class32.field452) * var6 / 100);
        if (var7 < class293.field4391) {
            var7 = class293.field4391;
        } else if (class282.field4268 < var7) {
            var7 = class282.field4268;
        }
        int var8 = arg3 * 512 * var7 / (arg0 * 334);
        if (var8 < class200.field2919) {
            short var12 = class200.field2919;
            var7 = arg0 * 334 * var12 / (arg3 * 512);
            if (var7 > class282.field4268) {
                var7 = class282.field4268;
                int var13 = arg3 * var7 * 512 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg2) {
                    class407.field6147.method94();
                    class407.field6147.method67(123, var14, -16777216, arg1, arg3, arg4);
                    class407.field6147.method67(113, var14, -16777216, arg1 + arg0 - var14, arg3, arg4);
                }
                arg1 += var14;
                arg0 -= var14 * 2;
            }
        } else if (var8 > class150.field2284) {
            short var9 = class150.field2284;
            var7 = arg0 * 334 * var9 / (arg3 * 512);
            if (class293.field4391 > var7) {
                var7 = class293.field4391;
                int var10 = var9 * 334 * arg0 / (var7 * 512);
                int var11 = (arg3 - var10) / 2;
                if (arg2) {
                    class407.field6147.method94();
                    class407.field6147.method67(arg5 ^ 0xFFFFFF59, arg0, -16777216, arg1, var11, arg4);
                    class407.field6147.method67(arg5 ^ 0xFFFFFF51, arg0, -16777216, arg1, var11, arg3 + arg4 - var11);
                }
                arg4 += var11;
                arg3 -= var11 * 2;
            }
        }
        class407.field6145 = (short) arg0;
        class141.field2127 = arg1;
        class20.field306 = (short) arg3;
        class2.field11 = arg3 * var7 / 334;
        class379.field5704 = arg4;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIBI)[B")
    public final byte[] method1239(int arg0, int arg1, byte arg2, int arg3) {
        this.field2698 = new byte[arg1 * arg3 * arg0 * 2];
        field2700++;
        if (arg2 != 109) {
            this.method1240((byte) 64, 25, -74);
        }
        this.method1257(arg3, arg0, -112, arg1);
        return this.field2698;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(BII)V")
    public final void method1240(byte arg0, int arg1, int arg2) {
        field2699++;
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2698[var10001] = (byte) (arg2 * var5 >> 5);
        this.field2698[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
    public static void method1241(byte arg0) {
        field2705 = null;
        field2706 = null;
        if (arg0 != -12) {
            method1238(8, -60, false, 91, -80, -35);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1242(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1242(-99, 119, true);
        }
        field2704++;
        return class411.method2463(arg1, arg0, (byte) 50) | (arg1 & 0x800) != 0 || class242.method1474(arg1, 98, arg0);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class182() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    static {
        new class347("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field2705 = new class497();
    }
}
