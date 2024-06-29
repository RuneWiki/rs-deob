import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class171 {

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public int field3129 = -1;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Z")
    public boolean field3136 = false;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[I")
    private int[] field3134 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Lhh;")
    public static class163 field3139 = class137.method1065("::fps ", 17);

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lad;")
    public static class43 field3130 = new class43(64);

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "Lhh;")
    public static class163 field3143 = class137.method1065("Fallen lassen", 17);

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "Lhh;")
    public static class163 field3145 = class137.method1065("p12_full", 17);

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "Lhh;")
    public static class163 field3144 = class137.method1065("Spieler kann nicht gefunden werden: ", 17);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "[I")
    private int[] field3140;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "[S")
    private short[] field3121;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "[S")
    private short[] field3132;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "[S")
    private short[] field3135;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "[S")
    private short[] field3138;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILpa;)V")
    public static final void method1268(int arg0, class123 arg1) {
        field3131++;
        if (class168.field3082) {
            return;
        }
        class206.method1481();
        class161.field2954 = class2.method19(class39.field659, -20265, arg1);
        if (arg0 < 69) {
            method1278((byte) -54, (class69) null, false);
        }
        class161.field2954.method106(-95, 0);
        class119.field2248 = class23.method154(arg1, class89.field1637, (byte) -43);
        class119.field2248.method751(382 - class119.field2248.field1784 / 2, 18);
        class168.field3082 = true;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1269(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3123++;
        if (arg4 != 112) {
            return;
        }
        if (arg0 == arg5) {
            class164.method1236(arg3, arg5, arg2, (byte) 92, arg1);
        } else if (class127.field2465 <= arg2 - arg5 && arg2 + arg5 <= class252.field4407 && (arg3 - arg0) >= class182.field3344 && arg3 + arg0 <= class201.field3593) {
            class74.method544(arg2, arg3, arg5, arg1, arg0, -118);
        } else {
            class45.method332(arg2, arg0, arg3, arg5, arg1, -580324223);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Lib;")
    public final class41 method1270(int arg0) {
        field3141++;
        if (this.field3140 == null) {
            return null;
        }
        class41[] var2 = new class41[this.field3140.length];
        for (int var3 = arg0; var3 < this.field3140.length; var3++) {
            var2[var3] = class41.method286(class180.field3262, this.field3140[var3], 0);
        }
        class41 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class41(var2, var2.length);
        }
        if (this.field3121 != null) {
            for (int var5 = 0; var5 < this.field3121.length; var5++) {
                var4.method293(this.field3121[var5], this.field3135[var5]);
            }
        }
        if (this.field3138 != null) {
            for (int var6 = 0; var6 < this.field3138.length; var6++) {
                var4.method285(this.field3138[var6], this.field3132[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lpg;II)V")
    private final void method1271(class81 arg0, int arg1, int arg2) {
        if (arg1 != 5) {
            return;
        }
        if (arg2 == 1) {
            this.field3129 = arg0.method622(true);
        } else if (arg2 == 2) {
            int var8 = arg0.method622(true);
            this.field3140 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3140[var9] = arg0.method658(class46.method340(arg1, -92));
            }
        } else if (arg2 == 3) {
            this.field3136 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method622(true);
            this.field3135 = new short[var4];
            this.field3121 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3121[var5] = (short) arg0.method658(65);
                this.field3135[var5] = (short) arg0.method658(86);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method622(true);
            this.field3138 = new short[var6];
            this.field3132 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3138[var7] = (short) arg0.method658(class46.method340(arg1, -72));
                this.field3132[var7] = (short) arg0.method658(class46.method340(arg1, -102));
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field3134[arg2 - 60] = arg0.method658(116);
        }
        field3128++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLpg;)V")
    public final void method1272(byte arg0, class81 arg1) {
        while (true) {
            int var3 = arg1.method622(true);
            if (var3 == 0) {
                field3133++;
                if (arg0 != 50) {
                    this.method1271((class81) null, -63, 105);
                    return;
                }
                return;
            }
            this.method1271(arg1, 5, var3);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)Z")
    public final boolean method1273(int arg0) {
        field3127++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field3134[var3] != -1 && !class180.field3262.method977(0, this.field3134[var3], (byte) -13)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
    public static final int method1274(int arg0, int arg1, int arg2) {
        field3137++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (arg1 < ~var3) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)Lib;")
    public final class41 method1275(int arg0) {
        class41[] var2 = new class41[5];
        int var3 = 0;
        field3125++;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3134[var4] != -1) {
                var2[var3++] = class41.method286(class180.field3262, this.field3134[var4], 0);
            }
        }
        if (arg0 != -1) {
            field3130 = null;
        }
        class41 var5 = new class41(var2, var3);
        if (this.field3121 != null) {
            for (int var6 = 0; var6 < this.field3121.length; var6++) {
                var5.method293(this.field3121[var6], this.field3135[var6]);
            }
        }
        if (this.field3138 != null) {
            for (int var7 = 0; var7 < this.field3138.length; var7++) {
                var5.method285(this.field3138[var7], this.field3132[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
    public static void method1276(int arg0) {
        field3139 = null;
        field3144 = null;
        field3130 = null;
        field3145 = null;
        field3143 = null;
        if (arg0 != 10055) {
            method1276(-36);
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)Z")
    public final boolean method1277(int arg0) {
        field3124++;
        int var2 = 11 / ((14 - arg0) / 57);
        if (this.field3140 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field3140.length; var4++) {
            if (!class180.field3262.method977(0, this.field3140[var4], (byte) -13)) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLqh;Z)V")
    public static final void method1278(byte arg0, class69 arg1, boolean arg2) {
        field3122++;
        int var3 = arg1.field1236 == 0 ? arg1.field1183 : arg1.field1236;
        int var4 = arg1.field1160 == 0 ? arg1.field1220 : arg1.field1160;
        int var5 = 19 % ((33 - arg0) / 41);
        class69.method485(-1, var3, class109.field2060[arg1.field1188 >> 16], arg2, arg1.field1188, var4);
        if (arg1.field1291 != null) {
            class69.method485(-1, var3, arg1.field1291, arg2, arg1.field1188, var4);
        }
        class222 var6 = (class222) class92.field1739.method1743((long) arg1.field1188, false);
        if (var6 != null) {
            class235.method1637(var6.field4049, arg2, var4, 50, var3);
        }
    }
}
