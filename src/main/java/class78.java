import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class78 {

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Llm;")
    public class160 field1295 = new class160();

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Lph;")
    private static class229 field1294 = class266.method1858("glow1:", 0);

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static volatile int field1296 = 0;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Lph;")
    public static class229 field1303 = field1294;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Lph;")
    public static class229 field1298 = class266.method1858("Interfaces charg-Bes", 0);

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lph;")
    public static class229 field1299 = field1294;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Llm;")
    private class160 field1305;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLlm;)V", line = 25)
    public final void method582(boolean arg0, class160 arg1) {
        if (arg1.field2586 != null) {
            arg1.method1132(4);
        }
        arg1.field2586 = this.field1295.field2586;
        field1297++;
        arg1.field2588 = this.field1295;
        if (!arg0) {
            this.method590(true);
        }
        arg1.field2586.field2588 = arg1;
        arg1.field2588.field2586 = arg1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)Lph;", line = 42)
    public static final class229 method583(int arg0, boolean arg1) {
        if (arg1) {
            return (class229) null;
        }
        field1300++;
        class229 var2 = class50.method354(0, arg0);
        for (int var3 = var2.method1642(97) - 3; var3 > 0; var3 -= 3) {
            var2 = class248.method1746(8528, new class229[] { var2.method1623(0, -30201, var3), client.field5428, var2.method1640(var3, -113) });
        }
        if (var2.method1642(-115) > 9) {
            return class248.method1746(8528, new class229[] { class136.field2201, var2.method1623(0, -30201, var2.method1642(-111) - 8), class329.field5613, class228.field3750, var2, class275.field4595 });
        } else if (var2.method1642(28) <= 6) {
            return class248.method1746(8528, new class229[] { class206.field3393, var2, class112.field1910 });
        } else {
            return class248.method1746(8528, new class229[] { class281.field4654, var2.method1623(0, -30201, var2.method1642(-94) - 4), class29.field476, class228.field3750, var2, class275.field4595 });
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Llc;", line = 72)
    public static final class324 method584(byte arg0, int arg1) {
        field1293++;
        if (arg0 != 18) {
            method584((byte) -76, -48);
        }
        class324 var2 = (class324) class254.field4238.method1413((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class223.field3671.method523(-95, arg1, 1);
        class324 var4 = new class324();
        if (var3 != null) {
            var4.method2221(arg1, new class164(var3), 0);
        }
        class254.field4238.method1419((long) arg1, 5216, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 488)
    public class78() {
        this.field1295.field2588 = this.field1295;
        this.field1295.field2586 = this.field1295;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V", line = 103)
    public static void method585(boolean arg0) {
        field1298 = null;
        if (arg0) {
            field1296 = 20;
        }
        field1303 = null;
        field1299 = null;
        field1294 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)Llm;", line = 117)
    public final class160 method586(byte arg0) {
        if (arg0 > -49) {
            this.method586((byte) -47);
        }
        class160 var2 = this.field1305;
        field1292++;
        if (this.field1295 == var2) {
            this.field1305 = null;
            return null;
        } else {
            this.field1305 = var2.field2588;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)Llm;", line = 154)
    public final class160 method587(byte arg0) {
        field1307++;
        if (arg0 >= -2) {
            this.method582(true, (class160) null);
        }
        class160 var2 = this.field1295.field2588;
        if (this.field1295 == var2) {
            this.field1305 = null;
            return null;
        } else {
            this.field1305 = var2.field2588;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZIIIIII)V", line = 180)
    public static final void method588(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1302++;
        int var8 = class178.method1278(class214.field3533, arg0, -18842, class206.field3398);
        int var9 = class178.method1278(class214.field3533, arg2, -18842, class206.field3398);
        int var10 = class178.method1278(class77.field1289, arg3, -18842, class192.field3172);
        int var11 = class178.method1278(class77.field1289, arg7, -18842, class192.field3172);
        int var12 = class178.method1278(class214.field3533, arg0 + arg5, -18842, class206.field3398);
        int var13 = class178.method1278(class214.field3533, arg2 - arg5, -18842, class206.field3398);
        for (int var14 = var8; var14 < var12; var14++) {
            class193.method1354((byte) -37, var11, var10, arg4, class202.field3337[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class193.method1354((byte) -37, var11, var10, arg4, class202.field3337[var15]);
        }
        int var16 = class178.method1278(class77.field1289, arg3 + arg5, -18842, class192.field3172);
        if (!arg1) {
            method589(-8, -72, -32, true, -39, -17, 56);
        }
        int var17 = class178.method1278(class77.field1289, arg7 - arg5, -18842, class192.field3172);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class202.field3337[var18];
            class193.method1354((byte) -37, var16, var10, arg4, var19);
            class193.method1354((byte) -37, var17, var16, arg6, var19);
            class193.method1354((byte) -37, var11, var17, arg4, var19);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIZIII)V", line = 231)
    public static final void method589(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field1306++;
        if (class122.field2054 == arg0 && class95.field1611 == arg6 && class102.field1742 == arg1 || class61.method415((byte) 68)) {
            return;
        }
        class95.field1611 = arg6;
        class102.field1742 = arg1;
        class122.field2054 = arg0;
        if (class61.method415((byte) 68)) {
            class102.field1742 = 0;
        }
        if (arg3) {
            class80.method595(28, (byte) -128);
        } else {
            class80.method595(25, (byte) -128);
        }
        class10.method71((byte) -86, true, class138.field2233);
        int var7 = class1.field9;
        int var8 = class1.field1;
        class1.field9 = (arg0 - 6) * 8;
        if (arg5 != 25) {
            field1299 = (class229) null;
        }
        class1.field1 = arg6 * 8 - 48;
        class183.field2976 = class60.method404(40, class122.field2054 * 8, class95.field1611 * 8);
        int var9 = class1.field9 - var7;
        int var10 = class1.field1 - var8;
        class84.field1441 = null;
        int var11 = class1.field1;
        int var12 = class1.field9;
        if (arg3) {
            class253.field4233 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class217 var17 = class187.field3035[var16];
                if (var17 != null) {
                    var17.field5147 -= var9 * 128;
                    var17.field5168 -= var10 * 128;
                    if (var17.field5147 >= 0 && var17.field5147 <= 13184 && var17.field5168 >= 0 && var17.field5168 <= 13184) {
                        for (int var18 = 0; var18 < 10; var18++) {
                            var17.field5104[var18] -= var9;
                            var17.field5159[var18] -= var10;
                        }
                        class162.field2620[class253.field4233++] = var16;
                    } else {
                        class187.field3035[var16].field3559 = null;
                        class187.field3035[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class217 var14 = class187.field3035[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field5104[var15] -= var9;
                        var14.field5159[var15] -= var10;
                    }
                    var14.field5168 -= var10 * 128;
                    var14.field5147 -= var9 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class209 var20 = class114.field1931[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field5104[var21] -= var9;
                    var20.field5159[var21] -= var10;
                }
                var20.field5168 -= var10 * 128;
                var20.field5147 -= var9 * 128;
            }
        }
        byte var22 = 0;
        class298.field4849 = arg1;
        class230.field3820.method1454(arg2, (byte) -105, false, arg4);
        byte var23 = 104;
        byte var24 = 1;
        if (var9 < 0) {
            var24 = -1;
            var23 = -1;
            var22 = 103;
        }
        byte var25 = 104;
        byte var26 = 0;
        byte var27 = 1;
        if (var10 < 0) {
            var26 = 103;
            var25 = -1;
            var27 = -1;
        }
        for (int var28 = var22; var28 != var23; var28 += var24) {
            for (int var29 = var26; var29 != var25; var29 += var27) {
                int var30 = var9 + var28;
                int var31 = var10 + var29;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                        class8.field108[var32][var28][var29] = class8.field108[var32][var30][var31];
                    } else {
                        class8.field108[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class218 var33 = (class218) class225.field3687.method1580((byte) -39); var33 != null; var33 = (class218) class225.field3687.method1579((byte) 28)) {
            var33.field3575 -= var9;
            var33.field3588 -= var10;
            if (var33.field3575 < 0 || var33.field3588 < 0 || var33.field3575 >= 104 || var33.field3588 >= 104) {
                var33.method598(105);
            }
        }
        if (arg3) {
            class222.field3649 -= var9;
            class306.field5174 -= var9;
            class48.field698 -= var10;
            class167.field2725 -= var10 * 128;
            class236.field3887 -= var10;
            class192.field3177 -= var9 * 128;
        } else {
            class217.field3565 = 1;
        }
        if (class68.field1086 != 0) {
            class68.field1086 -= var9;
            class133.field2155 -= var10;
        }
        class189.field3063 = 0;
        if (class99.field1675 && arg3 && (Math.abs(var9) > 104 || Math.abs(var10) > 104)) {
            class101.method778((byte) -88);
        }
        class262.field4380 = -1;
        class186.field3023.method1573((byte) -48);
        class226.field3712.method1573((byte) -48);
        class194.method1362();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V", line = 504)
    public final void method590(boolean arg0) {
        while (true) {
            class160 var2 = this.field1295.field2588;
            if (this.field1295 == var2) {
                if (!arg0) {
                    method588(31, true, -33, 82, 103, 18, -82, -42);
                }
                field1301++;
                this.field1305 = null;
                return;
            }
            var2.method1132(4);
        }
    }
}
