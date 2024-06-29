import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class318 {

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Lff;")
    public static class9 field4688 = new class9(0, 2, 2, 1);

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lnea;")
    public static class664 field4689 = new class664(11, -1);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "Lq;")
    public static class391 field4690;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1996(String arg0, int arg1) {
        field4686++;
        for (int var2 = arg1; var2 < class513.field7213.length; var2++) {
            if (class513.field7213[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)Ld;")
    public static final class135 method1997(byte arg0) {
        field4687++;
        if (class598.field8450 == 0) {
            return new class135();
        } else {
            if (arg0 != 101) {
                method1999(-17);
            }
            return class647.field9096[--class598.field8450];
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "([SB[Ljava/lang/String;)V")
    public static final void method1998(short[] arg0, byte arg1, String[] arg2) {
        field4685++;
        class267.method1746(arg2, arg0, arg2.length - 1, (byte) 67, 0);
        if (arg1 != -124) {
            field4690 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static void method1999(int arg0) {
        field4689 = null;
        if (arg0 != -1345) {
            method1996(null, -63);
        }
        field4688 = null;
        field4690 = null;
    }
}
