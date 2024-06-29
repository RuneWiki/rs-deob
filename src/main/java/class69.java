import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 implements class1 {

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lac;")
    private class4 field1393 = new class4();

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    private int field1408 = 128;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    private int field1411 = 0;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "D")
    private double field1416 = 1.0D;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Lfd;")
    private class40 field1422;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "[Lbe;")
    private class13[] field1391;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public static int field1404 = 0;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Lje;")
    private static class67 field1405 = class85.method592(255, "Username: ");

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lje;")
    public static class67 field1398 = field1405;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lga;")
    public static class44 field1399 = new class44(5000);

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field1413 = 2;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "Lje;")
    private static class67 field1415 = class85.method592(255, "New User");

    @OriginalMember(owner = "client!k", name = "A", descriptor = "Lje;")
    public static class67 field1417 = field1415;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "Lje;")
    public static class67 field1418 = class85.method592(255, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field1419 = 0;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Lje;")
    public static class67 field1421 = class85.method592(255, "(U4");

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "Lwb;")
    public static class155 field1423;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lfd;")
    public static class40 field1403;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "[I")
    public static int[] field1409;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[Lqb;")
    public static class113[] field1412;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(IB)V")
    public final void method503(int arg0, byte arg1) {
        field1394++;
        for (int var3 = 0; var3 < this.field1391.length; var3++) {
            class13 var5 = this.field1391[var3];
            if (var5 != null && var5.field239 != 0 && var5.field235) {
                var5.method94(arg0);
                var5.field235 = false;
            }
        }
        int var4 = 53 / ((arg1 - 51) / 42);
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(II)Lsf;")
    public static final class131 method504(int arg0, int arg1) {
        int var2 = 96 % ((arg0 - 42) / 50);
        field1401++;
        class131 var3 = (class131) class39.field702.method764((long) arg1, 24182);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class155.field3524.method267((byte) -124, arg1, 4);
        class131 var5 = new class131();
        if (var4 != null) {
            var5.method997(arg1, -128, new class91(var4));
        }
        var5.method995((byte) 85);
        class39.field702.method765((long) arg1, var5, (byte) -97);
        return var5;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Z")
    public final boolean method1(int arg0, int arg1) {
        if (arg1 <= 17) {
            field1417 = null;
        }
        field1407++;
        return this.field1391[arg0].field238;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(II)I")
    public final int method4(int arg0, int arg1) {
        field1397++;
        if (arg0 >= -117) {
            this.method1(77, 63);
        }
        return this.field1391[arg1] == null ? 0 : this.field1391[arg1].field237;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public final void method505(boolean arg0) {
        for (int var2 = 0; var2 < this.field1391.length; var2++) {
            if (this.field1391[var2] != null) {
                this.field1391[var2].method96();
            }
        }
        if (!arg0) {
            field1403 = null;
        }
        field1414++;
        this.field1393 = new class4();
        this.field1411 = this.field1410;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(DZ)V")
    public final void method506(double arg0, boolean arg1) {
        field1400++;
        this.field1416 = arg0;
        if (!arg1) {
            field1419 = -9;
        }
        this.method505(arg1);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)Z")
    public final boolean method2(int arg0, byte arg1) {
        if (arg1 != -43) {
            field1417 = null;
        }
        field1395++;
        return this.field1408 == 64;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)Z")
    public static final boolean method507(byte arg0) {
        field1402++;
        if (arg0 > -3) {
            return true;
        } else if (class95.field2126 == 0) {
            return class154.field3499.method1076(-104);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        field1406++;
        if (arg1 != -6793) {
            method508(false);
        }
        class13 var3 = this.field1391[arg0];
        if (var3 != null) {
            if (var3.field234 != null) {
                this.field1393.method28((byte) 119, var3);
                var3.field235 = true;
                return var3.field234;
            }
            boolean var4 = var3.method93(this.field1416, this.field1408, this.field1422);
            if (var4) {
                if (this.field1411 == 0) {
                    class13 var5 = (class13) this.field1393.method21((byte) -54);
                    var5.method96();
                } else {
                    this.field1411--;
                }
                this.field1393.method28((byte) 115, var3);
                var3.field235 = true;
                return var3.field234;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)Lmb;")
    public static final class85 method508(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field1396++;
        try {
            return (class85) Class.forName("n").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method509(int arg0) {
        field1421 = null;
        field1412 = null;
        field1418 = null;
        field1403 = null;
        field1409 = null;
        field1399 = null;
        if (arg0 != 2) {
            method504(34, 34);
        }
        field1417 = null;
        field1415 = null;
        field1398 = null;
        field1405 = null;
        field1423 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lfd;Lfd;IDI)V")
    public class69(class40 arg0, class40 arg1, int arg2, double arg3, int arg4) {
        this.field1410 = arg2;
        this.field1422 = arg1;
        this.field1408 = arg4;
        this.field1411 = this.field1410;
        this.field1416 = arg3;
        int[] var7 = arg0.method265(0, (byte) 47);
        int var8 = var7.length;
        this.field1391 = new class13[arg0.method263(0, (byte) 121)];
        for (int var9 = 0; var9 < var8; var9++) {
            class91 var10 = new class91(arg0.method267((byte) -124, var7[var9], 0));
            this.field1391[var7[var9]] = new class13(var10);
        }
    }
}
