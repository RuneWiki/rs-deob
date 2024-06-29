import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class32 extends class170 {

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "[Lw;")
    public class223[] field513;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "Lsc;")
    public static class181 field512 = class149.method967(255, "huffman");

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "Lsc;")
    public static class181 field514 = class149.method967(255, "null");

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "Lsc;")
    private static class181 field516 = class149.method967(255, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "Lsc;")
    public static class181 field522 = class149.method967(255, "zap");

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "Lsc;")
    public static class181 field518 = field516;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Ljava/awt/Font;")
    public static Font field517;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
    public static void method253(byte arg0) {
        field518 = null;
        if (arg0 <= 49) {
            return;
        }
        field516 = null;
        field512 = null;
        field517 = null;
        field514 = null;
        field522 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Z")
    public final boolean method254(int arg0, int arg1) {
        if (arg0 == 10998) {
            field521++;
            return this.field513[arg1].field3857;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljb;Ljb;IZ)V")
    public class32(class11 arg0, class11 arg1, int arg2, boolean arg3) {
        class247 var5 = new class247();
        int var6 = arg0.method102(arg2, -23099);
        this.field513 = new class223[var6];
        int[] var7 = arg0.method100(arg2, true);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class239 var9 = null;
            byte[] var10 = arg0.method89(var7[var8], arg2, 114);
            int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
            for (class239 var12 = (class239) var5.method1686((byte) -83); var12 != null; var12 = (class239) var5.method1683(140)) {
                if (var12.field4152 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method91(var11, true, 0);
                } else {
                    var13 = arg1.method91(0, true, var11);
                }
                var9 = new class239(var11, var13);
                var5.method1689(var9, 103);
            }
            this.field513[var7[var8]] = new class223(var10, var9);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field515++;
        if (arg1 == arg2) {
            class107.method715(arg6, arg5, -15892, arg0, arg1, arg3, arg4);
            return;
        }
        if (arg5 - arg1 >= class11.field219 && class124.field2032 >= (arg5 + arg1) && class23.field408 <= (arg6 - arg2) && arg2 + arg6 <= class125.field2056) {
            class124.method803(arg0, arg4, arg6, arg2, arg1, -117, arg3, arg5);
        } else {
            class239.method1631(-73, arg1, arg6, arg2, arg4, arg0, arg5, arg3);
        }
        if (arg7 <= 107) {
            method256((byte) -127, -118, -92);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)I")
    public static final int method256(byte arg0, int arg1, int arg2) {
        field520++;
        if (arg0 == 90) {
            int var3 = arg2 >> 31 & arg1 - 1;
            return ((arg2 >>> 31) + arg2) % arg1 + var3;
        } else {
            return 96;
        }
    }
}
