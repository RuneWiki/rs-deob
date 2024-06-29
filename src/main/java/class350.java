import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class350 extends class346 {

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "Ljava/lang/String;")
    public static String field5205 = "glow3:";

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field5207 = 0;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field5210 = 0;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    private int field5199;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    private int field5201;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    private int field5204;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "Lir;")
    public static class185 field5206;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "Lir;")
    public static class185 field5209;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 3)
    public static final String method2310(String arg0, byte arg1) {
        ++field5202;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg0.length();
            while (var2 < var3 && class320.method2108(true, arg0.charAt(var2))) {
                ++var2;
            }
            while (var2 < var3 && class320.method2108(true, arg0.charAt(var3 + -1))) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (var4 >= 1 && ~var4 >= -13) {
                StringBuffer var5 = new StringBuffer(var4);
                if (arg1 <= 70) {
                    field5205 = null;
                }
                for (int var6 = var2; var6 < var3; ++var6) {
                    char var7 = arg0.charAt(var6);
                    if (class430.method2683(0, var7)) {
                        char var8 = class138.method971((byte) -85, var7);
                        if (var8 != 0) {
                            var5.append(var8);
                        }
                    }
                }
                if (~var5.length() == -1) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)[[I", line = 62)
    public final int[][] method287(int arg0, int arg1) {
        if (arg1 > -3) {
            method2311(-2);
        }
        ++field5208;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (super.field5170.field6288) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class134.field1753 < ~var7; ++var7) {
                var4[var7] = this.field5199;
                var5[var7] = this.field5201;
                var6[var7] = this.field5204;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V", line = 108)
    public static void method2311(int arg0) {
        if (arg0 == 0) {
            field5205 = null;
            field5209 = null;
            field5206 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V", line = 126)
    public static final void method2312(int arg0) {
        ++field5203;
        if (arg0 < -113) {
            class51 var1 = class269.field3986;
            synchronized (class269.field3986) {
                class269.field3986.method372(125);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V", line = 140)
    private class350(int arg0) {
        super(0, false);
        this.method2313(false, arg0);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 152)
    public class350() {
        this(0);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V", line = 155)
    private final void method2313(boolean arg0, int arg1) {
        ++field5211;
        this.field5201 = 4080 & arg1 >> 4;
        this.field5204 = (arg1 & 255) << 4;
        this.field5199 = (arg1 & 16711680) >> 12;
        if (arg0) {
            this.field5201 = -100;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lfb;ZI)V", line = 168)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method2311(-10);
        }
        if (~arg2 == -1) {
            this.method2313(false, arg0.method2249(32767));
        }
        ++field5200;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(III)V", line = 197)
    public static final void method2314(int arg0, int arg1, int arg2) {
        class229.field3152 = new class51(arg0);
        if (arg2 != 2) {
            field5207 = 44;
        }
        ++field5198;
        class136.field1768 = new class51(arg1);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 215)
    public static final String method2315(byte arg0, String arg1, String arg2, String arg3) {
        if (arg0 != -126) {
            field5207 = -26;
        }
        ++field5197;
        for (int var4 = arg2.indexOf(arg1); ~var4 != 0; var4 = arg2.indexOf(arg1, var4 - -arg3.length())) {
            arg2 = arg2.substring(0, var4) + arg3 + arg2.substring(arg1.length() + var4);
        }
        return arg2;
    }
}
