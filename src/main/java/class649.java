import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class649 implements Runnable {

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "I")
    public static int field8918 = 0;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "D")
    public static double field8923;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "F")
    public static float field8920;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "Lwp;")
    private class435 field8921;

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field8916;

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "Z")
    private volatile boolean field8915;

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "[Lph;")
    private class754[] field8924;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IB)Lph;")
    public final class754 method3507(int arg0, byte arg1) {
        field8917++;
        if (this.field8924 == null || arg0 < 0 || arg0 >= this.field8924.length) {
            return null;
        } else {
            if (arg1 <= 101) {
                this.method3508(-113);
            }
            return this.field8924[arg0];
        }
    }

    @OriginalMember(owner = "client!pia", name = "run", descriptor = "()V")
    public final void run() {
        field8922++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field8921.field6123));
            String var2 = var1.readLine();
            class82 var3 = class205.method1269(1);
            while (var2 != null) {
                var3.method580((byte) -108, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method583(-121);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field8924 = new class754[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field8924[var5 / 3] = new class754(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field8915 = true;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)Z")
    public final boolean method3508(int arg0) {
        field8925++;
        if (this.field8915) {
            return true;
        }
        if (this.field8921 == null) {
            try {
                int var2 = class323.field4120 == class171.field2248 ? 80 : class750.field10496.field2454 + 7000;
                this.field8921 = class681.field9312.method1562(new URL("http://" + class750.field10496.field2460 + ":" + var2 + "/news.ws?game=" + class702.field9902.field3627), true);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (arg0 != 3) {
            field8923 = -0.6891791519320497D;
        }
        if (this.field8921 == null || this.field8921.field6124 == 2) {
            return true;
        } else if (this.field8921.field6124 == 1) {
            if (this.field8916 == null) {
                this.field8916 = new Thread(this);
                this.field8916.start();
            }
            return this.field8915;
        } else {
            return false;
        }
    }
}
