import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class258 extends class334 {

    @OriginalMember(owner = "client!po", name = "D", descriptor = "I")
    public int field4168 = 12800;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "I")
    public int field4158 = 12800;

    @OriginalMember(owner = "client!po", name = "A", descriptor = "I")
    public int field4165 = -1;

    @OriginalMember(owner = "client!po", name = "B", descriptor = "I")
    public int field4166 = -1;

    @OriginalMember(owner = "client!po", name = "K", descriptor = "I")
    public int field4175 = 0;

    @OriginalMember(owner = "client!po", name = "G", descriptor = "Z")
    public boolean field4171 = true;

    @OriginalMember(owner = "client!po", name = "M", descriptor = "I")
    public int field4177 = 0;

    @OriginalMember(owner = "client!po", name = "z", descriptor = "I")
    public int field4164;

    @OriginalMember(owner = "client!po", name = "H", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!po", name = "x", descriptor = "Ljava/lang/String;")
    public String field4162;

    @OriginalMember(owner = "client!po", name = "E", descriptor = "Ljava/lang/String;")
    public String field4169;

    @OriginalMember(owner = "client!po", name = "C", descriptor = "Lnj;")
    public class317 field4167;

    @OriginalMember(owner = "client!po", name = "u", descriptor = "Z")
    public static boolean field4159 = false;

    @OriginalMember(owner = "client!po", name = "y", descriptor = "[I")
    public static int[] field4163 = new int[4];

    @OriginalMember(owner = "client!po", name = "v", descriptor = "[[I")
    public static int[][] field4160 = new int[128][128];

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!po", name = "w", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!po", name = "F", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!po", name = "I", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!po", name = "J", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!po", name = "L", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIII[I)Z")
    public final boolean method1757(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field4174++;
        for (class189 var6 = (class189) this.field4167.method2123(84); var6 != null; var6 = (class189) this.field4167.method2126((byte) 61)) {
            if (var6.method1180((byte) 52, arg2, arg1, arg3)) {
                var6.method1182((byte) -96, arg4, arg2, arg1);
                return true;
            }
        }
        if (arg0 != 0) {
            this.field4175 = -36;
        }
        return false;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ltq;I)I")
    public static final int method1758(class276 arg0, int arg1) {
        field4176++;
        if (arg1 != 0) {
            field4163 = null;
        }
        int var2 = arg0.method1852(109, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method1852(arg1 + 105, 5);
        } else if (var2 == 2) {
            var3 = arg0.method1852(115, 8);
        } else {
            var3 = arg0.method1852(104, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([IIII)Z")
    public final boolean method1759(int[] arg0, int arg1, int arg2, int arg3) {
        field4173++;
        int var5 = -101 % ((arg2 - 10) / 53);
        for (class189 var6 = (class189) this.field4167.method2123(113); var6 != null; var6 = (class189) this.field4167.method2126((byte) 61)) {
            if (var6.method1183(arg3, -12070, arg1)) {
                var6.method1181(arg3, (byte) -126, arg1, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public final void method1760(int arg0) {
        this.field4175 = 0;
        this.field4168 = 12800;
        field4157++;
        this.field4158 = 12800;
        this.field4177 = 0;
        if (arg0 != -1) {
            this.field4171 = true;
        }
        for (class189 var2 = (class189) this.field4167.method2123(arg0 - 29); var2 != null; var2 = (class189) this.field4167.method2126((byte) 61)) {
            if (this.field4175 < var2.field2758) {
                this.field4175 = var2.field2758;
            }
            if (this.field4158 > var2.field2754) {
                this.field4158 = var2.field2754;
            }
            if (this.field4168 > var2.field2748) {
                this.field4168 = var2.field2748;
            }
            if (this.field4177 < var2.field2760) {
                this.field4177 = var2.field2760;
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public static void method1761(int arg0) {
        if (arg0 != -1) {
            field4159 = true;
        }
        field4160 = null;
        field4163 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZII)Z")
    public final boolean method1762(boolean arg0, int arg1, int arg2) {
        field4161++;
        for (class189 var4 = (class189) this.field4167.method2123(55); var4 != null; var4 = (class189) this.field4167.method2126((byte) 61)) {
            if (var4.method1185(arg1, arg2, (byte) 4)) {
                return true;
            }
        }
        if (!arg0) {
            this.field4167 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BII[I)Z")
    public final boolean method1763(byte arg0, int arg1, int arg2, int[] arg3) {
        field4170++;
        class189 var5 = (class189) this.field4167.method2123(62);
        int var6 = -94 / ((-arg0 - 32) / 58);
        while (var5 != null) {
            if (var5.method1185(arg1, arg2, (byte) 4)) {
                var5.method1182((byte) -96, arg3, arg2, arg1);
                return true;
            }
            var5 = (class189) this.field4167.method2126((byte) 61);
        }
        return false;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class258(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field4166 = arg4;
        this.field4164 = arg0;
        this.field4172 = arg3;
        this.field4165 = arg6;
        this.field4162 = arg2;
        this.field4169 = arg1;
        this.field4171 = arg5;
        if (this.field4165 == 255) {
            this.field4165 = 0;
        }
        this.field4167 = new class317();
    }
}
