import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class31 extends class165 {

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    private final int field368;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    private final int field371;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
    private final int field374;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "Luf;")
    public static class168 field380 = class148.method1019(-1720, ")1p");

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "Ljk;")
    public static class76 field369 = new class76();

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "Lfg;")
    public static class72 field382;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "[B")
    private byte[] field387;

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "[Lsk;")
    public static class193[] field388;

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIIFFF)V", line = 4)
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field368 = (int) (arg6 * 4096.0F);
        this.field371 = (int) (arg7 * 4096.0F);
        this.field373 = this.field374 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V", line = 16)
    public static final void method153(int arg0, int arg1) {
        field379++;
        if (arg0 == -1 || !class151.field2351[arg0]) {
            return;
        }
        class288.field4852.method1636(1, arg0);
        if (class272.field4582[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class272.field4582[arg0].length; var3++) {
            if (class272.field4582[arg0][var3] != null) {
                if (class272.field4582[arg0][var3].field4073 == 2) {
                    var2 = false;
                } else {
                    class272.field4582[arg0][var3] = null;
                }
            }
        }
        int var4 = 105 % ((46 - arg1) / 52);
        if (var2) {
            class272.field4582[arg0] = null;
        }
        class151.field2351[arg0] = false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 69)
    public final void method100(byte arg0) {
        this.field370 >>= 0x4;
        this.field373 = this.field374;
        if (this.field370 < 0) {
            this.field370 = 0;
        } else if (this.field370 > 255) {
            this.field370 = 255;
        }
        this.method154(this.field385++, (byte) this.field370);
        if (arg0 != 63) {
            this.method100((byte) -101);
        }
        this.field370 = 0;
        field381++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)V", line = 95)
    public void method154(int arg0, byte arg1) {
        this.field387[arg0] = arg1;
        field377++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V", line = 104)
    public final void method97(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            return;
        }
        field378++;
        if (arg0 == 0) {
            this.field383 = this.field368 - (arg1 >= 0 ? arg1 : -arg1);
            this.field383 = this.field383 * this.field383 >> 12;
            this.field370 = this.field383;
            this.field376 = 4096;
            return;
        }
        this.field376 = this.field383 * this.field371 >> 12;
        this.field383 = this.field368 - (arg1 >= 0 ? arg1 : -arg1);
        if (this.field376 < 0) {
            this.field376 = 0;
        } else if (this.field376 > 4096) {
            this.field376 = 4096;
        }
        this.field383 = this.field383 * this.field383 >> 12;
        this.field383 = this.field383 * this.field376 >> 12;
        this.field370 += this.field383 * this.field373 >> 12;
        this.field373 = this.field374 * this.field373 >> 12;
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V", line = 149)
    public static void method155(int arg0) {
        field380 = null;
        field388 = null;
        field382 = null;
        field369 = null;
        int var1 = -78 % ((-arg0 - 59) / 42);
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V", line = 166)
    public final void method94(int arg0) {
        this.field385 = 0;
        this.field370 = 0;
        if (arg0 != 26332) {
            this.field385 = 120;
        }
        field375++;
    }
}
