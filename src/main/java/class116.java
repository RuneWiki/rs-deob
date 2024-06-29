import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class116 extends class122 {

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Lwb;")
    public class147 field1994;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1989 = 0;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "[I")
    public static int[] field1990 = new int[50];

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLqd;)Lqd;", line = 7)
    public static final class40 method883(byte arg0, class40 arg1) {
        int var2 = class301.method2059(110, arg1);
        if (arg0 > -102) {
            return (class40) null;
        } else {
            field1987++;
            return var2 == -1 ? class261.field4384 : class160.field2670.field5291[var2].method338(class27.field554, true, class120.field2021);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([Lda;I[Lda;[Lda;[Lda;Lce;[Lmb;)V", line = 26)
    public static final void method884(class114[] arg0, int arg1, class114[] arg2, class114[] arg3, class114[] arg4, class239 arg5, class99[] arg6) {
        class292.field4884 = arg6;
        class213.field3563 = arg0;
        class15.field251 = arg4;
        client.field4061 = arg3;
        class98.field1745 = arg2;
        class140.field2364 = arg5;
        field1991++;
        class80.field1386.method1966((byte) 13);
        int var7 = class140.field2364.method1665(class163.field2708, (byte) -61);
        int[] var8 = class140.field2364.method1673((byte) -126, var7);
        for (int var9 = arg1; var9 < var8.length; var9++) {
            class80.field1386.method1972(class151.method1134((byte) -84, new class26(class140.field2364.method1651(var7, var8[var9], -1))), -104);
        }
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V", line = 68)
    public static void method885(int arg0) {
        field1990 = null;
        if (arg0 != -28194) {
            field1989 = 117;
        }
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V", line = 87)
    public static final void method886(int arg0) {
        field1993++;
        if (class272.field4520 == 0) {
            return;
        }
        try {
            if (++class193.field3116 > 2000) {
                if (class140.field2369 != null) {
                    class140.field2369.method784(98);
                    class140.field2369 = null;
                }
                if (class194.field3125 >= 1) {
                    class189.field3069 = -5;
                    class272.field4520 = 0;
                    return;
                }
                class194.field3125++;
                if (class23.field398 == class20.field340) {
                    class23.field398 = class233.field3843;
                } else {
                    class23.field398 = class20.field340;
                }
                class272.field4520 = 1;
                class193.field3116 = 0;
            }
            int var1 = -46 / ((arg0 + 6) / 36);
            if (class272.field4520 == 1) {
                class315.field5321 = class275.field4573.method812(class195.field3145, class23.field398, 14038);
                class272.field4520 = 2;
            }
            if (class272.field4520 == 2) {
                if (class315.field5321.field1258 == 2) {
                    throw new IOException();
                }
                if (class315.field5321.field1258 != 1) {
                    return;
                }
                class140.field2369 = new class104((Socket) class315.field5321.field1260, class275.field4573);
                class315.field5321 = null;
                class140.field2369.method779(class19.field295.field478, 16333, 0, class19.field295.field472);
                if (class119.field2011 != null) {
                    class119.field2011.method111(5000);
                }
                if (class248.field4107 != null) {
                    class248.field4107.method111(5000);
                }
                int var2 = class140.field2369.method789((byte) 22);
                if (class119.field2011 != null) {
                    class119.field2011.method111(5000);
                }
                if (class248.field4107 != null) {
                    class248.field4107.method111(5000);
                }
                if (var2 != 21) {
                    class272.field4520 = 0;
                    class189.field3069 = var2;
                    class140.field2369.method784(120);
                    class140.field2369 = null;
                    return;
                }
                class272.field4520 = 3;
            }
            if (class272.field4520 == 3) {
                if (class140.field2369.method790((byte) 66) < 1) {
                    return;
                }
                class244.field4032 = new class40[class140.field2369.method789((byte) 22)];
                class272.field4520 = 4;
            }
            if (class272.field4520 == 4) {
                if (class140.field2369.method790((byte) 66) < (class244.field4032.length * 8)) {
                    return;
                }
                class95.field1715.field478 = 0;
                class140.field2369.method785(class244.field4032.length * 8, class95.field1715.field472, 0, 28016);
                for (int var3 = 0; var3 < class244.field4032.length; var3++) {
                    class244.field4032[var3] = class199.method1401(class95.field1715.method212((byte) 113), 1);
                }
                class272.field4520 = 0;
                class189.field3069 = 21;
                class140.field2369.method784(57);
                class140.field2369 = null;
                return;
            }
        } catch (IOException var5) {
            if (class140.field2369 != null) {
                class140.field2369.method784(57);
                class140.field2369 = null;
            }
            if (class194.field3125 < 1) {
                class272.field4520 = 1;
                class194.field3125++;
                if (class23.field398 == class20.field340) {
                    class23.field398 = class233.field3843;
                } else {
                    class23.field398 = class20.field340;
                }
                class193.field3116 = 0;
            } else {
                class189.field3069 = -4;
                class272.field4520 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lwb;)V", line = 244)
    public class116(class147 arg0) {
        this.field1994 = arg0;
    }
}
