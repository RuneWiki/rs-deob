import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 {

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "Lcd;")
    public class17 field1358 = new class17();

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1345 = -1;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lke;")
    private static class65 field1347 = class1.method17("To", -116);

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lke;")
    public static class65 field1344 = field1347;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lke;")
    public static class65 field1340 = class1.method17("@gr3@", -125);

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1343 = 0;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "Lke;")
    public static class65 field1356 = class1.method17("Benutzen", -113);

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1361 = 0;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "Lke;")
    private static class65 field1364 = class1.method17("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members", -126);

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "[I")
    public static int[] field1346 = new int[25];

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Lke;")
    public static class65 field1352 = field1364;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Z")
    public static boolean field1359 = false;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "Lke;")
    private static class65 field1370 = class1.method17("Account locked as we suspect it has been stolen)3", -113);

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lke;")
    public static class65 field1350 = field1370;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "Lke;")
    public static class65 field1371 = class1.method17("@cr1@", -125);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Lcd;")
    private class17 field1369;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "[I")
    public static int[] field1366;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lcd;", line = 4)
    public final class17 method415(int arg0) {
        field1353++;
        class17 var2 = this.field1369;
        if (this.field1358 == var2) {
            this.field1369 = null;
            return null;
        } else {
            this.field1369 = var2.field354;
            int var3 = 75 % ((arg0 - 19) / 53);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V", line = 24)
    public static void method416(boolean arg0) {
        field1344 = null;
        field1371 = null;
        if (!arg0) {
            method419(true, 85, true, false, -105);
        }
        field1364 = null;
        field1366 = null;
        field1340 = null;
        field1347 = null;
        field1350 = null;
        field1370 = null;
        field1346 = null;
        field1352 = null;
        field1356 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljd;BLjd;)I", line = 47)
    public static final int method417(class58 arg0, byte arg1, class58 arg2) {
        field1360++;
        int var3 = 0;
        if (arg0.method485(class24.field592, -27716, class47.field1228)) {
            var3++;
        }
        if (arg2.method485(class24.field592, arg1 - 27683, class31.field811)) {
            var3++;
        }
        if (arg2.method485(class24.field592, -27716, class125.field3035)) {
            var3++;
        }
        if (arg2.method485(class24.field592, -27716, class6.field115)) {
            var3++;
        }
        if (arg1 == -33) {
            if (arg2.method485(class24.field592, -27716, class41.field1096)) {
                var3++;
            }
            return var3;
        } else {
            return -42;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Lcd;", line = 84)
    public final class17 method418(byte arg0) {
        field1355++;
        class17 var2 = this.field1358.field354;
        if (this.field1358 == var2) {
            return null;
        }
        if (arg0 != -19) {
            method419(false, 41, true, false, 54);
        }
        var2.method133(2);
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIZZI)Lta;", line = 102)
    public static final class112 method419(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg1 != 1000000) {
            return null;
        }
        field1349++;
        class70 var5 = null;
        if (class88.field2343 != null) {
            var5 = new class70(arg4, class88.field2343, class10.field188[arg4], 1000000);
        }
        return new class112(var5, class91.field2412, arg4, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 150)
    public final void method420(int arg0) {
        if (arg0 < 36) {
            field1364 = null;
        }
        field1368++;
        while (true) {
            class17 var2 = this.field1358.field353;
            if (this.field1358 == var2) {
                return;
            }
            var2.method133(2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Lcd;", line = 172)
    public final class17 method421(int arg0) {
        field1362++;
        class17 var2 = this.field1358.field353;
        if (this.field1358 == var2) {
            this.field1369 = null;
            return null;
        } else if (arg0 == 1) {
            this.field1369 = var2.field353;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)Lcd;", line = 198)
    public final class17 method422(int arg0) {
        class17 var2 = this.field1358.field353;
        if (arg0 != -32) {
            this.method415(-75);
        }
        field1341++;
        if (this.field1358 == var2) {
            return null;
        } else {
            var2.method133(2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIII)V", line = 229)
    public static final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1351++;
        if (arg1 != 19542) {
            method423(27, 106, -24, -33, -13, 25);
        }
        class47.field1241[0].method963(arg4, arg3);
        int var6 = (arg5 - 32) * arg5 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        class47.field1241[1].method963(arg4, arg3 + arg5 - 16);
        class108.method886(arg4, arg3 + 16, 16, arg5 - 32, class74.field1969);
        int var7 = (arg5 - var6 - 32) * arg0 / (arg2 - arg5);
        class108.method886(arg4, arg3 + var7 + 16, 16, var6, class33.field868);
        class108.method891(arg4, var7 + arg3 + 16, var6, class47.field1226);
        class108.method891(arg4 + 1, arg3 + var7 + 16, var6, class47.field1226);
        class108.method892(arg4, arg3 + var7 + 16, 16, class47.field1226);
        class108.method892(arg4, arg3 + var7 + 17, 16, class47.field1226);
        class108.method891(arg4 + 15, var7 + 16 + arg3, var6, class115.field2894);
        class108.method891(arg4 + 14, arg3 + 17 - -var7, var6 - 1, class115.field2894);
        class108.method892(arg4, arg3 + var7 + var6 + 15, 16, class115.field2894);
        class108.method892(arg4 + 1, arg3 + var7 - -14 + var6, 15, class115.field2894);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILcd;Lcd;)V", line = 260)
    public final void method424(int arg0, class17 arg1, class17 arg2) {
        field1348++;
        if (arg2.field354 != null) {
            arg2.method133(arg0 + 2);
        }
        arg2.field353 = arg1;
        arg2.field354 = arg1.field354;
        arg2.field354.field353 = arg2;
        if (arg0 != 0) {
            field1367 = 19;
        }
        arg2.field353.field354 = arg2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lcd;I)V", line = 279)
    public final void method425(class17 arg0, int arg1) {
        field1357++;
        if (arg1 != 16) {
            return;
        }
        if (arg0.field354 != null) {
            arg0.method133(2);
        }
        arg0.field353 = this.field1358;
        arg0.field354 = this.field1358.field354;
        arg0.field354.field353 = arg0;
        arg0.field353.field354 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Lcd;", line = 297)
    public final class17 method426(byte arg0) {
        class17 var2 = this.field1358.field354;
        field1354++;
        if (this.field1358 == var2) {
            this.field1369 = null;
            return null;
        }
        if (arg0 > -95) {
            this.method427(null, 72);
        }
        this.field1369 = var2.field354;
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lcd;I)V", line = 333)
    public final void method427(class17 arg0, int arg1) {
        if (arg0.field354 != null) {
            arg0.method133(2);
        }
        arg0.field354 = this.field1358;
        arg0.field353 = this.field1358.field353;
        field1342++;
        arg0.field354.field353 = arg0;
        int var3 = -2 % ((-arg1 - 4) / 63);
        arg0.field353.field354 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 390)
    public class53() {
        this.field1358.field353 = this.field1358;
        this.field1358.field354 = this.field1358;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Lcd;", line = 368)
    public final class17 method428(int arg0) {
        field1365++;
        class17 var2 = this.field1369;
        if (arg0 != 22743) {
            field1359 = true;
        }
        if (this.field1358 == var2) {
            this.field1369 = null;
            return null;
        } else {
            this.field1369 = var2.field353;
            return var2;
        }
    }
}
