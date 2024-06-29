import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class438 {

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "[Ltca;")
    public class184[] field6162 = null;

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "Lsk;")
    public class650 field6163 = null;

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "Lsk;")
    public class650 field6166 = null;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "[Ltca;")
    public class184[] field6169 = null;

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "Lsk;")
    public class650 field6171 = null;

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "Z")
    public boolean field6164;

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "[B")
    public static byte[] field6168 = new byte[32896];

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZJ)V")
    public static final void method2636(boolean arg0, long arg1) {
        field6165++;
        if (arg1 <= 0L || !arg0) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class37.method264(arg1 - 1L, 111);
            class37.method264(1L, -125);
        } else {
            class37.method264(arg1, -117);
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
    public static void method2637(int arg0) {
        int var1 = -58 / ((arg0 + 70) / 55);
        field6168 = null;
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)I")
    public static final int method2638(int arg0) {
        if (arg0 != 13363) {
            field6168 = null;
        }
        field6167++;
        return class209.field2778.method4266((byte) -100);
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Ldia;)V")
    public class438(class246 arg0) {
        this.field6164 = arg0.field3589;
        class720.method4021((byte) -116, arg0);
        if (this.field6164) {
            byte[] var2 = class113.method846(class72.field1012, false, 16);
            this.field6166 = new class650(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class113.method846(class705.field9892, false, 16);
            this.field6163 = new class650(arg0, 6410, 128, 128, 16, var3, 6410);
            class742 var4 = arg0.field3530;
            if (var4.method4105((byte) 36)) {
                byte[] var5 = class113.method846(class80.field1144, false, 16);
                this.field6171 = new class650(arg0, 6408, 128, 128, 16);
                class650 var6 = new class650(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method4107((byte) -85, 2.0F, this.field6171, var6)) {
                    this.field6171.method55((byte) 105);
                } else {
                    this.field6171.method47(109);
                    this.field6171 = null;
                }
                var6.method47(93);
                return;
            }
        } else {
            this.field6169 = new class184[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class301.method1902((byte) 85, 32768, var7 * 128 * 256, class72.field1012);
                this.field6169[var7] = new class184(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field6162 = new class184[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class301.method1902((byte) 95, 32768, var8 * 2 * 16384, class705.field9892);
                this.field6162[var8] = new class184(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field6168[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
