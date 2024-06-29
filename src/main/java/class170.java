import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class170 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lkb;")
    public static class93 field3376 = class76.method390("Clientscript error )2 check log for details", 0);

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3380 = 0;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lkb;")
    public static class93 field3381 = class76.method390("mod_icons", 0);

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "J")
    public static long field3382 = 0L;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3378 = -1;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Lkb;")
    public static class93 field3384 = class76.method390("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 0);

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Ljg;")
    public static class89 field3377;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "[[I")
    public static int[][] field3379;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public abstract void method308(int arg0);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILjg;I)Lob;")
    public static final class129 method1141(int arg0, int arg1, class89 arg2, int arg3) {
        int var4 = -41 / ((-arg1 - 15) / 56);
        field3383++;
        return class139.method873(arg0, arg2, (byte) -80, arg3) ? class23.method131(true) : null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BII)I")
    public abstract int method307(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public static void method1142(boolean arg0) {
        field3376 = null;
        field3384 = null;
        field3377 = null;
        field3379 = null;
        field3381 = null;
        if (!arg0) {
            method1142(false);
        }
    }
}
