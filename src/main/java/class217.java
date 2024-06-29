import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class217 {

    @OriginalMember(owner = "client!uga", name = "c", descriptor = "Lcb;")
    private class544 field3109;

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "Lcb;")
    private class544 field3112;

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "Ltga;")
    public static class64 field3108 = new class64(8);

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "Lke;")
    public static class622 field3113 = new class622(7, 6);

    @OriginalMember(owner = "client!uga", name = "i", descriptor = "Z")
    public static boolean field3115 = false;

    @OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
    public static int field3114 = 0;

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "[[Z")
    public static boolean[][] field3116 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "[I")
    public static int[] field3117 = new int[13];

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!uga", name = "e", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!uga", name = "d", descriptor = "Lju;")
    private class135 field3110;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)V")
    public static void method1503(byte arg0) {
        field3117 = null;
        if (arg0 >= -4) {
            method1503((byte) -113);
        }
        field3116 = null;
        field3113 = null;
        field3108 = null;
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(B)Lju;")
    private final class135 method1504(byte arg0) {
        field3107++;
        if (this.field3110 == null) {
            this.field3110 = new class135();
        }
        return arg0 <= 118 ? null : this.field3110;
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lcb;Lcb;)V")
    public class217(class544 arg0, class544 arg1) {
        this.field3109 = arg0;
        this.field3112 = arg1;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILlt;)Llp;")
    public final class409 method1505(int arg0, class702 arg1) {
        field3111++;
        if (arg1 == null) {
            return null;
        }
        class527 var3 = arg1.method606(0);
        if (class365.field5277 == var3) {
            return new class402((class366) arg1);
        } else if (class468.field6683 == var3) {
            return new class284(this.method1504((byte) 125), (class211) arg1);
        } else if (class297.field4470 == var3) {
            return new class656(this.field3109, (class390) arg1);
        } else if (class585.field8276 == var3) {
            return new class62(this.field3109, (class555) arg1);
        } else if (arg0 >= -75) {
            return null;
        } else if (class681.field9674 == var3) {
            return new class382(this.field3109, this.field3112, (class365) arg1);
        } else if (class640.field8997 == var3) {
            return new class190(this.field3109, this.field3112, (class419) arg1);
        } else if (class16.field269 == var3) {
            return new class512(this.field3109, this.field3112, (class82) arg1);
        } else if (class272.field3798 == var3) {
            return new class173(this.field3109, this.field3112, (class557) arg1);
        } else if (class572.field8106 == var3) {
            return new class285(this.field3109, (class666) arg1);
        } else if (class752.field10422 == var3) {
            return new class126(this.field3109, this.field3112, (class543) arg1);
        } else {
            return null;
        }
    }
}
