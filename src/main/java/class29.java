import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class29 {

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field389 = 0;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lug;")
    public static class23 field396 = new class23();

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Ldb;")
    public static class102 field400 = new class102(30);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "[Lpd;")
    public static class173[] field399;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "[[[I")
    public static int[][][] field398;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 12)
    public static final void method165(byte arg0) {
        int var1 = -110 % ((-arg0 - 38) / 49);
        field391++;
        for (int var2 = -1; var2 < class275.field4435; var2++) {
            int var3;
            if (var2 == -1) {
                var3 = 2047;
            } else {
                var3 = class160.field2656[var2];
            }
            class334 var4 = class74.field1049[var3];
            if (var4 != null) {
                class4.method24(var4, var4.method1881(-20395), (byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 41)
    public static final void method166(String arg0, int arg1) {
        field390++;
        if (class340.field5291 == null) {
            return;
        }
        if (arg1 > -109) {
            method169(true);
        }
        long var2 = class204.method1491(-26916, arg0);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (class340.field5291.length > var4 && class340.field5291[var4].field2744 != var2) {
            var4++;
        }
        if (var4 < class340.field5291.length && class340.field5291[var4] != null) {
            class194.field3175.method2375(130, 0);
            class318.field4945++;
            class194.field3175.method255(false, class340.field5291[var4].field2744);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIILj;JLj;Lj;)V", line = 79)
    public static final void method167(int arg0, int arg1, int arg2, int arg3, class7 arg4, long arg5, class7 arg6, class7 arg7) {
        class32 var9 = new class32();
        var9.field426 = arg4;
        var9.field441 = arg1 * 128 + 64;
        var9.field430 = arg2 * 128 + 64;
        var9.field428 = arg3;
        var9.field429 = arg5;
        var9.field433 = arg6;
        var9.field434 = arg7;
        int var10 = 0;
        class204 var11 = class324.field5032[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3360; var12++) {
                class153 var13 = var11.field3343[var12];
                if ((var13.field2358 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2373.method33();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field438 = -var10;
        if (class324.field5032[arg0][arg1][arg2] == null) {
            class324.field5032[arg0][arg1][arg2] = new class204(arg0, arg1, arg2);
        }
        class324.field5032[arg0][arg1][arg2].field3349 = var9;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 127)
    public static final void method168(int arg0) {
        field393++;
        class247.field3898.method2371(0);
        int var1 = class247.field3898.method2374(arg0, (byte) -36);
        if (var1 == 0) {
            return;
        }
        int var2 = class247.field3898.method2374(2, (byte) -36);
        if (var2 == 0) {
            class322.field4988[class192.field3138++] = 2047;
        } else if (var2 == 1) {
            int var3 = class247.field3898.method2374(3, (byte) -36);
            class191.field3129.method1885(1, -19157, var3);
            int var4 = class247.field3898.method2374(1, (byte) -36);
            if (var4 == 1) {
                class322.field4988[class192.field3138++] = 2047;
            }
        } else if (var2 == 2) {
            if (class247.field3898.method2374(1, (byte) -36) == 1) {
                int var10 = class247.field3898.method2374(3, (byte) -36);
                class191.field3129.method1885(2, -19157, var10);
                int var11 = class247.field3898.method2374(3, (byte) -36);
                class191.field3129.method1885(2, -19157, var11);
            } else {
                int var9 = class247.field3898.method2374(3, (byte) -36);
                class191.field3129.method1885(0, -19157, var9);
            }
            int var12 = class247.field3898.method2374(1, (byte) -36);
            if (var12 == 1) {
                class322.field4988[class192.field3138++] = 2047;
            }
        } else if (var2 == 3) {
            class49.field698 = class247.field3898.method2374(2, (byte) -36);
            int var5 = class247.field3898.method2374(7, (byte) -36);
            int var6 = class247.field3898.method2374(1, (byte) -36);
            int var7 = class247.field3898.method2374(1, (byte) -36);
            if (var7 == 1) {
                class322.field4988[class192.field3138++] = 2047;
            }
            int var8 = class247.field3898.method2374(7, (byte) -36);
            class191.field3129.method2335(var8, var5, var6 == 1, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V", line = 214)
    public static void method169(boolean arg0) {
        field396 = null;
        if (arg0) {
            field398 = (int[][][]) null;
            field399 = null;
            field400 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 230)
    public class29() {
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lba;)V", line = 232)
    public class29(class29 arg0) {
        this.field394 = arg0.field394;
        this.field395 = arg0.field395;
        this.field397 = arg0.field397;
        this.field392 = arg0.field392;
    }
}
