import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class297 extends class101 {

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public int field4541;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field4548 = 0;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BC)Z", line = 4)
    public static final boolean method2069(byte arg0, char arg1) {
        if (arg0 <= 22) {
            field4548 = -123;
        }
        field4546++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[I[I[ILgg;)V", line = 23)
    public static final void method2070(int arg0, int[] arg1, int[] arg2, int[] arg3, class69 arg4) {
        field4544++;
        if (arg0 != 4) {
            method2071(8, -72);
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && arg4.field1485.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field1485[var9] = null;
                    } else {
                        class272 var10 = class72.method468(var6, arg0 ^ 0xFFFFFF81);
                        class122 var11 = arg4.field1485[var9];
                        int var12 = var10.field4177;
                        if (var11 != null) {
                            if (var11.field1905 == var6) {
                                if (var12 == 0) {
                                    var11 = arg4.field1485[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field1900 = 0;
                                    var11.field1899 = 0;
                                    var11.field1908 = 0;
                                    var11.field1903 = 1;
                                    var11.field1906 = var8;
                                    class167.method1170(arg4.field1505, var10, 0, arg0 ^ 0xFFFFFFC4, arg4.field1566, false);
                                } else if (var12 == 2) {
                                    var11.field1899 = 0;
                                }
                            } else if (var10.field4158 >= class72.method468(var11.field1905, -128).field4158) {
                                var11 = arg4.field1485[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class122 var13 = arg4.field1485[var9] = new class122();
                            var13.field1899 = 0;
                            var13.field1900 = 0;
                            var13.field1906 = var8;
                            var13.field1908 = 0;
                            var13.field1905 = var6;
                            var13.field1903 = 1;
                            class167.method1170(arg4.field1505, var10, 0, -64, arg4.field1566, false);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I", line = 120)
    public static final int method2071(int arg0, int arg1) {
        field4545++;
        int var2 = 52 / ((44 - arg0) / 37);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILpj;)V", line = 134)
    public static final void method2072(int arg0, class59 arg1) {
        field4543++;
        short var2 = 256;
        for (int var3 = arg0; var3 < class12.field135.length; var3++) {
            class12.field135[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var2);
            class12.field135[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var2 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class74.field960[var9] = (class12.field135[var9 - 1] + class12.field135[var9 - 128] + class12.field135[var9 + 1] + class12.field135[var9 - -128]) / 4;
                }
            }
            int[] var10 = class12.field135;
            class12.field135 = class74.field960;
            class74.field960 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field2358; var12++) {
            for (int var13 = 0; var13 < arg1.field2350; var13++) {
                if (arg1.field789[var11++] != 0) {
                    int var14 = var13 + arg1.field2362 + 16;
                    int var15 = var12 + arg1.field2354 + 16;
                    int var16 = (var15 << 7) + var14;
                    class12.field135[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(II)V", line = 225)
    public class297(int arg0, int arg1) {
        this.field4541 = arg1;
        this.field4549 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 239)
    public static final boolean method2073(byte arg0, String arg1) {
        if (arg0 != -87) {
            method2071(-25, -4);
        }
        field4547++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class193.field2892; var2++) {
            if (arg1.equalsIgnoreCase(class156.field2347[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class114.field1750.field2934)) {
            return true;
        } else {
            return false;
        }
    }
}
