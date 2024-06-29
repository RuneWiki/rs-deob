import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 extends class12 {

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "Lpe;")
    public static class109 field1997 = class141.method1120("Mem:", 0);

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "[I")
    public static int[] field1998 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Lpe;")
    private static class109 field2008 = class141.method1120("as it was used to break our rules)3", 0);

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field2000 = 0;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "Lpe;")
    public static class109 field1999 = class141.method1120("<)4col>", 0);

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Lpe;")
    public static class109 field2002 = field2008;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "Lpe;")
    public static class109 field2005 = class141.method1120("::qa_op_test", 0);

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    public static int field2020 = 0;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "Lpe;")
    public static class109 field2003 = class141.method1120("Sprites geladen)3", 0);

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Lpe;")
    private static class109 field1995 = class141.method1120("glow2:", 0);

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "Lpe;")
    public static class109 field1994 = field1995;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Lpe;")
    public static class109 field1996 = field1995;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public int field2007;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "Lpe;")
    public class109 field2017;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "Lwa;")
    public class154 field2014;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lwa;")
    public class154 field2018;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "[I")
    public static int[] field2010;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "[Ljava/lang/Object;")
    public Object[] field2001;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lna;Ljava/awt/Component;ILna;)V")
    public static final void method772(class91 arg0, Component arg1, int arg2, class91 arg3) {
        field2006++;
        if (class76.field1531) {
            return;
        }
        class140.method1102();
        byte[] var4 = arg0.method758(class72.field1473, class72.field1476, (byte) 124);
        class94.field2033 = new class29(var4, arg1);
        class78.field1637 = class94.field2033.method276();
        class149.field3300 = class71.method575(arg3, class72.field1473, class87.field1852, -66);
        class124.field2750 = class71.method575(arg3, class72.field1473, class3.field76, -85);
        class1.field2 = class71.method575(arg3, class72.field1473, class156.field3595, arg2 - 118);
        class134.field2929 = class50.method427(arg3, class112.field2430, class72.field1473, 88);
        class145.field3183 = class50.method427(arg3, class32.field700, class72.field1473, 77);
        class24.field585 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class24.field585[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class24.field585[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class24.field585[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = arg2; var8 < 64; var8++) {
            class24.field585[var8 + 192] = 16777215;
        }
        class50.field1046 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class50.field1046[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class50.field1046[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class50.field1046[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class50.field1046[var12 + 192] = 16777215;
        }
        class13.field287 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class13.field287[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class13.field287[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class13.field287[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class13.field287[var16 + 192] = 16777215;
        }
        class14.field352 = new int[32768];
        class55.field1133 = new int[256];
        class4.field110 = new int[32768];
        class141.method1126(-95, null);
        class145.field3187 = 0;
        class72.field1478 = class72.field1473;
        class118.field2627 = new int[32768];
        class25.field616 = new int[32768];
        class72.field1468 = class72.field1473;
        class79.field1660 = false;
        if (class48.field999 == 0) {
            class43.field903 = true;
        } else {
            class43.field903 = false;
        }
        if (class43.field903) {
            class79.method634(-1, 2);
        } else {
            class154.method1195(class72.field1473, 2, 255, class3.field74, false, arg2 + 84, class107.field2241);
        }
        class122.method988((byte) 70, false);
        class76.field1531 = true;
        class94.field2033.method264(0, 0);
        class78.field1637.method264(382, 0);
        class149.field3300.method539(382 - class149.field3300.field1386 / 2, 18);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static final void method773(int arg0) {
        if (arg0 != 7944) {
            return;
        }
        for (int var1 = -1; var1 < class44.field927; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class92.field1973[var1];
            }
            class50 var3 = class104.field2194[var2];
            if (var3 != null) {
                class8.method79(1, 10637, var3);
            }
        }
        field2019++;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public static void method774(int arg0) {
        field1994 = null;
        field1998 = null;
        field2002 = null;
        field1996 = null;
        if (arg0 != 128) {
            return;
        }
        field2010 = null;
        field1997 = null;
        field1995 = null;
        field2005 = null;
        field2003 = null;
        field1999 = null;
        field2008 = null;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V")
    public static final void method775(byte arg0) {
        field2004++;
        if (arg0 != 8) {
            method775((byte) -62);
        }
        class25.field613 = new class64(32);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLub;)V")
    public static final void method776(boolean arg0, class141 arg1) {
        if (class12.field264 == arg1.field3070 || arg1.field3124 == -1 || arg1.field3081 != 0 || arg1.field3083 + 1 > class27.method238(8, arg1.field3124).field164[arg1.field3122]) {
            int var2 = arg1.field3070 - arg1.field3112;
            int var3 = arg1.field3093 * 128 + arg1.field3071 * 64;
            int var4 = arg1.field3084 * 128 + arg1.field3071 * 64;
            int var5 = arg1.field3098 * 128 + arg1.field3071 * 64;
            int var6 = class12.field264 - arg1.field3112;
            int var7 = arg1.field3086 * 128 + arg1.field3071 * 64;
            arg1.field3094 = ((var2 - var6) * var3 + var6 * var7) / var2;
            arg1.field3106 = ((var2 - var6) * var4 + var5 * var6) / var2;
        }
        if (arg1.field3105 == 0) {
            arg1.field3111 = 1024;
        }
        if (arg1.field3105 == 1) {
            arg1.field3111 = 1536;
        }
        arg1.field3092 = 0;
        if (arg1.field3105 == 2) {
            arg1.field3111 = 0;
        }
        field2011++;
        if (arg1.field3105 == 3) {
            arg1.field3111 = 512;
        }
        arg1.field3114 = arg1.field3111;
        if (arg0) {
            field1997 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    public static final void method777(int arg0) {
        field2015++;
        if (arg0 == 0 && class15.field381 != null) {
            class15.field381.method83((byte) -114);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILbe;)V")
    public static final void method778(int arg0, class13 arg1) {
        field2012++;
        byte[] var2 = new byte[24];
        if (class99.field2082 != null) {
            try {
                int var3 = 0;
                class99.field2082.method961(0L, 63);
                class99.field2082.method970(arg0 + 29303, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method145(0, 24, arg0, var2);
    }
}
