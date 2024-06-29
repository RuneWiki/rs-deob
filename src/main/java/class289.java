import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class289 extends class16 {

    @OriginalMember(owner = "client!a", name = "R", descriptor = "Z")
    private boolean field4554 = true;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "Z")
    private boolean field4560 = true;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field4557 = 0;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "Lvm;")
    public static class84 field4555 = new class84();

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
    public static int field4562 = 2301979;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!a", name = "W", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "Lae;")
    public static class294 field4563;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIBI)V", line = 9)
    public static final void method2029(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4564++;
        if (arg3 <= 81) {
            method2029(121, 53, 34, (byte) -17, -71);
        }
        int var5 = 0;
        int var6 = -arg2;
        int var7 = class235.method1685(arg0 + arg2, class231.field3697, class224.field3575, 117);
        int var8 = -1;
        int var9 = class235.method1685(arg0 - arg2, class231.field3697, class224.field3575, 124);
        class245.method1738(48, class310.field4841[arg4], var7, var9, arg1);
        int var10 = arg2;
        while (var10 > var5) {
            var8 += 2;
            var6 += var8;
            if (var6 > 0) {
                var10--;
                int var11 = arg4 - var10;
                int var12 = arg4 + var10;
                if (class233.field3721 <= var12 && class235.field3735 >= var11) {
                    int var13 = class235.method1685(arg0 + var5, class231.field3697, class224.field3575, 118);
                    int var14 = class235.method1685(arg0 - var5, class231.field3697, class224.field3575, 109);
                    if (class235.field3735 >= var12) {
                        class245.method1738(48, class310.field4841[var12], var13, var14, arg1);
                    }
                    if (class233.field3721 <= var11) {
                        class245.method1738(48, class310.field4841[var11], var13, var14, arg1);
                    }
                }
                var6 -= var10 << 1;
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class233.field3721 && class235.field3735 >= var15) {
                int var17 = class235.method1685(arg0 + var10, class231.field3697, class224.field3575, 126);
                int var18 = class235.method1685(arg0 - var10, class231.field3697, class224.field3575, 102);
                if (class235.field3735 >= var16) {
                    class245.method1738(48, class310.field4841[var16], var17, var18, arg1);
                }
                if (class233.field3721 <= var15) {
                    class245.method1738(48, class310.field4841[var15], var17, var18, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V", line = 84)
    public static void method2030(int arg0) {
        field4555 = null;
        if (arg0 <= -8) {
            field4563 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 150)
    public class289() {
        super(1, false);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLim;I)V", line = 103)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field4559++;
        if (arg2 == 0) {
            this.field4560 = arg1.method1399(arg0 - 1172389777) == 1;
        } else if (arg2 == 1) {
            this.field4554 = arg1.method1399(-1172389784) == 1;
        } else if (arg2 == 2) {
            this.field191 = arg1.method1399(arg0 - 1172389777) == 1;
        }
        if (arg0 != -7) {
            this.method8(false, 43);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(ZI)[I", line = 161)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        field4558++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int[] var4 = this.method103(0, 4389, this.field4554 ? class240.field3798 - arg1 : arg1);
            if (this.field4560) {
                for (int var5 = 0; var5 < class276.field4376; var5++) {
                    var3[var5] = var4[class148.field2215 - var5];
                }
            } else {
                class213.method1554(var4, 0, var3, 0, class276.field4376);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)[[I", line = 206)
    public final int[][] method54(int arg0, byte arg1) {
        int[][] var3 = this.field197.method715(true, arg0);
        if (this.field197.field1548) {
            int[][] var4 = this.method111(0, (byte) 122, this.field4554 ? class240.field3798 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (this.field4560) {
                for (int var11 = 0; var11 < class276.field4376; var11++) {
                    var7[var11] = var5[class148.field2215 - var11];
                    var10[var11] = var6[class148.field2215 - var11];
                    var9[var11] = var8[class148.field2215 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class276.field4376; var12++) {
                    var7[var12] = var5[var12];
                    var10[var12] = var6[var12];
                    var9[var12] = var8[var12];
                }
            }
        }
        int var13 = 5 % ((40 - arg1) / 41);
        field4556++;
        return var3;
    }
}
