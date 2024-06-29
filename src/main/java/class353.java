import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class353 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[Lwa;")
    public static class662[] field4499 = new class662[14];

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Ljava/lang/String;")
    public String field4500;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Ljava/net/Socket;")
    public final Socket method1936(boolean arg0) throws IOException {
        if (arg0) {
            method1937(74);
        }
        field4501++;
        return new Socket(this.field4500, this.field4502);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static final void method1937(int arg0) {
        field4503++;
        class572.method3158(class358.field4562, 1023);
        class276.field3458++;
        if (class297.field3663 && class356.field4538) {
            int var1 = class289.field3592.method944(2000);
            int var2 = class289.field3592.method941(124);
            int var3 = var1 - class222.field2716;
            int var4 = var2 - class26.field387;
            if (class65.field884 > var3) {
                var3 = class65.field884;
            }
            if (class393.field4945 > var4) {
                var4 = class393.field4945;
            }
            if (class358.field4562.field6793 + var3 > class65.field884 + class34.field473.field6793) {
                var3 = class65.field884 + class34.field473.field6793 - class358.field4562.field6793;
            }
            if (class393.field4945 + class34.field473.field6700 < var4 - -class358.field4562.field6700) {
                var4 = class393.field4945 + class34.field473.field6700 - class358.field4562.field6700;
            }
            int var5 = class34.field473.field6785 + var3 - class65.field884;
            int var6 = class34.field473.field6769 + var4 - class393.field4945;
            if (arg0 == 7129) {
                if (class289.field3592.method2922((byte) 9)) {
                    if (class276.field3458 > class358.field4562.field6762) {
                        int var7 = var3 - class239.field2990;
                        int var8 = var4 - class68.field935;
                        if (var7 > class358.field4562.field6722 || -class358.field4562.field6722 > var7 || var8 > class358.field4562.field6722 || var8 < -class358.field4562.field6722) {
                            class659.field9348 = true;
                        }
                    }
                    if (class358.field4562.field6736 != null && class659.field9348) {
                        class71 var9 = new class71();
                        var9.field963 = class358.field4562.field6736;
                        var9.field957 = var5;
                        var9.field952 = class358.field4562;
                        var9.field956 = var6;
                        class197.method1191(var9);
                        return;
                    }
                } else {
                    if (class659.field9348) {
                        class476.method2518((byte) 31);
                        if (class358.field4562.field6861 != null) {
                            class71 var10 = new class71();
                            var10.field963 = class358.field4562.field6861;
                            var10.field954 = class452.field5801;
                            var10.field956 = var6;
                            var10.field957 = var5;
                            var10.field952 = class358.field4562;
                            class197.method1191(var10);
                        }
                        if (class452.field5801 != null && client.method3805(class358.field4562) != null) {
                            class474.method2508(class452.field5801, (byte) -65, class358.field4562);
                        }
                    } else if ((class700.field9906 == 1 || class612.method3363(false)) && class463.field5904 > 2) {
                        class560.method3074(class239.field2990 + class222.field2716, 120, class26.field387 + class68.field935);
                    } else if (class580.method3201(arg0 - 7129)) {
                        class560.method3074(class239.field2990 + class222.field2716, arg0 ^ 0x1B82, class68.field935 + class26.field387);
                    }
                    class358.field4562 = null;
                }
            }
        } else if (class276.field3458 > 1) {
            class358.field4562 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method1938(byte arg0) {
        field4499 = null;
        int var1 = 4 % ((3 - arg0) / 47);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1909(int arg0) throws IOException;
}
