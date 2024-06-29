import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class class148 {

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Ljp;")
    public static class55 field2197 = new class55(107, 12);

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Lnv;")
    public static class44 field2205 = new class44();

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1052(int arg0, int arg1) {
        field2204++;
        if (arg1 > -88) {
            field2194 = -8;
        }
        class188 var2 = class10.method48((byte) 73, 10, arg0);
        var2.method1306(-23128);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 20)
    public static void method1053(int arg0) {
        field2197 = null;
        field2205 = null;
        if (arg0 >= -123) {
            method1052(50, 101);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)Z", line = 36)
    public final boolean method1054(int arg0) {
        if (arg0 != 55) {
            field2207 = -44;
        }
        field2196++;
        return (this.field2198 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Z", line = 49)
    public final boolean method1055(boolean arg0) {
        field2193++;
        if (arg0) {
            method1052(-7, 80);
        }
        return (this.field2198 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZII)I", line = 62)
    public static final int method1056(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method1059(-121L, true);
        }
        field2203++;
        return arg2 == 1 || arg2 == 3 ? class142.field2111[arg1 & 0x3] : class342.field5113[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)Z", line = 79)
    public final boolean method1057(boolean arg0) {
        if (arg0) {
            field2205 = null;
        }
        field2199++;
        return (this.field2198 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIB)Z", line = 90)
    public static final boolean method1058(int arg0, int arg1, byte arg2) {
        field2195++;
        if (arg2 != 110) {
            field2205 = null;
        }
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(JZ)V", line = 107)
    public static final void method1059(long arg0, boolean arg1) {
        field2201++;
        if (class348.field5192 != null) {
            if (class33.field401 == 1 || class33.field401 == 5) {
                class52.method345(-15, arg0);
            } else if (class33.field401 == 4) {
                class171.method1217(1, arg0);
            }
        }
        class105.method837(116, (long) class446.field6625, class376.field5542);
        if (class134.field2010 != -1) {
            class175.method1244(class134.field2010, (byte) -109);
        }
        for (int var3 = 0; var3 < class500.field7273; var3++) {
            if (class434.field6439[var3]) {
                class327.field4946[var3] = true;
            }
            class147.field2184[var3] = class434.field6439[var3];
            class434.field6439[var3] = false;
        }
        class525.field7697 = class446.field6625;
        if (class376.field5542.method522()) {
            class336.field5067 = true;
        }
        if (class134.field2010 != -1) {
            class500.field7273 = 0;
            class508.method3022(90);
        }
        class376.field5542.method577();
        class244.method1660(-106, class376.field5542);
        int var4 = class437.method2709(-25310);
        if (var4 == -1) {
            var4 = class282.field4402;
        }
        if (var4 == -1) {
            var4 = class33.field400;
        }
        class240.method1613(var4, arg1);
        class265.method1848(class116.field1781.field1274, class116.field1781.field1279, class124.field1851, class116.field1781.field1275, 0);
        class124.field1851 = 0;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Z", line = 171)
    public final boolean method1060(int arg0) {
        if (arg0 == 0) {
            field2200++;
            return (this.field2198 & 0x8) != 0;
        } else {
            return false;
        }
    }
}
