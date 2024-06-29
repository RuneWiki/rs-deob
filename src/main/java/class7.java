import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class156 {

    @OriginalMember(owner = "client!af", name = "sb", descriptor = "Z")
    public boolean field100 = false;

    @OriginalMember(owner = "client!af", name = "tb", descriptor = "I")
    private int field101 = 0;

    @OriginalMember(owner = "client!af", name = "Ib", descriptor = "I")
    private int field116 = 0;

    @OriginalMember(owner = "client!af", name = "Eb", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!af", name = "Fb", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!af", name = "Lb", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!af", name = "Cb", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client!af", name = "Jb", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!af", name = "Mb", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!af", name = "xb", descriptor = "Ltb;")
    private class134 field105;

    @OriginalMember(owner = "client!af", name = "zb", descriptor = "Lsc;")
    public static class128 field107 = class129.method1017(false, "mapscene");

    @OriginalMember(owner = "client!af", name = "Db", descriptor = "[Z")
    public static boolean[] field111 = new boolean[100];

    @OriginalMember(owner = "client!af", name = "vb", descriptor = "I")
    public static int field103 = 0;

    @OriginalMember(owner = "client!af", name = "ub", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!af", name = "wb", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!af", name = "yb", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!af", name = "Ab", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!af", name = "Bb", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!af", name = "Gb", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!af", name = "Hb", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!af", name = "Kb", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V")
    public static final void method31(byte arg0) {
        field115++;
        if (class124.field2814 != null) {
            class124.field2814.method715((byte) -53);
        }
        if (arg0 != 0) {
            field107 = null;
        }
        if (class27.field521 != null) {
            class27.field521.method715((byte) -86);
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
    public static final void method32(int arg0) {
        field118++;
        if (arg0 < 102) {
            return;
        }
        int var1 = class97.field2255.method1079(class121.field2745);
        for (int var2 = 0; var2 < field103; var2++) {
            int var6 = class97.field2255.method1079(class40.method287((byte) 122, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        class92.field2082 = field103 * 15 + 22;
        class135.field3180 = true;
        var1 += 8;
        class149.field3441 = var1;
        int var3 = class43.field806 - var1 / 2;
        int var4 = class9.field133;
        int var5 = field103 * 15 + 21;
        if (var4 + var5 > 503) {
            var4 = 503 - var5;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class100.field2306 = var4;
        if (var1 + var3 > 765) {
            var3 = 765 - var1;
        }
        if (var3 < 0) {
            var3 = 0;
        }
        class99.field2298 = var3;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V")
    public static final void method33(byte arg0) {
        if (arg0 > -115) {
            field111 = null;
        }
        field106++;
        for (int var1 = 0; var1 < class124.field2802; var1++) {
            int var2 = class55.field1228[var1];
            class51 var3 = class92.field2104[var2];
            int var4 = class158.field3626.method646(-15447);
            if ((var4 & 0x80) != 0) {
                int var5 = class158.field3626.method659(90);
                int var6 = class158.field3626.method668(-24845);
                var3.method390(false, var6, class29.field554, var5);
                var3.field979 = class29.field554 + 300;
                var3.field952 = class158.field3626.method646(-15447);
                var3.field993 = class158.field3626.method646(-15447);
            }
            if ((var4 & 0x1) != 0) {
                var3.field968 = class158.field3626.method639(-113);
                int var7 = class158.field3626.method645((byte) 113);
                var3.field961 = var7 >> 16;
                var3.field998 = 0;
                var3.field966 = 0;
                var3.field1000 = (var7 & 0xFFFF) + class29.field554;
                if (var3.field968 == 65535) {
                    var3.field968 = -1;
                }
                if (class29.field554 < var3.field1000) {
                    var3.field998 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var8 = class158.field3626.method659(97);
                int var9 = class158.field3626.method646(-15447);
                var3.method390(false, var9, class29.field554, var8);
                var3.field979 = class29.field554 + 300;
                var3.field952 = class158.field3626.method659(65);
                var3.field993 = class158.field3626.method658(255);
            }
            if ((var4 & 0x40) != 0) {
                var3.field1001 = class158.field3626.method670(-1);
                var3.field1003 = 100;
            }
            if ((var4 & 0x10) != 0) {
                var3.field951 = class158.field3626.method632((byte) -80);
                if (var3.field951 == 65535) {
                    var3.field951 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1028 = class69.method518(true, class158.field3626.method650(65536));
                var3.field994 = var3.field1028.field1309;
                var3.field963 = var3.field1028.field1297;
                var3.field1010 = var3.field1028.field1293;
                var3.field1018 = var3.field1028.field1278;
                var3.field1013 = var3.field1028.field1307;
                var3.field977 = var3.field1028.field1269;
                var3.field953 = var3.field1028.field1285;
                var3.field960 = var3.field1028.field1290;
                var3.field1009 = var3.field1028.field1284;
            }
            if ((var4 & 0x20) != 0) {
                int var10 = class158.field3626.method678(0);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class158.field3626.method658(255);
                if (var3.field981 == var10 && var10 != -1) {
                    int var12 = class70.method527(12, var10).field3159;
                    if (var12 == 1) {
                        var3.field957 = 0;
                        var3.field1015 = 0;
                        var3.field973 = 0;
                        var3.field970 = var11;
                    }
                    if (var12 == 2) {
                        var3.field1015 = 0;
                    }
                } else if (var10 == -1 || var3.field981 == -1 || class70.method527(12, var10).field3161 >= class70.method527(12, var3.field981).field3161) {
                    var3.field981 = var10;
                    var3.field973 = 0;
                    var3.field1004 = var3.field947;
                    var3.field1015 = 0;
                    var3.field970 = var11;
                    var3.field957 = 0;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field980 = class158.field3626.method632((byte) -80);
                var3.field999 = class158.field3626.method650(65536);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
    public static final int method34(int arg0, int arg1) {
        field108++;
        if (arg1 != 21637) {
            field111 = null;
        }
        return arg0 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public static void method35(boolean arg0) {
        if (arg0) {
            field111 = null;
        }
        field111 = null;
        field107 = null;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)Llb;")
    public final class78 method1(int arg0) {
        field102++;
        class112 var2 = class147.method1184(this.field110, 13);
        if (arg0 != -20521144) {
            return null;
        }
        class78 var3;
        if (this.field100) {
            var3 = var2.method858(-1, -111);
        } else {
            var3 = var2.method858(this.field101, -104);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
    public static final void method36(int arg0) {
        if (arg0 > -41) {
            method35(true);
        }
        field114++;
        for (class79 var1 = (class79) class1.field8.method920((byte) 106); var1 != null; var1 = (class79) class1.field8.method932(-6)) {
            if (var1.field1761 != null) {
                class92.field2088.method434(var1.field1761);
                var1.field1761 = null;
            }
            if (var1.field1757 != null) {
                class92.field2088.method434(var1.field1757);
                var1.field1757 = null;
            }
        }
        class1.field8.method933(-12359);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIII)V")
    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field112 = arg5 + arg6;
        this.field113 = arg2;
        this.field119 = arg3;
        this.field110 = arg0;
        this.field117 = arg1;
        this.field120 = arg4;
        int var8 = class147.method1184(this.field110, 13).field2541;
        if (var8 == -1) {
            this.field100 = true;
        } else {
            this.field100 = false;
            this.field105 = class70.method527(12, var8);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)V")
    public final void method37(int arg0, int arg1) {
        field109++;
        if (this.field100) {
            return;
        }
        this.field116 += arg0;
        if (arg1 != 0) {
            field111 = null;
        }
        while (this.field116 > this.field105.field3162[this.field101]) {
            this.field116 -= this.field105.field3162[this.field101];
            this.field101++;
            if (this.field105.field3142.length <= this.field101) {
                this.field100 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lsc;Lsc;Lsf;IIIZ)V")
    public static final void method38(class128 arg0, class128 arg1, class131 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field104++;
        int var7 = arg2.method1036(arg1, (byte) -103);
        int var8 = -35 / ((arg3 - 51) / 35);
        int var9 = arg2.method1031(var7, arg0, (byte) 122);
        class41.method293(var9, arg6, var7, arg4, true, arg2, arg5);
    }
}
