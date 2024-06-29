import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class581 {

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
    private int field7354;

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "I")
    public int field7353;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public int field7346;

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "B")
    public byte field7351;

    @OriginalMember(owner = "client!sba", name = "t", descriptor = "I")
    public int field7361;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "Ljaa;")
    public static class779 field7355 = new class779();

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public int field7342;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public int field7343;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public int field7344;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public int field7345;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
    public int field7349;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
    public int field7350;

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
    public int field7356;

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "I")
    public int field7357;

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
    public int field7358;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "Lsba;")
    public class581 field7348;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public static void method3110(int arg0) {
        field7355 = null;
        if (arg0 != 32765) {
            field7355 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V")
    public static final void method3111(int arg0) {
        class755.method4097(8218);
        field7352++;
        class525.field6678 = false;
        if (arg0 >= -43) {
            field7355 = null;
        }
        class205.method1388(85, class283.field3665, class167.field2225, class721.field9471, class71.field968);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)Lvb;")
    public final class657 method3112(byte arg0) {
        field7359++;
        int var2 = -120 % ((arg0 + 68) / 39);
        return class596.method3213(this.field7354, (byte) -114);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(ILuaa;)Ljava/lang/String;")
    public static final String method3113(int arg0, class391 arg1) {
        if (arg0 != 1482) {
            method3110(-115);
        }
        field7347++;
        if (client.method2637(arg1).method2130((byte) -106) == 0) {
            return null;
        } else if (arg1.field5116 == null || arg1.field5116.trim().length() == 0) {
            return class538.field6782 ? "Hidden-use" : null;
        } else {
            return arg1.field5116;
        }
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(IIIIB)V")
    public class581(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field7354 = arg0;
        this.field7353 = arg3;
        this.field7346 = arg1;
        this.field7351 = arg4;
        this.field7361 = arg2;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIII)Lsba;")
    public final class581 method3114(int arg0, int arg1, int arg2, int arg3) {
        field7360++;
        if (arg1 > -39) {
            this.field7361 = 80;
        }
        return new class581(this.field7354, arg0, arg2, arg3, this.field7351);
    }
}
