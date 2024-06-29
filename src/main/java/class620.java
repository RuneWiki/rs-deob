import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class620 extends class386 {

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    private int field8881 = 1;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    private int field8883 = 1;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    private int field8884 = 204;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "Liv;")
    public static class82 field8886 = new class82(14, 4);

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "Lcr;")
    public static class531 field8888 = new class531();

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field8887;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field8889;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field8880;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = 32 % ((arg1 - 13) / 40);
        if (super.field5140.field3482) {
            for (int var5 = 0; class599.field8643 > var5; ++var5) {
                int var6 = class152.field1879[var5];
                int var7 = class562.field8114[arg0];
                int var8 = this.field8883 * var6 >> 12;
                int var9 = this.field8881 * var7 >> 12;
                int var10 = var6 % (4096 / this.field8883) * this.field8883;
                int var11 = var7 % (4096 / this.field8881) * this.field8881;
                if (this.field8884 > var11) {
                    for (var8 -= var9; ~var8 > -1; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var5] = 0;
                        continue;
                    }
                    if (~var10 > ~this.field8884) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                if (~this.field8884 < ~var10) {
                    int var12;
                    for (var12 = var8 - var9; ~var12 > -1; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (~var12 < -1) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                var3[var5] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZILjava/io/File;)V")
    public static final void method3546(boolean arg0, int arg1, File arg2) {
        if (class228.field2974 == null) {
            class48.method541(-112);
        }
        ++field8882;
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field8889 != null ? field8889 : (field8889 = method3548("java.lang.String")), Boolean.TYPE);
            var4.invoke(class228.field2974, arg2.getAbsolutePath(), new Boolean(arg0));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
        if (arg1 >= -9) {
            method3547((byte) 116);
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)V")
    public static void method3547(byte arg0) {
        field8888 = null;
        field8886 = null;
        int var1 = -55 / ((arg0 - -43) / 43);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg1 > 111) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        this.field8884 = arg2.method2260(-99);
                    }
                } else {
                    this.field8881 = arg2.method2229(255);
                }
            } else {
                this.field8883 = arg2.method2229(255);
            }
            ++field8879;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class620() {
        super(0, true);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3548(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
