import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class324 {

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public int field4557;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    private int field4556;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4553 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!bg", name = "toString", descriptor = "()Ljava/lang/String;", line = 8)
    public final String toString() {
        field4552++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)I", line = 17)
    public static final int method2000(boolean arg0, int arg1) {
        field4558++;
        if (class383.field5635 != null) {
            class383.field5635.method646(false);
            class383.field5635 = null;
        }
        class417.field6159++;
        if (class417.field6159 > 4) {
            class417.field6159 = 0;
            class323.field4550 = 0;
            return arg1;
        }
        if (class354.field4947 == class310.field4421) {
            class310.field4421 = class205.field2981;
        } else {
            class310.field4421 = class354.field4947;
        }
        class323.field4550 = 0;
        return arg0 ? -39 : -1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I", line = 51)
    public final int method2001(int arg0) {
        field4555++;
        return arg0 >= -95 ? 75 : this.field4556;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lwt;IIBI)V", line = 62)
    public static final void method2002(class203 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4551++;
        if (arg3 <= 87) {
            return;
        }
        long var5 = (long) (arg1 | arg4 << 28 | arg2 << 14);
        class518 var7 = (class518) class89.field1216.method875(var5, 123);
        if (var7 == null) {
            class518 var8 = new class518();
            class89.field1216.method878(var5, -2301, var8);
            var8.field7628.method1015(false, arg0);
            return;
        }
        class72 var9 = class270.field3995.method6(22883, arg0.field2939);
        int var10 = var9.field966;
        if (var9.field965 == 1) {
            var10 = (arg0.field2940 + 1) * var10;
        }
        for (class203 var11 = (class203) var7.field7628.method1018(74); var11 != null; var11 = (class203) var7.field7628.method1022((byte) -112)) {
            class72 var12 = class270.field3995.method6(22883, var11.field2939);
            int var13 = var12.field966;
            if (var12.field965 == 1) {
                var13 = (var11.field2940 + 1) * var13;
            }
            if (var10 > var13) {
                class463.method2779(var11, arg0, 47);
                return;
            }
        }
        var7.field7628.method1015(false, arg0);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 119)
    public static final void method2003(int arg0) {
        class123.field1803 = new class188[class230.field3365.method2359((byte) 39)][];
        field4554++;
        class335.field4671 = new class188[class230.field3365.method2359((byte) 39)][];
        class251.field3693 = new boolean[class230.field3365.method2359((byte) 39)];
        if (arg0 != -19181) {
            field4553 = -1;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(II)V", line = 132)
    public class324(int arg0, int arg1) {
        this.field4557 = arg1;
        this.field4556 = arg0;
    }
}
