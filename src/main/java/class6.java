import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class198 {

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "Z")
    public static boolean field52 = false;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "[Z")
    public static boolean[] field53 = new boolean[100];

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field48 = -1;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "Lec;")
    public static class25 field54 = new class25(5);

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)I")
    public static final int method31(byte arg0) {
        if (arg0 < 18) {
            field48 = 10;
        }
        ++field50;
        return 14;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class6() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field51;
        if (!arg0) {
            field53 = null;
        }
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (super.field3134.field69) {
            class158.method1050(var3, 0, class42.field590, class42.field591[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(I)V")
    public static void method33(int arg0) {
        field54 = null;
        field53 = null;
        if (arg0 != 20932) {
            field52 = false;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)C")
    public static final char method34(int arg0, byte arg1) {
        ++field49;
        if (arg0 > -99) {
            field54 = null;
        }
        int var2 = 255 & arg1;
        if (~var2 == -1) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (~var2 <= -129 && var2 < 160) {
                char var3 = class50.field684[var2 + -128];
                if (var3 == 0) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }
}
