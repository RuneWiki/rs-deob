import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class103 {

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field1396 = 0;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!ho", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1395++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)I")
    public final int method625(boolean arg0) {
        field1393++;
        return arg0 ? -88 : this.field1397;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
    public static final String method626(int arg0, String[] arg1, int arg2, int arg3) {
        field1394++;
        if (arg0 == 0) {
            return "";
        } else if (~arg0 == arg2) {
            String var4 = arg1[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg1[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg1[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(II)V")
    public class103(int arg0, int arg1) {
        this.field1397 = arg0;
    }

    static {
        new class305("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }
}
