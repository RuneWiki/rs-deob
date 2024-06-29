import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class318 extends class614 {

    @OriginalMember(owner = "client!paa", name = "I", descriptor = "Z")
    public static boolean field4752;

    @OriginalMember(owner = "client!paa", name = "H", descriptor = "B")
    public byte field4751;

    @OriginalMember(owner = "client!paa", name = "D", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!paa", name = "E", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!paa", name = "F", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!paa", name = "J", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!paa", name = "K", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!paa", name = "C", descriptor = "Lps;")
    public class428 field4746;

    @OriginalMember(owner = "client!paa", name = "G", descriptor = "[I")
    public static int[] field4750;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)I")
    public final int method1997(byte arg0) {
        ++field4754;
        if (this.field4746 == null) {
            return 0;
        } else {
            int var2 = 122 % ((32 - arg0) / 53);
            return this.field4746.field6221 * 100 / (this.field4746.field6162.length - this.field4751);
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(III)V")
    public static final void method1998(int arg0, int arg1, int arg2) {
        ++field4747;
        int var3 = class511.field7585.method1053((byte) 13, class88.field1126.method2953(3181, class77.field889));
        for (class548 var4 = (class548) class272.field4014.method2496((byte) 117); var4 != null; var4 = (class548) class272.field4014.method2494(arg2 + 89)) {
            int var8 = class111.method660(var4, -7775);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class487.field7385 * arg2 + 21;
        int var6 = -(var3 / 2) + arg1;
        if (~(var3 + var6) < ~class522.field7735) {
            var6 = -var3 + class522.field7735;
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg0;
        if (~class337.field4944 > ~(var5 + arg0)) {
            var7 = -var5 + class337.field4944;
        }
        class290.field4257 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class218.field3232 = var7;
        class475.field7252 = (class455.field6636 ? 26 : 22) + class487.field7385 * 16;
        class139.field1826 = true;
        class452.field6607 = var3;
    }

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "(I)[B")
    public final byte[] method1999(int arg0) {
        ++field4748;
        if (arg0 != -8820) {
            this.field4751 = -62;
        }
        if (!super.field9003 && ~(this.field4746.field6162.length + -this.field4751) >= ~this.field4746.field6221) {
            return this.field4746.field6162;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(B)V")
    public static void method2000(byte arg0) {
        if (arg0 == 117) {
            field4750 = null;
        }
    }

    static {
        new class487("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field4752 = false;
    }
}
