import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class268 extends class345 {

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "[I")
    public static int[] field3985 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "Lni;")
    public static class521 field3989;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public int field3986;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public int field3988;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public int field3990;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "Lqj;")
    public class419 field3982;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "[Ll;")
    public static class127[] field3993;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "[Lqb;")
    public class518[] field3992;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1670(int arg0, byte arg1, int arg2) {
        field3984++;
        int var3 = -111 % ((-arg1 - 44) / 44);
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBII)I")
    public static final int method1671(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field3983++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else if (arg1 < 101) {
            return -72;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static void method1672(int arg0) {
        if (arg0 != 0) {
            field3994 = -54;
        }
        field3993 = null;
        field3985 = null;
        field3989 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZB[B)V")
    public static final void method1673(boolean arg0, byte arg1, byte[] arg2) {
        if (class62.field833 == null) {
            class62.field833 = new class468(20000);
        }
        field3991++;
        if (arg1 > -48) {
            return;
        }
        class62.field833.method2736(-1, 0, arg2.length, arg2);
        if (!arg0) {
            return;
        }
        class465.method2698(-90, class62.field833.field6868);
        class96.field1495 = new class152[class367.field5584];
        int var3 = 0;
        for (int var4 = class378.field5696; var4 <= class2.field14; var4++) {
            class152 var5 = class50.method371(var4, 2);
            if (var5 != null) {
                class96.field1495[var3++] = var5;
            }
        }
        class408.field6157 = false;
        class519.field7610 = class381.method2281((byte) -107);
        class62.field833 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BILya;I)Z")
    public final boolean method1674(byte arg0, int arg1, class11 arg2, int arg3) {
        field3987++;
        if (this.field3992 != null) {
            for (int var5 = 0; var5 < this.field3992.length; var5++) {
                if (this.field3992[var5].method3068(arg3, arg1) && this.field3982.method233(arg3, arg2, 2, arg1)) {
                    return true;
                }
            }
        }
        int var6 = -54 / ((arg0 - 34) / 60);
        return false;
    }

    static {
        new class347("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field3989 = new class521();
        new class347("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field3994 = 0;
    }
}
