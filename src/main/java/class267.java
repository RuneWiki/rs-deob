import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class267 extends class73 {

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "Lpia;")
    public static class94 field3310 = new class94(72, 6);

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "Lrb;")
    public static class352 field3321 = new class352();

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
    public static int field3323 = 0;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "Ldh;")
    public static class320 field3324 = new class320(77, 3);

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "J")
    public long field3325;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "Lsb;")
    public static class290 field3319;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)V")
    public static void method1601(byte arg0) {
        field3310 = null;
        if (arg0 > -116) {
            field3321 = null;
        }
        field3321 = null;
        field3324 = null;
        field3319 = null;
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)V")
    public static final void method1602(byte arg0) {
        field3314++;
        class181.field2142.method3541(-647);
        if (arg0 != 115) {
            field3310 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(III)V")
    public static final void method1603(int arg0, int arg1, int arg2) {
        boolean var3 = class638.field9170[0][arg1][arg2] != null && class638.field9170[0][arg1][arg2].field9737 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class638.field9170[var4][arg1][arg2] == null) {
                class691 var5 = class638.field9170[var4][arg1][arg2] = new class691(var4);
                if (var3) {
                    var5.field9727++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)I")
    public final int method530(int arg0) {
        field3320++;
        if (arg0 != -1) {
            this.method535((byte) 115);
        }
        return this.field3312;
    }

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "(I)J")
    public final long method534(int arg0) {
        field3326++;
        if (arg0 != -1) {
            this.method535((byte) -112);
        }
        return this.field3325;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILgh;Ljava/awt/Component;II)Lnc;")
    public static final class24 method1604(int arg0, class546 arg1, Component arg2, int arg3, int arg4) {
        field3316++;
        if (arg0 != -8798) {
            method1602((byte) 53);
        }
        if (class277.field3387 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class24 var5 = (class24) Class.forName("fo").getDeclaredConstructor().newInstance();
                var5.field223 = new int[(class54.field556 ? 2 : 1) * 256];
                var5.field245 = arg3;
                var5.method114(arg2);
                var5.field241 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field241 > 16384) {
                    var5.field241 = 16384;
                }
                var5.method115(var5.field241);
                if (class332.field4303 > 0 && class341.field4405 == null) {
                    class341.field4405 = new class635();
                    class341.field4405.field9135 = arg1;
                    arg1.method3215(class332.field4303, class341.field4405, 2);
                }
                if (class341.field4405 != null) {
                    if (class341.field4405.field9133[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class341.field4405.field9133[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class499 var6 = new class499(arg1, arg4);
                    var6.field245 = arg3;
                    var6.field223 = new int[(class54.field556 ? 2 : 1) * 256];
                    var6.method114(arg2);
                    var6.field241 = 16384;
                    var6.method115(var6.field241);
                    if (class332.field4303 > 0 && class341.field4405 == null) {
                        class341.field4405 = new class635();
                        class341.field4405.field9135 = arg1;
                        arg1.method3215(class332.field4303, class341.field4405, 2);
                    }
                    if (class341.field4405 != null) {
                        if (class341.field4405.field9133[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class341.field4405.field9133[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class24();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)I")
    public final int method533(int arg0) {
        if (arg0 >= -99) {
            field3327 = -84;
        }
        field3313++;
        return this.field3317;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)I")
    public final int method532(int arg0) {
        field3322++;
        int var2 = 2 % ((-arg0 - 19) / 35);
        return this.field3311;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)I")
    public final int method535(byte arg0) {
        if (arg0 != -25) {
            field3321 = null;
        }
        field3318++;
        return this.field3315;
    }
}
