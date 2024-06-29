import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class class56 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lhga;")
    public static class158 field728 = new class158(109, 0);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lrl;")
    public static class672 field731 = new class672(7, -1);

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lf;")
    public static class702 field733;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lri;")
    public static class97 field729;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[Liaa;")
    public static class459[] field730;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([BI)V")
    public abstract void method653(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)[B")
    public abstract byte[] method654(byte arg0);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method655(int arg0) {
        field730 = null;
        field731 = null;
        if (arg0 != 109) {
            method655(102);
        }
        field729 = null;
        field733 = null;
        field728 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)[B")
    public abstract byte[] method656(int arg0, byte arg1, int arg2);
}
