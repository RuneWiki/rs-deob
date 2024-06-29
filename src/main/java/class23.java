import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 implements Runnable {

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Z")
    public boolean field548 = true;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field552 = new Object();

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
    public int[] field554 = new int[500];

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public int field555 = 0;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[I")
    public int[] field556 = new int[500];

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Lge;")
    public static class47 field553 = new class47(260);

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field560 = 0;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lr;")
    public static class118 field562 = class153.method1136(83, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lr;")
    private static class118 field559 = class153.method1136(77, "Ok");

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lr;")
    public static class118 field561 = field559;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "[Lr;")
    public static class118[] field564 = new class118[100];

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Lr;")
    public static class118 field558 = class153.method1136(90, " )2>");

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lke;")
    public static class74 field563;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static final void method209(byte arg0) {
        if (arg0 != -5) {
            field553 = null;
        }
        field557++;
        class66.field1508.method394(12693);
        class15.field383.method394(12693);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    public static void method210(byte arg0) {
        field559 = null;
        field561 = null;
        int var1 = -9 / ((-arg0 - 13) / 56);
        field564 = null;
        field558 = null;
        field562 = null;
        field563 = null;
        field553 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Z")
    public static final boolean method211(int arg0, int arg1) {
        field547++;
        if (class115.field2680[arg0]) {
            return true;
        } else if (class121.field2805.method345((byte) -102, arg0)) {
            int var2 = class121.field2805.method343((byte) 95, arg0);
            if (arg1 == var2) {
                class115.field2680[arg0] = true;
                return true;
            }
            if (class63.field1446[arg0] == null) {
                class63.field1446[arg0] = new class74[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class63.field1446[arg0][var3] == null) {
                    byte[] var4 = class121.field2805.method350(arg0, -33, var3);
                    if (var4 != null) {
                        class63.field1446[arg0][var3] = new class74();
                        class63.field1446[arg0][var3].field1703 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class63.field1446[arg0][var3].method620((byte) -67, new class105(var4));
                        } else {
                            class63.field1446[arg0][var3].method628(new class105(var4), (byte) -37);
                        }
                    }
                }
            }
            class115.field2680[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
    public static final void method212(String arg0, byte arg1, Throwable arg2) {
        field549++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class14.method98(-1, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            if (arg1 < 62) {
                method212(null, (byte) -45, null);
            }
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class144.field3238.field3430 != null) {
                class12 var8 = class144.field3238.method1125(new URL(class144.field3238.field3430.getCodeBase(), "clienterror.ws?c=" + class115.field2703 + "&u=" + class34.field852 + "&v1=" + class152.field3435 + "&v2=" + class152.field3440 + "&e=" + var7), 32729);
                while (var8.field268 == 0) {
                    class139.method1042(-57, 1L);
                }
                if (var8.field268 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field269;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!da", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field548) {
            Object var1 = this.field552;
            synchronized (this.field552) {
                if (this.field555 < 500) {
                    this.field556[this.field555] = class33.field827;
                    this.field554[this.field555] = class44.field1049;
                    this.field555++;
                }
            }
            class139.method1042(-68, 50L);
        }
        field551++;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Z")
    public static final boolean method213(int arg0, int arg1) {
        field550++;
        if (arg1 != 1) {
            field560 = -8;
        }
        return (arg0 >> 20 & 0x1) != 0;
    }
}
