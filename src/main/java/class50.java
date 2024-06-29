import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class50 {

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    private int field765 = -1;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    private int field766 = 0;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lvc;")
    private class129 field767 = new class129();

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "Z")
    public boolean field775 = false;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    private int field771;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "[Luc;")
    private class14[] field770;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[[[I")
    private int[][][] field774;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "[S")
    public static short[] field769 = new short[256];

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "D")
    public static double field762 = -1.0D;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lwa;")
    public static class264 field761 = new class264();

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field777 = 1;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Lce;")
    public static class126 field779 = class206.method1445(-7923, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field778 = 7759444;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "Lce;")
    public static class126 field781 = class206.method1445(-7923, "voudrait faire un -Bchange avec vous)3");

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "S")
    public static short field780 = 1;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)[[[I", line = 11)
    public final int[][][] method316(int arg0) {
        field760++;
        if (this.field771 != this.field763) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field771; var2++) {
            this.field770[var2] = class234.field3955;
        }
        int var3 = 72 / ((3 - arg0) / 53);
        return this.field774;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 31)
    public final void method317(int arg0) {
        if (arg0 != 1) {
            return;
        }
        for (int var2 = 0; var2 < this.field771; var2++) {
            this.field774[var2][0] = null;
            this.field774[var2][1] = null;
            this.field774[var2][2] = null;
            this.field774[var2] = (int[][]) null;
        }
        this.field770 = null;
        field776++;
        this.field774 = (int[][][]) null;
        this.field767.method905((byte) 115);
        this.field767 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(III)V", line = 240)
    public class50(int arg0, int arg1, int arg2) {
        this.field771 = arg0;
        this.field763 = arg1;
        this.field770 = new class14[this.field763];
        this.field774 = new int[this.field771][3][arg2];
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V", line = 67)
    public static void method318(int arg0) {
        field779 = null;
        field769 = null;
        field761 = null;
        field781 = null;
        if (arg0 != 1) {
            field764 = -76;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[[I", line = 85)
    public final int[][] method319(int arg0, int arg1) {
        field773++;
        int var3 = 76 % ((5 - arg0) / 45);
        if (this.field771 == this.field763) {
            this.field775 = this.field770[arg1] == null;
            this.field770[arg1] = class234.field3955;
            return this.field774[arg1];
        } else if (this.field771 == 1) {
            this.field775 = this.field765 != arg1;
            this.field765 = arg1;
            return this.field774[0];
        } else {
            class14 var4 = this.field770[arg1];
            if (var4 == null) {
                this.field775 = true;
                if (this.field771 <= this.field766) {
                    class14 var5 = (class14) this.field767.method904(-31);
                    var4 = new class14(arg1, var5.field188);
                    this.field770[var5.field186] = null;
                    var5.method499((byte) 64);
                } else {
                    var4 = new class14(arg1, this.field766);
                    this.field766++;
                }
                this.field770[arg1] = var4;
            } else {
                this.field775 = false;
            }
            this.field767.method897(0, var4);
            return this.field774[var4.field188];
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lt;I)V", line = 159)
    public static final void method320(class289 arg0, int arg1) {
        field768++;
        class63.field1068 = arg0;
        if (arg1 >= -79) {
            method320((class289) null, -115);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZZIBI)V", line = 178)
    public static final void method321(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        int var7 = 56 % ((51 - arg5) / 57);
        if (arg4 > arg0) {
            int var8 = (arg0 + arg4) / 2;
            int var9 = arg0;
            class88 var10 = class140.field2552[var8];
            class140.field2552[var8] = class140.field2552[arg4];
            class140.field2552[arg4] = var10;
            for (int var11 = arg0; var11 < arg4; var11++) {
                if (class118.method776(arg1, -89, arg3, arg6, var10, arg2, class140.field2552[var11]) <= 0) {
                    class88 var12 = class140.field2552[var11];
                    class140.field2552[var11] = class140.field2552[var9];
                    class140.field2552[var9++] = var12;
                }
            }
            class140.field2552[arg4] = class140.field2552[var9];
            class140.field2552[var9] = var10;
            method321(arg0, arg1, arg2, arg3, var9 - 1, (byte) -46, arg6);
            method321(var9 + 1, arg1, arg2, arg3, arg4, (byte) -41, arg6);
        }
        field772++;
    }
}
