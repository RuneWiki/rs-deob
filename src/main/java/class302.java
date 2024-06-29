import jaggl.memory.NativeHeap;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class302 extends class16 {

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field4280;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Z")
    public static boolean field4284;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field4286;

    static {
        new class342("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field4284 = false;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLmq;)V", line = 3)
    public static final void method1902(byte arg0, class350 arg1) {
        int var2 = -109 % ((-arg0 - 45) / 32);
        if (class511.field7541 == arg1.field5277) {
            class355.field5424[arg1.field5339] = true;
        }
        field4283++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIZBI)V", line = 19)
    public static final void method1903(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        if (arg4 >= -29) {
            field4284 = false;
        }
        if (class197.field2913 != null && (arg2 != 3 || class443.field6623.field599 != arg0 || class443.field6623.field628 != arg1)) {
            class283.method1804(class368.field5553, 100, class197.field2913);
            class197.field2913 = null;
        }
        field4282++;
        if (arg2 == 3 && class197.field2913 == null) {
            class197.field2913 = class196.method1361(0, arg1, true, 0, class368.field5553, arg0);
            if (class197.field2913 != null) {
                class443.field6623.field599 = arg0;
                class443.field6623.field628 = arg1;
                class443.field6623.method2844(class368.field5553, 25133);
            }
        }
        if (arg2 == 3 && class197.field2913 == null) {
            method1903(-1, -1, class443.field6623.field619, true, (byte) -90, arg5);
            return;
        }
        Container var6;
        if (class197.field2913 != null) {
            var6 = class197.field2913;
            class420.field6275 = arg1;
            class431.field6418 = arg0;
        } else if (class423.field6321 == null) {
            var6 = class368.field5553.field4170;
            class431.field6418 = var6.getSize().width;
            class420.field6275 = var6.getSize().height;
        } else {
            Insets var7 = class423.field6321.getInsets();
            int var10001 = var7.left + var7.right;
            class431.field6418 = class423.field6321.getSize().width - var10001;
            int var12 = -var7.top;
            class420.field6275 = class423.field6321.getSize().height + (var12 - var7.bottom);
            var6 = class423.field6321;
        }
        if (arg2 == 1) {
            class414.field6183 = (class431.field6418 - class25.field543) / 2;
            class77.field1297 = class347.field5193;
            class466.field6952 = class25.field543;
            class5.field127 = 0;
        } else if (class457.field6854 < 96 && class169.field2624 == 0) {
            int var8 = class431.field6418 <= 1024 ? class431.field6418 : 1024;
            class466.field6952 = var8;
            int var9 = class420.field6275 <= 768 ? class420.field6275 : 768;
            class414.field6183 = (class431.field6418 - var8) / 2;
            class5.field127 = 0;
            class77.field1297 = var9;
        } else {
            class466.field6952 = class431.field6418;
            class77.field1297 = class420.field6275;
            class414.field6183 = 0;
            class5.field127 = 0;
        }
        if (class446.field6661 != class423.field6322) {
            boolean var10000;
            if (class466.field6952 < 1024 && class77.field1297 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg3) {
            class435.method2595(0);
        } else {
            class370.field5611.setSize(class466.field6952, class77.field1297);
            class4.field109.method248(class370.field5611);
            if (class423.field6321 == var6) {
                Insets var10 = class423.field6321.getInsets();
                class370.field5611.setLocation(var10.left + class414.field6183, class5.field127 + var10.top);
            } else {
                class370.field5611.setLocation(class414.field6183, class5.field127);
            }
        }
        if (arg2 < 2) {
            class260.field3774 = false;
        } else {
            class260.field3774 = true;
        }
        if (class364.field5513 != -1) {
            class11.method76(0, true);
        }
        if (class116.field1927 != null && (class281.field4023 == 30 || class281.field4023 == 25)) {
            class474.method2839((byte) -125);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class355.field5424[var11] = true;
        }
        class455.field6788 = true;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 167)
    public final void method1904(byte arg0) {
        if (arg0 >= 17) {
            field4286++;
            this.field4280.method2638();
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I)V", line = 180)
    public class302(int arg0) {
        this.field4280 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILmq;)Lmq;", line = 190)
    public static final class350 method1905(int arg0, class350 arg1) {
        field4281++;
        if (arg1.field5297 != -1) {
            return class319.method2075(true, arg1.field5297);
        }
        int var2 = arg1.field5322 >>> 16;
        class275 var3 = new class275(class162.field2507);
        for (class352 var4 = (class352) var3.method1762(arg0 ^ arg0); var4 != null; var4 = (class352) var3.method1761(-73)) {
            if (var4.field5391 == var2) {
                return class319.method2075(true, (int) var4.field4904);
            }
        }
        return null;
    }
}
