import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class327 {

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "B")
    private byte field4079;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field4080;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public int field4078;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field4077;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public int field4072;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[C")
    public static char[] field4075 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lfw;")
    public static class53 field4084;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field4074;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
    public final int method1878(int arg0) {
        int var2 = -111 % ((arg0 + 66) / 36);
        field4073++;
        return this.field4079 & 0x7;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIZILpfa;)V")
    public static final void method1879(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class275 arg6) {
        class334.field4134 = arg6;
        class76.field1000 = 1;
        field4076++;
        class618.field8381 = arg1;
        class687.field9410 = arg2;
        class60.field757 = arg0;
        class15.field150 = arg4;
        class662.field8973 = arg5;
        if (arg3 != -5322) {
            field4074 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)I")
    public final int method1880(int arg0) {
        if (arg0 != 223) {
            method1882((byte) -59);
        }
        field4081++;
        return (this.field4079 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static final void method1881(byte arg0) {
        field4082++;
        class132 var1 = (class132) class500.field6235.method1909(true);
        if (arg0 <= 89) {
            return;
        }
        boolean var2 = class338.field4324 != null || class336.field4145 > 0;
        if (var2) {
            class618.field8385 = 1;
        }
        if (class272.field3438 && class307.field3884.method1592((byte) -120, 81) && class638.field8648 > 2) {
            if (var2) {
                class666.field9041 = (class501) class345.field4438.field4121.field3319.field3319;
            } else {
                class391.method2228((class501) class345.field4438.field4121.field3319.field3319, false, var1.method851(-1160828951), var1.method860(true));
            }
        } else if (var2) {
            class666.field9041 = (class501) class345.field4438.field4121.field3319;
        } else {
            class391.method2228((class501) class345.field4438.field4121.field3319, false, var1.method851(-1160828951), var1.method860(true));
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public static void method1882(byte arg0) {
        if (arg0 != 80) {
            method1879(-67, -1, 113, -24, true, -66, null);
        }
        field4075 = null;
        field4084 = null;
        field4074 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class327() {
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lji;)V")
    public class327(class572 arg0) {
        this.field4079 = arg0.method3083(255);
        this.field4080 = arg0.method3031(-1);
        this.field4078 = arg0.method3064(-2031091464);
        this.field4083 = arg0.method3064(-2031091464);
        this.field4077 = arg0.method3064(-2031091464);
        this.field4072 = arg0.method3064(-2031091464);
    }
}
