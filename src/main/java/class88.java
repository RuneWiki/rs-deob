import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class88 {

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    private int field1042 = 128;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public int field1047 = -1;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Z")
    public boolean field1051 = false;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    private int field1050 = 0;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    private int field1053 = 128;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "B")
    public byte field1055 = 0;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    private int field1056 = 0;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    private int field1059 = -1;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    private int field1063 = 0;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "J")
    public static long field1040 = 0L;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Lho;")
    public static class103 field1045 = new class103(59, 3);

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "[Lol;")
    public static class189[] field1060 = new class189[6];

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Les;")
    public class261 field1044;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[S")
    private short[] field1038;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "[S")
    private short[] field1049;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "[S")
    private short[] field1054;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "[S")
    private short[] field1058;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLya;ILza;IZIILvm;Lya;III)Le;")
    public final class373 method482(byte arg0, class38 arg1, int arg2, class287 arg3, int arg4, boolean arg5, int arg6, int arg7, class485 arg8, class38 arg9, int arg10, int arg11, int arg12) {
        field1039++;
        int var14 = -58 % ((arg0 + 3) / 55);
        return this.method484(arg10, arg1, arg2, arg4, arg9, arg11, arg5, arg8, (byte) 2, arg3, arg7, arg12, arg6, -90);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILvm;IILza;I)Le;")
    public final class373 method483(int arg0, int arg1, class485 arg2, int arg3, int arg4, class287 arg5, int arg6) {
        if (arg6 != 0) {
            this.method487(-65, 54, null);
        }
        field1041++;
        return this.method484(0, null, arg3, 0, null, 0, false, arg2, (byte) 5, arg5, arg1, arg4, arg0, -60);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILya;IILya;IZLvm;BLza;IIII)Le;")
    private final class373 method484(int arg0, class38 arg1, int arg2, int arg3, class38 arg4, int arg5, boolean arg6, class485 arg7, byte arg8, class287 arg9, int arg10, int arg11, int arg12, int arg13) {
        field1062++;
        int var15 = arg10;
        class260 var16 = this.field1047 == -1 || arg11 == -1 ? null : arg7.method2951(this.field1047, -13765);
        boolean var17 = arg6 & this.field1055 != 0;
        if (var16 != null) {
            var15 = arg10 | var16.method1604(arg11, false, arg2, (byte) 117);
        }
        if (var17) {
            var15 |= this.field1055 == 3 ? 7 : 2;
        }
        if (this.field1053 != 128) {
            var15 |= 0x2;
        }
        if (this.field1042 != 128 || this.field1056 != 0) {
            var15 |= 0x5;
        }
        class509 var18 = this.field1044.field3506;
        class373 var19;
        synchronized (this.field1044.field3506) {
            var19 = (class373) this.field1044.field3506.method3032(3589, (long) (this.field1064 |= arg9.field3766 << 29));
        }
        if (var19 == null || arg9.method1191(var19.method2025(), var15) != 0) {
            if (var19 != null) {
                var15 = arg9.method1211(var15, var19.method2025());
            }
            int var20 = var15;
            if (this.field1058 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field1054 != null) {
                var20 |= 0x8000;
            }
            class131 var21 = class490.method2960(0, this.field1048, this.field1044.field3502, 117);
            if (var21 == null) {
                return null;
            }
            if (var21.field1693 < 13) {
                var21.method787(0, 0);
            }
            var19 = arg9.method1213(var21, var20, this.field1044.field3507, this.field1050 + 64, this.field1063 + 850);
            if (this.field1058 != null) {
                for (int var22 = 0; var22 < this.field1058.length; var22++) {
                    var19.method2032(this.field1058[var22], this.field1049[var22]);
                }
            }
            if (this.field1054 != null) {
                for (int var23 = 0; var23 < this.field1054.length; var23++) {
                    var19.method2018(this.field1054[var23], this.field1038[var23]);
                }
            }
            var19.method2034(var15);
            class509 var24 = this.field1044.field3506;
            synchronized (this.field1044.field3506) {
                this.field1044.field3506.method3046((long) (this.field1064 |= arg9.field3766 << 29), var19, 1);
            }
        }
        if (arg13 > -57) {
            method486((byte) 43);
        }
        class373 var25 = var16 == null ? var19.method2027(arg8, var15, true) : var16.method1598(var15, var19, arg12, arg2, arg11, 0, arg8, 8294);
        if (this.field1042 != 128 || this.field1053 != 128) {
            var25.method2035(this.field1042, this.field1053, this.field1042);
        }
        if (this.field1056 != 0) {
            if (this.field1056 == 90) {
                var25.method2014(4096);
            }
            if (this.field1056 == 180) {
                var25.method2014(8192);
            }
            if (this.field1056 == 270) {
                var25.method2014(12288);
            }
        }
        if (var17) {
            var25.method2038(this.field1055, this.field1059, arg1, arg4, arg0, arg3, arg5);
        }
        var25.method2034(arg10);
        return var25;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZII)V")
    public static final void method485(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class106.field1443.field5729 = 0;
        if (arg2) {
            method490((byte) 103);
        }
        field1043++;
        class106.field1443.method2449((byte) 119, class459.field6854.field782);
        class106.field1443.method2449((byte) 121, arg0);
        class106.field1443.method2449((byte) 116, arg4);
        class106.field1443.method2444((byte) 65, arg3);
        class106.field1443.method2444((byte) 65, arg1);
        class173.field2226 = -3;
        class114.field1497 = 1;
        class225.field3030 = 0;
        class329.field4373 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method486(byte arg0) {
        field1045 = null;
        field1060 = null;
        int var1 = -85 / ((arg0 + 46) / 41);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILug;)V")
    private final void method487(int arg0, int arg1, class396 arg2) {
        if (arg1 == 1) {
            this.field1048 = arg2.method2386(-23648);
        } else if (arg1 == 2) {
            this.field1047 = arg2.method2386(-23648);
        } else if (arg1 == 4) {
            this.field1042 = arg2.method2386(-23648);
        } else if (arg1 == 5) {
            this.field1053 = arg2.method2386(-23648);
        } else if (arg1 == 6) {
            this.field1056 = arg2.method2386(arg0 ^ 0x4DBA);
        } else if (arg1 == 7) {
            this.field1050 = arg2.method2388((byte) -110);
        } else if (arg1 == 8) {
            this.field1063 = arg2.method2388((byte) -115);
        } else if (arg1 == 9) {
            this.field1059 = 8224;
            this.field1055 = 3;
        } else if (arg1 == 10) {
            this.field1051 = true;
        } else if (arg1 == 11) {
            this.field1055 = 1;
        } else if (arg1 == 12) {
            this.field1055 = 4;
        } else if (arg1 == 13) {
            this.field1055 = 5;
        } else if (arg1 == 14) {
            this.field1055 = 2;
            this.field1059 = arg2.method2388((byte) -122) * 256;
        } else if (arg1 == 15) {
            this.field1055 = 3;
            this.field1059 = arg2.method2386(-23648);
        } else if (arg1 == 16) {
            this.field1055 = 3;
            this.field1059 = arg2.method2406((byte) -123);
        } else if (arg1 == 40) {
            int var6 = arg2.method2388((byte) -111);
            this.field1049 = new short[var6];
            this.field1058 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1058[var7] = (short) arg2.method2386(-23648);
                this.field1049[var7] = (short) arg2.method2386(class335.method1958(arg0, 19898));
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method2388((byte) -112);
            this.field1054 = new short[var4];
            this.field1038 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1054[var5] = (short) arg2.method2386(arg0 - 19066);
                this.field1038[var5] = (short) arg2.method2386(-23648);
            }
        }
        field1057++;
        if (arg0 != -4582) {
            this.field1049 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lvm;IIILza;II)Le;")
    public final class373 method488(class485 arg0, int arg1, int arg2, int arg3, class287 arg4, int arg5, int arg6) {
        if (arg5 != -30852) {
            this.field1056 = 45;
        }
        field1052++;
        return this.method484(0, null, arg3, 0, null, 0, false, arg0, (byte) 2, arg4, arg1, arg6, arg2, -59);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILug;)V")
    public final void method489(int arg0, class396 arg1) {
        while (true) {
            int var3 = arg1.method2388((byte) -111);
            if (var3 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field1046++;
                return;
            }
            this.method487(-4582, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    public static final void method490(byte arg0) {
        field1061++;
        if (class421.field6107) {
            return;
        }
        if (class319.field4256.field4651) {
            class143.field1907 = ((int) class143.field1907 - 65 & 0xFFFFFF80);
        } else {
            class249.field3321 += (-class249.field3321 - 24.0F) / 2.0F;
        }
        class421.field6107 = true;
        class419.field6089 = true;
        if (arg0 != 66) {
            method490((byte) -4);
        }
    }
}
