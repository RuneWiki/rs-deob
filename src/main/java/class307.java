import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class307 extends class227 {

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
    private int field4110 = 0;

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    private int field4119 = 4096;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field4111 = 0;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public static int field4117 = -1;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public static int field4118 = 0;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "[I")
    public static int[] field4120;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class482.field7115 = arg0;
        if (arg2 != -28617) {
            field4118 = 125;
        }
        class365.field4987 = arg6;
        class130.field1684 = arg5;
        ++field4112;
        class135.field1789 = arg4;
        class159.field2070 = arg1;
        class460.field6861 = arg3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field4119 = arg0.method2386(arg1 + -487238764);
            }
        } else {
            this.field4110 = arg0.method2386(-23648);
        }
        if (arg1 != 487215116) {
            this.method61((class396) null, -90, -36);
        }
        ++field4115;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method1832(byte arg0) {
        field4120 = null;
        int var1 = 57 % ((arg0 - 3) / 50);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILjk;I)V")
    public static final void method1833(int arg0, int arg1, class450 arg2, int arg3) {
        ++field4116;
        if (class188.field2436 == null && !class483.field7125) {
            if (arg2 != null && class219.method1383(arg2, 2) != null) {
                class188.field2436 = arg2;
                if (arg0 == -28373) {
                    class474.field7033 = class219.method1383(arg2, arg0 ^ -28375);
                    class272.field3624 = arg3;
                    class297.field3917 = 0;
                    class389.field5639 = arg1;
                    class392.field5669 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class307() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lug;B)Lfu;")
    public static final class268 method1834(class396 arg0, byte arg1) {
        if (arg1 != 92) {
            field4120 = null;
        }
        ++field4114;
        return new class268(arg0.method2433((byte) 115), arg0.method2433((byte) 115), arg0.method2433((byte) 115), arg0.method2433((byte) 115), arg0.method2396((byte) 52), arg0.method2396((byte) -116), arg0.method2388((byte) -115));
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)[I")
    public final int[] method62(int arg0, int arg1) {
        ++field4113;
        int[] var3 = super.field3068.method1970(arg1, (byte) 125);
        if (arg0 != 15811) {
            method1833(-33, -86, (class450) null, 19);
        }
        if (super.field3068.field4480) {
            int[] var4 = this.method1459(arg1, -105, 0);
            for (int var5 = 0; ~var5 > ~class446.field6486; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field4110 && ~var6 >= ~this.field4119 ? 4096 : 0;
            }
        }
        return var3;
    }

    static {
        new class305("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field4120 = new int[] { 1, 2, 4, 8 };
    }
}
