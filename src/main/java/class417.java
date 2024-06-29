import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class417 extends class117 {

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
    private int field6243 = -1;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    private int field6247 = 0;

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
    private int field6250 = -32768;

    @OriginalMember(owner = "client!nu", name = "R", descriptor = "Z")
    public boolean field6256 = false;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    private int field6252 = 0;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
    private int field6242 = 0;

    @OriginalMember(owner = "client!nu", name = "W", descriptor = "I")
    private int field6261;

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "I")
    public int field6249;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "I")
    private int field6251;

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "Lnm;")
    private class329 field6240;

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
    public static int field6241 = 0;

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!nu", name = "x", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!nu", name = "J", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!nu", name = "P", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!nu", name = "Q", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!nu", name = "T", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!nu", name = "V", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!nu", name = "X", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!nu", name = "Y", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!nu", name = "S", descriptor = "Lce;")
    private class201 field6257;

    @OriginalMember(owner = "client!nu", name = "U", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field6259;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "[[[Lfl;")
    public static class518[][][] field6246;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)Z", line = 4)
    public final boolean method18(int arg0) {
        if (arg0 < 72) {
            this.field6249 = 105;
        }
        ++field6263;
        return false;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLqa;)V", line = 17)
    public final void method10(byte arg0, class162 arg1) {
        ++field6254;
        class121 var3 = this.method2499(this.field6251, arg1, 0, (byte) 80);
        if (arg0 != -32) {
            method2502((byte) 86);
        }
        if (var3 != null) {
            this.method2500(var3, (byte) -76, arg1);
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(Z)V", line = 35)
    public final void method2498(boolean arg0) {
        if (this.field6257 != null) {
            this.field6257.method1366();
        }
        ++field6237;
        if (arg0) {
            this.field6252 = -57;
        }
    }

    @OriginalMember(owner = "client!nu", name = "finalize", descriptor = "()V", line = 49)
    protected final void finalize() {
        if (this.field6257 != null) {
            this.field6257.method1366();
        }
        ++field6245;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILqa;IB)Lc;", line = 65)
    private final class121 method2499(int arg0, class162 arg1, int arg2, byte arg3) {
        ++field6260;
        if (arg3 != 80) {
            this.method19(false, -117, -50, (class68) null, (class162) null, -84, (byte) -126);
        }
        class104 var5 = class512.field7494.method2732(94, arg0);
        class35 var6 = class307.field4415[super.field1768];
        class35 var7 = this.field6261 < 3 ? class307.field4415[this.field6261 + 1] : null;
        return !this.field6256 ? var5.method640(var6, 9849, super.field1769, true, this.field6247, class84.field1295, super.field1766, arg2, super.field1763, arg1, this.field6252, var7, this.field6243) : var5.method640(var6, 9849, super.field1769, true, 0, class84.field1295, super.field1766, arg2, super.field1763, arg1, -1, var7, -1);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lc;BLqa;)V", line = 82)
    private final void method2500(class121 arg0, byte arg1, class162 arg2) {
        if (arg1 == -76) {
            ++field6258;
            class52[] var4 = arg0.method747();
            class255[] var5 = arg0.method703();
            if ((this.field6257 == null || this.field6257.field2903) && (var4 != null || var5 != null)) {
                this.field6257 = new class201(class317.field4559);
            }
            if (this.field6257 != null) {
                this.field6257.method1367(arg2, (long) class317.field4559, var4, var5, false);
                this.field6257.method1371(super.field1768, super.field1762, super.field1770, super.field1771, super.field1765);
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 180)
    public class417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field6261 = arg4;
        this.field6249 = arg1 + arg2;
        this.field6251 = arg0;
        this.field6242 = arg12;
        class104 var14 = class512.field7494.method2732(111, this.field6251);
        int var15 = var14.field1505;
        if (~var15 == 0) {
            this.field6256 = true;
        } else {
            this.field6240 = class84.field1295.method1182(var15, 8);
            this.field6256 = false;
        }
        if (this.field6249 == arg2) {
            class480.method2856(super.field1769, super.field1763, (byte) 93, super.field1768, false, this.field6240, this.field6252);
        }
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)I", line = 114)
    public final int method283(int arg0) {
        if (arg0 != 16490) {
            this.field6257 = null;
        }
        ++field6238;
        return this.field6250;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(ILqa;)Lnf;", line = 125)
    public final class405 method12(int arg0, class162 arg1) {
        ++field6244;
        class121 var3 = this.method2499(this.field6251, arg1, 2048 | (~this.field6242 == -1 ? 0 : 5), (byte) 80);
        if (arg0 < 120) {
            field6259 = null;
        }
        if (var3 == null) {
            return null;
        } else {
            if (this.field6242 != 0) {
                var3.method685(this.field6242 * 2048);
            }
            class414 var4 = arg1.method1115();
            var4.method913(super.field1763, super.field1766, super.field1769);
            if (this.field6257 != null) {
                class389 var5 = this.field6257.method1369();
                arg1.method1055(var3, var5, var4, (class247) null, 0);
            } else {
                var3.method720(var4, (class247) null, 0);
            }
            this.field6250 = var3.method709();
            this.method2500(var3, (byte) -76, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(B)V", line = 159)
    public final void method13(byte arg0) {
        ++field6248;
        if (arg0 == -89) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BB)C", line = 214)
    public static final char method2501(byte arg0, byte arg1) {
        if (arg1 > -97) {
            method2502((byte) 2);
        }
        ++field6255;
        int var2 = arg0 & 255;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (~var2 <= -129 && ~var2 > -161) {
                char var3 = class178.field2622[var2 - 128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V", line = 241)
    public static void method2502(byte arg0) {
        field6259 = null;
        if (arg0 <= 123) {
            field6241 = -47;
        }
        field6246 = null;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILqa;B)Z", line = 252)
    public final boolean method8(int arg0, int arg1, class162 arg2, byte arg3) {
        ++field6262;
        int var5 = -121 % ((-12 - arg3) / 36);
        return false;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZIILer;Lqa;IB)V", line = 262)
    public final void method19(boolean arg0, int arg1, int arg2, class68 arg3, class162 arg4, int arg5, byte arg6) {
        if (arg6 > -105) {
            this.finalize();
        }
        ++field6239;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)V", line = 290)
    public final void method2503(int arg0, int arg1) {
        ++field6253;
        if (!this.field6256) {
            this.field6247 += arg1;
            while (this.field6240.field4665[this.field6252] < this.field6247) {
                this.field6247 -= this.field6240.field4665[this.field6252];
                ++this.field6252;
                if (~this.field6252 <= ~this.field6240.field4670.length) {
                    this.field6256 = true;
                    break;
                }
            }
            if (!this.field6256) {
                class480.method2856(super.field1769, super.field1763, (byte) 32, super.field1768, false, this.field6240, this.field6252);
            }
            if (arg0 != 0) {
                this.method2499(-37, (class162) null, 119, (byte) -16);
            }
        }
    }
}
