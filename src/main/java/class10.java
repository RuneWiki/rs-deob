import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class10 implements Runnable {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "J")
    public static long field57;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lfe;")
    private class344 field61;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lcl;")
    public static class349 field67;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field66;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Z")
    private volatile boolean field64;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[Lmn;")
    private class237[] field59;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Lmn;", line = 7)
    public final class237 method24(int arg0, byte arg1) {
        field63++;
        if (this.field59 == null || arg0 < 0 || this.field59.length <= arg0) {
            return null;
        } else {
            if (arg1 != -1) {
                method27(89, -94);
            }
            return this.field59[arg0];
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method25(int arg0) {
        field58++;
        if (this.field64) {
            return true;
        } else if (arg0 == 16495) {
            if (this.field61 == null) {
                try {
                    int var2 = class425.field5937 == class224.field3414 ? 80 : class718.field9950.field8306 + 7000;
                    this.field61 = class129.field1674.method4232(arg0 - 16491, new URL("http://" + class718.field9950.field8299 + ":" + var2 + "/news.ws?game=" + class327.field4603.field10814));
                } catch (MalformedURLException var3) {
                    return true;
                }
            }
            if (this.field61 == null || this.field61.field4970 == 2) {
                return true;
            } else if (this.field61.field4970 == 1) {
                if (this.field66 == null) {
                    this.field66 = new Thread(this);
                    this.field66.start();
                }
                return this.field64;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 66)
    public static final void method26(boolean arg0) {
        if (arg0) {
            field67 = null;
        }
        field60++;
        class153.field2003 = null;
        class58.field674 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I", line = 78)
    public static final int method27(int arg0, int arg1) {
        field56++;
        if (arg1 != -1349376474) {
            return 30;
        }
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xE9) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!eb", name = "run", descriptor = "()V", line = 131)
    public final void run() {
        field65++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field61.field4975));
            String var2 = var1.readLine();
            class41 var3 = class288.method1908(0);
            while (var2 != null) {
                var3.method329(98, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method328((byte) -116);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field59 = new class237[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field59[var5 / 3] = new class237(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field64 = true;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/Object;IBI)[B", line = 178)
    public static final byte[] method28(Object arg0, int arg1, byte arg2, int arg3) {
        field62++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class53.method455(arg3, 4, arg1, var4);
        } else if (arg0 instanceof class353) {
            class353 var5 = (class353) arg0;
            return var5.method2220(-126, arg3, arg1);
        } else {
            if (arg2 < 45) {
                method26(true);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 208)
    public static void method29(byte arg0) {
        field67 = null;
        if (arg0 != -48) {
            method26(true);
        }
    }
}
