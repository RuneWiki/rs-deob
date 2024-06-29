import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class366 extends class377 {

    @OriginalMember(owner = "client!br", name = "z", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!br", name = "A", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!br", name = "B", descriptor = "I")
    private int field4721;

    @OriginalMember(owner = "client!br", name = "C", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!br", name = "D", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!br", name = "E", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!br", name = "F", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!br", name = "G", descriptor = "I")
    private int field4726;

    @OriginalMember(owner = "client!br", name = "H", descriptor = "I")
    private int field4727;

    @OriginalMember(owner = "client!br", name = "I", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method2131(boolean arg0, String arg1, String arg2) {
        ++field4728;
        class628.field8531 = 1;
        if (arg0) {
            class139.field1674 = -1;
            class22.method144(arg2, arg1, false, -211631871);
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(II)V")
    private final void method2132(int arg0, int arg1) {
        this.field4721 = 4080 & arg1 << 4;
        if (arg0 > 25) {
            this.field4726 = (16711680 & arg1) >> 12;
            ++field4725;
            this.field4727 = (arg1 & 65280) >> 4;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(I)V")
    private class366(int arg0) {
        super(0, false);
        this.method2132(124, arg0);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)[[I")
    public final int[][] method23(int arg0, byte arg1) {
        int var3 = -64 % ((arg1 - 31) / 42);
        ++field4722;
        int[][] var4 = super.field4850.method2566(-27346, arg0);
        if (super.field4850.field5843) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class528.field6661 > var8; ++var8) {
                var5[var8] = this.field4726;
                var6[var8] = this.field4727;
                var7[var8] = this.field4721;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
    public class366() {
        this(0);
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method2133(byte arg0, String arg1) {
        ++field4720;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class189.field2253; ++var2) {
                if (arg1.equalsIgnoreCase(class204.field2368[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class200.field2328[var2])) {
                    return true;
                }
            }
            if (arg0 <= 52) {
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILjava/io/File;[B)V")
    public static final void method2134(int arg0, int arg1, File arg2, byte[] arg3) throws IOException {
        ++field4723;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg3, arg1, arg0);
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        if (~arg0 == -1) {
            this.method2132(83, arg2.method3059(1));
        }
        int var5 = 105 / ((13 - arg1) / 55);
        ++field4719;
    }
}
