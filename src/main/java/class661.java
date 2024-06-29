import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class661 extends class670 {

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "Lqfa;")
    public static class98 field9044 = new class98(44, 0);

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "Z")
    public static boolean field9049 = false;

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "Lbd;")
    public static class60 field9052 = new class60(7, 7);

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "Lgg;")
    public static class172 field9054 = new class172(2);

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "Lrda;")
    public class661 field9043;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "Lrda;")
    public class661 field9046;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/Object;III)[B", line = 3)
    public static final byte[] method3622(Object arg0, int arg1, int arg2, int arg3) {
        field9051++;
        if (arg2 != 0) {
            field9044 = null;
        }
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class414.method2547(arg3, 255, arg1, var4);
        } else if (arg0 instanceof class281) {
            class281 var5 = (class281) arg0;
            return var5.method1846(arg3, true, arg1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)Z", line = 44)
    public static final boolean method3623(byte arg0, int arg1, int arg2) {
        field9047++;
        return arg0 <= 71 ? false : (class446.method2674(33, arg1, arg2) | class576.method3292((byte) 77, arg2, arg1) | class18.method107(arg2, (byte) -87, arg1)) & class651.method3586(arg2, arg1, (byte) 120);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V", line = 56)
    public final void method3624(byte arg0) {
        field9050++;
        if (this.field9043 == null) {
            return;
        }
        int var2 = 39 % ((arg0 - 25) / 55);
        this.field9043.field9046 = this.field9046;
        this.field9046.field9043 = this.field9043;
        this.field9043 = null;
        this.field9046 = null;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V", line = 73)
    public static final void method3625(int arg0) {
        if (arg0 != 5) {
            method3627(null, 57, (byte) 37, 78, false);
        }
        if (class332.field4622 >= 0) {
            long var1 = class479.method2864((byte) -69);
            class332.field4622 = (int) ((long) class332.field4622 - (var1 - class460.field6489));
            if (class332.field4622 > 0) {
                int var3 = (class332.field4622 << 8) / class526.field7426;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class428.field6109 = ((class314.field4352 & 0xFF00) * var3 + (class97.field1170.field2067 & 0xFF00) * var4 & 0xFF0000) + ((class314.field4352 & 0xFF00FF) * var3 + (class97.field1170.field2067 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class307.field4294 = (class97.field1170.field2070 - class455.field6431) * var6 + class455.field6431;
                class544.field7589 = (class97.field1170.field2059 - class448.field6361) * var6 + class448.field6361;
                class196.field2614 = (class97.field1170.field2058 - class506.field7247) * var6 + class506.field7247;
                class267.field3810 = (class97.field1170.field2063 - class686.field9383) * var6 + class686.field9383;
                class441.field6287 = ((class700.field9765 & 0xFF00FF) * var3 + ((class97.field1170.field2069 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class700.field9765 & 0xFF00) * var3 + (class97.field1170.field2069 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class452.field6397 = (class97.field1170.field2053 - class561.field7877) * var6 + class561.field7877;
                class68.field838 = class344.field4850 * var3 + class97.field1170.field2062 * var4 >> 8;
                class567.field8047 = (class97.field1170.field2051 - class421.field5930) * var6 + class421.field5930;
                if (class647.field8902 != class97.field1170.field2052) {
                    class279.field3943 = class452.field6394.method453(class647.field8902, class97.field1170.field2052, var6, class279.field3943);
                }
            } else {
                class332.field4622 = -1;
                class428.field6109 = class97.field1170.field2067;
                class196.field2614 = class97.field1170.field2058;
                class68.field838 = class97.field1170.field2062;
                class452.field6397 = class97.field1170.field2053;
                class567.field8047 = class97.field1170.field2051;
                class441.field6287 = class97.field1170.field2069;
                class544.field7589 = class97.field1170.field2059;
                class307.field4294 = class97.field1170.field2070;
                class267.field3810 = class97.field1170.field2063;
                class279.field3943 = class97.field1170.field2052;
            }
            class460.field6489 = var1;
        }
        field9053++;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V", line = 136)
    public static final void method3626(int arg0) {
        field9048++;
        if (arg0 != 16711680) {
            field9044 = null;
        }
        class2.field16 = true;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljb;IBIZ)V", line = 148)
    public static final void method3627(class493 arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field9045++;
        int var5 = arg0.field7095;
        if (arg0.field6950 == 0) {
            arg0.field7095 = arg0.field7098;
        } else if (arg0.field6950 == 1) {
            arg0.field7095 = arg3 - arg0.field7098;
        } else if (arg0.field6950 == 2) {
            arg0.field7095 = arg0.field7098 * arg3 >> 14;
        }
        int var6 = arg0.field7031;
        if (arg0.field7006 == 0) {
            arg0.field7031 = arg0.field6983;
        } else if (arg0.field7006 == 1) {
            arg0.field7031 = arg1 - arg0.field6983;
        } else if (arg0.field7006 == 2) {
            arg0.field7031 = arg0.field6983 * arg1 >> 14;
        }
        if (arg0.field6950 == 4) {
            arg0.field7095 = arg0.field7087 * arg0.field7031 / arg0.field6982;
        }
        if (arg0.field7006 == 4) {
            arg0.field7031 = arg0.field7095 * arg0.field6982 / arg0.field7087;
        }
        int var7 = -56 / ((arg2 - 53) / 50);
        if (class600.field8422 && (client.method1950(arg0).field6767 != 0 || arg0.field7016 == 0)) {
            if (arg0.field7031 < 5 && arg0.field7095 < 5) {
                arg0.field7095 = 5;
                arg0.field7031 = 5;
            } else {
                if (arg0.field7031 <= 0) {
                    arg0.field7031 = 5;
                }
                if (arg0.field7095 <= 0) {
                    arg0.field7095 = 5;
                }
            }
        }
        if (class681.field9339 == arg0.field7021) {
            class371.field5222 = arg0;
        }
        if (arg4 && arg0.field7038 != null && arg0.field7095 != var5 || arg0.field7031 != var6) {
            class357 var8 = new class357();
            var8.field5076 = arg0.field7038;
            var8.field5082 = arg0;
            class243.field3247.method2770((byte) -13, var8);
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)V", line = 238)
    public static void method3628(byte arg0) {
        field9052 = null;
        field9054 = null;
        int var1 = 47 / ((55 - arg0) / 62);
        field9044 = null;
    }
}
