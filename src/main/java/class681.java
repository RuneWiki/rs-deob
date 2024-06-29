import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class681 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Ljr;")
    private class112 field9219 = new class112(64);

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lin;")
    private class91 field9220;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "[C")
    public static char[] field9228 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lmu;")
    public static class303 field9223 = new class303(47, 6);

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Lad;")
    public static class426 field9229 = new class426(3, 2);

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public final void method3817(int arg0) {
        class112 var2 = this.field9219;
        synchronized (this.field9219) {
            int var3 = 25 / ((arg0 - 69) / 33);
            this.field9219.method996(-98);
        }
        field9226++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)Lu;")
    public final class74 method3818(byte arg0, int arg1) {
        field9225++;
        class112 var3 = this.field9219;
        class74 var4;
        synchronized (this.field9219) {
            var4 = (class74) this.field9219.method992((long) arg1, 96);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field9220;
        byte[] var6;
        synchronized (this.field9220) {
            var6 = this.field9220.method863(-1860, 31, arg1);
        }
        class74 var7 = new class74();
        int var8 = 50 / ((arg0 + 63) / 56);
        if (var6 != null) {
            var7.method699((byte) -69, new class215(var6));
        }
        class112 var9 = this.field9219;
        synchronized (this.field9219) {
            this.field9219.method991(var7, (long) arg1, (byte) -108);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
    public final void method3819(int arg0, int arg1) {
        class112 var3 = this.field9219;
        synchronized (this.field9219) {
            this.field9219.method987(2, arg1);
        }
        if (arg0 >= 12) {
            field9224++;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public final void method3820(byte arg0) {
        class112 var2 = this.field9219;
        synchronized (this.field9219) {
            this.field9219.method999(0);
            int var3 = -89 % ((42 - arg0) / 50);
        }
        field9227++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
    public static final void method3821(int arg0, int arg1, int arg2) {
        boolean var3 = class649.field8928[0][arg1][arg2] != null && class649.field8928[0][arg1][arg2].field5571 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class649.field8928[var4][arg1][arg2] == null) {
                class384 var5 = class649.field8928[var4][arg1][arg2] = new class384(var4);
                if (var3) {
                    var5.field5570++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lsj;ILin;)V")
    public class681(class460 arg0, int arg1, class91 arg2) {
        this.field9220 = arg2;
        this.field9220.method860(0, 31);
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public static void method3822(byte arg0) {
        field9223 = null;
        field9228 = null;
        field9229 = null;
        if (arg0 != 82) {
            method3821(120, -36, -100);
        }
    }
}
