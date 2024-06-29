import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class204 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Liha;")
    private class29 field3203 = new class29(64);

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Liha;")
    public class29 field3204 = new class29(2);

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lgda;")
    public class58 field3201;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Lgda;")
    private class58 field3197;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3205 = new String[] { method1848(method1847("#\b\"\u0004\u001b")), method1848(method1847("#\b\"\u0001\u001b")), method1848(method1847("#\b\"\u0005\u001b")), method1848(method1847("#\b\"\u0003\u001b")), method1848(method1847("#\b\"\u0006\u001b")), method1848(method1847(" \u0018`+")), method1848(method1847("5C\"iN")), method1848(method1847("#\b\"{Z \u0004xy\u001b")), method1848(method1847("#\b\"\u0000\u001b")), method1848(method1847("#\b\"\u0002\u001b")) };

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static final void method1840(int arg0) {
        try {
            class29 var1 = class159.field2287;
            synchronized (class159.field2287) {
                if (arg0 != 64) {
                    return;
                }
                class159.field2287.method304(arg0 - 63);
            }
            field3200++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3205[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field3202++;
            int var8 = class694.method5039(class478.field7264, class310.field5088, 0, arg1);
            int var9 = class694.method5039(class478.field7264, class310.field5088, 0, arg4);
            int var10 = class694.method5039(class779.field11374, class546.field8030, 0, arg6);
            int var11 = class694.method5039(class779.field11374, class546.field8030, 0, arg3);
            int var12 = class694.method5039(class478.field7264, class310.field5088, 0, arg1 + arg5);
            int var13 = class694.method5039(class478.field7264, class310.field5088, arg2 - 30548, -arg5 + arg4);
            if (arg2 != 30548) {
                method1841(71, -105, -85, 79, 68, 46, -67, -80);
            }
            for (int var14 = var8; var14 < var12; var14++) {
                class545.method4051(var10, arg7, var11, class193.field3047[var14], -110);
            }
            for (int var15 = var9; var15 > var13; var15--) {
                class545.method4051(var10, arg7, var11, class193.field3047[var15], -114);
            }
            int var16 = class694.method5039(class779.field11374, class546.field8030, 0, arg5 + arg6);
            int var17 = class694.method5039(class779.field11374, class546.field8030, 0, arg3 - arg5);
            for (int var18 = var12; var18 <= var13; var18++) {
                int[] var19 = class193.field3047[var18];
                class545.method4051(var10, arg7, var16, var19, -109);
                class545.method4051(var16, arg0, var17, var19, -110);
                class545.method4051(var17, arg7, var11, var19, -126);
            }
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field3205[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Lsb;")
    public final class305 method1842(int arg0, int arg1) {
        try {
            field3194++;
            class29 var3 = this.field3203;
            class305 var4;
            synchronized (this.field3203) {
                var4 = (class305) this.field3203.method302(arg1 ^ 0xFFFFFF92, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field3197;
            byte[] var6;
            synchronized (this.field3197) {
                var6 = this.field3197.method604((byte) -128, arg0, arg1);
            }
            class305 var7 = new class305();
            var7.field4926 = this;
            if (var6 != null) {
                var7.method2619(new class176(var6), (byte) 3);
            }
            class29 var8 = this.field3203;
            synchronized (this.field3203) {
                this.field3203.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field3205[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static final void method1843(byte arg0) {
        try {
            field3196++;
            if (arg0 == 92 && class305.field4919 == null || class266.field4305 == null) {
                class266.field4305 = new int[256];
                class305.field4919 = new int[256];
                for (int var1 = 0; var1 < 256; var1++) {
                    double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                    class305.field4919[var1] = (int) (Math.sin(var2) * 4096.0D);
                    class266.field4305[var1] = (int) (Math.cos(var2) * 4096.0D);
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3205[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public final void method1844(int arg0) {
        try {
            if (arg0 != 256) {
                this.field3203 = null;
            }
            field3199++;
            class29 var2 = this.field3203;
            synchronized (this.field3203) {
                this.field3203.method304(1);
            }
            class29 var3 = this.field3204;
            synchronized (this.field3204) {
                this.field3204.method304(1);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3205[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V")
    public final void method1845(boolean arg0, int arg1) {
        try {
            field3195++;
            class29 var3 = this.field3203;
            synchronized (this.field3203) {
                this.field3203.method294(arg1, -630);
            }
            class29 var4 = this.field3204;
            synchronized (this.field3204) {
                if (arg0) {
                    this.field3204 = null;
                }
                this.field3204.method294(arg1, -630);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3205[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public final void method1846(int arg0) {
        try {
            field3198++;
            class29 var2 = this.field3203;
            synchronized (this.field3203) {
                this.field3203.method298(5);
            }
            class29 var3 = this.field3204;
            synchronized (this.field3204) {
                this.field3204.method298(5);
            }
            if (arg0 != 256) {
                this.field3203 = null;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3205[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lpo;ILgda;Lgda;)V")
    public class204(class585 arg0, int arg1, class58 arg2, class58 arg3) {
        try {
            this.field3201 = arg3;
            this.field3197 = arg2;
            this.field3197.method580(104, 33);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3205[7] + (arg0 == null ? field3205[5] : field3205[6]) + ',' + arg1 + ',' + (arg2 == null ? field3205[5] : field3205[6]) + ',' + (arg3 == null ? field3205[5] : field3205[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1847(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!me", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1848(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
