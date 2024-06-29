import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 extends class124 {

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    private int field905 = -1;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    private int field902 = 0;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "Lr;")
    public static class118 field906 = class153.method1136(81, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    public static int field910 = 0;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "Lr;")
    public static class118 field911 = class153.method1136(83, "Okay");

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "Lvc;")
    public static class149 field909 = new class149();

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "Lr;")
    private static class118 field916 = class153.method1136(79, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!f", name = "db", descriptor = "Lr;")
    public static class118 field914 = class153.method1136(122, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    public static int field917 = 10;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "I")
    public static int field918 = 1;

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "Lr;")
    public static class118 field919 = field916;

    @OriginalMember(owner = "client!f", name = "jb", descriptor = "Lr;")
    public static class118 field920 = class153.method1136(82, "Schlie-8en");

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "Lff;")
    public static class42 field915;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
    public final void method298(byte arg0) {
        this.method304((byte) 118, this.field902);
        if (arg0 != -72) {
            this.method298((byte) 69);
        }
        field912++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lff;I)V")
    public static final void method299(class42 arg0, int arg1) {
        field903++;
        class27.field653 = arg0;
        class128.field2954 = class27.field653.method343((byte) 103, 16);
        if (arg1 != 5378) {
            method299(null, -67);
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public static void method300(int arg0) {
        field915 = null;
        field906 = null;
        field916 = null;
        field919 = null;
        field909 = null;
        field914 = null;
        int var1 = 23 % ((arg0 + 52) / 43);
        field920 = null;
        field911 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILpa;B)V")
    public final void method301(int arg0, class105 arg1, byte arg2) {
        field907++;
        while (true) {
            int var4 = arg1.method831((byte) 76);
            if (var4 == 0) {
                if (arg2 == -124) {
                    return;
                } else {
                    this.method304((byte) -9, 105);
                    return;
                }
            }
            this.method302(false, arg0, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZILpa;I)V")
    private final void method302(boolean arg0, int arg1, class105 arg2, int arg3) {
        if (arg0) {
            this.method302(true, 50, null, -5);
        }
        if (arg3 == 1) {
            this.field902 = arg2.method799(-1);
        } else if (arg3 == 2) {
            this.field905 = arg2.method838((byte) 5);
            if (this.field905 == 65535) {
                this.field905 = -1;
            }
        }
        field904++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZJ)V")
    public static final void method303(boolean arg0, long arg1) {
        field900++;
        if (arg1 == 0L) {
            return;
        }
        class140.field3181++;
        class1.field22.method722(47, (byte) -127);
        if (!arg0) {
            class1.field22.method824(arg1, !arg0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)V")
    private final void method304(byte arg0, int arg1) {
        field913++;
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        if (arg0 != 118) {
            this.method301(-100, null, (byte) -75);
        }
        double var7 = 0.0D;
        double var9 = 0.0D;
        double var11 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var13 = var11;
        double var15 = var11;
        if (var11 < var3) {
            var15 = var3;
        }
        if (var15 < var5) {
            var15 = var5;
        }
        if (var3 < var11) {
            var13 = var3;
        }
        if (var5 < var13) {
            var13 = var5;
        }
        double var17 = (var13 + var15) / 2.0D;
        this.field908 = (int) (var17 * 256.0D);
        if (var13 != var15) {
            if (var11 == var15) {
                var7 = (var3 - var5) / (var15 - var13);
            } else if (var3 == var15) {
                var7 = (var5 - var11) / (var15 - var13) + 2.0D;
            } else if (var5 == var15) {
                var7 = (var11 - var3) / (var15 - var13) + 4.0D;
            }
            if (var17 < 0.5D) {
                var9 = (var15 - var13) / (var13 + var15);
            }
            if (var17 >= 0.5D) {
                var9 = (var15 - var13) / (2.0D - var15 - var13);
            }
        }
        this.field901 = (int) (var9 * 256.0D);
        if (var17 > 0.5D) {
            this.field899 = (int) ((1.0D - var17) * var9 * 512.0D);
        } else {
            this.field899 = (int) (var9 * var17 * 512.0D);
        }
        if (this.field899 < 1) {
            this.field899 = 1;
        }
        double var19 = var7 / 6.0D;
        if (this.field901 < 0) {
            this.field901 = 0;
        } else if (this.field901 > 255) {
            this.field901 = 255;
        }
        this.field898 = (int) ((double) this.field899 * var19);
        if (this.field908 < 0) {
            this.field908 = 0;
        } else if (this.field908 > 255) {
            this.field908 = 255;
            return;
        }
    }
}
