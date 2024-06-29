import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class406 extends class376 {

    @OriginalMember(owner = "client!uj", name = "Kb", descriptor = "Ljw;")
    public static class581 field5884 = new class581(85, -2);

    @OriginalMember(owner = "client!uj", name = "Ib", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!uj", name = "Jb", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!uj", name = "Lb", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!uj", name = "Mb", descriptor = "[I")
    public static int[] field5886;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "(I)V")
    public static void method2521(int arg0) {
        field5886 = null;
        field5884 = null;
        if (arg0 != -218867224) {
            method2521(-4);
        }
    }

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "(B)Lip;")
    public static final class737 method2522(byte arg0) {
        ++field5885;
        try {
            return arg0 < 50 ? null : (class737) Class.forName("hea").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I)V")
    public class406(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IF)V")
    public final void method2523(int arg0, float arg1) {
        ++field5883;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field5518[super.field5459++] = (byte) (var3 >> 24);
        if (arg0 == -4231) {
            super.field5518[super.field5459++] = (byte) (var3 >> 16);
            super.field5518[super.field5459++] = (byte) (var3 >> 8);
            super.field5518[super.field5459++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IF)V")
    public final void method2524(int arg0, float arg1) {
        ++field5882;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field5518[super.field5459++] = (byte) var3;
        super.field5518[super.field5459++] = (byte) (var3 >> 8);
        int var4 = -24 / ((7 - arg0) / 49);
        super.field5518[super.field5459++] = (byte) (var3 >> 16);
        super.field5518[super.field5459++] = (byte) (var3 >> 24);
    }
}
