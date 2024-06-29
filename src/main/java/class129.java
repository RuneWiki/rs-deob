import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class129 extends class187 {

    @OriginalMember(owner = "client!on", name = "n", descriptor = "Ljava/lang/String;")
    public String field2019;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "Z")
    public static boolean field2024 = false;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "[I")
    public static int[] field2022;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(IIIII)V", line = 11)
    public static final void method877(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2020++;
        if (arg1 < 105) {
            method878(-8);
        }
        if (class256.field3995 <= (arg4 - arg0) && (arg0 + arg4) <= class118.field1834 && class323.field5030 <= (arg3 - arg0) && (arg0 + arg3) <= class88.field1324) {
            class143.method1003(arg3, (byte) -71, arg2, arg0, arg4);
        } else {
            class75.method532(true, arg4, arg3, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 34)
    public static void method878(int arg0) {
        field2022 = null;
        if (arg0 != 20254) {
            field2023 = 20;
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V", line = 42)
    public class129() {
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 47)
    public class129(String arg0, int arg1) {
        this.field2019 = arg0;
    }
}
