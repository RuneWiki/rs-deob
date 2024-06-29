import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class148 implements Runnable {

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "Lra;")
    public static class361 field1911 = new class361(39, 0);

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public static int field1912 = 2;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "[I")
    public static int[] field1916 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "[F")
    public static float[] field1913 = new float[16];

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
    public static int field1917 = 2;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "Z")
    public static boolean field1918 = false;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public static int field1919 = 1405;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "Ldn;")
    private class548 field1908;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field1915;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "Z")
    private volatile boolean field1914;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "[Lnda;")
    private class658[] field1907;

    @OriginalMember(owner = "client!bs", name = "run", descriptor = "()V")
    public final void run() {
        field1909++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field1908.field7113));
            String var2 = var1.readLine();
            class374 var3 = class518.method2791((byte) -23);
            while (var2 != null) {
                var3.method2148(54, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method2146((byte) -40);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field1907 = new class658[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field1907[var5 / 3] = new class658(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field1914 = true;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
    public static void method1094(byte arg0) {
        field1911 = null;
        if (arg0 < 0) {
            method1097(47);
        }
        field1916 = null;
        field1913 = null;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)Z")
    public final boolean method1095(byte arg0) {
        field1905++;
        if (this.field1914) {
            return true;
        }
        if (this.field1908 == null) {
            try {
                int var2 = class555.field7261 == class119.field1536 ? 80 : class434.field5592.field3554 + 7000;
                this.field1908 = class688.field9413.method1052(new URL("http://" + class434.field5592.field3543 + ":" + var2 + "/news.ws?game=" + class153.field1947.field8837), (byte) -104);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (arg0 != -43) {
            this.method1096(59, -26);
        }
        if (this.field1908 == null || this.field1908.field7108 == 2) {
            return true;
        } else if (this.field1908.field7108 == 1) {
            if (this.field1915 == null) {
                this.field1915 = new Thread(this);
                this.field1915.start();
            }
            return this.field1914;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)Lnda;")
    public final class658 method1096(int arg0, int arg1) {
        if (arg0 != 9710) {
            method1097(-34);
        }
        field1910++;
        return this.field1907 == null || arg1 < 0 || this.field1907.length <= arg1 ? null : this.field1907[arg1];
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
    public static final void method1097(int arg0) {
        field1906++;
        if (arg0 != 6554) {
            field1913 = null;
        }
        if (class45.field627 == 0) {
            return;
        }
        try {
            if (++class340.field4386 > 2000) {
                if (class2.field15 != null) {
                    class2.field15.method281(0);
                    class2.field15 = null;
                }
                if (class66.field906 >= 2) {
                    class291.field3766 = -5;
                    class45.field627 = 0;
                    return;
                }
                class657.field9166.method1638(arg0 - 6426);
                class45.field627 = 1;
                class66.field906++;
                class340.field4386 = 0;
            }
            if (class45.field627 == 1) {
                class398.field5074 = class657.field9166.method1639(false, class688.field9413);
                class45.field627 = 2;
            }
            if (class45.field627 == 2) {
                if (class398.field5074.field7108 == 2) {
                    throw new IOException();
                }
                if (class398.field5074.field7108 != 1) {
                    return;
                }
                class2.field15 = class9.method45((Socket) class398.field5074.field7113, arg0 ^ 0x199B, 7500);
                class398.field5074 = null;
                class96.method730(0);
                class45.field627 = 4;
            }
            if (class45.field627 == 4) {
                if (!class2.field15.method278(1, 5)) {
                    return;
                }
                class2.field15.method279(arg0 + 12757, class230.field3069.field5393, 0, 1);
                int var1 = class230.field3069.field5393[0] & 0xFF;
                if (var1 != 21) {
                    class45.field627 = 0;
                    class291.field3766 = var1;
                    class2.field15.method281(arg0 - 6554);
                    class2.field15 = null;
                    return;
                }
                class45.field627 = 5;
            }
            if (class45.field627 == 5) {
                if (!class2.field15.method278(1, 5)) {
                    return;
                }
                class2.field15.method279(19311, class230.field3069.field5393, 0, 1);
                class45.field627 = 6;
                class691.field9448 = new String[class230.field3069.field5393[0] & 0xFF];
            }
            if (class45.field627 == 6 && class2.field15.method278(class691.field9448.length * 8, arg0 ^ 0x199F)) {
                class230.field3069.field5367 = 0;
                class2.field15.method279(19311, class230.field3069.field5393, 0, class691.field9448.length * 8);
                for (int var2 = 0; var2 < class691.field9448.length; var2++) {
                    class691.field9448[var2] = class84.method641(37, class230.field3069.method2377(-605269408));
                }
                class45.field627 = 0;
                class291.field3766 = 21;
                class2.field15.method281(0);
                class2.field15 = null;
            }
        } catch (IOException var3) {
            if (class2.field15 != null) {
                class2.field15.method281(0);
                class2.field15 = null;
            }
            if (class66.field906 < 2) {
                class657.field9166.method1638(128);
                class45.field627 = 1;
                class66.field906++;
                class340.field4386 = 0;
            } else {
                class291.field3766 = -4;
                class45.field627 = 0;
            }
        }
    }
}
