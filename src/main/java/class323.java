import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class323 {

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "Lro;")
    private class2 field4300;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Lpp;")
    private class245 field4296;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "Ljj;")
    private class67 field4295;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "Lgd;")
    public static class206 field4308 = new class206("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "Lh;")
    public static class434 field4309 = new class434(55, -1);

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "Z")
    public static boolean field4311 = false;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "Lad;")
    public static class268 field4310 = new class268(8);

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "Lbt;")
    private class32 field4302;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "[Lbl;")
    private class425[] field4304;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BIIII)V", line = 5)
    public static final void method1791(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4306++;
        if (arg0 != 73) {
            return;
        }
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        class330.method1834(arg1 + arg4, class102.field1472[arg2], arg3, arg4 - arg1, arg0 ^ 0x61B5);
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class102.field1472[arg2 + var6];
                int[] var10 = class102.field1472[arg2 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class330.method1834(var11, var9, arg3, var12, 25084);
                class330.method1834(var11, var10, arg3, var12, 25084);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class102.field1472[arg2 + var5];
            int[] var16 = class102.field1472[arg2 - var5];
            class330.method1834(var13, var15, arg3, var14, 25084);
            class330.method1834(var13, var16, arg3, var14, 25084);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILrq;ILrq;)Lbl;", line = 57)
    public final class425 method1792(int arg0, class213 arg1, int arg2, class213 arg3) {
        field4299++;
        return arg2 == 0 ? this.method1796(arg0, true, arg3, arg1, 8) : null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)Z", line = 69)
    public final boolean method1793(byte arg0) {
        field4301++;
        if (this.field4302 != null) {
            return true;
        }
        if (this.field4295 == null) {
            if (this.field4296.method1375(20)) {
                return false;
            }
            this.field4295 = this.field4296.method1373(true, 255, (byte) 24, (byte) 0, 255);
        }
        if (this.field4295.field973) {
            return false;
        }
        this.field4302 = new class32(this.field4295.method447((byte) -125));
        if (arg0 >= -11) {
            return false;
        } else {
            this.field4304 = new class425[(this.field4302.field472.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V", line = 99)
    public static void method1794(byte arg0) {
        field4310 = null;
        if (arg0 == 61) {
            field4309 = null;
            field4308 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", line = 121)
    public static final void method1795(int arg0, String arg1, int arg2, String arg3, int arg4, int arg5, String arg6, String arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class306.field4054[var8] = class306.field4054[var8 - 1];
            class200.field2712[var8] = class200.field2712[var8 - 1];
            class451.field6131[var8] = class451.field6131[var8 - 1];
            class64.field852[var8] = class64.field852[var8 - 1];
            class236.field3121[var8] = class236.field3121[var8 - 1];
            class92.field1353[var8] = class92.field1353[var8 - 1];
            class59.field793[var8] = class59.field793[var8 - 1];
        }
        field4307++;
        class306.field4054[0] = arg5;
        class451.field6131[0] = arg7;
        class200.field2712[0] = arg0;
        class64.field852[0] = arg6;
        if (arg2 < 34) {
            method1791((byte) 54, 52, -45, 120, -16);
        }
        class236.field3121[0] = arg3;
        class28.field370 = class236.field3123;
        class34.field517++;
        class92.field1353[0] = arg1;
        class59.field793[0] = arg4;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IZLrq;Lrq;I)Lbl;", line = 155)
    private final class425 method1796(int arg0, boolean arg1, class213 arg2, class213 arg3, int arg4) {
        field4303++;
        if (this.field4302 == null) {
            throw new RuntimeException();
        }
        this.field4302.field456 = arg0 * arg4 + 5;
        if (this.field4302.field456 >= this.field4302.field472.length) {
            throw new RuntimeException();
        } else if (this.field4304[arg0] == null) {
            int var6 = this.field4302.method222(1024);
            int var7 = this.field4302.method222(1024);
            class425 var8 = new class425(arg0, arg2, arg3, this.field4296, this.field4300, var6, var7, arg1);
            this.field4304[arg0] = var8;
            return var8;
        } else {
            return this.field4304[arg0];
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ZII)I", line = 190)
    public static final int method1797(boolean arg0, int arg1, int arg2) {
        field4305++;
        int var3 = arg1 >>> 31;
        return arg0 ? -46 : (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lpp;Lro;)V", line = 202)
    public class323(class245 arg0, class2 arg1) {
        this.field4300 = arg1;
        this.field4296 = arg0;
        if (!this.field4296.method1375(20)) {
            this.field4295 = this.field4296.method1373(true, 255, (byte) 24, (byte) 0, 255);
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V", line = 215)
    public final void method1798(byte arg0) {
        field4297++;
        if (this.field4304 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4304.length; var2++) {
            if (this.field4304[var2] != null) {
                this.field4304[var2].method2508((byte) -1);
            }
        }
        if (arg0 != -51) {
            this.field4302 = null;
        }
        for (int var3 = 0; var3 < this.field4304.length; var3++) {
            if (this.field4304[var3] != null) {
                this.field4304[var3].method2510((byte) -126);
            }
        }
    }
}
