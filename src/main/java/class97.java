import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class97 extends class29 {

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "Lea;")
    public class40 field2065 = new class40();

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "Ltd;")
    public class175 field2070 = new class175();

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "Lkf;")
    private class96 field2061;

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "Leh;")
    public static class47 field2057 = class195.method1282((byte) -4, "sl_button");

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "Leh;")
    public static class47 field2056 = class195.method1282((byte) -4, "mapedge");

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "Leh;")
    private static class47 field2060 = class195.method1282((byte) -4, "glow1:");

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "Leh;")
    public static class47 field2064 = field2060;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field2066 = 0;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "Leh;")
    public static class47 field2067 = class195.method1282((byte) -4, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "Leh;")
    public static class47 field2059 = field2060;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field2054 = 0;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "Leh;")
    public static class47 field2068 = class195.method1282((byte) -4, "<img=1>");

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "()Lch;")
    public final class29 method128() {
        field2051++;
        class130 var1;
        do {
            var1 = (class130) this.field2065.method348(13949);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2550 == null);
        return var1.field2550;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II[IIILod;)V")
    private final void method793(int arg0, int arg1, int[] arg2, int arg3, int arg4, class130 arg5) {
        if (arg0 != -27227) {
            this.method151(null, 34, -116);
        }
        field2063++;
        if ((this.field2061.field2010[arg5.field2573] & 0x4) != 0 && arg5.field2563 < 0) {
            int var7 = this.field2061.field1994[arg5.field2573] / class110.field2276;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field2576) / var7;
                if (var8 > arg4) {
                    arg5.field2576 += arg4 * var7;
                    break;
                }
                arg5.field2550.method151(arg2, arg1, var8);
                arg4 -= var8;
                arg1 += var8;
                int var9 = class110.field2276 / 100;
                int var10 = 262144 / var7;
                class15 var11 = arg5.field2550;
                arg5.field2576 += var7 * var8 - 1048576;
                if (var9 > var10) {
                    var9 = var10;
                }
                if (this.field2061.field2017[arg5.field2573] == 0) {
                    arg5.field2550 = class15.method148(arg5.field2562, var11.method137(), var11.method135(), var11.method160());
                } else {
                    arg5.field2550 = class15.method148(arg5.field2562, var11.method137(), 0, var11.method160());
                    this.field2061.method778(29906, arg5.field2558.field3407[arg5.field2566] < 0, arg5);
                    arg5.field2550.method147(var9, var11.method135());
                }
                if (arg5.field2558.field3407[arg5.field2566] < 0) {
                    arg5.field2550.method159(-1);
                }
                var11.method164(var9);
                var11.method151(arg2, arg1, arg3 - arg1);
                if (var11.method166()) {
                    this.field2070.method1174(var11);
                }
            }
        }
        arg5.field2550.method151(arg2, arg1, arg4);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()I")
    public final int method127() {
        field2058++;
        return 0;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "()Lch;")
    public final class29 method153() {
        field2050++;
        class130 var1 = (class130) this.field2065.method345(-100);
        if (var1 == null) {
            return null;
        } else if (var1.field2550 == null) {
            return this.method128();
        } else {
            return var1.field2550;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([III)V")
    public final void method151(int[] arg0, int arg1, int arg2) {
        this.field2070.method151(arg0, arg1, arg2);
        field2062++;
        for (class130 var4 = (class130) this.field2065.method345(-122); var4 != null; var4 = (class130) this.field2065.method348(13949)) {
            if (!this.field2061.method779(var4, -1)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2584) {
                        this.method793(-27227, var5, arg0, var5 + var6, var6, var4);
                        var4.field2584 -= var6;
                        break;
                    }
                    this.method793(-27227, var5, arg0, var5 + var6, var4.field2584, var4);
                    var5 += var4.field2584;
                    var6 -= var4.field2584;
                } while (!this.field2061.method791(60, var4, arg0, var6, var5));
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public final void method136(int arg0) {
        this.field2070.method136(arg0);
        for (class130 var2 = (class130) this.field2065.method345(-98); var2 != null; var2 = (class130) this.field2065.method348(13949)) {
            if (!this.field2061.method779(var2, -1)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2584) {
                        this.method794(var3, -128, var2);
                        var2.field2584 -= var3;
                        break;
                    }
                    this.method794(var2.field2584, -125, var2);
                    var3 -= var2.field2584;
                } while (!this.field2061.method791(77, var2, null, var3, 0));
            }
        }
        field2055++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILod;)V")
    private final void method794(int arg0, int arg1, class130 arg2) {
        if ((this.field2061.field2010[arg2.field2573] & 0x4) != 0 && arg2.field2563 < 0) {
            int var4 = this.field2061.field1994[arg2.field2573] / class110.field2276;
            int var5 = (var4 + 1048575 - arg2.field2576) / var4;
            arg2.field2576 = arg0 * var4 + arg2.field2576 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field2061.field2017[arg2.field2573] == 0) {
                    arg2.field2550 = class15.method148(arg2.field2562, arg2.field2550.method137(), arg2.field2550.method135(), arg2.field2550.method160());
                } else {
                    arg2.field2550 = class15.method148(arg2.field2562, arg2.field2550.method137(), 0, arg2.field2550.method160());
                    this.field2061.method778(29906, arg2.field2558.field3407[arg2.field2566] < 0, arg2);
                }
                if (arg2.field2558.field3407[arg2.field2566] < 0) {
                    arg2.field2550.method159(-1);
                }
                arg0 = arg2.field2576 / var4;
            }
        }
        arg2.field2550.method136(arg0);
        int var6 = -60 % ((arg1 + 65) / 54);
        field2053++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method795(byte arg0) {
        field2056 = null;
        field2064 = null;
        field2057 = null;
        field2060 = null;
        field2068 = null;
        field2059 = null;
        field2067 = null;
        if (arg0 < 41) {
            method795((byte) -35);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lkf;)V")
    public class97(class96 arg0) {
        this.field2061 = arg0;
    }
}
