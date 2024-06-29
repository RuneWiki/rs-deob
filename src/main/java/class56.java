import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class56 extends class34 {

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    private int field818 = 585;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "[[I")
    public static int[][] field822 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "Lor;")
    public static class173 field820;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field821;
        int var3 = -93 % (-arg1 / 50);
        int[] var4 = super.field537.method1780(arg0, (byte) 73);
        if (super.field537.field4191) {
            int var5 = class284.field3856[arg0];
            for (int var6 = 0; ~var6 > ~class383.field5502; ++var6) {
                int var7 = class91.field1463[var6];
                if (this.field818 < var7 && -this.field818 + 4096 > var7 && ~(-this.field818 + 2048) > ~var5 && ~var5 > ~(2048 - -this.field818)) {
                    int var8 = -var7 + 2048;
                    int var9 = var8 < 0 ? -var8 : var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field818 + 2048);
                    var4[var6] = 4096 - var11;
                } else if (-this.field818 + 2048 < var7 && var7 < this.field818 + 2048) {
                    int var12 = var5 + -2048;
                    int var13 = var12 >= 0 ? var12 : -var12;
                    int var14 = var13 - this.field818;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (-this.field818 + 2048);
                } else if (this.field818 <= var5 && var5 <= -this.field818 + 4096) {
                    if (~this.field818 >= ~var7 && -this.field818 + 4096 >= var7) {
                        var4[var6] = 0;
                    } else {
                        int var16 = -var5 + 2048;
                        int var17 = var16 < 0 ? -var16 : var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field818 + 2048);
                        var4[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = ~var20 > -1 ? -var20 : var20;
                    int var22 = var21 - this.field818;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (-this.field818 + 2048);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)V")
    public static final void method367(boolean arg0) {
        ++field819;
        int var1 = 0;
        if (!arg0) {
            method367(true);
        }
        while (class273.field3692 > var1) {
            int var2 = class159.field2416[var1];
            class326 var3 = (class326) class281.field3826.method1592((byte) -25, (long) var2);
            if (var3 != null) {
                class209 var4 = var3.field4455;
                class292.method1691(var4.field2976.field1228, var4, 0);
            }
            ++var1;
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    public static void method368(int arg0) {
        field820 = null;
        field822 = null;
        if (arg0 >= -11) {
            method369(-62, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class56() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IB)Z")
    public static final boolean method369(int arg0, byte arg1) {
        ++field824;
        int var2 = 35 % ((-47 - arg1) / 58);
        return arg0 == 0 || arg0 == 1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field823;
        if (arg2 == 0) {
            this.field818 = arg0.method1844(-120);
        }
        if (arg1 < 16) {
            this.method69((class319) null, -76, 39);
        }
    }
}
