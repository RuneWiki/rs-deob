import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class177 extends class30 {

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    public int field3010 = 0;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "[Lpb;")
    public class154[] field3017 = new class154[5];

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "[I")
    public int[] field3027 = new int[5];

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public int field3011;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "[I")
    public static int[] field3003 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field3014 = 50;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field3029 = 0;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    public int field3012;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public int field3030;

    @OriginalMember(owner = "client!ea", name = "J", descriptor = "Lve;")
    public class115 field3016;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Lrd;")
    public class122 field3007;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "Lea;")
    public class177 field3031;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Llf;")
    public static class240 field3006;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "Lug;")
    public class39 field3019;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "Lwj;")
    public class58 field3032;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "Lkh;")
    public class7 field3022;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "Lke;")
    public class8 field3024;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "Z")
    public boolean field3013;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "Z")
    public boolean field3018;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "Z")
    public boolean field3020;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "[Lte;")
    public static class184[] field3002;

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(III)V")
    public class177(int arg0, int arg1, int arg2) {
        this.field3026 = this.field3025 = arg0;
        this.field3028 = arg2;
        this.field3011 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public static final void method1191(int arg0) {
        class157 var1 = (class157) class136.field2426.method427((byte) 58);
        if (arg0 <= 122) {
            method1193((byte) 105);
        }
        while (var1 != null) {
            int var2 = var1.field2746;
            if (class31.method258(var2, 0)) {
                class44[] var3 = class28.field539[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field990;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field573;
                    class44 var7 = class221.method1456(var6, (byte) -52);
                    if (var7 != null) {
                        class257.method1718(false, var7);
                    }
                }
            }
            var1 = (class157) class136.field2426.method428(false);
        }
        field3008++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[Lme;Z)V")
    public static final void method1192(int arg0, class44[] arg1, boolean arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class44 var4 = arg1[var3];
            if (var4 != null && var4.field885 == arg0 && (!var4.field990 || !client.method584(var4))) {
                if (var4.field871 == 0) {
                    if (!var4.field990 && client.method584(var4) && class117.field2095 != var4) {
                        continue;
                    }
                    method1192(var4.field935, arg1, true);
                    if (var4.field1015 != null) {
                        method1192(var4.field935, var4.field1015, true);
                    }
                    class157 var5 = (class157) class136.field2426.method434((byte) -93, (long) var4.field935);
                    if (var5 != null) {
                        class104.method754(var5.field2746, -1);
                    }
                }
                if (var4.field871 == 6) {
                    if (var4.field878 != -1 || var4.field907 != -1) {
                        boolean var6 = class64.method473(var4, 7070);
                        int var7;
                        if (var6) {
                            var7 = var4.field907;
                        } else {
                            var7 = var4.field878;
                        }
                        if (var7 != -1) {
                            class31 var8 = class186.method1263(0, var7);
                            if (var8 != null) {
                                var4.field955 += class171.field2935;
                                while (var4.field955 > var8.field603[var4.field903]) {
                                    var4.field955 -= var8.field603[var4.field903];
                                    var4.field903++;
                                    if (var8.field589.length <= var4.field903) {
                                        var4.field903 -= var8.field586;
                                        if (var4.field903 < 0 || var4.field903 >= var8.field589.length) {
                                            var4.field903 = 0;
                                        }
                                    }
                                    class257.method1718(false, var4);
                                }
                            }
                        }
                    }
                    if (var4.field1020 != 0 && !var4.field990) {
                        int var9 = var4.field1020 >> 16;
                        int var10 = class171.field2935 * var9;
                        int var11 = var4.field1020 << 16 >> 16;
                        var4.field870 = var4.field870 + var10 & 0x7FF;
                        int var12 = class171.field2935 * var11;
                        var4.field966 = var4.field966 + var12 & 0x7FF;
                        class257.method1718(false, var4);
                    }
                }
            }
        }
        if (!arg2) {
            method1191(-59);
        }
        field3004++;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static void method1193(byte arg0) {
        field3002 = null;
        field3006 = null;
        field3003 = null;
        if (arg0 != -1) {
            field3002 = null;
        }
    }
}
