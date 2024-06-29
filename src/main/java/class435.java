import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class435 implements Runnable {

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "Lgca;")
    public static class227 field6051 = new class227();

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "F")
    public static float field6052;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "Lkl;")
    private class70 field6047;

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field6050;

    @OriginalMember(owner = "client!maa", name = "l", descriptor = "Z")
    private volatile boolean field6053;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "[Lbm;")
    private class98[] field6043;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "[[I")
    public static int[][] field6048;

    @OriginalMember(owner = "client!maa", name = "run", descriptor = "()V")
    public final void run() {
        field6046++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field6047.field946));
            String var2 = var1.readLine();
            class643 var3 = class13.method64((byte) -117);
            while (var2 != null) {
                var3.method3580(var2, true);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3581(-1);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field6043 = new class98[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field6043[var5 / 3] = new class98(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field6053 = true;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)V")
    public static void method2489(byte arg0) {
        if (arg0 < 91) {
            method2492(21, (byte) 32);
        }
        field6048 = null;
        field6051 = null;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IB)C")
    public static final char method2490(int arg0, byte arg1) {
        field6045++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (arg0 != -128) {
            method2490(-32, (byte) -44);
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class664.field9319[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)Z")
    public final boolean method2491(int arg0) {
        field6044++;
        if (this.field6053) {
            return true;
        } else if (arg0 == -128) {
            if (this.field6047 == null) {
                try {
                    int var2 = class603.field8404 == class164.field2358 ? 80 : class138.field1954.field2475 + 7000;
                    this.field6047 = class543.field7374.method775(new URL("http://" + class138.field1954.field2472 + ":" + var2 + "/news.ws?game=" + class219.field3065.field5857), 1);
                } catch (MalformedURLException var3) {
                    return true;
                }
            }
            if (this.field6047 == null || this.field6047.field948 == 2) {
                return true;
            } else if (this.field6047.field948 == 1) {
                if (this.field6050 == null) {
                    this.field6050 = new Thread(this);
                    this.field6050.start();
                }
                return this.field6053;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(IB)I")
    public static final int method2492(int arg0, byte arg1) {
        field6049++;
        int var2 = 72 % ((37 - arg1) / 36);
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)Lbm;")
    public final class98 method2493(int arg0, int arg1) {
        if (arg1 != -31144) {
            method2489((byte) -38);
        }
        field6042++;
        return this.field6043 == null || arg0 < 0 || this.field6043.length <= arg0 ? null : this.field6043[arg0];
    }
}
