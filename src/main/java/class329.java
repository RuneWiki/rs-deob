import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class329 {

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "Ljt;")
    private class106 field4688 = new class106(64);

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "Ljt;")
    public class106 field4691 = new class106(50);

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "Lwd;")
    public class274 field4696 = new class274(250);

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "Lto;")
    private class8 field4697 = new class8();

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public int field4677;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "Lkw;")
    private class251 field4698;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "Lvd;")
    public class39 field4685;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "Lvd;")
    private class39 field4675;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "Z")
    private boolean field4680;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public int field4676;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field4699;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field4701;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4678;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4687;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "Lue;")
    public static class233 field4693;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
    public int field4700;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "Leba;")
    public static class590 field4694;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field4678 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field4687 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field4693 = new class233(0, -1);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V", line = 4)
    public final void method2077(int arg0, int arg1) {
        this.field4700 = arg1;
        field4682++;
        class106 var3 = this.field4691;
        synchronized (this.field4691) {
            this.field4691.method809(true);
        }
        if (arg0 > -106) {
            this.field4699 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V", line = 19)
    public final void method2078(int arg0, boolean arg1) {
        if (arg0 < 100) {
            method2087(true, (byte) -103, -117);
        }
        field4674++;
        if (arg1 != this.field4680) {
            this.field4680 = arg1;
            this.method2088(1623);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)Luo;", line = 36)
    public final class578 method2079(int arg0, byte arg1) {
        field4690++;
        class106 var3 = this.field4688;
        class578 var4;
        synchronized (this.field4688) {
            var4 = (class578) this.field4688.method803(123, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field4675;
        byte[] var6;
        synchronized (this.field4675) {
            var6 = this.field4675.method211(true, class238.method1580((byte) 117, arg0), class398.method2531(-85, arg0));
        }
        class578 var7 = new class578();
        var7.field8160 = arg0;
        var7.field8181 = this;
        var7.field8194 = new String[] { null, null, class430.field6377.method2679(this.field4677, 112), null, null };
        var7.field8215 = new String[] { null, null, null, null, class430.field6378.method2679(this.field4677, -107) };
        if (var6 != null) {
            var7.method3347((byte) -99, new class645(var6));
        }
        var7.method3356(-1031211570);
        if (var7.field8226 != -1) {
            var7.method3354(this.method2079(var7.field8189, (byte) 95), this.method2079(var7.field8226, (byte) 116), (byte) -8);
        }
        if (var7.field8169 != -1) {
            var7.method3352(this.method2079(var7.field8169, (byte) -27), this.method2079(var7.field8209, (byte) 117), 110);
        }
        int var8 = 22 % ((32 - arg1) / 56);
        if (!this.field4680 && var7.field8238) {
            var7.field8231 = class430.field6375.method2679(this.field4677, 100);
            var7.field8214 = 0;
            var7.field8215 = this.field4701;
            var7.field8192 = false;
            var7.field8194 = this.field4699;
            var7.field8219 = null;
            if (var7.field8183 != null) {
                boolean var9 = false;
                for (class184 var10 = var7.field8183.method2283(false); var10 != null; var10 = var7.field8183.method2282((byte) 68)) {
                    class323 var11 = this.field4698.method1653((int) var10.field2810, (byte) -119);
                    if (var11.field4606) {
                        var10.method1304((byte) 7);
                    } else {
                        var9 = true;
                    }
                }
                if (!var9) {
                    var7.field8183 = null;
                }
            }
        }
        class106 var12 = this.field4688;
        synchronized (this.field4688) {
            this.field4688.method801(1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 114)
    public final void method2080(int arg0) {
        class274 var2 = this.field4696;
        synchronized (this.field4696) {
            this.field4696.method1736(-42);
            if (arg0 != 0) {
                this.method2088(121);
            }
        }
        field4686++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V", line = 127)
    public static void method2081(boolean arg0) {
        field4693 = null;
        field4694 = null;
        if (arg0) {
            method2081(true);
        }
        field4678 = null;
        field4687 = null;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V", line = 145)
    public final void method2082(int arg0) {
        if (arg0 != -3179) {
            this.field4688 = null;
        }
        class106 var2 = this.field4688;
        synchronized (this.field4688) {
            this.field4688.method800(114);
        }
        field4679++;
        class106 var3 = this.field4691;
        synchronized (this.field4691) {
            this.field4691.method800(arg0 ^ 0xFFFFF3EF);
        }
        class274 var4 = this.field4696;
        synchronized (this.field4696) {
            this.field4696.method1739((byte) 89);
        }
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V", line = 164)
    public final void method2083(int arg0) {
        int var2 = -44 / ((arg0 - 53) / 49);
        field4695++;
        class106 var3 = this.field4691;
        synchronized (this.field4691) {
            this.field4691.method809(true);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V", line = 176)
    public final void method2084(boolean arg0, int arg1) {
        field4683++;
        class106 var3 = this.field4688;
        synchronized (this.field4688) {
            this.field4688.method807(arg1, -1);
        }
        class106 var4 = this.field4691;
        synchronized (this.field4691) {
            this.field4691.method807(arg1, -1);
            if (!arg0) {
                this.method2084(true, 118);
            }
        }
        class274 var5 = this.field4696;
        synchronized (this.field4696) {
            this.field4696.method1744(0, arg1);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lha;IIIIIILah;)Lpga;", line = 200)
    public final class536 method2085(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class386 arg7) {
        int var9 = -106 % ((-arg3 - 50) / 63);
        this.field4697.field97 = arg7 != null;
        this.field4697.field101 = arg0.field852;
        field4692++;
        this.field4697.field95 = arg1;
        this.field4697.field109 = arg2;
        this.field4697.field107 = arg4;
        this.field4697.field106 = arg5;
        this.field4697.field104 = arg6;
        return (class536) this.field4696.method1738(this.field4697, 108);
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lqg;IZLkw;Lvd;Lvd;)V", line = 396)
    public class329(class464 arg0, int arg1, boolean arg2, class251 arg3, class39 arg4, class39 arg5) {
        this.field4677 = arg1;
        this.field4698 = arg3;
        this.field4685 = arg5;
        this.field4675 = arg4;
        this.field4680 = arg2;
        if (this.field4675 == null) {
            this.field4676 = 0;
        } else {
            int var7 = this.field4675.method222((byte) 127) - 1;
            this.field4676 = this.field4675.method229(var7, 0) + var7 * 256;
        }
        this.field4699 = new String[] { null, null, class430.field6377.method2679(this.field4677, 107), null, null };
        this.field4701 = new String[] { null, null, null, null, class430.field6378.method2679(this.field4677, -93) };
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILah;IILda;IZLha;Lha;IIZ)Lpga;", line = 223)
    public final class536 method2086(int arg0, class386 arg1, int arg2, int arg3, class61 arg4, int arg5, boolean arg6, class60 arg7, class60 arg8, int arg9, int arg10, boolean arg11) {
        field4681++;
        class536 var13 = this.method2085(arg8, arg0, arg10, 14, arg3, arg5, arg9, arg1);
        if (var13 != null) {
            return var13;
        }
        class578 var14 = this.method2079(arg10, (byte) -63);
        if (arg9 > 1 && var14.field8233 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field8216[var16] <= arg9 && var14.field8216[var16] != 0) {
                    var15 = var14.field8233[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2079(var15, (byte) 105);
            }
        }
        if (arg2 != 32) {
            this.method2078(-2, false);
        }
        int[] var17 = var14.method3346(-21736, arg8, arg4, arg5, arg9, arg3, arg0, arg11, arg7, arg1);
        if (var17 == null) {
            return null;
        }
        class536 var18;
        if (arg6) {
            var18 = arg7.method531(32, 36, var17, 36, 0, (byte) -101);
        } else {
            var18 = arg8.method531(32, 36, var17, 36, 0, (byte) -101);
        }
        if (!arg6) {
            class8 var19 = new class8();
            var19.field101 = arg8.field852;
            var19.field97 = arg1 != null;
            var19.field107 = arg3;
            var19.field95 = arg0;
            var19.field106 = arg5;
            var19.field104 = arg9;
            var19.field109 = arg10;
            this.field4696.method1737(-77, var19, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZBI)V", line = 337)
    public static final void method2087(boolean arg0, byte arg1, int arg2) {
        field4689++;
        class384 var3 = class529.method3090(arg0, (byte) 98, arg2);
        if (arg1 <= 89) {
            method2081(false);
        }
        if (var3 != null) {
            var3.method1304((byte) 7);
        }
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V", line = 363)
    public final void method2088(int arg0) {
        class106 var2 = this.field4688;
        synchronized (this.field4688) {
            this.field4688.method809(true);
        }
        field4684++;
        class106 var3 = this.field4691;
        synchronized (this.field4691) {
            this.field4691.method809(true);
        }
        class274 var4 = this.field4696;
        synchronized (this.field4696) {
            this.field4696.method1736(-44);
        }
        if (arg0 != 1623) {
            this.field4691 = null;
        }
    }
}
