import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class72 extends class201 {

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "Ljd;")
    private class85 field1354 = class4.field46;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "[I")
    public static int[] field1357 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field1346 = -1;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "Ljd;")
    private static class85 field1353 = class221.method1499(" has logged in)3", (byte) -111);

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "Ljd;")
    public static class85 field1359 = field1353;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "Lpa;")
    public class204 field1345;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "Lpa;")
    private class204 field1349;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Z")
    public final boolean method502(int arg0, int arg1) {
        field1350++;
        int var3 = -53 % (arg0 / 40);
        if (this.field1345 == null) {
            return false;
        }
        if (this.field1349 == null) {
            this.method507(false);
        }
        class105 var4 = (class105) this.field1349.method1398(1, (long) arg1);
        return var4 != null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    private final void method503(byte arg0) {
        field1358++;
        this.field1349 = new class204(this.field1345.method1396(0));
        for (class79 var2 = (class79) this.field1345.method1392((byte) -120); var2 != null; var2 = (class79) this.field1345.method1399(-128)) {
            class73 var3 = new class73(var2.field1444, (int) var2.field4377);
            this.field1349.method1393(var3, var2.field1444.method628((byte) 110), 817);
        }
        if (arg0 != 60) {
            this.field1361 = -36;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILik;)V")
    public final void method504(int arg0, class247 arg1) {
        field1352++;
        if (arg0 != -1) {
            field1357 = null;
        }
        while (true) {
            int var3 = arg1.method1711((byte) -67);
            if (var3 == 0) {
                return;
            }
            this.method512(var3, arg1, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)Ljd;")
    public final class85 method505(boolean arg0, int arg1) {
        field1362++;
        if (this.field1345 == null) {
            return this.field1354;
        }
        class79 var3 = (class79) this.field1345.method1398(1, (long) arg1);
        if (var3 == null) {
            return this.field1354;
        } else if (arg0) {
            return var3.field1444;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)Ljb;")
    public static final class255 method506(int arg0, int arg1) {
        field1360++;
        int var2 = arg0 >> 16;
        if (arg1 != 0) {
            method506(15, -30);
        }
        int var3 = arg0 & 0xFFFF;
        if (class215.field3774[var2] == null || class215.field3774[var2][var3] == null) {
            boolean var4 = class222.method1508(0, var2);
            if (!var4) {
                return null;
            }
        }
        return class215.field3774[var2][var3];
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)V")
    private final void method507(boolean arg0) {
        field1365++;
        this.field1349 = new class204(this.field1345.method1396(0));
        for (class105 var2 = (class105) this.field1345.method1392((byte) -120); var2 != null; var2 = (class105) this.field1345.method1399(-121)) {
            class105 var3 = new class105((int) var2.field4377);
            this.field1349.method1393(var3, (long) var2.field1842, 817);
        }
        if (arg0) {
            method509((class247) null, 82);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLjd;)Z")
    public final boolean method508(boolean arg0, class85 arg1) {
        field1348++;
        if (this.field1345 == null) {
            return false;
        }
        if (this.field1349 == null) {
            this.method503((byte) 60);
        }
        if (arg0) {
            this.method512(-120, (class247) null, (byte) 38);
        }
        for (class73 var3 = (class73) this.field1349.method1398(1, arg1.method628((byte) 121)); var3 != null; var3 = (class73) this.field1349.method1395(1)) {
            if (var3.field1372.method612((byte) 115, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lik;I)Lj;")
    public static final class160 method509(class247 arg0, int arg1) {
        field1356++;
        if (arg1 != -3703) {
            field1353 = null;
        }
        return new class160(arg0.method1677(true), arg0.method1677(true), arg0.method1677(true), arg0.method1677(true), arg0.method1691(arg1 + 23091), arg0.method1711((byte) -67));
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)I")
    public final int method510(int arg0, int arg1) {
        field1366++;
        if (this.field1345 == null) {
            return this.field1361;
        }
        class105 var3 = (class105) this.field1345.method1398(1, (long) arg1);
        if (var3 == null) {
            return this.field1361;
        } else {
            if (arg0 > -99) {
                field1357 = null;
            }
            return var3.field1842;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1355++;
        int var8 = arg0 + arg2;
        int var9 = arg4 - arg0;
        int var10 = arg0 + arg7;
        int var11 = arg3 - arg0;
        for (int var12 = arg2; var12 < var8; var12++) {
            class183.method1260(arg6, arg7, arg1 - 114, class146.field2488[var12], arg3);
        }
        for (int var13 = arg4; var13 > var9; var13--) {
            class183.method1260(arg6, arg7, arg1 - 120, class146.field2488[var13], arg3);
        }
        if (arg1 != 0) {
            field1353 = null;
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class146.field2488[var14];
            class183.method1260(arg6, arg7, 42, var15, var10);
            class183.method1260(arg5, var10, 8, var15, var11);
            class183.method1260(arg6, var11, -112, var15, arg3);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILik;B)V")
    private final void method512(int arg0, class247 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field1363 = arg1.method1711((byte) -67);
        } else if (arg0 == 2) {
            this.field1343 = arg1.method1711((byte) -67);
        } else if (arg0 == 3) {
            this.field1354 = arg1.method1692(119);
        } else if (arg0 == 4) {
            this.field1361 = arg1.method1712(6357);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1694((byte) -100);
            this.field1345 = new class204(class113.method804(var4, 127));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1712(6357);
                class253 var7;
                if (arg0 == 5) {
                    var7 = new class79(arg1.method1692(102));
                } else {
                    var7 = new class105(arg1.method1712(6357));
                }
                this.field1345.method1393(var7, (long) var6, 817);
            }
        }
        field1351++;
        if (arg2 <= 53) {
            this.method507(true);
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(Z)V")
    public static void method513(boolean arg0) {
        field1359 = null;
        if (arg0) {
            field1346 = -100;
        }
        field1357 = null;
        field1353 = null;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(II)V")
    public static final void method514(int arg0, int arg1) {
        if (arg0 > -78) {
            field1353 = null;
        }
        field1364++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class66.method443((byte) 121);
        } else if (arg1 == 2) {
            class181.method1246(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lik;B)Ltk;")
    public static final class50 method515(class247 arg0, byte arg1) {
        if (arg1 != 43) {
            return null;
        }
        field1344++;
        class50 var2 = new class50();
        var2.field876 = arg0.method1694((byte) -100);
        var2.field885 = class242.method1640(var2.field876, arg1 + 84);
        return var2;
    }
}
