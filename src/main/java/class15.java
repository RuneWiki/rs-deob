import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 extends class51 {

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    private int field217 = 3216;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "[I")
    private int[] field216 = new int[3];

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
    private int field221 = 3216;

    @OriginalMember(owner = "client!bd", name = "jb", descriptor = "I")
    private int field226 = 4096;

    @OriginalMember(owner = "client!bd", name = "kb", descriptor = "Lbf;")
    public static class17 field227 = new class17(8);

    @OriginalMember(owner = "client!bd", name = "nb", descriptor = "Led;")
    public static class43 field230 = class191.method1219("Ihr Spielkonto wird bereits benutzt)3", false);

    @OriginalMember(owner = "client!bd", name = "mb", descriptor = "Led;")
    private static class43 field229 = class191.method1219("Loaded fonts", false);

    @OriginalMember(owner = "client!bd", name = "pb", descriptor = "[[[B")
    public static byte[][][] field232 = new byte[4][104][104];

    @OriginalMember(owner = "client!bd", name = "rb", descriptor = "Led;")
    public static class43 field234 = class191.method1219(" Sekunde(Xn(Y -Ubertragen)3", false);

    @OriginalMember(owner = "client!bd", name = "qb", descriptor = "Led;")
    public static class43 field233 = field229;

    @OriginalMember(owner = "client!bd", name = "ob", descriptor = "Led;")
    public static class43 field231 = class191.method1219("cross", false);

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!bd", name = "ib", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!bd", name = "lb", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
    private final void method62(byte arg0) {
        ++field220;
        double var2 = Math.cos((double) (this.field217 / 4096));
        this.field216[0] = (int) (var2 * Math.sin((double) (this.field221 / 4096)) * 4096.0D);
        this.field216[1] = (int) (Math.cos((double) (this.field221 / 4096)) * var2 * 4096.0D);
        this.field216[2] = (int) (4096.0D * Math.sin((double) (this.field217 / 4096)));
        int var4 = this.field216[0] * this.field216[0] >> 12;
        if (arg0 == -33) {
            int var5 = this.field216[1] * this.field216[1] >> 12;
            int var6 = this.field216[2] * this.field216[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
            if (var7 != 0) {
                this.field216[1] = (this.field216[1] << 12) / var7;
                this.field216[0] = (this.field216[0] << 12) / var7;
                this.field216[2] = (this.field216[2] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field217 = arg0.method555(-1113627096);
                }
            } else {
                this.field221 = arg0.method555(-1113627096);
            }
        } else {
            this.field226 = arg0.method555(-1113627096);
        }
        if (arg1 == 0) {
            ++field225;
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public static void method63(int arg0) {
        field233 = null;
        if (arg0 != 628) {
            field227 = null;
        }
        field234 = null;
        field231 = null;
        field230 = null;
        field229 = null;
        field232 = null;
        field227 = null;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field222;
        this.method62((byte) -33);
        if (arg0 >= -83) {
            field233 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBILa;I)V")
    public static final void method65(int arg0, byte arg1, int arg2, class1 arg3, int arg4) {
        ++field228;
        if (arg1 >= -15) {
            method65(102, (byte) -98, -107, (class1) null, -62);
        }
        if (class67.field1348 != arg3) {
            if (class41.field799 < 400) {
                class43 var5;
                if (~arg3.field14 != -1) {
                    var5 = class167.method1036(new class43[] { arg3.field23, class101.field1928, class194.field3806, class30.method161(arg3.field14, 10), class44.field877 }, true);
                } else {
                    var5 = class167.method1036(new class43[] { arg3.field23, class67.method421(class67.field1348.field21, arg3.field21, (byte) 115), class101.field1928, class1.field37, class30.method161(arg3.field21, 10), class44.field877 }, true);
                }
                if (~class161.field3259 == -2) {
                    class149.method926(class167.method1036(new class43[] { class193.field3740, class92.field1828, var5 }, true), class200.field3930, -117, arg0, 30, arg4, arg2);
                    ++class44.field874;
                } else if (!class174.field3464) {
                    for (int var6 = 7; var6 >= 0; --var6) {
                        if (class157.field3174[var6] != null) {
                            ++class20.field351;
                            short var7 = 0;
                            boolean var8 = false;
                            if (class157.field3174[var6].method250(63, class65.field1327)) {
                                if (~class67.field1348.field21 > ~arg3.field21) {
                                    var7 = 2000;
                                }
                                if (~class67.field1348.field10 != -1 && arg3.field10 != 0) {
                                    if (~class67.field1348.field10 == ~arg3.field10) {
                                        var7 = 2000;
                                    } else {
                                        var7 = 0;
                                    }
                                }
                            } else if (class122.field2449[var6]) {
                                var7 = 2000;
                            }
                            int var9 = class49.field983[var6] + var7;
                            class149.method926(class167.method1036(new class43[] { class124.field2465, var5 }, true), class157.field3174[var6], -10, arg0, var9, arg4, arg2);
                        }
                    }
                } else if ((class27.field486 & 8) == 8) {
                    ++class55.field1103;
                    class149.method926(class167.method1036(new class43[] { class29.field534, class92.field1828, var5 }, true), class137.field2852, 27, arg0, 42, arg4, arg2);
                }
                for (int var10 = 0; var10 < class41.field799; ++var10) {
                    if (~class40.field756[var10] == -41) {
                        class115.field2237[var10] = class167.method1036(new class43[] { class124.field2465, var5 }, true);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class15() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field224;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (arg0 != 16) {
            this.field221 = 95;
        }
        if (super.field1025.field154) {
            int[] var4 = this.method314(0, (byte) -126, arg1 - 1 & class71.field1407);
            int[] var5 = this.method314(0, (byte) -53, arg1);
            int[] var6 = this.method314(0, (byte) -102, class71.field1407 & arg1 + 1);
            for (int var7 = 0; ~var7 > ~class122.field2442; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field226;
                int var9 = (var5[class108.field2080 & var7 + 1] + -var5[var7 + -1 & class108.field2080]) * this.field226;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((var12 - -var13 + 4096) / 4096)) * 4096.0D);
                int var15;
                int var16;
                int var17;
                if (var14 != 0) {
                    var15 = var8 / var14;
                    var16 = var9 / var14;
                    var17 = 16777216 / var14;
                } else {
                    var17 = 0;
                    var15 = 0;
                    var16 = 0;
                }
                int var18 = this.field216[1] * var15 >> 12;
                int var19 = this.field216[2] * var17 >> 12;
                int var20 = this.field216[0] * var16 >> 12;
                var3[var7] = var18 + var20 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILcb;III)V")
    public static final void method66(int arg0, int arg1, class23 arg2, int arg3, int arg4, int arg5) {
        ++field219;
        class16 var6 = new class16();
        var6.field267 = arg2.field388;
        var6.field238 = arg5 * 128;
        var6.field247 = arg1;
        if (arg0 <= 5) {
            method66(91, 55, (class23) null, 60, -97, 32);
        }
        var6.field249 = arg2.field428;
        int var7 = arg2.field423;
        var6.field245 = arg2.field455;
        var6.field263 = arg2.field434 * 128;
        var6.field269 = arg4 * 128;
        var6.field262 = arg2.field413;
        int var8 = arg2.field424;
        if (arg3 == 1 || ~arg3 == -4) {
            var8 = arg2.field423;
            var7 = arg2.field424;
        }
        var6.field242 = (arg5 + var8) * 128;
        var6.field243 = (arg4 + var7) * 128;
        if (arg2.field438 != null) {
            var6.field239 = arg2;
            var6.method68(false);
        }
        class1.field31.method756(25541, var6);
        if (var6.field262 != null) {
            var6.field266 = (int) ((double) (-var6.field267 + var6.field249) * Math.random()) + var6.field267;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method67(String arg0, int arg1) throws ClassNotFoundException {
        ++field223;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg1 != 2) {
            return null;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else {
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }
}
