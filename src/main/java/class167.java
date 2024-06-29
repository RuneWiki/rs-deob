import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class167 {

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field2613 = 0;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Loh;")
    public static class281 field2612 = new class281(64);

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field2618 = -1;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Loh;")
    public static class281 field2617 = new class281(200);

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field2619 = 0;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field2620 = 0;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "[I")
    public static int[] field2621 = new int[2000];

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[I")
    public static int[] field2616;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "[Led;")
    public static class186[] field2615;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static final void method1125(int arg0) {
        field2611++;
        if (class80.field1340) {
            return;
        }
        class115.field1877 = true;
        if (class109.field1782) {
            class142.field2160 = (float) ((int) class142.field2160 - 17 & 0xFFFFFFF0);
        } else {
            class43.field613 += (-class43.field613 - 12.0F) / 2.0F;
        }
        class80.field1340 = true;
        if (arg0 != -17) {
            method1127(121, 64, 99, (byte) 37, -1, 54);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lhg;")
    public static final class181 method1126(Throwable arg0, String arg1) {
        field2610++;
        class181 var2;
        if ((arg0 instanceof class181)) {
            var2 = (class181) arg0;
            var2.field2823 = var2.field2823 + ' ' + arg1;
        } else {
            var2 = new class181(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIBII)V")
    public static final void method1127(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg4 <= class266.field4247 && class90.field1568 <= arg0) {
            boolean var6;
            if (class223.field3423 > arg1) {
                arg1 = class223.field3423;
                var6 = false;
            } else if (arg1 <= class148.field2338) {
                var6 = true;
            } else {
                arg1 = class148.field2338;
                var6 = false;
            }
            boolean var7;
            if (arg2 < class223.field3423) {
                arg2 = class223.field3423;
                var7 = false;
            } else if (class148.field2338 >= arg2) {
                var7 = true;
            } else {
                var7 = false;
                arg2 = class148.field2338;
            }
            if (class90.field1568 <= arg4) {
                class166.method1124(true, class154.field2406[arg4++], arg2, arg5, arg1);
            } else {
                arg4 = class90.field1568;
            }
            if (class266.field4247 >= arg0) {
                class166.method1124(true, class154.field2406[arg0--], arg2, arg5, arg1);
            } else {
                arg0 = class266.field4247;
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg0; var8++) {
                    int[] var9 = class154.field2406[var8];
                    var9[arg1] = var9[arg2] = arg5;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg0; var10++) {
                    class154.field2406[var10][arg1] = arg5;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg0; var11++) {
                    class154.field2406[var11][arg2] = arg5;
                }
            }
        }
        field2614++;
        if (arg3 != 93) {
            method1126((Throwable) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static void method1128(byte arg0) {
        field2612 = null;
        field2615 = null;
        field2616 = null;
        field2621 = null;
        if (arg0 > -3) {
            field2621 = null;
        }
        field2617 = null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static final void method1129(int arg0) {
        field2609++;
        class154.method1036(arg0 ^ 0x37CA);
        class182.method1238(0);
        class81.method580((byte) 9);
        class212.method1435((byte) 27);
        class157.method1065(-81);
        class142.method958(false);
        class126.method875(124);
        class108.method775(false);
        class86.method606(96);
        class257.method1744(111);
        class227.method1509((byte) 90);
        class149.method1006(-88);
        class161.method1092((byte) 125);
        class155.method1039((byte) 47);
        class143.method960(true);
        class267.method1802((byte) -19);
        class71.method510(arg0 - 14161);
        class115.method815(arg0 - 14173);
        if (class183.field2843 != 0) {
            for (int var1 = 0; var1 < class277.field4396.length; var1++) {
                class277.field4396[var1] = null;
            }
            class145.field2311 = 0;
        }
        if (arg0 != 14280) {
            method1129(6);
        }
        class213.method1448(6876);
        class100.method734(96);
        class217.field3355.method1898((byte) -85);
        ((class187) class195.field3087).method1261((byte) 75);
        class84.field1411.method738((byte) -122);
        class4.field41.method1614(-49);
        class227.field3461.method1614(-65);
        class283.field4465.method1614(-89);
        class135.field2097.method1614(-65);
        class17.field252.method1614(arg0 ^ 0xFFFFC815);
        class31.field459.method1614(-43);
        class208.field3246.method1614(-87);
        class130.field2055.method1614(-120);
        class62.field1074.method1614(-44);
        class240.field3901.method1614(-51);
        class132.field2073.method1614(-52);
        class181.field2824.method1898((byte) -124);
    }
}
