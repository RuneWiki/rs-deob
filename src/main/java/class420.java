import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class420 {

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Lfr;")
    private class231 field6352 = new class231(64);

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lqs;")
    private class496 field6343;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public int field6345;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Ljc;")
    public static class356 field6344 = new class356(3, 3);

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "Z")
    public static boolean field6351 = false;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field6346 = -1;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field6353 = 0;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "Z")
    public static boolean field6357;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "Lln;")
    public static class169 field6348;

    static {
        new class306("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field6357 = false;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 4)
    public final void method2578(int arg0) {
        field6350++;
        if (arg0 != 0) {
            field6344 = null;
        }
        class231 var2 = this.field6352;
        synchronized (this.field6352) {
            this.field6352.method1598(-59);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)Z", line = 17)
    public static final boolean method2579(int arg0, byte arg1) {
        field6347++;
        if (arg0 == 49 || arg0 == 19 || arg0 == 15 || arg0 == 30 || arg0 == 11) {
            return true;
        } else {
            int var2 = 43 / ((5 - arg1) / 46);
            return arg0 == 4 || arg0 == 1007;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lwm;", line = 46)
    public final class299 method2580(int arg0, int arg1) {
        field6355++;
        class231 var3 = this.field6352;
        class299 var4;
        synchronized (this.field6352) {
            var4 = (class299) this.field6352.method1593((byte) 126, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field6343;
        byte[] var6;
        synchronized (this.field6343) {
            var6 = this.field6343.method2926(arg0, arg1 - 36, 16);
        }
        class299 var7 = new class299();
        if (var6 != null) {
            var7.method1917(new class23(var6), arg1 ^ 0x6E);
        }
        if (arg1 != -16) {
            field6353 = 77;
        }
        class231 var8 = this.field6352;
        synchronized (this.field6352) {
            this.field6352.method1595(var7, (long) arg0, (byte) 67);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V", line = 79)
    public static final void method2581(int arg0) {
        field6359++;
        if (class422.field6374 != null) {
            return;
        }
        int var1 = class311.field4923;
        int var2 = class197.field3137;
        int var3 = class412.field6245 - class358.field5581 - var1;
        int var4 = class314.field4950 - class49.field825 - var2;
        if (var1 <= arg0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class346.field5450 == null) {
                var5 = class419.field6342.field7203;
            } else {
                var5 = class346.field5450;
            }
            int var6 = 0;
            int var7 = 0;
            if (class346.field5450 == var5) {
                Insets var8 = class346.field5450.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class314.field4950);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class412.field6245, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class412.field6245 - var3, var7, var3, class314.field4950);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class314.field4950 + var7 - var4, class412.field6245, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V", line = 144)
    public static void method2582(int arg0) {
        field6344 = null;
        field6348 = null;
        if (arg0 != -1) {
            field6348 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZ)V", line = 159)
    public final void method2583(int arg0, boolean arg1) {
        class231 var3 = this.field6352;
        synchronized (this.field6352) {
            if (arg1) {
                this.method2583(-48, true);
            }
            this.field6352.method1603((byte) -109, arg0);
        }
        field6358++;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)I", line = 172)
    public static final int method2584(int arg0, int arg1) {
        if (arg0 != 0) {
            field6348 = null;
        }
        field6354++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 194)
    public final void method2585(byte arg0) {
        field6356++;
        class231 var2 = this.field6352;
        synchronized (this.field6352) {
            this.field6352.method1604(4);
            int var3 = -13 / ((57 - arg0) / 56);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lwv;ILqs;)V", line = 212)
    public class420(class535 arg0, int arg1, class496 arg2) {
        this.field6343 = arg2;
        if (this.field6343 == null) {
            this.field6345 = 0;
        } else {
            this.field6345 = this.field6343.method2940(16, -10511);
        }
    }
}
