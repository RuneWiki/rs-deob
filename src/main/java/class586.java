import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class586 extends class444 implements class706 {

    @OriginalMember(owner = "client!nw", name = "N", descriptor = "Z")
    private boolean field8248 = false;

    @OriginalMember(owner = "client!nw", name = "W", descriptor = "Lwca;")
    public class676 field8257;

    @OriginalMember(owner = "client!nw", name = "L", descriptor = "Z")
    private boolean field8246;

    @OriginalMember(owner = "client!nw", name = "T", descriptor = "Z")
    public static boolean field8254 = false;

    @OriginalMember(owner = "client!nw", name = "J", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!nw", name = "K", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!nw", name = "M", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!nw", name = "O", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!nw", name = "P", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!nw", name = "Q", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!nw", name = "R", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!nw", name = "S", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!nw", name = "U", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!nw", name = "V", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!nw", name = "X", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!nw", name = "Y", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!nw", name = "Z", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!nw", name = "ab", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!nw", name = "bb", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!nw", name = "db", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!nw", name = "eb", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!nw", name = "fb", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!nw", name = "gb", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!nw", name = "hb", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!nw", name = "ib", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!nw", name = "cb", descriptor = "Lkj;")
    private class566 field8263;

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "(I)V", line = 4)
    public final void method614(int arg0) {
        if (arg0 != 26062) {
            this.method614(-69);
        }
        ++field8258;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "(B)I", line = 15)
    public final int method861(byte arg0) {
        if (arg0 != -17) {
            return 42;
        } else {
            ++field8264;
            return this.field8257.field9228;
        }
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lha;Lhba;IIIIIZIII)V", line = 26)
    public class586(class58 arg0, class10 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class540.method3127(arg8, arg9, true));
        this.field8257 = new class676(arg0, arg1, arg8, arg9, super.field1266, arg3, this, arg7, arg10);
        this.field8246 = arg1.field207 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)I", line = 37)
    public final int method868(byte arg0) {
        if (arg0 != -10) {
            field8254 = true;
        }
        ++field8268;
        return this.field8257.field9227;
    }

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "(B)V", line = 51)
    public final void method866(byte arg0) {
        if (arg0 != -62) {
            field8252 = -102;
        }
        ++field8256;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "([Loia;I)V", line = 67)
    public static final void method3325(class88[] arg0, int arg1) {
        class511.field7299 = arg0.length;
        ++field8245;
        class748.field10391 = new class88[class511.field7299 + 10];
        class417.field5894 = new int[class511.field7299 + 10];
        class255.method1693(arg0, 0, class748.field10391, 0, class511.field7299);
        int var2 = 25 % ((-78 - arg1) / 37);
        for (int var3 = 0; ~class511.field7299 < ~var3; ++var3) {
            class417.field5894[var3] = class748.field10391[var3].method670();
        }
        for (int var4 = class511.field7299; ~var4 > ~class748.field10391.length; ++var4) {
            class417.field5894[var4] = 12;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BLha;)V", line = 94)
    public final void method753(byte arg0, class58 arg1) {
        ++field8259;
        int var3 = -12 % ((arg0 - 18) / 40);
        class471 var4 = this.field8257.method3765(true, -16386, true, arg1, 262144);
        if (var4 != null) {
            int var5 = super.field1264 >> 9;
            int var6 = super.field1250 >> 9;
            class513 var7 = arg1.method439();
            var7.method339(super.field1264, super.field1255, super.field1250);
            this.field8257.method3768(var4, var5, false, arg1, (byte) 92, var7, var6, var5, var6);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)I", line = 118)
    public final int method865(int arg0) {
        ++field8253;
        if (arg0 != 30374) {
            method3325((class88[]) null, -63);
        }
        return this.field8257.field9223;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)Z", line = 129)
    public final boolean method751(boolean arg0) {
        ++field8247;
        return arg0 ? false : this.field8248;
    }

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "(B)I", line = 141)
    public final int method750(byte arg0) {
        if (arg0 != 14) {
            return -128;
        } else {
            ++field8249;
            return this.field8257.method3766(-71);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)Z", line = 157)
    public final boolean method867(byte arg0) {
        if (arg0 < 82) {
            return true;
        } else {
            ++field8267;
            return this.field8257.method3758(6);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lha;B)V", line = 171)
    public final void method864(class58 arg0, byte arg1) {
        this.field8257.method3764(3, arg0);
        ++field8262;
        if (arg1 != -73) {
            this.method867((byte) -15);
        }
    }

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "(I)I", line = 185)
    public final int method749(int arg0) {
        if (arg0 != 32767) {
            return -93;
        } else {
            ++field8251;
            return this.field8257.method3760((byte) 124);
        }
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(BLha;)Lml;", line = 198)
    public final class387 method755(byte arg0, class58 arg1) {
        ++field8269;
        class471 var3 = this.field8257.method3765(false, -16386, true, arg1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class513 var4 = arg1.method439();
            var4.method339(super.field1264, super.field1255, super.field1250);
            class387 var5 = class65.method544(this.field8246, 1, 24824);
            int var6 = super.field1264 >> 9;
            int var7 = super.field1250 >> 9;
            this.field8257.method3768(var3, var6, true, arg1, (byte) -125, var4, var7, var6, var7);
            if (arg0 != -127) {
                return null;
            } else {
                if (class180.field2409) {
                    var3.method262(var4, var5.field5482[0], class516.field7361, 0);
                } else {
                    var3.method221(var4, var5.field5482[0], 0);
                }
                if (this.field8257.field9231 != null) {
                    class50 var8 = this.field8257.field9231.method3116();
                    if (class180.field2409) {
                        arg1.method379(var8, class516.field7361);
                    } else {
                        arg1.method381(var8);
                    }
                }
                this.field8248 = var3.method224() || this.field8257.field9231 != null;
                if (this.field8263 != null) {
                    class555.method3208(this.field8263, super.field1255, super.field1250, super.field1264, (byte) -93, var3);
                } else {
                    this.field8263 = class654.method3596(super.field1255, var3, super.field1264, super.field1250, (byte) 14);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILha;)V", line = 251)
    public final void method860(int arg0, class58 arg1) {
        this.field8257.method3763(-1, arg1);
        if (arg0 <= 15) {
            field8254 = false;
        }
        ++field8261;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZLha;IILkba;II)V", line = 263)
    public final void method615(boolean arg0, class58 arg1, int arg2, int arg3, class105 arg4, int arg5, int arg6) {
        if (arg5 != 22501) {
            this.field8248 = true;
        }
        ++field8265;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "(I)Z", line = 277)
    public final boolean method746(int arg0) {
        if (arg0 > -106) {
            this.method860(-65, (class58) null);
        }
        ++field8244;
        return false;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(ILha;)Lkj;", line = 288)
    public final class566 method744(int arg0, class58 arg1) {
        if (arg0 != 0) {
            this.method867((byte) -78);
        }
        ++field8266;
        return this.field8263;
    }

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "(I)Z", line = 299)
    public final boolean method621(int arg0) {
        ++field8255;
        return arg0 >= -103 ? false : false;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lha;III)Z", line = 311)
    public final boolean method752(class58 arg0, int arg1, int arg2, int arg3) {
        ++field8260;
        class471 var5 = this.field8257.method3765(false, arg1 ^ -16386, false, arg0, 131072);
        if (var5 == null) {
            return false;
        } else {
            if (arg1 != 0) {
                this.field8246 = false;
            }
            class513 var6 = arg0.method439();
            var6.method339(super.field1264, super.field1255, super.field1250);
            return class180.field2409 ? var5.method229(arg3, arg2, var6, false, 0, class516.field7361) : var5.method233(arg3, arg2, var6, false, 0);
        }
    }
}
