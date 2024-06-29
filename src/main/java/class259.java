import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class259 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field4005 = 99;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4011 = "Loaded title screen";

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4006 = "Loading textures - ";

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[S")
    public static short[] field4012 = new short[] { 17, 22, 28, 20, 26, 1, 49, 58 };

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "J")
    public long field4008;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Ltl;")
    public class259 field4013;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Ltl;")
    public class259 field4014;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Lvb;")
    public static class73 field4007;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)Z")
    public final boolean method1780(int arg0) {
        if (arg0 != 26) {
            method1782(62, -86, 4);
        }
        field4010++;
        return this.field4014 != null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
    public final void method1781(int arg0) {
        field4009++;
        if (this.field4014 == null) {
            return;
        }
        this.field4014.field4013 = this.field4013;
        this.field4013.field4014 = this.field4014;
        this.field4013 = null;
        if (arg0 != 5250) {
            this.field4008 = -113L;
        }
        this.field4014 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V")
    public static final void method1782(int arg0, int arg1, int arg2) {
        class32.field404 = true;
        class25.field278 = arg0;
        class255.field3853 = arg1;
        class232.field3407 = arg2;
        class147.field2370 = -1;
        class302.field4889 = -1;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
    public static void method1783(int arg0) {
        field4006 = null;
        field4007 = null;
        if (arg0 == -18853) {
            field4011 = null;
            field4012 = null;
        }
    }
}
