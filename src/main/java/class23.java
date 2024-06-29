import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class23 implements Runnable {

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "Llja;")
    public static class744 field361 = new class744(11, 3);

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "Z")
    public static boolean field368 = false;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "Lpga;")
    private class561 field365;

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field367;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "Z")
    private volatile boolean field359;

    @OriginalMember(owner = "client!qia", name = "h", descriptor = "[Lst;")
    private class458[] field366;

    @OriginalMember(owner = "client!qia", name = "run", descriptor = "()V")
    public final void run() {
        field364++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field365.field7768));
            String var2 = var1.readLine();
            class570 var3 = class357.method2093(1);
            while (var2 != null) {
                var3.method3299(1, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3295((byte) -83);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field366 = new class458[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field366[var5 / 3] = new class458(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field359 = true;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
    public static void method242(byte arg0) {
        if (arg0 >= -82) {
            field368 = true;
        }
        field361 = null;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
    public static final void method243(int arg0) {
        field362++;
        if (class5.field53 == 0) {
            return;
        }
        try {
            if (arg0 >= -93) {
                method242((byte) -7);
            }
            if ((++class738.field10290) > 2000) {
                if (class436.field5748 != null) {
                    class436.field5748.method768(0);
                    class436.field5748 = null;
                }
                if (class3.field43 >= 2) {
                    class26.field414 = -5;
                    class5.field53 = 0;
                    return;
                }
                class144.field1819.method2073((byte) 35);
                class5.field53 = 1;
                class738.field10290 = 0;
                class3.field43++;
            }
            if (class5.field53 == 1) {
                class709.field9953 = class144.field1819.method2071(class521.field7389, false);
                class5.field53 = 2;
            }
            if (class5.field53 == 2) {
                if (class709.field9953.field7769 == 2) {
                    throw new IOException();
                }
                if (class709.field9953.field7769 != 1) {
                    return;
                }
                class436.field5748 = class32.method299((byte) 126, (Socket) class709.field9953.field7768, 15000);
                class709.field9953 = null;
                class671.method3765(8277);
                class5.field53 = 4;
            }
            if (class5.field53 == 4 && class436.field5748.method765((byte) -124, 1)) {
                class436.field5748.method766(class583.field7964.field5275, 0, -48, 1);
                int var1 = class583.field7964.field5275[0] & 0xFF;
                class5.field53 = 0;
                class26.field414 = var1;
                class436.field5748.method768(0);
                class436.field5748 = null;
            }
        } catch (IOException var2) {
            if (class436.field5748 != null) {
                class436.field5748.method768(0);
                class436.field5748 = null;
            }
            if (class3.field43 >= 2) {
                class5.field53 = 0;
                class26.field414 = -4;
            } else {
                class144.field1819.method2073((byte) 35);
                class3.field43++;
                class5.field53 = 1;
                class738.field10290 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)Z")
    public final boolean method244(int arg0) {
        field360++;
        if (this.field359) {
            return true;
        }
        if (this.field365 == null) {
            try {
                int var2 = class737.field10285 == class446.field6003 ? 80 : class436.field5746.field4365 + 7000;
                this.field365 = class521.field7389.method3786((byte) -67, new URL("http://" + class436.field5746.field4362 + ":" + var2 + "/news.ws?game=" + class672.field9229.field5926));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field365 == null || this.field365.field7769 == 2) {
            return true;
        } else if (this.field365.field7769 == 1) {
            if (arg0 < 88) {
                this.field359 = true;
            }
            if (this.field367 == null) {
                this.field367 = new Thread(this);
                this.field367.start();
            }
            return this.field359;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)Lst;")
    public final class458 method245(int arg0, int arg1) {
        if (arg0 != 0) {
            field361 = null;
        }
        field369++;
        return this.field366 == null || arg1 < 0 || this.field366.length <= arg1 ? null : this.field366[arg1];
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IBILkq;)V")
    public static final void method246(int arg0, byte arg1, int arg2, class620 arg3) {
        class326.field4044 = arg2;
        class61.field821 = arg0;
        field363++;
        class659.field9061 = arg3;
        int var4 = -19 % ((arg1 - 74) / 45);
    }
}
