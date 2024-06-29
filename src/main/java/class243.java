import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class243 extends class227 {

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field3217 = 0;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "Lqh;")
    public static class50 field3208 = new class50(64);

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "Ljc;")
    public static class305 field3218 = new class305("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    private int field3211;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    private int field3212;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "I")
    private int field3216;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "Lke;")
    public static class426 field3219;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "(I)V")
    public static void method1515(int arg0) {
        field3219 = null;
        field3218 = null;
        if (arg0 != 4835) {
            method1517(-112, -99, -107, -24, 82, -116);
        }
        field3208 = null;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class243() {
        this(0);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)V")
    private final void method1516(int arg0, int arg1) {
        this.field3212 = (255 & arg0) << 4;
        this.field3216 = arg0 >> 12 & arg1;
        this.field3211 = (65280 & arg0) >> 4;
        ++field3213;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        ++field3215;
        if (arg2 == 0) {
            this.method1516(arg0.method2396((byte) 127), 4080);
        }
        if (arg1 != 487215116) {
            this.method112(109, true);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)I")
    public static final int method1517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3209;
        if (class152.field1993 == null) {
            return 0;
        } else {
            if (arg2 < 3) {
                label98: {
                    int var6 = arg5 >> 7;
                    int var7 = arg1 >> 7;
                    if (arg3 >= 0 && ~arg4 <= -1 && ~(class308.field4128 + -1) <= ~arg3 && ~(class426.field6200 + -1) <= ~arg4) {
                        if (~var6 <= -2 && var7 >= 1 && ~(class308.field4128 + -1) <= ~var6 && class426.field6200 + -1 >= var7) {
                            boolean var8 = ~(2 & class252.field3358[1][arg5 >> 7][arg1 >> 7]) != -1;
                            if ((arg5 & 127) == 0) {
                                boolean var9 = (class252.field3358[1][var6 - 1][arg1 >> 7] & 2) != 0;
                                boolean var10 = (class252.field3358[1][var6][arg1 >> 7] & 2) != 0;
                                if (var10 == !var9) {
                                    var8 = ~(class252.field3358[1][arg3][arg4] & 2) != -1;
                                }
                            }
                            if ((arg1 & 127) == 0) {
                                boolean var11 = (2 & class252.field3358[1][arg5 >> 7][var7 + -1]) != 0;
                                boolean var12 = ~(2 & class252.field3358[1][arg5 >> 7][var7]) != -1;
                                if (var11 != var12) {
                                    var8 = (class252.field3358[1][arg3][arg4] & 2) != 0;
                                }
                            }
                            if (var8) {
                                ++arg2;
                            }
                            break label98;
                        }
                        return 0;
                    }
                    return 0;
                }
            }
            int var13 = 7 / ((arg0 - 35) / 32);
            return class152.field1993[arg2].method216(arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V")
    private class243(int arg0) {
        super(0, false);
        this.method1516(arg0, 4080);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method112(int arg0, boolean arg1) {
        ++field3214;
        int[][] var3 = super.field3059.method28((byte) -117, arg0);
        if (!arg1) {
            field3210 = -125;
        }
        if (super.field3059.field57) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class446.field6486; ++var7) {
                var4[var7] = this.field3216;
                var5[var7] = this.field3211;
                var6[var7] = this.field3212;
            }
        }
        return var3;
    }
}
