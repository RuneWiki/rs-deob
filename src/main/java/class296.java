import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class296 extends class413 {

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public int field4061 = -1;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public int field4064 = -1;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field4062 = 0;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "Ldi;")
    public static class83 field4068 = new class83(29, 4);

    @OriginalMember(owner = "client!li", name = "B", descriptor = "Lht;")
    public static class410 field4069 = new class410();

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public static int field4073 = 0;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "Ldi;")
    public static class83 field4076;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public int field4065;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public int field4067;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public int field4070;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public int field4071;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "[Ltk;")
    public static class229[] field4077;

    static {
        new class466("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field4076 = new class83(20, -1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Ljava/lang/String;", line = 5)
    public static final String method1738(int arg0, int arg1) {
        if (arg0 != -19544) {
            method1738(-20, 8);
        }
        ++field4066;
        return (255 & arg1 >> 24) + "." + (arg1 >> 16 & 255) + "." + (255 & arg1 >> 8) + "." + (255 & arg1);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 18)
    public static void method1739(int arg0) {
        field4076 = null;
        field4077 = null;
        field4068 = null;
        if (arg0 < 85) {
            field4076 = null;
        }
        field4069 = null;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(ILya;)V", line = 50)
    public final void method493(int arg0, class38 arg1) {
        ++field4072;
        if (arg0 >= -114) {
            this.field4071 = -7;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZILya;I)Z", line = 65)
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        ++field4075;
        class122 var5 = arg2.method280();
        if (!arg0) {
            this.method500(false, 52, (class38) null, 95);
        }
        var5.method182(super.field6026, super.field6021, super.field6025);
        class471 var6 = class328.field4480.method3091(100, this.field4071).method3043(0, 44, (class104) null, arg2, this.field4070, 131072, -1, (class441) null, 0);
        if (var6 != null && var6.method391(arg3, arg1, var5, true)) {
            return true;
        } else {
            if (this.field4064 != -1) {
                class471 var7 = class328.field4480.method3091(50, this.field4064).method3043(0, -112, (class104) null, arg2, this.field4065, 131072, -1, (class441) null, 0);
                if (var7 != null && var7.method391(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            if (~this.field4061 != 0) {
                class471 var8 = class328.field4480.method3091(50, this.field4061).method3043(0, 127, (class104) null, arg2, this.field4067, 131072, -1, (class441) null, 0);
                if (var8 != null && var8.method391(arg3, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lya;B)Lmf;", line = 107)
    public final class289 method484(class38 arg0, byte arg1) {
        ++field4074;
        class122 var3 = arg0.method280();
        if (arg1 < 111) {
            method1738(-87, 31);
        }
        var3.method182(super.field6026, super.field6021, super.field6025);
        class289 var4 = class165.method1099(true, 3);
        if (~this.field4061 != 0) {
            class471 var5 = class328.field4480.method3091(53, this.field4061).method3043(0, 67, (class104) null, arg0, this.field4067, 2048, -1, (class441) null, 0);
            if (var5 != null) {
                var5.method397(var3, var4.field4009[2], 0);
            }
        }
        if (this.field4064 != -1) {
            class471 var6 = class328.field4480.method3091(94, this.field4064).method3043(0, -119, (class104) null, arg0, this.field4065, 2048, -1, (class441) null, 0);
            if (var6 != null) {
                var6.method397(var3, var4.field4009[1], 0);
            }
        }
        class471 var7 = class328.field4480.method3091(114, this.field4071).method3043(0, 41, (class104) null, arg0, this.field4070, 2048, -1, (class441) null, 0);
        if (var7 != null) {
            var7.method397(var3, var4.field4009[0], 0);
        }
        return var4;
    }
}
