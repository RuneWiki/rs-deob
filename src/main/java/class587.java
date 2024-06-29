import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class587 implements class749 {

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "Lni;")
    private class522 field8210;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "Ljava/lang/String;")
    private String field8212;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Lea;")
    public static class547 field8207 = new class547(59, 3);

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "[Z")
    public static boolean[] field8213 = new boolean[5];

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "[Lufa;")
    public static class680[] field8211;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIZB)V", line = 4)
    public static final void method3267(int arg0, int arg1, boolean arg2, byte arg3) {
        if (arg3 <= 71) {
            method3268(-42);
        }
        field8209++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class244.field3174 = arg0;
        class478.field6609 = arg1;
        class460.field6375 = arg2;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)Z", line = 23)
    public static final boolean method3268(int arg0) {
        if (arg0 != -8001) {
            method3269((byte) -63);
        }
        field8205++;
        return class751.field10414;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Lmk;", line = 43)
    public final class56 method307(int arg0) {
        field8208++;
        if (arg0 != 15763) {
            field8213 = null;
        }
        return class56.field571;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)I", line = 55)
    public final int method304(byte arg0) {
        field8206++;
        if (arg0 <= 126) {
            field8207 = null;
        }
        return this.field8210.method2881(this.field8212, 0) ? 100 : this.field8210.method2888(29952, this.field8212);
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)V", line = 71)
    public static void method3269(byte arg0) {
        field8213 = null;
        if (arg0 != 101) {
            method3267(67, 18, false, (byte) -61);
        }
        field8207 = null;
        field8211 = null;
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lni;Ljava/lang/String;)V", line = 82)
    public class587(class522 arg0, String arg1) {
        this.field8210 = arg0;
        this.field8212 = arg1;
    }
}
