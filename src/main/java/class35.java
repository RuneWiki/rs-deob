import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class35 {

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "Ln;")
    public static class26 field420 = class9.method82(255, "Enter place name to find");

    @OriginalMember(owner = "mapview!u", name = "c", descriptor = "Ln;")
    public static class26 field421 = class9.method82(255, "Clothes Shop");

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "Lo;")
    public static class28 field419 = new class28();

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "Ln;")
    public static class26 field423 = class9.method82(255, "floorcol)3dat");

    @OriginalMember(owner = "mapview!u", name = "d", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "mapview!u", name = "f", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field424;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(III[B)Ln;", line = 14)
    public static final class26 method236(int arg0, int arg1, int arg2, byte[] arg3) {
        class26 var4 = new class26();
        var4.field347 = arg0;
        var4.field354 = new byte[arg1];
        for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
            if (arg3[var5] != 0) {
                var4.field354[var4.field347++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(I)V", line = 36)
    public static final void method237(int arg0) {
        class22 var1 = class15.field233;
        synchronized (class15.field233) {
            class29.field377 = class26.field355;
            class19.field266 = class5.field132;
            int var2 = 19 / ((29 - arg0) / 42);
            class15.field240 = class28.field363;
            class18.field260 = class29.field371;
            class8.field175 = class18.field261;
            class5.field143 = class15.field239;
            class29.field371 = 0;
        }
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(I)V", line = 60)
    public static void method238(int arg0) {
        field421 = null;
        field420 = null;
        if (arg0 <= 72) {
            method237(-78);
        }
        field424 = null;
        field419 = null;
        field423 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B)V", line = 75)
    public static final void method239(byte arg0) {
        if (class15.field236[0][class11.field203][class8.field174] == null) {
            class4.field111 = null;
        } else {
            class4.field111 = class15.field236[0][class11.field203][class8.field174];
        }
        int var1 = -45 / ((38 - arg0) / 45);
        if (class15.field236[1][class11.field203][class8.field174] == null) {
            class11.field202 = null;
        } else {
            class11.field202 = class15.field236[1][class11.field203][class8.field174];
        }
        if (class15.field236[2][class11.field203][class8.field174] == null) {
            class34.field410 = null;
        } else {
            class34.field410 = class15.field236[2][class11.field203][class8.field174];
        }
        if (class15.field236[3][class11.field203][class8.field174] == null) {
            class29.field373 = null;
        } else {
            class29.field373 = class15.field236[3][class11.field203][class8.field174];
        }
        if (class15.field236[4][class11.field203][class8.field174] == null) {
            class8.field176 = null;
        } else {
            class8.field176 = class15.field236[4][class11.field203][class8.field174];
        }
        if (class29.field376[class11.field203][class8.field174] == null) {
            class36.field443 = null;
        } else {
            class36.field443 = class29.field376[class11.field203][class8.field174];
        }
        if (class9.field183[class11.field203][class8.field174] == null) {
            class26.field348 = null;
        } else {
            class26.field348 = class9.field183[class11.field203][class8.field174];
        }
        if (class4.field105[class11.field203][class8.field174] == null) {
            class1.field75 = null;
        } else {
            class1.field75 = class4.field105[class11.field203][class8.field174];
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 141)
    public static final void method240(Throwable arg0, String arg1, int arg2) {
        try {
            if (arg2 != 95) {
                return;
            }
            String var3 = "";
            if (arg0 != null) {
                var3 = class21.method155(arg0, arg2 ^ 0x34);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class25 var8 = class30.field386.method48((byte) -76, new URL(class30.field386.field89.getCodeBase(), "clienterror.ws?c=" + class21.field308 + "&u=" + class5.field133 + "&v1=" + class2.field91 + "&v2=" + class2.field95 + "&e=" + var7));
            while (var8.field339 == 0) {
                class18.method137(1L, (byte) 112);
            }
            if (var8.field339 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field341;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }
}
