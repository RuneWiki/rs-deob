import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class717 extends class163 {

    @OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
    public static int field10056 = 0;

    @OriginalMember(owner = "client!jn", name = "D", descriptor = "I")
    public static int field10057;

    @OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
    public static int field10058;

    @OriginalMember(owner = "client!jn", name = "F", descriptor = "I")
    public static int field10059;

    @OriginalMember(owner = "client!jn", name = "H", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!jn", name = "J", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!jn", name = "I", descriptor = "J")
    public static long field10061;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B[Ljava/lang/String;)V")
    public static final void method3999(byte arg0, String[] arg1) {
        if (arg0 > -126) {
            method3999((byte) 59, (String[]) null);
        }
        ++field10060;
        if (~arg1.length >= -2) {
            class417.field5723 = class417.field5723 + arg1[0];
            class607.field8623 += arg1[0].length();
        } else {
            for (int var2 = 0; var2 < arg1.length; ++var2) {
                if (arg1[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg1[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class599.method3408("Pausing for " + var3 + " seconds...", (byte) -36);
                    class726.field10150 = var2 + 1;
                    class248.field3012 = arg1;
                    class384.field5347 = class652.method3700(-1) + (long) (var3 * 1000);
                    return;
                }
                class417.field5723 = arg1[var2];
                class644.method3668(false, (byte) 78);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBII)V")
    public static final void method4000(int arg0, byte arg1, int arg2, int arg3) {
        class100.field1043 = new byte[arg3][arg0][arg2];
        int var4 = 3 / ((7 - arg1) / 54);
        ++field10058;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IF)V")
    public final void method799(int arg0, float arg1) {
        if (arg0 < 111) {
            field10061 = -55L;
        }
        ++field10062;
        super.field1814 = arg1;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(IIIIIF)V")
    public class717(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIII)V")
    public final void method801(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 86) {
            super.field1820 = arg3;
            super.field1823 = arg1;
            ++field10059;
            super.field1822 = arg2;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[BLjava/io/File;I)V")
    public static final void method4001(int arg0, byte[] arg1, File arg2, int arg3) throws IOException {
        if (arg0 < 8) {
            method4000(41, (byte) 49, -127, 15);
        }
        ++field10057;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg1, 0, arg3);
        } catch (EOFException var5) {
        }
        var4.close();
    }
}
