import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class258 extends class282 {

    @OriginalMember(owner = "client!u", name = "W", descriptor = "Z")
    public volatile boolean field4499 = true;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "Ljf;")
    public static class229 field4493 = class212.method1457((byte) 62, "gelb:");

    @OriginalMember(owner = "client!u", name = "N", descriptor = "Ljf;")
    public static class229 field4490 = class212.method1457((byte) 60, "null");

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field4491 = 0;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field4497 = 0;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "Ljf;")
    public static class229 field4496 = class212.method1457((byte) 58, "Chargement des sprites )2 ");

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field4498 = 0;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Z")
    public boolean field4494;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "Z")
    public boolean field4501;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lek;Lek;I)V", line = 14)
    public static final void method1837(class185 arg0, class185 arg1, int arg2) {
        class115.field2076 = arg1;
        class83.field1599 = arg0;
        if (arg2 <= 24) {
            method1839((byte[]) null, 88);
        }
        field4492++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/Component;IILkn;I)Lfk;", line = 28)
    public static final class45 method1838(Component arg0, int arg1, int arg2, class198 arg3, int arg4) {
        field4495++;
        if (class22.field363 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class45 var5 = (class45) Class.forName("gj").getDeclaredConstructor().newInstance();
                var5.field843 = arg1;
                var5.field836 = new int[(class128.field2292 ? 2 : 1) * 256];
                var5.method79(arg0);
                var5.field839 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field839 > 16384) {
                    var5.field839 = 16384;
                }
                var5.method82(var5.field839);
                if (class122.field2168 > 0 && class10.field125 == null) {
                    class10.field125 = new class141();
                    class10.field125.field2455 = arg3;
                    arg3.method1373(class10.field125, 4, class122.field2168);
                }
                if (class10.field125 != null) {
                    if (class10.field125.field2451[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class10.field125.field2451[arg2] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class13 var7 = new class13(arg3, arg2);
                    var7.field843 = arg1;
                    var7.field836 = new int[(class128.field2292 ? 2 : 1) * 256];
                    var7.method79(arg0);
                    var7.field839 = 16384;
                    var7.method82(var7.field839);
                    if (class122.field2168 > 0 && class10.field125 == null) {
                        class10.field125 = new class141();
                        class10.field125.field2455 = arg3;
                        arg3.method1373(class10.field125, arg4 ^ 0xFFFFF873, class122.field2168);
                    }
                    if (arg4 != -1929) {
                        method1837((class185) null, (class185) null, -7);
                    }
                    if (class10.field125 != null) {
                        if (class10.field125.field2451[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class10.field125.field2451[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class45();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BI)[B", line = 129)
    public static final byte[] method1839(byte[] arg0, int arg1) {
        class14 var2 = new class14(arg0);
        field4500++;
        int var3 = 39 % ((arg1 + 4) / 51);
        int var4 = var2.method93(false);
        int var5 = var2.method128((byte) 4);
        if (var5 < 0 || class245.field4362 != 0 && class245.field4362 < var5) {
            throw new RuntimeException();
        } else if (var4 == 0) {
            byte[] var6 = new byte[var5];
            var2.method101(-31322, 0, var6, var5);
            return var6;
        } else {
            int var7 = var2.method128((byte) 4);
            if (var7 < 0 || class245.field4362 != 0 && var7 > class245.field4362) {
                throw new RuntimeException();
            }
            byte[] var8 = new byte[var7];
            if (var4 == 1) {
                class87.method624(var8, var7, arg0, var5, 9);
            } else {
                class174.field3035.method2111(var2, -104, var8);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(B)V", line = 192)
    public static void method1840(byte arg0) {
        if (arg0 != 48) {
            method1839((byte[]) null, -97);
        }
        field4496 = null;
        field4490 = null;
        field4493 = null;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(B)[B")
    public abstract byte[] method339(byte arg0);

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I")
    public abstract int method333(int arg0);
}
