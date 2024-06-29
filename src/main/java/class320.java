import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class320 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[J")
    public static long[] field4626 = new long[100];

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4628;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([Lhm;IIIIZ)V")
    public static final void method1929(class150[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field4629++;
        int var6 = 0;
        if (arg1 > -2) {
            method1929(null, -20, -102, 0, -116, false);
        }
        while (var6 < arg0.length) {
            class150 var7 = arg0[var6];
            if (var7 != null && var7.field2071 == arg2) {
                class523.method3088((byte) 117, var7, arg4, arg5, arg3);
                class213.method1338(191, var7, arg4, arg3);
                if (var7.field2141 > var7.field2049 - var7.field2113) {
                    var7.field2141 = var7.field2049 - var7.field2113;
                }
                if (var7.field2141 < 0) {
                    var7.field2141 = 0;
                }
                if (var7.field2111 > var7.field2019 - var7.field2033) {
                    var7.field2111 = var7.field2019 - var7.field2033;
                }
                if (var7.field2111 < 0) {
                    var7.field2111 = 0;
                }
                if (var7.field2022 == 0) {
                    class509.method3040(arg5, (byte) 73, var7);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class320() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static void method1930(boolean arg0) {
        if (arg0) {
            field4626 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lwm;I[B)V")
    public final void method1931(class403 arg0, int arg1, byte[] arg2) {
        field4625++;
        if (arg0.field5663[arg0.field5665] != 31 || arg0.field5663[arg0.field5665 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4628 == null) {
            this.field4628 = new Inflater(true);
        }
        try {
            if (arg1 != -1) {
                method1929(null, 77, 80, 56, 58, false);
            }
            this.field4628.setInput(arg0.field5663, arg0.field5665 + 10, -10 - arg0.field5665 + -8 + arg0.field5663.length);
            this.field4628.inflate(arg2);
        } catch (Exception var4) {
            this.field4628.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4628.reset();
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(III)V")
    private class320(int arg0, int arg1, int arg2) {
    }
}
