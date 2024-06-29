import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class168 extends class123 {

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "Ljava/lang/String;")
    private String field2705 = "null";

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public static int field2707 = -1;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
    public static int field2702 = 500;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "Z")
    public static boolean field2716 = false;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "C")
    public char field2710;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "C")
    public char field2715;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
    private int field2718;

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "Lpd;")
    public class3 field2706;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "Lpd;")
    private class3 field2714;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lie;IIIIII)Lie;", line = 9)
    public static final class94 method1248(class94 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = (long) arg5;
        field2708++;
        class94 var9 = (class94) class311.field4915.method2288(var7, (byte) 86);
        if (var9 == null) {
            class7 var10 = class7.method130(class147.field2407, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method121(64, 768, -50, -10, -50);
            class311.field4915.method2281(arg2 ^ 0x20A6, var7, var9);
        }
        int var11 = arg0.method755();
        if (arg2 != 8358) {
            return (class94) null;
        }
        int var12 = arg0.method754();
        int var13 = arg0.method771();
        int var14 = arg0.method758();
        class94 var15 = var9.method764(true, true, true);
        if (arg6 != 0) {
            var15.method772(arg6);
        }
        if (class162.field2623) {
            class206 var16 = (class206) var15;
            if (class170.method1265(arg4 + var11, arg1 + var13, class75.field1153, arg2 ^ 0x20A7) != arg3 || arg3 != class170.method1265(arg4 + var12, arg1 + var14, class75.field1153, 1)) {
                for (int var17 = 0; var17 < var16.field3214; var17++) {
                    var16.field3246[var17] += class170.method1265(var16.field3215[var17] + arg4, var16.field3233[var17] + arg1, class75.field1153, 1) - arg3;
                }
                var16.field3209.field1819 = false;
                var16.field3219.field3668 = false;
            }
        } else {
            class271 var18 = (class271) var15;
            if (arg3 != class170.method1265(arg4 + var11, arg1 + var13, class75.field1153, 1) || class170.method1265(arg4 + var12, arg1 + var14, class75.field1153, 1) != arg3) {
                for (int var19 = 0; var19 < var18.field4204; var19++) {
                    var18.field4196[var19] += class170.method1265(var18.field4207[var19] + arg4, var18.field4192[var19] + arg1, class75.field1153, 1) - arg3;
                }
                var18.field4202 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V", line = 90)
    private final void method1249(byte arg0) {
        this.field2714 = new class3(this.field2706.method77((byte) 119));
        field2717++;
        int var2 = -116 % ((arg0 + 18) / 52);
        for (class304 var3 = (class304) this.field2706.method71((byte) -93); var3 != null; var3 = (class304) this.field2706.method84(1)) {
            class304 var4 = new class304((int) var3.field879);
            this.field2714.method75(var4, -1, (long) var3.field4844);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 112)
    public final boolean method1250(byte arg0, String arg1) {
        field2703++;
        if (this.field2706 == null) {
            return false;
        }
        if (this.field2714 == null) {
            this.method1251(arg0 ^ 0x7D84E243);
        }
        if (arg0 != -73) {
            field2702 = 8;
        }
        for (class251 var3 = (class251) this.field2714.method79(class99.method801(true, arg1), (byte) 0); var3 != null; var3 = (class251) this.field2714.method73(arg0 - 13501)) {
            if (var3.field3701.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V", line = 142)
    private final void method1251(int arg0) {
        if (arg0 != -2105860620) {
            field2716 = false;
        }
        field2711++;
        this.field2714 = new class3(this.field2706.method77((byte) 105));
        for (class214 var2 = (class214) this.field2706.method71((byte) -93); var2 != null; var2 = (class214) this.field2706.method84(1)) {
            class251 var3 = new class251(var2.field3337, (int) var2.field879);
            this.field2714.method75(var3, -1, class99.method801(true, var2.field3337));
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Laj;I)V", line = 168)
    public final void method1252(class1 arg0, int arg1) {
        if (arg1 != 0) {
            method1255((String) null, 114);
        }
        while (true) {
            int var3 = arg0.method15((byte) -125);
            if (var3 == 0) {
                field2701++;
                return;
            }
            this.method1256(arg0, -27338, var3);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z[I[ILph;[I)V", line = 191)
    public static final void method1253(boolean arg0, int[] arg1, int[] arg2, class86 arg3, int[] arg4) {
        field2696++;
        int var5 = 0;
        if (arg0) {
            return;
        }
        while (var5 < arg4.length) {
            int var6 = arg2[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var6 != 0 && var9 < arg3.field4636.length) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg3.field4636[var9] = null;
                    } else {
                        class38 var10 = class63.method503(var7, (byte) 91);
                        int var11 = var10.field575;
                        class63 var12 = arg3.field4636[var9];
                        if (var12 != null) {
                            if (var12.field923 == var7) {
                                if (var11 == 0) {
                                    var12 = arg3.field4636[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field921 = 0;
                                    var12.field917 = 0;
                                    var12.field916 = 0;
                                    var12.field920 = var8;
                                    var12.field919 = 1;
                                    class28.method246(false, 255, 0, arg3.field4671, var10, arg3.field4672);
                                } else if (var11 == 2) {
                                    var12.field921 = 0;
                                }
                            } else if (var10.field583 >= class63.method503(var12.field923, (byte) 69).field583) {
                                var12 = arg3.field4636[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class63 var13 = arg3.field4636[var9] = new class63();
                            var13.field916 = 0;
                            var13.field923 = var7;
                            var13.field920 = var8;
                            var13.field917 = 0;
                            var13.field919 = 1;
                            var13.field921 = 0;
                            class28.method246(false, 255, 0, arg3.field4671, var10, arg3.field4672);
                        }
                    }
                }
                var9++;
                var6 >>>= 0x1;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)I", line = 291)
    public static final int method1254(int arg0) {
        if (arg0 != 1) {
            method1254(105);
        }
        field2712++;
        return ((class22.field398 == 0 ? 0 : 1) << 22) + ((class80.field1253 == 0 ? 0 : 1) << 21) + ((class73.field1106 == 0 ? 0 : 1) << 20) + ((class144.field2326 << 17) + ((class229.field3531 ? 1 : 0) << 13) + ((class56.field853 ? 1 : 0) << 10) + ((class109.field1777 ? 1 : 0) << 9) + ((class257.field3810 ? 1 : 0) << 6) + ((class1.field70 ? 1 : 0) << 4) + ((class289.field4554 ? 1 : 0) << 3) + (class343.field5310 & 0x7) + ((class90.field1436 ? 1 : 0) << 5) + ((class55.field846 ? 1 : 0) << 7) - -((class149.field2435 ? 1 : 0) << 8) - -((class151.field2474 & 0x3) << 11) + ((class154.field2511 ? 1 : 0) << 15) + ((class140.field2267 ? 1 : 0) << 16) - (-((class60.field881 ? 1 : 0) << 19) + -(class236.method1686() << 23)));
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 304)
    public static final boolean method1255(String arg0, int arg1) {
        field2704++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 27 % ((arg1 - 48) / 50);
        for (int var3 = 0; var3 < class172.field2763; var3++) {
            if (arg0.equalsIgnoreCase(class129.field2066[var3])) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class345.field5363.field1486)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Laj;II)V", line = 336)
    private final void method1256(class1 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2715 = class15.method188(arg0.method55(4), arg1 ^ 0xFFFFB82C);
        } else if (arg2 == 2) {
            this.field2710 = class15.method188(arg0.method55(4), 11546);
        } else if (arg2 == 3) {
            this.field2705 = arg0.method53(32);
        } else if (arg2 == 4) {
            this.field2718 = arg0.method33(false);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method56(19612);
            this.field2706 = new class3(class319.method2255(arg1 + 27339, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method33(false);
                class60 var7;
                if (arg2 == 5) {
                    var7 = new class214(arg0.method53(32));
                } else {
                    var7 = new class304(arg0.method33(false));
                }
                this.field2706.method75(var7, -1, (long) var6);
            }
        }
        field2709++;
        if (arg1 != -27338) {
            method1253(false, (int[]) null, (int[]) null, (class86) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I", line = 389)
    public final int method1257(int arg0, int arg1) {
        if (arg1 != 45) {
            this.method1257(-101, -94);
        }
        field2698++;
        if (this.field2706 == null) {
            return this.field2718;
        } else {
            class304 var3 = (class304) this.field2706.method79((long) arg0, (byte) 0);
            return var3 == null ? this.field2718 : var3.field4844;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)Z", line = 409)
    public final boolean method1258(int arg0, byte arg1) {
        field2699++;
        if (this.field2706 == null) {
            return false;
        }
        if (this.field2714 == null) {
            this.method1249((byte) -115);
        }
        class304 var3 = (class304) this.field2714.method79((long) arg0, (byte) 0);
        int var4 = -46 / ((59 - arg1) / 44);
        return var3 != null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 440)
    public final String method1259(int arg0, boolean arg1) {
        field2713++;
        if (this.field2706 == null) {
            return this.field2705;
        }
        class214 var3 = (class214) this.field2706.method79((long) arg0, (byte) 0);
        if (var3 == null) {
            return this.field2705;
        } else {
            if (!arg1) {
                method1260((String) null, false, false, -79);
            }
            return var3.field3337;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;ZZI)Z", line = 463)
    public static final boolean method1260(String arg0, boolean arg1, boolean arg2, int arg3) {
        field2719++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        if (!arg2) {
            return true;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg3 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }
}
