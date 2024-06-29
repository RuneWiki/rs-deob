import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class107 extends class27 {

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    private int field1942 = 2048;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    private int field1943 = 10;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    private int field1952 = 0;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "Lkb;")
    public static class93 field1948 = class76.method390("Hierhin gehen", 0);

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "Lkb;")
    public static class93 field1951 = class76.method390("Benutzen Sie bitte eine andere Welt)3", 0);

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "Lh;")
    public static class65 field1947;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "Ljg;")
    public static class89 field1950;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "[I")
    private int[] field1941;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "[I")
    private int[] field1946;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
    private final void method586(int arg0) {
        if (arg0 != -3) {
            this.field1942 = -65;
        }
        this.field1941 = new int[this.field1943 + 1];
        this.field1946 = new int[this.field1943 - -1];
        int var2 = 0;
        ++field1949;
        int var3 = 4096 / this.field1943;
        int var4 = this.field1942 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field1943; ++var5) {
            this.field1946[var5] = var2;
            this.field1941[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field1946[this.field1943] = 4096;
        this.field1941[this.field1943] = this.field1941[0] + 4096;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        this.method586(-3);
        if (arg0 <= 77) {
            this.method55(-96, true);
        }
        ++field1944;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg0 < 106) {
            field1951 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field1952 = arg2.method1054(128);
                }
            } else {
                this.field1942 = arg2.method1071(28101);
            }
        } else {
            this.field1943 = arg2.method1054(128);
        }
        ++field1953;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLa;I)V")
    public static final void method587(boolean arg0, class1 arg1, int arg2) {
        if (class62.field986 != null) {
            try {
                class62.field986.method10(false);
            } catch (Exception var8) {
            }
            class62.field986 = null;
        }
        class62.field986 = arg1;
        class102.method570(arg0, arg2 ^ 255);
        class191.field3736 = null;
        ++field1945;
        class106.field1937.field3153 = arg2;
        class79.field1414 = null;
        class61.field982 = 0;
        while (true) {
            class161 var3 = (class161) class9.field142.method612(arg2 ^ 12981);
            if (var3 == null) {
                while (true) {
                    class161 var4 = (class161) class126.field2368.method612(12981);
                    if (var4 == null) {
                        if (~class68.field1264 != -1) {
                            try {
                                class158 var5 = new class158(4);
                                var5.method1069(4, (byte) -26);
                                var5.method1069(class68.field1264, (byte) -26);
                                var5.method1061(0, 12184);
                                class62.field986.method6(0, var5.field3162, 4, (byte) 89);
                            } catch (IOException var7) {
                                try {
                                    class62.field986.method10(false);
                                } catch (Exception var6) {
                                }
                                class62.field986 = null;
                                ++class2.field38;
                            }
                        }
                        class175.field3457 = 0;
                        class121.field2244 = class171.method1146((byte) 119);
                        return;
                    }
                    class92.field1678.method80(var4, true);
                    class46.field733.method617(0, var4.field718, var4);
                    --class15.field271;
                    ++class85.field1549;
                }
            }
            class207.field4045.method617(0, var3.field718, var3);
            --class25.field373;
            ++class155.field3054;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(Z)V")
    public static void method588(boolean arg0) {
        field1950 = null;
        field1951 = null;
        field1948 = null;
        field1947 = null;
        if (arg0) {
            field1948 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class107() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field1954;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int var4 = class142.field2781[arg0];
            if (this.field1952 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1943; ++var6) {
                    if (~this.field1946[var6] >= ~var4 && ~this.field1946[var6 + 1] < ~var4) {
                        if (this.field1941[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class90.method474(var3, 0, class159.field3209, var5);
            } else {
                for (int var7 = 0; var7 < class159.field3209; ++var7) {
                    int var8 = 0;
                    int var9 = class97.field1808[var7];
                    short var10 = 0;
                    int var11 = this.field1952;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (var9 - var4 >> 1) + 2048;
                            }
                        } else {
                            var8 = (-4096 - -var4 + var9 >> 1) + 2048;
                        }
                    } else {
                        var8 = var9;
                    }
                    for (int var12 = 0; var12 < this.field1943; ++var12) {
                        if (~this.field1946[var12] >= ~var8 && this.field1946[var12 + 1] > var8) {
                            if (~var8 > ~this.field1941[var12]) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var10;
                }
            }
        }
        return var3;
    }
}
