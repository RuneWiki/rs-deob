import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Led;")
    private class29 field1373 = new class29();

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1376 = -1;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "Lwb;")
    public static class130 field1390 = class26.method212("hitmarks", -32376);

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Lwb;")
    public static class130 field1387 = class26.method212("sideicons", -32376);

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Lwb;")
    public static class130 field1393 = class26.method212("Registrierter Benutzer", -32376);

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lwb;")
    public static class130 field1379 = class26.method212("Handel akzeptieren", -32376);

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Lwb;")
    private static class130 field1386 = class26.method212("Existing user", -32376);

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Lwb;")
    public static class130 field1382 = class26.method212("backhmid2", -32376);

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Lwb;")
    public static class130 field1395 = class26.method212("An", -32376);

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lwb;")
    public static class130 field1385 = field1386;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1397 = 0;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "Lwb;")
    public static class130 field1396 = class26.method212("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3", -32376);

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "Lwb;")
    public static class130 field1399 = class26.method212("@gre@", -32376);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "[I")
    public static int[] field1388;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)Z", line = 4)
    public static final boolean method448(byte arg0, int arg1) {
        field1391++;
        int var2 = 44 % ((arg0 + 36) / 61);
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Led;I)V", line = 20)
    public final void method449(class29 arg0, int arg1) {
        field1377++;
        if (arg0.field813 != null) {
            arg0.method239(1);
        }
        if (arg1 != -101) {
            field1386 = null;
        }
        arg0.field805 = this.field1373;
        arg0.field813 = this.field1373.field813;
        arg0.field813.field805 = arg0;
        arg0.field805.field813 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILwb;Lwb;III)V", line = 38)
    public static final void method450(int arg0, int arg1, class130 arg2, class130 arg3, int arg4, int arg5, int arg6) {
        if (arg6 >= -107) {
            method455(true);
        }
        field1394++;
        if (class26.field757 >= 500) {
            return;
        }
        if (arg3.method958((byte) -38) > 0) {
            class105.field2546[class26.field757] = class15.method114(new class130[] { arg2, class41.field1167, arg3 }, -20349);
        } else {
            class105.field2546[class26.field757] = arg2;
        }
        class3.field73[class26.field757] = arg4;
        class99.field2390[class26.field757] = arg1;
        class14.field409[class26.field757] = arg5;
        class47.field1269[class26.field757] = arg0;
        class26.field757++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBLk;)Z", line = 72)
    public static final boolean method451(int arg0, byte arg1, class60 arg2) {
        field1375++;
        byte[] var3 = arg2.method494(arg0, -61);
        if (var3 == null) {
            return false;
        }
        class32.method254(var3, (byte) -51);
        if (arg1 >= -5) {
            method448((byte) 97, -94);
        }
        return true;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 101)
    public static void method452(byte arg0) {
        field1385 = null;
        field1382 = null;
        field1395 = null;
        field1379 = null;
        field1399 = null;
        field1387 = null;
        field1393 = null;
        if (arg0 <= -19) {
            field1390 = null;
            field1388 = null;
            field1396 = null;
            field1386 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)I", line = 125)
    public static final int method453(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 65) {
            return -50;
        }
        int var4 = arg2 & 0x3;
        field1398++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Led;", line = 148)
    public final class29 method454(int arg0) {
        if (arg0 != 10) {
            method448((byte) 122, 4);
        }
        field1392++;
        class29 var2 = this.field1373.field805;
        return this.field1373 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V", line = 173)
    public static final void method455(boolean arg0) {
        field1389++;
        if (arg0) {
            field1385 = null;
        }
        while (true) {
            class108 var1 = class71.field1800;
            class37 var2;
            synchronized (class71.field1800) {
                var2 = (class37) class4.field162.method820((byte) -112);
            }
            if (var2 == null) {
                return;
            }
            var2.field1088.method583(false, -22625, var2.field1086, (int) var2.field2329, var2.field1081);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 305)
    public class53() {
        this.field1373.field813 = this.field1373;
        this.field1373.field805 = this.field1373;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IJ)V", line = 206)
    public static final void method456(int arg0, long arg1) {
        field1381++;
        if (arg1 == 0L) {
            return;
        }
        if (class35.field993 >= 100 && class24.field696 != 1 || class35.field993 >= 200) {
            class41.method400(class9.field295, (byte) 56, class81.field1932, 0);
            return;
        }
        class130 var3 = class26.method213((byte) 31, arg1).method985(-52);
        int var4 = 0;
        int var5 = 83 / ((-arg0 - 8) / 52);
        while (var4 < class35.field993) {
            if (class4.field164[var4] == arg1) {
                class41.method400(class9.field295, (byte) 56, class15.method114(new class130[] { var3, class59.field1502 }, -20349), 0);
                return;
            }
            var4++;
        }
        for (int var6 = 0; var6 < class109.field2657; var6++) {
            if (class59.field1477[var6] == arg1) {
                class41.method400(class9.field295, (byte) 56, class15.method114(new class130[] { class10.field322, var3, class41.field1162 }, -20349), 0);
                return;
            }
        }
        if (var3.method979(class42.field1179.field1515, 29738)) {
            return;
        }
        class40.field1135++;
        class79.field1915[class35.field993] = var3;
        class4.field164[class35.field993] = arg1;
        class14.field410[class35.field993] = 0;
        class20.field585 = true;
        class35.field993++;
        class14.field406.method727(191, 90);
        class14.field406.method344(arg1, -1652311768);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 274)
    public static final void method457(int arg0) {
        if (class47.field1255 != null) {
            class47.field1255.method148(-113);
            class47.field1255 = null;
        }
        field1380++;
        class99.method737(-28464);
        class79.field1926.method295();
        if (arg0 > -53) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class99.field2404[var1].method931(-105);
        }
        System.gc();
        class65.method531(10, (byte) 62);
        class85.field2026 = 0;
        class17.field475 = -1;
        client.method166(85);
        class90.method669(19013, 10);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLed;)V", line = 321)
    public final void method458(byte arg0, class29 arg1) {
        if (arg1.field813 != null) {
            arg1.method239(1);
        }
        field1378++;
        arg1.field805 = this.field1373.field805;
        arg1.field813 = this.field1373;
        arg1.field813.field805 = arg1;
        if (arg0 == -102) {
            arg1.field805.field813 = arg1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Led;", line = 369)
    public final class29 method459(int arg0) {
        class29 var2 = this.field1373.field805;
        field1383++;
        if (arg0 != 48) {
            field1384 = -2;
        }
        if (this.field1373 == var2) {
            return null;
        } else {
            var2.method239(1);
            return var2;
        }
    }
}
