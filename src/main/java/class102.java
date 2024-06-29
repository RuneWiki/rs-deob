import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class102 {

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "Lje;")
    private class265 field1377 = new class265();

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client!aaa", name = "q", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "Lil;")
    private class68 field1373;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field1365 = 0;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "Lwp;")
    public static class453 field1372 = new class453(73, -1);

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "Lwp;")
    public static class453 field1380 = new class453(32, 2);

    @OriginalMember(owner = "client!aaa", name = "s", descriptor = "Lrca;")
    public static class34 field1383 = new class34();

    @OriginalMember(owner = "client!aaa", name = "u", descriptor = "[I")
    public static int[] field1385 = new int[14];

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!aaa", name = "r", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!aaa", name = "t", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "[[Llo;")
    public static class488[][] field1375;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILjava/lang/String;)J", line = 6)
    public static final long method576(int arg0, String arg1) {
        field1368++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = arg0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V", line = 47)
    public static void method577(int arg0) {
        field1383 = null;
        field1372 = null;
        if (arg0 != -91) {
            method576(53, null);
        }
        field1375 = null;
        field1385 = null;
        field1380 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BLgj;)Ljava/lang/Object;", line = 61)
    public final Object method578(byte arg0, class96 arg1) {
        field1371++;
        long var3 = arg1.method556(61);
        int var5 = 58 % ((30 - arg0) / 34);
        for (class25 var6 = (class25) this.field1373.method399(-32748, var3); var6 != null; var6 = (class25) this.field1373.method408((byte) 115)) {
            if (var6.field381.method555(arg1, 126)) {
                Object var7 = var6.method174(-9023);
                if (var7 != null) {
                    if (var6.method175((byte) -13)) {
                        class587 var8 = new class587(arg1, var7, var6.field376);
                        this.field1373.method402(var8, (byte) -40, var6.field4199);
                        this.field1377.method1541(75, var8);
                        var8.field6874 = 0L;
                        var6.method1871(-72);
                        var6.method2744((byte) -55);
                    } else {
                        this.field1377.method1541(75, var6);
                        var6.field6874 = 0L;
                    }
                    return var7;
                }
                var6.method1871(-54);
                var6.method2744((byte) -95);
                this.field1370 += var6.field376;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V", line = 115)
    public final void method579(byte arg0) {
        if (arg0 != 64) {
            this.method587((byte) 112);
        }
        for (class25 var2 = (class25) this.field1377.method1546((byte) -127); var2 != null; var2 = (class25) this.field1377.method1536(1252027233)) {
            if (var2.method175((byte) -125)) {
                var2.method1871(arg0 - 149);
                var2.method2744((byte) -70);
                this.field1370 += var2.field376;
            }
        }
        field1382++;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Las;I)V", line = 144)
    private final void method580(class25 arg0, int arg1) {
        if (arg1 < 3) {
            return;
        }
        field1384++;
        if (arg0 != null) {
            arg0.method1871(-43);
            arg0.method2744((byte) -69);
            this.field1370 += arg0.field376;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Ljava/lang/Object;Lgj;B)V", line = 162)
    public final void method581(Object arg0, class96 arg1, byte arg2) {
        field1374++;
        this.method582(1, (byte) -58, arg1, arg0);
        if (arg2 != 41) {
            this.method586((byte) -96);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IBLgj;Ljava/lang/Object;)V", line = 182)
    private final void method582(int arg0, byte arg1, class96 arg2, Object arg3) {
        field1369++;
        if (arg0 > this.field1381) {
            throw new IllegalStateException("s>cs");
        }
        this.method584(true, arg2);
        this.field1370 -= arg0;
        while (this.field1370 < 0) {
            class25 var6 = (class25) this.field1377.method1537(-21957);
            this.method580(var6, 18);
        }
        class587 var5 = new class587(arg2, arg3, arg0);
        this.field1373.method402(var5, (byte) -46, arg2.method556(72));
        this.field1377.method1541(75, var5);
        var5.field6874 = 0L;
        if (arg1 >= -7) {
            method577(-62);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)I", line = 216)
    public final int method583(byte arg0) {
        field1367++;
        if (arg0 < 13) {
            field1365 = 91;
        }
        return this.field1381;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZLgj;)V", line = 227)
    private final void method584(boolean arg0, class96 arg1) {
        field1366++;
        long var3 = arg1.method556(116);
        if (!arg0) {
            this.field1381 = -33;
        }
        for (class25 var5 = (class25) this.field1373.method399(-32748, var3); var5 != null; var5 = (class25) this.field1373.method408((byte) 120)) {
            if (var5.field381.method555(arg1, 86)) {
                this.method580(var5, 100);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)V", line = 254)
    public final void method585(int arg0, int arg1) {
        if (class546.field7267 != null) {
            for (class25 var3 = (class25) this.field1377.method1546((byte) -125); var3 != null; var3 = (class25) this.field1377.method1536(1252027233)) {
                if (var3.method175((byte) -127)) {
                    if (var3.method174(-9023) == null) {
                        var3.method1871(arg1 ^ 0xFFFFFFD1);
                        var3.method2744((byte) -63);
                        this.field1370 += var3.field376;
                    }
                } else if ((long) arg0 < ++var3.field6874) {
                    class25 var4 = class546.field7267.method359(var3, (byte) -120);
                    this.field1373.method402(var4, (byte) -64, var3.field4199);
                    class494.method2666(var3, 2, var4);
                    var3.method1871(arg1 ^ 0xFFFFFFE5);
                    var3.method2744((byte) -69);
                }
            }
        }
        field1378++;
        if (arg1 != 0) {
            this.field1377 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(I)V", line = 342)
    public class102(int arg0) {
        this.field1370 = arg0;
        this.field1381 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1373 = new class68(var2);
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)I", line = 314)
    public final int method586(byte arg0) {
        if (arg0 < 62) {
            return -81;
        } else {
            field1376++;
            return this.field1370;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "(B)V", line = 330)
    public final void method587(byte arg0) {
        field1379++;
        this.field1377.method1540(1252027233);
        this.field1373.method398(true);
        if (arg0 != 77) {
            field1372 = null;
        }
        this.field1370 = this.field1381;
    }
}
