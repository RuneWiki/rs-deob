import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class266 {

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4290 = "glow3:";

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Lcg;")
    public static class49 field4288;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[[[Lk;")
    public static class257[][][] field4287;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lcg;II)Lgh;", line = 5)
    public static final class250 method1831(class49 arg0, int arg1, int arg2) {
        field4286++;
        if (class160.method1276((byte) -28, arg1, arg0)) {
            return arg2 >= -17 ? (class250) null : class110.method956(-117);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIILuk;IJ)Z", line = 23)
    public static final boolean method1832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class104 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class258.method1791(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([Lao;[BIZII)V", line = 40)
    public static final void method1833(class200[] arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field4289++;
        class336 var6 = new class336(arg1);
        if (arg4 != -7922) {
            return;
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method2347(arg4 ^ 0xFFFF9EF1);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method2314((byte) -74);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var6.method2364(arg4 ^ 0x3D9D);
                int var14 = (var9 & 0xFD3) >> 6;
                int var15 = var13 >> 2;
                int var16 = arg5 + var14;
                int var17 = var13 & 0x3;
                int var18 = arg2 + var11;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class200 var19 = null;
                    if (!arg3) {
                        int var20 = var12;
                        if ((class152.field2683[1][var16][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class290.method1978((byte) 57, !arg3, var12, var17, var19, arg3, var7, var12, var15, var18, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 118)
    public static void method1834(int arg0) {
        field4290 = null;
        field4287 = (class257[][][]) null;
        field4288 = null;
        if (arg0 != -1) {
            method1834(68);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 130)
    public static final void method1835(int arg0) {
        if (arg0 != 4051) {
            field4291 = -29;
        }
        class230.field3836.method466(arg0 ^ 0xFFFFF02C);
        field4292++;
        class213.field3582.method466(arg0 - 4052);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[B", line = 142)
    public static final synchronized byte[] method1836(int arg0, int arg1) {
        field4293++;
        if (arg1 == 100 && class241.field3938 > 0) {
            byte[] var2 = class79.field1290[--class241.field3938];
            class79.field1290[class241.field3938] = null;
            return var2;
        } else if (arg1 == 5000 && class207.field3520 > 0) {
            byte[] var3 = class184.field3131[--class207.field3520];
            class184.field3131[class207.field3520] = null;
            return var3;
        } else {
            if (arg0 != 0) {
                field4288 = (class49) null;
            }
            if (arg1 == 30000 && class50.field786 > 0) {
                byte[] var4 = class37.field548[--class50.field786];
                class37.field548[class50.field786] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }
}
