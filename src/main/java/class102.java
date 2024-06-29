import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class102 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
    public static int[] field1844;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)I")
    public static final int method621(int arg0, int arg1, int arg2) {
        field1847++;
        if (arg2 != 0) {
            field1844 = null;
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static final void method622(int arg0) {
        class232.field4176.method1317((byte) 109);
        class69.field1365.method1026(-1);
        field1845++;
        if (arg0 < 23) {
            field1844 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static final void method623(int arg0) {
        if (arg0 != 12051) {
            method624(-24);
        }
        for (class22 var1 = (class22) class152.field2757.method1358(arg0 ^ 0xFFFFA4F1); var1 != null; var1 = (class22) class152.field2757.method1360(true)) {
            if (var1.field483 != null) {
                class109.field1937.method757(var1.field483);
                var1.field483 = null;
            }
            if (var1.field498 != null) {
                class109.field1937.method757(var1.field498);
                var1.field498 = null;
            }
        }
        class152.field2757.method1357(4);
        field1848++;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public static void method624(int arg0) {
        if (arg0 == 4712) {
            field1844 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(III)I")
    public static final int method625(int arg0, int arg1, int arg2) {
        field1840++;
        int var3 = -55 % ((30 - arg0) / 56);
        long var4 = (long) ((arg1 << 16) + arg2);
        return class94.field1753 != null && class94.field1753.field1881 == var4 ? class124.field2221.field4101 * 99 / (class124.field2221.field4087.length - class94.field1753.field3341) + 1 : 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILda;Lwa;I)V")
    public static final void method626(int arg0, class35 arg1, class229 arg2, int arg3) {
        field1841++;
        class19 var4 = new class19();
        var4.field400 = arg2.method1475(255);
        var4.field401 = arg2.method1437(425528536);
        var4.field408 = new int[var4.field400];
        var4.field410 = new int[var4.field400];
        var4.field409 = new int[var4.field400];
        var4.field395 = new class77[var4.field400];
        var4.field398 = new class77[var4.field400];
        var4.field407 = new byte[var4.field400][][];
        if (arg3 != 1) {
            return;
        }
        for (int var5 = 0; var5 < var4.field400; var5++) {
            try {
                int var6 = arg2.method1475(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg2.method1443((byte) -121).method958((byte) 99));
                    int var18 = 0;
                    String var19 = new String(arg2.method1443((byte) -114).method958((byte) 122));
                    if (var6 == 1) {
                        var18 = arg2.method1437(425528536);
                    }
                    var4.field408[var5] = var6;
                    var4.field409[var5] = var18;
                    var4.field395[var5] = arg1.method261(-123, var19, class15.method127(class112.method675(arg3, -2), var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg2.method1443((byte) -93).method958((byte) 113));
                    String var8 = new String(arg2.method1443((byte) -55).method958((byte) 109));
                    int var9 = arg2.method1475(255);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg2.method1443((byte) -123).method958((byte) 119));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method1437(425528536);
                            var12[var13] = new byte[var14];
                            arg2.method1456(0, (byte) 98, var14, var12[var13]);
                        }
                    }
                    var4.field408[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class15.method127(-1, var10[var16]);
                    }
                    var4.field398[var5] = arg1.method264(var15, class112.method675(arg3, 107), class15.method127(-1, var7), var8);
                    var4.field407[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field410[var5] = -1;
            } catch (SecurityException var21) {
                var4.field410[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field410[var5] = -3;
            } catch (Exception var23) {
                var4.field410[var5] = -4;
            } catch (Throwable var24) {
                var4.field410[var5] = -5;
            }
        }
        class168.field3067.method1361(var4, (byte) 71);
    }
}
