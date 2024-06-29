import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class243 {

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field3246 = -50;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "Lbg;")
    public static class464 field3247 = new class464();

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Luea;")
    public static class315 field3248 = new class315(8);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method1550(int arg0, int arg1, int arg2) {
        field3241++;
        if (arg0 != 8) {
            method1553(-58, -38, null, -70);
        }
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 16)
    public static final void method1551(byte arg0) {
        field3239++;
        int var1 = class578.field8168;
        int var2 = 6 / ((-arg0 - 74) / 43);
        int[] var3 = class240.field3201;
        for (int var4 = 0; var4 < var1; var4++) {
            class280 var10 = class309.field4311[var3[var4]];
            if (var10 != null && var10.field7924 > 0) {
                var10.field7924--;
                if (var10.field7924 == 0) {
                    var10.field7937 = null;
                }
            }
        }
        for (int var5 = 0; var5 < class344.field4849; var5++) {
            long var6 = (long) class100.field1196[var5];
            class740 var8 = (class740) class373.field5230.method1180((byte) 26, var6);
            if (var8 != null) {
                class468 var9 = var8.field10289;
                if (var9.field7924 > 0) {
                    var9.field7924--;
                    if (var9.field7924 == 0) {
                        var9.field7937 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lkd;I)I", line = 76)
    public static final int method1552(class280 arg0, int arg1) {
        if (arg1 != -23426) {
            return 10;
        }
        field3244++;
        int var2 = arg0.field3968;
        class224 var3 = arg0.method3247(arg1 + 45242);
        if (arg0.field7930 == -1 || arg0.field7968) {
            var2 = arg0.field3993;
        } else if (arg0.field7930 == var3.field2977 || arg0.field7930 == var3.field3025 || arg0.field7930 == var3.field3007 || arg0.field7930 == var3.field3021) {
            var2 = arg0.field3975;
        } else if (arg0.field7930 == var3.field2992 || arg0.field7930 == var3.field3020 || arg0.field7930 == var3.field2998 || arg0.field7930 == var3.field3003) {
            var2 = arg0.field3957;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILha;I)V", line = 105)
    public static final void method1553(int arg0, int arg1, class58 arg2, int arg3) {
        class452.field6394 = arg2;
        if (arg1 >= -87) {
            return;
        }
        class703.field9787 = new class144[arg3][arg0];
        field3240++;
        if (class551.field7758 != null) {
            class687.field9393 = class195.method1207((byte) -102, class551.field7758[2], class551.field7758[3], class551.field7758[4], class551.field7758[5], class551.field7758[0], class551.field7758[1]);
        }
        class218.field2849 = new class144();
        class614.method3436(89);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 122)
    public static void method1554(int arg0) {
        if (arg0 != 0) {
            field3247 = null;
        }
        field3248 = null;
        field3247 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)[Las;", line = 133)
    public static final class151[] method1555(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field3245++;
            return new class151[] { class131.field1630, class414.field5839, class302.field4244, class704.field9804, class285.field4054, class540.field7562, class145.field2085, class592.field8344, class341.field4744, class476.field6749, class458.field6454, class267.field3814, class448.field6354, class11.field239 };
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILjb;Z)V", line = 148)
    public static final void method1556(int arg0, int arg1, class493 arg2, boolean arg3) {
        field3242++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field6978 != null) {
            class357 var4 = new class357();
            var4.field5082 = arg2;
            var4.field5076 = arg2.field6978;
            class241.method1543(var4);
        }
        class58.field710 = arg2.field6956;
        class273.field3902 = arg1;
        class114.field1379 = arg2.field6944;
        class580.field8185 = arg2.field6992;
        class504.field7234 = arg2.field6952;
        class124.field1491 = arg3;
        class351.field4969 = arg0;
        class86.field1057 = arg2.field7004;
        class543.method3149(arg2, 1);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIILjava/lang/Class;)Lum;", line = 178)
    public static final class524 method1557(int arg0, int arg1, int arg2, Class arg3) {
        class165 var4 = class553.field7776[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class356 var5 = var4.field2270; var5 != null; var5 = var5.field5066) {
            class524 var6 = var5.field5067;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field7415 == arg1 && var6.field7418 == arg2) {
                return var6;
            }
        }
        return null;
    }
}
