import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class92 extends class27 {

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "Lbc;")
    public static class14 field1678 = new class14();

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Lkb;")
    public static class93 field1681 = class76.method390("Sichtbare Karte vorbereitet)3", 0);

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "Lkb;")
    public static class93 field1682 = class76.method390("<)4col>", 0);

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "Ljg;")
    public static class89 field1680;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
    public static final void method480(byte arg0) {
        if (arg0 != -13) {
            field1680 = null;
        }
        ++field1683;
        class28.field461.method676(30626);
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class92() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V")
    public static void method481(boolean arg0) {
        field1682 = null;
        field1678 = null;
        field1680 = null;
        if (arg0) {
            field1678 = null;
        }
        field1681 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        int[] var3 = super.field447.method1238(arg1, arg0);
        ++field1679;
        if (arg1) {
            return null;
        } else {
            if (super.field447.field3737) {
                int[][] var4 = this.method152(arg0, 0, 105);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; class159.field3209 > var8; ++var8) {
                    var3[var8] = (var5[var8] - (-var6[var8] - var7[var8])) / 3;
                }
            }
            return var3;
        }
    }
}
