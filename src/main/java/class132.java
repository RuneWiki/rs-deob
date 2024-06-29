import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class132 extends class96 {

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "[Lne;")
    public class234[] field2011;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "Lna;")
    public static class26 field2006 = class69.method505(",Mcran)2titre ouvert", (byte) -124);

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "Lna;")
    private static class26 field2003 = class69.method505("K", (byte) -120);

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "Lna;")
    public static class26 field2005 = field2003;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "Lna;")
    public static class26 field2004 = class69.method505("brillant3:", (byte) -119);

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "Lna;")
    public static class26 field2008 = field2003;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    public static int field2013 = -1;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2001 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "[I")
    public static int[] field2015 = new int[256];

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "Z")
    public static volatile boolean field2016 = false;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
    public static int field2014 = 0;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "Lve;")
    public static class266 field2000;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "[I")
    public static int[] field2010;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIBII)V", line = 11)
    public static final void method889(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 >= -93) {
            return;
        }
        field2007++;
        int var6 = arg2 * arg2;
        int var7 = 0;
        int var8 = arg1;
        int var9 = var6 << 1;
        int var10 = arg1 * arg1;
        int var11 = arg1 << 1;
        int var12 = var10 << 1;
        int var13 = (1 - var11) * var6 + var12;
        int var14 = var10 - ((var11 - 1) * var9);
        int var15 = var10 << 2;
        int var16 = ((var7 << 1) + 3) * var12;
        int var17 = var6 << 2;
        int var18 = ((arg1 << 1) - 3) * var9;
        int var19 = (var7 + 1) * var15;
        if (arg5 >= class80.field1259 && class117.field1840 >= arg5) {
            int var20 = class308.method2151(class27.field454, arg2 + arg4, (byte) 0, class225.field3572);
            int var21 = class308.method2151(class27.field454, arg4 - arg2, (byte) 0, class225.field3572);
            class76.method543(class45.field710[arg5], var21, 91, var20, arg0);
        }
        int var22 = (arg1 - 1) * var17;
        while (var8 > 0) {
            var8--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var7++;
                    var13 += var16;
                    var14 += var19;
                    var19 += var15;
                    var16 += var15;
                }
            }
            int var23 = arg5 - var8;
            if (var14 < 0) {
                var14 += var19;
                var13 += var16;
                var16 += var15;
                var19 += var15;
                var7++;
            }
            var14 += -var18;
            var18 -= var17;
            var13 += -var22;
            int var24 = arg5 + var8;
            if (class80.field1259 <= var24 && class117.field1840 >= var23) {
                int var25 = class308.method2151(class27.field454, arg4 + var7, (byte) 0, class225.field3572);
                int var26 = class308.method2151(class27.field454, arg4 - var7, (byte) 0, class225.field3572);
                if (var23 >= class80.field1259) {
                    class76.method543(class45.field710[var23], var26, 121, var25, arg0);
                }
                if (class117.field1840 >= var24) {
                    class76.method543(class45.field710[var24], var26, -110, var25, arg0);
                }
            }
            var22 -= var17;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)J", line = 111)
    public static final long method890(int arg0, int arg1, int arg2) {
        class55 var3 = class36.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field879; var4++) {
            class39 var5 = var3.field877[var4];
            if ((var5.field656 >> 29 & 0x3L) == 2L && var5.field637 == arg1 && var5.field630 == arg2) {
                return var5.field656;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V", line = 136)
    public static void method891(int arg0) {
        field2006 = null;
        field2015 = null;
        field2003 = null;
        field2008 = null;
        field2000 = null;
        field2010 = null;
        if (arg0 != -29679) {
            method889(-76, 24, -17, (byte) -85, 58, -87);
        }
        field2004 = null;
        field2005 = null;
        field2001 = null;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)Z", line = 163)
    public final boolean method892(int arg0, int arg1) {
        if (arg0 == 1317095745) {
            field2009++;
            return this.field2011[arg1].field3709;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V", line = 190)
    public static final void method893(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class290.field4825[var1] = false;
        }
        if (arg0 != -21556) {
            method889(21, 1, 64, (byte) 40, -34, -70);
        }
        class222.field3517 = 0;
        class252.field4131 = 0;
        class187.field2904 = -1;
        class116.field1828 = -1;
        class37.field614 = 1;
        field1999++;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lve;Lve;IZ)V", line = 213)
    public class132(class266 arg0, class266 arg1, int arg2, boolean arg3) {
        class32 var5 = new class32();
        int var6 = arg0.method1898(arg2, (byte) 69);
        this.field2011 = new class234[var6];
        int[] var7 = arg0.method1897((byte) -128, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1889(arg2, (byte) -122, var7[var8]);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class235 var11 = (class235) var5.method264(-78);
            class235 var12 = null;
            while (var11 != null) {
                if (var11.field3721 == var10) {
                    var12 = var11;
                    break;
                }
                var11 = (class235) var5.method263(4);
            }
            if (var12 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1896(var10, 0, 0);
                } else {
                    var13 = arg1.method1896(0, var10, 0);
                }
                var12 = new class235(var10, var13);
                var5.method257(true, var12);
            }
            this.field2011[var7[var8]] = new class234(var9, var12);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)Z", line = 283)
    public final boolean method894(int arg0, byte arg1) {
        field2002++;
        return arg1 < 114 ? true : this.field2011[arg0].field3705;
    }
}
