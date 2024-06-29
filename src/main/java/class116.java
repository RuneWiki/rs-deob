import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 implements Runnable {

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
    public boolean field2609 = true;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field2605 = new Object();

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "[I")
    public int[] field2620 = new int[500];

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "[I")
    public int[] field2615 = new int[500];

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public int field2622 = 0;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Lsc;")
    public static class128 field2612 = null;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lsc;")
    public static class128 field2617 = class129.method1017(false, " x ");

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Lsc;")
    public static class128 field2621 = class129.method1017(false, " loggt sich ein)3");

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lhe;")
    public static class54 field2611;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[I")
    public static int[] field2606;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
    public static final void method893(int arg0, int arg1) {
        field2608++;
        class154.field3539 = arg0;
        if (arg1 < 91) {
            method895(26, null, null);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/lang/Object;Lbb;)V")
    public static final void method894(int arg0, Object arg1, class10 arg2) {
        field2618++;
        if (arg2.field172 == null || arg0 != -13960) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field172.peekEvent() != null; var3++) {
            class18.method164(false, 1L);
        }
        if (arg1 != null) {
            arg2.field172.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method895(int arg0, Throwable arg1, String arg2) {
        field2616++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class159.method1234(arg1, (byte) -115);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class25.field503.field159 != null) {
                class61 var8 = class25.field503.method85(new URL(class25.field503.field159.getCodeBase(), "clienterror.ws?c=" + class159.field3648 + "&u=" + class125.field2837 + "&v1=" + class10.field173 + "&v2=" + class10.field170 + "&e=" + var7), arg0 ^ arg0);
                while (var8.field1320 == 0) {
                    class18.method164(false, 1L);
                }
                if (var8.field1320 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1319;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLmc;)V")
    public static final void method896(byte arg0, class86 arg1) {
        field2619++;
        byte[] var2 = new byte[24];
        if (class70.field1571 != null) {
            try {
                class70.field1571.method1154(0L, false);
                class70.field1571.method1149(var2, true);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method655(var2, -114, 24, 0);
        int var5 = -127 % ((29 - arg0) / 47);
    }

    @OriginalMember(owner = "client!qe", name = "run", descriptor = "()V")
    public final void run() {
        field2613++;
        while (this.field2609) {
            Object var1 = this.field2605;
            synchronized (this.field2605) {
                if (this.field2622 < 500) {
                    this.field2620[this.field2622] = class64.field1380;
                    this.field2615[this.field2622] = class18.field330;
                    this.field2622++;
                }
            }
            class18.method164(false, 50L);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method897(int arg0) {
        field2621 = null;
        field2611 = null;
        field2617 = null;
        field2606 = null;
        if (arg0 == -51) {
            field2612 = null;
        }
    }
}
