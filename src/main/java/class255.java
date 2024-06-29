import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class255 extends class4 {

    @OriginalMember(owner = "client!lt", name = "K", descriptor = "Lvt;")
    public static class344 field3168 = new class344("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

    @OriginalMember(owner = "client!lt", name = "N", descriptor = "Lwg;")
    public static class58 field3171 = new class58(32);

    @OriginalMember(owner = "client!lt", name = "O", descriptor = "Z")
    public static boolean field3172 = false;

    @OriginalMember(owner = "client!lt", name = "E", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!lt", name = "F", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!lt", name = "G", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!lt", name = "H", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!lt", name = "I", descriptor = "I")
    private int field3166;

    @OriginalMember(owner = "client!lt", name = "J", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!lt", name = "L", descriptor = "I")
    private int field3169;

    @OriginalMember(owner = "client!lt", name = "M", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field3164;
        if (arg0 < -89) {
            if (arg2 == 0) {
                this.method1538(arg1.method3043((byte) 49), -922222836);
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)[[I")
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 > -83) {
            this.method13(-77, (class551) null, 66);
        }
        ++field3167;
        int[][] var3 = super.field38.method3021((byte) 89, arg0);
        if (super.field38.field7618) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class132.field1627 > var7; ++var7) {
                var4[var7] = this.field3170;
                var5[var7] = this.field3166;
                var6[var7] = this.field3169;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "(I)V")
    public static final void method1535(int arg0) {
        class170.field2165 = null;
        class53.field708 = null;
        if (arg0 == -19278) {
            class80.field1078 = null;
            class428.field5842 = null;
            class445.field6165 = null;
            class526.field7325 = null;
            class183.field2337 = null;
            class52.field695 = null;
            class644.field9337 = null;
            class629.field9179 = null;
            class92.field1225 = null;
            class332.field4584 = null;
            class44.field632 = null;
            class95.field1282 = null;
            class525.field7312 = null;
            class522.field7281 = null;
            ++field3165;
            class372.field5172 = null;
            class453.field6424 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZII)V")
    public static final void method1536(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3162;
        class632 var4 = class641.method3699(-110, 9, arg3);
        if (arg1) {
            field3168 = null;
        }
        var4.method3656(0);
        var4.field9198 = arg0;
        var4.field9197 = arg2;
    }

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "(I)V")
    public static void method1537(int arg0) {
        if (arg0 != -17540) {
            method1536(7, false, 87, 24);
        }
        field3168 = null;
        field3171 = null;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
    public class255() {
        this(0);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V")
    private class255(int arg0) {
        super(0, false);
        this.method1538(arg0, -922222836);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
    private final void method1538(int arg0, int arg1) {
        this.field3169 = (255 & arg0) << 4;
        this.field3166 = (65280 & arg0) >> 4;
        this.field3170 = 4080 & arg0 >> 12;
        ++field3163;
        if (arg1 != -922222836) {
            field3172 = false;
        }
    }
}
