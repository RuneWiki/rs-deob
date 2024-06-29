import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class458 extends class508 {

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "Z")
    public static boolean field6395 = false;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public static int field6402 = 1407;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field6411 = 0;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public int field6385;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public int field6386;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public int field6387;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public int field6389;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public int field6390;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public int field6394;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public int field6396;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "I")
    public int field6398;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public int field6399;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public int field6400;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    public int field6401;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public int field6403;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public int field6404;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public int field6406;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public int field6408;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public int field6410;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public int field6412;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "Ldn;")
    public static class201 field6405;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "Ldn;")
    public static class201 field6409;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Los;")
    public class383 field6391;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "Lbh;")
    public class414 field6407;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "Leb;")
    public class59 field6397;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Lfk;")
    public class91 field6392;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 7)
    public static void method2707(int arg0) {
        if (arg0 != 1407) {
            method2708(127, 102, -52);
        }
        field6409 = null;
        field6405 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)Lus;", line = 30)
    public static final class428 method2708(int arg0, int arg1, int arg2) {
        class510 var3 = class470.field6877[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class428 var4 = var3.field7496;
            var3.field7496 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 40)
    public final void method2709(int arg0) {
        this.field6392 = null;
        field6384++;
        this.field6397 = null;
        if (arg0 != 1407) {
            this.field6401 = -50;
        }
        this.field6407 = null;
        this.field6391 = null;
    }
}
