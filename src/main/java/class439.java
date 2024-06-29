import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class439 {

    @OriginalMember(owner = "client!te", name = "j", descriptor = "B")
    private byte field6521;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public int field6512;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public int field6522;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public int field6514;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public int field6518;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public int field6515;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lbj;")
    public static class162 field6513 = new class162(5, 4);

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[[S")
    public static short[][] field6525;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 5)
    public static void method2617(int arg0) {
        field6525 = null;
        if (arg0 != 25709) {
            field6519 = -3;
        }
        field6513 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 16)
    public static final void method2618(int arg0) {
        if (arg0 <= 6) {
            return;
        }
        field6523++;
        class371 var1 = null;
        try {
            class121 var2 = class497.field7305.method2878("3", false, 0);
            while (var2.field2119 == 0) {
                class50.method470(1L, -5);
            }
            if (var2.field2119 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class371) var2.field2115;
            byte[] var3 = new byte[(int) var1.method2278(false)];
            if (var3.length == 0) {
                class397.field6030 = "";
                class236.field3643 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2279(var4, var3, -1, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class289 var6 = new class289(var3);
                int var7 = var6.method1858(-3256);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field4399 = var7 + 1;
                if (!var6.method1867(true)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field4399 = 1;
                int var8 = var6.method1858(-3256);
                if (var8 != 0) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class236.field3643 = var6.method1855((byte) 107);
                class397.field6030 = var6.method1855((byte) 115);
            }
        } catch (Exception var10) {
            class236.field3643 = "";
            class397.field6030 = "";
        }
        try {
            if (var1 != null) {
                var1.method2276(-2771);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lnd;I)V", line = 100)
    public static final void method2619(class385 arg0, int arg1) {
        arg0.field5624 = null;
        field6516++;
        int var2 = arg0.field5620.length;
        for (int var3 = arg1; var3 < var2; var3++) {
            arg0.field5620[var3].field4721 = false;
        }
        class60[] var4 = class123.field2139;
        synchronized (class123.field2139) {
            if (var2 < class123.field2139.length && class81.field1639[var2] < 200) {
                class123.field2139[var2].method531((byte) 97, arg0);
                int var10002 = class81.field1639[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I", line = 127)
    public final int method2620(int arg0) {
        field6517++;
        if (arg0 == -14661) {
            return (this.field6521 & 0x8) == 8 ? 1 : 0;
        } else {
            return -96;
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)I", line = 138)
    public final int method2621(int arg0) {
        field6520++;
        if (arg0 != 25569) {
            method2618(-98);
        }
        return this.field6521 & 0x7;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 161)
    public class439() {
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lnn;)V", line = 164)
    public class439(class289 arg0) {
        this.field6521 = arg0.method1816(true);
        this.field6512 = arg0.method1841((byte) -117);
        this.field6522 = arg0.method1815((byte) -118);
        this.field6514 = arg0.method1815((byte) -95);
        this.field6518 = arg0.method1815((byte) -55);
        this.field6515 = arg0.method1815((byte) -106);
    }
}
