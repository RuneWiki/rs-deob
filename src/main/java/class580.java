import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class580 {

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "Lui;")
    private class251 field8387 = new class251(256);

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "Llga;")
    private class47 field8389;

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8392 = new String[] { method4308(method4307("\u001c\u007fNRGE")), method4308(method4307("\u001c\u007fNRFE")), method4308(method4307("\u001c\u007fNRAE")), method4308(method4307("\u001c\u007fNR@E")), method4308(method4307("\u001c\u007fNREE")), method4308(method4307("\u0003oC\u0010")), method4308(method4307("\u00164\u0001Ry")), method4308(method4307("\u001c\u007fNR8\u0004tF\b:E")) };

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "Lsb;")
    public static class261 field8390 = new class261(101, 10);

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "Lmv;")
    public static class125 field8391 = new class125(60, 3);

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(II)Lij;")
    public final class539 method4302(int arg0, int arg1) {
        try {
            field8386++;
            class251 var3 = this.field8387;
            class539 var4;
            synchronized (this.field8387) {
                var4 = (class539) this.field8387.method2053(0, (long) arg0);
            }
            if (arg1 != 60) {
                return null;
            } else if (var4 == null) {
                class47 var5 = this.field8389;
                byte[] var6;
                synchronized (this.field8389) {
                    var6 = this.field8389.method512(arg0, 26, (byte) -64);
                }
                class539 var7 = new class539();
                if (var6 != null) {
                    var7.method4084(new class711(var6), -1);
                }
                class251 var8 = this.field8387;
                synchronized (this.field8387) {
                    this.field8387.method2051((long) arg0, var7, 93);
                    return var7;
                }
            } else {
                return var4;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field8392[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(BI)V")
    public final void method4303(byte arg0, int arg1) {
        try {
            int var3 = -64 % ((arg0 + 47) / 48);
            class251 var4 = this.field8387;
            synchronized (this.field8387) {
                this.field8387.method2038(0, arg1);
            }
            field8385++;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8392[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public final void method4304(int arg0) {
        try {
            class251 var2 = this.field8387;
            synchronized (this.field8387) {
                this.field8387.method2047(11914);
            }
            if (arg0 == 256) {
                field8384++;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8392[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
    public final void method4305(int arg0) {
        try {
            field8388++;
            class251 var2 = this.field8387;
            synchronized (this.field8387) {
                if (arg0 >= 19) {
                    this.field8387.method2043(false);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8392[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)V")
    public static void method4306(boolean arg0) {
        try {
            field8390 = null;
            if (!arg0) {
                method4306(false);
            }
            field8391 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8392[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lfs;ILlga;)V")
    public class580(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field8389 = arg2;
            this.field8389.method509(true, 26);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8392[7] + (arg0 == null ? field8392[5] : field8392[6]) + ',' + arg1 + ',' + (arg2 == null ? field8392[5] : field8392[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4307(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4308(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 124;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
