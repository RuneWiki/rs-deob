import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class175 extends class326 {

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    private int field2386 = 1;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    private int field2383 = 204;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    private int field2391 = 1;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Lmc;")
    public static class78 field2387 = new class78(5, 7);

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    public static int field2392 = 0;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "Lio;")
    public static class277 field2385;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "[I")
    public static int[] field2390;

    static {
        new class206("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[I", line = 8)
    public final int[] method30(byte arg0, int arg1) {
        ++field2388;
        int[] var3 = super.field4344.method130(arg1, -118);
        if (super.field4344.field286) {
            for (int var4 = 0; class181.field2495 > var4; ++var4) {
                int var5 = class389.field5375[var4];
                int var6 = class95.field1400[arg1];
                int var7 = this.field2386 * var5 >> 12;
                int var8 = this.field2391 * var6 >> 12;
                int var9 = var5 % (4096 / this.field2386) * this.field2386;
                int var10 = var6 % (4096 / this.field2391) * this.field2391;
                if (var10 < this.field2383) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field2383 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field2383) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg0 >= -6) {
            this.method30((byte) -16, 82);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 96)
    public class175() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)V", line = 113)
    public static final void method1007(boolean arg0, int arg1) {
        class222.field2959 = -1;
        ++field2382;
        class304.field4034 = -1;
        class370.field5065 = arg1;
        class346.method2132(0);
        if (!arg0) {
            method1007(false, -50);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILbt;I)V", line = 127)
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field2384;
        if (arg2 > -3) {
            this.method33(-75, (class32) null, -87);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2383 = arg1.method215((byte) 93);
                }
            } else {
                this.field2391 = arg1.method201((byte) -127);
            }
        } else {
            this.field2386 = arg1.method201((byte) -115);
        }
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V", line = 173)
    public static void method1008(int arg0) {
        field2390 = null;
        field2385 = null;
        field2387 = null;
        if (arg0 != 4096) {
            field2389 = 16;
        }
    }
}
