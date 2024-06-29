import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class556 extends class561 {

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
    private int field7772;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field7774 = 0;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "Luv;")
    public static class3 field7771 = new class3(48, 1);

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "Lbv;")
    public static class568 field7781 = new class568();

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "[Lh;")
    public class458[] field7779;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "[[B")
    private byte[][] field7775;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public static void method3112(byte arg0) {
        if (arg0 == -64) {
            field7781 = null;
            field7771 = null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)Z")
    public final boolean method3113(int arg0, int arg1) {
        if (arg1 == 25971) {
            field7770++;
            return this.field7779[arg0].field6537;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)Z")
    public final boolean method3114(int arg0, int arg1) {
        if (arg1 == 0) {
            field7777++;
            return this.field7779[arg0].field6539;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)I")
    public static final int method3115(int arg0, byte arg1) {
        if (arg1 != 109) {
            field7774 = -103;
        }
        field7780++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)Z")
    public final boolean method3116(int arg0, int arg1) {
        field7776++;
        if (arg0 != -28624) {
            field7774 = -94;
        }
        return this.field7779[arg1].field6540;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZI)V")
    public static final void method3117(int arg0, boolean arg1, int arg2) {
        field7778++;
        class164 var3 = class130.method695(arg1, arg0, Integer.MIN_VALUE);
        if (var3 != null) {
            var3.method589(arg2 ^ 0x541A);
            if (arg2 != -30390) {
                method3112((byte) -59);
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(I)V")
    public class556(int arg0) {
        this.field7772 = arg0;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)Z")
    public final boolean method3118(int arg0) {
        field7773++;
        if (this.field7779 != null) {
            return true;
        }
        if (this.field7775 == null) {
            if (!class401.field5486.method2055((byte) -102, this.field7772)) {
                return false;
            }
            int[] var2 = class401.field5486.method2068(0, this.field7772);
            this.field7775 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field7775[var3] = class401.field5486.method2054(true, this.field7772, var2[var3]);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field7775.length; var5++) {
            byte[] var15 = this.field7775[var5];
            class551 var16 = new class551(var15);
            var16.field7707 = 1;
            int var17 = var16.method3090(-98);
            var4 &= class179.field2312.method2042((byte) -80, var17);
        }
        if (!var4) {
            return false;
        }
        class568 var6 = new class568();
        int var7 = class401.field5486.method2064(0, this.field7772);
        this.field7779 = new class458[var7];
        int[] var8 = class401.field5486.method2068(0, this.field7772);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field7775[var9];
            class551 var11 = new class551(var10);
            var11.field7707 = 1;
            int var12 = var11.method3090(-83);
            class82 var13 = null;
            for (class82 var14 = (class82) var6.method3188((byte) -100); var14 != null; var14 = (class82) var6.method3182((byte) -17)) {
                if (var14.field1109 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class82(var12, class179.field2312.method2076(1, var12));
                var6.method3181(var13, true);
            }
            this.field7779[var8[var9]] = new class458(var10, var13);
        }
        this.field7775 = null;
        if (arg0 <= 105) {
            return false;
        } else {
            return true;
        }
    }
}
