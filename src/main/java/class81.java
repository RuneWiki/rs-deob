import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class81 extends class149 {

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    private int field1087;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "Lui;")
    public static class375 field1086 = new class375("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "Lpg;")
    public static class492 field1088 = new class492(15, 10);

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Lui;")
    public static class375 field1091 = new class375("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "Lad;")
    public static class501 field1090;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "Lad;")
    public static class501 field1092;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V", line = 5)
    public static void method523(byte arg0) {
        field1090 = null;
        field1092 = null;
        if (arg0 >= 50) {
            field1088 = null;
            field1091 = null;
            field1086 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(I)V", line = 20)
    public class81(int arg0) {
        super(0, true);
        this.field1087 = 4096;
        this.field1087 = arg0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBLtl;)V", line = 29)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (arg1 != 35) {
            method523((byte) -38);
        }
        if (arg0 == 0) {
            this.field1087 = (arg2.method618((byte) 100) << 12) / 255;
        }
        ++field1082;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 55)
    public class81() {
        this(4096);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(III)Z", line = 58)
    public static final boolean method524(int arg0, int arg1, int arg2) {
        if (arg1 > -85) {
            method524(-9, 68, 66);
        }
        ++field1081;
        return ~(256 & arg2) != -1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I", line = 71)
    public final int[] method92(int arg0, int arg1) {
        ++field1084;
        int[] var3 = super.field2152.method2891(arg1, (byte) 85);
        if (arg0 != -10835) {
            field1086 = null;
        }
        if (super.field2152.field7051) {
            class361.method2283(var3, 0, class316.field4838, this.field1087);
        }
        return var3;
    }
}
