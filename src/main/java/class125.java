import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class125 extends class240 {

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    private int field2254 = 0;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    private int field2255 = 4096;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    public static int field2260 = -2;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "F")
    public static float field2252;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "Lsc;")
    public static class249 field2256;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "Ll;")
    public static class284 field2262;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            this.method16(-84, 52, (class13) null);
        }
        field2257++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int[] var4 = this.method1745(arg1, 0, (byte) 108);
            for (int var5 = 0; var5 < class169.field2936; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field2254 <= var6 && var6 <= this.field2255 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 41)
    public class125() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V", line = 45)
    public static void method905(int arg0) {
        field2262 = null;
        if (arg0 != -5) {
            method905(-11);
        }
        field2256 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILqm;Lqm;II)Lka;", line = 58)
    public static final class179 method906(int arg0, class222 arg1, class222 arg2, int arg3, int arg4) {
        if (arg4 != -2) {
            method905(97);
        }
        field2253++;
        return class135.method966(98, arg0, arg3, arg2) ? class37.method299(arg1.method1580(0, arg0, arg3), true) : null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)Lja;", line = 79)
    public static final class60 method907(int arg0, int arg1) {
        field2259++;
        if (arg1 > -65) {
            method906(25, (class222) null, (class222) null, -46, -82);
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class272.field4675[var2] == null || class272.field4675[var2][var3] == null) {
            boolean var4 = class159.method1148(-1, var2);
            if (!var4) {
                return null;
            }
        }
        return class272.field4675[var2][var3];
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(III)V", line = 113)
    public static final void method908(int arg0, int arg1, int arg2) {
        if (~arg0 == arg1 && !class250.field4342) {
            arg2 = 2;
            arg0 = 2;
        }
        field2250++;
        if (class276.field4753 != arg0) {
            if (class223.field3808) {
                return;
            }
            if (class276.field4753 != 0) {
                class62.field1210[class276.field4753].method555();
            }
            if (arg0 != 0) {
                class73 var3 = class62.field1210[arg0];
                var3.method556();
                var3.method557(arg2);
            }
            class226.field3855 = arg2;
            class276.field4753 = arg0;
        } else if (arg0 != 0 && class226.field3855 != arg2) {
            class62.field1210[arg0].method557(arg2);
            class226.field3855 = arg2;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILkh;)V", line = 168)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg1 == 0) {
            this.field2254 = arg2.method112((byte) 92);
        } else if (arg1 == 1) {
            this.field2255 = arg2.method112((byte) 92);
        }
        field2258++;
        if (arg0 != 2) {
            method906(13, (class222) null, (class222) null, 7, -11);
        }
    }
}
