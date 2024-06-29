import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public abstract class class103 {

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "Lqa;")
    public static class167 field1747;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "[[B")
    public static byte[][] field1746;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "([Ljava/lang/String;IIB)Ljava/lang/String;", line = 4)
    public static final String method864(String[] arg0, int arg1, int arg2, byte arg3) {
        field1748++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg0[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            if (arg3 >= -89) {
                return null;
            } else {
                return var8.toString();
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(B)V", line = 65)
    public static void method865(byte arg0) {
        field1746 = null;
        field1747 = null;
        if (arg0 <= 40) {
            field1746 = null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(ILqa;)Lkm;")
    public abstract class120 method260(int arg0, class167 arg1);

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLqa;II)Z")
    public abstract boolean method263(byte arg0, class167 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lqa;I)Lbi;")
    public abstract class465 method267(class167 arg0, int arg1);

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BZILqa;IILcea;)V")
    public abstract void method866(byte arg0, boolean arg1, int arg2, class167 arg3, int arg4, int arg5, class103 arg6);

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "(I)V")
    public abstract void method867(int arg0);

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)Z")
    public abstract boolean method868(boolean arg0);

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lqa;B)V")
    public abstract void method266(class167 arg0, byte arg1);
}
