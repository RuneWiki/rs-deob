import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class494 extends class35 implements class21 {

    @OriginalMember(owner = "client!bw", name = "K", descriptor = "Lvr;")
    public class92 field6993;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "Z")
    private boolean field6976;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "Lkn;")
    public static class530 field6978 = new class530("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!bw", name = "I", descriptor = "I")
    public static int field6991 = 64;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!bw", name = "A", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!bw", name = "B", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!bw", name = "C", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!bw", name = "D", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!bw", name = "E", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!bw", name = "G", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!bw", name = "H", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!bw", name = "J", descriptor = "Lfo;")
    public static class365 field6992;

    @OriginalMember(owner = "client!bw", name = "F", descriptor = "[[Lhm;")
    public static class150[][] field6988;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(Lza;B)Lkf;")
    public final class170 method126(class290 arg0, byte arg1) {
        ++field6984;
        class377 var3 = this.field6993.method662(super.field389, false, (byte) 118, true, super.field387, arg0, 2048);
        if (var3 == null) {
            return null;
        } else if (arg1 >= -86) {
            return null;
        } else {
            class125 var4 = arg0.method368();
            var4.method825(super.field387, super.field390, super.field389);
            class170 var5 = null;
            if (this.field6976) {
                var5 = class423.method2509(0, 1);
            }
            if (this.field6993.field1157 == null) {
                var3.method1566(var4, var5 == null ? null : var5.field2475[0], 0);
            } else {
                class324 var6 = this.field6993.field1157.method2084();
                arg0.method345(var3, var6, var4, var5 == null ? null : var5.field2475[0], 0);
            }
            int var7 = super.field387 >> 7;
            int var8 = super.field389 >> 7;
            this.field6993.method664(var3, true, var7, arg0, true, var7, var8, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZLjava/lang/String;I)I")
    public static final int method2863(int arg0, boolean arg1, String arg2, int arg3) {
        ++field6982;
        if (~arg0 <= -3 && ~arg0 >= -37) {
            boolean var4 = false;
            if (arg3 != -1) {
                field6978 = null;
            }
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg2.length();
            for (int var8 = 0; var7 > var8; ++var8) {
                char var9 = arg2.charAt(var8);
                if (~var8 == -1) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg1) {
                        continue;
                    }
                }
                int var11;
                if (~var9 <= -49 && ~var9 >= -58) {
                    var11 = var9 - '0';
                } else if (~var9 <= -66 && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else {
                    if (var9 < 'a' || var9 > 'z') {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (var11 >= arg0) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg0 * var6 - -var11;
                if (var10 / arg0 != var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        ++field6972;
        return arg0 != 31692 ? false : this.field6993.method654((byte) 105);
    }

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "(I)V")
    public final void method120(int arg0) {
        ++field6977;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)V")
    public final void method115(int arg0) {
        if (arg0 != 16372) {
            field6991 = -95;
        }
        ++field6974;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILza;ILge;IZI)V")
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        if (arg0 >= -71) {
            field6987 = 37;
        }
        ++field6985;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I")
    public final int method114(int arg0) {
        ++field6975;
        return arg0 != -9772 ? -47 : this.field6993.field1154;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILza;)V")
    public final void method111(int arg0, class290 arg1) {
        if (arg0 == -38) {
            this.field6993.method657(false, arg1);
            ++field6983;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILza;I)Le;")
    public final class377 method116(int arg0, class290 arg1, int arg2) {
        if (arg0 != 13439) {
            field6987 = 113;
        }
        ++field6981;
        return this.field6993.method662(0, false, (byte) 80, false, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)I")
    public final int method110(byte arg0) {
        if (arg0 < 100) {
            this.method114(-110);
        }
        ++field6989;
        return this.field6993.field1174;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lza;B)V")
    public final void method117(class290 arg0, byte arg1) {
        ++field6990;
        this.field6993.method653(arg0, -1);
        if (arg1 != -38) {
            field6987 = 66;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lza;I)V")
    public final void method130(class290 arg0, int arg1) {
        ++field6980;
        if (arg1 != 0) {
            field6987 = -66;
        }
        class377 var3 = this.field6993.method662(super.field389, true, (byte) 94, true, super.field387, arg0, 262144);
        if (var3 != null) {
            int var4 = super.field387 >> 7;
            int var5 = super.field389 >> 7;
            this.field6993.method664(var3, false, var4, arg0, true, var4, var5, var5);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IILza;I)Z")
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        ++field6973;
        if (arg0 != 3) {
            field6978 = null;
        }
        class377 var5 = this.field6993.method662(super.field389, false, (byte) 125, false, super.field387, arg2, 131072);
        if (var5 == null) {
            return false;
        } else {
            class125 var6 = arg2.method368();
            var6.method825(super.field387, super.field390, super.field389);
            return var5.method1586(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        ++field6986;
        if (arg0 != 102) {
            field6987 = -86;
        }
        return false;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lza;Lfu;IIIIIZII)V")
    public class494(class290 arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field3962, arg1.field4000, arg1.field3953);
        this.field6993 = new class92(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field6976 = ~arg1.field3957 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I")
    public final int method112(int arg0) {
        ++field6979;
        int var2 = 94 % ((arg0 - -5) / 55);
        return this.field6993.field1177;
    }

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "(I)V")
    public static void method2864(int arg0) {
        field6978 = null;
        field6988 = null;
        field6992 = null;
        if (arg0 != 2071987623) {
            method2863(63, true, (String) null, -41);
        }
    }
}
