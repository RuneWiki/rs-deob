import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 extends class166 {

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    private int field417 = 1;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    private int field418 = 1;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    private int field424 = 204;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "Lhj;")
    public static class69 field419 = class181.method1318("Benutzeroberfl-=che geladen)3", (byte) -116);

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Lak;")
    public static class134 field421;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "Loc;")
    public static class59 field425;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)V")
    public static final void method164(byte arg0) {
        try {
            if (class34.field473 == null) {
                class34.field473 = new class148(class36.field508, class9.method42(60, new class69[] { class63.method415(17694), class221.field3976 }).method477((byte) -57));
            }
            if (arg0 >= -109) {
                method165((byte) 104);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class34.field473 = null;
        }
        ++field420;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class29() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V")
    public static void method165(byte arg0) {
        field421 = null;
        field425 = null;
        if (arg0 != 123) {
            field419 = null;
        }
        field419 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field423;
        if (arg0 == 96) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        this.field424 = arg1.method912(121);
                    }
                } else {
                    this.field418 = arg1.method937(false);
                }
            } else {
                this.field417 = arg1.method937(false);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field422;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (arg1 != 8388607) {
            return null;
        } else {
            if (super.field3071.field3142) {
                for (int var4 = 0; class253.field4565 > var4; ++var4) {
                    int var5 = class13.field187[arg0];
                    int var6 = class24.field347[var4];
                    int var7 = this.field417 * var6 >> 12;
                    int var8 = this.field418 * var5 >> 12;
                    int var9 = var6 % (4096 / this.field417) * this.field417;
                    int var10 = var5 % (4096 / this.field418) * this.field418;
                    if (var10 < this.field424) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (~var7 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (var9 < this.field424) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (var9 < this.field424) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
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
    }
}
