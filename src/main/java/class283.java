import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class283 {

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "[I")
    private int[] field4157 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Ljn;")
    public static class409 field4164 = new class409("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "Lbt;")
    public static class363 field4166 = new class363(260);

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Ljn;")
    public static class409 field4167 = new class409("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "[I")
    public static int[] field4168 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "Lg;")
    public static class446 field4169 = new class446();

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "[I")
    private int[] field4162;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[S")
    private short[] field4151;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "[S")
    private short[] field4154;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "[S")
    private short[] field4158;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "[S")
    private short[] field4160;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)Le;")
    public final class100 method1905(byte arg0) {
        field4156++;
        class100[] var2 = new class100[5];
        if (arg0 != 40) {
            this.method1910(true);
        }
        int var3 = 0;
        class104 var4 = class57.field693;
        synchronized (class57.field693) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field4157[var5] != -1) {
                    var2[var3++] = class267.method1838(0, this.field4157[var5], false, class57.field693);
                }
            }
        }
        class100 var6 = new class100(var2, var3);
        if (this.field4154 != null) {
            for (int var7 = 0; var7 < this.field4154.length; var7++) {
                var6.method666(this.field4154[var7], this.field4160[var7], false);
            }
        }
        if (this.field4151 != null) {
            for (int var8 = 0; var8 < this.field4151.length; var8++) {
                var6.method670(this.field4158[var8], this.field4151[var8], 86);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIII)V")
    public static final void method1906(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -42) {
            field4169 = null;
        }
        field4159++;
        class125 var5 = class56.method428(arg4, 4, -3636);
        var5.method846(26848);
        var5.field1654 = arg3;
        var5.field1657 = arg0;
        var5.field1653 = arg2;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lat;I)V")
    public final void method1907(class256 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field4163++;
        while (true) {
            int var3 = arg0.method1738((byte) 49);
            if (var3 == 0) {
                return;
            }
            this.method1913(arg0, true, var3);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)I")
    public static final int method1908(int arg0) {
        if (arg0 >= -88) {
            method1908(118);
        }
        field4155++;
        if ((double) class66.field851 == 3.0D) {
            return 37;
        } else if ((double) class66.field851 == 4.0D) {
            return 50;
        } else if ((double) class66.field851 == 6.0D) {
            return 75;
        } else if ((double) class66.field851 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public static void method1909(int arg0) {
        field4169 = null;
        field4164 = null;
        field4166 = null;
        field4167 = null;
        if (arg0 == 0) {
            field4168 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)Z")
    public final boolean method1910(boolean arg0) {
        field4161++;
        boolean var2 = arg0;
        class104 var3 = class57.field693;
        synchronized (class57.field693) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field4157[var4] != -1 && !class57.field693.method716(-32096, 0, this.field4157[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)Z")
    public final boolean method1911(boolean arg0) {
        field4165++;
        if (this.field4162 == null) {
            return true;
        }
        boolean var2 = arg0;
        class104 var3 = class57.field693;
        synchronized (class57.field693) {
            for (int var4 = 0; var4 < this.field4162.length; var4++) {
                if (!class57.field693.method716(-32096, 0, this.field4162[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)Le;")
    public final class100 method1912(int arg0) {
        field4152++;
        if (this.field4162 == null) {
            return null;
        }
        class100[] var2 = new class100[this.field4162.length];
        class104 var3 = class57.field693;
        synchronized (class57.field693) {
            int var4 = arg0;
            while (true) {
                if (var4 >= this.field4162.length) {
                    break;
                }
                var2[var4] = class267.method1838(0, this.field4162[var4], false, class57.field693);
                var4++;
            }
        }
        class100 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class100(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field4154 != null) {
            for (int var6 = 0; var6 < this.field4154.length; var6++) {
                var5.method666(this.field4154[var6], this.field4160[var6], false);
            }
        }
        if (this.field4151 != null) {
            for (int var7 = 0; var7 < this.field4151.length; var7++) {
                var5.method670(this.field4158[var7], this.field4151[var7], 79);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lat;ZI)V")
    private final void method1913(class256 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return;
        }
        if (arg2 == 1) {
            arg0.method1738((byte) 48);
        } else if (arg2 == 2) {
            int var8 = arg0.method1738((byte) -47);
            this.field4162 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4162[var9] = arg0.method1767(1930493576);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var4 = arg0.method1738((byte) -26);
                this.field4154 = new short[var4];
                this.field4160 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4154[var5] = (short) arg0.method1767(1930493576);
                    this.field4160[var5] = (short) arg0.method1767(1930493576);
                }
            } else if (arg2 == 41) {
                int var6 = arg0.method1738((byte) 91);
                this.field4158 = new short[var6];
                this.field4151 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4151[var7] = (short) arg0.method1767(1930493576);
                    this.field4158[var7] = (short) arg0.method1767(1930493576);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field4157[arg2 - 60] = arg0.method1767(1930493576);
            }
        }
        field4153++;
    }
}
