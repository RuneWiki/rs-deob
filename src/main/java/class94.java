import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class94 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lcc;")
    private class252 field1493 = new class252();

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lof;")
    private class242 field1507;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Laj;")
    public static class1 field1502 = new class1();

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[I")
    public static int[] field1506 = new int[500];

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Lsf;")
    private static class108 field1509 = class140.method973(255, "Connected to update server");

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Lsf;")
    public static class108 field1508 = class140.method973(255, "Mem:");

    @OriginalMember(owner = "client!he", name = "u", descriptor = "Lsf;")
    public static class108 field1511 = field1509;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1505 = 0;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "[[B")
    public static byte[][] field1512;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I", line = 12)
    public final int method636(int arg0) {
        if (arg0 != -8590) {
            field1506 = (int[]) null;
        }
        int var2 = 0;
        field1492++;
        for (class9 var3 = (class9) this.field1493.method1778(-7); var3 != null; var3 = (class9) this.field1493.method1783(-27042)) {
            if (!var3.method50(-61)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V", line = 42)
    public final void method637(int arg0, int arg1) {
        if (class92.field1456 != null) {
            for (class9 var3 = (class9) this.field1493.method1778(8); var3 != null; var3 = (class9) this.field1493.method1783(-27042)) {
                if (var3.method50(-61)) {
                    if (var3.method52(5736) == null) {
                        var3.method1325(0);
                        var3.method648(26562);
                        this.field1497++;
                    }
                } else if (++var3.field1520 > (long) arg0) {
                    class9 var4 = class92.field1456.method440(var3, -113);
                    this.field1507.method1681(1, var4, var3.field3375);
                    class187.method1338(var4, 16, var3);
                    var3.method1325(0);
                    var3.method648(26562);
                }
            }
        }
        if (arg1 > 110) {
            field1500++;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 95)
    public static final void method638(int arg0) {
        field1504++;
        int var1 = class293.field5127.method1431((byte) -94, 8);
        if (class43.field569 > var1) {
            for (int var2 = var1; var2 < class43.field569; var2++) {
                class26.field409[class259.field4572++] = class194.field3511[var2];
            }
        }
        if (var1 > class43.field569) {
            throw new RuntimeException("gppov1");
        }
        class43.field569 = 0;
        for (int var3 = arg0; var3 < var1; var3++) {
            int var4 = class194.field3511[var3];
            class51 var5 = class96.field1558[var4];
            int var6 = class293.field5127.method1431((byte) -94, 1);
            if (var6 == 0) {
                class194.field3511[class43.field569++] = var4;
                var5.field4459 = class116.field2000;
            } else {
                int var7 = class293.field5127.method1431((byte) -94, 2);
                if (var7 == 0) {
                    class194.field3511[class43.field569++] = var4;
                    var5.field4459 = class116.field2000;
                    class283.field4947[class312.field5400++] = var4;
                } else if (var7 == 1) {
                    class194.field3511[class43.field569++] = var4;
                    var5.field4459 = class116.field2000;
                    int var11 = class293.field5127.method1431((byte) -94, 3);
                    var5.method1809(var11, false, 0);
                    int var12 = class293.field5127.method1431((byte) -94, 1);
                    if (var12 == 1) {
                        class283.field4947[class312.field5400++] = var4;
                    }
                } else if (var7 == 2) {
                    class194.field3511[class43.field569++] = var4;
                    var5.field4459 = class116.field2000;
                    int var8 = class293.field5127.method1431((byte) -94, 3);
                    var5.method1809(var8, true, arg0);
                    int var9 = class293.field5127.method1431((byte) -94, 3);
                    var5.method1809(var9, true, 0);
                    int var10 = class293.field5127.method1431((byte) -94, 1);
                    if (var10 == 1) {
                        class283.field4947[class312.field5400++] = var4;
                    }
                } else if (var7 == 3) {
                    class26.field409[class259.field4572++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 196)
    public final void method639(int arg0) {
        if (arg0 > -41) {
            this.method642(-115L, (byte) -92);
        }
        field1495++;
        this.field1493.method1785(0);
        this.field1507.method1679(true);
        this.field1497 = this.field1491;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IJ)V", line = 221)
    public final void method640(int arg0, long arg1) {
        field1503++;
        class9 var4 = (class9) this.field1507.method1676(arg1, (byte) -64);
        if (arg0 == 6811 && var4 != null) {
            var4.method1325(arg0 ^ 0x1A9B);
            var4.method648(26562);
            this.field1497++;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I", line = 245)
    public static final int method641(int arg0, int arg1, int arg2) {
        field1499++;
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
        }
        return arg0 == 14620 ? var3 : 115;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 266)
    public final Object method642(long arg0, byte arg1) {
        field1496++;
        class9 var4 = (class9) this.field1507.method1676(arg0, (byte) -119);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method52(5736);
        if (var5 == null) {
            var4.method1325(0);
            var4.method648(26562);
            this.field1497++;
            return null;
        }
        if (arg1 >= -45) {
            this.method636(92);
        }
        if (var4.method50(-61)) {
            class317 var6 = new class317(var5);
            this.field1507.method1681(1, var6, var4.field3375);
            this.field1493.method1784(var6, true);
            var6.field1520 = 0L;
            var4.method1325(0);
            var4.method648(26562);
        } else {
            this.field1493.method1784(var4, true);
            var4.field1520 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BJLjava/lang/Object;)V", line = 309)
    public final void method643(byte arg0, long arg1, Object arg2) {
        field1498++;
        this.method640(6811, arg1);
        if (this.field1497 == 0) {
            class9 var5 = (class9) this.field1493.method1786(5807);
            var5.method1325(0);
            var5.method648(26562);
        } else {
            this.field1497--;
        }
        class317 var6 = new class317(arg2);
        this.field1507.method1681(1, var6, arg1);
        this.field1493.method1784(var6, true);
        var6.field1520 = 0L;
        if (arg0 != -49) {
            this.field1497 = 36;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 339)
    public final void method644(byte arg0) {
        for (class9 var2 = (class9) this.field1493.method1778(-126); var2 != null; var2 = (class9) this.field1493.method1783(-27042)) {
            if (var2.method50(-61)) {
                var2.method1325(0);
                var2.method648(26562);
                this.field1497++;
            }
        }
        if (arg0 < 42) {
            field1509 = (class108) null;
        }
        field1501++;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V", line = 363)
    public static void method645(int arg0) {
        if (arg0 < 84) {
            method638(15);
        }
        field1509 = null;
        field1508 = null;
        field1511 = null;
        field1506 = null;
        field1502 = null;
        field1512 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V", line = 379)
    public static final void method646(boolean arg0, int arg1) {
        field1494++;
        if (arg0 == class92.field1472) {
            return;
        }
        class92.field1472 = arg0;
        class234.method1633((byte) 103);
        if (arg1 >= -74) {
            method646(true, 5);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V", line = 432)
    public class94(int arg0) {
        this.field1497 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1491 = arg0;
        this.field1507 = new class242(var2);
    }
}
