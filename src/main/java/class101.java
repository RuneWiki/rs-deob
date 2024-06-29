import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class101 extends class206 {

    @OriginalMember(owner = "client!la", name = "F", descriptor = "Lwa;")
    public class281 field1531 = new class281();

    @OriginalMember(owner = "client!la", name = "G", descriptor = "Ljd;")
    public class91 field1532 = new class91();

    @OriginalMember(owner = "client!la", name = "A", descriptor = "Lmi;")
    private class282 field1526;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "[Ldd;")
    public static class141[] field1525 = new class141[8];

    @OriginalMember(owner = "client!la", name = "v", descriptor = "J")
    public static long field1521 = 0L;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLfa;)V")
    public static final void method656(byte arg0, class273 arg1) {
        field1530++;
        class126.field1953 = arg1;
        int var2 = -34 % ((arg0 - 45) / 40);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "([III)V")
    public final void method594(int[] arg0, int arg1, int arg2) {
        field1528++;
        this.field1532.method594(arg0, arg1, arg2);
        for (class274 var4 = (class274) this.field1531.method1959(205); var4 != null; var4 = (class274) this.field1531.method1956(96)) {
            if (!this.field1526.method1995(var4, -20355)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field4522) {
                        this.method663((byte) -97, var5 + var6, var6, var4, arg0, var5);
                        var4.field4522 -= var5;
                        break;
                    }
                    this.method663((byte) -124, var5 + var6, var6, var4, arg0, var4.field4522);
                    var5 -= var4.field4522;
                    var6 += var4.field4522;
                } while (!this.field1526.method1964(var6, -2024483423, arg0, var4, var5));
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()Lgg;")
    public final class206 method587() {
        field1522++;
        class274 var1;
        do {
            var1 = (class274) this.field1531.method1956(78);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4542 == null);
        return var1.field4542;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public final void method593(int arg0) {
        field1520++;
        this.field1532.method593(arg0);
        for (class274 var2 = (class274) this.field1531.method1959(205); var2 != null; var2 = (class274) this.field1531.method1956(93)) {
            if (!this.field1526.method1995(var2, -20355)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field4522) {
                        this.method660(var2, var3, (byte) -114);
                        var2.field4522 -= var3;
                        break;
                    }
                    this.method660(var2, var2.field4522, (byte) -114);
                    var3 -= var2.field4522;
                } while (!this.field1526.method1964(0, -2024483423, (int[]) null, var2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
    public static final void method657(int arg0, int arg1) {
        field1523++;
        class120.field1849 = -1;
        class44.field606 = arg0;
        class120.field1849 = -1;
        if (arg1 != -9188) {
            field1517 = 84;
        }
        class162.method1073(arg1 + 9069);
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "()I")
    public final int method589() {
        field1516++;
        return 0;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V")
    public static void method658(boolean arg0) {
        field1525 = null;
        if (arg0) {
            field1525 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "()Lgg;")
    public final class206 method596() {
        field1519++;
        class274 var1 = (class274) this.field1531.method1959(205);
        if (var1 == null) {
            return null;
        } else if (var1.field4542 == null) {
            return this.method587();
        } else {
            return var1.field4542;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)Ldd;")
    public static final class141 method659(byte arg0, int arg1) {
        field1524++;
        class141 var2 = (class141) class260.field4262.method149((byte) -69, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class264.field4354.method1877(arg1, 1, (byte) 31);
        class141 var4 = new class141();
        var4.field2176 = arg1;
        if (var3 != null) {
            var4.method941((byte) -3, new class202(var3));
        }
        var4.method939(-2);
        if (arg0 <= 29) {
            method659((byte) 84, -18);
        }
        if (var4.field2194 == 2 && class75.field1178.method872((byte) -127, (long) arg1) == null) {
            class75.field1178.method857(false, new class221(class243.field3863), (long) arg1);
            field1525[class243.field3863++] = var4;
        }
        class260.field4262.method152(var4, (long) arg1, true);
        return var4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lfj;IB)V")
    private final void method660(class274 arg0, int arg1, byte arg2) {
        if ((this.field1526.field4680[arg0.field4539] & 0x4) != 0 && arg0.field4537 < 0) {
            int var4 = this.field1526.field4719[arg0.field4539] / class131.field2018;
            int var5 = (var4 + 1048575 - arg0.field4523) / var4;
            arg0.field4523 = arg1 * var4 + arg0.field4523 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field1526.field4658[arg0.field4539] == 0) {
                    arg0.field4542 = class185.method1258(arg0.field4529, arg0.field4542.method1238(), arg0.field4542.method1243(), arg0.field4542.method1265());
                } else {
                    arg0.field4542 = class185.method1258(arg0.field4529, arg0.field4542.method1238(), 0, arg0.field4542.method1265());
                    this.field1526.method1961(arg0.field4515.field3733[arg0.field4541] < 0, (byte) 115, arg0);
                }
                if (arg0.field4515.field3733[arg0.field4541] < 0) {
                    arg0.field4542.method1239(-1);
                }
                arg1 = arg0.field4523 / var4;
            }
        }
        arg0.field4542.method593(arg1);
        field1533++;
        if (arg2 != -114) {
            this.field1526 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lfa;II)[Lti;")
    public static final class5[] method661(class273 arg0, int arg1, int arg2) {
        field1529++;
        if (arg1 != -1) {
            field1525 = null;
        }
        return class124.method823(arg1 ^ 0xFFFFFFFD, arg0, arg2) ? class56.method337(-1) : null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Laf;")
    public static final class70 method662(byte arg0) {
        field1527++;
        if (arg0 != 94) {
            return null;
        }
        try {
            return (class70) Class.forName("nm").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIILfj;[II)V")
    private final void method663(byte arg0, int arg1, int arg2, class274 arg3, int[] arg4, int arg5) {
        field1518++;
        if ((this.field1526.field4680[arg3.field4539] & 0x4) != 0 && arg3.field4537 < 0) {
            int var7 = this.field1526.field4719[arg3.field4539] / class131.field2018;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field4523) / var7;
                if (var8 > arg5) {
                    arg3.field4523 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg3.field4542.method594(arg4, arg2, var8);
                arg3.field4523 += var7 * var8 - 1048576;
                int var9 = class131.field2018 / 100;
                int var10 = 262144 / var7;
                class185 var11 = arg3.field4542;
                if (var9 > var10) {
                    var9 = var10;
                }
                arg2 += var8;
                if (this.field1526.field4658[arg3.field4539] == 0) {
                    arg3.field4542 = class185.method1258(arg3.field4529, var11.method1238(), var11.method1243(), var11.method1265());
                } else {
                    arg3.field4542 = class185.method1258(arg3.field4529, var11.method1238(), 0, var11.method1265());
                    this.field1526.method1961(arg3.field4515.field3733[arg3.field4541] < 0, (byte) 99, arg3);
                    arg3.field4542.method1254(var9, var11.method1243());
                }
                if (arg3.field4515.field3733[arg3.field4541] < 0) {
                    arg3.field4542.method1239(-1);
                }
                var11.method1247(var9);
                var11.method594(arg4, arg2, arg1 - arg2);
                if (var11.method1253()) {
                    this.field1532.method588(var11);
                }
            }
        }
        arg3.field4542.method594(arg4, arg2, arg5);
        if (arg0 >= -42) {
            method657(-82, 125);
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lmi;)V")
    public class101(class282 arg0) {
        this.field1526 = arg0;
    }
}
