import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class525 {

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public int field7382;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "[I")
    public int[] field7378;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[I")
    public int[] field7380;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lvc;")
    public static class264 field7383 = new class264();

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "[C")
    public static char[] field7385;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "[[B")
    public static byte[][] field7381;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Llm;II)Lpl;")
    public static final class559 method3025(class425 arg0, int arg1, int arg2) {
        field7376++;
        class559 var3;
        if (class207.field2907 == null) {
            var3 = new class559();
        } else {
            var3 = class207.field2907;
            class207.field2907 = class207.field2907.field7736;
            var3.field7736 = null;
            class171.field2472--;
        }
        var3.field7742 = arg0;
        var3.field7744 = arg1;
        if (arg2 != 15208) {
            method3028((byte) 67, null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
    public class525(int arg0) {
        this.field7382 = arg0;
        this.field7378 = new int[this.field7382];
        this.field7380 = new int[this.field7382];
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static void method3026(byte arg0) {
        if (arg0 < -111) {
            field7383 = null;
            field7381 = null;
            field7385 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLqa;)V")
    public static final void method3027(boolean arg0, class207 arg1) {
        if (arg0) {
            method3028((byte) -21, null);
        }
        field7379++;
        if (class483.field6820) {
            class200.method1221(87, arg1);
        } else {
            class388.method2298(55, arg1);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method3028(byte arg0, String arg1) {
        field7377++;
        if (class288.field3965 == 3) {
            return -1;
        } else if (class469.field6604.containsKey(arg1)) {
            return 100;
        } else {
            if (arg0 != -5) {
                method3028((byte) -14, null);
            }
            String var2 = class473.method2747(0, arg1);
            String var3 = class418.field5886 + var2;
            if (!class533.field7460.method216("", var3, -65)) {
                return -1;
            } else if (class533.field7460.method251(var3, 0)) {
                byte[] var4 = class533.field7460.method228("", 100, var3);
                File var5 = class400.field5708.method1837(var2, -8300);
                if (var4 == null || var5 == null) {
                    return -1;
                }
                boolean var6 = true;
                byte[] var7 = class463.method2708(arg0 - 87, var5);
                if (var7 != null && var4.length == var7.length) {
                    for (int var8 = 0; var8 < var7.length; var8++) {
                        if (var4[var8] != var7[var8]) {
                            var6 = false;
                            break;
                        }
                    }
                } else {
                    var6 = false;
                }
                try {
                    if (!var6) {
                        class400.field5708.method1835(var4, var5, (byte) 86);
                    }
                } catch (Throwable var9) {
                    return -1;
                }
                class61.method533(1, var5, arg1);
                return 100;
            } else {
                return class533.field7460.method214(var3, true);
            }
        }
    }

    static {
        new class74("", 73);
        field7385 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    }
}
