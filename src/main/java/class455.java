import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class455 extends class59 {

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public int field6979;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field6978;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public int field6982;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public int field6980;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field6977 = 0;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field6981 = 0;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field6976 = 0;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Z")
    public static boolean field6983 = false;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)Lhi;")
    public static final class131 method2702(int arg0, boolean arg1) {
        field6975++;
        if (!arg1) {
            return null;
        }
        class131[] var2 = class116.method827(0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field2085 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIII)V")
    public class455(int arg0, int arg1, int arg2, int arg3) {
        this.field6979 = arg3;
        this.field6978 = arg2;
        this.field6982 = arg1;
        this.field6980 = arg0;
    }
}
