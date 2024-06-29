import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class614 {

    @OriginalMember(owner = "client!eba", name = "i", descriptor = "Lte;")
    private class640 field8970 = new class640();

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8979 = new String[] { method4548(method4547("<IKw\u0007q")), method4548(method4547("<IKw\u0003q")), method4548(method4547("<IKw\u0001q")), method4548(method4547("\"\u0005\u0004w;")), method4548(method4547("<IKw\fq")), method4548(method4547("7^F5")), method4548(method4547("<IKw\u0005q")), method4548(method4547("<IKw\u000fq")), method4548(method4547("<IKwz0EC-xq")), method4548(method4547("<IKw\u0004q")), method4548(method4547("<IKw\u0000q")), method4548(method4547("<IKw\u000eq")), method4548(method4547("<IKw\u0002q")) };

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "Llk;")
    public static class613 field8965 = new class613();

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "F")
    public static float field8968;

    @OriginalMember(owner = "client!eba", name = "k", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!eba", name = "l", descriptor = "Lla;")
    public static class476 field8975;

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "Lte;")
    private class640 field8978;

    @OriginalMember(owner = "client!eba", name = "j", descriptor = "[[I")
    public static int[][] field8972;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "[[[B")
    public static byte[][][] field8974;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)I", line = 4)
    public final int method4537(int arg0) {
        try {
            field8964++;
            if (arg0 >= -30) {
                field8968 = 1.163315F;
            }
            int var2 = 0;
            for (class640 var3 = this.field8970.field9298; var3 != this.field8970; var3 = var3.field9298) {
                var2++;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8979[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)Lte;", line = 28)
    public final class640 method4538(boolean arg0) {
        try {
            field8967++;
            if (arg0) {
                return null;
            }
            class640 var2 = this.field8970.field9298;
            if (this.field8970 == var2) {
                this.field8978 = null;
                return null;
            } else {
                this.field8978 = var2.field9298;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8979[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V", line = 54)
    public final void method4539(byte arg0) {
        try {
            if (arg0 == 93) {
                field8971++;
                while (true) {
                    class640 var2 = this.field8970.field9298;
                    if (this.field8970 == var2) {
                        this.field8978 = null;
                        return;
                    }
                    var2.method4696(-100);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8979[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I[[S[[F)[[S", line = 75)
    public static final short[][] method4540(int arg0, short[][] arg1, float[][] arg2) {
        try {
            int var3 = 0;
            int var4 = -17 / (-arg0 / 63);
            while (var3 < arg2.length) {
                for (int var5 = 0; var5 < arg1[var3].length; var5++) {
                    arg1[var3][var5] = (short) ((int) (arg2[var3][var5] * 16383.0F));
                }
                var3++;
            }
            field8976++;
            return arg1;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field8979[6] + arg0 + ',' + (arg1 == null ? field8979[5] : field8979[3]) + ',' + (arg2 == null ? field8979[5] : field8979[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLte;)V", line = 105)
    public final void method4541(byte arg0, class640 arg1) {
        try {
            if (arg1.field9295 != null) {
                arg1.method4696(-104);
            }
            field8963++;
            arg1.field9295 = this.field8970.field9295;
            arg1.field9298 = this.field8970;
            arg1.field9295.field9298 = arg1;
            arg1.field9298.field9295 = arg1;
            int var3 = 16 / ((-arg0 - 34) / 59);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8979[4] + arg0 + ',' + (arg1 == null ? field8979[5] : field8979[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)Z", line = 122)
    public final boolean method4542(int arg0) {
        try {
            field8966++;
            if (arg0 != 0) {
                this.field8978 = null;
            }
            return this.field8970.field9298 == this.field8970;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8979[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)Lte;", line = 136)
    public final class640 method4543(int arg0) {
        try {
            field8969++;
            if (arg0 != 0) {
                field8972 = null;
            }
            class640 var2 = this.field8978;
            if (this.field8970 == var2) {
                this.field8978 = null;
                return null;
            } else {
                this.field8978 = var2.field9298;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8979[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V", line = 221)
    public class614() {
        try {
            this.field8970.field9298 = this.field8970;
            this.field8970.field9295 = this.field8970;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8979[8] + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "(I)V", line = 163)
    public static void method4544(int arg0) {
        try {
            field8974 = null;
            field8965 = null;
            field8975 = null;
            field8972 = null;
            if (arg0 != 21608) {
                field8975 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8979[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)Lte;", line = 178)
    public final class640 method4545(byte arg0) {
        try {
            if (arg0 != -80) {
                this.method4539((byte) 53);
            }
            field8977++;
            class640 var2 = this.field8970.field9298;
            if (this.field8970 == var2) {
                return null;
            } else {
                var2.method4696(26);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8979[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "(B)Lte;", line = 197)
    public final class640 method4546(byte arg0) {
        try {
            field8973++;
            if (arg0 != 122) {
                return null;
            }
            class640 var2 = this.field8970.field9295;
            if (this.field8970 == var2) {
                this.field8978 = null;
                return null;
            } else {
                this.field8978 = var2.field9295;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8979[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4547(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4548(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
