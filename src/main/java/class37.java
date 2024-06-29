import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class37 {

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[[I")
    public static int[][] field375 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field379 = 0;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lqe;")
    public static class469 field380 = new class469(34, 12);

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field381 = 0;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "F")
    public static float field376;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!bh", name = "toString", descriptor = "()Ljava/lang/String;", line = 8)
    public final String toString() {
        field377++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 22)
    public static void method186(byte arg0) {
        field375 = null;
        field380 = null;
        int var1 = 67 / ((4 - arg0) / 61);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIZ)V", line = 32)
    public static final void method187(int arg0, int arg1, int arg2, boolean arg3) {
        field373++;
        class511 var4 = class183.field2805[arg1][arg0];
        if (!arg3) {
            field381 = -88;
        }
        class565.method3294(var4 == null ? class31.field324 : var4, arg2, (byte) -103);
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 49)
    public class37(String arg0, String arg1, String arg2, int arg3) {
        this.field374 = arg3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBIIIILjava/lang/String;I)V", line = 67)
    public static final void method188(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field378++;
        class291 var8 = new class291();
        var8.field4159 = arg5;
        var8.field4161 = class357.field5189 + arg4;
        var8.field4163 = arg0;
        var8.field4162 = arg6;
        var8.field4157 = arg2;
        var8.field4158 = arg7;
        var8.field4169 = arg3;
        client.field4276.method1616(arg1 ^ 0x57FF, var8);
        if (arg1 != 90) {
            method186((byte) 114);
        }
    }
}
