import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class212 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Z")
    public boolean field3708 = true;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public int field3717;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Ljd;")
    public static class85 field3716 = class221.method1499("<col=ffffff>", (byte) -96);

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "[Lc;")
    public static class103[] field3720;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method1454(int arg0) {
        if (class81.field1477.toLowerCase().indexOf("microsoft") == -1) {
            class203.field3533[44] = 71;
            class203.field3533[45] = 26;
            if (class81.field1482 == null) {
                class203.field3533[222] = 59;
                class203.field3533[192] = 58;
            } else {
                class203.field3533[192] = 28;
                class203.field3533[222] = 58;
                class203.field3533[520] = 59;
            }
            class203.field3533[59] = 57;
            class203.field3533[93] = 43;
            class203.field3533[61] = 27;
            class203.field3533[47] = 73;
            class203.field3533[46] = 72;
            class203.field3533[91] = 42;
            class203.field3533[92] = 74;
        } else {
            class203.field3533[220] = 74;
            class203.field3533[219] = 42;
            class203.field3533[222] = 59;
            class203.field3533[223] = 28;
            class203.field3533[187] = 27;
            class203.field3533[186] = 57;
            class203.field3533[188] = 71;
            class203.field3533[189] = 26;
            class203.field3533[192] = 58;
            class203.field3533[190] = 72;
            class203.field3533[221] = 43;
            class203.field3533[191] = 73;
        }
        int var1 = 100 % ((22 - arg0) / 60);
        field3715++;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method1455(int arg0) {
        field3720 = null;
        field3716 = null;
        if (arg0 != 219) {
            field3720 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)Loi;")
    public static final class78 method1456(int arg0) {
        field3713++;
        try {
            if (arg0 != 57) {
                method1455(-10);
            }
            return (class78) Class.forName("lk").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BII)V")
    public static final void method1457(byte arg0, int arg1, int arg2) {
        field3714++;
        int var3 = 21 / ((-arg0 - 62) / 37);
        class15 var4 = class191.field3278[class116.field2066][arg2][arg1];
        if (var4 == null) {
            class78.method541(class116.field2066, arg2, arg1);
            return;
        }
        int var5 = -99999999;
        class226 var6 = null;
        for (class226 var7 = (class226) var4.method110(64); var7 != null; var7 = (class226) var4.method117((byte) 60)) {
            class61 var14 = class32.method221(11649, var7.field3929.field9);
            int var15 = var14.field1137;
            if (var14.field1158 == 1) {
                var15 = (var7.field3929.field11 + 1) * var15;
            }
            if (var5 < var15) {
                var5 = var15;
                var6 = var7;
            }
        }
        if (var6 == null) {
            class78.method541(class116.field2066, arg2, arg1);
            return;
        }
        class1 var8 = null;
        var4.method108(var6, 6266);
        class226 var9 = (class226) var4.method110(64);
        class1 var10 = null;
        while (var9 != null) {
            class1 var13 = var9.field3929;
            if (var6.field3929.field9 != var13.field9) {
                if (var8 == null) {
                    var8 = var13;
                }
                if (var8.field9 != var13.field9 && var10 == null) {
                    var10 = var13;
                }
            }
            var9 = (class226) var4.method117((byte) 87);
        }
        long var11 = (long) ((arg1 << 7) + (arg2 + 1610612736));
        class85.method626(class116.field2066, arg2, arg1, class246.method1660(604124551, arg2 * 128 + 64, class116.field2066, arg1 * 128 + 64), var6.field3929, var11, var8, var10);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3718++;
        int var8 = class144.method945(arg5, class34.field522, (byte) -116, class1.field6);
        int var9 = class144.method945(arg3, class34.field522, (byte) -116, class1.field6);
        int var10 = class144.method945(arg7, class217.field3802, (byte) -116, class83.field1513);
        int var11 = class144.method945(arg6, class217.field3802, (byte) -116, class83.field1513);
        int var12 = class144.method945(arg0 + arg5, class34.field522, (byte) -116, class1.field6);
        int var13 = class144.method945(arg3 - arg0, class34.field522, (byte) -116, class1.field6);
        for (int var14 = var8; var14 < var12; var14++) {
            class183.method1260(arg1, var10, -121, class146.field2488[var14], var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class183.method1260(arg1, var10, -114, class146.field2488[var15], var11);
        }
        int var16 = class144.method945(arg0 + arg7, class217.field3802, (byte) -116, class83.field1513);
        int var17 = class144.method945(arg6 - arg0, class217.field3802, (byte) -116, class83.field1513);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class146.field2488[var18];
            class183.method1260(arg1, var10, 55, var19, var16);
            class183.method1260(arg4, var16, -120, var19, var17);
            class183.method1260(arg1, var17, -115, var19, var11);
        }
        if (arg2 != 57) {
            field3716 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3717 = arg3;
        this.field3710 = arg0;
        this.field3712 = arg2;
        this.field3719 = arg4;
        this.field3709 = arg1;
        this.field3708 = arg6;
        this.field3711 = arg5;
    }
}
