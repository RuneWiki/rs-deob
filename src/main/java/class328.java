import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class328 implements class681 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Ljava/lang/String;")
    private String field4444;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lla;")
    private class423 field4446;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field4449 = 0;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Llc;")
    public static class435 field4451 = new class435(44, 2);

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field4452 = 0;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)Lra;")
    public static final class757 method2017(int arg0, boolean arg1) {
        field4450++;
        return new class757(arg0, arg1);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method2018(boolean arg0) {
        field4451 = null;
        if (arg0) {
            field4449 = 13;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)Lwea;")
    public final class115 method2019(int arg0) {
        field4447++;
        return arg0 == 10251 ? class115.field1600 : null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
    public final int method2020(int arg0) {
        field4445++;
        if (arg0 != 28170) {
            field4452 = -88;
        }
        return this.field4446.method2588(this.field4444, (byte) -99) ? 100 : 0;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static final void method2021(int arg0) {
        field4448++;
        for (int var1 = 0; var1 < 100; var1++) {
            class108.field1545[var1] = true;
        }
        if (arg0 != -8586) {
            field4451 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lla;Ljava/lang/String;)V")
    public class328(class423 arg0, String arg1) {
        this.field4444 = arg1;
        this.field4446 = arg0;
    }
}
