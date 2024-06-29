import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class98 extends class105 {

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    private int field2075 = 0;

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "I")
    private int field2079 = 4096;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "Leh;")
    public static class47 field2078 = class195.method1282((byte) -4, "<col=ffff00>*V");

    @OriginalMember(owner = "client!kh", name = "ib", descriptor = "I")
    public static int field2081 = 0;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "Leh;")
    private static class47 field2074 = class195.method1282((byte) -4, "Use");

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "Leh;")
    public static class47 field2073 = class195.method1282((byte) -4, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!kh", name = "jb", descriptor = "Leh;")
    public static class47 field2082 = field2074;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "Lib;")
    public static class75 field2072 = new class75(5000);

    @OriginalMember(owner = "client!kh", name = "lb", descriptor = "Leh;")
    public static class47 field2084 = class195.method1282((byte) -4, "::fpson");

    @OriginalMember(owner = "client!kh", name = "ob", descriptor = "Leh;")
    public static class47 field2087 = class195.method1282((byte) -4, "Schlie-8en");

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!kh", name = "hb", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!kh", name = "kb", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!kh", name = "mb", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!kh", name = "nb", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!kh", name = "pb", descriptor = "Ljh;")
    public static class89 field2088;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        ++field2076;
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28) {
            int[][] var4 = this.method854(0, (byte) -82, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class149.field2928 > var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (var13 >= this.field2075) {
                    if (~this.field2079 > ~var13) {
                        var8[var11] = this.field2079;
                    } else {
                        var8[var11] = var13;
                    }
                } else {
                    var8[var11] = this.field2075;
                }
                if (var12 >= this.field2075) {
                    if (~this.field2079 > ~var12) {
                        var9[var11] = this.field2079;
                    } else {
                        var9[var11] = var12;
                    }
                } else {
                    var9[var11] = this.field2075;
                }
                if (~var14 <= ~this.field2075) {
                    if (var14 <= this.field2079) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field2079;
                    }
                } else {
                    var10[var11] = this.field2075;
                }
            }
        }
        return !arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    public static void method796(int arg0) {
        field2072 = null;
        field2084 = null;
        field2074 = null;
        field2088 = null;
        field2078 = null;
        field2087 = null;
        if (arg0 == 16027) {
            field2073 = null;
            field2082 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 != -256) {
            method798((Component) null, -124);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2179 = ~arg1.method604((byte) -125) == -2;
                }
            } else {
                this.field2079 = arg1.method569(26496);
            }
        } else {
            this.field2075 = arg1.method569(26496);
        }
        ++field2080;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class98() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)V")
    public static final void method797(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2991 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method798(Component arg0, int arg1) {
        ++field2083;
        if (arg1 > 3) {
            arg0.removeKeyListener(class147.field2881);
            arg0.removeFocusListener(class147.field2881);
            class106.field2216 = -1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)Lfe;")
    public static final class53 method799(byte arg0) {
        ++field2077;
        if (arg0 > -61) {
            method798((Component) null, -13);
        }
        try {
            return (class53) Class.forName("b").newInstance();
        } catch (Throwable var1) {
            return new class187();
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        if (arg1 < 78) {
            field2085 = -33;
        }
        int[] var3 = super.field2192.method336(-117, arg0);
        if (super.field2192.field770) {
            int[] var4 = this.method851(0, true, arg0);
            for (int var5 = 0; ~class149.field2928 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field2075) {
                    if (~this.field2079 > ~var6) {
                        var3[var5] = this.field2079;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field2075;
                }
            }
        }
        ++field2071;
        return var3;
    }
}
