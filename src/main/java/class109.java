import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class109 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Z")
    public static boolean field1685 = true;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "[Lwd;")
    public static class23[] field1687 = new class23[29];

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lp;")
    public static class303 field1684;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lub;")
    public static class92 field1691;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method814(boolean arg0) {
        field1687 = null;
        if (!arg0) {
            method814(true);
        }
        field1691 = null;
        field1684 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[Lcc;ZIII)V")
    public static final void method815(int arg0, class222[] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 < arg1.length; var6++) {
            class222 var7 = arg1[var6];
            if (var7 != null && var7.field3392 == arg3) {
                class182.method1304(arg5, arg0, var7, arg2, (byte) -128);
                class223.method1531(false, arg5, var7, arg0);
                if (var7.field3563 > var7.field3443 - var7.field3408) {
                    var7.field3563 = var7.field3443 - var7.field3408;
                }
                if (var7.field3563 < 0) {
                    var7.field3563 = 0;
                }
                if (var7.field3460 - var7.field3561 < var7.field3569) {
                    var7.field3569 = var7.field3460 - var7.field3561;
                }
                if (var7.field3569 < 0) {
                    var7.field3569 = 0;
                }
                if (var7.field3552 == 0) {
                    class305.method2041(var7, arg4 - 128, arg2);
                }
            }
        }
        field1689++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lvd;IILjava/awt/Component;I)Ltd;")
    public static final class74 method816(class4 arg0, int arg1, int arg2, Component arg3, int arg4) {
        field1686++;
        if (class174.field2695 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class74 var5 = (class74) Class.forName("vl").getDeclaredConstructor().newInstance();
                var5.field1127 = new int[(class259.field4107 ? 2 : 1) * 256];
                var5.field1162 = arg1;
                var5.method189(arg3);
                var5.field1160 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field1160 > 16384) {
                    var5.field1160 = 16384;
                }
                var5.method185(var5.field1160);
                if (class308.field4936 > 0 && class306.field4918 == null) {
                    class306.field4918 = new class52();
                    class306.field4918.field830 = arg0;
                    arg0.method25(false, class306.field4918, class308.field4936);
                }
                if (class306.field4918 != null) {
                    if (class306.field4918.field831[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class306.field4918.field831[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class21 var6 = new class21(arg0, arg4);
                    var6.field1162 = arg1;
                    var6.field1127 = new int[(class259.field4107 ? 2 : 1) * 256];
                    var6.method189(arg3);
                    var6.field1160 = 16384;
                    var6.method185(var6.field1160);
                    if (arg2 < 45) {
                        return null;
                    }
                    if (class308.field4936 > 0 && class306.field4918 == null) {
                        class306.field4918 = new class52();
                        class306.field4918.field830 = arg0;
                        arg0.method25(false, class306.field4918, class308.field4936);
                    }
                    if (class306.field4918 != null) {
                        if (class306.field4918.field831[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class306.field4918.field831[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class74();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method817(byte arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg0 >= 43) {
            field1690++;
        }
    }
}
