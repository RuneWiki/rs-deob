import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class20 extends class185 {

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field229 = 0;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field230 = 0;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field233 = 0;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "Ldb;")
    public static class17 field235 = new class17(64);

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "[[[B")
    public static byte[][][] field226;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "(I)V")
    public static void method130(int arg0) {
        field226 = null;
        field235 = null;
        if (arg0 != 76385857) {
            field235 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class20() {
        super(0, true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)I")
    public static final int method131(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field231++;
        int var5 = 65536 - class249.field3781[arg4 * 1024 / arg3] >> 1;
        if (arg0 > -124) {
            field230 = -10;
        }
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)I")
    public static final int method132(int arg0, byte arg1) {
        field227++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg1 < 24) {
            method131(-20, -93, -69, 43, -30);
        }
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
    public static final void method133(byte arg0) {
        if (arg0 == 65) {
            field228++;
            class99.field1560.method1782(0);
            class265.field3992.method1782(0);
            class191.field2931.method1782(0);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        field234++;
        if (arg1 < 70) {
            this.method34(10, 39);
        }
        return class153.field2304;
    }
}
