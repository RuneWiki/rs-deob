import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class277 extends class286 {

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "Z")
    private boolean field4626 = true;

    @OriginalMember(owner = "client!hi", name = "ab", descriptor = "Z")
    private boolean field4634 = true;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "[I")
    public static int[] field4624 = new int[32];

    @OriginalMember(owner = "client!hi", name = "cb", descriptor = "Ltf;")
    public static class242 field4636 = new class242(64);

    @OriginalMember(owner = "client!hi", name = "db", descriptor = "Lbe;")
    public static class283 field4637 = class153.method941(-35, "Welt");

    @OriginalMember(owner = "client!hi", name = "eb", descriptor = "[S")
    public static short[] field4638 = new short[256];

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!hi", name = "bb", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V", line = 9)
    public static final void method1849(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4628++;
        for (int var5 = 0; var5 < class217.field3686; var5++) {
            if (class3.field32[var5] + class288.field4895[var5] > arg2 && (arg0 + arg2) > class288.field4895[var5] && arg3 < class70.field1209[var5] + class62.field861[var5] && (arg3 + arg4) > class62.field861[var5]) {
                class201.field3434[var5] = true;
            }
        }
        if (arg1 != 1) {
            field4636 = (class242) null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V", line = 35)
    public class277() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIBLea;)V", line = 46)
    public static final void method1850(int arg0, int arg1, byte arg2, class191 arg3) {
        field4625++;
        if ((arg1 & 0x20) != 0) {
            arg3.field1174 = class262.field4462.method1541((byte) -127);
            if (arg3.field1174 == 65535) {
                arg3.field1174 = -1;
            }
        }
        if ((arg1 & 0x400) != 0) {
            arg3.field1211 = class262.field4462.method1496(true);
            int var4 = class262.field4462.method1528(true);
            arg3.field1175 = var4 >> 16;
            arg3.field1165 = 0;
            if (arg3.field1211 == 65535) {
                arg3.field1211 = -1;
            }
            arg3.field1206 = 0;
            arg3.field1215 = class75.field1309 + (var4 & 0xFFFF);
            if (arg3.field1215 > class75.field1309) {
                arg3.field1206 = -1;
            }
            if (arg3.field1211 != -1 && class75.field1309 == arg3.field1215) {
                int var5 = class259.method1750((byte) 110, arg3.field1211).field2831;
                if (var5 != -1) {
                    class157 var6 = class132.method821(128, var5);
                    if (var6 != null && var6.field2578 != null) {
                        class141.method888(0, var6, arg3.field1210, class213.field3624 == arg3, 0, arg3.field1193);
                    }
                }
            }
        }
        if ((arg1 & 0x200) != 0) {
            int var7 = class262.field4462.method1543(255);
            int var8 = class262.field4462.method1525(-83);
            arg3.method455(var8, class75.field1309, 14095, var7);
        }
        if ((arg1 & 0x1) != 0) {
            int var9 = class262.field4462.method1496(true);
            int var10 = class262.field4462.method1525(107);
            int var11 = class262.field4462.method1535((byte) 80);
            int var12 = class262.field4462.field3905;
            boolean var13 = (var9 & 0x8000) != 0;
            if (arg3.field3274 != null && arg3.field3277 != null) {
                long var14 = arg3.field3274.method1929((byte) -24);
                boolean var16 = false;
                if (var10 <= 1) {
                    if (!var13 && (class68.field964 == 1 || class222.field3732 == 1)) {
                        var16 = true;
                    } else {
                        for (int var17 = 0; var17 < class195.field3330; var17++) {
                            if (class110.field1854[var17] == var14) {
                                var16 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var16 && class37.field539 == 0) {
                    class46.field628.field3905 = 0;
                    class262.field4462.method1539(29965, 0, class46.field628.field3879, var11);
                    class46.field628.field3905 = 0;
                    int var18 = -1;
                    class283 var19;
                    if (var13) {
                        class130 var20 = class127.method793(class46.field628, -28399);
                        var18 = var20.field2210;
                        var19 = var20.field2208.method2084(class46.field628, 100);
                        var9 &= 0x7FFF;
                    } else {
                        var19 = class244.method1661(class109.method723(class46.field628, (byte) 60).method1944(3511));
                    }
                    arg3.field1190 = var19.method1946((byte) -12);
                    arg3.field1162 = var9 & 0xFF;
                    arg3.field1194 = var9 >> 8;
                    arg3.field1189 = 150;
                    if (var10 == 2) {
                        class252.method1716(var18, var13 ? 17 : 1, (class283) null, 18, var19, class299.method2022(new class283[] { class225.field3767, arg3.method1240(false) }, (byte) 19));
                    } else if (var10 == 1) {
                        class252.method1716(var18, var13 ? 17 : 1, (class283) null, 95, var19, class299.method2022(new class283[] { class87.field1477, arg3.method1240(false) }, (byte) 3));
                    } else {
                        class252.method1716(var18, var13 ? 17 : 2, (class283) null, 49, var19, arg3.method1240(false));
                    }
                }
            }
            class262.field4462.field3905 = var11 + var12;
        }
        if ((arg1 & 0x40) != 0) {
            int var21 = class262.field4462.method1525(117);
            byte[] var22 = new byte[var21];
            class229 var23 = new class229(var22);
            class262.field4462.method1539(29965, 0, var22, var21);
            class177.field3041[arg0] = var23;
            arg3.method1244(var23, (byte) -45);
        }
        if ((arg1 & 0x10) != 0) {
            arg3.field1190 = class262.field4462.method1549(true);
            if (arg3.field1190.method1928(0, (byte) 62) == 126) {
                arg3.field1190 = arg3.field1190.method1914((byte) -110, 1);
                class60.method394(2, arg3.field1190, arg3.method1240(false), (byte) 89);
            } else if (class213.field3624 == arg3) {
                class60.method394(2, arg3.field1190, arg3.method1240(false), (byte) 56);
            }
            arg3.field1194 = 0;
            arg3.field1162 = 0;
            arg3.field1189 = 150;
        }
        if ((arg1 & 0x8) != 0) {
            int var24 = class262.field4462.method1535((byte) 76);
            int var25 = class262.field4462.method1525(109);
            arg3.method455(var25, class75.field1309, 14095, var24);
            arg3.field1213 = class75.field1309 + 300;
            arg3.field1214 = class262.field4462.method1543(255);
        }
        if (arg2 > -2) {
            method1856(false);
        }
        if ((arg1 & 0x100) != 0) {
            arg3.field1185 = class262.field4462.method1545(-128);
            arg3.field1198 = class262.field4462.method1545(-128);
            arg3.field1197 = class262.field4462.method1545(-128);
            arg3.field1208 = class262.field4462.method1535((byte) 109);
            arg3.field1166 = class262.field4462.method1496(true) + class75.field1309;
            arg3.field1156 = class262.field4462.method1496(true) + class75.field1309;
            arg3.field1177 = class262.field4462.method1545(-128);
            arg3.field1183 = 0;
            arg3.field1212 = 1;
        }
        if ((arg1 & 0x80) != 0) {
            arg3.field1179 = class262.field4462.method1496(true);
            arg3.field1164 = class262.field4462.method1496(true);
        }
        if ((arg1 & 0x4) == 0) {
            return;
        }
        int var26 = class262.field4462.method1496(true);
        if (var26 == 65535) {
            var26 = -1;
        }
        int var27 = class262.field4462.method1543(255);
        class242.method1632(var26, arg3, (byte) 104, var27);
    }

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "(I)V", line = 286)
    public static void method1851(int arg0) {
        if (arg0 > -110) {
            field4638 = (short[]) null;
        }
        field4636 = null;
        field4624 = null;
        field4637 = null;
        field4638 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lfe;ZI)V", line = 318)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field4626 = arg0.method1535((byte) 109) == 1;
        } else if (arg2 == 1) {
            this.field4634 = arg0.method1535((byte) 91) == 1;
        } else if (arg2 == 2) {
            this.field4876 = arg0.method1535((byte) 123) == 1;
        }
        if (arg1) {
            this.method14(96, 121);
        }
        field4623++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)[[I", line = 356)
    public final int[][] method16(int arg0, byte arg1) {
        if (arg1 != -19) {
            field4637 = (class283) null;
        }
        field4622++;
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int[][] var4 = this.method1964(this.field4634 ? class126.field2100 - arg0 : arg0, 0, false);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            if (this.field4626) {
                for (int var11 = 0; var11 < class27.field410; var11++) {
                    var9[var11] = var5[class284.field4857 - var11];
                    var8[var11] = var6[class284.field4857 - var11];
                    var10[var11] = var7[class284.field4857 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class27.field410; var12++) {
                    var9[var12] = var5[var12];
                    var8[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)[I", line = 428)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 > -52) {
            method1853(127, true);
        }
        field4627++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int[] var4 = this.method1963(this.field4634 ? class126.field2100 - arg1 : arg1, 0, -1);
            if (this.field4626) {
                for (int var5 = 0; var5 < class27.field410; var5++) {
                    var3[var5] = var4[class284.field4857 - var5];
                }
            } else {
                class136.method847(var4, 0, var3, 0, class27.field410);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)Lbe;", line = 463)
    public static final class283 method1852(int arg0, boolean arg1) {
        field4633++;
        if (arg1) {
            method1852(-84, true);
        }
        return arg0 < 999999999 ? class296.method2012(arg0, (byte) -70) : class299.field5065;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(IZ)V", line = 477)
    public static final void method1853(int arg0, boolean arg1) {
        if (arg0 != 65535) {
            method1850(-54, 78, (byte) 36, (class191) null);
        }
        class281.method1876((byte) 61);
        field4630++;
        if (class175.field3019 != 30 && class175.field3019 != 25) {
            return;
        }
        class19.field234++;
        if (class19.field234 < 50 && !arg1) {
            return;
        }
        class19.field234 = 0;
        if (!class86.field1455 && class263.field4484 != null) {
            class228.field3831.method621(250, 8);
            class197.field3373++;
            try {
                class263.field4484.method1278(class228.field3831.field3905, class228.field3831.field3879, 0, (byte) -37);
                class228.field3831.field3905 = 0;
            } catch (IOException var3) {
                class86.field1455 = true;
            }
        }
        class281.method1876((byte) 69);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lkg;II)Lbe;", line = 512)
    public static final class283 method1854(class69 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field4638 = (short[]) null;
        }
        field4631++;
        if (!class219.method1442(arg2, 89, client.method1601(arg0)) && arg0.field1103 == null) {
            return null;
        } else if (arg0.field1032 == null || arg2 >= arg0.field1032.length || arg0.field1032[arg2] == null || arg0.field1032[arg2].method1946((byte) -17).method1925((byte) -44) == 0) {
            return class297.field5037 ? class299.method2022(new class283[] { client.field4029, class296.method2012(arg2, (byte) 123) }, (byte) 74) : null;
        } else {
            return arg0.field1032[arg2];
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIZ)I", line = 542)
    public static final int method1855(int arg0, int arg1, int arg2, boolean arg3) {
        field4632++;
        class74 var4 = (class74) class170.field2860.method1612((long) arg1, 123);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = arg2; var6 < var4.field1290.length; var6++) {
            if (var4.field1290[var6] >= 0 && class72.field1259 > var4.field1290[var6]) {
                class304 var7 = class103.method676(var4.field1290[var6], arg2 - 1);
                if (var7.field5178 != null) {
                    class119 var8 = (class119) var7.field5178.method1612((long) arg0, 98);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field1288[var6] * var8.field1998;
                        } else {
                            var5 += var8.field1998;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(Z)V", line = 597)
    public static final void method1856(boolean arg0) {
        field4635++;
        class216.field3662 = arg0;
    }
}
