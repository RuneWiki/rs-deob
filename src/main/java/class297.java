import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class297 extends class371 {

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "[I")
    public static int[] field4342 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "[Lto;")
    public static class216[] field4348;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field4340;
        if (arg0 == 0) {
            super.field5360 = arg2.method2561((byte) -89) == 1;
        }
        int var4 = -11 % ((arg1 - -15) / 39);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        ++field4345;
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (arg0 != 36) {
            this.method1840(50, 126, -3);
        }
        if (super.field5364.field7632) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class41.field455; ++var7) {
                this.method1840(var7, 95, arg1);
                int[][] var8 = this.method2263((byte) -100, 0, class210.field3105);
                var4[var7] = var8[0][class152.field1953];
                var5[var7] = var8[1][class152.field1953];
                var6[var7] = var8[2][class152.field1953];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lqa;ILch;)I")
    public static final int method1837(class167 arg0, int arg1, class206 arg2) {
        if (arg1 != -4203) {
            field4347 = -56;
        }
        ++field4349;
        if (~arg2.field3069 == 0) {
            if (~arg2.field3076 != 0) {
                class83 var3 = arg0.field2262.method1762(arg0.method976() ? arg2.field3076 : arg2.field3064, (byte) 45);
                if (!var3.field975) {
                    return var3.field963;
                }
            }
            return arg2.field3059;
        } else {
            return arg2.field3069;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILqa;)V")
    public static final void method1838(int arg0, class167 arg1) {
        if (class455.field6636) {
            class625.method3647(arg1, (byte) -126);
        } else {
            class16.method73(arg1, (byte) 92);
        }
        ++field4343;
        if (arg0 != 2) {
            method1837((class167) null, -90, (class206) null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
    public class297() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        if (arg0 >= -80) {
            method1837((class167) null, 118, (class206) null);
        }
        ++field4344;
        int[] var3 = super.field5378.method1451(9, arg1);
        if (super.field5378.field3254) {
            for (int var4 = 0; var4 < class41.field455; ++var4) {
                this.method1840(var4, -17, arg1);
                int[] var5 = this.method2260((byte) -115, class210.field3105, 0);
                var3[var4] = var5[class152.field1953];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)V")
    public static void method1839(int arg0) {
        field4348 = null;
        int var1 = 100 / ((arg0 - -42) / 40);
        field4342 = null;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(III)V")
    private final void method1840(int arg0, int arg1, int arg2) {
        ++field4339;
        int var4 = class287.field4215[arg0];
        int var5 = class614.field9004[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class210.field3105 = arg2;
            class152.field1953 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class152.field1953 = arg2;
            class210.field3105 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class152.field1953 = -arg2 + class41.field455;
            class210.field3105 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class152.field1953 = arg0;
            class210.field3105 = -arg2 + class23.field201;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class152.field1953 = -arg0 + class41.field455;
            class210.field3105 = -arg2 + class23.field201;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class152.field1953 = -arg2 + class41.field455;
            class210.field3105 = -arg0 + class23.field201;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class210.field3105 = -arg0 + class23.field201;
            class152.field1953 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class152.field1953 = -arg0 + class41.field455;
            class210.field3105 = arg2;
        }
        class152.field1953 &= class343.field5013;
        int var7 = -42 % ((arg1 - 52) / 39);
        class210.field3105 &= class135.field1789;
    }

    static {
        new class487("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field4348 = new class216[16];
    }
}
