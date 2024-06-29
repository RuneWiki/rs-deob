import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class30 extends class155 {

    @OriginalMember(owner = "client!iha", name = "q", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!iha", name = "r", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client!iha", name = "m", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "I")
    public static int field400 = 0;

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!iha", name = "k", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!iha", name = "l", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!iha", name = "n", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!iha", name = "o", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(IIIIII)V")
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field410 = arg2;
        this.field411 = arg1;
        this.field409 = arg0;
        this.field406 = arg3;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(III)V")
    public final void method5(int arg0, int arg1, int arg2) {
        ++field402;
        if (arg1 > -107) {
            method204(true, 2, false, -90);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZI)V")
    public final void method4(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            ++field404;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZIZI)Leq;")
    public static final class209 method204(boolean arg0, int arg1, boolean arg2, int arg3) {
        ++field408;
        class195 var4 = null;
        if (class196.field2805 != null) {
            var4 = new class195(arg1, class196.field2805, class165.field2441[arg1], 1000000);
        }
        class250.field3530[arg1] = class404.field5632.method1117(false, class343.field4827, arg1, var4);
        if (!arg2) {
            field400 = -3;
        }
        class250.field3530[arg1].method1377(3806);
        return new class209(class250.field3530[arg1], arg0, arg3);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIB)V")
    public final void method3(int arg0, int arg1, byte arg2) {
        ++field407;
        if (arg2 == -30) {
            int var4 = this.field409 * arg0 >> 12;
            int var5 = this.field410 * arg0 >> 12;
            int var6 = this.field411 * arg1 >> 12;
            int var7 = this.field406 * arg1 >> 12;
            class56.method515(var4, 18084, super.field2329, var7, var5, var6);
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(CB)C")
    public static final char method205(char arg0, byte arg1) {
        int var2 = 46 / ((-71 - arg1) / 36);
        ++field403;
        if (~arg0 != -33 && ~arg0 != -161 && ~arg0 != -96 && ~arg0 != -46) {
            if (~arg0 != -92 && arg0 != ']' && arg0 != '#') {
                if (~arg0 != -225 && arg0 != 225 && ~arg0 != -227 && ~arg0 != -229 && arg0 != 227 && arg0 != 192 && arg0 != 193 && ~arg0 != -195 && ~arg0 != -197 && arg0 != 195) {
                    if (arg0 != 232 && arg0 != 233 && arg0 != 234 && arg0 != 235 && arg0 != 200 && ~arg0 != -202 && arg0 != 202 && arg0 != 203) {
                        if (~arg0 != -238 && arg0 != 238 && arg0 != 239 && ~arg0 != -206 && arg0 != 206 && ~arg0 != -208) {
                            if (~arg0 != -243 && arg0 != 243 && arg0 != 244 && arg0 != 246 && ~arg0 != -246 && ~arg0 != -211 && ~arg0 != -212 && ~arg0 != -213 && arg0 != 214 && arg0 != 213) {
                                if (arg0 != 249 && ~arg0 != -251 && ~arg0 != -252 && arg0 != 252 && ~arg0 != -218 && arg0 != 218 && arg0 != 219 && arg0 != 220) {
                                    if (arg0 != 231 && ~arg0 != -200) {
                                        if (~arg0 != -256 && ~arg0 != -377) {
                                            if (~arg0 != -242 && arg0 != 209) {
                                                return ~arg0 == -224 ? 'b' : Character.toLowerCase(arg0);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg0;
            }
        } else {
            return '_';
        }
    }
}
