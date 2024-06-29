import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class8 extends class233 {

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    private int field100 = -1;

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
    private int field121 = 0;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
    private int field111 = -32768;

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
    private int field107 = 0;

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "Z")
    public boolean field127 = false;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Lkb;")
    private class412 field102;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "[I")
    public static int[] field126;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "Lom;")
    private class209 field124;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "Lgq;")
    public static class300 field125;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "Ltq;")
    public static class376 field123;

    static {
        new class362("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field126 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BILae;)Lbk;", line = 7)
    private final class210 method49(byte arg0, int arg1, class134 arg2) {
        if (arg0 <= 103) {
            field126 = null;
        }
        ++field103;
        class97 var4 = class434.method2721(this.field105, 4096);
        return !this.field127 ? var4.method535(arg1, arg2, this.field107, (byte) -32, this.field100, this.field121) : var4.method535(arg1, arg2, -1, (byte) -32, -1, 0);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V", line = 22)
    public static final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field119;
        int var8 = -13 / ((arg0 - 55) / 34);
        client.method1115(arg2, arg5, true, arg1, 0, arg3, arg6, arg4, arg7);
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V", line = 40)
    public final void method51(int arg0) {
        if (arg0 == 6) {
            ++field99;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLae;)Ljg;", line = 51)
    public final class186 method52(byte arg0, class134 arg1) {
        ++field109;
        class210 var3 = this.method49((byte) 111, 1024, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -120) {
                this.finalize();
            }
            class18 var4 = arg1.method649();
            var4.method116(super.field3284, super.field3287, super.field3269);
            if (this.field124 == null) {
                var3.method1416(var4, (class136) null, 0);
            } else {
                class63 var5 = this.field124.method1371();
                arg1.method588(var3, var5, var4, (class136) null, 0);
            }
            this.field111 = var3.method1405();
            this.method53(arg1, 8043, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 82)
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field114 = arg1 + arg2;
        this.field105 = arg0;
        int var12 = class434.method2721(this.field105, 4096).field1166;
        if (~var12 != 0) {
            this.field127 = false;
            this.field102 = class189.method1288(-8192, var12);
        } else {
            this.field127 = true;
        }
        if (this.field114 == arg2) {
            class148.method896(false, this.field102, (byte) 117, super.field3284, this.field107, super.field3269);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lae;ILbk;)V", line = 108)
    private final void method53(class134 arg0, int arg1, class210 arg2) {
        ++field117;
        if (arg1 != 8043) {
            this.field105 = -99;
        }
        class42[] var4 = arg2.method1399();
        class190[] var5 = arg2.method1374();
        if ((this.field124 == null || this.field124.field2961) && (var4 != null || var5 != null)) {
            this.field124 = new class209(class189.field2726);
        }
        if (this.field124 != null) {
            this.field124.method1362(arg0, (long) class189.field2726, var4, var5, false);
            this.field124.method1372(super.field3285, super.field3268, super.field3275, super.field3267, super.field3271);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)Z", line = 134)
    public final boolean method54(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field112;
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 146)
    public static void method55(int arg0) {
        if (arg0 != -1) {
            method63(-38, false);
        }
        field123 = null;
        field126 = null;
        field125 = null;
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 158)
    protected final void finalize() {
        ++field108;
        if (this.field124 != null) {
            this.field124.method1369();
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILae;II)Z", line = 171)
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        if (arg2 != 4835) {
            return false;
        } else {
            ++field118;
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(BI)C", line = 182)
    public static final char method57(byte arg0, int arg1) {
        if (arg1 != 16) {
            method55(39);
        }
        ++field122;
        int var2 = arg0 & 255;
        if (~var2 == -1) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && ~var2 > -161) {
                char var3 = class273.field3877[var2 + -128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V", line = 211)
    public final void method58(int arg0, int arg1) {
        ++field116;
        if (!this.field127) {
            this.field121 += arg1;
            while (this.field121 > this.field102.field5918[this.field107]) {
                this.field121 -= this.field102.field5918[this.field107];
                ++this.field107;
                if (~this.field102.field5925.length >= ~this.field107) {
                    this.field127 = true;
                    break;
                }
            }
            if (!this.field127) {
                class148.method896(false, this.field102, (byte) 112, super.field3284, this.field107, super.field3269);
            }
            if (arg0 != -15676) {
                this.method58(22, 95);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 248)
    public final void method59(int arg0) {
        if (arg0 == 2) {
            ++field110;
            if (this.field124 != null) {
                this.field124.method1369();
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZBIILna;ILae;)V", line = 264)
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        int var8 = -87 % ((arg1 - -16) / 62);
        ++field106;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)I", line = 275)
    public final int method61(int arg0) {
        ++field101;
        return arg0 != 131910471 ? -67 : this.field111;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(II)Lgf;", line = 290)
    public static final class150 method62(int arg0, int arg1) {
        ++field104;
        class150 var2 = (class150) class295.field4107.method856((long) arg1, (byte) 123);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class186.field2699.method2431((byte) 68, class388.method2485(arg1, false), class340.method2184(-100, arg1));
            class150 var4 = new class150();
            if (var3 != null) {
                var4.method906(new class236(var3), -1);
            }
            class295.field4107.method849((byte) 63, var4, (long) arg1);
            int var5 = -11 / ((50 - arg0) / 57);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)Lci;", line = 313)
    public static final class261 method63(int arg0, boolean arg1) {
        ++field113;
        class261 var2 = (class261) class331.field4672.method1625((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class123.field1514.method2431((byte) 88, 1, arg0);
            class261 var4 = new class261();
            if (!arg1) {
                field125 = null;
            }
            var4.field3731 = arg0;
            if (var3 != null) {
                var4.method1748(-896294812, new class236(var3));
            }
            var4.method1745(26513);
            if (var4.field3725 == 2 && class267.field3804.method1888((long) arg0, (byte) -30) == null) {
                class267.field3804.method1886(new class25(class435.field6271), (long) arg0, 1);
                class334.field4731[class435.field6271++] = var4;
            }
            class331.field4672.method1622((byte) 13, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lae;B)V", line = 360)
    public final void method64(class134 arg0, byte arg1) {
        if (arg1 >= -50) {
            method62(-37, 71);
        }
        ++field115;
        class210 var3 = this.method49((byte) 122, 0, arg0);
        if (var3 != null) {
            this.method53(arg0, 8043, var3);
        }
    }
}
