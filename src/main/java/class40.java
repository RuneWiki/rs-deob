import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class40 extends class139 {

    @OriginalMember(owner = "client!di", name = "X", descriptor = "I")
    private int field817 = 2048;

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
    private int field819 = 10;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
    private int field821 = 0;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "Ljava/lang/Object;")
    public static Object field814 = new Object();

    @OriginalMember(owner = "client!di", name = "db", descriptor = "Lfc;")
    public static class54 field823 = new class54(5);

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "I")
    public static int field825 = 0;

    @OriginalMember(owner = "client!di", name = "hb", descriptor = "Lrf;")
    public static class163 field827 = class53.method392(90, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "Lrf;")
    public static class163 field824 = class53.method392(98, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "Lrf;")
    private static class163 field826 = class53.method392(111, "Members only world");

    @OriginalMember(owner = "client!di", name = "kb", descriptor = "Lrf;")
    public static class163 field830 = field826;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!di", name = "V", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!di", name = "lb", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "[I")
    private int[] field822;

    @OriginalMember(owner = "client!di", name = "ib", descriptor = "[I")
    private int[] field828;

    @OriginalMember(owner = "client!di", name = "jb", descriptor = "[[[I")
    public static int[][][] field829;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg1 == 21) {
            ++field815;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field821 = arg2.method344(255);
                    }
                } else {
                    this.field817 = arg2.method390((byte) 126);
                }
            } else {
                this.field819 = arg2.method344(arg1 ^ 234);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIB)V")
    public static final void method250(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field831;
        int var5 = -57 % ((-10 - arg4) / 50);
        for (int var6 = 0; ~var6 > ~class48.field944; ++var6) {
            if (~arg1 > ~(class20.field351[var6] + class106.field2207[var6]) && ~(arg1 + arg3) < ~class106.field2207[var6] && class99.field2092[var6] + class161.field3258[var6] > arg0 && class99.field2092[var6] < arg0 + arg2) {
                class27.field498[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg1 != 7451) {
            this.field828 = null;
        }
        int[] var3 = super.field2859.method1319(arg1 ^ -7540, arg0);
        if (super.field2859.field3966) {
            int var4 = class180.field3607[arg0];
            if (this.field821 != 0) {
                for (int var5 = 0; ~var5 > ~class23.field402; ++var5) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class189.field3772[var5];
                    int var9 = this.field821;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var7 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var7 = (var8 - 4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var7 = var8;
                    }
                    for (int var10 = 0; ~var10 > ~this.field819; ++var10) {
                        if (~this.field822[var10] >= ~var7 && this.field822[var10 + 1] > var7) {
                            if (~var7 > ~this.field828[var10]) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field819; ++var12) {
                    if (this.field822[var12] <= var4 && this.field822[var12 - -1] > var4) {
                        if (this.field828[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class123.method827(var3, 0, class23.field402, var11);
            }
        }
        ++field813;
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(B)V")
    public static final void method251(byte arg0) {
        class105.field2195.method328(arg0 ^ -80);
        ++field816;
        int var1 = class105.field2195.method331(8, -2055311549);
        if (~var1 > ~class93.field2013) {
            for (int var2 = var1; ~var2 > ~class93.field2013; ++var2) {
                class168.field3434[class72.field1522++] = class170.field3459[var2];
            }
        }
        if (var1 > class93.field2013) {
            throw new RuntimeException("gnpov1");
        } else {
            class93.field2013 = 0;
            int var3 = 0;
            if (arg0 != 61) {
                field830 = null;
            }
            while (~var1 < ~var3) {
                int var4 = class170.field3459[var3];
                class70 var5 = class187.field3723[var4];
                int var6 = class105.field2195.method331(1, arg0 ^ -2055311490);
                if (var6 == 0) {
                    class170.field3459[class93.field2013++] = var4;
                    var5.field711 = class51.field1023;
                } else {
                    int var7 = class105.field2195.method331(2, -2055311549);
                    if (~var7 == -1) {
                        class170.field3459[class93.field2013++] = var4;
                        var5.field711 = class51.field1023;
                        class52.field1088[class181.field3638++] = var4;
                    } else if (var7 == 1) {
                        class170.field3459[class93.field2013++] = var4;
                        var5.field711 = class51.field1023;
                        int var8 = class105.field2195.method331(3, arg0 + -2055311610);
                        var5.method223(false, var8, false);
                        int var9 = class105.field2195.method331(1, -2055311549);
                        if (var9 == 1) {
                            class52.field1088[class181.field3638++] = var4;
                        }
                    } else if (var7 == 2) {
                        class170.field3459[class93.field2013++] = var4;
                        var5.field711 = class51.field1023;
                        int var10 = class105.field2195.method331(3, -2055311549);
                        var5.method223(false, var10, true);
                        int var11 = class105.field2195.method331(3, -2055311549);
                        var5.method223(false, var11, true);
                        int var12 = class105.field2195.method331(1, -2055311549);
                        if (var12 == 1) {
                            class52.field1088[class181.field3638++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class168.field3434[class72.field1522++] = var4;
                    }
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        this.method253(arg0 ^ 2714);
        ++field818;
        if (arg0 != 0) {
            this.method64(-102, -98, (class52) null);
        }
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V")
    public static void method252(int arg0) {
        field829 = null;
        field823 = null;
        field826 = null;
        field827 = null;
        field830 = null;
        if (arg0 > 17) {
            field824 = null;
            field814 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V")
    private final void method253(int arg0) {
        this.field828 = new int[this.field819 + 1];
        int var2 = 0;
        this.field822 = new int[this.field819 - -1];
        ++field820;
        int var3 = 4096 / this.field819;
        int var4 = this.field817 * var3 >> 12;
        if (arg0 == 2714) {
            for (int var5 = 0; this.field819 > var5; ++var5) {
                this.field822[var5] = var2;
                this.field828[var5] = var2 + var4;
                var2 += var3;
            }
            this.field822[this.field819] = 4096;
            this.field828[this.field819] = this.field828[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class40() {
        super(0, true);
    }
}
