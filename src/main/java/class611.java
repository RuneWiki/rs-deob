import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class611 implements Runnable {

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field8258 = 0;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "Lth;")
    private class621 field8265;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field8259;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "Z")
    private volatile boolean field8257;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "[Lkh;")
    private class17[] field8262;

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "[[[Lvda;")
    public static class194[][][] field8264;

    @OriginalMember(owner = "client!nw", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        field8263++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field8265.field8403));
            String var2 = var1.readLine();
            class180 var3 = class99.method781(1);
            while (var2 != null) {
                var3.method1229((byte) -2, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method1224(0);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field8262 = new class17[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field8262[var5 / 3] = new class17(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field8257 = true;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(CI)I", line = 46)
    public static final int method3395(char arg0, int arg1) {
        field8261++;
        return arg0 >= arg1 && class10.field117.length > arg0 ? class10.field117[arg0] : -1;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Z", line = 62)
    public final boolean method3396(int arg0) {
        field8255++;
        if (this.field8257) {
            return true;
        }
        int var2 = 5 / ((arg0 + 22) / 46);
        if (this.field8265 == null) {
            try {
                int var3 = class554.field7645 == class222.field2884 ? 80 : class356.field5196.field9099 + 7000;
                this.field8265 = class786.field10800.method1546(17, new URL("http://" + class356.field5196.field9101 + ":" + var3 + "/news.ws?game=" + class426.field6204.field3879));
            } catch (MalformedURLException var4) {
                return true;
            }
        }
        if (this.field8265 == null || this.field8265.field8405 == 2) {
            return true;
        } else if (this.field8265.field8405 == 1) {
            if (this.field8259 == null) {
                this.field8259 = new Thread(this);
                this.field8259.start();
            }
            return this.field8257;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)Lkh;", line = 104)
    public final class17 method3397(int arg0, int arg1) {
        if (arg0 == 1) {
            field8254++;
            return this.field8262 == null || arg1 < 0 || arg1 >= this.field8262.length ? null : this.field8262[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "([[B[I[IIZI[[B[B)I", line = 122)
    public static final int method3398(byte[][] arg0, int[] arg1, int[] arg2, int arg3, boolean arg4, int arg5, byte[][] arg6, byte[] arg7) {
        field8256++;
        if (!arg4) {
            field8264 = null;
        }
        int var8 = arg2[arg5];
        int var9 = var8 + arg1[arg5];
        int var10 = arg2[arg3];
        int var11 = arg1[arg3] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg7[arg5] & 0xFF;
        if (var14 > (arg7[arg3] & 0xFF)) {
            var14 = arg7[arg3] & 0xFF;
        }
        byte[] var15 = arg6[arg5];
        byte[] var16 = arg0[arg3];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V", line = 180)
    public static void method3399(int arg0) {
        if (arg0 > -27) {
            method3395('r', 20);
        }
        field8264 = null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 192)
    public static final void method3400(String arg0, int arg1) {
        if (arg1 != 4060) {
            field8264 = null;
        }
        field8260++;
        if (arg0.equals("")) {
            return;
        }
        class521.field7245++;
        class43 var2 = class492.method2903(class299.field4217, 0, class73.field983);
        var2.field457.method1725(class525.method3045(19, arg0), 22);
        var2.field457.method1678(arg0, (byte) 60);
        class409.method2457((byte) -100, var2);
    }
}
