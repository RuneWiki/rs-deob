import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class25 extends class19 {

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "Lsd;")
    public class166 field442 = class191.field3633;

    @OriginalMember(owner = "client!ce", name = "gb", descriptor = "I")
    public int field460 = 0;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "Lsd;")
    public static class166 field443 = class135.method935("W-=hlen Sie eine Welt", 0);

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field441 = 0;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "Z")
    public static boolean field446 = false;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "Lsd;")
    private static class166 field450 = class135.method935("Enter your username (V password)3", 0);

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "Lsd;")
    private static class166 field453 = class135.method935("Sorry invited players only)3", 0);

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "Lsd;")
    public static class166 field457 = field453;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field448 = -1;

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "Lsd;")
    public static class166 field458 = field450;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!ce", name = "ib", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ce", name = "jb", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "[I")
    public int[] field449;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "[I")
    public static int[] field452;

    @OriginalMember(owner = "client!ce", name = "hb", descriptor = "[I")
    public int[] field461;

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "[Lsd;")
    public class166[] field459;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)I")
    public static final int method191(int arg0, int arg1) {
        field451++;
        return arg1 == 256 ? arg0 >> 17 & 0x7 : -101;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILjava/awt/Component;ILih;)Lsg;")
    public static final class169 method192(boolean arg0, int arg1, Component arg2, int arg3, class80 arg4) {
        field463++;
        if (class161.field3075 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class169 var5 = (class169) Class.forName("uh").getDeclaredConstructor().newInstance();
                var5.field3251 = new int[(class139.field2713 ? 2 : 1) * 256];
                var5.field3260 = arg1;
                var5.method48(arg2);
                var5.field3267 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field3267 > 16384) {
                    var5.field3267 = 16384;
                }
                var5.method45(var5.field3267);
                if (class108.field2107 > 0 && class189.field3583 == null) {
                    class189.field3583 = new class175();
                    class189.field3583.field3320 = arg4;
                    arg4.method655(class189.field3583, class108.field2107, 1048576);
                }
                if (class189.field3583 != null) {
                    if (class189.field3583.field3314[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class189.field3583.field3314[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                if (arg0) {
                    method191(-98, 6);
                }
                try {
                    class7 var6 = new class7(arg4, arg3);
                    var6.field3260 = arg1;
                    var6.field3251 = new int[(class139.field2713 ? 2 : 1) * 256];
                    var6.method48(arg2);
                    var6.field3267 = 16384;
                    var6.method45(var6.field3267);
                    if (class108.field2107 > 0 && class189.field3583 == null) {
                        class189.field3583 = new class175();
                        class189.field3583.field3320 = arg4;
                        arg4.method655(class189.field3583, class108.field2107, 1048576);
                    }
                    if (class189.field3583 != null) {
                        if (class189.field3583.field3314[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class189.field3583.field3314[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class169();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([BZ)Lhb;")
    public static final class66 method193(byte[] arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field462++;
        if (arg0 == null) {
            return null;
        } else {
            class66 var2 = new class66(arg0, class47.field884, class82.field1664, class41.field723, class161.field3083, class9.field176, class137.field2669);
            class102.method773(104);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILff;)V")
    public final void method194(int arg0, class53 arg1) {
        field455++;
        while (true) {
            int var3 = arg1.method400(arg0 + 260);
            if (var3 == 0) {
                if (arg0 == -5) {
                    return;
                } else {
                    method195((byte) -97);
                    return;
                }
            }
            this.method197(arg0 ^ 0xFFFFFFAC, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method195(byte arg0) {
        field450 = null;
        field452 = null;
        field443 = null;
        field453 = null;
        if (arg0 >= -76) {
            field441 = -86;
        }
        field458 = null;
        field457 = null;
    }

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)Lug;")
    public static final class187 method196(int arg0) {
        field444++;
        if (arg0 <= 15) {
            return null;
        }
        try {
            return (class187) Class.forName("bd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILff;)V")
    private final void method197(int arg0, int arg1, class53 arg2) {
        int var4 = -97 % ((-arg0 - 56) / 47);
        if (arg1 == 1) {
            this.field456 = arg2.method400(255);
        } else if (arg1 == 2) {
            this.field454 = arg2.method400(255);
        } else if (arg1 == 3) {
            this.field442 = arg2.method436((byte) 118);
        } else if (arg1 == 4) {
            this.field445 = arg2.method419(-4);
        } else if (arg1 == 5) {
            this.field460 = arg2.method405(2);
            this.field459 = new class166[this.field460];
            this.field461 = new int[this.field460];
            for (int var5 = 0; var5 < this.field460; var5++) {
                this.field461[var5] = arg2.method419(-4);
                this.field459[var5] = arg2.method436((byte) 98);
            }
        } else if (arg1 == 6) {
            this.field460 = arg2.method405(2);
            this.field461 = new int[this.field460];
            this.field449 = new int[this.field460];
            for (int var6 = 0; var6 < this.field460; var6++) {
                this.field461[var6] = arg2.method419(-4);
                this.field449[var6] = arg2.method419(-4);
            }
        }
        field447++;
    }
}
