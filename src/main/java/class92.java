import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public abstract class class92 {

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "[Ljava/lang/Object;")
    public Object[] field1132 = new Object[5000];

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "[B")
    public byte[] field1130 = new byte[5000];

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "I")
    public int field1137 = 0;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "I")
    public int field1138 = 0;

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "I")
    public volatile int field1136 = 0;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
    public volatile int field1133 = 0;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
    public static int field1131 = -1;

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "Ljj;")
    public static class398 field1135 = new class398(5, 4);

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V", line = 7)
    public static void method508(byte arg0) {
        field1135 = null;
        if (arg0 >= -59) {
            method514(110, (byte) -97, 109);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IBI)I", line = 29)
    public static final int method514(int arg0, byte arg1, int arg2) {
        if (arg1 == 102) {
            field1134++;
            int var3 = arg2 >>> 31;
            return (arg2 + var3) / arg0 - var3;
        } else {
            return 41;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZI)V")
    public abstract void method509(boolean arg0, int arg1);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V")
    public abstract void method510(boolean arg0);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ILaf;)V")
    public abstract void method511(int arg0, class651 arg1);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Laf;I)V")
    public abstract void method512(class651 arg0, int arg1);

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(Laf;I)V")
    public abstract void method513(class651 arg0, int arg1);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
    public abstract void method515(int arg0);

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Ld;IZI)V")
    public abstract void method516(class176 arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(ZI)V")
    public abstract void method517(boolean arg0, int arg1);
}
