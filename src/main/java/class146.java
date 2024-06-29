import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class146 {

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lwm;")
    private class399 field2449 = new class399(64);

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lph;")
    private class459 field2447;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Ltn;")
    public static class60 field2446 = new class60();

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field2451 = -50;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field2452 = 0;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "[C")
    public static char[] field2454;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lmo;")
    public static class531 field2453;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIILlv;)V")
    public static final void method1079(int arg0, int arg1, int arg2, class311 arg3) {
        class234 var4 = class455.method2715(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field3619 = arg3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Loa;")
    public final class494 method1080(int arg0, byte arg1) {
        field2448++;
        class399 var3 = this.field2449;
        class494 var4;
        synchronized (this.field2449) {
            var4 = (class494) this.field2449.method2478(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field2447;
        byte[] var6;
        synchronized (this.field2447) {
            var6 = this.field2447.method2757(31, arg0, (byte) -118);
        }
        class494 var7 = new class494();
        if (var6 != null) {
            var7.method2977(new class289(var6), -2);
        }
        int var8 = -87 / ((-arg1 - 30) / 62);
        class399 var9 = this.field2449;
        synchronized (this.field2449) {
            this.field2449.method2472(91, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
    public static final void method1081(int arg0, int arg1, int arg2) {
        class234 var3 = class518.field7511[arg0][arg1][arg2];
        if (var3 != null && var3.field3619 != null) {
            var3.field3619 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public final void method1082(byte arg0) {
        class399 var2 = this.field2449;
        synchronized (this.field2449) {
            this.field2449.method2475((byte) 67);
            if (arg0 != 85) {
                this.method1082((byte) 17);
            }
        }
        field2445++;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public static final void method1083(byte arg0) {
        field2450++;
        class179.field2913 = 0;
        int var1 = (class15.field266.field6073 >> 7) + class496.field7292;
        if (arg0 != 127) {
            method1081(-31, -107, -37);
        }
        int var2 = (class15.field266.field6078 >> 7) + class212.field3378;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class179.field2913 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class179.field2913 = 1;
        }
        if (class179.field2913 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class179.field2913 = 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public final void method1084(int arg0) {
        class399 var2 = this.field2449;
        synchronized (this.field2449) {
            this.field2449.method2477(-124);
        }
        if (arg0 != 15090) {
            this.field2447 = null;
        }
        field2444++;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static void method1085(int arg0) {
        field2454 = null;
        field2446 = null;
        field2453 = null;
        if (arg0 != -26734) {
            field2451 = 4;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lkp;ILph;)V")
    public class146(class341 arg0, int arg1, class459 arg2) {
        this.field2447 = arg2;
        this.field2447.method2763(31, -3);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
    public final void method1086(int arg0, boolean arg1) {
        field2443++;
        class399 var3 = this.field2449;
        synchronized (this.field2449) {
            this.field2449.method2471((byte) 98, arg0);
        }
        if (!arg1) {
            this.method1086(91, false);
        }
    }

    static {
        new class309("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field2454 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };
        field2453 = new class531(11, 4);
    }
}
