import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class317 extends class362 {

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    private int field5057;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    private int field5058;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    private int field5056;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    private int field5055;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field5053 = -1;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "Ljl;")
    public static class332 field5061 = new class332(64);

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V", line = 6)
    public static final void method2243(int arg0) {
        field5062++;
        for (int var1 = 0; var1 < 5; var1++) {
            class78.field1353[var1] = false;
        }
        class112.field1827 = 1;
        class255.field4299 = 0;
        field5053 = -1;
        class195.field3106 = -1;
        class353.field5590 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII)V", line = 26)
    public final void method642(byte arg0, int arg1, int arg2) {
        field5059++;
        int var4 = this.field5055 * arg2 >> 12;
        int var5 = this.field5056 * arg2 >> 12;
        int var6 = this.field5058 * arg1 >> 12;
        int var7 = this.field5057 * arg1 >> 12;
        if (arg0 < 12) {
            this.field5058 = 109;
        }
        class215.method1625(var4, this.field5738, var5, var6, var7, this.field5744, 2048, this.field5737);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIIII)V", line = 49)
    public class317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5057 = arg3;
        this.field5058 = arg1;
        this.field5056 = arg2;
        this.field5055 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V", line = 62)
    public static void method2244(int arg0) {
        field5061 = null;
        if (arg0 != -1) {
            field5053 = -88;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)Ljava/lang/String;", line = 82)
    public static final String method2245(int arg0, int arg1) {
        field5051++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class329.field5223 + " (" + var2 + ")</col>";
        } else if (var2.length() <= 6) {
            if (arg1 < 4) {
                field5053 = -93;
            }
            return " <col=ffff00>" + var2 + "</col>";
        } else {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class113.field1855 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZII)V", line = 116)
    public final void method644(boolean arg0, int arg1, int arg2) {
        field5052++;
        if (!arg0) {
            this.field5055 = -10;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZI)V", line = 129)
    public final void method643(int arg0, boolean arg1, int arg2) {
        int var4 = this.field5055 * arg0 >> 12;
        field5054++;
        if (!arg1) {
            this.field5057 = -17;
        }
        int var5 = this.field5056 * arg0 >> 12;
        int var6 = this.field5058 * arg2 >> 12;
        int var7 = this.field5057 * arg2 >> 12;
        class98.method779(46, var5, var4, var7, var6, this.field5738);
    }
}
