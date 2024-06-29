import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class55 extends class171 {

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "[Llm;")
    public class502[] field660;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "Z")
    public static boolean field663 = false;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "Lhda;")
    public static class752 field661 = new class752(7, 6);

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Lwu;")
    public static class376 field665;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static final void method370(int arg0) {
        if (arg0 != 6) {
            field661 = null;
        }
        class65 var1 = class573.field7516;
        synchronized (class573.field7516) {
            class573.field7516.method561((byte) -78);
        }
        field666++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static void method371(byte arg0) {
        if (arg0 != 62) {
            method371((byte) 125);
        }
        field661 = null;
        field665 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
    public static final void method372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field662++;
        if (arg4 <= arg0) {
            for (int var5 = arg4; var5 < arg0; var5++) {
                class690.field9616[var5][arg1] = arg2;
            }
        } else {
            for (int var6 = arg0; var6 < arg4; var6++) {
                class690.field9616[var6][arg1] = arg2;
            }
        }
        if (arg3 != 6) {
            field664 = -41;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "([Llm;)V")
    public class55(class502[] arg0) {
        this.field660 = arg0;
    }
}
