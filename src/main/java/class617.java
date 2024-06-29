import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class617 extends class41 {

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "I")
    private int field8303 = -1;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
    public static int field8304 = 0;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "B")
    private byte field8306;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
    public static int field8301;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "[[[Z")
    public static boolean[][][] field8308;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ler;I[[B)V", line = 3)
    public static final void method3493(class117 arg0, int arg1, byte[][] arg2) {
        field8301++;
        if (arg1 != -1) {
            method3496((byte) 27);
        }
        for (int var3 = 0; var3 < arg0.field3317; var3++) {
            class580.method3339((byte) -58);
            for (int var4 = 0; var4 < (class596.field8090 >> 3); var4++) {
                for (int var5 = 0; var5 < class107.field1350 >> 3; var5++) {
                    int var6 = class439.field5868[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x35147FE) >> 24;
                        if (!arg0.field3316 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FF9) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class471.field6569.length; var12++) {
                                if (class471.field6569[var12] == var11 && arg2[var12] != null) {
                                    arg0.method915((byte) 110, arg2[var12], var4 * 8, var3, (var10 & 0x7) * 8, (var9 & 0x7) * 8, class633.field8649, var5 * 8, class363.field4526, var8, var7);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)Z", line = 78)
    public static final boolean method3494(int arg0, int arg1, int arg2) {
        field8307++;
        if (arg1 != 8) {
            field8304 = -46;
        }
        if ((class86.method797(17, arg2, arg0) | (arg0 & 0x10000) != 0) || class319.method1904(arg2, arg0, 0)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class388.method2276(arg0, -5845, arg2);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(FI)F", line = 94)
    public static final float method3495(float arg0, int arg1) {
        if (arg1 != 6) {
            method3496((byte) 50);
        }
        field8302++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILes;)V", line = 108)
    public final void method329(int arg0, class403 arg1) {
        this.field8303 = arg1.method2390((byte) 45);
        field8305++;
        if (arg0 != -3999) {
            field8304 = -123;
        }
        this.field8306 = arg1.method2392(121);
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)V", line = 120)
    public static void method3496(byte arg0) {
        if (arg0 != -88) {
            method3493(null, -58, null);
        }
        field8308 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Loga;I)V", line = 137)
    public final void method331(class500 arg0, int arg1) {
        arg0.method2950(-114, this.field8303, this.field8306);
        if (arg1 != 55) {
            method3495(1.1712873F, -26);
        }
        field8300++;
    }
}
