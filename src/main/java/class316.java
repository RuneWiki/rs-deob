import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class316 extends class156 {

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "Ljava/lang/Object;")
    private Object field4751;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "Lct;")
    public static class285 field4747 = new class285(67, 0);

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
    public static int field4752 = 0;

    @OriginalMember(owner = "client!ho", name = "M", descriptor = "[Z")
    public static boolean[] field4755 = new boolean[8];

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "Ljava/awt/Frame;")
    public static Frame field4749;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)V")
    public static void method1948(int arg0) {
        field4749 = null;
        field4755 = null;
        if (arg0 == -1276160025) {
            field4747 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB)S")
    public static final short method1949(int arg0, byte arg1) {
        field4750++;
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = 101 / ((78 - arg1) / 37);
        int var4 = (arg0 & 0x382) >> 3;
        int var5 = arg0 & 0x7F;
        int var6 = var5 <= 64 ? var4 * var5 >> 7 : (127 - var5) * var4 >> 7;
        int var7 = var5 + var6;
        int var8;
        if (var7 == 0) {
            var8 = var6 << 1;
        } else {
            var8 = (var6 << 8) / var7;
        }
        return (short) (var2 << 10 | var8 >> 4 << 7 | var7);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1064(byte arg0) {
        field4754++;
        if (arg0 != -108) {
            this.field4751 = null;
        }
        return this.field4751;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Z")
    public final boolean method1063(byte arg0) {
        field4748++;
        return arg0 == -120 ? false : false;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class316(Object arg0, int arg1) {
        super(arg1);
        this.field4751 = arg0;
    }
}
