import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class405 extends class623 {

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "Z")
    public static boolean field6243 = false;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "[[Z")
    public static boolean[][] field6253 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Lhga;")
    public static class158 field6241 = new class158(40, 2);

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public int field6242;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public int field6244;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public int field6247;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public int field6254;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "J")
    public long field6249;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(B)Llp;")
    public static final class359 method2593(byte arg0) {
        field6252++;
        try {
            return arg0 >= -72 ? null : (class359) Class.forName("li").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)I")
    public final int method2594(byte arg0) {
        if (arg0 > -15) {
            field6241 = null;
        }
        field6240++;
        return this.field6244;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lk;ILjava/awt/Frame;)V")
    public static final void method2595(class525 arg0, int arg1, Frame arg2) {
        while (true) {
            class701 var3 = arg0.method3178(arg2, (byte) 115);
            while (var3.field9884 == 0) {
                class549.method3313(10L, arg1 + 122);
            }
            if (var3.field9884 == 1) {
                field6248++;
                if (arg1 != 2) {
                    return;
                }
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class549.method3313(100L, arg1 + 122);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
    public final int method2596(boolean arg0) {
        if (!arg0) {
            this.method2594((byte) -128);
        }
        field6251++;
        return this.field6242;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
    public static void method2597(int arg0) {
        if (arg0 > -79) {
            field6253 = null;
        }
        field6241 = null;
        field6253 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)J")
    public final long method2598(int arg0) {
        if (arg0 != 16209) {
            this.field6247 = 103;
        }
        field6246++;
        return this.field6249;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)I")
    public final int method2599(boolean arg0) {
        if (arg0) {
            field6239++;
            return this.field6254;
        } else {
            return 51;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
    public final int method2600(int arg0) {
        if (arg0 != 25) {
            this.field6242 = 33;
        }
        field6250++;
        return this.field6247;
    }
}
