import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class93 {

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "Z")
    public boolean field1327 = true;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "[[B")
    public static byte[][] field1326 = new byte[250][];

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "C")
    private char field1334;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "Ljava/lang/String;")
    public String field1332;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1333;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static void method787(int arg0) {
        field1326 = null;
        int var1 = 73 % ((arg0 + 32) / 59);
        field1333 = null;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lol;II)V")
    private final void method788(class431 arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            this.method790(-128, null);
        }
        if (arg2 == 1) {
            this.field1334 = class478.method2834((byte) 92, arg0.method2529(arg1 ^ 0x45));
        } else if (arg2 == 2) {
            this.field1331 = arg0.method2526(17);
        } else if (arg2 == 4) {
            this.field1327 = false;
        } else if (arg2 == 5) {
            this.field1332 = arg0.method2532((byte) -123);
        }
        field1330++;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)Z")
    public final boolean method789(int arg0) {
        if (arg0 <= 20) {
            this.method788(null, -55, 71);
        }
        field1328++;
        return this.field1334 == 's';
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILol;)V")
    public final void method790(int arg0, class431 arg1) {
        field1329++;
        while (true) {
            int var3 = arg1.method2557(14929);
            if (var3 == 0) {
                if (arg0 == -22425) {
                    return;
                } else {
                    this.method790(-50, null);
                    return;
                }
            }
            this.method788(arg1, 4, var3);
        }
    }
}
