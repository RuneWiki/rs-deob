import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class225 {

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Ljo;")
    private class382 field3183 = new class382(64);

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lok;")
    private class74 field3181;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Ldp;")
    public static class347 field3180 = new class347("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "[B")
    public static byte[] field3184;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Ll;")
    public static class127 field3177;

    static {
        new class347("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field3184 = new byte[2048];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 3)
    public final void method1410(byte arg0) {
        field3175++;
        if (arg0 > 59) {
            class382 var2 = this.field3183;
            synchronized (this.field3183) {
                this.field3183.method2293(false);
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 19)
    public final void method1411(int arg0) {
        field3178++;
        if (arg0 >= -99) {
            this.method1410((byte) -115);
        }
        class382 var2 = this.field3183;
        synchronized (this.field3183) {
            this.field3183.method2287(124);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 33)
    public static void method1412(int arg0) {
        field3180 = null;
        field3177 = null;
        int var1 = -77 % ((arg0 + 1) / 56);
        field3184 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 47)
    public final void method1413(int arg0, int arg1) {
        class382 var3 = this.field3183;
        synchronized (this.field3183) {
            this.field3183.method2294(arg1, true);
            if (arg0 != 20444) {
                this.field3181 = null;
            }
        }
        field3176++;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Lfn;", line = 64)
    public final class211 method1414(int arg0, int arg1) {
        field3179++;
        class382 var3 = this.field3183;
        class211 var4;
        synchronized (this.field3183) {
            var4 = (class211) this.field3183.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field3181;
        byte[] var7;
        synchronized (this.field3181) {
            int var6 = -41 % ((-arg1 - 39) / 56);
            var7 = this.field3181.method541(arg0, 31, (byte) -122);
        }
        class211 var8 = new class211();
        if (var7 != null) {
            var8.method1364(new class468(var7), (byte) 60);
        }
        class382 var9 = this.field3183;
        synchronized (this.field3183) {
            this.field3183.method2290((long) arg0, var8, 113);
            return var8;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBIII)I", line = 93)
    public static final int method1415(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = -14 % ((-arg1 - 54) / 42);
        field3182++;
        int var6 = 65536 - class445.field6544[arg4 * 8192 / arg3] >> 1;
        return ((65536 - var6) * arg0 >> 16) + (arg2 * var6 >> 16);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 119)
    public class225(class262 arg0, int arg1, class74 arg2) {
        this.field3181 = arg2;
        this.field3181.method536(false, 31);
    }
}
