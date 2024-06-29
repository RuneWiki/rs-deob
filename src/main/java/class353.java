import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class353 extends class168 {

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "[B")
    public byte[] field4539;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "[I")
    public static int[] field4540 = new int[2];

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Lkg;")
    public static class275 field4535 = new class275(12, 0);

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "[J")
    public static long[] field4543 = new long[32];

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Lnd;")
    public static class547 field4541;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field4533;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "[I")
    public static int[] field4537;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method2060(int arg0) {
        field4535 = null;
        field4541 = null;
        field4533 = null;
        field4537 = null;
        field4540 = null;
        field4543 = null;
        if (arg0 <= 66) {
            method2060(19);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lcc;II[I)V")
    public static final void method2061(class733 arg0, int arg1, int arg2, int[] arg3) {
        if (arg0.field165 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field165.length; var5++) {
                if (arg0.field165[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field153 != -1) {
                class56 var6 = class66.field941.method1299((byte) -122, arg0.field153);
                int var7 = var6.field776;
                if (var7 == 1) {
                    arg0.field198 = 0;
                    arg0.field202 = 0;
                    arg0.field243 = 1;
                    arg0.field172 = 0;
                    arg0.field171 = arg2;
                    if (!arg0.field206) {
                        class758.method4218(arg0.field198, arg0, 0, var6);
                    }
                }
                if (var7 == 2) {
                    arg0.field172 = 0;
                }
            }
        }
        field4534++;
        if (arg1 != -2) {
            return;
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg0.field165 == null || arg0.field165[var9] == -1 || class66.field941.method1299((byte) -99, arg3[var9]).field786 >= class66.field941.method1299((byte) -104, arg0.field165[var9]).field786) {
                arg0.field165 = arg3;
                arg0.field171 = arg2;
                arg0.field266 = arg0.field263;
            }
        }
        if (var8) {
            arg0.field165 = arg3;
            arg0.field171 = arg2;
            arg0.field266 = arg0.field263;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static final void method2062(int arg0) {
        if (arg0 >= 28) {
            field4536++;
            if (class162.field2227.field6256 && class366.field4724.field1929 != -1) {
                class657.method3704(class366.field4724.field1938, class366.field4724.field1929, -8755);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "([B)V")
    public class353(byte[] arg0) {
        this.field4539 = arg0;
    }
}
