import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class133 implements class59 {

    @OriginalMember(owner = "client!su", name = "c", descriptor = "Lul;")
    private class386 field1686 = new class386(256);

    @OriginalMember(owner = "client!su", name = "f", descriptor = "Lhe;")
    private class239 field1689;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "Lhe;")
    private class239 field1690;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "[Lop;")
    private class118[] field1693;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IZ)Lop;", line = 6)
    public final class118 method432(int arg0, boolean arg1) {
        field1691++;
        return arg1 ? this.field1693[arg0] : null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(FIZIBI)[I", line = 19)
    public final int[] method430(float arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        field1688++;
        return arg4 == -21 ? this.method730(arg5, true).method2950(arg1, this.field1690, this, this.field1693[arg5].field1531, (double) arg0, arg3, (byte) -40) : null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)Z", line = 34)
    public final boolean method428(int arg0, int arg1) {
        if (arg0 != -14471) {
            this.field1693 = null;
        }
        field1692++;
        class491 var3 = this.method730(arg1, true);
        return var3 != null && var3.method2952(this, -1, this.field1690);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IZIFII)[F", line = 48)
    public final float[] method431(int arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5) {
        if (arg4 < 87) {
            this.method431(74, true, -15, -2.2080717F, -20, 71);
        }
        field1687++;
        return this.method730(arg0, true).method2953(this.field1690, this, arg5, arg2, 0, this.field1693[arg0].field1531);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZFII)[I", line = 59)
    public final int[] method429(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        if (arg4 == -2472) {
            field1685++;
            return this.method730(arg0, true).method2948(arg5, arg4 + 2541, arg2, this.field1693[arg0].field1531, (double) arg3, this, this.field1690, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(IZ)Lcm;", line = 70)
    private final class491 method730(int arg0, boolean arg1) {
        field1684++;
        class96 var3 = this.field1686.method2322(false, (long) arg0);
        if (var3 != null) {
            return (class491) var3;
        }
        byte[] var4 = this.field1689.method1465(0, arg0);
        if (var4 == null) {
            return null;
        }
        class491 var5 = new class491(new class156(var4));
        this.field1686.method2320(var5, (long) arg0, 2592);
        if (!arg1) {
            this.field1689 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(III)Lab;", line = 97)
    public static final class455 method731(int arg0, int arg1, int arg2) {
        class468 var3 = class358.field5312[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6777;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lhe;Lhe;Lhe;)V", line = 112)
    public class133(class239 arg0, class239 arg1, class239 arg2) {
        this.field1689 = arg1;
        this.field1690 = arg2;
        class156 var4 = new class156(arg0.method1470(4, 0, 0));
        int var5 = var4.method993((byte) -63);
        this.field1693 = new class118[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method941((byte) 127) == 1) {
                this.field1693[var6] = new class118();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1693[var7] != null) {
                this.field1693[var7].field1543 = var4.method941((byte) 124) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1693[var8] != null) {
                this.field1693[var8].field1523 = var4.method941((byte) 124) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1693[var9] != null) {
                this.field1693[var9].field1524 = var4.method941((byte) 123) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1693[var10] != null) {
                this.field1693[var10].field1544 = var4.method941((byte) 126) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1693[var11] != null) {
                this.field1693[var11].field1542 = var4.method946(51);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1693[var12] != null) {
                this.field1693[var12].field1541 = var4.method946(105);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1693[var13] != null) {
                this.field1693[var13].field1540 = var4.method946(67);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1693[var14] != null) {
                this.field1693[var14].field1530 = var4.method946(80);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1693[var15] != null) {
                this.field1693[var15].field1532 = (short) var4.method993((byte) -123);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field1693[var16] != null) {
                this.field1693[var16].field1534 = var4.method946(45);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field1693[var17] != null) {
                this.field1693[var17].field1528 = var4.method946(32);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field1693[var18] != null) {
                this.field1693[var18].field1545 = var4.method941((byte) 123) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field1693[var19] != null) {
                this.field1693[var19].field1531 = var4.method941((byte) 123) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field1693[var20] != null) {
                this.field1693[var20].field1537 = var4.method946(124);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field1693[var21] != null) {
                this.field1693[var21].field1539 = var4.method941((byte) 126) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field1693[var22] != null) {
                this.field1693[var22].field1529 = var4.method941((byte) 125) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field1693[var23] != null) {
                this.field1693[var23].field1536 = var4.method941((byte) 126) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field1693[var24] != null) {
                this.field1693[var24].field1525 = var4.method941((byte) 125);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field1693[var25] != null) {
                this.field1693[var25].field1538 = var4.method950(186);
            }
        }
    }
}
