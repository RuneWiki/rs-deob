import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class261 {

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "[I")
    private int[] field4206 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field4214 = -1;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "Lpr;")
    public static class236 field4216;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "J")
    public static long field4217;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "Lmr;")
    public class163 field4212;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "[I")
    private int[] field4208;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "[S")
    private short[] field4207;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "[S")
    private short[] field4209;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "[S")
    private short[] field4211;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "[S")
    private short[] field4213;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lmn;Lmn;B)V")
    public static final void method1773(class162 arg0, class162 arg1, byte arg2) {
        class19.field196 = arg0;
        if (arg2 != -47) {
            method1779(-7);
        }
        class377.field5796 = arg1;
        field4200++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)Z")
    public final boolean method1774(byte arg0) {
        field4210++;
        if (this.field4208 == null) {
            return true;
        } else if (arg0 < 66) {
            return true;
        } else {
            boolean var2 = true;
            class162 var3 = this.field4212.field2361;
            synchronized (this.field4212.field2361) {
                for (int var4 = 0; var4 < this.field4208.length; var4++) {
                    if (!this.field4212.field2361.method993(this.field4208[var4], 1939, 0)) {
                        var2 = false;
                    }
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILhw;I)V")
    private final void method1775(int arg0, class208 arg1, int arg2) {
        if (arg0 != -12050) {
            this.method1774((byte) 108);
        }
        field4202++;
        if (arg2 == 1) {
            arg1.method1445(121);
        } else if (arg2 == 2) {
            int var8 = arg1.method1445(62);
            this.field4208 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4208[var9] = arg1.method1455(-3387);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var4 = arg1.method1445(arg0 ^ 0xFFFFD0D3);
                this.field4213 = new short[var4];
                this.field4209 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field4209[var5] = (short) arg1.method1455(-3387);
                    this.field4213[var5] = (short) arg1.method1455(-3387);
                }
                return;
            }
            if (arg2 == 41) {
                int var6 = arg1.method1445(arg0 ^ 0xFFFFD0CE);
                this.field4207 = new short[var6];
                this.field4211 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4211[var7] = (short) arg1.method1455(arg0 + 8663);
                    this.field4207[var7] = (short) arg1.method1455(-3387);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field4206[arg2 - 60] = arg1.method1455(-3387);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Lfc;")
    public final class438 method1776(int arg0) {
        field4203++;
        if (this.field4208 == null) {
            return null;
        }
        class438[] var2 = new class438[this.field4208.length];
        class162 var3 = this.field4212.field2361;
        synchronized (this.field4212.field2361) {
            int var4 = 0;
            if (arg0 != 13640) {
                this.field4206 = null;
            }
            while (true) {
                if (this.field4208.length <= var4) {
                    break;
                }
                var2[var4] = class73.method534(false, this.field4212.field2361, this.field4208[var4], 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field4208.length; var5++) {
            if (var2[var5].field6766 < 13) {
                var2[var5].method2770(0, 0);
            }
        }
        class438 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class438(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field4209 != null) {
            for (int var7 = 0; var7 < this.field4209.length; var7++) {
                var6.method2778((byte) -55, this.field4209[var7], this.field4213[var7]);
            }
        }
        if (this.field4211 != null) {
            for (int var8 = 0; var8 < this.field4211.length; var8++) {
                var6.method2773(this.field4211[var8], (byte) 120, this.field4207[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLhw;)V")
    public final void method1777(byte arg0, class208 arg1) {
        field4205++;
        if (arg0 < 44) {
            this.method1777((byte) -89, null);
        }
        while (true) {
            int var3 = arg1.method1445(25);
            if (var3 == 0) {
                return;
            }
            this.method1775(-12050, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)Lfc;")
    public final class438 method1778(byte arg0) {
        field4204++;
        class438[] var2 = new class438[5];
        int var3 = 0;
        class162 var4 = this.field4212.field2361;
        synchronized (this.field4212.field2361) {
            int var5 = 0;
            if (arg0 != -42) {
                this.method1776(84);
            }
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field4206[var5] != -1) {
                    var2[var3++] = class73.method534(false, this.field4212.field2361, this.field4206[var5], 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field6766 < 13) {
                var2[var6].method2770(0, 0);
            }
        }
        class438 var7 = new class438(var2, var3);
        if (this.field4209 != null) {
            for (int var8 = 0; var8 < this.field4209.length; var8++) {
                var7.method2778((byte) -112, this.field4209[var8], this.field4213[var8]);
            }
        }
        if (this.field4211 != null) {
            for (int var9 = 0; var9 < this.field4211.length; var9++) {
                var7.method2773(this.field4211[var9], (byte) 119, this.field4207[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
    public static void method1779(int arg0) {
        if (arg0 >= -86) {
            field4216 = null;
        }
        field4216 = null;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z")
    public final boolean method1780(int arg0) {
        field4215++;
        boolean var2 = true;
        class162 var3 = this.field4212.field2361;
        synchronized (this.field4212.field2361) {
            int var4 = 0;
            if (arg0 != 5) {
                this.method1778((byte) -92);
            }
            while (var4 < 5) {
                if (this.field4206[var4] != -1 && !this.field4212.field2361.method993(this.field4206[var4], arg0 + 1934, 0)) {
                    var2 = false;
                }
                var4++;
            }
            return var2;
        }
    }

    static {
        new class213("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        new class213("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field4216 = new class236("stellardawn", 1);
        field4217 = 0L;
    }
}
