import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class2 implements Runnable {

    @OriginalMember(owner = "client!is", name = "i", descriptor = "Z")
    public static boolean field18 = false;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field17 = 0;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "[F")
    public static float[] field19 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!is", name = "k", descriptor = "Lwp;")
    public static class453 field20 = new class453(76, -2);

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public static int field23 = 0;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "Lvfa;")
    private class264 field21;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field11;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "Z")
    private volatile boolean field15;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "[Lcfa;")
    private class649[] field14;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)Lcfa;", line = 8)
    public final class649 method7(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method7(-108, -33);
        }
        field12++;
        return this.field14 == null || arg0 < 0 || this.field14.length <= arg0 ? null : this.field14[arg0];
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BI[F)[F", line = 27)
    public static final float[] method8(byte arg0, int arg1, float[] arg2) {
        field16++;
        float[] var3 = new float[arg1];
        class293.method1641(arg2, 0, var3, 0, arg1);
        if (arg0 > -49) {
            field20 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!is", name = "run", descriptor = "()V", line = 45)
    public final void run() {
        field13++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field21.field3356));
            String var2 = var1.readLine();
            class359 var3 = class360.method1981((byte) 65);
            while (var2 != null) {
                var3.method1979(var2, 1);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method1980(26598);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field14 = new class649[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field14[var5 / 3] = new class649(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field15 = true;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)Z", line = 87)
    public final boolean method9(byte arg0) {
        if (arg0 != 116) {
            field20 = null;
        }
        field10++;
        if (this.field15) {
            return true;
        }
        if (this.field21 == null) {
            try {
                int var2 = class591.field8310 == class1.field9 ? 80 : class584.field8165.field3685 + 7000;
                this.field21 = class590.field8289.method3624(new URL("http://" + class584.field8165.field3680 + ":" + var2 + "/news.ws?game=" + class98.field1337.field1469), 4851);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field21 == null || this.field21.field3358 == 2) {
            return true;
        } else if (this.field21.field3358 == 1) {
            if (this.field11 == null) {
                this.field11 = new Thread(this);
                this.field11.start();
            }
            return this.field15;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)V", line = 131)
    public static void method10(byte arg0) {
        field19 = null;
        if (arg0 > -77) {
            method10((byte) -12);
        }
        field20 = null;
    }
}
