import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class702 {

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "[S")
    public short[] field9290;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "J")
    public long field9293;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "[I")
    public int[] field9288;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "[S")
    public short[] field9285;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "Lvf;")
    public static class480 field9289;

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "Lha;")
    public static class570 field9291;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "[[B")
    public static byte[][] field9287;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V", line = 11)
    public static void method3802(int arg0) {
        field9287 = null;
        field9289 = null;
        field9291 = null;
        if (arg0 != 1) {
            method3803(null, null, 70);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 27)
    public static final void method3803(String arg0, String arg1, int arg2) {
        field9292++;
        class530.field6723 = arg2;
        class1.field6 = 1;
        class181.method1210(arg1, arg0, false, (byte) 37);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lmc;B)V", line = 38)
    public static final void method3804(class234 arg0, byte arg1) {
        field9286++;
        if ((arg0.field3193.length - arg0.field3133) < 1) {
            return;
        }
        int var2 = arg0.method1509(true);
        if (var2 < 0 || var2 > 1 || (arg0.field3193.length - arg0.field3133) < 2) {
            return;
        }
        int var3 = arg0.method1553((byte) -112);
        if (arg0.field3193.length - arg0.field3133 < var3 * 6 || arg1 <= 80) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method1553((byte) -128);
            int var6 = arg0.method1497((byte) 92);
            if (class176.field2317.length > var5 && class681.field8791[var5] && (class589.field7476.method642(var5, -20).field658 != '1' || var6 >= -1 && var6 <= 1)) {
                class176.field2317[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(J[I[S[S)V", line = 83)
    public class702(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field9290 = arg3;
        this.field9293 = arg0;
        this.field9288 = arg1;
        this.field9285 = arg2;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V", line = 93)
    protected class702() {
    }
}
