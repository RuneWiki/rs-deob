import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class235 {

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    private int field3711 = -1;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    private int field3710 = 0;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Lud;")
    private class2 field3712 = new class2();

    @OriginalMember(owner = "client!og", name = "q", descriptor = "Z")
    public boolean field3722 = false;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    private int field3717;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    private int field3719;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[[I")
    private int[][] field3709;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[Lvc;")
    private class199[] field3706;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "[I")
    public static int[] field3721 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[Lel;")
    public static class213[] field3718;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method1609(int arg0) {
        field3718 = null;
        int var1 = 82 / ((-arg0 - 2) / 42);
        field3721 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public final void method1610(int arg0) {
        int var2 = -38 % ((47 - arg0) / 46);
        field3720++;
        for (int var3 = 0; var3 < this.field3719; var3++) {
            this.field3709[var3] = null;
        }
        this.field3709 = null;
        this.field3706 = null;
        this.field3712.method9(117);
        this.field3712 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
    public final int[] method1611(int arg0, int arg1) {
        field3714++;
        if (arg0 != 0) {
            this.method1612((byte) 112);
        }
        if (this.field3719 == this.field3717) {
            this.field3722 = this.field3706[arg1] == null;
            this.field3706[arg1] = class193.field3013;
            return this.field3709[arg1];
        } else if (this.field3719 == 1) {
            this.field3722 = this.field3711 != arg1;
            this.field3711 = arg1;
            return this.field3709[0];
        } else {
            class199 var3 = this.field3706[arg1];
            if (var3 == null) {
                this.field3722 = true;
                if (this.field3710 >= this.field3719) {
                    class199 var4 = (class199) this.field3712.method5((byte) 79);
                    var3 = new class199(arg1, var4.field3090);
                    this.field3706[var4.field3093] = null;
                    var4.method995((byte) 50);
                } else {
                    var3 = new class199(arg1, this.field3710);
                    this.field3710++;
                }
                this.field3706[arg1] = var3;
            } else {
                this.field3722 = false;
            }
            this.field3712.method10(var3, true);
            return this.field3709[var3.field3090];
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)[[I")
    public final int[][] method1612(byte arg0) {
        field3708++;
        if (this.field3719 != this.field3717) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 105) {
            field3718 = null;
        }
        for (int var2 = 0; var2 < this.field3719; var2++) {
            this.field3706[var2] = class193.field3013;
        }
        return this.field3709;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1613(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3713++;
        class222 var7 = class77.method605(arg4, arg3, (byte) -32);
        if (var7 != null && var7.field3419 != null) {
            class26 var8 = new class26();
            var8.field453 = var7;
            var8.field450 = var7.field3419;
            class15.method116(8, var8);
        }
        class203.field3131 = arg6;
        class149.field2213 = arg5;
        class114.field1755 = arg0;
        class28.field486 = arg2;
        class162.field2438 = true;
        class305.field4894 = arg4;
        class84.field1258 = arg3;
        if (arg1 == -124) {
            class80.method628((byte) -80, var7);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)V")
    public static final void method1614(int arg0, int arg1) {
        if (arg1 < 117) {
            field3718 = null;
        }
        field3715++;
        class69 var2 = class255.method1723((byte) 32, arg0, 7);
        var2.method554(2009563296);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III)V")
    public class235(int arg0, int arg1, int arg2) {
        this.field3717 = arg1;
        this.field3719 = arg0;
        this.field3709 = new int[this.field3719][arg2];
        this.field3706 = new class199[this.field3717];
    }
}
