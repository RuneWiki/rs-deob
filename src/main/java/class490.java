import java.awt.Frame;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class490 implements Runnable {

    @OriginalMember(owner = "client!um", name = "g", descriptor = "Ldb;")
    public static class298 field6608 = new class298(57, 2);

    @OriginalMember(owner = "client!um", name = "i", descriptor = "Lcu;")
    public static class206 field6610 = new class206(36, 7);

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field6612 = 1;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "Lsa;")
    private class192 field6609;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field6611;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field6604;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "Z")
    private volatile boolean field6605;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "[Lai;")
    private class561[] field6602;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Z")
    public final boolean method2735(int arg0) {
        field6606++;
        if (this.field6605) {
            return true;
        }
        if (this.field6609 == null) {
            try {
                int var2 = class616.field8169 == class137.field2222 ? 80 : class488.field6601.field2955 + 7000;
                this.field6609 = class688.field9669.method2894(new URL("http://" + class488.field6601.field2957 + ":" + var2 + "/news.ws?game=" + class392.field5166.field9508), (byte) 116);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (arg0 >= -94) {
            this.method2736(3, -33);
        }
        if (this.field6609 == null || this.field6609.field2816 == 2) {
            return true;
        } else if (this.field6609.field2816 == 1) {
            if (this.field6604 == null) {
                this.field6604 = new Thread(this);
                this.field6604.start();
            }
            return this.field6605;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "run", descriptor = "()V")
    public final void run() {
        field6603++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field6609.field2820));
            String var2 = var1.readLine();
            class639 var3 = class346.method2077(true);
            while (var2 != null) {
                var3.method3527(var2, 111);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3526(-107);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field6602 = new class561[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field6602[var5 / 3] = new class561(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field6605 = true;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II)Lai;")
    public final class561 method2736(int arg0, int arg1) {
        field6607++;
        int var3 = -98 / ((arg0 - 20) / 55);
        return this.field6602 == null || arg1 < 0 || arg1 >= this.field6602.length ? null : this.field6602[arg1];
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
    public static void method2737(byte arg0) {
        field6608 = null;
        field6611 = null;
        if (arg0 != 43) {
            field6610 = null;
        }
        field6610 = null;
    }
}
