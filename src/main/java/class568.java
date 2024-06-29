import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class568 {

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Z")
    public boolean field7949 = false;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Ltb;")
    private class450 field7945 = new class450(64);

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "Ltb;")
    public class450 field7961 = new class450(500);

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "Ltb;")
    public class450 field7962 = new class450(30);

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "Ltb;")
    public class450 field7964 = new class450(50);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Lpl;")
    private class612 field7941;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Z")
    public boolean field7943;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Lpl;")
    public class612 field7955;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Lrga;")
    public static class280 field7950 = new class280(64, 6);

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "Lwp;")
    public static class453 field7959 = new class453(47, -2);

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public int field7965;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "Lpl;")
    public static class612 field7952;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "[Lf;")
    public static class536[] field7963;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[B)[B", line = 3)
    public static final byte[] method3132(int arg0, byte[] arg1) {
        field7958++;
        class630 var2 = new class630(arg1);
        int var3 = var2.method3501(-9268);
        int var4 = var2.method3483(121);
        if (var4 < 0 || class668.field9427 != 0 && class668.field9427 < var4) {
            throw new RuntimeException();
        } else if (arg0 == var3) {
            byte[] var8 = new byte[var4];
            var2.method3522(var8, true, var4, 0);
            return var8;
        } else {
            int var5 = var2.method3483(72);
            if (var5 < 0 || class668.field9427 != 0 && var5 > class668.field9427) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class448.method2398(var6, var5, arg1, var4, 9);
            } else {
                class380 var7 = class490.field6480;
                synchronized (class490.field6480) {
                    class490.field6480.method2059((byte) 126, var2, var6);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V", line = 65)
    public final void method3133(int arg0, byte arg1) {
        class450 var3 = this.field7945;
        synchronized (this.field7945) {
            this.field7945.method2411(true, arg0);
        }
        field7944++;
        if (arg1 < 97) {
            method3141(11, (byte) -43);
        }
        class450 var4 = this.field7961;
        synchronized (this.field7961) {
            this.field7961.method2411(true, arg0);
        }
        class450 var5 = this.field7962;
        synchronized (this.field7962) {
            this.field7962.method2411(true, arg0);
        }
        class450 var6 = this.field7964;
        synchronized (this.field7964) {
            this.field7964.method2411(true, arg0);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 87)
    public static void method3134(int arg0) {
        if (arg0 != 1) {
            field7959 = null;
        }
        field7952 = null;
        field7959 = null;
        field7963 = null;
        field7950 = null;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 101)
    public final void method3135(int arg0) {
        field7956++;
        class450 var2 = this.field7945;
        synchronized (this.field7945) {
            this.field7945.method2406(18385);
        }
        class450 var3 = this.field7961;
        synchronized (this.field7961) {
            this.field7961.method2406(arg0 ^ 0x14EA);
        }
        class450 var4 = this.field7962;
        synchronized (this.field7962) {
            if (arg0 != 21307) {
                this.method3135(78);
            }
            this.field7962.method2406(18385);
        }
        class450 var5 = this.field7964;
        synchronized (this.field7964) {
            this.field7964.method2406(arg0 ^ 0x14EA);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V", line = 124)
    public final void method3136(int arg0, int arg1) {
        this.field7945 = new class450(arg1);
        int var3 = -31 / ((-arg0 - 36) / 46);
        field7957++;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V", line = 134)
    public final void method3137(int arg0) {
        class450 var2 = this.field7945;
        synchronized (this.field7945) {
            this.field7945.method2412((byte) 73);
        }
        field7954++;
        class450 var3 = this.field7961;
        synchronized (this.field7961) {
            this.field7961.method2412((byte) -120);
        }
        class450 var4 = this.field7962;
        synchronized (this.field7962) {
            this.field7962.method2412((byte) 66);
            if (arg0 < 82) {
                field7950 = null;
            }
        }
        class450 var5 = this.field7964;
        synchronized (this.field7964) {
            this.field7964.method2412((byte) 76);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)Lbda;", line = 157)
    public final class441 method3138(byte arg0, int arg1) {
        field7960++;
        class450 var3 = this.field7945;
        class441 var4;
        synchronized (this.field7945) {
            var4 = (class441) this.field7945.method2418((long) arg1, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field7941;
        byte[] var6;
        synchronized (this.field7941) {
            var6 = this.field7941.method3365(class426.method2261((byte) 121, arg1), 50, class181.method1133(arg1, -20650));
        }
        class441 var7 = new class441();
        var7.field5504 = arg1;
        var7.field5564 = this;
        if (var6 != null) {
            var7.method2367((byte) 0, new class630(var6));
        }
        if (arg0 <= 16) {
            return null;
        }
        var7.method2359(false);
        if (var7.field5523) {
            var7.field5567 = false;
            var7.field5551 = 0;
        }
        if (!this.field7943 && var7.field5580) {
            var7.field5544 = null;
            var7.field5510 = null;
        }
        class450 var8 = this.field7945;
        synchronized (this.field7945) {
            this.field7945.method2409((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)Z", line = 205)
    public static final boolean method3139(int arg0, int arg1, int arg2) {
        field7951++;
        if (arg0 != 1) {
            method3142(null, 51, (byte) 47, 34);
        }
        return class570.method3149(arg1, arg2, 14031) || class512.method2762(arg1, 55, arg2);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(BI)V", line = 220)
    public final void method3140(byte arg0, int arg1) {
        this.field7965 = arg1;
        field7948++;
        if (arg0 <= 94) {
            this.field7941 = null;
        }
        class450 var3 = this.field7961;
        synchronized (this.field7961) {
            this.field7961.method2406(18385);
        }
        class450 var4 = this.field7962;
        synchronized (this.field7962) {
            this.field7962.method2406(18385);
        }
        class450 var5 = this.field7964;
        synchronized (this.field7964) {
            this.field7964.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)I", line = 240)
    public static final int method3141(int arg0, byte arg1) {
        if (arg1 != 29) {
            method3142(null, 125, (byte) -41, -11);
        }
        field7946++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lpl;IBI)Leaa;", line = 271)
    public static final class43 method3142(class612 arg0, int arg1, byte arg2, int arg3) {
        field7953++;
        if (arg2 > -91) {
            return null;
        }
        class630 var4 = new class630(arg0.method3365(arg3, -114, arg1));
        class43 var5 = new class43(arg3, var4.method3500((byte) 125), var4.method3500((byte) 121), var4.method3483(125), var4.method3483(120), var4.method3501(-9268) == 1, var4.method3501(-9268), var4.method3501(-9268));
        int var6 = var4.method3501(-9268);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field566.method239(new class312(var4.method3501(-9268), var4.method3470(13111), var4.method3470(13111), var4.method3470(13111), var4.method3470(13111), var4.method3470(13111), var4.method3470(13111), var4.method3470(13111), var4.method3470(13111)), (byte) 93);
        }
        var5.method260(113);
        return var5;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lrf;IZLpl;Lpl;)V", line = 366)
    public class568(class112 arg0, int arg1, boolean arg2, class612 arg3, class612 arg4) {
        this.field7941 = arg3;
        this.field7943 = arg2;
        this.field7955 = arg4;
        if (this.field7941 != null) {
            int var6 = this.field7941.method3342((byte) -107) - 1;
            this.field7941.method3349(var6, true);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)V", line = 307)
    public final void method3143(boolean arg0, int arg1) {
        field7947++;
        if (this.field7943 != arg0) {
            this.field7943 = arg0;
            if (arg1 == -6407) {
                this.method3135(arg1 + 27714);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V", line = 333)
    public final void method3144(int arg0, boolean arg1) {
        field7942++;
        if (arg1 == this.field7949) {
            return;
        }
        this.field7949 = arg1;
        this.method3135(arg0 + 21306);
        if (arg0 != 1) {
            method3139(-81, -4, -92);
        }
    }
}
