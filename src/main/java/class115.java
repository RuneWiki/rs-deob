import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class115 {

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "[Lcja;")
    private class46[] field1366;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1373 = new String[] { method1019(method1018("O}$;\u0001\f")), method1019(method1018("O}$;~Mq,a|\f")), method1019(method1018("Jj)y")), method1019(method1018("O}$;\u0006\f")), method1019(method1018("_1k;?")), method1019(method1018("O}$;\u0004\f")), method1019(method1018("O}$;\u0007\f")), method1019(method1018("O}$;\u0005\f")), method1019(method1018("O}$;\u0003\f")), method1019(method1018("O}$;\u0000\f")) };

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "[[Ljava/lang/String;")
    public static String[][] field1369 = new String[][] { { method1019(method1018("n~+")), method1019(method1018("bz'")), method1019(method1018("i~7")), method1019(method1018("eo7")), method1019(method1018("i~<")), method1019(method1018("nj+")), method1019(method1018("nj)")), method1019(method1018("ej\"")), method1019(method1018("wz5")), method1019(method1018("k|1")), method1019(method1018("jp3")), method1019(method1018("`z&")) }, { method1019(method1018("n~+")), method1019(method1018("bz'")), method1019(method1018("iû7")), method1019(method1018("eo7")), method1019(method1018("i~,")), method1019(method1018("nj+")), method1019(method1018("nj)")), method1019(method1018("ej\"")), method1019(method1018("wz5")), method1019(method1018("kt1")), method1019(method1018("jp3")), method1019(method1018("`z?")) }, { method1019(method1018("N~+")), method1019(method1018("Bö3")), method1019(method1018("I~7f")), method1019(method1018("Ei7")), method1019(method1018("I~,")), method1019(method1018("Nj,{")), method1019(method1018("Nj,y")), method1019(method1018("Ep¾a")), method1019(method1018("Wz5a")), method1019(method1018("K|1")), method1019(method1018("Jp3")), method1019(method1018("@ö&")) }, { method1019(method1018("N~+")), method1019(method1018("Bz3")), method1019(method1018("I~7")), method1019(method1018("E}7")), method1019(method1018("I~,")), method1019(method1018("Nj+")), method1019(method1018("Nj)")), method1019(method1018("Ex*")), method1019(method1018("Wz1")), method1019(method1018("Kj1")), method1019(method1018("Jp3")), method1019(method1018("@z?")) }, { method1019(method1018("N~+")), method1019(method1018("Bz'")), method1019(method1018("Im1")), method1019(method1018("Eo7")), method1019(method1018("Iz,")), method1019(method1018("Nj+")), method1019(method1018("Nj)")), method1019(method1018("Ej\"")), method1019(method1018("Wz5")), method1019(method1018("Kt1")), method1019(method1018("Jp3")), method1019(method1018("@z&")) } };

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "Lef;")
    public static class513 field1368 = new class513();

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "Lvea;")
    public static class288 field1372 = new class288();

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "J")
    private long field1362;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "Lcja;")
    private class46 field1367;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V")
    public static final void method1011(int arg0, int arg1) {
        try {
            class601.field8821.method1557(arg0, (byte) -119);
            field1371++;
            if (arg1 != -13897) {
                field1368 = null;
            }
            class417.field6157.method1557(arg0, (byte) -118);
            class38.field446.method1557(arg0, (byte) -110);
            class356.field5473.method1557(arg0, (byte) -115);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1373[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(JI)Lcja;")
    public final class46 method1012(long arg0, int arg1) {
        try {
            field1361++;
            this.field1362 = arg0;
            class46 var4 = this.field1366[(int) ((long) (this.field1360 - 1) & arg0)];
            for (this.field1367 = var4.field529; this.field1367 != var4; this.field1367 = this.field1367.field529) {
                if (this.field1367.field533 == arg0) {
                    class46 var5 = this.field1367;
                    this.field1367 = this.field1367.field529;
                    return var5;
                }
            }
            if (arg1 != 0) {
                field1369 = null;
            }
            this.field1367 = null;
            return null;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1373[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZLcn;)V")
    public static final void method1013(boolean arg0, class541 arg1) {
        try {
            if (class254.field3940 == arg1.field8000) {
                class26.field321[arg1.field7993] = true;
            }
            if (!arg0) {
                method1014(null, false);
            }
            field1365++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1373[7] + arg0 + ',' + (arg1 == null ? field1373[2] : field1373[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lsg;Z)V")
    public static final void method1014(class417 arg0, boolean arg1) {
        try {
            field1364++;
            if (arg0 != null) {
                class728.field10549.method3868(-62, arg0);
                class593.field8707++;
                if (arg1) {
                    Object var2 = null;
                    class655 var5;
                    if (arg0.field6151 || "".equals(arg0.field6149)) {
                        var5 = new class655(arg0.field6149);
                        class184.field2547++;
                    } else {
                        long var3 = arg0.field6154;
                        for (var5 = (class655) class244.field3740.method977(var3, 1); var5 != null && !var5.field9460.equals(arg0.field6149); var5 = (class655) class244.field3740.method969(-36)) {
                        }
                        if (var5 == null) {
                            var5 = (class655) class71.field775.method1558((byte) 96, var3);
                            if (var5 != null && !var5.field9460.equals(arg0.field6149)) {
                                var5 = null;
                            }
                            if (var5 == null) {
                                var5 = new class655(arg0.field6149);
                            }
                            class244.field3740.method968((byte) -111, var3, var5);
                            class184.field2547++;
                        }
                    }
                    if (var5.method4806(arg0, 122)) {
                        class391.method3105(true, var5);
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1373[5] + (arg0 == null ? field1373[2] : field1373[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IJLcja;)V")
    public final void method1015(int arg0, long arg1, class46 arg2) {
        try {
            field1363++;
            if (arg2.field527 != null) {
                arg2.method362((byte) 72);
            }
            class46 var5 = this.field1366[(int) ((long) (this.field1360 - 1) & arg1)];
            arg2.field529 = var5;
            arg2.field527 = var5.field527;
            arg2.field527.field529 = arg2;
            arg2.field533 = arg1;
            arg2.field529.field527 = arg2;
            if (arg0 >= -21) {
                field1372 = null;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1373[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1373[2] : field1373[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(I)V")
    public class115(int arg0) {
        try {
            this.field1366 = new class46[arg0];
            this.field1360 = arg0;
            for (int var2 = 0; var2 < arg0; var2++) {
                class46 var3 = this.field1366[var2] = new class46();
                var3.field529 = var3;
                var3.field527 = var3;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1373[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)Lcja;")
    public final class46 method1016(int arg0) {
        try {
            field1370++;
            if (this.field1367 == null) {
                return null;
            }
            class46 var2 = this.field1366[(int) (this.field1362 & (long) (this.field1360 - 1))];
            if (arg0 < 17) {
                field1369 = null;
            }
            while (this.field1367 != var2) {
                if (this.field1367.field533 == this.field1362) {
                    class46 var3 = this.field1367;
                    this.field1367 = this.field1367.field529;
                    return var3;
                }
                this.field1367 = this.field1367.field529;
            }
            this.field1367 = null;
            return null;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1373[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V")
    public static void method1017(boolean arg0) {
        try {
            field1369 = null;
            field1372 = null;
            if (arg0) {
                method1017(false);
            }
            field1368 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1373[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1018(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1019(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
