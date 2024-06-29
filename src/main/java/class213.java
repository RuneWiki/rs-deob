import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class213 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public int field3420;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lab;")
    public static class279 field3422 = new class279(64);

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 9)
    public static void method1437(boolean arg0) {
        if (!arg0) {
            field3422 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 23)
    public class213() {
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIII)V", line = 27)
    public static final void method1438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3423++;
        if (arg1 < 60) {
            field3422 = (class279) null;
        }
        int var6 = class8.method73(8, class186.field3028, class59.field1162, arg0);
        int var7 = class8.method73(8, class186.field3028, class59.field1162, arg4);
        int var8 = class8.method73(8, class259.field4024, class147.field2416, arg3);
        int var9 = class8.method73(8, class259.field4024, class147.field2416, arg2);
        for (int var10 = var6; var10 <= var7; var10++) {
            class241.method1598(arg5, -7, class155.field2522[var10], var9, var8);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lbd;)V", line = 55)
    public class213(class213 arg0) {
        this.field3420 = arg0.field3420;
        this.field3419 = arg0.field3419;
        this.field3425 = arg0.field3425;
        this.field3421 = arg0.field3421;
    }
}
