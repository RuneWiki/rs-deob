import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class335 {

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "F")
    public static float field5335 = 0.0F;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public int field5329;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field5334;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public int field5337;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2358(byte arg0) {
        field5340++;
        class223.field3687.method889((byte) -120);
        class289.field4699.method889((byte) 12);
        if (arg0 == -33) {
            class27.field679.method889((byte) -125);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Loe;I)V", line = 33)
    public final void method2359(class146 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1005((byte) 122);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.field5337 = 53;
                }
                field5330++;
                return;
            }
            this.method2364(11394, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;CB)I", line = 54)
    public static final int method2360(String arg0, char arg1, byte arg2) {
        field5333++;
        if (arg2 > -76) {
            return -52;
        }
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1 == arg0.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIII)Z", line = 83)
    public static final boolean method2361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lhj;", line = 111)
    public static final class35 method2362(int arg0, int arg1) {
        field5339++;
        if (arg0 != 104) {
            field5335 = -0.86816186F;
        }
        class35 var2 = (class35) class103.field1896.method487(127, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class269.field4380.method1404(1, arg1, (byte) -104);
        } else {
            var3 = class147.field2505.method1404(1, arg1 & 0x7FFF, (byte) -92);
        }
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method261((byte) -75, new class146(var3));
        }
        if (arg1 >= 32768) {
            var4.method250(125);
        }
        class103.field1896.method491((long) arg1, -1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 152)
    public static final void method2363(int arg0) {
        field5332++;
        int var1 = class132.field2272.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class132.field2272[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class91.field1622; var4++) {
                    if (class358.field5701[var4] == class127.field2221[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class358.field5701[class91.field1622] = class127.field2221[var2];
                    var3 = class91.field1622++;
                }
                int var5 = 0;
                class146 var6 = new class146(class132.field2272[var2]);
                while (var6.field2435 < class132.field2272[var2].length && var5 < 511 && class255.field4184 < 1023) {
                    int var7 = var5++ << 6 | var3;
                    int var8 = var6.method989(106);
                    int var9 = (var8 & 0x1FB3) >> 7;
                    int var10 = var8 >> 14;
                    int var11 = (class127.field2221[var2] >> 8) * 64 + var9 - class272.field4426;
                    int var12 = var8 & 0x3F;
                    int var13 = (class127.field2221[var2] & 0xFF) * 64 + var12 - class21.field543;
                    class88 var14 = class133.method934(var6.method989(87), (byte) 13);
                    if (class149.field2533[var7] == null && (var14.field1601 & 0x1) > 0 && class208.field3479 == var10 && var11 >= 0 && (var11 + var14.field1565) < 104 && var13 >= 0 && var14.field1565 + var13 < 104) {
                        class149.field2533[var7] = new class314();
                        class314 var15 = class149.field2533[var7];
                        class23.field570[class255.field4184++] = var7;
                        var15.field221 = class267.field4371;
                        var15.method2271(67, var14);
                        var15.method48(var15.field5107.field1565, 0);
                        var15.field144 = var15.field216 = class250.field4096[var15.field5107.field1545];
                        var15.field135 = var15.field5107.field1546;
                        var15.field175 = var15.field5107.field1534;
                        if (var15.field135 == 0) {
                            var15.field216 = 0;
                        }
                        var15.method50(var11, -22748, var13, true, var15.method49((byte) 78));
                    }
                }
            }
        }
        int var16 = -33 / ((arg0 + 10) / 52);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILoe;I)V", line = 245)
    private final void method2364(int arg0, class146 arg1, int arg2) {
        field5336++;
        if (arg0 == 11394 && arg2 == 1) {
            this.field5329 = arg1.method989(118);
            this.field5334 = arg1.method1005((byte) 122);
            this.field5337 = arg1.method1005((byte) 122);
        }
    }
}
