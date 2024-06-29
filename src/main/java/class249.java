import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public abstract class class249 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field4110 = 0;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "Lqd;")
    public static class40 field4120 = class147.method1106("Lade Konfiguration )2 ", (byte) -116);

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field4111 = -1;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field4127 = 0;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Lqd;")
    public static class40 field4123 = class147.method1106("", (byte) -54);

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public int field4116;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public int field4119;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public int field4122;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 10)
    public static final void method1757(byte arg0) {
        class194.field3133.method1349(true);
        if (arg0 == -104) {
            field4121++;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lqd;Lsd;B)I", line = 37)
    public static final int method1758(class40 arg0, class26 arg1, byte arg2) {
        field4125++;
        int var3 = arg1.field478;
        arg1.method236(32768, arg0.field766);
        if (arg2 >= -5) {
            field4123 = (class40) null;
        }
        arg1.field478 += class310.field5208.method993(arg1.field478, arg1.field472, arg0.field745, arg0.field766, 0, 21589);
        return arg1.field478 - var3;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lsd;B)Lni;", line = 56)
    public static final class23 method1759(class26 arg0, byte arg1) {
        field4115++;
        arg0.method226(255);
        int var2 = arg0.method226(255);
        class23 var3 = class221.method1549(var2, false);
        var3.field407 = arg0.method226(255);
        int var4 = arg0.method226(255);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method226(255);
            var3.method23(var6, 0, arg0);
        }
        int var7 = -105 % ((-arg1 - 80) / 35);
        var3.method61((byte) 4);
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 95)
    public static void method1760(int arg0) {
        field4123 = null;
        if (arg0 != 1) {
            field4117 = 105;
        }
        field4120 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V", line = 107)
    public static final void method1761(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4112++;
        int var5 = 0;
        int var6 = -63 % ((-arg2 - 12) / 40);
        int var7 = arg3;
        int var8 = -1;
        int var9 = -arg3;
        int var10 = class110.method827((byte) -93, arg0 + arg3, class48.field941, class125.field2164);
        int var11 = class110.method827((byte) 98, arg0 - arg3, class48.field941, class125.field2164);
        class150.method1124(var10, var11, arg4, true, class37.field694[arg1]);
        while (var7 > var5) {
            var8 += 2;
            var9 += var8;
            if (var9 > 0) {
                var7--;
                int var12 = arg1 - var7;
                int var13 = arg1 + var7;
                if (var13 >= class220.field3664 && class72.field1275 >= var12) {
                    int var14 = class110.method827((byte) 98, arg0 + var5, class48.field941, class125.field2164);
                    int var15 = class110.method827((byte) 75, arg0 - var5, class48.field941, class125.field2164);
                    if (var13 <= class72.field1275) {
                        class150.method1124(var14, var15, arg4, true, class37.field694[var13]);
                    }
                    if (var12 >= class220.field3664) {
                        class150.method1124(var14, var15, arg4, true, class37.field694[var12]);
                    }
                }
                var9 -= var7 << 1;
            }
            var5++;
            int var16 = arg1 + var5;
            int var17 = arg1 - var5;
            if (var16 >= class220.field3664 && var17 <= class72.field1275) {
                int var18 = class110.method827((byte) -103, arg0 + var7, class48.field941, class125.field2164);
                int var19 = class110.method827((byte) -55, arg0 - var7, class48.field941, class125.field2164);
                if (var16 <= class72.field1275) {
                    class150.method1124(var18, var19, arg4, true, class37.field694[var16]);
                }
                if (class220.field3664 <= var17) {
                    class150.method1124(var18, var19, arg4, true, class37.field694[var17]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(III)I", line = 202)
    public static final int method1762(int arg0, int arg1, int arg2) {
        field4113++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg0 == arg2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V")
    public abstract void method586(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
    public abstract void method587(int arg0, int arg1);
}
