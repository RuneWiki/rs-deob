import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 {

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lmm;")
    private class43 field1001 = new class43();

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lcn;")
    private class37 field1012;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field994 = 0;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field995 = 0;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field1006 = 0;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field1004 = 0;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field1013 = 0;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "Lrn;")
    public static class18 field1017;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "Ldg;")
    public static class211 field1019;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Lie;")
    public static class330 field1000;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "[I")
    public static int[] field1002;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "[I")
    public static int[] field996;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I", line = 5)
    public final int method646(int arg0) {
        field1005++;
        int var2 = arg0;
        for (class174 var3 = (class174) this.field1001.method442((byte) -82); var3 != null; var3 = (class174) this.field1001.method448(0)) {
            if (!var3.method463(1)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)I", line = 29)
    public static final int method647(int arg0, boolean arg1) {
        field1020++;
        if (!arg1) {
            method650(66, (String) null);
        }
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLug;)Ljava/lang/String;", line = 46)
    public static final String method648(byte arg0, class25 arg1) {
        field991++;
        if (arg0 != 120) {
            field1006 = -5;
        }
        return class202.method1508(32767, arg1, 101);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V", line = 57)
    public final void method649(byte arg0, int arg1) {
        field1009++;
        if (class239.field3712 != null) {
            for (class174 var3 = (class174) this.field1001.method442((byte) -103); var3 != null; var3 = (class174) this.field1001.method448(arg0 ^ 0x4B)) {
                if (var3.method463(1)) {
                    if (var3.method464((byte) -55) == null) {
                        var3.method1357(947647010);
                        var3.method2262((byte) -102);
                        this.field1014++;
                    }
                } else if (((long) arg1) < (++var3.field4932)) {
                    class174 var4 = class239.field3712.method319(false, var3);
                    this.field1012.method375(var4, var3.field2734, 89);
                    class59.method580(var4, var3, 2);
                    var3.method1357(arg0 + 947646935);
                    var3.method2262((byte) -102);
                }
            }
        }
        if (arg0 != 75) {
            this.field1016 = -117;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/String;)V", line = 106)
    public static final void method650(int arg0, String arg1) {
        field999++;
        if (arg1 == null) {
            return;
        }
        if (!(class131.field2215 < 100 || class279.field4299) || class131.field2215 >= 200) {
            class101.method882(-1, class123.field1971);
            return;
        }
        String var2 = class249.method1859(0, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class131.field2215; var3++) {
            String var4 = class249.method1859(0, class83.field1197[var3]);
            if (var4 != null && var4.equals(var2)) {
                class101.method882(~arg0, arg1 + class190.field2991);
                return;
            }
            if (class173.field2751[var3] != null) {
                String var5 = class249.method1859(arg0, class173.field2751[var3]);
                if (var5 != null && var5.equals(var2)) {
                    class101.method882(-1, arg1 + class190.field2991);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < class143.field2347; var6++) {
            String var7 = class249.method1859(0, class168.field2669[var6]);
            if (var7 != null && var7.equals(var2)) {
                class101.method882(-1, class340.field5232 + arg1 + class350.field5582);
                return;
            }
            if (class253.field3905[var6] != null) {
                String var8 = class249.method1859(0, class253.field3905[var6]);
                if (var8 != null && var8.equals(var2)) {
                    class101.method882(-1, class340.field5232 + arg1 + class350.field5582);
                    return;
                }
            }
        }
        if (class249.method1859(arg0, class173.field2746.field2706).equals(var2)) {
            class101.method882(arg0 - 1, class279.field4306);
        } else {
            class99.field1491.method1628((byte) -63, 188);
            class348.field5525++;
            class99.field1491.method273(arg0, class34.method354(arg1, (byte) 51));
            class99.field1491.method280(-18345, arg1);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIILrn;)[Lkk;", line = 200)
    public static final class77[] method651(int arg0, int arg1, int arg2, class18 arg3) {
        field1008++;
        return class282.method2056(arg2, arg0, arg3, arg1) ? class176.method1371((byte) -115) : null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/Object;J)V", line = 212)
    public final void method652(int arg0, Object arg1, long arg2) {
        field1018++;
        this.method653((byte) 44, arg2);
        if (this.field1014 == 0) {
            class174 var5 = (class174) this.field1001.method445(2);
            var5.method1357(947647010);
            var5.method2262((byte) -102);
        } else {
            this.field1014--;
        }
        int var6 = -2 % ((arg0 + 9) / 39);
        class308 var7 = new class308(arg1);
        this.field1012.method375(var7, arg2, -3);
        this.field1001.method438(true, var7);
        var7.field4932 = 0L;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BJ)V", line = 239)
    public final void method653(byte arg0, long arg1) {
        field998++;
        if (arg0 != 44) {
            field994 = -96;
        }
        class174 var4 = (class174) this.field1012.method370((byte) -120, arg1);
        if (var4 != null) {
            var4.method1357(arg0 + 947646966);
            var4.method2262((byte) -102);
            this.field1014++;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 276)
    public final Object method654(int arg0, long arg1) {
        field1003++;
        class174 var4 = (class174) this.field1012.method370((byte) -120, arg1);
        if (var4 == null) {
            return null;
        }
        int var5 = -40 % ((-arg0 - 4) / 34);
        Object var6 = var4.method464((byte) -55);
        if (var6 == null) {
            var4.method1357(947647010);
            var4.method2262((byte) -102);
            this.field1014++;
            return null;
        }
        if (var4.method463(1)) {
            class308 var7 = new class308(var6);
            this.field1012.method375(var7, var4.field2734, -111);
            this.field1001.method438(true, var7);
            var7.field4932 = 0L;
            var4.method1357(947647010);
            var4.method2262((byte) -102);
        } else {
            this.field1001.method438(true, var4);
            var4.field4932 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 331)
    public final void method655(int arg0) {
        if (arg0 != -1) {
            field1017 = (class18) null;
        }
        for (class174 var2 = (class174) this.field1001.method442((byte) -115); var2 != null; var2 = (class174) this.field1001.method448(0)) {
            if (var2.method463(1)) {
                var2.method1357(947647010);
                var2.method2262((byte) -102);
                this.field1014++;
            }
        }
        field993++;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 360)
    public final void method656(int arg0) {
        this.field1001.method440(1906703368);
        this.field1012.method374(15975);
        if (arg0 == 0) {
            field1010++;
            this.field1014 = this.field1016;
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 373)
    public static void method657(int arg0) {
        field1019 = null;
        field996 = null;
        field1017 = null;
        int var1 = 10 % ((-arg0 - 43) / 33);
        field1000 = null;
        field1002 = null;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V", line = 395)
    public class66(int arg0) {
        this.field1016 = arg0;
        this.field1014 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1012 = new class37(var2);
    }
}
