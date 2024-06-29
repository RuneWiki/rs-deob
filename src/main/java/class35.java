import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class35 extends class182 {

    @OriginalMember(owner = "client!g", name = "O", descriptor = "[I")
    public static int[] field550 = new int[100];

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static volatile int field554 = 0;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        ++field551;
        int[][] var3 = super.field2905.method50(arg1, (byte) 111);
        int var4 = -1 / ((-64 - arg0) / 49);
        if (super.field2905.field158) {
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            for (int var8 = 0; class4.field116 > var8; ++var8) {
                var7[var8] = this.field556;
                var6[var8] = this.field558;
                var5[var8] = this.field552;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V")
    private class35(int arg0) {
        super(0, false);
        this.method218(-1709374108, arg0);
    }

    @OriginalMember(owner = "client!g", name = "j", descriptor = "(I)Lnj;")
    public static final class206 method217(int arg0) {
        ++field557;
        if (class148.field2439 == null) {
            return null;
        } else {
            for (class206 var1 = (class206) class149.field2469.method1946((byte) -120); var1 != null; var1 = (class206) class149.field2469.method1946((byte) 85)) {
                class195 var2 = class22.method146((byte) -44, var1.field3327);
                if (var2 != null && var2.field3126 && var2.method1395(29435)) {
                    return var1;
                }
            }
            if (arg0 != 0) {
                return null;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class35() {
        this(0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    private final void method218(int arg0, int arg1) {
        this.field558 = arg1 >> 4 & 4080;
        if (arg0 == -1709374108) {
            ++field555;
            this.field552 = 4080 & arg1 << 4;
            this.field556 = (16711680 & arg1) >> 12;
        }
    }

    @OriginalMember(owner = "client!g", name = "k", descriptor = "(I)V")
    public static void method219(int arg0) {
        field550 = null;
        if (arg0 != 2) {
            method217(107);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (!arg0) {
            ++field553;
            if (arg2 == 0) {
                this.method218(-1709374108, arg1.method1812((byte) 52));
            }
        }
    }
}
