import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class285 implements class2 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lud;")
    public static class279 field5080 = class130.method1024("Connexion perdue)3", 255);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lud;")
    public static class279 field5085 = class130.method1024("(U3", 255);

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lud;")
    public static class279 field5090 = class130.method1024("headicons_prayer", 255);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field5086 = 0;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field5087 = 0;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "J")
    public static volatile long field5089 = 0L;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[[Z")
    public static boolean[][] field5081;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2039(boolean arg0) {
        field5090 = null;
        field5081 = (boolean[][]) null;
        field5085 = null;
        if (!arg0) {
            field5087 = 97;
        }
        field5080 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIII)I", line = 20)
    public static final int method2040(boolean arg0, int arg1, int arg2, int arg3) {
        field5083++;
        int var4 = arg3 / arg2;
        int var5 = arg3 & arg2 - 1;
        int var6 = arg1 / arg2;
        int var7 = arg2 - 1 & arg1;
        int var8 = class41.method353(var6, 7853, var4);
        int var9 = class41.method353(var6, 7853, var4 + 1);
        int var10 = class41.method353(var6 + 1, 7853, var4);
        int var11 = class41.method353(var6 + 1, 7853, var4 + 1);
        int var12 = class287.method2053(var5, arg2, var8, var9, true);
        int var13 = class287.method2053(var5, arg2, var10, var11, arg0);
        return class287.method2053(var7, arg2, var12, var13, true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBILgf;)V", line = 51)
    public static final void method2041(int arg0, byte arg1, int arg2, class8 arg3) {
        field5088++;
        if (class247.field4388 != null || class238.field4184 || arg3 == null || class269.method1914(arg3, (byte) -71) == null) {
            return;
        }
        class247.field4388 = arg3;
        class307.field5460 = class269.method1914(arg3, (byte) -110);
        class209.field3678 = arg2;
        class28.field673 = arg0;
        if (arg1 != 24) {
            field5085 = (class279) null;
        }
        class194.field3490 = false;
        class55.field1198 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BJI[I)Lud;", line = 78)
    public final class279 method18(byte arg0, long arg1, int arg2, int[] arg3) {
        if (arg0 != 47) {
            return (class279) null;
        }
        field5079++;
        if (arg2 == 0) {
            class199 var7 = class202.method1496(arg3[0], -119);
            return var7.method1484((int) arg1, (byte) -118);
        } else if (arg2 == 1 || arg2 == 10) {
            class157 var6 = class220.method1612(-2254, (int) arg1);
            return var6.field2861;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class202.method1496(arg3[0], -123).method1484((int) arg1, (byte) -118);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 114)
    public static final void method2042(int arg0) {
        field5084++;
        if (arg0 != 2209) {
            method2042(71);
        }
        if (!class97.field1824 || class201.field3591) {
            return;
        }
        class191[][][] var1 = class24.field619;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class191[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class191 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3440 != null && var6.field3440.field4316 instanceof class299) {
                            class299 var7 = (class299) var6.field3440.field4316;
                            if ((Long.MIN_VALUE & var6.field3440.field4325) == 0L) {
                                var7.method2126(false, true, true, true, false, true, true);
                            } else {
                                var7.method2126(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field3454 != null) {
                            if (var6.field3454.field4091 instanceof class299) {
                                class299 var8 = (class299) var6.field3454.field4091;
                                if ((var6.field3454.field4095 & Long.MIN_VALUE) == 0L) {
                                    var8.method2126(false, true, true, true, false, true, true);
                                } else {
                                    var8.method2126(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field3454.field4099 instanceof class299) {
                                class299 var9 = (class299) var6.field3454.field4099;
                                if ((var6.field3454.field4095 & Long.MIN_VALUE) == 0L) {
                                    var9.method2126(false, true, true, true, false, true, true);
                                } else {
                                    var9.method2126(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field3439 != null) {
                            if (var6.field3439.field522 instanceof class299) {
                                class299 var10 = (class299) var6.field3439.field522;
                                if ((var6.field3439.field530 & Long.MIN_VALUE) == 0L) {
                                    var10.method2126(false, true, true, true, false, true, true);
                                } else {
                                    var10.method2126(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field3439.field525 instanceof class299) {
                                class299 var11 = (class299) var6.field3439.field525;
                                if ((Long.MIN_VALUE & var6.field3439.field530) == 0L) {
                                    var11.method2126(false, true, true, true, false, true, true);
                                } else {
                                    var11.method2126(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field3451; var12++) {
                            if (var6.field3455[var12].field563 instanceof class299) {
                                class299 var13 = (class299) var6.field3455[var12].field563;
                                if ((var6.field3455[var12].field546 & Long.MIN_VALUE) == 0L) {
                                    var13.method2126(false, true, true, true, false, true, true);
                                } else {
                                    var13.method2126(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class201.field3591 = true;
    }
}
