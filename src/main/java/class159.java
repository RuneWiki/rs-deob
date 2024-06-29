import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class class159 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "Ldw;")
    public class664 field2221;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "Lst;")
    public static class335 field2222 = new class335(56, 7);

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Z")
    public static boolean field2225 = false;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "Lmba;")
    public static class646 field2226 = new class646();

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "Lrp;")
    public static class135 field2227;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "[I")
    public static int[] field2223;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ldw;I)V", line = 5)
    public static final void method995(class664 arg0, int arg1) {
        if (class723.field10041 == null) {
            class149 var2 = new class149();
            byte[] var3 = var2.method951(16, 128, 128, (byte) 62);
            class723.field10041 = class733.method4084(false, 824028812, var3);
        }
        field2228++;
        if (class236.field3496 == null) {
            class514 var4 = new class514();
            byte[] var5 = var4.method3070(128, 16, 128, -104);
            class236.field3496 = class733.method4084(false, 824028812, var5);
        }
        class669 var6 = arg0.field9006;
        if (arg1 == 30723 && var6.method3772(-125) && class268.field3924 == null) {
            byte[] var7 = class120.method749(128, -25377, 4.0F, 0.5F, 16.0F, 8, 4.0F, 128, 16, new class420(419684), 0.6F);
            class268.field3924 = class733.method4084(false, arg1 + 823998089, var7);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 47)
    public static final void method996(byte arg0) {
        field2224++;
        if (arg0 == -76 && class645.field8656 != null) {
            class645.field8656.method3248((byte) -88);
            class645.field8656 = null;
            class477.field6640 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 69)
    public static void method997(int arg0) {
        field2223 = null;
        field2227 = null;
        field2222 = null;
        if (arg0 < 44) {
            method997(-9);
        }
        field2226 = null;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Ldw;)V", line = 82)
    public class159(class664 arg0) {
        this.field2221 = arg0;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZII)V")
    public abstract void method367(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)Z")
    public abstract boolean method372(boolean arg0);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BZ)V")
    public abstract void method370(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZB)V")
    public abstract void method373(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lwu;II)V")
    public abstract void method368(class559 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
    public abstract void method369(byte arg0);
}
