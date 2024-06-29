import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class387 implements class33 {

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "Laea;")
    public class39 field5214;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "Ltf;")
    private class701 field5217;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Lf;")
    public class534 field5216;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)[Lsda;")
    public static final class7[] method2212(byte arg0) {
        field5215++;
        int var1 = -59 % ((arg0 + 18) / 62);
        if (class359.field4820 == null) {
            class7[] var2 = class341.method1970(class353.field4757, (byte) -12);
            class7[] var3 = new class7[var2.length];
            int var4 = 0;
            int var5 = class639.field9075.method2639(class430.field6109, 31285);
            label70: for (int var6 = 0; var6 < var2.length; var6++) {
                class7 var10 = var2[var6];
                if ((var10.field78 <= 0 || var10.field78 >= 24) && var10.field82 >= 800 && var10.field80 >= 600 && (var5 != 2 || var10.field82 <= 800 && var10.field80 <= 600) && (var5 != 1 || var10.field82 <= 1024 && var10.field80 <= 768)) {
                    for (int var11 = 0; var11 < var4; var11++) {
                        class7 var12 = var3[var11];
                        if (var10.field82 == var12.field82 && var10.field80 == var12.field80) {
                            if (var12.field78 < var10.field78) {
                                var3[var11] = var10;
                            }
                            continue label70;
                        }
                    }
                    var3[var4] = var10;
                    var4++;
                }
            }
            class359.field4820 = new class7[var4];
            class567.method3216(var3, 0, class359.field4820, 0, var4);
            int[] var7 = new int[class359.field4820.length];
            for (int var8 = 0; var8 < class359.field4820.length; var8++) {
                class7 var9 = class359.field4820[var8];
                var7[var8] = var9.field82 * var9.field80;
            }
            class64.method347(var7, class359.field4820, (byte) 58);
        }
        return class359.field4820;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)Z")
    public final boolean method157(boolean arg0) {
        field5218++;
        return arg0 ? false : this.field5217.method3849(this.field5214.field397, arg0);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILsp;)V")
    public static final void method2213(int arg0, class677 arg1) {
        field5222++;
        boolean var2 = false;
        if (class678.field9539 == arg1.field9506 || arg1.field9455 == -1 || arg1.field9482 != 0) {
            var2 = true;
        } else {
            class257 var3 = class265.field3301.method3043(arg1.field9455, arg0 ^ 0x1FFC);
            if (var3.field3221 || var3.field3235[arg1.field9435] < (arg1.field9442 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field9506 - arg1.field9479;
            int var5 = class678.field9539 - arg1.field9479;
            int var6 = arg1.field9459 * 512 + arg1.method1414(-31789) * 256;
            int var7 = arg1.field9414 * 512 + (arg1.method1414(-31789) * 256);
            int var8 = arg1.field9480 * 512 + (arg1.method1414(-31789) * 256);
            int var9 = arg1.field9491 * 512 + arg1.method1414(arg0 - 31786) * 256;
            arg1.field5176 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field5179 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg1.field9514 = 0;
        if (arg1.field9500 == 0) {
            arg1.method3733(8192, false, (byte) -103);
        }
        if (arg1.field9500 == 1) {
            arg1.method3733(12288, false, (byte) -103);
        }
        if (~arg1.field9500 == arg0) {
            arg1.method3733(0, false, (byte) -103);
        }
        if (arg1.field9500 == 3) {
            arg1.method3733(4096, false, (byte) -103);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
    public final void method156(int arg0) {
        field5221++;
        this.field5216 = class316.method1814(this.field5214.field397, (byte) 116, this.field5217);
        if (arg0 != 23004) {
            this.method155(false, 55);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZI)V")
    public void method155(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = this.field5214.field400.method1426(class267.field3329, this.field5216.method312(), arg1 + 3562) + this.field5214.field402;
            int var4 = this.field5214.field401.method3625(this.field5216.method304(), class87.field873, arg1 + 3563) + this.field5214.field392;
            this.field5216.method3001(var3, var4);
        }
        if (arg1 == -3563) {
            field5219++;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Ltf;Laea;)V")
    public class387(class701 arg0, class39 arg1) {
        this.field5214 = arg1;
        this.field5217 = arg0;
    }
}
