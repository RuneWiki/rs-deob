import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class185 {

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public int field2263 = 128;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public int field2266 = 128;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I[B)Lht;", line = 3)
    public static final class537 method1150(int arg0, byte[] arg1) {
        field2269++;
        class537 var2 = new class537();
        class389 var3 = new class389(arg1);
        var3.field5195 = var3.field5205.length - 2;
        int var4 = var3.method2260(-54);
        int var5 = var3.field5205.length - var4 - 2 - 12;
        var3.field5195 = var5;
        if (arg0 >= -97) {
            return null;
        }
        int var6 = var3.method2255(255);
        var2.field7823 = var3.method2260(-125);
        var2.field7817 = var3.method2260(-81);
        var2.field7821 = var3.method2260(-61);
        var2.field7822 = var3.method2260(-59);
        int var7 = var3.method2229(255);
        if (var7 > 0) {
            var2.field7820 = new class652[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2260(-63);
                class652 var10 = new class652(class698.method3915(var9, (byte) 93));
                var2.field7820[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method2255(255);
                    int var12 = var3.method2255(255);
                    var10.method3670((long) var11, new class556(var12), (byte) 127);
                }
            }
        }
        var3.field5195 = 0;
        var2.field7819 = var3.method2241(-92);
        var2.field7814 = new int[var6];
        var2.field7815 = new String[var6];
        var2.field7825 = new int[var6];
        int var13 = 0;
        while (var3.field5195 < var5) {
            int var14 = var3.method2260(-119);
            if (var14 == 3) {
                var2.field7815[var13] = var3.method2244((byte) -61).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field7825[var13] = var3.method2229(255);
            } else {
                var2.field7825[var13] = var3.method2255(255);
            }
            var2.field7814[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)V", line = 84)
    public static final void method1151(int arg0, int arg1) {
        field2262++;
        if (arg0 == -1 || !class299.field4032[arg0]) {
            return;
        }
        class568.field8304.method3790(true, arg0);
        class516.field7555[arg0] = null;
        class362.field4821[arg0] = null;
        class299.field4032[arg0] = false;
        if (arg1 != 256) {
            method1155(28, 108);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)Ltw;", line = 108)
    public final class185 method1152(int arg0) {
        field2265++;
        return arg0 == 1 ? new class185(this.field2267, this.field2263, this.field2266, this.field2261, this.field2268, this.field2272) : null;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Ltw;Z)V", line = 120)
    public final void method1153(class185 arg0, boolean arg1) {
        this.field2267 = arg0.field2267;
        this.field2263 = arg0.field2263;
        field2271++;
        this.field2266 = arg0.field2266;
        this.field2268 = arg0.field2268;
        this.field2272 = arg0.field2272;
        this.field2261 = arg0.field2261;
        if (!arg1) {
            this.method1153(null, true);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)Lec;", line = 139)
    public static final class213 method1154(int arg0, int arg1, int arg2, int arg3) {
        field2270++;
        class433 var4 = class281.field3808[arg0][arg2][arg1];
        if (var4 == null) {
            return null;
        }
        class213 var5 = null;
        int var6 = -1;
        if (arg3 != 3161) {
            return null;
        }
        for (class182 var7 = var4.field6218; var7 != null; var7 = var7.field2226) {
            class43 var8 = var7.field2227;
            if (var8 instanceof class213) {
                class213 var9 = (class213) var8;
                int var10 = var9.method1284((byte) -124) * 256 - 4;
                int var11 = var9.field530 - var10 >> 9;
                int var12 = var9.field531 - var10 >> 9;
                int var13 = var9.field530 + var10 >> 9;
                int var14 = var9.field531 + var10 >> 9;
                if (arg2 >= var11 && arg1 >= var12 && arg2 <= var13 && arg1 <= var14) {
                    int var15 = (var13 + 1 - arg2) * (var14 + 1 - arg1);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(I)V", line = 223)
    public class185(int arg0) {
        this.field2267 = arg0;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(IIIIII)V", line = 230)
    private class185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2266 = arg2;
        this.field2272 = arg5;
        this.field2263 = arg1;
        this.field2267 = arg0;
        this.field2261 = arg3;
        this.field2268 = arg4;
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)V", line = 210)
    public static final void method1155(int arg0, int arg1) {
        field2264++;
        class233 var2 = class7.method44(arg1, 8, -1);
        int var3 = -26 % ((arg0 + 25) / 34);
        var2.method1423(0);
    }
}
