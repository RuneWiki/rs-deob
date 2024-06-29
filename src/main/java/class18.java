import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class18 {

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Lka;")
    private class177 field225 = new class177();

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "[[[I")
    public static int[][][] field208 = new int[4][13][13];

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field210 = -1;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static volatile int field215 = 0;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lbe;")
    public static class283 field217 = class153.method941(126, "sl_arrows");

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field219 = 0;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Lbe;")
    public static class283 field224 = class153.method941(13, " (X");

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field223 = new CRC32();

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Lbe;")
    public static class283 field228 = class153.method941(127, "k");

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Lka;")
    private class177 field227;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Z")
    public static boolean field222;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Lka;", line = 5)
    public final class177 method106(boolean arg0) {
        field209++;
        class177 var2 = this.field225.field3053;
        if (this.field225 == var2) {
            this.field227 = null;
            return null;
        }
        this.field227 = var2.field3053;
        if (arg0) {
            field219 = -42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)V", line = 40)
    public static final void method107(int arg0, int arg1, byte arg2) {
        if (arg2 > -18) {
            method113(-118, -128, -36, 71, 60);
        }
        field220++;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg1;
        var3[0] = arg0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class194.field3317[var6] != arg1) {
                var4[var5] = class194.field3317[var6];
                var3[var5] = class248.field4233[var6];
                var5++;
            }
        }
        class248.field4233 = var3;
        class194.field3317 = var4;
        class200.method1288(0, (byte) -124, class122.field2041.length - 1, class122.field2041);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 80)
    public static void method108(byte arg0) {
        if (arg0 != 5) {
            field222 = false;
        }
        field208 = (int[][][]) null;
        field217 = null;
        field223 = null;
        field224 = null;
        field228 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZ)I", line = 102)
    public static final int method109(byte arg0, boolean arg1) {
        if (!arg1) {
            field228 = (class283) null;
        }
        field212++;
        if (arg0 >= 65 && arg0 <= 90) {
            return arg0 - 65;
        } else if (arg0 >= 97 && arg0 <= 122) {
            return arg0 + 26 - 97;
        } else if (arg0 >= 48 && arg0 <= 57) {
            return arg0 + 52 - 48;
        } else if (arg0 == 43) {
            return 62;
        } else if (arg0 == 42) {
            return 62;
        } else if (arg0 == 47) {
            return 63;
        } else if (arg0 == 45) {
            return 63;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)Lka;", line = 144)
    public final class177 method110(byte arg0) {
        field214++;
        if (arg0 > -15) {
            this.method112(-53);
        }
        class177 var2 = this.field227;
        if (this.field225 == var2) {
            this.field227 = null;
            return null;
        } else {
            this.field227 = var2.field3053;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILka;)V", line = 166)
    public final void method111(int arg0, class177 arg1) {
        int var3 = -58 % ((arg0 + 91) / 32);
        if (arg1.field3038 != null) {
            arg1.method1168(4);
        }
        arg1.field3038 = this.field225.field3038;
        arg1.field3053 = this.field225;
        arg1.field3038.field3053 = arg1;
        field221++;
        arg1.field3053.field3038 = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 190)
    public final void method112(int arg0) {
        field218++;
        if (arg0 != -1) {
            method109((byte) -91, true);
        }
        while (true) {
            class177 var2 = this.field225.field3053;
            if (this.field225 == var2) {
                this.field227 = null;
                return;
            }
            var2.method1168(4);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V", line = 218)
    public static final void method113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class217.field3677 && class247.field4220 >= arg3) {
            int var5 = class44.method263(class166.field2765, arg0, (byte) -110, class269.field4551);
            int var6 = class44.method263(class166.field2765, arg2, (byte) -48, class269.field4551);
            class46.method269(var5, arg1, var6, (byte) 108, arg3);
        }
        if (arg4 != 0) {
            method107(125, -9, (byte) 123);
        }
        field211++;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)Lka;", line = 237)
    public final class177 method114(byte arg0) {
        field216++;
        if (arg0 != 47) {
            field208 = (int[][][]) ((int[][][]) null);
        }
        class177 var2 = this.field225.field3053;
        if (this.field225 == var2) {
            return null;
        } else {
            var2.method1168(arg0 ^ 0x2B);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILui;IILjava/awt/Component;)Lof;", line = 267)
    public static final class225 method115(int arg0, class251 arg1, int arg2, int arg3, Component arg4) {
        field226++;
        if (class205.field3493 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class225 var5 = (class225) Class.forName("sa").getDeclaredConstructor().newInstance();
                var5.field3799 = arg3;
                var5.field3771 = new int[(class141.field2355 ? 2 : 1) * 256];
                var5.method365(arg4);
                var5.field3795 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field3795 > 16384) {
                    var5.field3795 = 16384;
                }
                var5.method363(var5.field3795);
                if (arg0 < 30) {
                    method113(0, 29, -21, -95, -7);
                }
                if (class5.field43 > 0 && class126.field2101 == null) {
                    class126.field2101 = new class14();
                    class126.field2101.field156 = arg1;
                    arg1.method1691(class5.field43, 25, class126.field2101);
                }
                if (class126.field2101 != null) {
                    if (class126.field2101.field153[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class126.field2101.field153[arg2] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class56 var7 = new class56(arg1, arg2);
                    var7.field3771 = new int[(class141.field2355 ? 2 : 1) * 256];
                    var7.field3799 = arg3;
                    var7.method365(arg4);
                    var7.field3795 = 16384;
                    var7.method363(var7.field3795);
                    if (class5.field43 > 0 && class126.field2101 == null) {
                        class126.field2101 = new class14();
                        class126.field2101.field156 = arg1;
                        arg1.method1691(class5.field43, 25, class126.field2101);
                    }
                    if (class126.field2101 != null) {
                        if (class126.field2101.field153[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class126.field2101.field153[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class225();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 363)
    public class18() {
        this.field225.field3038 = this.field225;
        this.field225.field3053 = this.field225;
    }
}
