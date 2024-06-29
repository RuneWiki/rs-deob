import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class585 {

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public int field8202;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "[I")
    public int[] field8200;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "[I")
    public int[] field8203;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field8199 = -50;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field8201;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method3318(String arg0, int arg1) {
        field8204++;
        boolean var2 = false;
        if (arg1 != 25005) {
            field8199 = 72;
        }
        if (arg0.startsWith("--> ")) {
            var2 = true;
            arg0 = arg0.substring(4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var3 = arg0.indexOf(" ", "directlogin ".length());
            if (var3 >= 0) {
                int var4 = arg0.length();
                arg0 = arg0.substring(0, var3) + " ";
                for (int var5 = var3 + 1; var5 < var4; var5++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        return var2 ? "--> " + arg0 : arg0;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(I)V")
    public class585(int arg0) {
        this.field8202 = arg0;
        this.field8200 = new int[this.field8202];
        this.field8203 = new int[this.field8202];
    }
}
