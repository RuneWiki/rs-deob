import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends OutputStream {

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
    public static int[] field8 = new int[200];

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field7 = 0;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lvg;")
    public static class108 field10 = null;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[Z")
    public static boolean[] field3 = new boolean[5];

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "[S")
    public static short[] field5 = new short[256];

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field2 = 255;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lfk;")
    public static class23 field4;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[I")
    public static int[] field1;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILij;II)Lci;")
    public static final class389 method1(int arg0, class316 arg1, int arg2, int arg3) {
        if (arg0 != 256) {
            method1(-17, (class316) null, 26, -29);
        }
        field9++;
        byte[] var4 = arg1.method1926(0, arg2, arg3);
        return var4 == null ? null : new class389(var4);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method2(int arg0) {
        if (arg0 != 19139) {
            return;
        }
        field4 = null;
        field10 = null;
        field1 = null;
        field5 = null;
        field8 = null;
        field3 = null;
    }

    @OriginalMember(owner = "client!wf", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field6++;
        throw new IOException();
    }
}
