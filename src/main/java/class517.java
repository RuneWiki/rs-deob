import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class517 {

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Z")
    public boolean field7655 = false;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
    public static int[] field7644;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "Z")
    public static boolean field7654;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public int field7645;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public int field7651;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lfd;")
    public class316 field7646;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "Ljava/lang/String;")
    public static String field7659;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)Lir;")
    public static final class251 method3058(byte arg0, int arg1, int arg2) {
        field7656++;
        class251 var3 = new class251();
        if (arg0 != -93) {
            method3065(-78, -41, 101, 53, -124, 105);
        }
        var3.field4274 = -1;
        var3.field4271 = -1;
        var3.field4290 = arg2 + 5 + 1;
        var3.field4266 = arg1 + 1 + 5;
        var3.field4288 = new int[var3.field4266][var3.field4290];
        var3.method1706(78);
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method3059(byte arg0) {
        int var1 = 10 % ((arg0 + 73) / 40);
        field7644 = null;
        field7659 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lia;ZI)V")
    private final void method3060(class23 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field7645 = arg0.method132(101);
        } else if (arg2 == 2) {
            this.field7651 = arg0.method181(115);
        } else if (arg2 == 3) {
            this.field7655 = true;
        } else if (arg2 == 4) {
            this.field7645 = -1;
        }
        if (arg1) {
            this.field7655 = false;
        }
        field7653++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Z")
    public static final boolean method3061(int arg0, int arg1) {
        class199.field3165 = true;
        if (arg1 != 64) {
            method3059((byte) -118);
        }
        field7642++;
        class524.field7713 = arg0 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lia;I)V")
    public final void method3062(class23 arg0, int arg1) {
        if (arg1 != -2963) {
            field7644 = null;
        }
        field7652++;
        while (true) {
            int var3 = arg0.method126((byte) -85);
            if (var3 == 0) {
                return;
            }
            this.method3060(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Z")
    public final boolean method3063(int arg0) {
        if (arg0 != 1) {
            this.field7655 = false;
        }
        field7648++;
        return this.field7646.field4971.method2929(this.field7645, -87);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)I")
    public static final int method3064(int arg0, int arg1, int arg2) {
        field7657++;
        int var3 = arg1 >>> 24;
        if (arg0 < 46) {
            method3065(40, -63, -87, 77, -61, 8);
        }
        int var4 = 255 - var3;
        int var5 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        return (((arg2 & 0xFF00) * var4 & 0xFF0000 | (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIII)V")
    public static final void method3065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class199.field3164 = arg1;
        class489.field7156 = arg3;
        class407.field6188 = arg5;
        if (arg2 > -122) {
            return;
        }
        class60.field922 = arg4;
        class204.field3227 = arg0;
        field7658++;
        if (class204.field3227 >= 100) {
            int var6 = class60.field922 * 128 + 64;
            int var7 = class407.field6188 * 128 + 64;
            int var8 = class81.method592(var6, var7, 9251, class93.field1556) - class489.field7156;
            int var9 = var6 - class473.field7021;
            int var10 = var8 - class130.field2234;
            int var11 = var7 - class48.field764;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class227.field3927 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class381.field5891 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class227.field3927 < 1024) {
                class227.field3927 = 1024;
            }
            class64.field950 = 0;
            if (class227.field3927 > 3072) {
                class227.field3927 = 3072;
            }
        }
        class190.field2963 = 2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLza;ZI)Lo;")
    public final class138 method3066(byte arg0, class491 arg1, boolean arg2, int arg3) {
        field7643++;
        long var5 = (long) (arg1.field7164 << 19 | (arg2 ? 262144 : 0) | this.field7645 | arg3 << 16);
        class138 var7 = (class138) this.field7646.field4977.method1593((byte) -123, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field7646.field4971.method2929(this.field7645, -67)) {
            class523 var8 = class523.method3093(this.field7646.field4971, this.field7645, 0);
            if (var8 != null) {
                var8.field7706 = var8.field7710 = var8.field7704 = var8.field7711 = 0;
                if (arg2) {
                    var8.method3092();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method3086();
                }
            }
            if (arg0 >= -32) {
                method3064(103, 94, -10);
            }
            class138 var10 = arg1.method837(var8, true);
            if (var10 != null) {
                this.field7646.field4977.method1595(var10, var5, (byte) -93);
            }
            return var10;
        } else {
            return null;
        }
    }

    static {
        new class306("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field7647 = 0;
        field7644 = new int[4096];
        field7654 = false;
    }
}
