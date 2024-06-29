import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class334 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Z")
    private boolean field4525;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Z")
    private boolean field4528;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    private int field4522;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    private int field4523;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Llc;")
    public static class435 field4530 = new class435(90, 8);

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lgr;")
    public static class530 field4531 = new class530(78, 7);

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Z")
    public final boolean method2046(int arg0) {
        if (arg0 > -118) {
            this.method2049((byte) 95);
        }
        field4526++;
        return this.field4525;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)Z")
    public final boolean method2047(int arg0) {
        field4527++;
        if (arg0 != 11861) {
            this.method2048(75);
        }
        return this.field4528;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)I")
    public final int method2048(int arg0) {
        if (arg0 != 7) {
            field4532 = 97;
        }
        field4521++;
        return this.field4522;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)I")
    public final int method2049(byte arg0) {
        if (arg0 >= -64) {
            this.method2048(97);
        }
        field4529++;
        return this.field4523;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(ZIIZ)V")
    public class334(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field4525 = arg3;
        this.field4528 = arg0;
        this.field4522 = arg1;
        this.field4523 = arg2;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
    public static void method2050(int arg0) {
        if (arg0 == -3584) {
            field4530 = null;
            field4531 = null;
        }
    }
}
