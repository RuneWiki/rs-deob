import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class178 {

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "Lde;")
    private class534 field2491 = new class534(256);

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "Ld;")
    private class153 field2493;

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "Lij;")
    private class424 field2499;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "[Liea;")
    public static class481[] field2496;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method1215(byte arg0, long arg1) {
        field2495++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                char var10 = class751.field10495[(int) (var8 - (arg1 * 37L))];
                if (var10 == '_') {
                    int var11 = var6.length() - 1;
                    var6.setCharAt(var11, Character.toUpperCase(var6.charAt(var11)));
                    var10 = ' ';
                }
                var6.append(var10);
            }
            int var7 = -9 / ((55 - arg0) / 61);
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
    public static void method1216(int arg0) {
        field2496 = null;
        if (arg0 != 26972) {
            method1215((byte) -25, -105L);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)Lwk;")
    public final class145 method1217(int arg0, int arg1) {
        field2497++;
        Object var3 = this.field2491.method3079((long) arg0, arg1 ^ arg1);
        if (var3 != null) {
            return (class145) var3;
        } else if (this.field2493.method1071((byte) 120, arg0)) {
            class537 var4 = this.field2493.method1072(arg0, true);
            int var5 = var4.field7460 ? 64 : this.field2499.field5645;
            class145 var7;
            if (var4.field7452 && this.field2499.method442()) {
                float[] var6 = this.field2493.method1067(0.7F, false, arg0, 7, var5, var5);
                var7 = this.field2499.method2399(var6, var5, var5, 0, class269.field3396, var4.field7446 != 0);
            } else {
                int[] var8;
                if (var4.field7450 != 2 && class162.method1132(var4.field7443, 23093)) {
                    var8 = this.field2493.method1069(var5, arg0, true, var5, 0.7F, 6766);
                } else {
                    var8 = this.field2493.method1068(var5, 0.7F, arg0, -22669, false, var5);
                }
                var7 = this.field2499.method2407(72, var4.field7446 != 0, var8, var5, var5);
            }
            var7.method813((byte) 67, var4.field7442, var4.field7455);
            this.field2491.method3077((byte) -39, (long) arg0, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZLkp;Z)V")
    public static final void method1218(int arg0, boolean arg1, class491 arg2, boolean arg3) {
        field2488++;
        int var4 = arg2.field6978;
        int var5 = (int) arg2.field2333;
        arg2.method1175(-2);
        if (arg3) {
            class173.method1194(var4, (byte) -16);
        }
        class229.method1456(var4, arg0 ^ arg0);
        class288 var6 = class501.method2936(-71, var5);
        if (var6 != null) {
            class207.method1332((byte) -124, var6);
        }
        class533.method3063(4);
        if (!arg1 && class540.field7482 != -1) {
            class1.method1(1, class540.field7482, (byte) 13);
        }
        class722 var7 = new class722(class290.field3804);
        for (class491 var8 = (class491) var7.method4031(false); var8 != null; var8 = (class491) var7.method4032((byte) 72)) {
            if (!var8.method1176((byte) 68)) {
                var8 = (class491) var7.method4031(false);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field6976 == 3) {
                int var9 = (int) var8.field2333;
                if (var9 >>> 16 == var4) {
                    method1218(256, arg1, var8, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
    public final void method1219(byte arg0) {
        this.field2491.method3065(true);
        if (arg0 <= 21) {
            this.field2493 = null;
        }
        field2489++;
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
    public final void method1220(int arg0) {
        this.field2491.method3070(5, arg0 - 22451);
        if (arg0 == 22570) {
            field2494++;
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(II)V")
    public static final void method1221(int arg0, int arg1) {
        class557.field7751 = -1;
        if (arg0 != 37) {
            method1218(59, true, null, true);
        }
        class108.field1561 = -1;
        field2490++;
        class756.field10543 = arg1;
        class358.method2080(arg0 - 160);
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lij;Ld;)V")
    public class178(class424 arg0, class153 arg1) {
        this.field2493 = arg1;
        this.field2499 = arg0;
    }
}
