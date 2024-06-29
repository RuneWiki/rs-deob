import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class54 extends class120 {

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public int field1241 = -1;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "[I")
    private int[] field1251 = new int[6];

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "[I")
    private int[] field1260 = new int[6];

    @OriginalMember(owner = "client!j", name = "ib", descriptor = "Z")
    public boolean field1261 = false;

    @OriginalMember(owner = "client!j", name = "lb", descriptor = "[I")
    private int[] field1264 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!j", name = "U", descriptor = "Lva;")
    public static class121 field1247 = class107.method797("(U1", -10983);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "Lva;")
    public static class121 field1249 = class107.method797("@cr2@", -10983);

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "Lva;")
    private static class121 field1253 = class107.method797("yellow:", -10983);

    @OriginalMember(owner = "client!j", name = "S", descriptor = "Lva;")
    public static class121 field1245 = field1253;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    public static int field1257 = 0;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "Lva;")
    private static class121 field1254 = class107.method797("purple:", -10983);

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "Lva;")
    public static class121 field1252 = field1254;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!j", name = "jb", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!j", name = "kb", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!j", name = "mb", descriptor = "[I")
    private int[] field1265;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 21)
    public static final void method380(int arg0) {
        field1262++;
        if (arg0 != -11301) {
            field1247 = null;
        }
        for (class25 var1 = (class25) class67.field1607.method57((byte) 86); var1 != null; var1 = (class25) class67.field1607.method66(arg0 - 18559)) {
            if (var1.field622 == -1) {
                var1.field629 = 0;
                class21.method183(-26017, var1);
            } else {
                var1.method187((byte) 39);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)Z", line = 48)
    public final boolean method381(int arg0) {
        boolean var2 = true;
        field1239++;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field1264[var3] != -1 && !class1.field2.method329(this.field1264[var3], -1, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V", line = 72)
    public static void method382(boolean arg0) {
        field1253 = null;
        field1249 = null;
        field1254 = null;
        field1245 = null;
        field1247 = null;
        if (!arg0) {
            method388(null, -109);
        }
        field1252 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([Lva;III)Lva;", line = 91)
    public static final class121 method383(class121[] arg0, int arg1, int arg2, int arg3) {
        field1263++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg0[arg1 + var5] == null) {
                arg0[arg1 + var5] = class60.field1419;
            }
            var4 += arg0[arg1 + var5].field2783;
        }
        if (arg2 <= 75) {
            return null;
        }
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; var8 < arg3; var8++) {
            class121 var10 = arg0[arg1 + var8];
            class39.method263(var10.field2817, 0, var7, var6, var10.field2783);
            var6 += var10.field2783;
        }
        class121 var9 = new class121();
        var9.field2783 = var4;
        var9.field2817 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILtc;I)V", line = 140)
    private final void method384(int arg0, class113 arg1, int arg2) {
        if (arg0 >= -30) {
            method382(true);
        }
        field1248++;
        if (arg2 == 1) {
            this.field1241 = arg1.method821(true);
        } else if (arg2 == 2) {
            int var4 = arg1.method821(true);
            this.field1265 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1265[var5] = arg1.method870(-1);
            }
        } else if (arg2 == 3) {
            this.field1261 = true;
            return;
        } else if (arg2 < 40 || arg2 >= 50) {
            if (arg2 >= 50 && arg2 < 60) {
                this.field1260[arg2 - 50] = arg1.method870(-1);
                return;
            }
            if (arg2 >= 60 && arg2 < 70) {
                this.field1264[arg2 - 60] = arg1.method870(-1);
                return;
            }
        } else {
            this.field1251[arg2 - 40] = arg1.method870(-1);
            return;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILtc;)V", line = 192)
    public final void method385(int arg0, class113 arg1) {
        if (arg0 != -61) {
            return;
        }
        field1258++;
        while (true) {
            int var3 = arg1.method821(true);
            if (var3 == 0) {
                return;
            }
            this.method384(-84, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)Lrb;", line = 216)
    public final class102 method386(int arg0) {
        field1259++;
        class102[] var2 = new class102[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1264[var4] != -1) {
                var2[var3++] = class102.method711(class1.field2, this.field1264[var4], 0);
            }
        }
        class102 var5 = new class102(var2, var3);
        if (arg0 == 4922) {
            for (int var6 = 0; var6 < 6 && this.field1251[var6] != 0; var6++) {
                var5.method704(this.field1251[var6], this.field1260[var6]);
            }
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(B)Lrb;", line = 261)
    public final class102 method387(byte arg0) {
        field1246++;
        int var2 = -82 / ((5 - arg0) / 54);
        if (this.field1265 == null) {
            return null;
        }
        class102[] var3 = new class102[this.field1265.length];
        for (int var4 = 0; var4 < this.field1265.length; var4++) {
            var3[var4] = class102.method711(class1.field2, this.field1265[var4], 0);
        }
        class102 var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new class102(var3, var3.length);
        }
        for (int var6 = 0; var6 < 6 && this.field1251[var6] != 0; var6++) {
            var5.method704(this.field1251[var6], this.field1260[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lhe;I)V", line = 312)
    public static final void method388(class47 arg0, int arg1) {
        if (arg1 != -60) {
            field1252 = null;
        }
        field1244++;
        class96.field2156 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZIZI)Lbe;", line = 330)
    public static final class12 method389(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field1255++;
        if (arg4 != -28677) {
            method392(57);
        }
        class71 var5 = null;
        if (class71.field1671 != null) {
            var5 = new class71(arg2, class71.field1671, class35.field842[arg2], 1000000);
        }
        return new class12(var5, class115.field2623, arg2, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(B)Z", line = 353)
    public final boolean method390(byte arg0) {
        field1243++;
        if (this.field1265 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 >= -60) {
            this.field1251 = null;
        }
        for (int var3 = 0; var3 < this.field1265.length; var3++) {
            if (!class1.field2.method329(this.field1265[var3], -1, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(JI)V", line = 392)
    public static final void method391(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field1250++;
        if (arg1 != -22614) {
            field1257 = -26;
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V", line = 406)
    public static final void method392(int arg0) {
        field1256++;
        if (!class86.field1993) {
            return;
        }
        class82.field1895 = null;
        class53.field1237 = null;
        class41.field934 = null;
        if (arg0 > -118) {
            return;
        }
        class28.field713 = null;
        class37.field873 = null;
        class76.field1740 = null;
        class82.field1893 = null;
        class63.field1540 = null;
        class79.field1842 = null;
        class60.field1447 = null;
        class41.field927 = null;
        client.field419 = null;
        class69.field1654 = null;
        class128.field2938 = null;
        class50.field1189 = null;
        class5.field79 = null;
        class13.field242 = null;
        class58.field1351 = null;
        class47.field1119 = null;
        class78.field1828 = null;
        class44.field1012 = null;
        class37.field867 = null;
        class18.method155(10, (byte) 109);
        class80.method554(true, 4);
        class86.field1993 = false;
    }
}
