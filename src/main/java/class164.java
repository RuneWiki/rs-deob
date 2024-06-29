import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class164 {

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "Lad;")
    private class11 field2119 = new class11(128);

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "Lad;")
    public class11 field2128 = new class11(64);

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "Ldn;")
    public class201 field2121;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "Ldn;")
    private class201 field2118;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "Z")
    public static boolean field2126 = true;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "Lgp;")
    public static class459 field2127 = new class459(12, 16);

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "Lbt;")
    public static class88 field2129 = new class88(1);

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public static int field2125;

    static {
        new class169("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1086(int arg0) {
        class302.field3918 = 0;
        class297.field3857 = 0;
        class35.field542 = 1;
        if (arg0 != 14052) {
            method1088(34, (byte) 90);
        }
        field2120++;
        class60.field787 = 0;
        class112.field1544 = -1;
        class360.field4665 = false;
        class169.field2211 = -3;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V", line = 23)
    public final void method1087(int arg0) {
        if (arg0 != 0) {
            this.method1093(-59, -86);
        }
        class11 var2 = this.field2119;
        synchronized (this.field2119) {
            this.field2119.method84(73);
        }
        field2116++;
        class11 var3 = this.field2128;
        synchronized (this.field2128) {
            this.field2128.method84(-55);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)V", line = 39)
    public static final void method1088(int arg0, byte arg1) {
        class291.field3719 = arg0;
        class264.field3347 = -1;
        class520.field7691 = 1;
        class298.field3864 = -1;
        class411.field5487 = 0;
        class368.field4742 = false;
        if (arg1 != -101) {
            field2127 = null;
        }
        field2124++;
        class181.field2362 = null;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V", line = 60)
    public final void method1089(int arg0, int arg1, int arg2) {
        int var4 = -19 % ((65 - arg1) / 36);
        field2122++;
        this.field2119 = new class11(arg2);
        this.field2128 = new class11(arg0);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZI)V", line = 75)
    public final void method1090(boolean arg0, int arg1) {
        field2123++;
        class11 var3 = this.field2119;
        synchronized (this.field2119) {
            this.field2119.method80(-66, arg1);
        }
        class11 var4 = this.field2128;
        synchronized (this.field2128) {
            this.field2128.method80(-68, arg1);
        }
        if (arg0) {
            method1086(-119);
        }
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)V", line = 93)
    public final void method1091(int arg0) {
        if (arg0 != 23665) {
            method1086(-1);
        }
        field2117++;
        class11 var2 = this.field2119;
        synchronized (this.field2119) {
            this.field2119.method90((byte) -27);
        }
        class11 var3 = this.field2128;
        synchronized (this.field2128) {
            this.field2128.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lgt;ILdn;Ldn;)V", line = 169)
    public class164(class65 arg0, int arg1, class201 arg2, class201 arg3) {
        this.field2121 = arg3;
        this.field2118 = arg2;
        this.field2118.method1302(-63, 36);
    }

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "(I)V", line = 120)
    public static void method1092(int arg0) {
        if (arg0 > 21) {
            field2129 = null;
            field2127 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Ltn;", line = 139)
    public final class429 method1093(int arg0, int arg1) {
        field2125++;
        class11 var3 = this.field2119;
        class429 var4;
        synchronized (this.field2119) {
            var4 = (class429) this.field2119.method78((long) arg0, (byte) -109);
        }
        int var5 = 48 % ((arg1 - 15) / 44);
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field2118.method1313((byte) -102, 36, arg0);
        class429 var7 = new class429();
        var7.field5910 = arg0;
        var7.field5890 = this;
        if (var6 != null) {
            var7.method2537(19001, new class88(var6));
        }
        var7.method2539((byte) -35);
        class11 var8 = this.field2119;
        synchronized (this.field2119) {
            this.field2119.method88((long) arg0, 48, var7);
            return var7;
        }
    }
}
