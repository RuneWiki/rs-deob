import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class342 implements class233 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Leha;")
    public class91 field4329;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Z")
    public boolean field4319;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "Loea;")
    public class599 field4332;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Ltba;")
    public static class165 field4322 = new class165(64);

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "Lhg;")
    public static class693 field4331 = new class693(84, 3);

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public static void method1971(int arg0) {
        int var1 = 15 % ((arg0 + 45) / 40);
        field4322 = null;
        field4331 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lhm;")
    public final class223 method29(int arg0) {
        field4324++;
        if (arg0 != -200) {
            this.field4319 = true;
        }
        return class33.field549;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(ILeha;Loea;IIIIIIIZ)V")
    public class342(int arg0, class91 arg1, class599 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field4321 = arg3;
        this.field4328 = arg6;
        this.field4330 = arg0;
        this.field4329 = arg1;
        this.field4325 = arg9;
        this.field4319 = arg10;
        this.field4326 = arg8;
        this.field4327 = arg7;
        this.field4332 = arg2;
        this.field4323 = arg5;
        this.field4320 = arg4;
    }
}
