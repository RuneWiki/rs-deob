import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class117 extends class111 {

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lhl;")
    public class311 field1587;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1588;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 4)
    public static void method716(int arg0) {
        if (arg0 != 0) {
            field1588 = null;
        }
        field1588 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)Z", line = 19)
    public static final boolean method717(int arg0, int arg1, int arg2, int arg3) {
        if (!class254.method1764(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class439.field6280[arg0].method359(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class72.field940) {
                    if (!class239.method1627(var4, var6, var5)) {
                        return false;
                    }
                    if (!class239.method1627(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class239.method1627(var4, var7, var5)) {
                        return false;
                    }
                    if (!class239.method1627(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class239.method1627(var4, var8, var5)) {
                    return false;
                }
                if (!class239.method1627(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class265.field3899) {
                    if (!class239.method1627(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class239.method1627(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class239.method1627(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class239.method1627(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class239.method1627(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class239.method1627(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class72.field940) {
                    if (!class239.method1627(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class239.method1627(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class239.method1627(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class239.method1627(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class239.method1627(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class239.method1627(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class265.field3899) {
                    if (!class239.method1627(var4, var6, var5)) {
                        return false;
                    }
                    if (!class239.method1627(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class239.method1627(var4, var7, var5)) {
                        return false;
                    }
                    if (!class239.method1627(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class239.method1627(var4, var8, var5)) {
                    return false;
                }
                if (!class239.method1627(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class239.method1627(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class239.method1627(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class239.method1627(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class239.method1627(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class239.method1627(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BZ)[B", line = 203)
    public static final byte[] method718(byte[] arg0, boolean arg1) {
        if (arg1) {
            field1588 = null;
        }
        field1591++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class271.method1853(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 226)
    public static final void method719(byte arg0) {
        field1592++;
        if (arg0 != -13) {
            field1585 = -42;
        }
        if (class215.field3080 == 5) {
            class215.field3080 = 6;
        }
    }
}
