import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class39 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field468 = 0;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lg;")
    public static class470 field470;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lgf;B)Lgf;")
    public abstract class218 method101(class218 arg0, byte arg1);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static final void method199(byte arg0) {
        if (arg0 == 23) {
            field469++;
            for (class380 var1 = (class380) class224.field3110.method2334(-90); var1 != null; var1 = (class380) class224.field3110.method2340(arg0 + 44)) {
                var1.method2277();
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZII)V")
    public static final void method200(int arg0, boolean arg1, int arg2, int arg3) {
        field467++;
        if (!arg1) {
            class89 var4 = class146.method695(9, arg2, (byte) -35);
            var4.method449(true);
            var4.field1100 = arg3;
            var4.field1106 = arg0;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lgn;IIII)V")
    public static final void method201(class187 arg0, int arg1, int arg2, int arg3, int arg4) {
        field471++;
        class349 var5 = arg0.method1018(-106);
        int var6 = arg0.field2451 - arg0.field2470.field2805 & 0x3FFF;
        if (arg2 != 4735) {
            return;
        }
        if (arg4 == -1) {
            if (var6 != 0 || arg0.field2493 > 25) {
                arg0.field2497 = false;
                if (arg3 < 0 && var5.field5004 != -1) {
                    arg0.field2514 = var5.field5004;
                } else if (arg3 <= 0 || var5.field5011 == -1) {
                    arg0.field2514 = var5.field5008;
                } else {
                    arg0.field2514 = var5.field5011;
                }
            } else if (!arg0.field2497 || !var5.method2117(arg0.field2514, 17793)) {
                arg0.field2514 = var5.method2109(-28272);
                arg0.field2497 = arg0.field2514 != -1;
            }
        } else if (arg0.field2511 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class281.field4097[arg1] - arg0.field2470.field2805 & 0x3FFF;
            if (arg4 == 2 && var5.field5003 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field5007 != -1) {
                    arg0.field2514 = var5.field5007;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4978 != -1) {
                    arg0.field2514 = var5.field4978;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field5010 == -1) {
                    arg0.field2514 = var5.field5003;
                } else {
                    arg0.field2514 = var5.field5010;
                }
            } else if (arg4 == 0 && var5.field4982 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4974 != -1) {
                    arg0.field2514 = var5.field4974;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field5005 != -1) {
                    arg0.field2514 = var5.field5005;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field5001 == -1) {
                    arg0.field2514 = var5.field4982;
                } else {
                    arg0.field2514 = var5.field5001;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field4967 != -1) {
                arg0.field2514 = var5.field4967;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field4997 != -1) {
                arg0.field2514 = var5.field4997;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field4989 == -1) {
                arg0.field2514 = var5.field5008;
            } else {
                arg0.field2514 = var5.field4989;
            }
            arg0.field2497 = false;
        } else if (var6 == 0 && arg0.field2493 <= 25) {
            arg0.field2497 = false;
            if (arg4 == 2 && var5.field5003 != -1) {
                arg0.field2514 = var5.field5003;
            } else if (arg4 == 0 && var5.field4982 != -1) {
                arg0.field2514 = var5.field4982;
            } else {
                arg0.field2514 = var5.field5008;
            }
        } else {
            arg0.field2497 = false;
            if (arg4 == 2 && var5.field5003 != -1) {
                if (arg3 < 0 && var5.field4985 != -1) {
                    arg0.field2514 = var5.field4985;
                } else if (arg3 <= 0 || var5.field5009 == -1) {
                    arg0.field2514 = var5.field5003;
                } else {
                    arg0.field2514 = var5.field5009;
                }
            } else if (arg4 == 0 && var5.field4982 != -1) {
                if (arg3 < 0 && var5.field4986 != -1) {
                    arg0.field2514 = var5.field4986;
                } else if (arg3 <= 0 || var5.field5012 == -1) {
                    arg0.field2514 = var5.field4982;
                } else {
                    arg0.field2514 = var5.field5012;
                }
            } else if (arg3 < 0 && var5.field4995 != -1) {
                arg0.field2514 = var5.field4995;
            } else if (arg3 <= 0 || var5.field4964 == -1) {
                arg0.field2514 = var5.field5008;
            } else {
                arg0.field2514 = var5.field4964;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method202(int arg0) {
        field470 = null;
        if (arg0 >= -34) {
            field470 = null;
        }
    }
}
