import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class167 extends class59 {

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Lok;")
    public class41 field2658;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field2655 = 0;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field2656 = 0;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "Lok;")
    public static class41 field2659 = class137.method956("Lade Benutzeroberfl-=che )2 ", 45);

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field2661 = 0;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Lmh;")
    public static class65 field2657;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V", line = 16)
    public static final void method1196(byte arg0) {
        field2660++;
        for (class149 var1 = (class149) class236.field3796.method1495(-312); var1 != null; var1 = (class149) class236.field3796.method1501(-99)) {
            if (var1.field2311) {
                var1.method1031(-17223);
            }
        }
        if (arg0 != 45) {
            method1197(-109);
        }
        for (class149 var2 = (class149) class140.field2149.method1495(-312); var2 != null; var2 = (class149) class140.field2149.method1501(-114)) {
            if (var2.field2311) {
                var2.method1031(-17223);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V", line = 51)
    public static void method1197(int arg0) {
        if (arg0 != -16480) {
            field2657 = (class65) null;
        }
        field2657 = null;
        field2659 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)Z", line = 67)
    public static final boolean method1198(int arg0, int arg1, int arg2, int arg3) {
        if (!class92.method651(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class278.field4548[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class140.field2155) {
                    if (!class125.method882(var4, var6, var5)) {
                        return false;
                    }
                    if (!class125.method882(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class125.method882(var4, var7, var5)) {
                        return false;
                    }
                    if (!class125.method882(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class125.method882(var4, var8, var5)) {
                    return false;
                }
                if (!class125.method882(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class302.field5027) {
                    if (!class125.method882(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class125.method882(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class125.method882(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class125.method882(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class125.method882(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class125.method882(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class140.field2155) {
                    if (!class125.method882(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class125.method882(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class125.method882(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class125.method882(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class125.method882(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class125.method882(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class302.field5027) {
                    if (!class125.method882(var4, var6, var5)) {
                        return false;
                    }
                    if (!class125.method882(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class125.method882(var4, var7, var5)) {
                        return false;
                    }
                    if (!class125.method882(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class125.method882(var4, var8, var5)) {
                    return false;
                }
                if (!class125.method882(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class125.method882(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class125.method882(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class125.method882(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class125.method882(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class125.method882(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I", line = 254)
    public static final int method1199(int arg0) {
        field2662++;
        return arg0 < 38 ? -20 : class78.field1154;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 266)
    public class167() {
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lok;)V", line = 283)
    public class167(class41 arg0) {
        this.field2658 = arg0;
    }
}
