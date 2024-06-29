import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class205 {

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Llg;")
    private class106 field4035 = new class106();

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Leh;")
    public static class47 field4031 = class195.method1282((byte) -4, "Benutzername: ");

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Lub;")
    public static class182 field4038 = new class182();

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Leh;")
    public static class47 field4040 = class195.method1282((byte) -4, "Anmelde)2Zeitlimit -Uberschritten)3");

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Leh;")
    public static class47 field4042 = class195.method1282((byte) -4, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field4044 = 0;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Leh;")
    public static class47 field4041 = class195.method1282((byte) -4, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Leh;")
    public static class47 field4039 = class195.method1282((byte) -4, "Clientscript error in: ");

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILlg;)V")
    public final void method1345(int arg0, class106 arg1) {
        field4030++;
        if (arg0 != 0) {
            field4040 = null;
        }
        if (arg1.field2213 != null) {
            arg1.method865(-13283);
        }
        arg1.field2220 = this.field4035.field2220;
        arg1.field2213 = this.field4035;
        arg1.field2213.field2220 = arg1;
        arg1.field2220.field2213 = arg1;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)Llg;")
    public final class106 method1346(byte arg0) {
        field4037++;
        class106 var2 = this.field4035.field2220;
        if (this.field4035 == var2) {
            return null;
        } else if (arg0 == 43) {
            var2.method865(arg0 - 13326);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1347(int arg0) {
        if (arg0 >= -84) {
            return;
        }
        field4038 = null;
        field4031 = null;
        field4040 = null;
        field4041 = null;
        field4042 = null;
        field4039 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Llg;I)V")
    public final void method1348(class106 arg0, int arg1) {
        field4036++;
        if (arg0.field2213 != null) {
            arg0.method865(-13283);
        }
        arg0.field2220 = this.field4035;
        arg0.field2213 = this.field4035.field2213;
        arg0.field2213.field2220 = arg0;
        arg0.field2220.field2213 = arg0;
        if (arg1 != 256) {
            this.method1346((byte) 41);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IJ)V")
    public static final void method1349(int arg0, long arg1) {
        field4032++;
        if (arg1 == 0L) {
            return;
        }
        if (class5.field88 >= 100) {
            class60.method506(-125, class181.field3472, 0, class158.field3071);
            return;
        }
        class47 var3 = class173.method1166(arg1, 1).method387(false);
        for (int var4 = arg0; var4 < class5.field88; var4++) {
            if (class25.field487[var4] == arg1) {
                class60.method506(arg0 ^ 0x61, class181.field3472, 0, class5.method24(new class47[] { var3, class94.field1936 }, (byte) 91));
                return;
            }
        }
        for (int var5 = 0; var5 < class77.field1679; var5++) {
            if (class31.field593[var5] == arg1) {
                class60.method506(arg0 ^ 0x6F, class181.field3472, 0, class5.method24(new class47[] { class177.field3395, var3, class39.field758 }, (byte) 85));
                return;
            }
        }
        if (var3.method409(123, class123.field2489.field598)) {
            class60.method506(-124, class181.field3472, 0, class24.field473);
            return;
        }
        class25.field487[class5.field88] = arg1;
        class103.field2167++;
        class14.field303[class5.field88++] = class173.method1166(arg1, 1);
        class36.field713 = class103.field2162;
        class60.field1174.method657(arg0 ^ 0x6E16, 47);
        class60.field1174.method600(32601, arg1);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLah;Lah;)I")
    public static final int method1350(boolean arg0, class9 arg1, class9 arg2) {
        field4034++;
        int var3 = 0;
        if (arg1.method74((byte) 98, class161.field3127, class39.field772)) {
            var3++;
        }
        if (arg2.method74((byte) 98, class161.field3127, class3.field38)) {
            var3++;
        }
        if (arg2.method74((byte) 98, class161.field3127, class141.field2777)) {
            var3++;
        }
        if (!arg0) {
            method1349(-37, -56L);
        }
        if (arg2.method74((byte) 98, class161.field3127, class132.field2607)) {
            var3++;
        }
        if (arg2.method74((byte) 98, class161.field3127, class148.field2908)) {
            var3++;
        }
        if (arg2.method74((byte) 98, class161.field3127, class90.field1887)) {
            var3++;
        }
        arg2.method74((byte) 98, class161.field3127, class180.field3453);
        arg2.method74((byte) 98, class161.field3127, class108.field2243);
        arg2.method74((byte) 98, class161.field3127, class68.field1490);
        arg2.method74((byte) 98, class161.field3127, class79.field1695);
        arg2.method74((byte) 98, class161.field3127, class97.field2057);
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/awt/Component;ILqf;I)Lmf;")
    public static final class114 method1351(int arg0, Component arg1, int arg2, class150 arg3, int arg4) {
        if (arg2 != 637) {
            field4042 = null;
        }
        field4043++;
        if (class110.field2276 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class114 var5 = (class114) Class.forName("rd").getDeclaredConstructor().newInstance();
                var5.field2331 = new int[(class36.field697 ? 2 : 1) * 256];
                var5.field2337 = arg4;
                var5.method498(arg1);
                var5.field2336 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field2336 > 16384) {
                    var5.field2336 = 16384;
                }
                var5.method497(var5.field2336);
                if (class47.field973 > 0 && class12.field248 == null) {
                    class12.field248 = new class25();
                    class12.field248.field486 = arg3;
                    arg3.method1052(2, class47.field973, class12.field248);
                }
                if (class12.field248 != null) {
                    if (class12.field248.field480[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class12.field248.field480[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class58 var6 = new class58(arg3, arg0);
                    var6.field2331 = new int[(class36.field697 ? 2 : 1) * 256];
                    var6.field2337 = arg4;
                    var6.method498(arg1);
                    var6.field2336 = 16384;
                    var6.method497(var6.field2336);
                    if (class47.field973 > 0 && class12.field248 == null) {
                        class12.field248 = new class25();
                        class12.field248.field486 = arg3;
                        arg3.method1052(arg2 ^ 0x27F, class47.field973, class12.field248);
                    }
                    if (class12.field248 != null) {
                        if (class12.field248.field480[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class12.field248.field480[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class114();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)Llg;")
    public final class106 method1352(byte arg0) {
        class106 var2 = this.field4035.field2220;
        field4033++;
        if (this.field4035 == var2) {
            return null;
        } else {
            if (arg0 != 120) {
                field4031 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class205() {
        this.field4035.field2220 = this.field4035;
        this.field4035.field2213 = this.field4035;
    }
}
