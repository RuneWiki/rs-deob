import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class78 extends class14 {

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    private int field1174 = 1;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    private int field1167 = 204;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    private int field1172 = 1;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "Lcu;")
    public static class145 field1166 = new class145(63, 3);

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field1175 = 0;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "Lff;")
    public static class9 field1170 = new class9(102, 6);

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "Lff;")
    public static class9 field1176 = new class9(67, 8);

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "Ljq;")
    public static class354 field1169;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field1173;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 > -2) {
            method493(67);
        }
        if (super.field270.field5222) {
            for (int var4 = 0; ~class115.field1637 < ~var4; ++var4) {
                int var5 = class195.field2715[var4];
                int var6 = class273.field3590[arg0];
                int var7 = this.field1174 * var5 >> 12;
                int var8 = this.field1172 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1174) * this.field1174;
                int var10 = var6 % (4096 / this.field1172) * this.field1172;
                if (var10 < this.field1167) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field1167) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field1167 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class78() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = 33 % ((-51 - arg1) / 37);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field1167 = arg2.method2212((byte) 83);
                }
            } else {
                this.field1172 = arg2.method2238(255);
            }
        } else {
            this.field1174 = arg2.method2238(255);
        }
        ++field1168;
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)V")
    public static void method493(int arg0) {
        field1169 = null;
        field1170 = null;
        field1166 = null;
        field1176 = null;
        if (arg0 != 13987) {
            field1170 = null;
        }
    }
}
