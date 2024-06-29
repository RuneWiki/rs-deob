import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class230 extends class405 implements class404 {

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    private int field3100;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[[Z")
    public static boolean[][] field3097 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field3096 = 0;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Lfo;")
    public static class361 field3101;

    static {
        new class305(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)V", line = 4)
    public static void method1464(boolean arg0) {
        field3101 = null;
        field3097 = null;
        if (!arg0) {
            field3096 = -24;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)J", line = 15)
    public final long method1465(byte arg0) {
        ++field3098;
        if (arg0 >= -20) {
            field3096 = -37;
        }
        return super.field5831.method2728();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI[BI)V", line = 26)
    public final void method1466(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (!arg0) {
            this.method2487(arg2, arg1);
            ++field3099;
            this.field3100 = arg3;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)I", line = 52)
    public final int method1467(int arg0) {
        ++field3103;
        if (arg0 <= 74) {
            this.field3100 = 102;
        }
        return this.field3100;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lur;I[BI)V", line = 65)
    public class230(class377 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3100 = arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I", line = 82)
    public final int method1468(boolean arg0) {
        if (arg0) {
            return -6;
        } else {
            ++field3102;
            return 0;
        }
    }
}
