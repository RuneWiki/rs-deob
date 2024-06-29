import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class169 extends class279 {

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public int field2790;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[B)Ldk;", line = 11)
    public static final class226 method1263(int arg0, byte[] arg1) {
        field2785++;
        if (arg1 == null) {
            return null;
        } else {
            class226 var2 = new class226(arg1, class119.field1659, class206.field3261, class213.field3355, class81.field1103, class207.field3298);
            class207.method1526(arg0 ^ arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIII)V", line = 27)
    public final void method1264(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field2793 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = -89 % ((-arg1 - 13) / 35);
        int var9 = this.field2790 << 3;
        int var10 = (arg3 << 4) + (var9 & 0xF);
        this.method1268(var6, var9, var7, var10, arg0, arg4);
        field2789++;
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)Lvl;", line = 49)
    public static final class6 method1266(int arg0) {
        class6 var1 = new class6(34);
        field2781++;
        var1.method81((byte) -116, 11);
        var1.method81((byte) -110, class326.field5123);
        var1.method81((byte) -111, class184.field2982 ? 1 : 0);
        var1.method81((byte) -107, class317.field5019 ? 1 : 0);
        if (arg0 > -104) {
            field2786 = -52;
        }
        var1.method81((byte) -122, class99.field1334 ? 1 : 0);
        var1.method81((byte) -120, class206.field3280 ? 1 : 0);
        var1.method81((byte) -119, class187.field3018 ? 1 : 0);
        var1.method81((byte) -128, class47.field622 ? 1 : 0);
        var1.method81((byte) -106, class14.field240 ? 1 : 0);
        var1.method81((byte) -124, class95.field1259 ? 1 : 0);
        var1.method81((byte) -102, class27.field399);
        var1.method81((byte) -102, class220.field3482 ? 1 : 0);
        var1.method81((byte) -106, class71.field985 ? 1 : 0);
        var1.method81((byte) -118, class198.field3163 ? 1 : 0);
        var1.method81((byte) -126, class48.field635);
        var1.method81((byte) -117, class86.field1164 ? 1 : 0);
        var1.method81((byte) -103, class144.field2277);
        var1.method81((byte) -117, class204.field3233);
        var1.method81((byte) -114, class10.field183);
        var1.method65((byte) -9, class202.field3214);
        var1.method65((byte) -9, class180.field2926);
        var1.method81((byte) -117, class151.method1104());
        var1.method34(class332.field5180, 294335144);
        var1.method81((byte) -124, class232.field3630);
        var1.method81((byte) -108, class36.field523 ? 1 : 0);
        var1.method81((byte) -111, class82.field1124 ? 1 : 0);
        var1.method81((byte) -102, class101.field1351);
        var1.method81((byte) -110, class163.field2648 ? 1 : 0);
        var1.method81((byte) -107, class245.field3828 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V", line = 100)
    public static final void method1270(byte arg0) {
        int var1 = 117 % ((-arg0 - 6) / 53);
        class234.field3657 = new class5();
        field2787++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)V", line = 109)
    public static final void method1271(int arg0, boolean arg1) {
        if (arg1) {
            if (class147.field2321 != -1) {
                class10.method131(75, class147.field2321);
            }
            for (class25 var2 = (class25) class210.field3304.method2174(256); var2 != null; var2 = (class25) class210.field3304.method2164((byte) 126)) {
                class6.method86(true, var2, false);
            }
            class147.field2321 = -1;
            class210.field3304 = new class311(8);
            class273.method1923(-8522);
            class147.field2321 = class6.field102;
            class197.method1462(false, (byte) -50);
            class1.method4(0);
            class107.method731(class147.field2321, arg0 ^ 0xFFFFAC49);
        }
        field2792++;
        if (arg0 != -21431) {
            method1266(-68);
        }
        class337.field5258 = -1;
        class272.method1916((byte) -26, class220.field3491);
        class146.field2310 = new class337();
        class146.field2310.field4698 = 3000;
        class146.field2310.field4731 = 3000;
        if (!class109.field1458 && class27.field409 == 0) {
            class199.method1468((byte) 28, class256.field4042);
            class68.method538(-103, 10);
            return;
        }
        if (class166.field2715 == 2) {
            class317.field5018 = class78.field1047 << 7;
            class295.field4572 = class21.field313 << 7;
        } else {
            class160.method1190(40);
        }
        if (class109.field1458) {
            class113.method806((byte) -46);
        }
        class123.method902(true);
        class68.method538(-90, 28);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lvc;IILvl;)V", line = 177)
    public static final void method1272(class137 arg0, int arg1, int arg2, class6 arg3) {
        field2782++;
        class269 var4 = new class269();
        var4.field4180 = arg3.method58(-288140008);
        var4.field4186 = arg3.method73((byte) 19);
        var4.field4189 = new int[var4.field4180];
        var4.field4178 = new class114[var4.field4180];
        var4.field4187 = new int[var4.field4180];
        var4.field4190 = new int[var4.field4180];
        var4.field4175 = new byte[var4.field4180][][];
        var4.field4183 = new class114[var4.field4180];
        for (int var5 = 0; var5 < var4.field4180; var5++) {
            try {
                int var6 = arg3.method58(-288140008);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method40(false);
                    String var8 = arg3.method40(false);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method73((byte) 19);
                    }
                    var4.field4187[var5] = var6;
                    var4.field4189[var5] = var9;
                    var4.field4178[var5] = arg0.method1018(var8, -127, class6.method66(-1, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method40(false);
                    String var11 = arg3.method40(false);
                    int var12 = arg3.method58(-288140008);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method40(false);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method73((byte) 19);
                            var15[var16] = new byte[var17];
                            arg3.method60((byte) 88, 0, var17, var15[var16]);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field4187[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class6.method66(-1, var13[var19]);
                    }
                    var4.field4183[var5] = arg0.method1024((byte) -48, var18, class6.method66(-1, var10), var11);
                    var4.field4175[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4190[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4190[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4190[var5] = -3;
            } catch (Exception var28) {
                var4.field4190[var5] = -4;
            } catch (Throwable var29) {
                var4.field4190[var5] = -5;
            }
        }
        class234.field3657.method19(var4, -1058);
        if (arg2 >= -127) {
            field2786 = 20;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V")
    public abstract void method1262(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)V")
    public abstract void method1265(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
    public abstract void method1267(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
    public abstract void method1269(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)V")
    public abstract void method1273(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
    public abstract void method1274(int arg0, int arg1, int arg2, int arg3, int arg4);
}
