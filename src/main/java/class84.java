import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class84 implements class318 {

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "Lla;")
    private class423 field1245;

    @OriginalMember(owner = "client!vga", name = "j", descriptor = "Lqfa;")
    private class326 field1251;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "Lla;")
    private class423 field1246;

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "I")
    public static int field1249 = 0;

    @OriginalMember(owner = "client!vga", name = "l", descriptor = "S")
    public static short field1253 = 256;

    @OriginalMember(owner = "client!vga", name = "k", descriptor = "[I")
    public static int[] field1252 = new int[1000];

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!vga", name = "i", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "Lda;")
    private class400 field1247;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(B)[Lufa;", line = 3)
    public static final class740[] method676(byte arg0) {
        field1242++;
        return arg0 == -26 ? new class740[] { class623.field8865, class262.field3767, class663.field9469, class383.field5538, class598.field8510, class463.field6605, class520.field7505, class684.field9722, class325.field4403, class348.field5136, class72.field1095, class42.field703, class22.field209, class364.field5326 } : null;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V", line = 21)
    public static void method677(int arg0) {
        field1252 = null;
        if (arg0 != -23310) {
            field1249 = -17;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZB)V", line = 33)
    public final void method678(boolean arg0, byte arg1) {
        field1250++;
        if (arg0) {
            int var3 = this.field1251.field4419.method71(class758.field10546, (byte) 71, this.field1251.field4418) + this.field1251.field4434;
            int var4 = this.field1251.field4436.method995(this.field1251.field4431, class544.field7915, (byte) 109) + this.field1251.field4435;
            this.field1247.method2435(this.field1251.field4432, this.field1251.field4440, this.field1251.field4427, null, this.field1251.field4438, (byte) -101, null, var4, this.field1251.field4422, 0, this.field1251.field4431, 0, this.field1251.field4418, var3, null, this.field1251.field4439);
        }
        if (arg1 != -53) {
            method677(-32);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)Z", line = 54)
    public final boolean method418(boolean arg0) {
        field1244++;
        boolean var2 = arg0;
        if (!this.field1245.method2609(0, this.field1251.field4423)) {
            var2 = false;
        }
        if (!this.field1246.method2609(0, this.field1251.field4423)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lla;Lla;Lqfa;)V", line = 77)
    public class84(class423 arg0, class423 arg1, class326 arg2) {
        this.field1245 = arg0;
        this.field1251 = arg2;
        this.field1246 = arg1;
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V", line = 88)
    public final void method414(byte arg0) {
        if (arg0 <= 126) {
            this.method678(false, (byte) 119);
        }
        field1248++;
        class502 var2 = class534.method3234(this.field1246, -125, this.field1251.field4423);
        this.field1247 = class211.field3164.method322(var2, class676.method3847(this.field1245, this.field1251.field4423), true);
    }
}
