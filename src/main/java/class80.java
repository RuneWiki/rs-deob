import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class80 extends class37 {

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Ldd;")
    public static class35 field1866 = class180.method1196((byte) 126, "<col=ff3000>");

    @OriginalMember(owner = "client!i", name = "U", descriptor = "Z")
    public static boolean field1865 = false;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "Ldd;")
    public static class35 field1863 = class180.method1196((byte) -42, "leuchten2:");

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    private int field1862;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    private int field1871;

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "Lo;")
    public static class134 field1861;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "Lo;")
    public static class134 field1864;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "Lfb;")
    public static class53 field1867;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 <= 5) {
            return null;
        } else {
            int[][] var3 = super.field832.method653(-30711, arg0);
            ++field1870;
            if (super.field832.field1978) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class72.field1719; ++var7) {
                    var4[var7] = this.field1862;
                    var5[var7] = this.field1869;
                    var6[var7] = this.field1871;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V")
    public static void method600(int arg0) {
        field1863 = null;
        if (arg0 == 0) {
            field1867 = null;
            field1861 = null;
            field1864 = null;
            field1866 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field1860;
        if (~arg0 == -1) {
            this.method601(arg1 + 4417, arg2.method232(43));
        }
        if (arg1 != 1) {
            field1861 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
    private final void method601(int arg0, int arg1) {
        this.field1869 = arg1 >> 4 & 4080;
        if (arg0 != 4418) {
            method603(114, 108, -93, 45, 17, true, 47, 126, -108, -50);
        }
        this.field1871 = (255 & arg1) << 4;
        ++field1873;
        this.field1862 = (arg1 & 16711680) >> 12;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lfd;B)Lfd;")
    public static final class55 method602(class55 arg0, byte arg1) {
        ++field1868;
        int var2 = class67.method544(class59.method508(arg0, (byte) 32), (byte) -128);
        int var3 = -90 % ((76 - arg1) / 49);
        if (~var2 == -1) {
            return null;
        } else {
            for (int var4 = 0; var4 < var2; ++var4) {
                arg0 = class131.method903(609074640, arg0.field1368);
                if (arg0 == null) {
                    return null;
                }
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIZIIII)V")
    public static final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1872;
        class21 var10 = null;
        if (arg5) {
            for (class21 var11 = (class21) class136.field2910.method1232(25831); var11 != null; var11 = (class21) class136.field2910.method1238(22622)) {
                if (~var11.field437 == ~arg6 && ~var11.field423 == ~arg3 && ~var11.field434 == ~arg0 && ~var11.field420 == ~arg8) {
                    var10 = var11;
                    break;
                }
            }
            if (var10 == null) {
                var10 = new class21();
                var10.field423 = arg3;
                var10.field434 = arg0;
                var10.field420 = arg8;
                var10.field437 = arg6;
                class32.method308(var10, 0);
                class136.field2910.method1236((byte) 118, var10);
            }
            var10.field424 = arg4;
            var10.field413 = arg1;
            var10.field415 = arg7;
            var10.field436 = arg2;
            var10.field432 = arg9;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
    private class80(int arg0) {
        super(0, false);
        this.method601(4418, arg0);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class80() {
        this(0);
    }
}
