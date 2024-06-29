import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class30 {

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[I")
    public int[] field366;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[I")
    public int[] field370;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field364 = 0;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field368 = -1;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field367 = -1;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class215.field3081 = arg2;
        field362++;
        class96.field1234 = arg4;
        if (arg3 > -77) {
            method166(-93, -12, -17, -120, 80, true, 36);
        }
        class120.field1620 = arg1;
        class137.field2114 = arg0;
        class158.field2308 = arg6;
        if (arg5 && class158.field2308 >= 100) {
            class386.field5469 = class120.field1620 * 128 + 64;
            class417.field5999 = class96.field1234 * 128 + 64;
            class249.field3707 = class452.method2820(class158.field2302, class417.field5999, false, class386.field5469) - class215.field3081;
        }
        class336.field4878 = 2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static final void method167(int arg0) {
        field365++;
        for (int var1 = 0; var1 < class88.field1158; var1++) {
            class419 var2 = class293.method1981((byte) -14, var1);
            if (var2 != null && var2.field6006 == 0) {
                class169.field2397[var1] = 0;
                class150.field2254[var1] = 0;
            }
        }
        class419.field6014 = new class191(128);
        if (arg0 != 16726) {
            method166(32, 104, -72, 118, -97, false, 10);
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V")
    public class30(int arg0) {
        this.field369 = arg0;
        this.field366 = new int[this.field369];
        this.field370 = new int[this.field369];
    }
}
