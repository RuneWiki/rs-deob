import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class129 extends class15 {

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "[I")
    public int[] field1821;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "[I")
    public int[] field1819;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "Lns;")
    public static class438 field1813;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "[I")
    public static int[] field1815;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "[Lf;")
    public static class191[] field1814;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "[[[B")
    public static byte[][][] field1816;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V", line = 5)
    public static final void method818(int arg0, int arg1) {
        field1820++;
        if (arg0 != -14241) {
            method818(54, 13);
        }
        if (arg1 != -1 && class270.field3738[arg1]) {
            class70.field973.method2648(arg1, -3987);
            class59.field791[arg1] = null;
            class471.field6886[arg1] = null;
            class270.field3738[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILtl;)V", line = 30)
    public static final void method819(int arg0, class91 arg1) {
        field1818++;
        byte[] var2 = new byte[24];
        if (class518.field7679 != null) {
            try {
                class518.field7679.method570(0L, 0);
                class518.field7679.method561(var2, false);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg0 == 20999) {
            arg1.method597(0, var2, false, 24);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 75)
    public static final void method820(byte arg0) {
        if (arg0 > 58) {
            field1817++;
            if (class520.field7708 == 5) {
                class520.field7708 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V", line = 92)
    public static void method821(int arg0) {
        if (arg0 != -22136) {
            method818(-112, 106);
        }
        field1814 = null;
        field1815 = null;
        field1813 = null;
        field1816 = null;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(II[I[I)V", line = 107)
    public class129(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field1821 = arg3;
        this.field1819 = arg2;
    }
}
