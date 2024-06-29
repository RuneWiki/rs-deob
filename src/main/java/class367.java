import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class367 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Z")
    public boolean field5142 = false;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Lff;")
    private class9 field5157 = new class9(64);

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Lff;")
    public class9 field5158 = new class9(500);

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "Lff;")
    public class9 field5159 = new class9(30);

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "Lff;")
    public class9 field5161 = new class9(50);

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Lvh;")
    public class240 field5146;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "Z")
    public boolean field5155;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "Lvh;")
    private class240 field5154;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "[Llh;")
    public static class365[] field5152;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Llm;")
    public static class344 field5150;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Ljm;")
    public static class485 field5156;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public int field5162;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V")
    public final void method2120(boolean arg0, int arg1) {
        field5153++;
        if (arg1 > 72 && arg0 != this.field5155) {
            this.field5155 = arg0;
            this.method2122((byte) 15);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)Lpk;")
    public final class132 method2121(int arg0, boolean arg1) {
        field5149++;
        class9 var3 = this.field5157;
        class132 var4;
        synchronized (this.field5157) {
            var4 = (class132) this.field5157.method56((long) arg0, 63);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg1) {
            this.field5154 = null;
        }
        byte[] var5 = this.field5154.method1411(arg1, class515.method3027(false, arg0), class485.method2859((byte) 17, arg0));
        class132 var6 = new class132();
        var6.field1866 = arg0;
        var6.field1852 = this;
        if (var5 != null) {
            var6.method872(false, new class365(var5));
        }
        var6.method857((byte) -124);
        if (var6.field1878) {
            var6.field1892 = 0;
            var6.field1876 = false;
        }
        if (!this.field5155 && var6.field1873) {
            var6.field1902 = null;
            var6.field1888 = null;
        }
        class9 var7 = this.field5157;
        synchronized (this.field5157) {
            this.field5157.method73((long) arg0, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public final void method2122(byte arg0) {
        field5147++;
        if (arg0 != 15) {
            return;
        }
        class9 var2 = this.field5157;
        synchronized (this.field5157) {
            this.field5157.method67(117);
        }
        class9 var3 = this.field5158;
        synchronized (this.field5158) {
            this.field5158.method67(arg0 + 82);
        }
        class9 var4 = this.field5159;
        synchronized (this.field5159) {
            this.field5159.method67(arg0 ^ 0xFFFFFF8D);
        }
        class9 var5 = this.field5161;
        synchronized (this.field5161) {
            this.field5161.method67(arg0 ^ 0x23);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static void method2123(int arg0) {
        field5152 = null;
        field5150 = null;
        if (arg0 != 0) {
            method2123(90);
        }
        field5156 = null;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public final void method2124(int arg0) {
        class9 var2 = this.field5157;
        synchronized (this.field5157) {
            this.field5157.method65(false);
        }
        field5151++;
        class9 var3 = this.field5158;
        synchronized (this.field5158) {
            this.field5158.method65(false);
            if (arg0 != 30) {
                this.field5158 = null;
            }
        }
        class9 var4 = this.field5159;
        synchronized (this.field5159) {
            this.field5159.method65(false);
        }
        class9 var5 = this.field5161;
        synchronized (this.field5161) {
            this.field5161.method65(false);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IZ)V")
    public final void method2125(int arg0, boolean arg1) {
        field5143++;
        if (arg1 == this.field5142) {
            return;
        }
        this.field5142 = arg1;
        if (arg0 != 64) {
            this.field5155 = true;
        }
        this.method2122((byte) 15);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V")
    public final void method2126(int arg0, int arg1) {
        field5145++;
        this.field5157 = new class9(arg1);
        if (arg0 != 30) {
            this.method2125(57, false);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)V")
    public final void method2127(int arg0, int arg1) {
        field5148++;
        this.field5162 = arg0;
        class9 var3 = this.field5158;
        synchronized (this.field5158) {
            this.field5158.method67(90);
        }
        class9 var4 = this.field5159;
        synchronized (this.field5159) {
            if (arg1 != -31667) {
                this.method2121(53, true);
            }
            this.field5159.method67(62);
        }
        class9 var5 = this.field5161;
        synchronized (this.field5161) {
            this.field5161.method67(-93);
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)V")
    public final void method2128(int arg0, int arg1) {
        field5144++;
        class9 var3 = this.field5157;
        synchronized (this.field5157) {
            this.field5157.method61((byte) -67, arg0);
        }
        class9 var4 = this.field5158;
        synchronized (this.field5158) {
            this.field5158.method61((byte) -67, arg0);
        }
        class9 var5 = this.field5159;
        synchronized (this.field5159) {
            this.field5159.method61((byte) -67, arg0);
        }
        class9 var6 = this.field5161;
        synchronized (this.field5161) {
            this.field5161.method61((byte) -67, arg0);
            if (arg1 <= 112) {
                field5150 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Llf;IZLvh;Lvh;)V")
    public class367(class157 arg0, int arg1, boolean arg2, class240 arg3, class240 arg4) {
        this.field5146 = arg4;
        this.field5155 = arg2;
        this.field5154 = arg3;
        if (this.field5154 != null) {
            int var6 = this.field5154.method1410(0) - 1;
            this.field5154.method1397((byte) -109, var6);
        }
    }

    static {
        new class83("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field5152 = new class365[2048];
        field5150 = null;
        field5156 = new class485(30, 4);
        field5160 = -1;
    }
}
