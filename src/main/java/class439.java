import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class439 extends class430 {

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
    private int field6346 = 0;

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
    private int field6355 = -1;

    @OriginalMember(owner = "client!fl", name = "mb", descriptor = "Z")
    private boolean field6369 = false;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "I")
    private int field6354 = -32768;

    @OriginalMember(owner = "client!fl", name = "nb", descriptor = "I")
    private int field6370 = 0;

    @OriginalMember(owner = "client!fl", name = "ob", descriptor = "I")
    public int field6371;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
    private int field6352;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public int field6349;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public int field6343;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    private int field6337;

    @OriginalMember(owner = "client!fl", name = "fb", descriptor = "I")
    public int field6362;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "I")
    private int field6356;

    @OriginalMember(owner = "client!fl", name = "db", descriptor = "Llo;")
    private class449 field6360;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "Lng;")
    public static class190 field6338 = new class190(30);

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "D")
    private double field6331;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "D")
    private double field6336;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "D")
    private double field6340;

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "D")
    private double field6353;

    @OriginalMember(owner = "client!fl", name = "ab", descriptor = "D")
    private double field6357;

    @OriginalMember(owner = "client!fl", name = "eb", descriptor = "D")
    private double field6361;

    @OriginalMember(owner = "client!fl", name = "gb", descriptor = "D")
    private double field6363;

    @OriginalMember(owner = "client!fl", name = "jb", descriptor = "D")
    private double field6366;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    private int field6341;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    private int field6351;

    @OriginalMember(owner = "client!fl", name = "bb", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!fl", name = "cb", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!fl", name = "hb", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!fl", name = "ib", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!fl", name = "kb", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!fl", name = "lb", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!fl", name = "pb", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!fl", name = "qb", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "Ljl;")
    private class147 field6333;

    @OriginalMember(owner = "client!fl", name = "sb", descriptor = "Lqj;")
    public static class296 field6375;

    @OriginalMember(owner = "client!fl", name = "tb", descriptor = "Lsh;")
    public static class44 field6376;

    @OriginalMember(owner = "client!fl", name = "rb", descriptor = "Ldi;")
    public static class65 field6374;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 14)
    public static void method2754(int arg0) {
        field6374 = null;
        field6376 = null;
        field6375 = null;
        if (arg0 != -1) {
            field6374 = null;
        }
        field6338 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 28)
    public final void method2755(byte arg0) {
        ++field6339;
        int var2 = -91 % ((36 - arg0) / 62);
        if (this.field6333 != null) {
            this.field6333.method1004();
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Laa;Z)V", line = 45)
    public final void method128(class281 arg0, boolean arg1) {
        if (arg1) {
            ++field6342;
            class75 var3 = this.method2760(0, arg0, -84);
            if (var3 != null) {
                class261 var4 = arg0.method1769();
                var4.method890(this.field6341);
                var4.method883(this.field6351);
                var4.method888((int) this.field6357, (int) this.field6336, (int) this.field6361);
                this.field6354 = var3.method523();
                this.method2757((byte) 104, arg0, var3);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZIILaa;ILqh;)V", line = 68)
    public final void method129(int arg0, boolean arg1, int arg2, int arg3, class281 arg4, int arg5, class43 arg6) {
        if (arg0 != 0) {
            this.method2757((byte) 59, (class281) null, (class75) null);
        }
        ++field6358;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 153)
    public class439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field6371 = arg10;
        this.field6369 = false;
        this.field6352 = arg0;
        this.field6349 = arg9;
        this.field6343 = arg6;
        this.field6337 = arg7;
        this.field6362 = arg5;
        this.field6356 = arg8;
        int var12 = class221.method1405(this.field6352, 103).field1076;
        if (~var12 != 0) {
            this.field6360 = class86.method599(false, var12);
        } else {
            this.field6360 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIIIIIIIII)V", line = 84)
    public static final void method2756(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6372;
        class308 var10 = null;
        for (class308 var11 = (class308) class430.field6190.method1312((byte) 25); var11 != null; var11 = (class308) class430.field6190.method1304(-29)) {
            if (~var11.field4229 == ~arg6 && var11.field4233 == arg5 && var11.field4232 == arg3 && var11.field4216 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class308();
            var10.field4229 = arg6;
            var10.field4233 = arg5;
            var10.field4232 = arg3;
            var10.field4216 = arg4;
            class365.method2344(3, var10);
            class430.field6190.method1301(50, var10);
        }
        var10.field4223 = arg7;
        var10.field4215 = arg8;
        var10.field4218 = arg9;
        if (!arg0) {
            var10.field4234 = arg2;
            var10.field4226 = arg1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLaa;Lhc;)V", line = 129)
    private final void method2757(byte arg0, class281 arg1, class75 arg2) {
        ++field6345;
        class140[] var4 = arg2.method518();
        class179[] var5 = arg2.method511();
        int var6 = 96 % ((67 - arg0) / 36);
        if ((this.field6333 == null || this.field6333.field2130) && (var4 != null || var5 != null)) {
            this.field6333 = new class147(class35.field541);
        }
        if (this.field6333 != null) {
            this.field6333.method1005(arg1, (long) class35.field541, var4, var5, false);
            this.field6333.method1007(super.field6198, super.field6182, super.field6195, super.field6186, super.field6185);
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V", line = 178)
    public final void method135(byte arg0) {
        if (arg0 == -123) {
            ++field6365;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Laa;I)Lcn;", line = 189)
    public final class300 method131(class281 arg0, int arg1) {
        ++field6359;
        if (arg1 <= 72) {
            this.method135((byte) 89);
        }
        class75 var3 = this.method2760(1024, arg0, -81);
        if (var3 == null) {
            return null;
        } else {
            class261 var4 = arg0.method1769();
            var4.method890(this.field6341);
            var4.method883(this.field6351);
            var4.method888((int) this.field6357, (int) this.field6336, (int) this.field6361);
            if (this.field6333 == null) {
                var3.method514(var4, (class38) null, 0);
            } else {
                class260 var5 = this.field6333.method1014();
                arg0.method1721(var3, var5, var4, (class38) null, 0);
            }
            this.field6354 = var3.method523();
            this.method2757((byte) -63, arg0, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBIII)V", line = 223)
    public final void method2758(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (!this.field6369) {
            double var6 = (double) (-super.field6197 + arg3);
            double var8 = (double) (arg2 - super.field6192);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field6357 = (double) this.field6356 * var6 / var10 + (double) super.field6197;
            this.field6361 = (double) this.field6356 * var8 / var10 + (double) super.field6192;
            this.field6336 = (double) super.field6191;
        }
        ++field6368;
        double var12 = (double) (-arg4 + this.field6343 + 1);
        this.field6366 = ((double) arg3 - this.field6357) / var12;
        this.field6331 = ((double) arg2 - this.field6361) / var12;
        if (arg1 < 51) {
            this.method400((byte) 64);
        }
        this.field6363 = Math.sqrt(this.field6366 * this.field6366 + this.field6331 * this.field6331);
        if (~this.field6337 == 0) {
            this.field6353 = ((double) arg0 - this.field6336) / var12;
        } else {
            if (!this.field6369) {
                this.field6353 = -this.field6363 * Math.tan((double) this.field6337 * 0.02454369D);
            }
            this.field6340 = ((double) arg0 - this.field6336 + -(this.field6353 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)I", line = 268)
    public final int method600(boolean arg0) {
        ++field6335;
        if (!arg0) {
            method2756(true, 117, -95, -79, 9, 30, 98, -106, -71, 34);
        }
        return this.field6354;
    }

    @OriginalMember(owner = "client!fl", name = "finalize", descriptor = "()V", line = 285)
    protected final void finalize() {
        ++field6348;
        if (this.field6333 != null) {
            this.field6333.method1004();
        }
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)V", line = 300)
    public final void method400(byte arg0) {
        super.field6182 = super.field6195 = (short) ((int) (this.field6357 / 128.0D));
        if (arg0 == 66) {
            ++field6332;
            super.field6186 = super.field6185 = (short) ((int) (this.field6361 / 128.0D));
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Z", line = 317)
    public final boolean method137(int arg0) {
        ++field6347;
        if (arg0 != 0) {
            this.field6360 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)V", line = 329)
    public final void method2759(int arg0, int arg1) {
        ++field6344;
        this.field6357 += (double) arg0 * this.field6366;
        this.field6361 += (double) arg0 * this.field6331;
        this.field6369 = true;
        if (this.field6337 != -1) {
            this.field6336 += this.field6340 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field6353;
            this.field6353 += (double) arg0 * this.field6340;
        } else {
            this.field6336 += (double) arg0 * this.field6353;
        }
        this.field6351 = (int) (2607.5945876176133D * Math.atan2(this.field6366, this.field6331)) - -8192 & 16383;
        this.field6341 = 16383 & (int) (Math.atan2(this.field6353, this.field6363) * 2607.5945876176133D);
        if (this.field6360 != null) {
            this.field6346 += arg0;
            label45: while (true) {
                do {
                    do {
                        if (~this.field6346 >= ~this.field6360.field6506[this.field6370]) {
                            break label45;
                        }
                        this.field6346 -= this.field6360.field6506[this.field6370];
                        ++this.field6370;
                        if (this.field6360.field6521.length <= this.field6370) {
                            this.field6370 -= this.field6360.field6501;
                            if (~this.field6370 > -1 || ~this.field6370 <= ~this.field6360.field6521.length) {
                                this.field6370 = 0;
                            }
                        }
                        this.field6355 = this.field6370 - -1;
                    } while (this.field6355 < this.field6360.field6521.length);
                    this.field6355 -= this.field6360.field6501;
                } while (this.field6355 >= 0 && ~this.field6360.field6521.length < ~this.field6355);
                this.field6355 = -1;
            }
        }
        if (arg1 < 12) {
            this.field6346 = -119;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILaa;I)Lhc;", line = 382)
    private final class75 method2760(int arg0, class281 arg1, int arg2) {
        ++field6364;
        class69 var4 = class221.method1405(this.field6352, -96);
        if (arg2 >= -56) {
            this.field6341 = -36;
        }
        return var4.method472(850, this.field6370, this.field6346, this.field6355, arg1, arg0);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILaa;)Z", line = 406)
    public final boolean method136(int arg0, int arg1, int arg2, class281 arg3) {
        ++field6334;
        if (arg0 != 0) {
            field6338 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V", line = 417)
    public static final void method2761(int arg0) {
        for (class398 var1 = (class398) class140.field1993.method1312((byte) 25); var1 != null; var1 = (class398) class140.field1993.method1304(arg0 ^ -16310)) {
            if (var1.field5815) {
                var1.method2572(arg0 + -32832);
            }
        }
        if (arg0 != 16383) {
            method2754(-83);
        }
        ++field6350;
        for (class398 var2 = (class398) class286.field3939.method1312((byte) 25); var2 != null; var2 = (class398) class286.field3939.method1304(103)) {
            if (var2.field5815) {
                var2.method2572(-16449);
            }
        }
    }
}
