import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class261 {

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "F")
    public float field3727 = 1.0F;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "F")
    public float field3738 = 1.0F;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "F")
    public float field3729 = 0.25F;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "F")
    public float field3722;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "F")
    public float field3736;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public int field3735;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    public int field3737;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public int field3733;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "F")
    public float field3728;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Lqba;")
    public class345 field3726;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "Lh;")
    public static class572 field3732 = new class572("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public static int field3739 = 0;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "[C")
    private static char[] field3740;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lgw;B)V")
    public final void method1657(class148 arg0, byte arg1) {
        field3725++;
        this.field3727 = (float) (arg0.method1032((byte) -33) * 8) / 255.0F;
        this.field3729 = (float) (arg0.method1032((byte) -33) * 8) / 255.0F;
        this.field3738 = (float) (arg0.method1032((byte) -33) * 8) / 255.0F;
        if (arg1 != 42) {
            method1662((byte) 39, 40);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static final void method1658(int arg0) {
        if (arg0 != -4654) {
            field3740 = null;
        }
        field3734++;
        class58.field738.method500(((float) class56.field668.field6863 * 0.1F + 0.7F) * 1.1523438F);
        class58.field738.method520(class93.field1397, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class58.field738.method489(class5.field43, -1, 256);
        class58.field738.method426(class26.field280);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public static void method1659(int arg0) {
        field3740 = null;
        int var1 = -5 / ((65 - arg0) / 38);
        field3732 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BLvn;)Z")
    public final boolean method1660(byte arg0, class261 arg1) {
        field3723++;
        if (arg0 != 91) {
            this.field3735 = -31;
        }
        return this.field3733 == arg1.field3733 && this.field3736 == arg1.field3736 && this.field3728 == arg1.field3728 && this.field3722 == arg1.field3722 && this.field3729 == arg1.field3729 && this.field3727 == arg1.field3727 && this.field3738 == arg1.field3738 && this.field3724 == arg1.field3724 && this.field3737 == arg1.field3737 && this.field3726 == arg1.field3726;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class104.field1510[arg0][var8][var14] == -class213.field3139) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class115.field1626) + 1;
            int var10 = (arg3 << class115.field1626) + 2;
            int var11 = class165.field2609[arg0].method1239(arg1, arg3) + arg5;
            if (!class94.method740(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class115.field1626) - 1;
            if (!class94.method740(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class115.field1626) - 1;
            if (!class94.method740(var9, var11, var13)) {
                return false;
            } else if (class94.method740(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class190.method1303(arg0, arg1, arg3)) {
            int var6 = arg1 << class115.field1626;
            int var7 = arg3 << class115.field1626;
            return class94.method740(var6 + 1, class165.field2609[arg0].method1239(arg1, arg3) + arg5, var7 + 1) && class94.method740(class96.field1409 + var6 - 1, class165.field2609[arg0].method1239(arg1 + 1, arg3) + arg5, var7 + 1) && class94.method740(class96.field1409 + var6 - 1, class165.field2609[arg0].method1239(arg1 + 1, arg3 + 1) + arg5, class96.field1409 + var7 - 1) && class94.method740(var6 + 1, class165.field2609[arg0].method1239(arg1, arg3 + 1) + arg5, class96.field1409 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)V")
    public static final void method1662(byte arg0, int arg1) {
        field3730++;
        if (arg0 >= 13) {
            class221 var2 = class65.method413(16, arg1, (byte) -84);
            var2.method1432(0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
    public class261() {
        this.field3731 = -50;
        this.field3722 = 1.2F;
        this.field3736 = 1.1523438F;
        this.field3735 = -60;
        this.field3737 = 0;
        this.field3733 = class93.field1397;
        this.field3728 = 0.69921875F;
        this.field3721 = -50;
        this.field3724 = class5.field43;
        this.field3726 = class26.field280;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lgw;)V")
    public class261(class148 arg0) {
        int var2 = arg0.method1032((byte) -33);
        if (class56.field668.method2895(class526.field7533, 0) && class58.field738.method513() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3733 = class93.field1397;
            } else {
                this.field3733 = arg0.method1026(-917302120);
            }
            if ((var2 & 0x2) == 0) {
                this.field3736 = 1.1523438F;
            } else {
                this.field3736 = (float) arg0.method1045(true) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3728 = 0.69921875F;
            } else {
                this.field3728 = (float) arg0.method1045(true) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3722 = 1.2F;
            } else {
                this.field3722 = (float) arg0.method1045(true) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1026(-917302120);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1045(true);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1045(true);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1045(true);
            }
            this.field3733 = class93.field1397;
            this.field3722 = 1.2F;
            this.field3728 = 0.69921875F;
            this.field3736 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3731 = -50;
            this.field3721 = -50;
            this.field3735 = -60;
        } else {
            this.field3731 = arg0.method1047(0);
            this.field3735 = arg0.method1047(0);
            this.field3721 = arg0.method1047(0);
        }
        if ((var2 & 0x20) == 0) {
            this.field3724 = class5.field43;
        } else {
            this.field3724 = arg0.method1026(-917302120);
        }
        if ((var2 & 0x40) == 0) {
            this.field3737 = 0;
        } else {
            this.field3737 = arg0.method1045(true);
        }
        if ((var2 & 0x80) == 0) {
            this.field3726 = class26.field280;
        } else {
            int var3 = arg0.method1045(true);
            int var4 = arg0.method1045(true);
            int var5 = arg0.method1045(true);
            int var6 = arg0.method1045(true);
            int var7 = arg0.method1045(true);
            int var8 = arg0.method1045(true);
            this.field3726 = class404.method2375(var5, var8, (byte) -82, var6, var3, var4, var7);
        }
    }

    static {
        new class572("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        field3740 = new char[64];
        for (int var0 = 0; var0 < 26; var0++) {
            field3740[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3740[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3740[var2] = (char) (var2 + 48 - 52);
        }
        field3740[62] = '+';
        field3740[63] = '/';
    }
}
