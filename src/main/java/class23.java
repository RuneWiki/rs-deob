import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class23 extends class51 {

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "Z")
    public boolean field303 = false;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    private int field294 = -32768;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    private int field300 = 0;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
    private int field311 = 0;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Lkd;")
    private class117 field293;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "Lug;")
    public static class238 field302 = new class238(5000);

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "Lke;")
    public static class256 field309 = class316.method2202("(R", 27626);

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public static int field312 = 0;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "Lke;")
    public static class256 field310 = class316.method2202("violet:", 27626);

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "Lke;")
    public static class256 field313 = class316.method2202("<img=0>", 27626);

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "Lfk;")
    private class283 field306;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BI)V", line = 12)
    public final void method147(byte arg0, int arg1) {
        field305++;
        if (this.field303) {
            return;
        }
        this.field311 += arg1;
        while (this.field293.field2064[this.field300] < this.field311) {
            this.field311 -= this.field293.field2064[this.field300];
            this.field300++;
            if (this.field300 >= this.field293.field2040.length) {
                this.field303 = true;
                break;
            }
        }
        if (arg0 != -70) {
            this.method154();
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 46)
    public static final void method148(String arg0, boolean arg1) {
        for (int var2 = arg0.indexOf("%0a"); var2 != -1; var2 = arg0.indexOf("%0a", var2)) {
            arg0 = arg0.substring(0, var2) + "\n" + arg0.substring(var2 + 3);
        }
        field296++;
        if (arg1) {
            System.out.println("Error: " + arg0);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)Lha;", line = 71)
    private final class26 method149(int arg0) {
        field290++;
        if (arg0 >= -119) {
            this.field291 = 114;
        }
        class203 var2 = class302.method2113(true, this.field291);
        class26 var3;
        if (this.field303) {
            var3 = var2.method1440(-1, (byte) 11);
        } else {
            var3 = var2.method1440(this.field300, (byte) 11);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIIIIJILfk;)V", line = 94)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class283 arg10) {
        field307++;
        class26 var13 = this.method149(-125);
        if (var13 != null) {
            var13.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field306);
            this.field294 = var13.method154();
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V", line = 119)
    public static void method151(int arg0) {
        field310 = null;
        field302 = null;
        field309 = null;
        field313 = null;
        if (arg0 != 104) {
            method148((String) null, true);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIII)V", line = 132)
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field308++;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIIIIII)V", line = 457)
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field314 = arg3;
        this.field297 = arg5 + arg6;
        this.field304 = arg1;
        this.field291 = arg0;
        this.field298 = arg4;
        this.field301 = arg2;
        int var8 = class302.method2113(true, this.field291).field3688;
        if (var8 == -1) {
            this.field303 = true;
        } else {
            this.field303 = false;
            this.field293 = class250.method1682(var8, true);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIZIII)V", line = 169)
    public static final void method153(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field295++;
        if (class51.field937 == arg5 && class295.field5125 == arg6 && class7.field110 == arg1 || class216.method1512(128)) {
            return;
        }
        class7.field110 = arg1;
        class295.field5125 = arg6;
        class51.field937 = arg5;
        if (class216.method1512(128)) {
            class7.field110 = 0;
        }
        if (arg3) {
            class11.method67((byte) 74, 28);
        } else {
            class11.method67((byte) 74, 25);
        }
        class159.method1176(true, class177.field3127, (byte) 119);
        int var7 = class134.field2336;
        class134.field2336 = (arg5 - 6) * 8;
        int var8 = class10.field147;
        class10.field147 = (arg6 - 6) * 8;
        class65.field1151 = class289.method2013(-26, class295.field5125 * 8, class51.field937 * 8);
        int var9 = class134.field2336 - var7;
        int var10 = class134.field2336;
        class80.field1490 = null;
        int var11 = class10.field147 - var8;
        int var12 = class10.field147;
        if (arg3) {
            class311.field5357 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class279 var17 = class187.field3281[var16];
                if (var17 != null) {
                    var17.field1192 -= var9 * 128;
                    var17.field1197 -= var11 * 128;
                    if (var17.field1192 >= 0 && var17.field1192 <= 13184 && var17.field1197 >= 0 && var17.field1197 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field1215[var18] -= var9;
                            var17.field1254[var18] -= var11;
                        }
                        class141.field2480[class311.field5357++] = var16;
                    } else {
                        class187.field3281[var16].field4860 = null;
                        class187.field3281[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class279 var14 = class187.field3281[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field1215[var15] -= var9;
                        var14.field1254[var15] -= var11;
                    }
                    var14.field1197 -= var11 * 128;
                    var14.field1192 -= var9 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class144 var20 = class300.field5172[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field1215[var21] -= var9;
                    var20.field1254[var21] -= var11;
                }
                var20.field1197 -= var11 * 128;
                var20.field1192 -= var9 * 128;
            }
        }
        class255.field4377 = arg1;
        class121.field2124.method1058(false, arg2, (byte) -52, arg4);
        byte var22 = 0;
        byte var23 = 104;
        byte var24 = 1;
        if (var9 < 0) {
            var23 = -1;
            var24 = -1;
            var22 = 103;
        }
        byte var25 = 0;
        byte var26 = 104;
        byte var27 = 1;
        if (var11 < 0) {
            var25 = 103;
            var27 = -1;
            var26 = -1;
        }
        for (int var28 = var22; var28 != var23; var28 += var24) {
            for (int var29 = var25; var29 != var26; var29 += var27) {
                int var30 = var28 + var9;
                int var31 = var11 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class230.field3934[var32][var28][var29] = class230.field3934[var32][var30][var31];
                    } else {
                        class230.field3934[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class32 var33 = (class32) class124.field2196.method1270((byte) -121); var33 != null; var33 = (class32) class124.field2196.method1277(1)) {
            var33.field525 -= var9;
            var33.field514 -= var11;
            if (var33.field525 < 0 || var33.field514 < 0 || var33.field525 >= 104 || var33.field514 >= 104) {
                var33.method1199(21966);
            }
        }
        field312 = 0;
        if (class241.field4102 != 0) {
            class269.field4588 -= var11;
            class241.field4102 -= var9;
        }
        if (arg0 != -17682) {
            return;
        }
        if (arg3) {
            class72.field1319 -= var11 * 128;
            class48.field872 -= var9;
            class14.field189 -= var11;
            class288.field4984 -= var11;
            class111.field1943 -= var9;
            class50.field926 -= var9 * 128;
        } else {
            class192.field3510 = 1;
        }
        if (class253.field4323 && arg3 && (Math.abs(var9) > 104 || Math.abs(var11) > 104)) {
            class34.method240((byte) -104);
        }
        class13.field171 = -1;
        class57.field1038.method1275((byte) -68);
        class36.field632.method1275((byte) -90);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()I", line = 436)
    public final int method154() {
        field299++;
        return this.field294;
    }
}
