import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class61 extends class207 {

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "Lke;")
    public class106 field1198 = new class106();

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "Lii;")
    public class203 field1201 = new class203();

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "Ldd;")
    private class238 field1197;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "[I")
    public static int[] field1189 = new int[128];

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "Lcd;")
    public static class64 field1191 = class44.method335((byte) 71, "T");

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "Lcd;")
    public static class64 field1195 = class44.method335((byte) 71, ")4j");

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "Lcd;")
    public static class64 field1200 = class44.method335((byte) 71, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field1194 = 0;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "[[[Lbd;")
    public static class295[][][] field1192;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()Lwj;", line = 5)
    public final class207 method477() {
        field1187++;
        class197 var1 = (class197) this.field1198.method778(0);
        if (var1 == null) {
            return null;
        } else if (var1.field3356 == null) {
            return this.method480();
        } else {
            return var1.field3356;
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V", line = 20)
    public final void method478(int arg0) {
        field1193++;
        this.field1201.method478(arg0);
        for (class197 var2 = (class197) this.field1198.method778(0); var2 != null; var2 = (class197) this.field1198.method775(26517)) {
            if (!this.field1197.method1710(false, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3367) {
                        this.method484(var2, false, var3);
                        var2.field3367 -= var3;
                        break;
                    }
                    this.method484(var2, false, var2.field3367);
                    var3 -= var2.field3367;
                } while (!this.field1197.method1733(-2, var2, (int[]) null, 0, var3));
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "([III)V", line = 60)
    public final void method479(int[] arg0, int arg1, int arg2) {
        this.field1201.method479(arg0, arg1, arg2);
        field1203++;
        for (class197 var4 = (class197) this.field1198.method778(0); var4 != null; var4 = (class197) this.field1198.method775(26517)) {
            if (!this.field1197.method1710(false, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field3367) {
                        this.method483(var5, arg0, var4, var6, (byte) 126, var6 + var5);
                        var4.field3367 -= var5;
                        break;
                    }
                    this.method483(var4.field3367, arg0, var4, var6, (byte) 121, var5 + var6);
                    var6 += var4.field3367;
                    var5 -= var4.field3367;
                } while (!this.field1197.method1733(-2, var4, arg0, var6, var5));
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "()Lwj;", line = 105)
    public final class207 method480() {
        field1202++;
        class197 var1;
        do {
            var1 = (class197) this.field1198.method775(26517);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3356 == null);
        return var1.field3356;
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)V", line = 134)
    public static void method481(int arg0) {
        field1195 = null;
        field1191 = null;
        field1192 = (class295[][][]) null;
        field1200 = null;
        if (arg0 != -26261) {
            method481(69);
        }
        field1189 = null;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()I", line = 163)
    public final int method482() {
        field1199++;
        return 0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[ILo;IBI)V", line = 174)
    private final void method483(int arg0, int[] arg1, class197 arg2, int arg3, byte arg4, int arg5) {
        field1190++;
        if ((this.field1197.field4040[arg2.field3368] & 0x4) != 0 && arg2.field3360 < 0) {
            int var7 = this.field1197.field4022[arg2.field3368] / class63.field1213;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field3378) / var7;
                if (var8 > arg0) {
                    arg2.field3378 += arg0 * var7;
                    break;
                }
                arg2.field3356.method479(arg1, arg3, var8);
                arg3 += var8;
                arg2.field3378 += var7 * var8 - 1048576;
                int var9 = class63.field1213 / 100;
                arg0 -= var8;
                class294 var10 = arg2.field3356;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field1197.field4026[arg2.field3368] == 0) {
                    arg2.field3356 = class294.method2045(arg2.field3366, var10.method2048(), var10.method2020(), var10.method2039());
                } else {
                    arg2.field3356 = class294.method2045(arg2.field3366, var10.method2048(), 0, var10.method2039());
                    this.field1197.method1703((byte) -115, arg2.field3364.field1548[arg2.field3369] < 0, arg2);
                    arg2.field3356.method2057(var9, var10.method2020());
                }
                if (arg2.field3364.field1548[arg2.field3369] < 0) {
                    arg2.field3356.method2023(-1);
                }
                var10.method2024(var9);
                var10.method479(arg1, arg3, arg5 - arg3);
                if (var10.method2041()) {
                    this.field1201.method1420(var10);
                }
            }
        }
        arg2.field3356.method479(arg1, arg3, arg0);
        if (arg4 < 98) {
            field1189 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lo;ZI)V", line = 236)
    private final void method484(class197 arg0, boolean arg1, int arg2) {
        if ((this.field1197.field4040[arg0.field3368] & 0x4) != 0 && arg0.field3360 < 0) {
            int var4 = this.field1197.field4022[arg0.field3368] / class63.field1213;
            int var5 = (var4 + 1048575 - arg0.field3378) / var4;
            arg0.field3378 = arg2 * var4 + arg0.field3378 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field1197.field4026[arg0.field3368] == 0) {
                    arg0.field3356 = class294.method2045(arg0.field3366, arg0.field3356.method2048(), arg0.field3356.method2020(), arg0.field3356.method2039());
                } else {
                    arg0.field3356 = class294.method2045(arg0.field3366, arg0.field3356.method2048(), 0, arg0.field3356.method2039());
                    this.field1197.method1703((byte) 112, arg0.field3364.field1548[arg0.field3369] < 0, arg0);
                }
                if (arg0.field3364.field1548[arg0.field3369] < 0) {
                    arg0.field3356.method2023(-1);
                }
                arg2 = arg0.field3378 / var4;
            }
        }
        field1188++;
        arg0.field3356.method478(arg2);
        if (arg1) {
            this.method484((class197) null, false, 43);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ldd;)V", line = 286)
    public class61(class238 arg0) {
        this.field1197 = arg0;
    }
}
