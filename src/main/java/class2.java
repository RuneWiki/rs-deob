import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 extends class120 {

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Ljava/lang/String;")
    public String field20;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static volatile int field16 = 0;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field18 = -1;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "[S")
    public static short[] field21 = new short[500];

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "Lpk;")
    public static class100 field22 = new class100(8);

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Lbk;")
    public static class20 field23;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "[I")
    public static int[] field24;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIILkg;)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, class136 arg4) {
        field19++;
        if (arg2 != -1) {
            method8((class82) null, (byte) 20);
        }
        if (class245.field3920 >= 400) {
            return;
        }
        if (arg4.field1987 != null) {
            arg4 = arg4.method928(12);
        }
        if (arg4 == null || !arg4.field2010) {
            return;
        }
        String var5 = arg4.field1995;
        if (arg4.field1989 != 0) {
            String var6 = class80.field1151 == 1 ? class35.field450 : class241.field3861;
            var5 = var5 + class186.method1294(class149.field2227.field2917, arg4.field1989, arg2 ^ 0xFFFFF0A5) + " (" + var6 + arg4.field1989 + ")";
        }
        if (class66.field921 == 1) {
            class120.field1753++;
            class244.method1647(class218.field3547, 0, arg0, class68.field956, arg3, (long) arg1, (short) 20, class53.field736 + " -> <col=ffff00>" + var5);
        } else if (class45.field572) {
            class110 var14 = class151.field2243 == -1 ? null : class222.method1512(arg2 ^ 0x1, class151.field2243);
            if ((class207.field3238 & 0x2) != 0) {
                if (var14 == null || arg4.method923((byte) 0, class151.field2243, var14.field1667) != var14.field1667) {
                    class8.field125++;
                    class244.method1647(class30.field399, 0, arg0, class23.field291, arg3, (long) arg1, (short) 26, class155.field2307 + " -> <col=ffff00>" + var5);
                }
                return;
            }
        } else {
            String[] var7 = arg4.field1979;
            if (class68.field951) {
                var7 = class73.method500(81, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class80.field1151 != 0 || !var7[var8].equalsIgnoreCase(class262.field4238))) {
                        class239.field3827++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 16;
                        }
                        int var10 = -1;
                        if (arg4.field2003 == var8) {
                            var10 = arg4.field2015;
                        }
                        if (arg4.field1996 == var8) {
                            var10 = arg4.field2027;
                        }
                        if (var8 == 1) {
                            var9 = 6;
                        }
                        if (var8 == 2) {
                            var9 = 51;
                        }
                        if (var8 == 3) {
                            var9 = 10;
                        }
                        if (var8 == 4) {
                            var9 = 28;
                        }
                        class244.method1647(var7[var8], ~arg2, arg0, var10, arg3, (long) arg1, var9, "<col=ffff00>" + var5);
                    }
                }
            }
            if (class80.field1151 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class262.field4238)) {
                        class286.field4539++;
                        short var12 = 0;
                        if (class149.field2227.field2917 < arg4.field1989) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 16;
                        }
                        if (var11 == 1) {
                            var13 = 6;
                        }
                        if (var11 == 2) {
                            var13 = 51;
                        }
                        if (var11 == 3) {
                            var13 = 10;
                        }
                        if (var11 == 4) {
                            var13 = 28;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class244.method1647(var7[var11], 0, arg0, arg4.field2033, arg3, (long) arg1, var13, "<col=ffff00>" + var5);
                    }
                }
            }
            class244.method1647(class172.field2702, 0, arg0, class107.field1645, arg3, (long) arg1, (short) 1001, "<col=ffff00>" + var5);
            class243.field3886++;
            return;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static void method7(int arg0) {
        field21 = null;
        field22 = null;
        field23 = null;
        if (arg0 != -12928) {
            field17 = -40;
        }
        field24 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class2() {
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class2(String arg0) {
        this.field20 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Llk;B)V")
    public static final void method8(class82 arg0, byte arg1) {
        field15++;
        if (class111.field1684 == arg0.field1290 || arg0.field1252 == -1 || arg0.field1287 != 0 || (arg0.field1214 + 1) > class104.method688(arg0.field1252, 30091).field3080[arg0.field1288]) {
            int var2 = arg0.field1290 - arg0.field1208;
            int var3 = class111.field1684 - arg0.field1208;
            int var4 = arg0.field1216 * 128 + arg0.method565((byte) 0) * 64;
            int var5 = arg0.field1279 * 128 + arg0.method565((byte) 0) * 64;
            int var6 = arg0.field1250 * 128 + arg0.method565((byte) 0) * 64;
            int var7 = arg0.field1274 * 128 + (arg0.method565((byte) 0) * 64);
            arg0.field1273 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field1226 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        arg0.field1206 = 0;
        if (arg0.field1242 == 0) {
            arg0.field1211 = 1024;
        }
        if (arg0.field1242 == 1) {
            arg0.field1211 = 1536;
        }
        if (arg1 < 88) {
            field23 = null;
        }
        if (arg0.field1242 == 2) {
            arg0.field1211 = 0;
        }
        if (arg0.field1242 == 3) {
            arg0.field1211 = 512;
        }
        arg0.field1222 = arg0.field1211;
    }
}
