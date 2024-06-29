import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class235 extends RuntimeException {

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4226;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Ljava/lang/String;")
    public String field4231;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4223 = 0;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
    public static int[] field4225 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field4230 = -1;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Lcc;")
    public static class209 field4233 = class95.method669(126, "Examiner");

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "Lla;")
    public static class95 field4224 = new class95(30);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static void method1629(int arg0) {
        field4225 = null;
        field4233 = null;
        field4224 = null;
        if (arg0 != 0) {
            method1630(63);
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final void method1630(int arg0) {
        if (arg0 != -1416) {
            field4225 = null;
        }
        class68.field1300.method664(-72);
        class27.field488.method664(arg0 ^ 0xFFFFFA0A);
        field4232++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
    public static final void method1631(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4228++;
        int var5 = 53 / ((70 - arg1) / 45);
        if (arg3 >= class102.field1957 && arg3 <= class155.field2847) {
            int var6 = class257.method1787(class262.field4723, arg2, 28, class230.field4184);
            int var7 = class257.method1787(class262.field4723, arg4, 28, class230.field4184);
            class94.method659(arg3, arg0, 10434, var6, var7);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILsj;)V")
    public static final void method1632(int arg0, class49 arg1) {
        if (arg0 != 38) {
            method1633(-8, -95, -29, -54, 103, -92, -79, 55);
        }
        field4227++;
        class223.field4072 = arg1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4221++;
        if (class161.method1111((byte) 46, arg7)) {
            if (arg3 != 46) {
                method1629(-37);
            }
            client.method1081(class50.field984[arg7], -1, arg4, arg0, arg2, arg1, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class235(Throwable arg0, String arg1) {
        this.field4226 = arg0;
        this.field4231 = arg1;
    }
}
