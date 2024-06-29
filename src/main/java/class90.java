import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class class90 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static volatile int field1648 = -1;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "Lhh;")
    public static class163 field1657 = class137.method1065("Gegenstand f-Ur Mitglieder", 17);

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field1658 = 50;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field1654 = 0;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field1662 = 0;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lpa;")
    public static class123 field1647;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Lv;")
    public static class22 field1646;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Ljava/awt/Image;")
    public Image field1652;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "[I")
    public int[] field1649;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Lwg;")
    public static final class211 method692(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        return var3 == null || var3.field2736 == null ? null : var3.field2736;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method693(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
    public abstract void method694(int arg0, byte arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static final void method695(int arg0) {
        if (arg0 != -28512) {
            return;
        }
        field1660++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class87.method683(true, var1, var2, class259.field4542, var3, false)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    public static void method696(int arg0) {
        field1657 = null;
        field1646 = null;
        field1647 = null;
        if (arg0 > -47) {
            field1647 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method697(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method698(int arg0, int arg1, int arg2, int arg3) {
        if (!class52.method366(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class228.field4107[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class134.field2601) {
                    if (!class234.method1620(var4, var6, var5)) {
                        return false;
                    }
                    if (!class234.method1620(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class234.method1620(var4, var7, var5)) {
                        return false;
                    }
                    if (!class234.method1620(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class234.method1620(var4, var8, var5)) {
                    return false;
                }
                if (!class234.method1620(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class30.field476) {
                    if (!class234.method1620(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class234.method1620(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class234.method1620(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class234.method1620(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class234.method1620(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class234.method1620(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class134.field2601) {
                    if (!class234.method1620(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class234.method1620(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class234.method1620(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class234.method1620(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class234.method1620(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class234.method1620(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class30.field476) {
                    if (!class234.method1620(var4, var6, var5)) {
                        return false;
                    }
                    if (!class234.method1620(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class234.method1620(var4, var7, var5)) {
                        return false;
                    }
                    if (!class234.method1620(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class234.method1620(var4, var8, var5)) {
                    return false;
                }
                if (!class234.method1620(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class234.method1620(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class234.method1620(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class234.method1620(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class234.method1620(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class234.method1620(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public static final void method699(int arg0) {
        field1656++;
        class76.field1427 = new class258(arg0);
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public final void method700(int arg0) {
        if (arg0 <= 25) {
            field1653 = -49;
        }
        class206.method1468(this.field1649, this.field1659, this.field1661);
        field1651++;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    protected class90() {
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static final void method701(byte arg0) {
        field1650++;
        class192.field3512.method120((byte) -123);
        if (arg0 != -107) {
            method692(42, -73, 111);
        }
    }
}
