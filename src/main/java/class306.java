import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public abstract class class306 extends class188 {

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "[Lrf;")
    public class306[] field4771;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Z")
    public boolean field4759;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    public int field4769;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Lag;")
    public class131 field4757;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Ljm;")
    public class263 field4752;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "Lpa;")
    public static class2 field4767;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/lang/String;B[BII)I", line = 9)
    public static final int method2153(int arg0, String arg1, byte arg2, byte[] arg3, int arg4, int arg5) {
        int var6 = 14 % ((-arg2 - 14) / 51);
        field4754++;
        int var7 = arg4 - arg0;
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(arg0 + var8);
            if (!(var9 <= '\u0000' || var9 >= '\u0080') || !(var9 < ' ' || var9 > 'ÿ')) {
                arg3[arg5 + var8] = (byte) var9;
            } else if (var9 == '€') {
                arg3[arg5 + var8] = -128;
            } else if (var9 == '‚') {
                arg3[arg5 + var8] = -126;
            } else if (var9 == 'ƒ') {
                arg3[arg5 + var8] = -125;
            } else if (var9 == '„') {
                arg3[arg5 + var8] = -124;
            } else if (var9 == '…') {
                arg3[arg5 + var8] = -123;
            } else if (var9 == '†') {
                arg3[arg5 + var8] = -122;
            } else if (var9 == '‡') {
                arg3[arg5 + var8] = -121;
            } else if (var9 == 'ˆ') {
                arg3[arg5 + var8] = -120;
            } else if (var9 == '‰') {
                arg3[arg5 + var8] = -119;
            } else if (var9 == 'Š') {
                arg3[arg5 + var8] = -118;
            } else if (var9 == '‹') {
                arg3[arg5 + var8] = -117;
            } else if (var9 == 'Œ') {
                arg3[arg5 + var8] = -116;
            } else if (var9 == 'Ž') {
                arg3[arg5 + var8] = -114;
            } else if (var9 == '‘') {
                arg3[arg5 + var8] = -111;
            } else if (var9 == '’') {
                arg3[arg5 + var8] = -110;
            } else if (var9 == '“') {
                arg3[arg5 + var8] = -109;
            } else if (var9 == '”') {
                arg3[arg5 + var8] = -108;
            } else if (var9 == '•') {
                arg3[arg5 + var8] = -107;
            } else if (var9 == '–') {
                arg3[arg5 + var8] = -106;
            } else if (var9 == '—') {
                arg3[arg5 + var8] = -105;
            } else if (var9 == '˜') {
                arg3[arg5 + var8] = -104;
            } else if (var9 == '™') {
                arg3[arg5 + var8] = -103;
            } else if (var9 == 'š') {
                arg3[arg5 + var8] = -102;
            } else if (var9 == '›') {
                arg3[arg5 + var8] = -101;
            } else if (var9 == 'œ') {
                arg3[arg5 + var8] = -100;
            } else if (var9 == 'ž') {
                arg3[arg5 + var8] = -98;
            } else if (var9 == 'Ÿ') {
                arg3[arg5 + var8] = -97;
            } else {
                arg3[arg5 + var8] = 63;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V", line = 143)
    public static void method2154(boolean arg0) {
        if (!arg0) {
            field4767 = (class2) null;
        }
        field4767 = null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V", line = 166)
    public static final void method2155(byte arg0) {
        class337.field5401 = true;
        field4763++;
        if (arg0 <= 28) {
            method2157((String) null, true, -56, (String) null);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI)V", line = 184)
    public final void method2156(int arg0, byte arg1, int arg2) {
        if (arg1 != -50) {
            this.method43((byte) -57);
        }
        field4761++;
        int var4 = this.field4769 == 255 ? arg0 : this.field4769;
        if (this.field4759) {
            this.field4757 = new class131(var4, arg0, arg2);
        } else {
            this.field4752 = new class263(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V", line = 207)
    public static final void method2157(String arg0, boolean arg1, int arg2, String arg3) {
        class277.method1979(-1, arg3, (String) null, (byte) -80, arg2, arg0);
        if (arg1) {
            field4767 = (class2) null;
        }
        field4772++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII)Lqn;", line = 219)
    public static final class238 method2158(int arg0, int arg1, int arg2, int arg3) {
        field4756++;
        class238 var4 = new class238();
        var4.field3663 = arg2;
        var4.field3658 = arg1;
        class88.field1166.method764(24369, var4, (long) arg0);
        class298.method2106((byte) -128, arg1);
        class323 var5 = class45.method277(-12866, arg0);
        if (var5 != null) {
            class107.method693(var5, arg3 ^ 0x6);
        }
        if (class13.field126 != null) {
            class107.method693(class13.field126, arg3 + 6);
            class13.field126 = null;
        }
        int var6 = class74.field924;
        for (int var7 = arg3; var7 < var6; var7++) {
            if (class191.method1304(arg3 ^ 0xFFFFEEE6, class105.field1442[var7])) {
                class108.method694(var7, false);
            }
        }
        if (class74.field924 == 1) {
            class38.field437 = false;
            class181.method1251(class151.field2399, class357.field5669, false, class257.field4073, class251.field3977);
        } else {
            class181.method1251(class151.field2399, class357.field5669, false, class257.field4073, class251.field3977);
            int var8 = class93.field1233.method1692(class110.field1513);
            for (int var9 = 0; var9 < class74.field924; var9++) {
                int var10 = class93.field1233.method1692(class2.method14(var9, true));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class257.field4073 = var8 + 8;
            class251.field3977 = class74.field924 * 15 + (class161.field2481 ? 26 : 22);
        }
        if (var5 != null) {
            class310.method2194(false, arg3 + 24206, var5);
        }
        class110.method713(arg1, true);
        if (class345.field5482 != -1) {
            class106.method688((byte) -24, 1, class345.field5482);
        }
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I", line = 293)
    public int[] method47(int arg0, int arg1) {
        if (arg1 == -1546337535) {
            field4760++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILlf;I)V", line = 304)
    public void method45(int arg0, class143 arg1, int arg2) {
        field4768++;
        if (arg0 != -15334) {
            this.field4752 = (class263) null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)Ljava/lang/String;", line = 322)
    public static final String method2159(int arg0, int arg1) {
        field4758++;
        if (arg1 != 4) {
            method2155((byte) -77);
        }
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() <= 9) {
            return var2.length() <= 6 ? " <col=ffff00>" + var2 + "</col>" : " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class74.field942 + " (" + var2 + ")</col>";
        } else {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class246.field3873 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(IBI)[[I", line = 352)
    public final int[][] method2160(int arg0, byte arg1, int arg2) {
        field4764++;
        int var4 = 99 / ((66 - arg1) / 41);
        if (this.field4771[arg0].field4759) {
            int[] var5 = this.field4771[arg0].method47(arg2, -1546337535);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field4771[arg0].method681(arg2, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(IBI)[I", line = 383)
    public final int[] method2161(int arg0, byte arg1, int arg2) {
        if (arg1 < 114) {
            this.field4771 = (class306[]) null;
        }
        field4751++;
        return this.field4771[arg2].field4759 ? this.field4771[arg2].method47(arg0, -1546337535) : this.field4771[arg2].method681(arg0, (byte) -119)[0];
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V", line = 407)
    public void method1343(int arg0) {
        field4755++;
        if (arg0 != -8222) {
            method2162(73, (Component) null);
        }
        if (this.field4759) {
            this.field4757.method902(0);
            this.field4757 = null;
        } else {
            this.field4752.method1867(arg0 + 8221);
            this.field4752 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 433)
    public static final void method2162(int arg0, Component arg1) {
        arg1.addMouseListener(class101.field1354);
        if (arg0 != -1) {
            field4767 = (class2) null;
        }
        arg1.addMouseMotionListener(class101.field1354);
        arg1.addFocusListener(class101.field1354);
        field4766++;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)I", line = 451)
    public int method1347(byte arg0) {
        if (arg0 == -120) {
            field4753++;
            return -1;
        } else {
            return -80;
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)I", line = 464)
    public int method1627(int arg0) {
        if (arg0 <= 63) {
            return -125;
        } else {
            field4762++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V", line = 475)
    public void method43(byte arg0) {
        field4765++;
        if (arg0 >= -103) {
            field4767 = (class2) null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)[[I", line = 490)
    public int[][] method681(int arg0, byte arg1) {
        if (arg1 != -119) {
            this.field4759 = true;
        }
        field4770++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IZ)V", line = 499)
    public class306(int arg0, boolean arg1) {
        this.field4771 = new class306[arg0];
        this.field4759 = arg1;
    }
}
