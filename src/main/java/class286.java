import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class286 extends class51 {

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    private int field4081;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    private int field4085;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    private int field4088;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    private int field4078;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "S")
    public static short field4087;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Lum;")
    public static class347 field4086;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Z")
    public static boolean field4089;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lrs;")
    public static class445 field4083;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)V")
    public static final void method1731(int arg0, boolean arg1) {
        if (arg1) {
            ++field4082;
            class338 var2 = class380.method2294((byte) 104, arg0, 9);
            var2.method2048(26);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V")
    public final void method115(int arg0, int arg1, int arg2) {
        ++field4084;
        int var4 = this.field4081 * arg0 >> 12;
        int var5 = this.field4085 * arg0 >> 12;
        int var6 = this.field4088 * arg2 >> 12;
        int var7 = this.field4078 * arg2 >> 12;
        if (arg1 == 17091) {
            class417.method2483(var6, super.field757, var7, var4, var5, 1);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static final void method1732(byte arg0) {
        if (arg0 != 86) {
            method1731(-8, true);
        }
        class65.field972 = true;
        ++field4091;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
    public final void method117(int arg0, int arg1, int arg2) {
        ++field4080;
        if (arg1 > -104) {
            this.method115(-93, 79, -7);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lcu;I)V")
    public static final void method1733(class139 arg0, int arg1) {
        if (arg1 > 37) {
            ++field4077;
            for (class173 var2 = (class173) class443.field6469.method2096(-21400); var2 != null; var2 = (class173) class443.field6469.method2084((byte) 19)) {
                if (var2.field2371 == arg0) {
                    if (var2.field2366 != null) {
                        class375.field5607.method643(var2.field2366);
                        var2.field2366 = null;
                    }
                    var2.method536(false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
    public static void method1734(byte arg0) {
        if (arg0 <= 58) {
            field4083 = null;
        }
        field4086 = null;
        field4083 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIII)V")
    public class286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4081 = arg0;
        this.field4085 = arg2;
        this.field4088 = arg1;
        this.field4078 = arg3;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(III)V")
    public final void method116(int arg0, int arg1, int arg2) {
        if (arg0 < 41) {
            field4083 = null;
        }
        ++field4079;
        int var4 = this.field4081 * arg2 >> 12;
        int var5 = this.field4085 * arg2 >> 12;
        int var6 = this.field4088 * arg1 >> 12;
        int var7 = this.field4078 * arg1 >> 12;
        class219.method1348(var4, super.field758, var7, 12467, super.field757, super.field759, var6, var5);
    }

    static {
        new class194("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field4087 = 32767;
        field4086 = new class347();
        field4089 = false;
        field4090 = 0;
    }
}
