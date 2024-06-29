import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class76 extends class30 {

    @OriginalMember(owner = "client!fca", name = "G", descriptor = "I")
    private int field999 = 1;

    @OriginalMember(owner = "client!fca", name = "A", descriptor = "I")
    private int field993 = 204;

    @OriginalMember(owner = "client!fca", name = "I", descriptor = "I")
    private int field1001 = 1;

    @OriginalMember(owner = "client!fca", name = "B", descriptor = "Lem;")
    public static class206 field994 = new class206(97, 1);

    @OriginalMember(owner = "client!fca", name = "L", descriptor = "Lsba;")
    public static class199 field1004 = new class199(8);

    @OriginalMember(owner = "client!fca", name = "M", descriptor = "I")
    public static int field1005 = -1;

    @OriginalMember(owner = "client!fca", name = "H", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!fca", name = "J", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!fca", name = "K", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!fca", name = "D", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!fca", name = "E", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!fca", name = "F", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "Lsea;")
    public static class648 field992;

    @OriginalMember(owner = "client!fca", name = "C", descriptor = "[I")
    public static int[] field995;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(B)V", line = 5)
    public static void method587(byte arg0) {
        field995 = null;
        field992 = null;
        field994 = null;
        if (arg0 != -32) {
            field1004 = null;
        }
        field1004 = null;
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V", line = 22)
    public class76() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BILac;)V", line = 27)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 <= 100) {
            this.method48(73, -20);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field993 = arg2.method2845(-1);
                }
            } else {
                this.field999 = arg2.method2874((byte) -75);
            }
        } else {
            this.field1001 = arg2.method2874((byte) -75);
        }
        ++field998;
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(Z)Z", line = 72)
    public static final boolean method588(boolean arg0) {
        ++field1000;
        boolean var1 = true;
        if (class596.field8333 == null) {
            if (class508.field6961.method3623(-124, class689.field9815)) {
                class596.field8333 = class168.method1188(class508.field6961, class689.field9815);
            } else {
                var1 = false;
            }
        }
        if (class700.field9921 == null) {
            if (class508.field6961.method3623(-125, class254.field3459)) {
                class700.field9921 = class168.method1188(class508.field6961, class254.field3459);
            } else {
                var1 = false;
            }
        }
        if (arg0) {
            return false;
        } else {
            if (class307.field4241 == null) {
                if (!class508.field6961.method3623(-121, class565.field7758)) {
                    var1 = false;
                } else {
                    class307.field4241 = class168.method1188(class508.field6961, class565.field7758);
                }
            }
            if (class503.field6911 == null) {
                if (class55.field627.method3623(-128, class683.field9759)) {
                    class503.field6911 = class699.method3918(class683.field9759, 110, class55.field627);
                } else {
                    var1 = false;
                }
            }
            if (class2.field6 == null) {
                if (class508.field6961.method3623(-68, class683.field9759)) {
                    class2.field6 = class168.method1190(class508.field6961, class683.field9759);
                } else {
                    var1 = false;
                }
            }
            return var1;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)[I", line = 152)
    public final int[] method48(int arg0, int arg1) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field1003;
            int[] var3 = super.field374.method3664(arg1, (byte) 8);
            if (super.field374.field9032) {
                for (int var4 = 0; ~class31.field399 < ~var4; ++var4) {
                    int var5 = class48.field568[var4];
                    int var6 = class430.field6016[arg1];
                    int var7 = this.field1001 * var5 >> 12;
                    int var8 = this.field999 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field1001) * this.field1001;
                    int var10 = var6 % (4096 / this.field999) * this.field999;
                    if (~this.field993 < ~var10) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (~var7 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (this.field993 > var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field993 > var9) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Ljava/net/Socket;ZI)Lkm;", line = 242)
    public static final class323 method589(Socket arg0, boolean arg1, int arg2) throws IOException {
        ++field996;
        return arg1 ? null : new class595(arg0, arg2);
    }
}
