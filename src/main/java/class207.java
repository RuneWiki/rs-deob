import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class207 {

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "Lhda;")
    public static class752 field3071 = new class752(119, 6);

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field3079;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Lhi;")
    public class207 field3068;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lofa;")
    public class333 field3070;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hi", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field3081;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1387(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)Lhi;", line = 3)
    public final class207 method1379(int arg0, int arg1) {
        field3069++;
        if (arg1 <= 37) {
            this.method1384(102);
        }
        return new class207(this.field3074, arg0);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 16)
    public static void method1380(int arg0) {
        int var1 = -6 / ((arg0 - 12) / 49);
        field3071 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIII)V", line = 27)
    public static final void method1381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class4.field120 = arg0;
        class489.field6634 = arg2;
        class617.field8245 = arg4;
        int var6 = -3 / ((78 - arg5) / 46);
        class516.field6830 = arg1;
        field3076++;
        class98.field1230 = arg3;
        if (class489.field6634 >= 100) {
            int var7 = class617.field8245 * 512 + 256;
            int var8 = class98.field1230 * 512 + 256;
            int var9 = class153.method1118(var8, var7, -30, class507.field6775) - class516.field6830;
            int var10 = var7 - class694.field9662;
            int var11 = var9 - class222.field3162;
            int var12 = var8 - class314.field4488;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + (var12 * var12)));
            class332.field4729 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 0x3FFF;
            class372.field5175 = (int) (Math.atan2((double) var10, (double) var12) * -2607.5945876176133D) & 0x3FFF;
            class22.field400 = 0;
            if (class332.field4729 < 1024) {
                class332.field4729 = 1024;
            }
            if (class332.field4729 > 3072) {
                class332.field4729 = 3072;
            }
        }
        class12.field193 = -1;
        class264.field3680 = -1;
        class278.field3898 = 2;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lnba;Z)V", line = 75)
    public static final void method1382(class302 arg0, boolean arg1) {
        field3078++;
        if (class660.field8718 == null) {
            return;
        }
        class624 var2 = null;
        if (arg0.field4284 == 0) {
            var2 = (class624) class672.method3710(arg0.field4283, arg0.field4286, arg0.field4289);
        }
        if (arg1) {
            method1380(106);
        }
        if (arg0.field4284 == 1) {
            var2 = (class624) class88.method674(arg0.field4283, arg0.field4286, arg0.field4289);
        }
        if (arg0.field4284 == 2) {
            var2 = (class624) class490.method2780(arg0.field4283, arg0.field4286, arg0.field4289, field3081 == null ? (field3081 = method1387("paa")) : field3081);
        }
        if (arg0.field4284 == 3) {
            var2 = (class624) class694.method3906(arg0.field4283, arg0.field4286, arg0.field4289);
        }
        if (var2 == null) {
            arg0.field4276 = 0;
            arg0.field4287 = -1;
            arg0.field4278 = 0;
        } else {
            arg0.field4287 = var2.method1759((byte) 73);
            arg0.field4276 = var2.method1757((byte) 43);
            arg0.field4278 = var2.method1752((byte) -111);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lpaa;B)Z", line = 121)
    public static final boolean method1383(class624 arg0, byte arg1) {
        field3080++;
        class100 var2 = class462.field6333.method2008((byte) -109, arg0.method1759((byte) 97));
        if (arg1 <= 33) {
            field3071 = null;
        }
        if (var2.field1294 == -1) {
            return true;
        } else {
            class513 var3 = class468.field6426.method1623(var2.field1294, 118);
            return var3.field6802 == -1 ? true : var3.method2864((byte) 80);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)Lse;", line = 148)
    public final class259 method1384(int arg0) {
        if (arg0 == 0) {
            field3067++;
            return class278.method1670(arg0 ^ 0x77, this.field3074);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLjba;Lha;)I", line = 159)
    public static final int method1385(boolean arg0, class403 arg1, class59 arg2) {
        field3075++;
        if (arg1.field5616 != -1) {
            return arg1.field5616;
        }
        if (arg1.field5618 != -1) {
            class758 var3 = arg2.field717.method91(arg1.field5618, (byte) 124);
            if (!var3.field10534) {
                return var3.field10546;
            }
        }
        if (!arg0) {
            method1385(true, null, null);
        }
        return arg1.field5624;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILha;)V", line = 186)
    public static final void method1386(int arg0, class59 arg1) {
        for (class17 var2 = (class17) class543.field7191.method3874((byte) 98); var2 != null; var2 = (class17) class543.field7191.method3868(-24951)) {
            if (var2.field231) {
                var2.method124(arg1);
            }
        }
        int var3 = -66 / ((59 - arg0) / 53);
        field3077++;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(II)V", line = 207)
    public class207(int arg0, int arg1) {
        this.field3074 = arg0;
        this.field3066 = arg1;
    }
}
