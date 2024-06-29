import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public abstract class class479 {

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field7092 = 0;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "S")
    public static short field7101 = 256;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field7089;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public int field7091;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public int field7096;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public int field7100;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Lfo;")
    public static class361 field7093;

    static {
        new class305("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IBIZ)I", line = 13)
    public static final int method2924(int arg0, byte arg1, int arg2, boolean arg3) {
        field7094++;
        class327 var4 = class457.method2813(arg0, arg3, -36);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            if (arg1 != -92) {
                return 83;
            }
            for (int var6 = 0; var6 < var4.field4346.length; var6++) {
                if (var4.field4350[var6] == arg2) {
                    var5 += var4.field4346[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 52)
    public static void method2925(int arg0) {
        field7093 = null;
        if (arg0 < 66) {
            field7093 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)Z", line = 64)
    public final boolean method2926(int arg0) {
        field7098++;
        if (arg0 != 25277) {
            this.field7096 = 119;
        }
        return (this.field7096 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)I", line = 80)
    public static final int method2927(int arg0, boolean arg1) {
        if (arg1) {
            field7089 = 68;
        }
        field7099++;
        return arg0 == 16711935 ? -1 : class227.method1456(arg0, 42);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)Z", line = 95)
    public final boolean method2928(byte arg0) {
        if (arg0 < 103) {
            return false;
        } else {
            field7097++;
            return (this.field7096 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)Z", line = 106)
    public final boolean method2929(int arg0) {
        if (arg0 != 0) {
            this.field7091 = -122;
        }
        field7095++;
        return (this.field7096 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "(I)Z", line = 120)
    public final boolean method2930(int arg0) {
        field7090++;
        if (arg0 >= -95) {
            return false;
        } else {
            return (this.field7096 & 0x1) != 0;
        }
    }
}
