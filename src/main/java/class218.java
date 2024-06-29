import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class218 extends class95 {

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lvf;")
    public static class265 field3928 = class87.method582(-46, "blaugr-Un:");

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lvf;")
    public static class265 field3934 = class87.method582(-46, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lgk;")
    public static class6 field3927;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "[[B")
    public static byte[][] field3930;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method1497(byte arg0) {
        field3930 = null;
        field3928 = null;
        field3934 = null;
        field3927 = null;
        if (arg0 != -89) {
            field3930 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1498(int arg0, int arg1, int arg2, int arg3) {
        if (!class124.method834(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class279.field4936[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class65.field1254) {
                    if (!class155.method1053(var4, var6, var5)) {
                        return false;
                    }
                    if (!class155.method1053(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class155.method1053(var4, var7, var5)) {
                        return false;
                    }
                    if (!class155.method1053(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class155.method1053(var4, var8, var5)) {
                    return false;
                }
                if (!class155.method1053(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class204.field3647) {
                    if (!class155.method1053(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class155.method1053(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class155.method1053(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class155.method1053(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class155.method1053(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class155.method1053(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class65.field1254) {
                    if (!class155.method1053(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class155.method1053(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class155.method1053(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class155.method1053(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class155.method1053(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class155.method1053(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class204.field3647) {
                    if (!class155.method1053(var4, var6, var5)) {
                        return false;
                    }
                    if (!class155.method1053(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class155.method1053(var4, var7, var5)) {
                        return false;
                    }
                    if (!class155.method1053(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class155.method1053(var4, var8, var5)) {
                    return false;
                }
                if (!class155.method1053(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class155.method1053(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class155.method1053(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class155.method1053(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class155.method1053(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class155.method1053(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lng;B)Lvf;")
    public static final class265 method1499(class135 arg0, byte arg1) {
        if (arg1 == -39) {
            field3932++;
            return class40.method336(32767, 0, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIZIZI)V")
    public static final void method1500(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field3931++;
        if (arg2 == 3) {
            method1500(-122, arg1, class50.field1058, true, -1, true, -1);
            return;
        }
        Container var7;
        if (class141.field2621 != null) {
            var7 = class141.field2621;
        } else if (class49.field1044 == null) {
            var7 = class281.field4957.field4024;
        } else {
            var7 = class49.field1044;
        }
        class78.field1489 = var7.getSize().width;
        class145.field2700 = var7.getSize().height;
        if (class49.field1044 == var7) {
            Insets var8 = class49.field1044.getInsets();
            class145.field2700 -= var8.top + var8.bottom;
            class78.field1489 -= var8.right + var8.left;
        }
        if (arg2 < 2) {
            class147.field2755 = (class78.field1489 - 765) / 2;
            class193.field3468 = 0;
            class26.field706 = 765;
            class50.field1053 = 503;
        } else {
            class26.field706 = class78.field1489;
            class50.field1053 = class145.field2700;
            class147.field2755 = 0;
            class193.field3468 = 0;
        }
        if (arg5) {
            class15.method109(114, class125.field2241);
            class131.method877(0, class125.field2241);
            if (class263.field4595 != null) {
                class263.field4595.method444(class125.field2241, -29591);
            }
            class21.field652.method1234(10864);
            class124.method836(class125.field2241, 66);
            class207.method1420(class125.field2241, 25691);
            if (class263.field4595 != null) {
                class263.field4595.method442((byte) 59, class125.field2241);
            }
        } else {
            class125.field2241.setSize(class26.field706, class50.field1053);
            if (class49.field1044 == var7) {
                Insets var9 = class49.field1044.getInsets();
                class125.field2241.setLocation(class147.field2755 + var9.left, class193.field3468 + var9.top);
            } else {
                class125.field2241.setLocation(class147.field2755, class193.field3468);
            }
        }
        if (arg2 > 0) {
            method1500(-124, arg1, 0, true, -1, true, -1);
            return;
        }
        class43.field964 = !class231.method1561(25088);
        if (class8.field271 != -1) {
            class232.method1568(true, true);
        }
        if (class197.field3520 != null && (class246.field4281 == 30 || class246.field4281 == 25)) {
            class213.method1451((byte) 74);
        }
        if (arg0 <= -105) {
            for (int var10 = 0; var10 < 100; var10++) {
                class135.field2481[var10] = true;
            }
            class63.field1239 = true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public static final void method1501(int arg0) {
        field3933++;
        if (arg0 > 54) {
            class8.field267.method1888((byte) 102);
            class91.field1612.method1888((byte) 109);
        }
    }
}
