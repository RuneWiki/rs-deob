import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class425 extends class408 {

    @OriginalMember(owner = "client!hea", name = "y", descriptor = "[[S")
    public short[][] field6307;

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "D")
    public double field6311;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "I")
    public static int field6308 = 0;

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    public static int field6313 = 0;

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!hea", name = "C", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)I")
    public static final int method2656(boolean arg0, int arg1) {
        field6312++;
        if (arg1 < 96) {
            return 0;
        } else {
            if (arg0) {
                field6313 = 51;
            }
            return arg1 < 128 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)J")
    public final long method2657(int arg0) {
        field6309++;
        if (arg0 != -27530) {
            this.field6311 = 0.2719405603176384D;
        }
        return (long) (this.field6307[0].length | this.field6307.length << 0);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lge;ZBZLjava/lang/String;)V")
    public static final void method2658(class711 arg0, boolean arg1, byte arg2, boolean arg3, String arg4) {
        field6310++;
        if (arg1) {
            if (class711.field10015.startsWith("win") && arg0.field10019) {
                String var5 = null;
                if (class466.field6830 != null) {
                    var5 = class466.field6830.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class197 var6 = class690.method3924(-3, arg4, arg0, 0);
                    class246.field3583 = arg0;
                    class279.field3948 = arg4;
                    class727.field10146 = var6;
                    return;
                }
            }
            if (class711.field10015.startsWith("mac")) {
                String var7 = null;
                if (class466.field6830 != null) {
                    var7 = class466.field6830.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg3) {
                    class690.method3924(arg2 ^ 0xD, arg4, arg0, 1);
                    return;
                }
            }
            class690.method3924(arg2 ^ 0xD, arg4, arg0, 2);
        } else {
            class690.method3924(-3, arg4, arg0, 3);
        }
        if (arg2 != -16) {
            field6308 = -69;
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "([[SD)V")
    public class425(short[][] arg0, double arg1) {
        this.field6307 = arg0;
        this.field6311 = arg1;
    }
}
