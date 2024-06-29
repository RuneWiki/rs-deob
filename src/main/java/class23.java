import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class23 extends class212 {

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    private int field403 = 4096;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "I")
    private int field406 = 0;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field399 = (int) (Math.random() * 33.0D) + -16;

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "Lsc;")
    public static class181 field405 = class149.method967(255, "Art");

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "Lsc;")
    public static class181 field402 = class149.method967(255, "Mem:");

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "[I")
    public static int[] field410;

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "[[[I")
    public static int[][][] field407;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 < 25) {
            return null;
        } else {
            ++field397;
            int[] var3 = super.field3640.method737(true, arg0);
            if (super.field3640.field1813) {
                int[] var4 = this.method1405(arg0, 0, 80);
                for (int var5 = 0; var5 < class26.field452; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = this.field406 <= var6 && var6 <= this.field403 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBIIII)V")
    public static final void method203(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= -85) {
            field402 = null;
        }
        if (arg5 <= class125.field2056 && ~field408 >= ~arg4) {
            boolean var6;
            if (class11.field219 <= arg2) {
                if (class124.field2032 >= arg2) {
                    var6 = true;
                } else {
                    arg2 = class124.field2032;
                    var6 = false;
                }
            } else {
                arg2 = class11.field219;
                var6 = false;
            }
            boolean var7;
            if (arg0 < class11.field219) {
                arg0 = class11.field219;
                var7 = false;
            } else if (~arg0 < ~class124.field2032) {
                arg0 = class124.field2032;
                var7 = false;
            } else {
                var7 = true;
            }
            if (field408 <= arg5) {
                class171.method1133(class149.field2507[arg5++], arg2, arg3, arg0, (byte) 125);
            } else {
                arg5 = field408;
            }
            if (class125.field2056 >= arg4) {
                class171.method1133(class149.field2507[arg4--], arg2, arg3, arg0, (byte) 125);
            } else {
                arg4 = class125.field2056;
            }
            if (var6 && var7) {
                for (int var8 = arg5; ~arg4 <= ~var8; ++var8) {
                    int[] var9 = class149.field2507[var8];
                    var9[arg2] = var9[arg0] = arg3;
                }
            } else if (!var6) {
                if (var7) {
                    for (int var10 = arg5; ~arg4 <= ~var10; ++var10) {
                        class149.field2507[var10][arg0] = arg3;
                    }
                }
            } else {
                for (int var11 = arg5; var11 <= arg4; ++var11) {
                    class149.field2507[var11][arg2] = arg3;
                }
            }
        }
        ++field401;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class60 var7 = new class60();
        var7.field909 = arg1 / 128;
        var7.field902 = arg2 / 128;
        var7.field903 = arg3 / 128;
        var7.field908 = arg4 / 128;
        var7.field901 = arg0;
        var7.field912 = arg1;
        var7.field922 = arg2;
        var7.field905 = arg3;
        var7.field913 = arg4;
        var7.field904 = arg5;
        var7.field914 = arg6;
        class262.field4569[class213.field3671++] = var7;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V")
    public static void method205(int arg0) {
        field405 = null;
        field402 = null;
        field407 = null;
        if (arg0 == 0) {
            field410 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field398;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field403 = arg0.method1535(2);
            }
        } else {
            this.field406 = arg0.method1535(arg2 + 5);
        }
        if (arg2 != -3) {
            method204(-54, -39, 111, -23, -28, -68, -69);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class23() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(III)V")
    public static final void method206(int arg0, int arg1, int arg2) {
        ++field400;
        if (arg0 <= 123) {
            field409 = -23;
        }
        class165 var3 = class244.method1652(-126, arg1);
        int var4 = var3.field2810;
        int var5 = var3.field2806;
        int var6 = var3.field2811;
        int var7 = class131.field2170[-var5 + var6];
        if (~arg2 > -1 || ~var7 > ~arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class152.method989(-127, var4, class196.field3426[var4] & ~var8 | var8 & arg2 << var5);
    }
}
