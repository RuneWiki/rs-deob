import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class206 {

    @OriginalMember(owner = "client!hba", name = "x", descriptor = "I")
    private int field118;

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "Z")
    private boolean field125;

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!hba", name = "G", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!hba", name = "B", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client!hba", name = "C", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "Z")
    private boolean field98;

    @OriginalMember(owner = "client!hba", name = "y", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!hba", name = "L", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client!hba", name = "t", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client!hba", name = "F", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client!hba", name = "I", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client!hba", name = "K", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!hba", name = "q", descriptor = "Ljava/lang/String;")
    private String field115;

    @OriginalMember(owner = "client!hba", name = "H", descriptor = "Ljava/lang/String;")
    private String field102;

    @OriginalMember(owner = "client!hba", name = "s", descriptor = "Ljava/lang/String;")
    private String field110;

    @OriginalMember(owner = "client!hba", name = "j", descriptor = "Ljava/lang/String;")
    private String field107;

    @OriginalMember(owner = "client!hba", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field126 = new String[] { method72(method71("?kvWN\u007f")), method72(method71("a''")), method72(method71("c'&")), method72(method71("a'&")), method72(method71(" `y")), method72(method71("f99L")), method72(method71("c'.")), method72(method71(":`t\u000b`$fq\r")), method72(method71("?kvW3>g~\r1\u007f")), method72(method71(":ht")), method72(method71("9|{\u0015")), method72(method71("6yg\u0015j")), method72(method71("c''")), method72(method71("/1!&9c")), method72(method71("b''")), method72(method71("f99M")), method72(method71("6dsO;")), method72(method71(";`y\fw")), method72(method71("f99O")), method72(method71(",'9Wr")), method72(method71("$|y")), method72(method71("b'&")), method72(method71("?kvWL\u007f")), method72(method71("?kvWK\u007f")), method72(method71("?kvWM\u007f")) };

    @OriginalMember(owner = "client!hba", name = "w", descriptor = "I")
    public static int field103 = 0;

    @OriginalMember(owner = "client!hba", name = "D", descriptor = "Ljava/lang/String;")
    public static String field116 = null;

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client!hba", name = "E", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!hba", name = "v", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!hba", name = "r", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client!hba", name = "J", descriptor = "Leh;")
    public static class379 field114;

    @OriginalMember(owner = "client!hba", name = "u", descriptor = "[I")
    public static int[] field105;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Z)I", line = 12)
    public final int method67(boolean arg0) {
        try {
            field106++;
            byte var2 = 23;
            int var3 = var2 + class626.method4647(-102, this.field102);
            int var4 = var3 + class626.method4647(-116, this.field115);
            int var5 = var4 + class626.method4647(-83, this.field107);
            if (arg0) {
                this.method68(84);
            }
            return var5 + class626.method4647(-72, this.field110);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field126[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V", line = 30)
    private final void method68(int arg0) {
        try {
            if (this.field102.length() > 40) {
                this.field102 = this.field102.substring(0, 40);
            }
            if (arg0 != 11498) {
                this.method69(-51, null);
            }
            field121++;
            if (this.field115.length() > 40) {
                this.field115 = this.field115.substring(0, 40);
            }
            if (this.field107.length() > 10) {
                this.field107 = this.field107.substring(0, 10);
            }
            if (this.field110.length() > 10) {
                this.field110 = this.field110.substring(0, 10);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field126[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILib;)V", line = 70)
    public final void method69(int arg0, class163 arg1) {
        try {
            arg1.method1428((byte) -24, 5);
            field113++;
            arg1.method1428((byte) -24, this.field118);
            arg1.method1428((byte) -24, this.field125 ? 1 : 0);
            arg1.method1428((byte) -24, this.field101);
            arg1.method1428((byte) -24, this.field104);
            arg1.method1428((byte) -24, this.field112);
            arg1.method1428((byte) -24, this.field122);
            arg1.method1428((byte) -24, this.field119);
            arg1.method1428((byte) -24, this.field98 ? 1 : 0);
            int var3 = -19 % ((34 - arg0) / 58);
            arg1.method1406(this.field120, 380332136);
            arg1.method1428((byte) -24, this.field123);
            arg1.method1448(-128, this.field99);
            arg1.method1406(this.field117, 380332136);
            arg1.method1428((byte) -24, this.field100);
            arg1.method1428((byte) -24, this.field109);
            arg1.method1428((byte) -24, this.field111);
            arg1.method1463((byte) 69, this.field102);
            arg1.method1463((byte) 69, this.field115);
            arg1.method1463((byte) 69, this.field107);
            arg1.method1463((byte) 69, this.field110);
            arg1.method1428((byte) -24, this.field124);
            arg1.method1406(this.field108, 380332136);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field126[22] + arg0 + ',' + (arg1 == null ? field126[10] : field126[19]) + ')');
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V", line = 107)
    public static void method70(int arg0) {
        try {
            field116 = null;
            field105 = null;
            if (arg0 == 14443) {
                field114 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field126[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "()V", line = 125)
    public class10() {
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(ZLmca;)V", line = 127)
    public class10(boolean arg0, class33 arg1) {
        try {
            if (arg0) {
                if (class33.field386.startsWith(field126[4])) {
                    this.field118 = 1;
                } else if (class33.field386.startsWith(field126[9])) {
                    this.field118 = 2;
                } else if (class33.field386.startsWith(field126[17])) {
                    this.field118 = 3;
                } else {
                    this.field118 = 4;
                }
                if (class33.field372.startsWith(field126[16]) || class33.field372.startsWith(field126[13])) {
                    this.field125 = true;
                } else {
                    this.field125 = false;
                }
                if (this.field118 == 1) {
                    if (class33.field385.indexOf(field126[12]) != -1) {
                        this.field101 = 1;
                    } else if (class33.field385.indexOf(field126[2]) != -1) {
                        this.field101 = 2;
                    } else if (class33.field385.indexOf(field126[6]) != -1) {
                        this.field101 = 3;
                    } else if (class33.field385.indexOf(field126[14]) != -1) {
                        this.field101 = 4;
                    } else if (class33.field385.indexOf(field126[21]) != -1) {
                        this.field101 = 5;
                    } else if (class33.field385.indexOf(field126[1]) != -1) {
                        this.field101 = 6;
                    } else if (class33.field385.indexOf(field126[3]) != -1) {
                        this.field101 = 7;
                    }
                } else if (this.field118 == 2) {
                    if (class33.field385.indexOf(field126[15]) != -1) {
                        this.field101 = 20;
                    } else if (class33.field385.indexOf(field126[5]) != -1) {
                        this.field101 = 21;
                    } else if (class33.field385.indexOf(field126[18]) != -1) {
                        this.field101 = 22;
                    }
                }
                if (class33.field396.toLowerCase().indexOf(field126[20]) != -1) {
                    this.field104 = 1;
                } else if (class33.field396.toLowerCase().indexOf(field126[7]) != -1) {
                    this.field104 = 2;
                } else if (class33.field396.toLowerCase().indexOf(field126[11]) == -1) {
                    this.field104 = 4;
                } else {
                    this.field104 = 3;
                }
                int var3 = 2;
                int var4 = 0;
                try {
                    while (var3 < class33.field381.length()) {
                        char var5 = class33.field381.charAt(var3);
                        if (var5 < '0' || var5 > '9') {
                            break;
                        }
                        var4 = var5 - (48 - var4 * 10);
                        var3++;
                    }
                } catch (Exception var17) {
                }
                this.field112 = var4;
                int var6 = class33.field381.indexOf(46, 2) + 1;
                int var7 = 0;
                try {
                    while (class33.field381.length() > var6) {
                        char var8 = class33.field381.charAt(var6);
                        if (var8 < '0' || var8 > '9') {
                            break;
                        }
                        var6++;
                        var7 = var7 * 10 + var8 - 48;
                    }
                } catch (Exception var16) {
                }
                this.field122 = var7;
                int var9 = class33.field381.indexOf(95, 4) + 1;
                int var10 = 0;
                try {
                    while (var9 < class33.field381.length()) {
                        char var11 = class33.field381.charAt(var9);
                        if (var11 < '0' || var11 > '9') {
                            break;
                        }
                        var9++;
                        var10 = var10 * 10 + var11 - 48;
                    }
                } catch (Exception var15) {
                }
                this.field120 = class568.field8403;
                if (arg1.field388) {
                    this.field98 = false;
                } else {
                    this.field98 = true;
                }
                this.field119 = var10;
                if (this.field112 > 3) {
                    this.field123 = class396.field5930;
                } else {
                    this.field123 = 0;
                }
                try {
                    int[] var12 = HardwareInfo.getCPUInfo();
                    if (var12 != null && var12.length == 7) {
                        this.field117 = var12[2];
                        this.field111 = var12[5];
                        this.field109 = var12[4];
                        this.field100 = var12[3];
                        this.field99 = var12[6];
                    }
                } catch (Throwable var14) {
                    this.field99 = 0;
                }
            }
            if (this.field115 == null) {
                this.field115 = "";
            }
            if (this.field102 == null) {
                this.field102 = "";
            }
            if (this.field110 == null) {
                this.field110 = "";
            }
            if (this.field107 == null) {
                this.field107 = "";
            }
            this.method68(11498);
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field126[8] + arg0 + ',' + (arg1 == null ? field126[10] : field126[19]) + ')');
        }
    }

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method71(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method72(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 87;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
