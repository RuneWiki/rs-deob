import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class82 {

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Ldl;")
    private class35 field1257;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Lgi;")
    private class205 field1260;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "Lak;")
    private class298 field1259;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "[Z")
    public static boolean[] field1249 = new boolean[100];

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Lfe;")
    public static class231 field1247 = null;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field1256 = 0;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Lim;")
    private class170 field1254;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "[Llj;")
    private class46[] field1252;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Z")
    public final boolean method552(int arg0) {
        field1248++;
        if (this.field1254 != null) {
            return true;
        }
        if (this.field1259 == null) {
            if (this.field1257.method181(-16333)) {
                return false;
            }
            this.field1259 = this.field1257.method192(true, (byte) 0, 255, 255, 17);
        }
        if (this.field1259.field4700) {
            return false;
        } else {
            this.field1254 = new class170(this.field1259.method738(-46));
            this.field1252 = new class46[(this.field1254.field2650.length - 5) / 8];
            int var2 = -96 / ((arg0 + 19) / 37);
            return true;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lhi;Lhi;II)Llj;")
    public final class46 method553(class278 arg0, class278 arg1, int arg2, int arg3) {
        field1255++;
        if (arg3 != 8) {
            this.method555((byte) -69);
        }
        return this.method557(true, arg2, 4459, arg0, arg1);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
    public static final void method554(int arg0, int arg1) {
        field1258++;
        if (arg0 != -29288) {
            method554(-26, 30);
        }
        class134.field1931.method1514(arg1, (byte) -55);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public final void method555(byte arg0) {
        field1253++;
        if (this.field1252 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1252.length; var2++) {
            if (this.field1252[var2] != null) {
                this.field1252[var2].method263(true);
            }
        }
        if (arg0 < 96) {
            this.method553((class278) null, (class278) null, -35, 117);
        }
        for (int var3 = 0; var3 < this.field1252.length; var3++) {
            if (this.field1252[var3] != null) {
                this.field1252[var3].method259(true);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public static void method556(int arg0) {
        if (arg0 != -26421) {
            field1256 = -37;
        }
        field1249 = null;
        field1247 = null;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ldl;Lgi;)V")
    public class82(class35 arg0, class205 arg1) {
        this.field1257 = arg0;
        this.field1260 = arg1;
        if (!this.field1257.method181(-16333)) {
            this.field1259 = this.field1257.method192(true, (byte) 0, 255, 255, 74);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZIILhi;Lhi;)Llj;")
    private final class46 method557(boolean arg0, int arg1, int arg2, class278 arg3, class278 arg4) {
        field1251++;
        if (this.field1254 == null) {
            throw new RuntimeException();
        }
        this.field1254.field2676 = arg1 * 8 + 5;
        if (this.field1254.field2676 >= this.field1254.field2650.length) {
            throw new RuntimeException();
        } else if (this.field1252[arg1] == null) {
            if (arg2 != 4459) {
                this.method555((byte) -24);
            }
            int var6 = this.field1254.method1190(arg2 ^ 0x9A2);
            int var7 = this.field1254.method1190(6345);
            class46 var8 = new class46(arg1, arg4, arg3, this.field1257, this.field1260, var6, var7, arg0);
            this.field1252[arg1] = var8;
            return var8;
        } else {
            return this.field1252[arg1];
        }
    }
}
