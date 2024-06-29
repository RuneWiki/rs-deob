import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class108 {

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Lra;")
    private class179 field1295 = new class179();

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Lp;")
    private class161 field1300 = new class161();

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Ltm;")
    private class349 field1298;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Lhq;")
    public static class365 field1288 = new class365(50);

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Lwo;")
    public static class285 field1294;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "[I")
    public static int[] field1297;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(JLra;B)V")
    public final void method643(long arg0, class179 arg1, byte arg2) {
        if (arg2 != 122) {
            return;
        }
        field1290++;
        if (this.field1299 == 0) {
            class179 var5 = this.field1300.method1024(arg2 + 134);
            var5.method263(false);
            var5.method1123((byte) -31);
            if (this.field1295 == var5) {
                class179 var6 = this.field1300.method1024(arg2 + 134);
                var6.method263(false);
                var6.method1123((byte) -31);
            }
        } else {
            this.field1299--;
        }
        this.field1298.method2227(arg1, -8218, arg0);
        this.field1300.method1028((byte) 33, arg1);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static final void method644(byte arg0) {
        field1292++;
        int var1 = class262.field3375.length;
        if (arg0 != -65) {
            field1296 = 74;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class262.field3375[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class390.field5320; var4++) {
                    if (class358.field4867[var2] == class298.field3982[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class298.field3982[class390.field5320] = class358.field4867[var2];
                    var3 = class390.field5320++;
                }
                class242 var5 = new class242(class262.field3375[var2]);
                int var6 = 0;
                while (var5.field3211 < class262.field3375[var2].length && var6 < 511 && class106.field1263 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1587((byte) -102);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FE1) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class358.field4867[var2] >> 8) * 64 + var10 - class278.field3608;
                    int var13 = (class358.field4867[var2] & 0xFF) * 64 + var11 - class129.field1432;
                    class307 var14 = class225.method1387(var5.method1587((byte) -102), (byte) -121);
                    if (class220.field2726[var7] == null && (var14.field4139 & 0x1) > 0 && class41.field488 == var9 && var12 >= 0 && var14.field4106 + var12 < class22.field232 && var13 >= 0 && class196.field2329 > var14.field4106 + var13) {
                        class220.field2726[var7] = new class298();
                        class220.field2726[var7].field2445 = var7;
                        class298 var15 = class220.field2726[var7];
                        class437.field5984[class106.field1263++] = var7;
                        var15.field2427 = class106.field1273;
                        var15.method1888(var14, 8);
                        var15.method1252(var15.field3971.field4106, 1);
                        var15.field2421 = var15.field3971.field4127 << 3;
                        if (var15.field2421 == 0) {
                            var15.method1254((byte) 22, 0);
                        } else {
                            var15.method1254((byte) 22, var15.field3971.field4128 + 4 << 11 & 0x3954);
                        }
                        var15.method1258(true, var15.method841(true), -1, var13, var9, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZZZI)V")
    public static final void method645(int arg0, boolean arg1, boolean arg2, boolean arg3, int arg4) {
        class180.method1125(arg3, arg0, arg4, arg2, 0, (byte) -121, class213.field2614.length - 1);
        field1291++;
        if (!arg1) {
            class213.field2603 = 0;
            class12.field148 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method646(int arg0) {
        field1297 = null;
        int var1 = 74 / ((arg0 - 27) / 53);
        field1288 = null;
        field1294 = null;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
    public static final void method647(byte arg0) {
        class345.field4691 = new class189(8);
        int var1 = 68 / ((arg0 + 60) / 36);
        field1293++;
        class136.field1547 = 0;
        for (class69 var2 = (class69) class220.field2722.method1838(-6325); var2 != null; var2 = (class69) class220.field2722.method1834((byte) 72)) {
            var2.method407();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IJ)Lra;")
    public final class179 method648(int arg0, long arg1) {
        field1289++;
        class179 var4 = (class179) this.field1298.method2218(arg0, arg1);
        if (var4 != null) {
            this.field1300.method1028((byte) 33, var4);
        }
        if (arg0 != 1) {
            field1297 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public final void method649(int arg0) {
        field1287++;
        if (arg0 != -29832) {
            method645(-34, true, false, true, -76);
        }
        this.field1300.method1021(arg0 ^ 0xFFFFDA4F);
        this.field1298.method2216((byte) -112);
        this.field1295 = new class179();
        this.field1299 = this.field1301;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
    public class108(int arg0) {
        this.field1299 = arg0;
        this.field1301 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1298 = new class349(var2);
    }
}
