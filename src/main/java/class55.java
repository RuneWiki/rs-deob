import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class55 extends class237 {

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "J")
    public static long field700 = 0L;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field697 = "Walk here";

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field707 = 0;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "Ljava/lang/String;")
    public static String field704 = "M";

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "B")
    public byte field698;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Ljava/lang/String;")
    public String field699;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Ljava/lang/String;")
    public String field706;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "[[[I")
    public static int[][][] field702;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BJ)V")
    public static final void method308(byte arg0, long arg1) {
        field708++;
        if (arg1 == 0L) {
            return;
        }
        class4.field57.method1932(false, 217);
        class4.field57.method590(arg1, arg0 ^ 0xC2BF01F2);
        if (arg0 != -30) {
            field702 = null;
        }
        class57.field734++;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
    public static void method309(int arg0) {
        field704 = null;
        field697 = null;
        if (arg0 < 44) {
            method310(-116, 86, -74, 108, -8, 104);
        }
        field702 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)V")
    public static final void method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= arg2; var6++) {
            class78.method433(arg5, arg1, class14.field186[var6], arg3, (byte) 123);
        }
        field705++;
        if (arg0 != 0) {
            field697 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
    public static final void method311() {
        for (int var0 = 0; var0 < class152.field2362; var0++) {
            class19 var1 = class247.field4069[var0];
            class138.method959(var1);
            class247.field4069[var0] = null;
        }
        class152.field2362 = 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfg;B)V")
    public static final void method312(class43 arg0, byte arg1) {
        arg0.field544 = false;
        field695++;
        if (arg0.field541 != null) {
            arg0.field541.field3136 = 0;
        }
        for (class43 var2 = arg0.method242(); var2 != null; var2 = arg0.method239()) {
            method312(var2, (byte) -16);
        }
        if (arg1 != -16) {
            method309(-73);
        }
    }
}
