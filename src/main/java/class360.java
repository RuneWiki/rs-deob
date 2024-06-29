import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class360 {

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "Z")
    public boolean field5336;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "B")
    public byte field5335;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public int field5343;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "S")
    public short field5338;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "B")
    public byte field5341;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "S")
    public short field5333;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "S")
    public short field5345;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Lak;")
    public static class234 field5344 = new class234("M", "M", "M", "M");

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "Z")
    public static boolean field5348 = true;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field5346 = -1;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "Loe;")
    public static class137 field5347 = new class137();

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "Lod;")
    public static class352 field5349;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static void method2258(int arg0) {
        field5344 = null;
        field5347 = null;
        field5349 = null;
        if (arg0 != -1) {
            method2260(false);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lad;B)I")
    public static final int method2259(class295 arg0, byte arg1) {
        field5339++;
        int var2 = -87 % ((30 - arg1) / 39);
        String var3 = class356.method2234(0, arg0);
        int[] var4 = null;
        if (class209.method1447(arg0.field4498, (byte) -22)) {
            var4 = class390.field5847.method467((byte) -101, (int) arg0.field4494).field7772;
        } else if (arg0.field4503 != -1) {
            var4 = class390.field5847.method467((byte) -101, arg0.field4503).field7772;
        } else if (class469.method2829((byte) -81, arg0.field4498)) {
            class116 var7 = class153.field2265[(int) arg0.field4494];
            if (var7 != null) {
                class37 var8 = var7.field1763;
                if (var8.field499 != null) {
                    var8 = var8.method256(127, class195.field3271);
                }
                if (var8 != null) {
                    var4 = var8.field502;
                }
            }
        } else if (class229.method1623(arg0.field4498, 49)) {
            Object var5 = null;
            class69 var6;
            if (arg0.field4498 == 1004) {
                var6 = class510.field7458.method2973(-126, (int) arg0.field4494);
            } else {
                var6 = class510.field7458.method2973(-127, (int) (arg0.field4494 >>> 32 & 0x7FFFFFFFL));
            }
            if (var6.field906 != null) {
                var6 = var6.method604((byte) -15, class195.field3271);
            }
            if (var6 != null) {
                var4 = var6.field895;
            }
        }
        if (var4 != null) {
            var3 = var3 + class534.method3165(var4, false);
        }
        int var9 = class380.field5735.method2170(var3, class305.field4603, -44);
        if (arg0.field4495) {
            var9 += client.field3313.method123() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
    public static final void method2260(boolean arg0) {
        field5342++;
        int var1 = 0;
        int var2 = 0;
        if (arg0) {
            method2258(66);
        }
        while (var2 < class69.field976) {
            for (int var3 = 0; var3 < class285.field4328; var3++) {
                if (class474.method2852(true, var1, client.field3311, var3, -1, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([I[I[BI[[BII[[B)I")
    public static final int method2261(int[] arg0, int[] arg1, byte[] arg2, int arg3, byte[][] arg4, int arg5, int arg6, byte[][] arg7) {
        field5334++;
        if (arg6 != 255) {
            method2259(null, (byte) 14);
        }
        int var8 = arg0[arg5];
        int var9 = arg1[arg5] + var8;
        int var10 = arg0[arg3];
        int var11 = arg1[arg3] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg2[arg5] & 0xFF;
        if (var14 > (arg2[arg3] & 0xFF)) {
            var14 = arg2[arg3] & 0xFF;
        }
        byte[] var15 = arg7[arg5];
        byte[] var16 = arg4[arg3];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[IZILkd;)Loi;")
    public static final class53 method2262(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, class188 arg5) {
        field5337++;
        if (arg0 != 34037) {
            field5344 = null;
        }
        if (!arg5.field3077 && (!class474.method2851(arg4, (byte) 84) || !class474.method2851(arg1, (byte) 103))) {
            return arg5.field3051 ? new class53(arg5, 34037, arg4, arg1, arg3, arg2) : new class53(arg5, arg4, arg1, class396.method2493((byte) 66, arg4), class396.method2493((byte) 66, arg1), arg2);
        } else {
            return new class53(arg5, 3553, arg4, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIZI)Ldn;")
    public final class360 method2263(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            this.field5341 = -101;
        }
        field5340++;
        return new class360(arg1, arg0, arg4, arg2, this.field5338, this.field5345, this.field5333, this.field5341, this.field5335, this.field5336);
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
    public class360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field5336 = arg9;
        this.field5335 = (byte) arg8;
        this.field5343 = arg0;
        this.field5338 = (short) arg4;
        this.field5341 = (byte) arg7;
        this.field5333 = (short) arg6;
        this.field5345 = (short) arg5;
    }
}
