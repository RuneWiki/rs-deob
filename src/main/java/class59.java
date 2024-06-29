import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class59 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Loh;")
    public static class263 field1218 = class253.method1681(-119, "leuchten3:");

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field1223 = 0;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lue;")
    public static class86 field1222;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lue;")
    public static class86 field1225;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lah;B)V")
    public static final void method362(class267 arg0, byte arg1) {
        field1221++;
        if (arg0.field4710 == 0) {
            return;
        }
        if (arg0.field4693 != -1 && arg0.field4693 < 32768) {
            class90 var2 = class31.field774[arg0.field4693];
            if (var2 != null) {
                int var3 = arg0.field4688 - var2.field4688;
                int var4 = arg0.field4705 - var2.field4705;
                if (var3 != 0 || var4 != 0) {
                    arg0.field4674 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field4693 >= 32768) {
            int var5 = arg0.field4693 - 32768;
            if (class196.field3574 == var5) {
                var5 = 2047;
            }
            class137 var6 = class151.field2725[var5];
            if (var6 != null) {
                int var7 = arg0.field4688 - var6.field4688;
                int var8 = arg0.field4705 - var6.field4705;
                if (var7 != 0 || var8 != 0) {
                    arg0.field4674 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field4682 != 0 || arg0.field4655 != 0) && (arg0.field4711 == 0 || arg0.field4704 > 0)) {
            int var9 = arg0.field4688 - ((((arg0.field4682 - class93.field1844 - class93.field1844) * 64) - (arg0.method898(127) * 64)) + 64);
            int var10 = arg0.field4705 - (64 - (arg0.method898(110) * 64)) - (arg0.field4655 - class142.field2596 + -class142.field2596) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field4674 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field4655 = 0;
            arg0.field4682 = 0;
        }
        int var11 = arg0.field4674 - arg0.field4700 & 0x7FF;
        if (arg1 != -26) {
            method362((class267) null, (byte) 77);
        }
        if (var11 == 0) {
            arg0.field4706 = 0;
            return;
        }
        arg0.field4706++;
        if (var11 <= 1024) {
            arg0.field4700 += arg0.field4710;
            boolean var12 = true;
            if (arg0.field4710 > var11 || var11 > 2048 - arg0.field4710) {
                arg0.field4700 = arg0.field4674;
                var12 = false;
            }
            if (arg0.field4687 == arg0.field4652 && (arg0.field4706 > 25 || var12)) {
                if (arg0.field4690 == -1) {
                    arg0.field4652 = arg0.field4651;
                } else {
                    arg0.field4652 = arg0.field4690;
                }
            }
        } else {
            arg0.field4700 -= arg0.field4710;
            boolean var13 = true;
            if (var11 < arg0.field4710 || var11 > (2048 - arg0.field4710)) {
                var13 = false;
                arg0.field4700 = arg0.field4674;
            }
            if (arg0.field4687 == arg0.field4652 && (arg0.field4706 > 25 || var13)) {
                if (arg0.field4661 == -1) {
                    arg0.field4652 = arg0.field4651;
                } else {
                    arg0.field4652 = arg0.field4661;
                }
            }
        }
        arg0.field4700 &= 0x7FF;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII)I")
    public static final int method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg5;
            arg5 = var7;
        }
        int var8 = 81 % ((arg4 + 56) / 51);
        int var9 = arg1 & 0x3;
        field1220++;
        if (var9 == 0) {
            return arg6;
        } else if (var9 == 1) {
            return 1 + 7 - arg3 - arg0;
        } else if (var9 == 2) {
            return 7 + 1 - arg6 - arg5;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lte;")
    public static final class75 method364(int arg0, int arg1) {
        class75 var2 = (class75) class81.field1605.method828(0, (long) arg0);
        field1219++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -127) {
            field1222 = null;
        }
        byte[] var3 = class181.field3288.method596(41, 3, arg0);
        class75 var4 = new class75();
        if (var3 != null) {
            var4.method498((byte) -86, new class194(var3));
        }
        class81.field1605.method826((long) arg0, 9815, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lsi;II)V")
    private final void method365(class194 arg0, int arg1, int arg2) {
        field1226++;
        if (arg1 == 1) {
            this.field1230 = arg0.method1294((byte) 3);
            this.field1228 = arg0.method1301(-8317);
            this.field1224 = arg0.method1301(arg2 ^ 0x207C);
        }
        if (arg2 != -1) {
            this.method367((class194) null, -124);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method366(int arg0) {
        field1222 = null;
        field1218 = null;
        if (arg0 != 20028) {
            field1229 = -27;
        }
        field1225 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lsi;I)V")
    public final void method367(class194 arg0, int arg1) {
        field1227++;
        while (true) {
            int var3 = arg0.method1301(-8317);
            if (var3 == 0) {
                if (arg1 < 112) {
                    this.method365((class194) null, -101, 99);
                    return;
                } else {
                    return;
                }
            }
            this.method365(arg0, var3, -1);
        }
    }
}
