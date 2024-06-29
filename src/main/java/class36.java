import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class36 {

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lpca;")
    private class714 field451 = new class714(64);

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Lfp;")
    private class323 field452;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Lqfa;")
    public static class98 field449 = new class98(47, 3);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[I[IIILeea;)Lsg;", line = 6)
    public static final class397 method200(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, class131 arg5) {
        field458++;
        byte[] var6 = new byte[arg0 * arg4];
        if (arg3 != -1) {
            method203((byte) -72);
        }
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg0 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class397(arg5, arg0, arg4, var6);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 36)
    public final void method201(int arg0) {
        field450++;
        class714 var2 = this.field451;
        synchronized (this.field451) {
            this.field451.method4023((byte) -128);
            int var3 = -45 % ((63 - arg0) / 52);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 52)
    public final void method202(int arg0, int arg1) {
        field455++;
        class714 var3 = this.field451;
        synchronized (this.field451) {
            this.field451.method4016(arg0, (byte) -73);
            if (arg1 != 0) {
                method205((byte) -5, (char) 65502);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 65)
    public static void method203(byte arg0) {
        if (arg0 != -12) {
            field449 = null;
        }
        field449 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(FFFFFIFI)F", line = 75)
    public static final float method204(float arg0, float arg1, float arg2, float arg3, float arg4, int arg5, float arg6, int arg7) {
        field454++;
        float var8 = 0.0F;
        float var9 = arg6 - arg3;
        float var10 = arg1 - arg2;
        if (arg5 < 66) {
            method203((byte) -82);
        }
        float var11 = arg4 - arg0;
        float var12 = 0.0F;
        float var13 = 0.0F;
        float var14 = 0.0F;
        while (var8 < 1.1F) {
            float var15 = var8 * var9 + arg3;
            float var16 = var8 * var10 + arg2;
            float var17 = var8 * var11 + arg0;
            int var18 = (int) var15 >> 9;
            int var19 = (int) var17 >> 9;
            if (var18 > 0 && var19 > 0 && var18 < class336.field4683 && class700.field9768 > var19) {
                int var20 = class660.field9039.field1266;
                if (var20 < 3 && (class651.field8948[1][var18][var19] & 0x2) != 0) {
                    var20++;
                }
                int var21 = class588.field8292[var20].method1815((int) var17, (int) var15, 27);
                if (var16 > (float) var21) {
                    if (arg7 < 2) {
                        return var8;
                    }
                    return method204(var14, var16, var13, var12, var17, 87, var15, arg7 - 1) * 0.1F + (var8 - 0.1F);
                }
            }
            var14 = var17;
            var8 += 0.1F;
            var12 = var15;
            var13 = var16;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BC)I", line = 142)
    public static final int method205(byte arg0, char arg1) {
        field453++;
        if (arg1 >= '\u0000' && arg1 < class269.field3854.length) {
            return class269.field3854[arg1];
        } else {
            if (arg0 != -123) {
                method200(114, null, null, -87, 83, null);
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 157)
    public final void method206(int arg0) {
        field448++;
        class714 var2 = this.field451;
        synchronized (this.field451) {
            this.field451.method4024(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lsaa;ILfp;)V", line = 172)
    public class36(class326 arg0, int arg1, class323 arg2) {
        this.field452 = arg2;
        this.field452.method2084(31, 0);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Ldi;", line = 193)
    public final class125 method207(int arg0, int arg1) {
        field456++;
        class714 var3 = this.field451;
        class125 var4;
        synchronized (this.field451) {
            var4 = (class125) this.field451.method4022((long) arg0, (byte) 80);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field452;
        byte[] var6;
        synchronized (this.field452) {
            var6 = this.field452.method2100(arg0, (byte) 112, arg1);
        }
        class125 var7 = new class125();
        if (var6 != null) {
            var7.method849(new class675(var6), 0);
        }
        class714 var8 = this.field451;
        synchronized (this.field451) {
            this.field451.method4018((byte) 127, var7, (long) arg0);
            return var7;
        }
    }
}
