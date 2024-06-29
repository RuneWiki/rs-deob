import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class81 extends class214 {

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "I")
    private int field1170 = 1;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
    private int field1168 = 0;

    @OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
    private int field1174 = 0;

    @OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
    public static int field1173 = 0;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "[Lvp;")
    public static class559[] field1166;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 >= 92) {
            ++field1172;
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (arg2 == 3) {
                        this.field1170 = arg1.method1987(-8);
                    }
                } else {
                    this.field1168 = arg1.method1987(-54);
                }
            } else {
                this.field1174 = arg1.method1987(-41);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
    public final void method65(int arg0) {
        ++field1165;
        if (arg0 >= 48) {
            class465.method2853(256);
        }
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(B)V")
    public static void method722(byte arg0) {
        if (arg0 != 58) {
            method723(false);
        }
        field1166 = null;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
    public class81() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V")
    public static final void method723(boolean arg0) {
        class355.field5377 = -1;
        class377.field5674 = 1;
        ++field1169;
        long var1 = 0L;
        if (class658.field9375 == null) {
            class129.method1045(123, 35);
        } else {
            class301 var3 = new class301(class554.method3232(class143.method1110(class658.field9375, false), true));
            long var4 = var3.method1928(10185);
            class395.field5902 = var3.method1928(10185);
            class723.method3986((byte) -88, class77.method694(var4, (byte) -105), "", arg0);
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(Z)Lnfa;")
    public static final class225 method724(boolean arg0) {
        ++field1175;
        if (~class319.field4747 > ~class94.field1406.length) {
            return class94.field1406[class319.field4747++];
        } else {
            if (arg0) {
                field1166 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field1171;
        if (arg1 != 5) {
            field1173 = -92;
        }
        int[] var3 = super.field3544.method3869(arg0, -128);
        if (super.field3544.field9836) {
            int var4 = class131.field2138[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class626.field8787 < ~var6; ++var6) {
                int var7 = class592.field8328[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field1174 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field1170 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field1170;
                }
                int var12 = var11 - (-4096 & var11);
                if (~this.field1168 == -1) {
                    var12 = class55.field885[255 & var12 >> 4] + 4096 >> 1;
                } else if (this.field1168 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
