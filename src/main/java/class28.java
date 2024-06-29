import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class28 {

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "Loo;")
    private class652 field412 = new class652(256);

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "Lpj;")
    private class156 field410;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "Ld;")
    private class160 field405;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "[[I")
    public static int[][] field406 = new int[6][];

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V")
    public static void method246(boolean arg0) {
        if (!arg0) {
            field408 = 26;
        }
        field406 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
    public final void method247(byte arg0) {
        field413++;
        this.field412.method3741(5, 0);
        if (arg0 > -24) {
            this.field412 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public final void method248(int arg0) {
        if (arg0 > -105) {
            field408 = -56;
        }
        this.field412.method3735(2);
        field409++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Loga;")
    public final class498 method249(int arg0, int arg1) {
        if (arg0 != 64) {
            this.field412 = null;
        }
        field407++;
        Object var3 = this.field412.method3742((byte) 67, (long) arg1);
        if (var3 != null) {
            return (class498) var3;
        } else if (this.field405.method1212(109, arg1)) {
            class467 var4 = this.field405.method1208((byte) 47, arg1);
            int var5 = var4.field6574 ? 64 : this.field410.field2478;
            class498 var7;
            if (var4.field6568 && this.field410.method451()) {
                float[] var6 = this.field405.method1210(arg1, var5, 0.7F, arg0 ^ 0xFFFFE312, var5, false);
                var7 = this.field410.method1166(var5, var5, 14, class691.field9659, var6, var4.field6565 != 0);
            } else {
                int[] var8;
                if (var4.field6581 != 2 && class217.method1495((byte) -49, var4.field6567)) {
                    var8 = this.field405.method1211((byte) 22, var5, var5, true, arg1, 0.7F);
                } else {
                    var8 = this.field405.method1207((byte) -67, false, arg1, var5, var5, 0.7F);
                }
                var7 = this.field410.method1093((byte) 112, var4.field6565 != 0, var5, var8, var5);
            }
            var7.method2021(var4.field6566, var4.field6572, (byte) 23);
            this.field412.method3739((long) arg1, (byte) 33, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;ZII)V")
    public static final void method250(String arg0, int arg1, boolean arg2, String arg3, boolean arg4, int arg5, int arg6) {
        field414++;
        class253.field3722.field10884 = 1;
        String var7 = arg0.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg6 != -1) {
            class645 var11 = class184.field2832.method4117((byte) 49, arg6);
            if (var11 == null || var11.method3701((byte) 61) != arg2) {
                return;
            }
            if (var11.method3701((byte) 61)) {
                var10 = var11.field9012;
            } else {
                var9 = var11.field9011;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class313.field4456.field3769; var13++) {
            class689 var16 = class313.field4456.method1681(var13, 84);
            if ((!arg4 || var16.field9621) && var16.field9594 == -1 && var16.field9572 == -1 && var16.field9581 == -1 && var16.field9616 == 0 && var16.field9565.toLowerCase().indexOf(var7) != -1) {
                if (arg6 != -1) {
                    if (arg2) {
                        if (!arg3.equals(var16.method3880(arg6, var10, (byte) 49))) {
                            continue;
                        }
                    } else if (var16.method3883(arg6, (byte) 52, var9) != arg5) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class656.field9139 = null;
                    class280.field4072 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class280.field4072 = var12;
        class561.field7976 = 0;
        class656.field9139 = var8;
        String[] var14 = new String[class280.field4072];
        for (int var15 = 0; var15 < class280.field4072; var15++) {
            var14[var15] = class313.field4456.method1681(var8[var15], arg1 - 17265).field9565;
        }
        class5.method35(-1, class656.field9139, var14);
        class253.field3722.method4340((byte) -111);
        class253.field3722.field10884 = 2;
        if (arg1 != 17355) {
            field408 = -21;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lpj;Ld;)V")
    public class28(class156 arg0, class160 arg1) {
        this.field410 = arg0;
        this.field405 = arg1;
    }
}
