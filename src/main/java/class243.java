import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class243 extends class86 {

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "Z")
    public boolean field3655 = true;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "Lta;")
    public static class197 field3660 = new class197(64);

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "[I")
    public int[] field3659;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "[I")
    private int[] field3662;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field3656;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "[[I")
    private int[][] field3657;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lhb;I[I)V", line = 6)
    public final void method1677(class35 arg0, int arg1, int[] arg2) {
        field3669++;
        if (this.field3662 == null) {
            return;
        }
        for (int var4 = arg1; this.field3662.length > var4 && arg2.length > var4; var4++) {
            int var5 = class20.field218[this.method1680(-79, var4)];
            if (var5 > 0) {
                arg0.method267((byte) 101, var5, (long) arg2[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)Ljava/lang/String;", line = 43)
    public final String method1678(int arg0) {
        field3652++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3656 == null) {
            return "";
        }
        var2.append(this.field3656[arg0]);
        for (int var3 = 1; var3 < this.field3656.length; var3++) {
            var2.append("...");
            var2.append(this.field3656[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)I", line = 69)
    public static final int method1679(int arg0, int arg1) {
        if (arg0 <= 18) {
            method1684((String) null, true);
        }
        field3653++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)I", line = 91)
    public final int method1680(int arg0, int arg1) {
        field3667++;
        if (this.field3662 == null || arg1 < 0 || this.field3662.length < arg1) {
            return -1;
        } else {
            if (arg0 >= -20) {
                field3660 = (class197) null;
            }
            return this.field3662[arg1];
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lhb;Z)V", line = 105)
    public final void method1681(class35 arg0, boolean arg1) {
        field3664++;
        while (true) {
            int var3 = arg0.method273(65280);
            if (var3 == 0) {
                if (arg1) {
                    this.method1680(-108, 97);
                }
                return;
            }
            this.method1688((byte) -96, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)I", line = 127)
    public final int method1682(int arg0) {
        field3668++;
        if (this.field3662 == null) {
            return 0;
        } else {
            int var2 = -120 / ((-arg0 - 65) / 57);
            return this.field3662.length;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)I", line = 143)
    public final int method1683(int arg0, byte arg1, int arg2) {
        field3651++;
        if (this.field3662 == null || arg0 < 0 || arg0 > this.field3662.length) {
            return -1;
        } else if (this.field3657[arg0] == null || arg2 < 0 || arg2 > this.field3657[arg0].length) {
            return -1;
        } else if (arg1 == 94) {
            return this.field3657[arg0][arg2];
        } else {
            return 105;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 162)
    public static final String method1684(String arg0, boolean arg1) {
        field3658++;
        String var2 = class92.method730(class224.method1597(arg1, arg0), -20313);
        if (var2 == null) {
            var2 = "";
        }
        if (!arg1) {
            field3654 = 72;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V", line = 177)
    public static final void method1685(int arg0, int arg1, int arg2) {
        field3670++;
        if (class179.method1294(arg2, 1)) {
            if (arg1 != -12359) {
                field3654 = 27;
            }
            class189.method1363((byte) -36, arg0, class305.field4779[arg2]);
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V", line = 192)
    public final void method1686(byte arg0) {
        if (arg0 > -116) {
            return;
        }
        field3663++;
        if (this.field3659 != null) {
            for (int var2 = 0; var2 < this.field3659.length; var2++) {
                this.field3659[var2] = class147.method1098(this.field3659[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V", line = 211)
    public static void method1687(int arg0) {
        field3660 = null;
        if (arg0 > -63) {
            field3654 = -41;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLhb;I)V", line = 229)
    private final void method1688(byte arg0, class35 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3656 = class41.method371(true, '<', arg1.method279(79));
        } else if (arg2 == 2) {
            int var8 = arg1.method273(65280);
            this.field3659 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3659[var9] = arg1.method300(-1394191632);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method273(arg0 + 65376);
            this.field3657 = new int[var4][];
            this.field3662 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method300(-1394191632);
                this.field3662[var5] = var6;
                this.field3657[var5] = new int[class116.field1813[var6]];
                for (int var7 = 0; var7 < class116.field1813[var6]; var7++) {
                    this.field3657[var5][var7] = arg1.method300(-1394191632);
                }
            }
        } else if (arg2 == 4) {
            this.field3655 = false;
        }
        field3661++;
        if (arg0 != -96) {
            field3654 = 10;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILhb;)Ljava/lang/String;", line = 295)
    public final String method1689(int arg0, class35 arg1) {
        field3665++;
        StringBuffer var3 = new StringBuffer(arg0);
        if (this.field3662 != null) {
            for (int var4 = 0; var4 < this.field3662.length; var4++) {
                var3.append(this.field3656[var4]);
                var3.append(class302.method2111(this.field3662[var4], this.field3657[var4], 14, arg1.method256(16616, class49.field757[this.field3662[var4]])));
            }
        }
        var3.append(this.field3656[this.field3656.length - 1]);
        return var3.toString();
    }
}
