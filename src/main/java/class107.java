import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class107 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "[I")
    private int[] field1594 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lkl;")
    public static class55 field1595;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lqp;")
    public static class466 field1605;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lwb;")
    public class216 field1608;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
    private int[] field1611;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "[S")
    private short[] field1596;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[S")
    private short[] field1601;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[S")
    private short[] field1602;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "[S")
    private short[] field1607;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Lkq;")
    public final class419 method782(int arg0) {
        field1597++;
        if (this.field1611 == null) {
            return null;
        }
        class419[] var2 = new class419[this.field1611.length];
        class101 var3 = this.field1608.field3013;
        synchronized (this.field1608.field3013) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field1611.length) {
                    break;
                }
                var2[var4] = class109.method798(this.field1608.field3013, 0, this.field1611[var4], -101);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field1611.length; var5++) {
            if (var2[var5].field6121 < 13) {
                var2[var5].method2492((byte) -92, 0);
            }
        }
        if (arg0 <= 114) {
            this.method783(-45);
        }
        class419 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class419(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field1602 != null) {
            for (int var7 = 0; var7 < this.field1602.length; var7++) {
                var6.method2488(this.field1601[var7], 77, this.field1602[var7]);
            }
        }
        if (this.field1607 != null) {
            for (int var8 = 0; var8 < this.field1607.length; var8++) {
                var6.method2496(this.field1596[var8], 56, this.field1607[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Z")
    public final boolean method783(int arg0) {
        field1600++;
        if (this.field1611 == null) {
            return true;
        }
        boolean var2 = true;
        class101 var3 = this.field1608.field3013;
        synchronized (this.field1608.field3013) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field1611.length) {
                    break;
                }
                if (!this.field1608.field3013.method729(this.field1611[var4], 0, -8410)) {
                    var2 = false;
                }
                var4++;
            }
        }
        int var5 = 16 / ((arg0 + 90) / 36);
        return var2;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lsi;I)V")
    public final void method784(class391 arg0, int arg1) {
        field1599++;
        while (true) {
            int var3 = arg0.method2348(-2);
            if (var3 == 0) {
                if (arg1 > -10) {
                    this.field1594 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method788(3, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)Z")
    public final boolean method785(boolean arg0) {
        field1606++;
        boolean var2 = arg0;
        class101 var3 = this.field1608.field3013;
        synchronized (this.field1608.field3013) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field1594[var4] != -1 && !this.field1608.field3013.method729(this.field1594[var4], 0, -8410)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lkq;")
    public final class419 method786(byte arg0) {
        field1603++;
        class419[] var2 = new class419[5];
        int var3 = 0;
        class101 var4 = this.field1608.field3013;
        synchronized (this.field1608.field3013) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field1594[var5] != -1) {
                    var2[var3++] = class109.method798(this.field1608.field3013, 0, this.field1594[var5], -119);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field6121 < 13) {
                var2[var6].method2492((byte) -59, 0);
            }
        }
        class419 var7 = new class419(var2, var3);
        if (arg0 > -78) {
            this.method783(101);
        }
        if (this.field1602 != null) {
            for (int var8 = 0; var8 < this.field1602.length; var8++) {
                var7.method2488(this.field1601[var8], 78, this.field1602[var8]);
            }
        }
        if (this.field1607 != null) {
            for (int var9 = 0; var9 < this.field1607.length; var9++) {
                var7.method2496(this.field1596[var9], 124, this.field1607[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static void method787(int arg0) {
        if (arg0 == 0) {
            field1595 = null;
            field1605 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILsi;I)V")
    private final void method788(int arg0, class391 arg1, int arg2) {
        if (arg0 != 3) {
            this.method784(null, 73);
        }
        field1610++;
        if (arg2 == 1) {
            arg1.method2348(-2);
        } else if (arg2 == 2) {
            int var8 = arg1.method2348(arg0 - 5);
            this.field1611 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1611[var9] = arg1.method2353((byte) 102);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var4 = arg1.method2348(-2);
                this.field1601 = new short[var4];
                this.field1602 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1602[var5] = (short) arg1.method2353((byte) 127);
                    this.field1601[var5] = (short) arg1.method2353((byte) 90);
                }
                return;
            }
            if (arg2 == 41) {
                int var6 = arg1.method2348(-2);
                this.field1607 = new short[var6];
                this.field1596 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1607[var7] = (short) arg1.method2353((byte) 90);
                    this.field1596[var7] = (short) arg1.method2353((byte) 68);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field1594[arg2 - 60] = arg1.method2353((byte) 78);
                return;
            }
            return;
        }
    }

    static {
        new class466("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field1595 = new class55(15, 0, 1, 0);
        field1605 = new class466("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");
    }
}
