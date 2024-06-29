import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class102 {

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Lbl;")
    private class191 field1496 = new class191();

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lcd;")
    private class69 field1493;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Z")
    public static boolean field1487 = false;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Z")
    public static boolean field1494 = false;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field1497 = 1;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lgf;")
    public static class140 field1483;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[I")
    public static int[] field1489;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILak;)V", line = 5)
    public static final void method700(int arg0, class172 arg1) {
        class330.field5083 = arg1;
        field1495++;
        if (arg0 != 1) {
            method700(-38, (class172) null);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I", line = 17)
    public final int method701(int arg0) {
        field1479++;
        int var2 = 0;
        for (class86 var3 = (class86) this.field1496.method1419(200); var3 != null; var3 = (class86) this.field1496.method1416((byte) 4)) {
            if (!var3.method582(96)) {
                var2++;
            }
        }
        if (arg0 <= 22) {
            this.method706(19, 20L);
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 42)
    public final void method702(byte arg0) {
        class86 var2 = (class86) this.field1496.method1419(200);
        if (arg0 <= 119) {
            this.method703((Object) null, -124L, (byte) 80);
        }
        while (var2 != null) {
            if (var2.method582(79)) {
                var2.method1212((byte) 111);
                var2.method42((byte) -49);
                this.field1485++;
            }
            var2 = (class86) this.field1496.method1416((byte) 106);
        }
        field1481++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/Object;JB)V", line = 66)
    public final void method703(Object arg0, long arg1, byte arg2) {
        this.method706(89, arg1);
        int var5 = 9 % ((-arg2 - 13) / 42);
        field1480++;
        if (this.field1485 == 0) {
            class86 var6 = (class86) this.field1496.method1413(0);
            var6.method1212((byte) 127);
            var6.method42((byte) -91);
        } else {
            this.field1485--;
        }
        class233 var7 = new class233(arg0);
        this.field1493.method461(87, arg1, var7);
        this.field1496.method1412(var7, (byte) -2);
        var7.field109 = 0L;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 93)
    public final Object method704(byte arg0, long arg1) {
        field1484++;
        class86 var4 = (class86) this.field1493.method451(arg1, (byte) 100);
        if (var4 == null) {
            return null;
        }
        if (arg0 < 21) {
            this.method702((byte) -30);
        }
        Object var5 = var4.method585((byte) 100);
        if (var5 == null) {
            var4.method1212((byte) 124);
            var4.method42((byte) -103);
            this.field1485++;
            return null;
        }
        if (var4.method582(72)) {
            class233 var6 = new class233(var5);
            this.field1493.method461(85, var4.field2744, var6);
            this.field1496.method1412(var6, (byte) -2);
            var6.field109 = 0L;
            var4.method1212((byte) 79);
            var4.method42((byte) -52);
        } else {
            this.field1496.method1412(var4, (byte) -2);
            var4.field109 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 144)
    public static void method705(int arg0) {
        field1483 = null;
        if (arg0 != 3550) {
            method705(109);
        }
        field1489 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)V", line = 157)
    public final void method706(int arg0, long arg1) {
        if (arg0 <= 55) {
            this.field1485 = -68;
        }
        class86 var4 = (class86) this.field1493.method451(arg1, (byte) 100);
        if (var4 != null) {
            var4.method1212((byte) 73);
            var4.method42((byte) -65);
            this.field1485++;
        }
        field1488++;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 179)
    public final void method707(int arg0) {
        field1482++;
        this.field1496.method1418(arg0);
        this.field1493.method453((byte) 100);
        this.field1485 = this.field1490;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V", line = 198)
    public final void method708(int arg0, boolean arg1) {
        field1491++;
        if (!arg1 || class53.field754 == null) {
            return;
        }
        for (class86 var3 = (class86) this.field1496.method1419(200); var3 != null; var3 = (class86) this.field1496.method1416((byte) 118)) {
            if (var3.method582(99)) {
                if (var3.method585((byte) 100) == null) {
                    var3.method1212((byte) 98);
                    var3.method42((byte) -119);
                    this.field1485++;
                }
            } else if (((long) arg0) < (++var3.field109)) {
                class86 var4 = class53.field754.method1438(82, var3);
                this.field1493.method461(-120, var3.field2744, var4);
                class14.method81(-20573, var4, var3);
                var3.method1212((byte) 98);
                var3.method42((byte) -114);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V", line = 258)
    public class102(int arg0) {
        this.field1490 = arg0;
        this.field1485 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1493 = new class69(var2);
    }
}
