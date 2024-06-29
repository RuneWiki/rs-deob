import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class25 extends class406 {

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Llg;")
    public static class237 field310 = new class237(64);

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "[S")
    public static short[] field312;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[BI)I", line = 3)
    public static final int method174(int arg0, byte[] arg1, int arg2) {
        int var3 = 9 / ((arg2 + 72) / 54);
        field307++;
        return class225.method1500(arg0, (byte) 119, 0, arg1);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([[[Lak;Z)V", line = 16)
    public static final void method175(class193[][][] arg0, boolean arg1) {
        field308++;
        if (arg1) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class193[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class193 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2790 instanceof class9) {
                            ((class9) var6.field2790).method65(17184);
                        }
                        if (var6.field2788 instanceof class9) {
                            ((class9) var6.field2788).method65(17184);
                        }
                        if (var6.field2786 instanceof class9) {
                            ((class9) var6.field2786).method65(17184);
                        }
                        if (var6.field2784 instanceof class9) {
                            ((class9) var6.field2784).method65(17184);
                        }
                        if (var6.field2771 instanceof class9) {
                            ((class9) var6.field2771).method65(17184);
                        }
                        for (class250 var7 = var6.field2779; var7 != null; var7 = var7.field3568) {
                            class233 var8 = var7.field3571;
                            if (var8 instanceof class9) {
                                ((class9) var8).method65(17184);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Luc;", line = 88)
    public static final class20 method176(int arg0) {
        field309++;
        if (arg0 != -21576) {
            method177(110);
        }
        class20 var1 = (class20) class23.field287.method1949(true);
        if (var1 != null) {
            var1.method2594((byte) -22);
            var1.method2133(-31493);
            return var1;
        }
        class20 var2;
        do {
            var2 = (class20) class328.field4655.method1949(true);
            if (var2 == null) {
                return null;
            }
            if (var2.method144(-31416) > class175.method1195(arg0 + 21623)) {
                return null;
            }
            var2.method2594((byte) -22);
            var2.method2133(-31493);
        } while ((Long.MIN_VALUE & var2.field4685) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 131)
    public static void method177(int arg0) {
        if (arg0 >= 60) {
            field312 = null;
            field310 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 144)
    public class25() {
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V", line = 150)
    public class25(int arg0) {
        this.field311 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 159)
    public static final String method178(long arg0, byte arg1) {
        field306++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            if (arg1 <= 125) {
                field310 = null;
            }
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class168.field2343[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }
}
