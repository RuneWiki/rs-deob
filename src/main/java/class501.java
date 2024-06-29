import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class501 extends class678 {

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    private int field7122;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "Lja;")
    public static class254 field7126 = new class254(14, 0, 4, 1);

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "F")
    public static float field7125;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "[Leg;")
    public class93[] field7123;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "[[B")
    private byte[][] field7131;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
    public final boolean method2985(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method2991(20, (byte) 126);
        }
        field7130++;
        return this.field7123[arg1].field1695;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Z")
    public final boolean method2986(int arg0) {
        field7124++;
        if (this.field7123 != null) {
            return true;
        }
        if (this.field7131 == null) {
            class344 var2 = class127.field2324;
            synchronized (class127.field2324) {
                if (!class127.field2324.method2221(this.field7122, true)) {
                    return false;
                }
                int[] var4 = class127.field2324.method2231(this.field7122, arg0 ^ 0xFFFFED51);
                this.field7131 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field7131[var5] = class127.field2324.method2216(this.field7122, var4[var5], true);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field7131.length; var7++) {
            byte[] var8 = this.field7131[var7];
            class61 var9 = new class61(var8);
            var9.field1393 = 1;
            int var10 = var9.method723((byte) -25);
            class344 var11 = class633.field9098;
            synchronized (class633.field9098) {
                var6 &= class633.field9098.method2230((byte) 46, var10);
            }
        }
        if (!var6) {
            return false;
        } else if (arg0 == -4782) {
            class158 var12 = new class158();
            class344 var13 = class127.field2324;
            int[] var15;
            synchronized (class127.field2324) {
                int var14 = class127.field2324.method2236(this.field7122, arg0 + 4782);
                this.field7123 = new class93[var14];
                var15 = class127.field2324.method2231(this.field7122, 3);
            }
            for (int var16 = 0; var16 < var15.length; var16++) {
                byte[] var17 = this.field7131[var16];
                class61 var18 = new class61(var17);
                var18.field1393 = 1;
                int var19 = var18.method723((byte) -25);
                class314 var20 = null;
                for (class314 var21 = (class314) var12.method1224(arg0 + 4780); var21 != null; var21 = (class314) var12.method1232(arg0 + 4780)) {
                    if (var21.field4648 == var19) {
                        var20 = var21;
                        break;
                    }
                }
                if (var20 == null) {
                    class344 var22 = class633.field9098;
                    synchronized (class633.field9098) {
                        var20 = new class314(var19, class633.field9098.method2242(arg0 + 4782, var19));
                    }
                    var12.method1229(var20, (byte) 120);
                }
                this.field7123[var15[var16]] = new class93(var17, var20);
            }
            this.field7131 = null;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)Z")
    public final boolean method2987(int arg0, int arg1) {
        field7128++;
        if (arg1 > -12) {
            this.method2987(28, -39);
        }
        return this.field7123[arg0].field1691;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public static void method2988(boolean arg0) {
        if (arg0) {
            field7125 = 0.18121731F;
        }
        field7126 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lqh;I)Ltp;")
    public static final class496 method2989(class61 arg0, int arg1) {
        field7121++;
        class234 var2 = class569.method3281(arg0, -1);
        int var3 = arg0.method723((byte) -25);
        if (arg1 != 14) {
            field7126 = null;
        }
        int var4 = arg0.method723((byte) -25);
        int var5 = arg0.method723((byte) -25);
        int var6 = arg0.method723((byte) -25);
        int var7 = arg0.method723((byte) -25);
        int var8 = arg0.method723((byte) -25);
        return new class496(var2.field3490, var2.field3499, var2.field3497, var2.field3496, var2.field3492, var2.field3491, var2.field3500, var2.field3502, var2.field3498, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
    public static final void method2990(int arg0) {
        field7127++;
        int[] var1 = new int[class268.field3985.field496];
        int var2 = 0;
        for (int var3 = 0; var3 < class268.field3985.field496; var3++) {
            class110 var5 = class268.field3985.method258(var3, (byte) -67);
            if (var5.field1990 >= 0 || var5.field1986 >= 0) {
                var1[var2++] = var3;
            }
        }
        class497.field7076 = new int[var2];
        for (int var4 = arg0; var4 < var2; var4++) {
            class497.field7076[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
    public class501(int arg0) {
        this.field7122 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Z")
    public final boolean method2991(int arg0, byte arg1) {
        if (arg1 != -17) {
            field7126 = null;
        }
        field7129++;
        return this.field7123[arg0].field1689;
    }
}
