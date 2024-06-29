import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 extends class144 {

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "Lk;")
    public class69 field214 = new class69();

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "Loa;")
    public class98 field225 = new class98();

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "Lld;")
    private class80 field218;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "Ltd;")
    private static class136 field209 = class145.method1172("Please subscribe)1 or use a different world)3", 45);

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "Ltd;")
    public static class136 field217 = class145.method1172("null", 45);

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "Ltd;")
    public static class136 field205 = field209;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field215 = new CRC32();

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "Ltd;")
    public static class136 field221 = class145.method1172("RuneScape wird geladen )2 bitte warten)3)3)3", 45);

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static int field226 = 0;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "Z")
    public static volatile boolean field224 = true;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "Ltd;")
    public static class136 field223 = class145.method1172("cross", 45);

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "Lue;")
    public static class143 field222 = new class143(30);

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "Ltd;")
    public static class136 field229 = class145.method1172("Passwort: ", 45);

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "Ltd;")
    private static class136 field232 = class145.method1172("red:", 45);

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "Ltd;")
    public static class136 field231 = field232;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "Ltd;")
    public static class136 field230 = field232;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Lka;")
    public static class70 field219;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "()Lv;")
    public final class144 method79() {
        field208++;
        class81 var1;
        do {
            var1 = (class81) this.field214.method520((byte) 71);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1908 == null);
        return var1.field1908;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public final void method80(int arg0) {
        this.field225.method80(arg0);
        field210++;
        for (class81 var2 = (class81) this.field214.method512(0); var2 != null; var2 = (class81) this.field214.method520((byte) 91)) {
            if (!this.field218.method578(113, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1926) {
                        this.method84(var2, (byte) 127, var3);
                        var2.field1926 -= var3;
                        break;
                    }
                    this.method84(var2, (byte) 125, var2.field1926);
                    var3 -= var2.field1926;
                } while (!this.field218.method604(0, var3, var2, -1066387288, null));
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
    public static final void method81(byte arg0) {
        if (arg0 != -52) {
            field230 = null;
        }
        field206++;
        while (true) {
            class69 var1 = class147.field3383;
            class93 var2;
            synchronized (class147.field3383) {
                var2 = (class93) client.field443.method514(-1);
            }
            if (var2 == null) {
                return;
            }
            var2.field2186.method857((int) var2.field2090, false, (byte) 26, var2.field2193, var2.field2177);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Lke;")
    public static final class74 method82(int arg0, byte arg1) {
        field204++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class94.field2201[var2] == null || class94.field2201[var2][var3] == null) {
            boolean var4 = class91.method688(var2, (byte) -126);
            if (!var4) {
                return null;
            }
        }
        return arg1 == 108 ? class94.field2201[var2][var3] : null;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "()Lv;")
    public final class144 method83() {
        field216++;
        class81 var1 = (class81) this.field214.method512(0);
        if (var1 == null) {
            return null;
        } else if (var1.field1908 == null) {
            return this.method79();
        } else {
            return var1.field1908;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lle;BI)V")
    private final void method84(class81 arg0, byte arg1, int arg2) {
        if ((this.field218.field1887[arg0.field1930] & 0x4) != 0 && arg0.field1924 < 0) {
            int var4 = this.field218.field1890[arg0.field1930] / class5.field89;
            int var5 = (var4 + 1048575 - arg0.field1922) / var4;
            arg0.field1922 = arg2 * var4 + arg0.field1922 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field218.field1855[arg0.field1930] == 0) {
                    arg0.field1908 = class46.method402(arg0.field1919, arg0.field1908.method382(), arg0.field1908.method387(), arg0.field1908.method379());
                } else {
                    arg0.field1908 = class46.method402(arg0.field1919, arg0.field1908.method382(), 0, arg0.field1908.method379());
                    this.field218.method598(arg0.field1921.field90[arg0.field1946] < 0, arg0, true);
                }
                if (arg0.field1921.field90[arg0.field1946] < 0) {
                    arg0.field1908.method385(-1);
                }
                arg2 = arg0.field1922 / var4;
            }
        }
        if (arg1 >= 121) {
            field213++;
            arg0.field1908.method80(arg2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lle;IIII[I)V")
    private final void method85(class81 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        field220++;
        if (~(this.field218.field1887[arg0.field1930] & 0x4) != arg2 && arg0.field1924 < 0) {
            int var7 = this.field218.field1890[arg0.field1930] / class5.field89;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field1922) / var7;
                if (arg1 < var8) {
                    arg0.field1922 += arg1 * var7;
                    break;
                }
                arg1 -= var8;
                int var9 = 262144 / var7;
                arg0.field1908.method87(arg5, arg3, var8);
                arg0.field1922 += var7 * var8 - 1048576;
                int var10 = class5.field89 / 100;
                class46 var11 = arg0.field1908;
                arg3 += var8;
                if (var10 > var9) {
                    var10 = var9;
                }
                if (this.field218.field1855[arg0.field1930] == 0) {
                    arg0.field1908 = class46.method402(arg0.field1919, var11.method382(), var11.method387(), var11.method379());
                } else {
                    arg0.field1908 = class46.method402(arg0.field1919, var11.method382(), 0, var11.method379());
                    this.field218.method598(arg0.field1921.field90[arg0.field1946] < 0, arg0, true);
                    arg0.field1908.method388(var10, var11.method387());
                }
                if (arg0.field1921.field90[arg0.field1946] < 0) {
                    arg0.field1908.method385(-1);
                }
                var11.method381(var10);
                var11.method87(arg5, arg3, arg4 - arg3);
                if (var11.method375()) {
                    this.field225.method788(var11);
                }
            }
        }
        arg0.field1908.method87(arg5, arg3, arg1);
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public static void method86(int arg0) {
        field230 = null;
        field229 = null;
        field217 = null;
        int var1 = 48 / ((-arg0 - 71) / 40);
        field215 = null;
        field205 = null;
        field209 = null;
        field231 = null;
        field222 = null;
        field221 = null;
        field223 = null;
        field232 = null;
        field219 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([III)V")
    public final void method87(int[] arg0, int arg1, int arg2) {
        field203++;
        this.field225.method87(arg0, arg1, arg2);
        for (class81 var4 = (class81) this.field214.method512(0); var4 != null; var4 = (class81) this.field214.method520((byte) 98)) {
            if (!this.field218.method578(118, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1926) {
                        this.method85(var4, var5, -1, var6, var5 + var6, arg0);
                        var4.field1926 -= var5;
                        break;
                    }
                    this.method85(var4, var4.field1926, -1, var6, var5 + var6, arg0);
                    var6 += var4.field1926;
                    var5 -= var4.field1926;
                } while (!this.field218.method604(var6, var5, var4, -1066387288, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
    public final int method88() {
        field207++;
        return 0;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lld;)V")
    public class12(class80 arg0) {
        this.field218 = arg0;
    }
}
