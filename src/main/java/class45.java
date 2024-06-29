import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class45 {

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "Ltl;")
    private class400 field647 = new class400(64);

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "Ltl;")
    public class400 field652 = new class400(50);

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "Ltl;")
    public class400 field653 = new class400(5);

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "Lui;")
    public class451 field644;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "Lui;")
    private class451 field638;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "Z")
    public boolean field651;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Lo;")
    public static class332 field633 = new class332(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "Lo;")
    public static class332 field641 = new class332("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field646 = 64;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "Lo;")
    public static class332 field648 = new class332("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    public int field655;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "Ldp;")
    public static class319 field636;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "[Ldp;")
    public static class319[] field654;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V", line = 9)
    public final void method325(int arg0, int arg1) {
        if (arg1 != 230) {
            return;
        }
        field643++;
        class400 var3 = this.field647;
        synchronized (this.field647) {
            this.field647.method2389(false, arg0);
        }
        class400 var4 = this.field652;
        synchronized (this.field652) {
            this.field652.method2389(false, arg0);
        }
        class400 var5 = this.field653;
        synchronized (this.field653) {
            this.field653.method2389(false, arg0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 28)
    public static final boolean method326(String arg0, int arg1) {
        field649++;
        if (arg0 == null) {
            return false;
        } else if (arg1 == 115) {
            for (int var2 = 0; var2 < class157.field2190; var2++) {
                if (arg0.equalsIgnoreCase(class42.field570[var2])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(class472.field6622.field3839);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IC)C", line = 57)
    public static final char method327(int arg0, char arg1) {
        field635++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else if (arg0 >= -96) {
            return '\u000e';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 87)
    public final void method328(int arg0) {
        class400 var2 = this.field647;
        synchronized (this.field647) {
            this.field647.method2401((byte) -42);
        }
        field640++;
        class400 var3 = this.field652;
        synchronized (this.field652) {
            this.field652.method2401((byte) -122);
        }
        class400 var4 = this.field653;
        synchronized (this.field653) {
            this.field653.method2401((byte) -105);
        }
        if (arg0 != 50) {
            method326((String) null, -60);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "()V", line = 108)
    public static final void method329() {
        class100.method767(1, class344.field5192);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)V", line = 118)
    public final void method330(int arg0, int arg1) {
        field642++;
        this.field655 = arg0;
        class400 var3 = this.field652;
        synchronized (this.field652) {
            this.field652.method2401((byte) -45);
        }
        class400 var4 = this.field653;
        synchronized (this.field653) {
            if (arg1 < 39) {
                this.method335((byte) -75, false);
            }
            this.field653.method2401((byte) -69);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V", line = 138)
    public final void method331(int arg0) {
        field637++;
        class400 var2 = this.field652;
        synchronized (this.field652) {
            this.field652.method2401((byte) -88);
        }
        if (arg0 > -50) {
            field654 = null;
        }
        class400 var3 = this.field653;
        synchronized (this.field653) {
            this.field653.method2401((byte) -92);
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V", line = 154)
    public static void method332(int arg0) {
        if (arg0 > -89) {
            method332(1);
        }
        field633 = null;
        field636 = null;
        field654 = null;
        field648 = null;
        field641 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 173)
    public final void method333(byte arg0) {
        class400 var2 = this.field647;
        synchronized (this.field647) {
            this.field647.method2388(-105);
        }
        field639++;
        if (arg0 <= 105) {
            return;
        }
        class400 var3 = this.field652;
        synchronized (this.field652) {
            this.field652.method2388(-89);
        }
        class400 var4 = this.field653;
        synchronized (this.field653) {
            this.field653.method2388(-59);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)Ldr;", line = 194)
    public final class273 method334(int arg0, byte arg1) {
        field650++;
        class400 var3 = this.field647;
        class273 var4;
        synchronized (this.field647) {
            var4 = (class273) this.field647.method2393(-120, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field638.method2691(class473.method2756(arg0, (byte) -114), class408.method2441(arg0, -2006407897), arg1 ^ 0x68);
        class273 var6 = new class273();
        var6.field4102 = this;
        var6.field4152 = arg0;
        if (var5 != null) {
            var6.method1783((byte) 48, new class446(var5));
        }
        var6.method1786(0);
        if (arg1 != 104) {
            this.method335((byte) -52, true);
        }
        class400 var7 = this.field647;
        synchronized (this.field647) {
            this.field647.method2395(0, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BZ)V", line = 225)
    public final void method335(byte arg0, boolean arg1) {
        field645++;
        if (this.field651 == arg1) {
            return;
        }
        if (arg0 != 31) {
            this.method330(62, 60);
        }
        this.field651 = arg1;
        this.method328(50);
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lgp;IZLui;Lui;)V", line = 259)
    public class45(class430 arg0, int arg1, boolean arg2, class451 arg3, class451 arg4) {
        this.field644 = arg4;
        this.field638 = arg3;
        this.field651 = arg2;
        if (this.field638 != null) {
            int var6 = this.field638.method2675(false) - 1;
            this.field638.method2662(var6, (byte) -7);
        }
    }
}
