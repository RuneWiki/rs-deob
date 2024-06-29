import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class class211 {

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Ll;")
    public static class66 field3246 = new class66(30);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lrg;B)Ljava/lang/String;", line = 6)
    public static final String method1559(class342 arg0, byte arg1) {
        field3247++;
        if (client.method1022(arg0).method1695(-1) == 0) {
            return null;
        } else if (arg1 != -101) {
            return (String) null;
        } else if (arg0.field5294 == null || arg0.field5294.trim().length() == 0) {
            return class18.field290 ? "Hidden-use" : null;
        } else {
            return arg0.field5294;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIJ)Z", line = 31)
    public static final boolean method1560(int arg0, int arg1, int arg2, long arg3) {
        if (arg2 > -66) {
            field3246 = (class66) null;
        }
        field3244++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        int var6 = ((int) arg3 & 0x313CE7) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class212 var8 = class43.method437(99, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field3306;
                var10 = var8.field3250;
            } else {
                var9 = var8.field3250;
                var10 = var8.field3306;
            }
            int var11 = var8.field3310;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class191.method1461(true, class173.field2746.field1300[0], var11, 0, var9, class173.field2746.field1290[0], arg1, 0, var10, arg0, (byte) 121);
        } else {
            class191.method1461(true, class173.field2746.field1300[0], 0, var6, 0, class173.field2746.field1290[0], arg1, var5 + 1, 0, arg0, (byte) 125);
        }
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V", line = 80)
    public static void method1561(int arg0) {
        if (arg0 < 54) {
            field3246 = (class66) null;
        }
        field3246 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V", line = 90)
    public static final void method1562(int arg0, int arg1, int arg2) {
        if (arg1 == 8) {
            arg1 = 4;
        }
        if (arg2 > -23) {
            method1559((class342) null, (byte) -61);
        }
        field3245++;
        if (arg1 == 4 && !class164.field2603) {
            arg1 = 2;
            arg0 = 2;
        }
        if (class14.field233 != arg1) {
            if (class144.field2355) {
                return;
            }
            if (class14.field233 != 0) {
                class138.field2284[class14.field233].method232();
            }
            if (arg1 != 0) {
                class182 var3 = class138.field2284[arg1];
                var3.method231();
                var3.method229(arg0);
            }
            class14.field233 = arg1;
            class262.field4020 = arg0;
        } else if (arg1 != 0 && class262.field4020 != arg0) {
            class138.field2284[arg1].method229(arg0);
            class262.field4020 = arg0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)J")
    public abstract long method2(int arg0);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public abstract void method3(int arg0);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(III)I")
    public abstract int method4(int arg0, int arg1, int arg2);
}
