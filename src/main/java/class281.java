import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class281 {

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field4478 = 0;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public int field4483;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "[S")
    public static short[] field4489;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II[Lha;)V")
    public static final void method1888(int arg0, int arg1, class267[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class267 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field4149 == 0) {
                    if (var4.field4160 != null) {
                        method1888(arg0, 30001, var4.field4160);
                    }
                    class261 var5 = (class261) class128.field1874.method1218((long) var4.field4113, arg1 ^ 0xFFFF8AB9);
                    if (var5 != null) {
                        class168.method1114(false, var5.field3940, arg0);
                    }
                }
                if (arg0 == 0 && var4.field4164 != null) {
                    class234 var6 = new class234();
                    var6.field3530 = var4.field4164;
                    var6.field3531 = var4;
                    class15.method118((byte) 114, var6);
                }
                if (arg0 == 1 && var4.field4087 != null) {
                    if (var4.field4058 >= 0) {
                        class267 var7 = class282.method1897(var4.field4113, 76);
                        if (var7 == null || var7.field4160 == null || var4.field4058 >= var7.field4160.length || var7.field4160[var4.field4058] != var4) {
                            continue;
                        }
                    }
                    class234 var8 = new class234();
                    var8.field3531 = var4;
                    var8.field3530 = var4.field4087;
                    class15.method118((byte) 73, var8);
                }
            }
        }
        if (arg1 != 30001) {
            field4482 = -11;
        }
        field4491++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static void method1889(int arg0) {
        if (arg0 != 1) {
            method1889(-48);
        }
        field4489 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1890(byte arg0, String arg1) {
        field4486++;
        if (arg0 != -79) {
            field4482 = -81;
        }
        int var2 = arg1.length();
        byte var3 = 2;
        char[] var4 = new char[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = class40.method271(true, var6);
            }
            if (Character.isLetter(var6)) {
                var3 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)Z")
    public final boolean method1891(byte arg0) {
        field4479++;
        if (arg0 < 113) {
            method1896(112, -32, -87, 16);
        }
        return (this.field4487 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)Z")
    public final boolean method1892(byte arg0) {
        int var2 = -8 % ((43 - arg0) / 57);
        field4480++;
        return (this.field4487 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)Z")
    public final boolean method1893(byte arg0) {
        if (arg0 != 36) {
            field4478 = 51;
        }
        field4488++;
        return (this.field4487 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)I")
    public static final int method1894(int arg0, int arg1) {
        if (arg1 != 1510318950) {
            return -61;
        }
        int var2 = 0;
        field4481++;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)Z")
    public final boolean method1895(int arg0) {
        if (arg0 >= -74) {
            method1896(-43, -57, 118, -35);
        }
        field4477++;
        return (this.field4487 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)V")
    public static final void method1896(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 2) {
            field4490++;
            String var4 = "::tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
            System.out.println(var4);
            class173.method1139(10, var4);
        }
    }
}
