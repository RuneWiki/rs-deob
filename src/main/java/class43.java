import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class43 {

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "[Lbp;")
    public static class323[] field814 = new class323[32];

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Ldv;")
    public static class566 field816 = new class566(36, 7);

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "Z")
    public static boolean field817 = false;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "Lah;")
    public class322 field813;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
    public static void method417(int arg0) {
        field814 = null;
        if (arg0 == 36) {
            field816 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)I")
    public static final int method418(int arg0) {
        field815++;
        int var1 = 60 % ((-arg0 - 17) / 63);
        return 42;
    }
}
