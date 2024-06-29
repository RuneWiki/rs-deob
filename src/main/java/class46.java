import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class46 extends class107 {

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    private int field673 = 2048;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    private int field682 = 0;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    private int field677 = 12288;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    private int field687 = 4096;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    private int field690 = 2048;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    private int field685 = 8192;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    private int field692 = 0;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "[I")
    public static int[] field684 = new int[256];

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "Z")
    public static boolean field691;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Lgi;")
    public static class164 field675;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "Lgi;")
    public static class164 field686;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        class28.method220((byte) -128);
        if (arg0 != 35) {
            this.field690 = 104;
        }
        ++field676;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field685 = arg1.method1837(252);
                                }
                            } else {
                                this.field687 = arg1.method1837(252);
                            }
                        } else {
                            this.field677 = arg1.method1837(252);
                        }
                    } else {
                        this.field673 = arg1.method1837(252);
                    }
                } else {
                    this.field692 = arg1.method1837(252);
                }
            } else {
                this.field682 = arg1.method1837(252);
            }
        } else {
            this.field690 = arg1.method1837(arg2 + 224);
        }
        if (arg2 != 28) {
            this.field690 = -119;
        }
        ++field680;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class46() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
    public static void method301(int arg0) {
        field686 = null;
        if (arg0 <= -37) {
            field675 = null;
            field684 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int var3 = 106 / ((arg0 - -34) / 49);
        ++field681;
        int[] var4 = super.field1661.method894(-90, arg1);
        if (super.field1661.field2115) {
            int var5 = class259.field4254[arg1] + -2048;
            for (int var6 = 0; class24.field443 > var6; ++var6) {
                int var7 = class221.field3486[var6] + -2048;
                int var8 = this.field692 + var7;
                int var9 = this.field673 + var5;
                int var10 = this.field690 + var7;
                int var11 = this.field682 + var5;
                int var12 = ~var9 > 2047 ? var9 - -4096 : var9;
                int var13 = var10 < -2048 ? var10 + 4096 : var10;
                int var14 = var13 > 2048 ? var13 + -4096 : var13;
                int var15 = ~var12 < -2049 ? var12 - 4096 : var12;
                int var16 = ~var11 > 2047 ? var11 - -4096 : var11;
                int var17 = ~var8 > 2047 ? var8 + 4096 : var8;
                int var18 = ~var16 >= -2049 ? var16 : var16 + -4096;
                int var19 = var17 <= 2048 ? var17 : var17 - 4096;
                var4[var6] = !this.method306(var14, var18, -1201638132) && !this.method302(0, var15, var19) ? 0 : 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)Z")
    private final boolean method302(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field678;
            int var4 = (arg1 - -arg2) * this.field677 >> 12;
            int var5 = class144.field2323[(1045819 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field677;
            int var7 = (var6 << 12) / this.field685;
            int var8 = this.field687 * var7 >> 12;
            return arg1 - arg2 < var8 && -var8 < -arg2 + arg1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(III)Llb;")
    public static final class138 method303(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class138 var4 = var3.field1775;
            var3.field1775 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method304(boolean arg0, String arg1) throws ClassNotFoundException {
        ++field688;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg0) {
                method301(89);
            }
            if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method305(byte arg0, int arg1) {
        ++field679;
        if (arg0 < 62) {
            return null;
        } else if (~arg1 > -100001) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else {
            return ~arg1 > -10000001 ? "<col=ffffff>" + arg1 / 1000 + class152.field2442 + "</col>" : "<col=00ff80>" + arg1 / 1000000 + class311.field5031 + "</col>";
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(III)Z")
    private final boolean method306(int arg0, int arg1, int arg2) {
        if (arg2 != -1201638132) {
            return true;
        } else {
            ++field683;
            int var4 = (-arg0 + arg1) * this.field677 >> 12;
            int var5 = class144.field2323[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field677;
            int var7 = (var6 << 12) / this.field685;
            int var8 = this.field687 * var7 >> 12;
            return ~(arg0 + arg1) > ~var8 && arg0 + arg1 > -var8;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(var1 & 1) != -2) {
                    var1 >>>= 1;
                } else {
                    var1 = -306674912 ^ var1 >>> 1;
                }
            }
            field684[var0] = var1;
        }
        field689 = 0;
        field691 = true;
    }
}
