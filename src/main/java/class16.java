import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class16 extends class64 {

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
    private int field346 = 1;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    private int field341 = 204;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    private int field350 = 1;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public static volatile int field344 = 0;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "Lcd;")
    public static class23 field343 = class54.method414(":", -1);

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "[I")
    public static int[] field348;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "[[B")
    public static byte[][] field340;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLkh;ZLkh;)V")
    public static final void method84(byte arg0, class97 arg1, boolean arg2, class97 arg3) {
        if (arg0 <= -13) {
            class89.field1913 = arg1;
            ++field349;
            class190.field3772 = arg3;
            class88.field1884 = arg2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field341 = arg2.method1197(-1);
                }
            } else {
                this.field346 = arg2.method1202(118);
            }
        } else {
            this.field350 = arg2.method1202(126);
        }
        int var5 = -124 % ((7 - arg0) / 43);
        ++field342;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != -9421) {
            this.field341 = -88;
        }
        ++field351;
        int[] var3 = super.field1513.method1033(-63, arg0);
        if (super.field1513.field3368) {
            for (int var4 = 0; class168.field3367 > var4; ++var4) {
                int var5 = class95.field1995[arg0];
                int var6 = class174.field3475[var4];
                int var7 = this.field350 * var6 >> 12;
                int var8 = var5 % (4096 / this.field346) * this.field346;
                int var9 = var6 % (4096 / this.field350) * this.field350;
                int var10 = this.field346 * var5 >> 12;
                if (this.field341 > var8) {
                    for (var7 -= var10; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field341 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field341) {
                    int var11;
                    for (var11 = var7 - var10; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
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

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Lqh;")
    public static final class151 method85(byte arg0, int arg1) {
        ++field345;
        class151 var2 = (class151) class143.field2929.method995(-105, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class191.field3796.method651(4, arg1, 14);
            class151 var4 = new class151();
            if (var3 != null) {
                var4.method935(-21131, new class189(var3));
            }
            if (arg0 <= 99) {
                field343 = null;
            }
            class143.field2929.method990(var4, (long) arg1, -115);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
    public static void method86(int arg0) {
        if (arg0 == -1) {
            field343 = null;
            field340 = null;
            field348 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class16() {
        super(0, true);
    }
}
