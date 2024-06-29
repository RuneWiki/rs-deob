import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class55 extends class249 {

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "Ljava/lang/Object;")
    private Object field762;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public static int field761 = 0;

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "Lbe;")
    public static class283 field765 = class153.method941(-56, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!fb", name = "ib", descriptor = "Z")
    public static boolean field769 = true;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "Lbe;")
    public static class283 field759 = class153.method941(125, "welle2:");

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!fb", name = "hb", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)Z", line = 6)
    public final boolean method59(int arg0) {
        if (arg0 != 256) {
            field759 = (class283) null;
        }
        field767++;
        return false;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)V", line = 18)
    private static final void method357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field758++;
        if (arg4 > -98) {
            method361(10, -88, -64, 97, 11, -117, 66);
        }
        int var7 = class44.method263(class247.field4220, arg5, (byte) -115, class217.field3677);
        int var8 = class44.method263(class247.field4220, arg3, (byte) -121, class217.field3677);
        int var9 = class44.method263(class166.field2765, arg1, (byte) -39, class269.field4551);
        int var10 = class44.method263(class166.field2765, arg0, (byte) -101, class269.field4551);
        int var11 = class44.method263(class247.field4220, arg5 + arg6, (byte) -46, class217.field3677);
        int var12 = class44.method263(class247.field4220, arg3 - arg6, (byte) -54, class217.field3677);
        for (int var13 = var7; var13 < var11; var13++) {
            class114.method742(30197, var9, class97.field1636[var13], var10, arg2);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class114.method742(30197, var9, class97.field1636[var14], var10, arg2);
        }
        int var15 = class44.method263(class166.field2765, arg1 + arg6, (byte) -102, class269.field4551);
        int var16 = class44.method263(class166.field2765, arg0 - arg6, (byte) -51, class269.field4551);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class97.field1636[var17];
            class114.method742(30197, var9, var18, var15, arg2);
            class114.method742(30197, var16, var18, var10, arg2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILbe;)V", line = 71)
    public static final void method358(int arg0, class283 arg1) {
        field766++;
        class201.field3436 = arg1;
        if (class150.field2460.field4272 == null) {
            return;
        }
        try {
            if (arg0 != -2) {
                return;
            }
            class283 var2 = class245.field4171.method1909((byte) 66, class150.field2460.field4272);
            class283 var3 = class118.field1996.method1909((byte) 79, class150.field2460.field4272);
            class283 var4 = class299.method2022(new class283[] { var2, class287.field4884, arg1, class90.field1526, var3 }, (byte) 97);
            class283 var5;
            if (arg1.method1925((byte) -44) == 0) {
                var5 = class299.method2022(new class283[] { var4, class16.field189 }, (byte) 50);
            } else {
                var5 = class299.method2022(new class283[] { var4, class245.field4174, class5.method28((byte) 106, class216.method1426(arg0 ^ 0xFFFFFF01) + 94608000000L), class171.field2883, class178.method1173((byte) -123, 94608000L) }, (byte) 64);
            }
            class299.method2022(new class283[] { class40.field568, var5, class58.field806 }, (byte) 57).method1922(class150.field2460.field4272, (byte) -89);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "(I)V", line = 106)
    public static void method359(int arg0) {
        field765 = null;
        field759 = null;
        if (arg0 > -4) {
            field759 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "(I)Ljava/lang/Object;", line = 123)
    public final Object method60(int arg0) {
        field763++;
        if (arg0 != 256) {
            method360(112, -90);
        }
        return this.field762;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I", line = 134)
    public static final int method360(int arg0, int arg1) {
        if (arg1 < 61) {
            field765 = (class283) null;
        }
        field764++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 166)
    public class55(Object arg0) {
        this.field762 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIIIIII)V", line = 175)
    public static final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class269.field4551 <= arg4 && class166.field2765 >= arg3 && class217.field3677 <= arg2 && arg0 <= class247.field4220) {
            if (arg1 == 1) {
                class157.method957(28245, arg0, arg3, arg2, arg6, arg4);
            } else {
                class71.method469(arg3, arg6, arg2, arg4, arg1, arg0, (byte) 96);
            }
        } else if (arg1 == 1) {
            class228.method1493(arg6, arg0, (byte) -127, arg3, arg4, arg2);
        } else {
            method357(arg3, arg4, arg6, arg0, -100, arg2, arg1);
        }
        if (arg5 != 1) {
            method358(15, (class283) null);
        }
        field768++;
    }
}
