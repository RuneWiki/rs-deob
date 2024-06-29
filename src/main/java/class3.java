import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class3 {

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "[I")
    private int[] field17 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "Lnj;")
    public static class487 field21 = new class487("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "Lib;")
    public class14 field28;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "Ldda;")
    public static class597 field15;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "[I")
    private int[] field24;

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "[Lha;")
    public static class116[] field34;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "[S")
    private short[] field16;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "[S")
    private short[] field20;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "[S")
    private short[] field23;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "[S")
    private short[] field31;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
    public static void method7(boolean arg0) {
        field15 = null;
        field21 = null;
        field34 = null;
        if (!arg0) {
            method16(-71, null, 92, 50);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZLps;)V")
    public final void method8(boolean arg0, class428 arg1) {
        while (true) {
            int var3 = arg1.method2561((byte) -124);
            if (var3 == 0) {
                field26++;
                if (arg0) {
                    field14 = -25;
                    return;
                }
                return;
            }
            this.method14(var3, arg1, 16);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)Lbt;")
    public final class114 method9(int arg0) {
        field22++;
        class114[] var2 = new class114[5];
        int var3 = 0;
        class597 var4 = this.field28.field126;
        synchronized (this.field28.field126) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field17[var5] != -1) {
                    var2[var3++] = class559.method3271(80, 0, this.field17[var5], this.field28.field126);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field1459 < 13) {
                var2[var6].method699((byte) -94, 0);
            }
        }
        class114 var7 = new class114(var2, var3);
        if (this.field23 != null) {
            for (int var8 = 0; var8 < this.field23.length; var8++) {
                var7.method698(this.field16[var8], this.field23[var8], false);
            }
        }
        if (arg0 != -14009) {
            field14 = -80;
        }
        if (this.field20 != null) {
            for (int var9 = 0; var9 < this.field20.length; var9++) {
                var7.method703(arg0 - 9597, this.field31[var9], this.field20[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZII)Z")
    public static final boolean method10(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method16(-120, null, 82, -40);
        }
        field29++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)Lbt;")
    public final class114 method11(int arg0) {
        field18++;
        if (this.field24 == null) {
            return null;
        }
        class114[] var2 = new class114[this.field24.length];
        class597 var3 = this.field28.field126;
        synchronized (this.field28.field126) {
            int var4 = 0;
            while (true) {
                if (this.field24.length <= var4) {
                    break;
                }
                var2[var4] = class559.method3271(arg0 + 83, 0, this.field24[var4], this.field28.field126);
                var4++;
            }
        }
        if (arg0 != -3) {
            method15(null, 105, true, null);
        }
        for (int var5 = 0; var5 < this.field24.length; var5++) {
            if (var2[var5].field1459 < 13) {
                var2[var5].method699((byte) -124, 0);
            }
        }
        class114 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class114(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field23 != null) {
            for (int var7 = 0; var7 < this.field23.length; var7++) {
                var6.method698(this.field16[var7], this.field23[var7], false);
            }
        }
        if (this.field20 != null) {
            for (int var8 = 0; var8 < this.field20.length; var8++) {
                var6.method703(-23606, this.field31[var8], this.field20[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)Z")
    public final boolean method12(int arg0) {
        field19++;
        if (this.field24 == null) {
            return true;
        }
        boolean var2 = true;
        class597 var3 = this.field28.field126;
        synchronized (this.field28.field126) {
            for (int var4 = arg0; var4 < this.field24.length; var4++) {
                if (!this.field28.field126.method3461(this.field24[var4], 0, arg0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z")
    public final boolean method13(byte arg0) {
        field30++;
        boolean var2 = true;
        class597 var3 = this.field28.field126;
        synchronized (this.field28.field126) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field17[var4] != -1 && !this.field28.field126.method3461(this.field17[var4], 0, 0)) {
                    var2 = false;
                }
            }
            if (arg0 != -102) {
                this.method9(-84);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILps;I)V")
    private final void method14(int arg0, class428 arg1, int arg2) {
        if (arg2 != 16) {
            this.method11(-56);
        }
        field27++;
        if (arg0 == 1) {
            arg1.method2561((byte) -72);
        } else if (arg0 == 2) {
            int var4 = arg1.method2561((byte) -14);
            this.field24 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field24[var5] = arg1.method2620(83);
            }
            return;
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var8 = arg1.method2561((byte) -31);
                this.field23 = new short[var8];
                this.field16 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field23[var9] = (short) arg1.method2620(arg2 + 99);
                    this.field16[var9] = (short) arg1.method2620(125);
                }
            } else if (arg0 == 41) {
                int var6 = arg1.method2561((byte) 118);
                this.field31 = new short[var6];
                this.field20 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field20[var7] = (short) arg1.method2620(31);
                    this.field31[var7] = (short) arg1.method2620(37);
                }
                return;
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field17[arg0 - 60] = arg1.method2620(61);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Canvas;IZLn;)Lqa;")
    public static final class167 method15(Canvas arg0, int arg1, boolean arg2, class472 arg3) {
        field33++;
        int var4 = -124 % ((-arg1 - 49) / 40);
        return arg2 ? new class529(arg0, arg3) : new class532(arg0, arg3);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILwca;II)V")
    public static final void method16(int arg0, class311 arg1, int arg2, int arg3) {
        field25++;
        if (class106.field1333 != null || class139.field1826 || arg1 == null || class201.method1302(arg3 + 2836, arg1) == null) {
            return;
        }
        class106.field1333 = arg1;
        class533.field7896 = class201.method1302(-100, arg1);
        class431.field6322 = 0;
        class59.field711 = false;
        class465.field6732 = arg2;
        if (arg3 == -2941) {
            class158.field2107 = arg0;
        }
    }

    static {
        new class487("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field32 = 0;
    }
}
