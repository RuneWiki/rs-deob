import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class572 extends class539 {

    @OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
    public int field7699 = 0;

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "Lsu;")
    public static class192 field7692 = new class192();

    @OriginalMember(owner = "client!oo", name = "P", descriptor = "[I")
    public static int[] field7710 = new int[32];

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public int field7681;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public int field7685;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public int field7686;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
    public int field7688;

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
    public int field7691;

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
    public int field7693;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
    public int field7694;

    @OriginalMember(owner = "client!oo", name = "B", descriptor = "I")
    public int field7696;

    @OriginalMember(owner = "client!oo", name = "C", descriptor = "I")
    public int field7697;

    @OriginalMember(owner = "client!oo", name = "D", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!oo", name = "G", descriptor = "I")
    public int field7701;

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
    public int field7708;

    @OriginalMember(owner = "client!oo", name = "Q", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "Lju;")
    public class111 field7687;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "Lju;")
    public class111 field7705;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "Lkw;")
    public class225 field7690;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "Luea;")
    public class286 field7706;

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "Lji;")
    public class559 field7702;

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "Lji;")
    public class559 field7704;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "Lqr;")
    public class59 field7684;

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "Lqr;")
    public class59 field7703;

    @OriginalMember(owner = "client!oo", name = "A", descriptor = "Llt;")
    public class620 field7695;

    @OriginalMember(owner = "client!oo", name = "F", descriptor = "Z")
    public boolean field7700;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "Z")
    public boolean field7707;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "Z")
    public boolean field7709;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "[I")
    public int[] field7683;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I[Ljava/lang/Object;[III)V", line = 6)
    public static final void method3148(int arg0, Object[] arg1, int[] arg2, int arg3, int arg4) {
        field7682++;
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if ((var10 & var9) + var7 > arg2[var10]) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method3148(arg0, arg1, arg2, arg3, var6 - 1);
            method3148(arg0, arg1, arg2, var6 + 1, arg4);
        }
        if (arg0 != 10796) {
            method3151(false);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 62)
    public static final void method3149(int arg0) {
        if (arg0 > -84) {
            return;
        }
        for (int var1 = 0; var1 < class246.field3501.length; var1++) {
            for (int var2 = 0; var2 < class246.field3501[0].length; var2++) {
                for (int var3 = 0; var3 < class246.field3501[0][0].length; var3++) {
                    class246.field3501[var1][var2][var3] = 0;
                }
            }
        }
        field7698++;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V", line = 104)
    public final void method3150(int arg0) {
        field7689++;
        int var2 = this.field7688;
        if (arg0 != 19486) {
            return;
        }
        boolean var3 = this.field7707;
        if (this.field7695 != null) {
            class620 var4 = this.field7695.method3450(-108, class195.field2888);
            if (var4 == null) {
                this.field7683 = null;
                this.field7694 = 0;
                this.field7688 = -1;
                this.field7696 = 0;
                this.field7709 = false;
                this.field7707 = false;
                this.field7686 = 0;
                this.field7697 = 0;
            } else {
                this.field7686 = var4.field8640 << 9;
                this.field7697 = var4.field8629;
                this.field7688 = var4.field8569;
                this.field7709 = var4.field8631;
                this.field7696 = var4.field8620;
                this.field7707 = var4.field8607;
                this.field7694 = var4.field8622;
                this.field7683 = var4.field8611;
            }
        } else if (this.field7690 != null) {
            int var5 = class449.method2578(false, this.field7690);
            if (var2 != var5) {
                this.field7688 = var5;
                class161 var6 = this.field7690.field3245;
                if (var6.field2409 != null) {
                    var6 = var6.method1114(class195.field2888, arg0 ^ 0x4C1E);
                }
                if (var6 == null) {
                    this.field7696 = this.field7686 = 0;
                    this.field7707 = this.field7690.field3245.field2454;
                } else {
                    this.field7686 = var6.field2423 << 9;
                    this.field7696 = var6.field2461;
                    this.field7707 = var6.field2454;
                }
            }
        } else if (this.field7706 != null) {
            this.field7688 = class442.method2537(arg0 ^ 0x4C1E, this.field7706);
            this.field7707 = this.field7706.field3950;
            this.field7696 = this.field7706.field3956;
            this.field7686 = this.field7706.field3979 << 9;
        }
        if (this.field7688 == var2 && this.field7707 == var3) {
            return;
        }
        if (this.field7702 == null) {
            return;
        }
        class135.field1907.method3309(this.field7702);
        this.field7703 = null;
        this.field7702 = null;
        this.field7687 = null;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(Z)V", line = 206)
    public static void method3151(boolean arg0) {
        field7710 = null;
        if (!arg0) {
            field7692 = null;
        }
        field7692 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "()V", line = 232)
    public static final void method3152() {
        for (int var0 = 0; var0 < class589.field8211; var0++) {
            class39 var1 = class376.field5329[var0];
            class321.method1956(var1);
            class376.field5329[var0] = null;
        }
        class589.field8211 = 0;
    }
}
