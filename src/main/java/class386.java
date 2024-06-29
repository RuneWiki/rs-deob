import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class386 {

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "Lcb;")
    public static class544 field5500;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "Liba;")
    public static class553 field5496;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5497;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)Lrr;", line = 5)
    public static final class379 method2357(int arg0, int arg1, int arg2) {
        if (class378.field5427[arg0][arg1][arg2] == null) {
            boolean var3 = class378.field5427[0][arg1][arg2] != null && class378.field5427[0][arg1][arg2].field5431 != null;
            if (var3 && arg0 >= class456.field6545 - 1) {
                return null;
            }
            class373.method2321(arg0, arg1, arg2);
        }
        return class378.field5427[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "([BB)[B", line = 22)
    public final byte[] method2358(byte[] arg0, byte arg1) {
        field5495++;
        class120 var3 = new class120(arg0);
        if (arg1 >= -88) {
            this.method2360(null, null, true);
        }
        var3.field1521 = arg0.length - 4;
        int var4 = var3.method853((byte) 66);
        byte[] var5 = new byte[var4];
        var3.field1521 = 0;
        this.method2360(var5, var3, true);
        return var5;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V", line = 44)
    public static void method2359(byte arg0) {
        field5500 = null;
        field5496 = null;
        int var1 = -4 % ((arg0 - 60) / 35);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "([BLrv;Z)V", line = 55)
    public final void method2360(byte[] arg0, class120 arg1, boolean arg2) {
        field5498++;
        if (arg1.field1556[arg1.field1521] != 31 || arg1.field1556[arg1.field1521 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5497 == null) {
            this.field5497 = new Inflater(true);
        }
        try {
            this.field5497.setInput(arg1.field1556, arg1.field1521 + 10, arg1.field1556.length + -8 + -arg1.field1521 + -10);
            this.field5497.inflate(arg0);
        } catch (Exception var4) {
            this.field5497.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg2) {
            this.field5497.reset();
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "()V", line = 79)
    public class386() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(III)V", line = 88)
    private class386(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIIZ)V", line = 101)
    public static final void method2361(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5494++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class387.method2374(1, arg0 + arg2, class450.field6463, class285.field4372);
        int var10 = class387.method2374(1, arg2 - arg0, class450.field6463, class285.field4372);
        class382.method2347(var10, class347.field5087[arg1], arg3, 7, var9);
        if (!arg4) {
            field5500 = null;
        }
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (var12 >= class738.field10297 && var11 <= class414.field5846) {
                    int var13 = class387.method2374(1, arg2 + var5, class450.field6463, class285.field4372);
                    int var14 = class387.method2374(1, arg2 - var5, class450.field6463, class285.field4372);
                    if (class414.field5846 >= var12) {
                        class382.method2347(var14, class347.field5087[var12], arg3, 7, var13);
                    }
                    if (var11 >= class738.field10297) {
                        class382.method2347(var14, class347.field5087[var11], arg3, 7, var13);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (class738.field10297 <= var16 && var15 <= class414.field5846) {
                int var17 = class387.method2374(1, arg2 + var6, class450.field6463, class285.field4372);
                int var18 = class387.method2374(1, arg2 - var6, class450.field6463, class285.field4372);
                if (class414.field5846 >= var16) {
                    class382.method2347(var18, class347.field5087[var16], arg3, 7, var17);
                }
                if (var15 >= class738.field10297) {
                    class382.method2347(var18, class347.field5087[var15], arg3, 7, var17);
                }
            }
        }
    }
}
