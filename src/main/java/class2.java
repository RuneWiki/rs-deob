import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 {

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "Ll;")
    public static class22 field11 = class33.method229("Cooking Range", -92);

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "I")
    public static int field9 = 0;

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "[[B")
    public static byte[][] field16 = new byte[50][];

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "Ll;")
    public static class22 field13 = class33.method229("Combat Training", -111);

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "Ll;")
    public static class22 field14 = class33.method229(" )2 ", -56);

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "Ll;")
    public static class22 field17 = class33.method229("", -47);

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "Ll;")
    public static class22 field15 = class33.method229("Short)2cut", -85);

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "Lm;")
    public static class24 field10;

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "Lm;")
    public static class24 field12;

    @OriginalMember(owner = "mapview!aa", name = "j", descriptor = "[B")
    public static byte[] field18;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(I)V", line = 9)
    public static void method5(int arg0) {
        field14 = null;
        field17 = null;
        field18 = null;
        field15 = null;
        field12 = null;
        field16 = null;
        field10 = null;
        field13 = null;
        field11 = null;
        if (arg0 >= -14) {
            method6(104);
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "(I)V", line = 31)
    public static final void method6(int arg0) {
        class13 var1 = class13.field132;
        synchronized (class13.field132) {
            class35.field472 = class24.field233;
            if (~class29.field399 <= arg0) {
                while (class29.field399 != class13.field140) {
                    int var2 = class1.field1[class13.field140];
                    class13.field140 = class13.field140 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class33.field452[var2] = true;
                    } else {
                        class33.field452[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class33.field452[var3] = false;
                }
                class29.field399 = class13.field140;
            }
            class24.field233 = class17.field171;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "(I)[Lu;", line = 105)
    public static final class36[] method7(int arg0) {
        class36[] var1 = new class36[class10.field82];
        int var2 = 29 % ((-arg0 - 47) / 39);
        for (int var3 = 0; var3 < class10.field82; var3++) {
            class36 var4 = var1[var3] = new class36();
            var4.field481 = class5.field48;
            var4.field479 = class33.field453;
            var4.field484 = class24.field235[var3];
            var4.field482 = class14.field147[var3];
            var4.field483 = class19.field196[var3];
            var4.field486 = class21.field209[var3];
            var4.field485 = class38.field501;
            var4.field480 = class30.field425[var3];
        }
        class23.method157(-27401);
        return var1;
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 140)
    public static final void method8(Throwable arg0, String arg1, int arg2) {
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class12.method62(arg0, -1);
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
            int var8 = 117 / ((arg2 - 56) / 39);
            if (class38.field504.field355 == null) {
                return;
            }
            class9 var9 = class38.field504.method192(-1079, new URL(class38.field504.field355.getCodeBase(), "clienterror.ws?c=" + class10.field88 + "&u=" + class22.field214 + "&v1=" + class26.field351 + "&v2=" + class26.field347 + "&e=" + var7));
            while (var9.field72 == 0) {
                class5.method26((byte) 69, 1L);
            }
            if (var9.field72 == 1) {
                DataInputStream var10 = (DataInputStream) var9.field71;
                var10.read();
                var10.close();
            }
        } catch (Exception var12) {
        }
    }
}
