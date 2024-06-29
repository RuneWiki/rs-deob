import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class222 {

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public int field3908 = -1;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Z")
    public static boolean field3910 = false;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "J")
    public static long field3912 = 0L;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Z")
    public static boolean field3914 = false;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public int field3897;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field3904;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public int field3905;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public int field3913;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method1534(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3907++;
        if (arg3 == arg4) {
            class155.method1134(arg1, 2000, arg2, arg7, arg3, arg6, arg0);
        } else if (!arg5) {
            if (class135.field2445 <= (arg1 - arg3) && arg1 + arg3 <= class73.field1309 && (arg6 - arg4) >= class4.field70 && class70.field1205 >= (arg4 + arg6)) {
                class85.method668(arg7, arg2, arg3, -1, arg0, arg1, arg6, arg4);
            } else {
                class226.method1541(arg0, arg3, 37, arg2, arg1, arg4, arg6, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static final void method1535(byte arg0) {
        field3902++;
        class226.method1549(false, class259.field4517);
        class242.field4286++;
        if (arg0 != -6) {
            method1534(-106, 119, -51, 123, -102, true, -10, 5);
        }
        if (class130.field2386 && class137.field2473) {
            int var1 = class7.field116;
            int var2 = var1 - class47.field823;
            int var3 = class259.field4517.field500;
            int var4 = class208.field3735;
            int var5 = var4 - class229.field3995;
            if (class32.field598 > var2) {
                var2 = class32.field598;
            }
            if (class14.field211 > var5) {
                var5 = class14.field211;
            }
            if (class32.field598 + class177.field3184.field468 < class259.field4517.field468 + var2) {
                var2 = class32.field598 + class177.field3184.field468 - class259.field4517.field468;
            }
            int var6 = var2 - (class32.field598 - class177.field3184.field506);
            if ((class259.field4517.field341 + var5) > (class14.field211 + class177.field3184.field341)) {
                var5 = class14.field211 + class177.field3184.field341 - class259.field4517.field341;
            }
            int var7 = class177.field3184.field412 + var5 - class14.field211;
            int var8 = var5 - class95.field1780;
            int var9 = var2 - class39.field688;
            if (class259.field4517.field417 < class242.field4286 && (var9 > var3 || -var3 > var9 || var3 < var8 || var8 < (-var3))) {
                field3914 = true;
            }
            if (class259.field4517.field399 != null && field3914) {
                class275 var10 = new class275();
                var10.field4796 = class259.field4517.field399;
                var10.field4804 = var7;
                var10.field4802 = var6;
                var10.field4792 = class259.field4517;
                class215.method1509(var10, -99);
            }
            if (class177.field3183 == 0) {
                if (field3914) {
                    if (class259.field4517.field446 != null) {
                        class275 var11 = new class275();
                        var11.field4804 = var7;
                        var11.field4796 = class259.field4517.field446;
                        var11.field4792 = class259.field4517;
                        var11.field4797 = class244.field4326;
                        var11.field4802 = var6;
                        class215.method1509(var11, 111);
                    }
                    if (class244.field4326 != null && client.method1818(class259.field4517) != null) {
                        class246.field4364++;
                        class58.field967.method285((byte) -90, 85);
                        class58.field967.method544(class259.field4517.field374, (byte) -104);
                        class58.field967.method544(class244.field4326.field374, (byte) -104);
                        class58.field967.method547((byte) -67, class244.field4326.field436);
                        class58.field967.method582(-127, class259.field4517.field436);
                    }
                } else if ((class257.field4476 == 1 || class43.method290(8, class242.field4290 - 1)) && class242.field4290 > 2) {
                    class150.method1104(arg0 + 8);
                } else if (class242.field4290 > 0) {
                    class221.method1529(0);
                }
                class259.field4517 = null;
            }
        } else if (class242.field4286 > 1) {
            class259.field4517 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILpi;)V")
    public static final void method1536(int arg0, class181 arg1) {
        field3909++;
        if (arg0 >= -21) {
            method1534(86, -74, -5, 31, 81, true, 19, -117);
        }
        class255.field4462 = arg1;
        class43.field724 = class255.field4462.method1327(false, 16);
    }
}
