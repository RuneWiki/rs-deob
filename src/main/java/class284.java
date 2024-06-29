import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class284 implements Runnable {

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Lse;")
    private class139 field4125 = new class139();

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public int field4129 = 0;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Z")
    private boolean field4134 = false;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field4132;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "[[Z")
    public static boolean[][] field4124 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field4121 = 0;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "[I")
    public static int[] field4130 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lpm;")
    public static class349 field4123 = new class349("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4139 = "";

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "[[B")
    public static byte[][] field4137 = new byte[1000][];

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Lpm;")
    public static class349 field4136 = new class349("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "Ltj;")
    public static class108 field4140;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "[[[B")
    public static byte[][][] field4138;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILhc;)V")
    private final void method1949(int arg0, class75 arg1) {
        field4120++;
        class139 var3 = this.field4125;
        synchronized (this.field4125) {
            this.field4125.method1055(arg1, 124);
            this.field4129++;
            this.field4125.notifyAll();
            int var4 = 65 % ((arg0 + 58) / 61);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method1950(int arg0) {
        field4130 = null;
        field4139 = null;
        field4123 = null;
        field4137 = null;
        field4136 = null;
        field4140 = null;
        field4124 = null;
        field4138 = null;
        if (arg0 != 0) {
            field4137 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "run", descriptor = "()V")
    public final void run() {
        field4122++;
        while (!this.field4134) {
            class139 var1 = this.field4125;
            class75 var2;
            synchronized (this.field4125) {
                var2 = (class75) this.field4125.method1054((byte) -68);
                if (var2 == null) {
                    try {
                        this.field4125.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4129--;
            }
            try {
                if (var2.field985 == 2) {
                    var2.field989.method1611(var2.field990, 15619, var2.field990.length, (int) var2.field5232);
                } else if (var2.field985 == 3) {
                    var2.field990 = var2.field989.method1614((int) var2.field5232, true);
                }
            } catch (Exception var6) {
                class334.method2191(true, (String) null, var6);
            }
            var2.field6348 = false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
    public static final void method1951(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4135++;
        if (arg0 > -106) {
            method1951(-75, (String) null, 118, -30, -81, -9, -102);
        }
        class264 var7 = new class264();
        var7.field3886 = arg5;
        var7.field3889 = class34.field434 + arg4;
        var7.field3887 = arg1;
        var7.field3885 = arg3;
        var7.field3883 = arg2;
        var7.field3890 = arg6;
        class113.field1457.method1076(120, var7);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lwe;II)Lhc;")
    public final class75 method1952(class233 arg0, int arg1, int arg2) {
        field4126++;
        class75 var4 = new class75();
        var4.field985 = 1;
        class139 var5 = this.field4125;
        synchronized (this.field4125) {
            class75 var6 = (class75) this.field4125.method1053(115);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg1) == var6.field5232 && var6.field989 == arg0 && var6.field985 == 2) {
                    var4.field990 = var6.field990;
                    var4.field6348 = false;
                    return var4;
                }
                var6 = (class75) this.field4125.method1058(127);
            }
        }
        var4.field990 = arg0.method1614(arg1, true);
        var4.field6348 = false;
        int var8 = -71 % ((-arg2 - 39) / 49);
        var4.field6349 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILwe;I[B)Lhc;")
    public final class75 method1953(int arg0, class233 arg1, int arg2, byte[] arg3) {
        field4127++;
        class75 var5 = new class75();
        var5.field990 = arg3;
        var5.field989 = arg1;
        if (arg0 != 1000) {
            this.field4134 = true;
        }
        var5.field6349 = false;
        var5.field985 = 2;
        var5.field5232 = (long) arg2;
        this.method1949(-123, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lmj;")
    public static final class394 method1954(int arg0, int arg1) {
        field4131++;
        class15 var2 = class341.field4926;
        class394 var3;
        synchronized (class341.field4926) {
            var3 = (class394) class341.field4926.method99(true, (long) arg1);
        }
        if (arg0 != 12338) {
            field4130 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class216.field3121.method643(3, arg1, true);
        class394 var5 = new class394();
        if (var4 != null) {
            var5.method2482(0, new class130(var4));
        }
        class15 var6 = class341.field4926;
        synchronized (class341.field4926) {
            class341.field4926.method90(var5, (long) arg1, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZII)V")
    public static final void method1955(boolean arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            class59.field786 = class269.method1830(arg1, class321.field4701, class117.field1588, (byte) -79, class401.field5628, class233.field3451 * 2);
        } else {
            if (arg0) {
                class59.field786 = class269.method1830(0, class321.field4701, class117.field1588, (byte) -85, class401.field5628, 0);
                class59.field786.method886(0);
                class182 var3 = class432.method2699(0, class327.field4745, class392.field5514, (byte) -90);
                class335 var4 = class59.field786.method1024(var3, class337.method2215(class15.field216, class392.field5514, 0), true);
                class135.method1044(true, 30585, class169.field2394.method2284((byte) 126, class309.field4497), var4);
                class59.field786.method882();
                class158.method1151(-46);
                class59.field786.method1831((byte) 127);
            }
            try {
                class59.field786 = class269.method1830(arg1, class321.field4701, class117.field1588, (byte) -65, class401.field5628, class233.field3451 * 2);
            } catch (Throwable var8) {
                arg1 = 0;
                class59.field786 = class269.method1830(0, class321.field4701, class117.field1588, (byte) -60, class401.field5628, 0);
            }
        }
        field4119++;
        if (class59.field786.method957()) {
            class205 var5 = class59.field786.method934(134217728);
            class59.field786.method999(var5);
        }
        class110.field1418 = arg1;
        class56.method364(8);
        if (!class59.field786.method964()) {
            class287.field4169 = 1;
        }
        class59.field786.method936(class287.field4169);
        class59.field786.method890(0);
        class44.field598 = class59.field786.method1016();
        class392.field5515 = class59.field786.method1016();
        int var6 = 121 % ((-arg2 - 13) / 52);
        int var7 = (int) ((double) class80.field1034 * 34.46D);
        if (class59.field786.method918()) {
            var7 += 128;
        }
        class59.field786.method980(50, var7);
        class59.field786.method984(!class103.field1326);
        if (class59.field786.method880()) {
            class410.method2597(class255.field3795, true);
        }
        class327.field4742 = !class296.method2000((byte) -122);
        class287.method1960(class59.field786, class381.field5414 >> 3, class80.field1034 >> 3, (byte) 82);
        class349.method2289((byte) -80);
        class315.field4627 = false;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public final void method1956(int arg0) {
        this.field4134 = true;
        field4128++;
        class139 var2 = this.field4125;
        synchronized (this.field4125) {
            this.field4125.notifyAll();
            if (arg0 <= 32) {
                field4121 = 118;
            }
        }
        try {
            this.field4132.join();
        } catch (InterruptedException var3) {
        }
        this.field4132 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILwe;B)Lhc;")
    public final class75 method1957(int arg0, class233 arg1, byte arg2) {
        field4133++;
        class75 var4 = new class75();
        if (arg2 != 63) {
            method1950(119);
        }
        var4.field985 = 3;
        var4.field6349 = false;
        var4.field5232 = (long) arg0;
        var4.field989 = arg1;
        this.method1949(47, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lml;)V")
    public class284(class219 arg0) {
        class156 var2 = arg0.method1538(5, 94, this);
        while (var2.field2298 == 0) {
            class259.method1790((byte) -86, 10L);
        }
        if (var2.field2298 == 2) {
            throw new RuntimeException();
        }
        this.field4132 = (Thread) var2.field2295;
    }
}
