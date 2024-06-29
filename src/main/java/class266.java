import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class266 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    private int field4661 = class220.method1541(16);

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    private int field4664 = class220.method1541(24);

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    private int field4660 = class220.method1541(24);

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    private int field4665 = class220.method1541(24) + 1;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    private int field4662 = class220.method1541(6) + 1;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    private int field4666 = class220.method1541(8);

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[I")
    private int[] field4663;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([FIZ)V")
    public final void method1788(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class220.field3794[this.field4666].field2136;
        int var6 = this.field4660 - this.field4664;
        int var7 = var6 / this.field4665;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class220.field3794[this.field4666].method910();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4662;
                        }
                        var11 /= this.field4662;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4663[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4665 * var10 + this.field4664;
                        class128 var17 = class220.field3794[var15];
                        if (this.field4661 == 0) {
                            int var18 = this.field4665 / var17.field2136;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method912();
                                for (int var21 = 0; var21 < var17.field2136; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4665) {
                                float[] var23 = var17.method912();
                                for (int var24 = 0; var24 < var17.field2136; var24++) {
                                    arg0[var16 + var22] += var23[var24];
                                    var22++;
                                }
                            }
                        }
                    }
                    var10++;
                    if (var10 >= var7) {
                        break;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class266() {
        int[] var1 = new int[this.field4662];
        for (int var2 = 0; var2 < this.field4662; var2++) {
            int var4 = 0;
            int var5 = class220.method1541(3);
            boolean var6 = class220.method1536() != 0;
            if (var6) {
                var4 = class220.method1541(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4663 = new int[this.field4662 * 8];
        for (int var3 = 0; var3 < this.field4662 * 8; var3++) {
            this.field4663[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class220.method1541(8);
        }
    }
}
