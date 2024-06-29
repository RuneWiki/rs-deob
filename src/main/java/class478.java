import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class478 {

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Z")
    public boolean field7084 = false;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lhn;")
    private class509 field7077 = new class509(64);

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "Lhn;")
    public class509 field7085 = new class509(500);

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lhn;")
    public class509 field7086 = new class509(30);

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Lhn;")
    public class509 field7087 = new class509(50);

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Z")
    public boolean field7073;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lfo;")
    private class361 field7078;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Lfo;")
    public class361 field7076;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lsd;")
    public static class63 field7075 = new class63(14, 0, 4, 1);

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Lao;")
    public static class191 field7079 = new class191(7, -2);

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Ljc;")
    public static class305 field7082 = new class305("M", "M", "M", "M");

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Ljc;")
    public static class305 field7083 = new class305("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public int field7088;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 3)
    public final void method2912(int arg0) {
        class509 var2 = this.field7077;
        synchronized (this.field7077) {
            if (arg0 > -20) {
                this.field7078 = null;
            }
            this.field7077.method3034((byte) 111);
        }
        field7067++;
        class509 var3 = this.field7085;
        synchronized (this.field7085) {
            this.field7085.method3034((byte) 70);
        }
        class509 var4 = this.field7086;
        synchronized (this.field7086) {
            this.field7086.method3034((byte) 78);
        }
        class509 var5 = this.field7087;
        synchronized (this.field7087) {
            this.field7087.method3034((byte) 95);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 28)
    public static void method2913(int arg0) {
        field7075 = null;
        if (arg0 != -2) {
            method2915(true, 123);
        }
        field7083 = null;
        field7082 = null;
        field7079 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V", line = 43)
    public final void method2914(int arg0, int arg1) {
        if (arg1 != 10123) {
            return;
        }
        class509 var3 = this.field7077;
        synchronized (this.field7077) {
            this.field7077.method3036(arg0, (byte) -34);
        }
        field7068++;
        class509 var4 = this.field7085;
        synchronized (this.field7085) {
            this.field7085.method3036(arg0, (byte) -97);
        }
        class509 var5 = this.field7086;
        synchronized (this.field7086) {
            this.field7086.method3036(arg0, (byte) -44);
        }
        class509 var6 = this.field7087;
        synchronized (this.field7087) {
            this.field7087.method3036(arg0, (byte) -26);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)Lqu;", line = 65)
    public static final class65 method2915(boolean arg0, int arg1) {
        field7080++;
        if (!arg0) {
            return null;
        }
        class65 var2 = (class65) class395.field5701.method3032(3589, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field683.method2130(0, arg1, -127);
        class65 var4 = new class65();
        if (var3 != null) {
            var4.method387(new class396(var3), 0, arg1);
        }
        class395.field5701.method3046((long) arg1, var4, 1);
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V", line = 97)
    public final void method2916(int arg0, boolean arg1) {
        field7069++;
        if (this.field7084 == arg1) {
            return;
        }
        this.field7084 = arg1;
        this.method2922(-111);
        if (arg0 != 0) {
            this.field7076 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZB)V", line = 112)
    public static final void method2917(boolean arg0, byte arg1) {
        class466.method2847(false);
        field7066++;
        if (!class102.method623(class527.field7734, 112)) {
            return;
        }
        class378.field5471++;
        if (class378.field5471 < 50 && !arg0) {
            return;
        }
        class378.field5471 = 0;
        if (arg1 < 33) {
            return;
        }
        if (!class151.field1974 && class446.field6499 != null) {
            class33.field336++;
            class492.method2979(class406.field5840, 61);
            try {
                class446.field6499.method2620(true, class106.field1443.field5761, 0, class106.field1443.field5729);
                class106.field1443.field5729 = 0;
            } catch (IOException var2) {
                class151.field1974 = true;
            }
        }
        class466.method2847(false);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)V", line = 148)
    public final void method2918(byte arg0, int arg1) {
        if (arg0 > 1) {
            this.field7077 = new class509(arg1);
            field7072++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V", line = 159)
    public final void method2919(int arg0, int arg1) {
        this.field7088 = arg0;
        field7070++;
        class509 var3 = this.field7085;
        synchronized (this.field7085) {
            int var4 = 52 % ((arg1 - 4) / 37);
            this.field7085.method3045(48);
        }
        class509 var5 = this.field7086;
        synchronized (this.field7086) {
            this.field7086.method3045(48);
        }
        class509 var6 = this.field7087;
        synchronized (this.field7087) {
            this.field7087.method3045(48);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)Ler;", line = 178)
    public final class70 method2920(int arg0, int arg1) {
        field7074++;
        class509 var3 = this.field7077;
        class70 var4;
        synchronized (this.field7077) {
            var4 = (class70) this.field7077.method3032(arg1 - 15630, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field7078;
        byte[] var6;
        synchronized (this.field7078) {
            var6 = this.field7078.method2130(class246.method1526((byte) -114, arg0), class127.method769(arg1 + 2597, arg0), -80);
        }
        class70 var7 = new class70();
        var7.field834 = arg0;
        var7.field875 = this;
        if (var6 != null) {
            var7.method412(new class396(var6), arg1 - 19112);
        }
        var7.method414((byte) -84);
        if (var7.field891) {
            var7.field872 = false;
            var7.field904 = 0;
        }
        if (arg1 != 19219) {
            this.field7088 = -124;
        }
        if (!this.field7073 && var7.field895) {
            var7.field835 = null;
            var7.field879 = null;
        }
        class509 var8 = this.field7077;
        synchronized (this.field7077) {
            this.field7077.method3046((long) arg0, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZZ)V", line = 229)
    public final void method2921(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method2916(-107, true);
        }
        field7081++;
        if (arg1 != this.field7073) {
            this.field7073 = arg1;
            this.method2922(-111);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 251)
    public final void method2922(int arg0) {
        class509 var2 = this.field7077;
        synchronized (this.field7077) {
            this.field7077.method3045(48);
        }
        field7071++;
        class509 var3 = this.field7085;
        synchronized (this.field7085) {
            if (arg0 > -110) {
                this.field7084 = true;
            }
            this.field7085.method3045(48);
        }
        class509 var4 = this.field7086;
        synchronized (this.field7086) {
            this.field7086.method3045(48);
        }
        class509 var5 = this.field7087;
        synchronized (this.field7087) {
            this.field7087.method3045(48);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V", line = 273)
    public static final void method2923() {
        if (class484.field7131 != null) {
            for (int var0 = 0; var0 < class484.field7131.length; var0++) {
                for (int var1 = 0; var1 < class515.field7487; var1++) {
                    for (int var2 = 0; var2 < class114.field1494; var2++) {
                        if (class484.field7131[var0][var1][var2] != null) {
                            class484.field7131[var0][var1][var2].method2996((byte) -90);
                        }
                        class484.field7131[var0][var1][var2] = null;
                    }
                }
            }
        }
        class484.field7131 = null;
        class14.field152 = null;
        if (class95.field1140 != null) {
            for (int var3 = 0; var3 < class95.field1140.length; var3++) {
                for (int var4 = 0; var4 < class515.field7487; var4++) {
                    for (int var5 = 0; var5 < class114.field1494; var5++) {
                        if (class95.field1140[var3][var4][var5] != null) {
                            class95.field1140[var3][var4][var5].method2996((byte) -90);
                        }
                        class95.field1140[var3][var4][var5] = null;
                    }
                }
            }
        }
        class95.field1140 = null;
        class378.field5470 = null;
        class186.field2421 = null;
        class152.field1993 = null;
        class421.field6116 = 0;
        if (class508.field7354 != null) {
            for (int var6 = 0; var6 < class421.field6116; var6++) {
                class508.field7354[var6] = null;
            }
        }
        if (class447.field6523 != null) {
            for (int var7 = 0; var7 < class428.field6219; var7++) {
                class447.field6523[var7] = null;
            }
            class428.field6219 = 0;
        }
        if (class124.field1608 != null) {
            for (int var8 = 0; var8 < class73.field925; var8++) {
                class124.field1608[var8] = null;
            }
            for (int var9 = 0; var9 < field7065; var9++) {
                for (int var10 = 0; var10 < class515.field7487; var10++) {
                    for (int var11 = 0; var11 < class114.field1494; var11++) {
                        class35.field354[var9][var10][var11] = 0L;
                    }
                }
            }
            class73.field925 = 0;
        }
        class505.field7340 = null;
        class19.method110(0);
        class249.field3320.method283(28837);
        class215.field2939 = null;
        class516.field7502 = null;
        class117.field1534 = null;
        class429.field6242 = null;
        class164.field2145 = null;
        class492.field7216 = null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ld;IZLfo;Lfo;)V", line = 441)
    public class478(class104 arg0, int arg1, boolean arg2, class361 arg3, class361 arg4) {
        this.field7073 = arg2;
        this.field7078 = arg3;
        this.field7076 = arg4;
        if (this.field7078 != null) {
            int var6 = this.field7078.method2138(-1) - 1;
            this.field7078.method2136(-80, var6);
        }
    }
}
