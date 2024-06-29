import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class111 {

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "Lsq;")
    private class117 field1762 = new class117();

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "Lgf;")
    public static class180 field1757;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "[I")
    public static int[] field1760;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "Lsq;")
    private class117 field1764;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "Lf;")
    public static class528 field1765;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uq", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field1766;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "[I")
    public static int[] field1759;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)Lsq;")
    public final class117 method814(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field1754++;
        class117 var2 = this.field1762.field1845;
        if (this.field1762 == var2) {
            return null;
        } else {
            var2.method855(51);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
    public final void method815(int arg0) {
        if (arg0 != 1690797447) {
            this.field1762 = null;
        }
        field1749++;
        while (true) {
            class117 var2 = this.field1762.field1845;
            if (this.field1762 == var2) {
                this.field1764 = null;
                return;
            }
            var2.method855(51);
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Lsq;")
    public final class117 method816(int arg0) {
        field1763++;
        class117 var2 = this.field1764;
        if (this.field1762 == var2) {
            this.field1764 = null;
            return null;
        }
        if (arg0 <= 115) {
            this.field1762 = null;
        }
        this.field1764 = var2.field1845;
        return var2;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)I")
    public static final int method817(int arg0, int arg1) {
        int var2 = ((arg0 & 0xAAAAAAAB) >>> 1) + (arg0 & 0x55555555);
        if (arg1 != 12562) {
            method821(15, 116, 19, (byte) -71);
        }
        field1761++;
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIII)V")
    public static final void method818(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= class229.field3347 && class156.field2366 >= arg1) {
            int var5 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg4);
            int var6 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg2);
            class53.method387(arg3, 0, var6, var5, arg1);
        }
        int var7 = 39 % ((arg0 - 58) / 39);
        field1756++;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lsq;I)V")
    public final void method819(class117 arg0, int arg1) {
        field1752++;
        if (arg1 != 1431655765) {
            return;
        }
        if (arg0.field1843 != null) {
            arg0.method855(arg1 ^ 0x55555566);
        }
        arg0.field1843 = this.field1762.field1843;
        arg0.field1845 = this.field1762;
        arg0.field1843.field1845 = arg0;
        arg0.field1845.field1843 = arg0;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)Lsq;")
    public final class117 method820(boolean arg0) {
        field1750++;
        class117 var2 = this.field1762.field1845;
        if (!arg0) {
            this.method825(-17);
        }
        if (this.field1762 == var2) {
            this.field1764 = null;
            return null;
        } else {
            this.field1764 = var2.field1845;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIB)Z")
    public static final boolean method821(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 54) {
            return true;
        }
        field1753++;
        boolean var4 = true;
        class232 var5 = (class232) class396.method2468(arg1, arg0, arg2);
        if (var5 != null) {
            var4 &= class112.method832((byte) 78, var5);
        }
        class232 var6 = (class232) class51.method372(arg1, arg0, arg2, field1766 == null ? (field1766 = method826("rq")) : field1766);
        if (var6 != null) {
            var4 &= class112.method832((byte) 78, var6);
        }
        class232 var7 = (class232) class358.method2310(arg1, arg0, arg2);
        if (var7 != null) {
            var4 &= class112.method832((byte) 78, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)V")
    public static final void method822(int arg0) {
        if (arg0 != 4) {
            return;
        }
        field1758++;
        if (class382.field5684 < 1024.0F) {
            class382.field5684 = 1024.0F;
        }
        while (class66.field1161 >= 16384.0F) {
            class66.field1161 -= 16384.0F;
        }
        if (class382.field5684 > 3072.0F) {
            class382.field5684 = 3072.0F;
        }
        while (class66.field1161 < 0.0F) {
            class66.field1161 += 16384.0F;
        }
        int var1 = class510.field7532 >> 7;
        int var2 = class87.field1460 >> 7;
        int var3 = class259.method1646(class87.field1460, class510.field7532, 851701031, class434.field6317);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < (class237.field3436 - 4) && (class83.field1366 - 4) > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class434.field6317;
                    if (var7 < 3 && class72.method606(var5, var6, (byte) -51)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class227.field3314.field2270 != null && class227.field3314.field2270[var7] != null) {
                        var8 = (class227.field3314.field2270[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class529.field7807[var7].method271(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class520.field7639) {
            class520.field7639 += (var10 - class520.field7639) / 24;
        } else if (class520.field7639 > var10) {
            class520.field7639 += (var10 - class520.field7639) / 80;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class410.field6042 = arg4;
        class305.field4370 = arg0;
        if (arg6 != -6) {
            method824(31);
        }
        class406.field5975 = arg2;
        class403.field5928 = arg3;
        class275.field3988 = arg5;
        class438.field6391 = arg1;
        field1755++;
    }

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)V")
    public static void method824(int arg0) {
        if (arg0 != 1431655765) {
            method823(103, 72, -3, 92, 14, -92, (byte) 113);
        }
        field1765 = null;
        field1759 = null;
        field1757 = null;
        field1760 = null;
    }

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)I")
    public final int method825(int arg0) {
        field1751++;
        int var2 = arg0;
        for (class117 var3 = this.field1762.field1845; var3 != this.field1762; var3 = var3.field1845) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V")
    public class111() {
        this.field1762.field1845 = this.field1762;
        this.field1762.field1843 = this.field1762;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method826(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class180("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field1757 = new class180(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");
        field1760 = new int[100];
    }
}
