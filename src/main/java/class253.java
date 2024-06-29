import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class253 {

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "Leba;")
    private class614 field3928 = new class614();

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "Ljava/lang/String;")
    public String field3918;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3935 = new String[] { method2150(method2149("-pI;\f")), method2150(method2149("'q\u000b\u0015")), method2150(method2149("2*IWY")), method2150(method2149("-pI3\f")), method2150(method2149("-pI<\f")), method2150(method2149("-pI0\f")), method2150(method2149("-pI8\f")), method2150(method2149("-pI?\f")), method2150(method2149("-pI:\f")), method2150(method2149("-pI1\f")), method2150(method2149("-pI>\f")), method2150(method2149("-pI=\f")), method2150(method2149("-pIEM'm\u0013G\f")) };

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    private volatile int field3932;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "Leba;")
    public static class614 field3926;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "Ltq;")
    private class654 field3933;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "Lhg;")
    public static class718 field3922;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "Lhg;")
    public static class718 field3929;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)Z", line = 8)
    public final boolean method2139(byte arg0) {
        try {
            field3931++;
            if (arg0 != -53) {
                field3926 = null;
            }
            return this.field3932 == 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3935[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)Z", line = 19)
    public static final boolean method2140(int arg0, byte arg1) {
        try {
            field3930++;
            int var2 = 71 % ((41 - arg1) / 47);
            return arg0 == 0 || arg0 == 2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3935[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILdf;)V", line = 30)
    public final void method2141(int arg0, class420 arg1) {
        try {
            if (arg0 != 30234) {
                this.method2141(6, null);
            }
            field3923++;
            arg1.field6212 = false;
            class614 var3 = this.field3928;
            synchronized (this.field3928) {
                this.field3928.method4541((byte) 38, arg1);
                this.field3932++;
            }
            if (this.field3933 != null) {
                class654 var4 = this.field3933;
                synchronized (this.field3933) {
                    this.field3933.notify();
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field3935[11] + arg0 + ',' + (arg1 == null ? field3935[1] : field3935[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V", line = 52)
    public static void method2142(int arg0) {
        try {
            field3922 = null;
            field3926 = null;
            field3929 = null;
            if (arg0 != -1) {
                field3934 = 20;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3935[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILhm;)V", line = 70)
    public final void method2143(int arg0, class232 arg1) {
        try {
            field3921++;
            class614 var3 = this.field3928;
            synchronized (this.field3928) {
                this.field3928.method4541((byte) 127, arg1);
                this.field3932++;
            }
            if (this.field3933 != null) {
                class654 var4 = this.field3933;
                synchronized (this.field3933) {
                    this.field3933.notify();
                }
            }
            if (arg0 > -1) {
                method2146(-24);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field3935[3] + arg0 + ',' + (arg1 == null ? field3935[1] : field3935[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ltq;B)V", line = 92)
    public final void method2144(class654 arg0, byte arg1) {
        try {
            this.field3933 = arg0;
            field3925++;
            if (arg1 < 74) {
                method2142(-79);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3935[9] + (arg0 == null ? field3935[1] : field3935[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BIIII)V", line = 103)
    public static final void method2145(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field3919++;
            if (arg0 == 77) {
                class200.field3119 = arg1;
                class676.field9797 = arg2;
                class381.field5786 = arg3;
                class676.field9807 = arg4;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3935[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)I", line = 117)
    public static final int method2146(int arg0) {
        try {
            if (arg0 != -3) {
                field3934 = -70;
            }
            field3916++;
            return class222.field3408;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3935[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Lte;", line = 130)
    public final class640 method2147(boolean arg0) {
        try {
            field3927++;
            Object var2 = null;
            class614 var3 = this.field3928;
            class640 var4;
            synchronized (this.field3928) {
                var4 = this.field3928.method4538(false);
                var4.method4696(109);
                this.field3932--;
            }
            return arg0 ? var4 : null;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3935[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Ldf;B)V", line = 151)
    public final void method2148(class420 arg0, byte arg1) {
        try {
            field3924++;
            if (arg1 >= -3) {
                field3922 = null;
            }
            arg0.field6212 = true;
            class614 var3 = this.field3928;
            synchronized (this.field3928) {
                this.field3928.method4541((byte) -109, arg0);
                this.field3932++;
            }
            if (this.field3933 != null) {
                class654 var4 = this.field3933;
                synchronized (this.field3933) {
                    this.field3933.notify();
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field3935[7] + (arg0 == null ? field3935[1] : field3935[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 178)
    public class253(String arg0) {
        try {
            this.field3918 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3935[12] + (arg0 == null ? field3935[1] : field3935[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2149(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2150(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
