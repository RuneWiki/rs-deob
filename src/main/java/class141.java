import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class141 extends class370 {

    @OriginalMember(owner = "client!nt", name = "J", descriptor = "[Ldj;")
    public static class218[] field1839 = new class218[16];

    @OriginalMember(owner = "client!nt", name = "P", descriptor = "Liu;")
    public static class390 field1845 = new class390(77, 8);

    @OriginalMember(owner = "client!nt", name = "T", descriptor = "I")
    public static int field1849 = 0;

    @OriginalMember(owner = "client!nt", name = "R", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1847 = new Rectangle[100];

    @OriginalMember(owner = "client!nt", name = "U", descriptor = "[I")
    public static int[] field1850 = new int[8];

    @OriginalMember(owner = "client!nt", name = "Q", descriptor = "Ldc;")
    public static class5 field1846 = new class5(8);

    @OriginalMember(owner = "client!nt", name = "K", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!nt", name = "M", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!nt", name = "N", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!nt", name = "S", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!nt", name = "O", descriptor = "Luo;")
    public static class388 field1844;

    @OriginalMember(owner = "client!nt", name = "L", descriptor = "[B")
    private byte[] field1841;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BIZ)V")
    public final void method887(byte arg0, int arg1, boolean arg2) {
        field1840++;
        if (arg2) {
            method890((byte) 81);
        }
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var6 = var4 + 1;
        this.field1841[var4] = (byte) (var5 * 3 >> 5);
        this.field1841[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "(I)V")
    public static void method888(int arg0) {
        field1844 = null;
        if (arg0 != -25487) {
            field1850 = null;
        }
        field1839 = null;
        field1850 = null;
        field1845 = null;
        field1847 = null;
        field1846 = null;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(IIII)[B")
    public final byte[] method889(int arg0, int arg1, int arg2, int arg3) {
        this.field1841 = new byte[arg0 * arg1 * arg2 * 2];
        if (arg3 != 17983) {
            method890((byte) -30);
        }
        field1843++;
        this.method1930(arg1, arg0, 200, arg2);
        return this.field1841;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)V")
    public static final void method890(byte arg0) {
        if (arg0 != -125) {
            field1846 = null;
        }
        if (class44.field670 != 3) {
            class128.field1631 = -1;
        }
        field1842++;
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
    public class141() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
