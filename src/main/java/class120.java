import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class120 {

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1642 = new String[100];

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field1645 = 0;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1646 = "scroll:";

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "F")
    public static float field1643;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lmo;")
    public static class447 field1639;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)I")
    public static final int method864(byte arg0, int arg1) {
        if (arg0 != 24) {
            field1645 = 45;
        }
        field1641++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILe;IIZLhm;I)V")
    public abstract void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIILe;)Z")
    public abstract boolean method188(int arg0, int arg1, int arg2, class312 arg3);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Le;Z)Lum;")
    public abstract class306 method189(class312 arg0, boolean arg1);

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(B)V")
    public static final void method865(byte arg0) {
        field1640++;
        class336.method2219((byte) 6, class329.field5152);
        class415.field6139++;
        if (class301.field4770 && class29.field342) {
            int var1 = class414.field6125;
            int var2 = class287.field4604;
            int var3 = var1 - class145.field2286;
            if (arg0 >= 74) {
                int var4 = var2 - class152.field2375;
                if (var3 < class63.field823) {
                    var3 = class63.field823;
                }
                if (var4 < class11.field154) {
                    var4 = class11.field154;
                }
                if ((class329.field5152.field2705 + var3) > (class63.field823 + class158.field2516.field2705)) {
                    var3 = class158.field2516.field2705 + class63.field823 - class329.field5152.field2705;
                }
                if ((class329.field5152.field2834 + var4) > (class11.field154 + class158.field2516.field2834)) {
                    var4 = class11.field154 + class158.field2516.field2834 - class329.field5152.field2834;
                }
                int var5 = var3 - class82.field1012;
                int var6 = var4 - class338.field5249;
                int var7 = class329.field5152.field2758;
                if (class329.field5152.field2813 < class415.field6139 && (var7 < var5 || var5 < -var7 || var7 < var6 || var6 < (-var7))) {
                    class265.field4262 = true;
                }
                int var8 = class158.field2516.field2791 + var3 - class63.field823;
                int var9 = var4 + class158.field2516.field2696 - class11.field154;
                if (class329.field5152.field2861 != null && class265.field4262) {
                    class150 var10 = new class150();
                    var10.field2344 = var9;
                    var10.field2347 = var8;
                    var10.field2348 = class329.field5152;
                    var10.field2352 = class329.field5152.field2861;
                    class17.method135(var10);
                }
                if (class218.field3567 == 0) {
                    if (class265.field4262) {
                        if (class329.field5152.field2763 != null) {
                            class150 var11 = new class150();
                            var11.field2352 = class329.field5152.field2763;
                            var11.field2349 = class234.field3911;
                            var11.field2347 = var8;
                            var11.field2344 = var9;
                            var11.field2348 = class329.field5152;
                            class17.method135(var11);
                        }
                        if (class234.field3911 != null && client.method1155(class329.field5152) != null) {
                            class106.method804(class234.field3911.field2693, -10437, class234.field3911.field2865, class329.field5152.field2693, class329.field5152.field2865);
                        }
                    } else if ((class345.field5327 == 1 || class323.method2140((byte) 73)) && class144.field2267 > 2) {
                        class119.method859(2, 0);
                    } else if (class225.method1612(-1)) {
                        class119.method859(1, 0);
                    }
                    class329.field5152 = null;
                }
            }
        } else if (class415.field6139 > 1) {
            class329.field5152 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)Z")
    public abstract boolean method186(int arg0);

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V")
    public abstract void method193(int arg0);

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Las;III[Z)V")
    public static final void method866(class84 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class364.field5542 == class275.field4396) {
            return;
        }
        int var5 = class181.field2961[arg1].method771(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class129 var7 = class181.field2961[var6];
                if (var7 != null) {
                    var7.method787(arg0, arg2, var5 - var7.method771(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)V")
    public static void method867(byte arg0) {
        field1642 = null;
        field1646 = null;
        int var1 = 55 / ((arg0 + 70) / 54);
        field1639 = null;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(Le;B)V")
    public abstract void method196(class312 arg0, byte arg1);
}
