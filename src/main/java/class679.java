import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class679 extends class224 {

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "Lgda;")
    public class53 field9570;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    public static int field9574 = 0;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "Lqca;")
    public static class115 field9573 = new class115(15, 0, 1, 0);

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public static int field9568;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public static int field9569;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    public static int field9572;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "Ld;")
    public static class149 field9571;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "Lrk;")
    public static class32 field9567;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "[[[B")
    public static byte[][][] field9566;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLee;)Z")
    public static final boolean method3837(byte arg0, class673 arg1) {
        if (arg0 == 32) {
            field9568++;
            return class322.field4582 == arg1 || class23.field296 == arg1 || class315.field4464 == arg1 || class303.field4243 == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
    public static void method3838(byte arg0) {
        field9573 = null;
        if (arg0 < 114) {
            method3839('&', -119, (byte) -51);
        }
        field9571 = null;
        field9566 = null;
        field9567 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(CIB)I")
    public static final int method3839(char arg0, int arg1, byte arg2) {
        field9572++;
        int var3 = arg0 << 4;
        if (arg2 <= 27) {
            return 23;
        }
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var4 = Character.toLowerCase(arg0);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lgda;)V")
    public class679(class53 arg0) {
        this.field9570 = arg0;
    }
}
