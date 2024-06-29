import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class146 {

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "[Lea;")
    public class468[] field2113 = null;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "[Lea;")
    public class468[] field2115 = null;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Lau;")
    public class629 field2117 = null;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "Lau;")
    public class629 field2122 = null;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "Lau;")
    public class629 field2121 = null;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "Z")
    public boolean field2123;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "Ltda;")
    public static class546 field2112 = new class546(10, 2, 2, 0);

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "Lh;")
    public static class572 field2124 = new class572(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field2125 = 104;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "Lkda;")
    public static class328 field2116;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2126;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "[[[B")
    public static byte[][][] field2114;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)I", line = 4)
    public static final int method998(int arg0, int arg1, int arg2) {
        field2118++;
        int var3 = (class212.method1393((byte) 67, arg2 + 45365, arg0 + 91923, 4) + (class212.method1393((byte) 67, arg2 + 10294, arg0 + 37821, 2) - 128 >> 1)) + (class212.method1393((byte) 67, arg2, arg0, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg1 >= 0) {
            method998(63, -41, 101);
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lte;)V", line = 113)
    public class146(class527 arg0) {
        this.field2123 = arg0.field7824;
        class7.method30(128, arg0);
        if (this.field2123) {
            byte[] var6 = class585.method3481(0, class87.field1259, false);
            this.field2122 = new class629(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class585.method3481(0, class194.field2880, false);
            this.field2117 = new class629(arg0, 6410, 128, 128, 16, var7, 6410);
            class242 var8 = arg0.field7743;
            if (var8.method1538(-89)) {
                byte[] var9 = class585.method3481(0, class313.field4316, false);
                this.field2121 = new class629(arg0, 6408, 128, 128, 16);
                class629 var10 = new class629(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method1540(2.0F, (byte) 54, var10, this.field2121)) {
                    this.field2121.method1461(0);
                } else {
                    this.field2121.method1462((byte) 86);
                    this.field2121 = null;
                }
                var10.method1462((byte) 89);
            }
        } else {
            this.field2115 = new class468[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class515.method3052(var2 * 2 * 128 * 128, class87.field1259, 32768, 244);
                this.field2115[var2] = new class468(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field2113 = new class468[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class515.method3052(var3 * 16384 * 2, class194.field2880, 32768, 244);
                this.field2113[var3] = new class468(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)Z", line = 42)
    public static final boolean method999(int arg0, int arg1, int arg2) {
        if (arg1 != 11352) {
            method1000((byte) -15);
        }
        field2119++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        class145 var3 = class216.field3172.method1505(-24044, arg2);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method994((byte) -68, arg0);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V", line = 66)
    public static void method1000(byte arg0) {
        field2116 = null;
        field2112 = null;
        field2114 = null;
        field2124 = null;
        field2126 = null;
        if (arg0 != -2) {
            method1000((byte) -102);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)V", line = 90)
    public static final void method1001(boolean arg0) {
        class20.field197 = new class224(8);
        field2120++;
        class463.field6522 = 0;
        for (class206 var1 = (class206) class515.field7349.method2233(arg0); var1 != null; var1 = (class206) class515.field7349.method2240(16772)) {
            var1.method1357();
        }
        if (!arg0) {
            field2125 = 121;
        }
    }
}
