import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class66 {

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    private int field873 = class370.method2407(16);

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    private int field870 = class370.method2407(24);

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    private int field868 = class370.method2407(24);

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    private int field869 = class370.method2407(24) + 1;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    private int field867 = class370.method2407(6) + 1;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    private int field872 = class370.method2407(8);

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "[I")
    private int[] field871;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([FIZ)V", line = 5)
    public final void method447(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class370.field5359[this.field872].field2331;
        int var6 = this.field868 - this.field870;
        int var7 = var6 / this.field869;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class370.field5359[this.field872].method1076();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field867;
                        }
                        var11 /= this.field867;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field871[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field869 * var10 + this.field870;
                        class175 var17 = class370.field5359[var15];
                        if (this.field873 == 0) {
                            int var18 = this.field869 / var17.field2331;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1074();
                                for (int var21 = 0; var21 < var17.field2331; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field869) {
                                float[] var23 = var17.method1074();
                                for (int var24 = 0; var24 < var17.field2331; var24++) {
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

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V", line = 133)
    public class66() {
        int[] var1 = new int[this.field867];
        for (int var2 = 0; var2 < this.field867; var2++) {
            int var4 = 0;
            int var5 = class370.method2407(3);
            boolean var6 = class370.method2402() != 0;
            if (var6) {
                var4 = class370.method2407(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field871 = new int[this.field867 * 8];
        for (int var3 = 0; var3 < this.field867 * 8; var3++) {
            this.field871[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class370.method2407(8);
        }
    }
}
