import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class261 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Ld;")
    private class242 field4161 = new class242(64);

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lum;")
    private class83 field4162;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lmo;")
    public static class271 field4164 = new class271(7, 19);

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lpu;")
    public static class179 field4167 = new class179("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "S")
    public static short field4168 = 32767;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Z")
    public static boolean field4170 = false;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "[I")
    public static int[] field4171;

    static {
        new class179("Use", "Benutzen", "Utiliser", "Usar");
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V", line = 6)
    public final void method1823(int arg0, byte arg1) {
        class242 var3 = this.field4161;
        synchronized (this.field4161) {
            this.field4161.method1631(arg0, (byte) -19);
        }
        if (arg1 > -93) {
            this.method1826((byte) 122);
        }
        field4172++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BIZIZ)V", line = 22)
    public static final void method1824(byte arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        class52.method343(arg4, class205.field3154.length - 1, arg3, 0, arg2, arg1, true);
        field4166++;
        class381.field5604 = null;
        class467.field6879 = 0;
        int var5 = 1 / ((arg0 + 40) / 55);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 37)
    public static void method1825(int arg0) {
        field4167 = null;
        if (arg0 >= -53) {
            method1825(-2);
        }
        field4164 = null;
        field4171 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 49)
    public final void method1826(byte arg0) {
        class242 var2 = this.field4161;
        synchronized (this.field4161) {
            this.field4161.method1630(-52);
            int var3 = -31 / ((79 - arg0) / 42);
        }
        field4165++;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 67)
    public final void method1827(int arg0) {
        int var2 = -60 % ((-arg0 - 50) / 45);
        class242 var3 = this.field4161;
        synchronized (this.field4161) {
            this.field4161.method1637((byte) 13);
        }
        field4163++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)Lkk;", line = 87)
    public final class116 method1828(byte arg0, int arg1) {
        field4160++;
        class242 var3 = this.field4161;
        class116 var4;
        synchronized (this.field4161) {
            if (arg0 != 92) {
                this.method1826((byte) -15);
            }
            var4 = (class116) this.field4161.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field4162;
        byte[] var6;
        synchronized (this.field4162) {
            var6 = this.field4162.method731(0, arg1, 35);
        }
        class116 var7 = new class116();
        if (var6 != null) {
            var7.method883(new class194(var6), -1160);
        }
        var7.method882(-125);
        class242 var8 = this.field4161;
        synchronized (this.field4161) {
            this.field4161.method1623((long) arg1, 17621, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lpt;ILum;)V", line = 126)
    public class261(class308 arg0, int arg1, class83 arg2) {
        this.field4162 = arg2;
        if (this.field4162 != null) {
            this.field4162.method748(35, 12408);
        }
    }
}
