import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public abstract class class437 extends class416 {

    @OriginalMember(owner = "client!rba", name = "D", descriptor = "Lek;")
    public class510 field6027;

    @OriginalMember(owner = "client!rba", name = "B", descriptor = "I")
    public int field6025;

    @OriginalMember(owner = "client!rba", name = "x", descriptor = "J")
    public static long field6021 = 0L;

    @OriginalMember(owner = "client!rba", name = "y", descriptor = "I")
    public static int field6022 = 0;

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!rba", name = "A", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!rba", name = "C", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILjava/lang/String;)I", line = 12)
    public static final int method2511(int arg0, String arg1) {
        field6026++;
        if (!class572.field7505.field2892) {
            return -1;
        } else if (class271.field3787.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class634.method3483(109, arg1);
            if (var2 == null) {
                return -1;
            } else if (arg0 < 26) {
                return -114;
            } else {
                String var3 = class92.field1120 + var2;
                if (!class105.field1438.method2224("", var3, 86)) {
                    return -1;
                } else if (class105.field1438.method2227(var3, true)) {
                    byte[] var4 = class105.field1438.method2204("", var3, (byte) 103);
                    Object var5 = null;
                    File var6;
                    try {
                        var6 = class429.method2476(-3251, var2);
                    } catch (RuntimeException var10) {
                        return -1;
                    }
                    if (var4 == null || var6 == null) {
                        return -1;
                    }
                    boolean var7 = true;
                    byte[] var8 = class397.method2334(var6, (byte) -108);
                    if (var8 != null && var4.length == var8.length) {
                        for (int var9 = 0; var9 < var8.length; var9++) {
                            if (var4[var9] != var8[var9]) {
                                var7 = false;
                                break;
                            }
                        }
                    } else {
                        var7 = false;
                    }
                    try {
                        if (!var7) {
                            class572.field7505.method1305(var4, var6, 29478);
                        }
                    } catch (Throwable var11) {
                        return -1;
                    }
                    class45.method326(var6, arg1, (byte) 20);
                    return 100;
                } else {
                    return class105.field1438.method2212(107, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lfha;I)V", line = 104)
    public static final void method2512(class383 arg0, int arg1) {
        field6024++;
        if (arg1 != 0) {
            return;
        }
        class461 var2 = (class461) class592.field7700.method2135((long) arg0.field10297, (byte) 31);
        if (var2 == null) {
            class153.method1120(null, 0, arg0.field10322[0], null, arg0.field3508, arg0.field10321[0], -652104791, arg0);
        } else {
            var2.method2621(256);
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIB)V", line = 127)
    public static final void method2513(int arg0, int arg1, int arg2, byte arg3) {
        field6023++;
        if (arg3 == -74) {
            class127 var4 = class760.method4231(arg1, -874792672, 9);
            var4.method1010(614);
            var4.field2099 = arg2;
            var4.field2092 = arg0;
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lek;I)V", line = 145)
    public class437(class510 arg0, int arg1) {
        this.field6027 = arg0;
        this.field6025 = arg1;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method2173(int arg0);

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)Z")
    public abstract boolean method2172(byte arg0);
}
