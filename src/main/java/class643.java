import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class643 {

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "[I")
    public int[] field9151 = new int[3];

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "[I")
    public int[] field9150 = new int[3];

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "[I")
    public int[] field9144 = new int[2];

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "[I")
    public int[] field9148 = new int[2];

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "[S")
    public short[] field9149;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "[S")
    public short[] field9146;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "[I")
    public static int[] field9145 = new int[256];

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "Lin;")
    public static class380 field9152;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public static int field9147;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field9145[var0] = var1;
        }
        field9152 = new class380(15, -1);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 8)
    public static void method3647(int arg0) {
        field9152 = null;
        field9145 = null;
        if (arg0 != 30094) {
            field9152 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILha;IIIB)V", line = 19)
    public static final void method3648(int arg0, class475 arg1, int arg2, int arg3, int arg4, byte arg5) {
        field9147++;
        class390.field5440 = arg1;
        class276.field3994 = class390.field5440.method463();
        class193.field2894 = class390.field5440.method463();
        if (arg5 > -45) {
            return;
        }
        class775.field10665 = class390.field5440.method463();
        class621.field8770 = arg2;
        class728.field10154 = null;
        class790.field10813 = arg4;
        class388.field5420 = 0;
        class770.field10633 = null;
        class747.method4115(arg3, arg0, -5321);
        class163.field2508 = -1;
        class100.field1484 = -1;
        class133.field2226 = -1;
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lts;)V", line = 47)
    public class643(class42 arg0) {
        this.field9150[1] = arg0.field573;
        this.field9150[2] = arg0.field534;
        this.field9150[0] = arg0.field550;
        this.field9151[2] = arg0.field517;
        this.field9151[0] = arg0.field515;
        this.field9151[1] = arg0.field514;
        this.field9148[1] = arg0.field526;
        this.field9148[0] = arg0.field512;
        this.field9144[1] = arg0.field532;
        this.field9144[0] = arg0.field519;
        if (arg0.field555 != null) {
            this.field9149 = new short[arg0.field555.length];
            class171.method1266(arg0.field555, 0, this.field9149, 0, this.field9149.length);
        }
        if (arg0.field540 != null) {
            this.field9146 = new short[arg0.field540.length];
            class171.method1266(arg0.field540, 0, this.field9146, 0, this.field9146.length);
        }
    }
}
