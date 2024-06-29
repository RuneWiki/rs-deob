import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class15 extends class235 {

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
    private int field348 = -32768;

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!bc", name = "nb", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!bc", name = "qb", descriptor = "I")
    private int field354;

    @OriginalMember(owner = "client!bc", name = "sb", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!bc", name = "rb", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!bc", name = "xb", descriptor = "Lkg;")
    private class115 field361;

    @OriginalMember(owner = "client!bc", name = "lb", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client!bc", name = "tb", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "Z")
    public static boolean field347 = false;

    @OriginalMember(owner = "client!bc", name = "pb", descriptor = "Loc;")
    public static class151 field353 = class137.method873(2, "Art");

    @OriginalMember(owner = "client!bc", name = "ub", descriptor = "I")
    public static int field358 = 0;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
    public static int field340 = -1;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!bc", name = "mb", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!bc", name = "ob", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!bc", name = "vb", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!bc", name = "wb", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
    public final int method74() {
        field359++;
        return this.field348;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lve;")
    public static final class223 method124(int arg0, int arg1) {
        if (arg0 != -1) {
            field353 = null;
        }
        field360++;
        class223 var2 = (class223) class64.field1244.method1318((byte) -113, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class206.field3654.method1208(arg1, (byte) -74, 27);
        class223 var4 = new class223();
        if (var3 != null) {
            var4.method1404(new class229(var3), true);
        }
        class64.field1244.method1324(var4, 18373, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static void method125(int arg0) {
        if (arg0 != 29423) {
            field344 = -21;
        }
        field353 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[Lwd;)V")
    public static final void method126(int arg0, int arg1, class232[] arg2) {
        if (arg0 <= 85) {
            field340 = -56;
        }
        field339++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class232 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field4173 == 0) {
                    if (var4.field4239 != null) {
                        method126(97, arg1, var4.field4239);
                    }
                    class147 var5 = (class147) class227.field3961.method1538((long) var4.field4261, (byte) 127);
                    if (var5 != null) {
                        class142.method917(var5.field2631, arg1, 255);
                    }
                }
                if (arg1 == 0 && var4.field4268 != null) {
                    class224 var6 = new class224();
                    var6.field3905 = var4;
                    var6.field3895 = var4.field4268;
                    class110.method664(1785261985, var6);
                }
                if (arg1 == 1 && var4.field4152 != null) {
                    if (var4.field4174 >= 0) {
                        class232 var7 = class175.method1115(-22192, var4.field4261);
                        if (var7 == null || var7.field4239 == null || var4.field4174 >= var7.field4239.length || var7.field4239[var4.field4174] != var4) {
                            continue;
                        }
                    }
                    class224 var8 = new class224();
                    var8.field3895 = var4.field4152;
                    var8.field3905 = var4;
                    class110.method664(1785261985, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method127(int arg0, String arg1) throws ClassNotFoundException {
        field352++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg0 != -1) {
                field358 = 122;
            }
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field343++;
        class235 var11 = this.method128(1);
        if (var11 != null) {
            var11.method72(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field348 = var11.method74();
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Lwg;")
    private final class235 method128(int arg0) {
        field346++;
        class93 var2 = class5.method32((byte) 59, this.field351);
        if (var2.field1746 != null) {
            var2 = var2.method591((byte) -122);
        }
        if (var2 == null) {
            return null;
        }
        if (this.field361 != null) {
            int var3 = class200.field3541 - this.field349;
            if (var3 > 100 && this.field361.field2055 > 0) {
                int var4 = this.field361.field2056.length - this.field361.field2055;
                while (this.field357 < var4 && var3 > this.field361.field2051[this.field357]) {
                    var3 -= this.field361.field2051[this.field357];
                    this.field357++;
                }
                if (var4 <= this.field357) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field361.field2056.length; var6++) {
                        var5 += this.field361.field2051[var6];
                    }
                    var3 %= var5;
                }
            }
            label82: {
                do {
                    do {
                        if (this.field361.field2051[this.field357] >= var3) {
                            break label82;
                        }
                        var3 -= this.field361.field2051[this.field357];
                        this.field357++;
                    } while (this.field357 < this.field361.field2056.length);
                    this.field357 -= this.field361.field2055;
                } while (this.field357 >= 0 && this.field357 < this.field361.field2056.length);
                this.field361 = null;
            }
            this.field349 = class200.field3541 - var3;
        }
        int var7;
        int var8;
        if (this.field354 == 1 || this.field354 == 3) {
            var7 = var2.field1697;
            var8 = var2.field1715;
        } else {
            var7 = var2.field1715;
            var8 = var2.field1697;
        }
        int var9 = this.field341 + (var8 >> 1);
        int var10 = this.field341 + (arg0 + var8 >> 1);
        int var11 = (var7 >> 1) + this.field342;
        int var12 = (var7 + 1 >> 1) + this.field342;
        int[][] var13 = class104.field1872[this.field356];
        int var14 = var13[var9][var11] + var13[var9][var12] + var13[var10][var11] + var13[var10][var12] >> 2;
        int var15 = (this.field341 << 7) + (var8 << 6);
        int var16 = (this.field342 << 7) + (var7 << 6);
        class159 var17;
        if (this.field361 == null) {
            var17 = var2.method595(27, var15, this.field355, var14, this.field354, var16, var13, false);
        } else {
            var17 = var2.method586(this.field355, arg0 ^ 0xFFFFB5DA, var14, var15, var13, this.field354, this.field357, var16, this.field361);
        }
        return var17 == null ? null : var17.field2865;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(IIIIIIIZLwg;)V")
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class235 arg8) {
        this.field342 = arg5;
        this.field351 = arg0;
        this.field341 = arg4;
        this.field354 = arg2;
        this.field356 = arg3;
        this.field355 = arg1;
        if (arg6 != -1) {
            this.field361 = class197.method1233(-117, arg6);
            this.field349 = class200.field3541 - 1;
            this.field357 = 0;
            if (this.field361.field2047 == 0 && arg8 != null && arg8 instanceof class15) {
                class15 var10 = (class15) arg8;
                if (this.field361 == var10.field361) {
                    this.field357 = var10.field357;
                    this.field349 = var10.field349;
                    return;
                }
            }
            if (arg7 && this.field361.field2055 != -1) {
                this.field357 = (int) ((double) this.field361.field2056.length * Math.random());
                this.field349 -= (int) (Math.random() * (double) this.field361.field2051[this.field357]);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BII)V")
    public static final void method129(byte arg0, int arg1, int arg2) {
        field350++;
        if (class156.field2825 != 0 && arg1 != -1) {
            class189.method1168(false, class106.field1884, 0, class156.field2825, arg1, (byte) -75);
            class149.field2669 = true;
        }
        if (arg0 >= -49) {
            method126(-123, -35, null);
        }
    }
}
