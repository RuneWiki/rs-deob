import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class199 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lsg;")
    private static class169 field3887 = class165.method1060("Loaded update list", 1536);

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field3895 = 0;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lsg;")
    public static class169 field3896 = field3887;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lsg;")
    public static class169 field3897 = class165.method1060("::fpson", 1536);

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lcb;")
    public static class22 field3890 = new class22();

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field3899 = 0;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lsg;")
    public static class169 field3898 = class165.method1060("<img=0>", 1536);

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Lsg;")
    public static class169 field3900 = class165.method1060("<col=ffffff> )4 ", 1536);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lcf;")
    public static class26 field3893;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static final void method1303(int arg0) {
        int var1 = class85.field1559.method1031(8, (byte) 74);
        field3889++;
        if (class141.field2631 > var1) {
            for (int var2 = var1; var2 < class141.field2631; var2++) {
                class35.field699[class82.field1510++] = class202.field3932[var2];
            }
        }
        if (class141.field2631 < var1) {
            throw new RuntimeException("gppov1");
        }
        class141.field2631 = 0;
        if (arg0 != 8477) {
            field3887 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class202.field3932[var3];
            class196 var5 = class65.field1213[var4];
            int var6 = class85.field1559.method1031(1, (byte) 77);
            if (var6 == 0) {
                class202.field3932[class141.field2631++] = var4;
                var5.field3700 = class162.field3107;
            } else {
                int var7 = class85.field1559.method1031(2, (byte) -109);
                if (var7 == 0) {
                    class202.field3932[class141.field2631++] = var4;
                    var5.field3700 = class162.field3107;
                    class6.field120[field3895++] = var4;
                } else if (var7 == 1) {
                    class202.field3932[class141.field2631++] = var4;
                    var5.field3700 = class162.field3107;
                    int var8 = class85.field1559.method1031(3, (byte) -90);
                    var5.method1244(var8, false, 0);
                    int var9 = class85.field1559.method1031(1, (byte) -95);
                    if (var9 == 1) {
                        class6.field120[field3895++] = var4;
                    }
                } else if (var7 == 2) {
                    class202.field3932[class141.field2631++] = var4;
                    var5.field3700 = class162.field3107;
                    int var10 = class85.field1559.method1031(3, (byte) -118);
                    var5.method1244(var10, true, arg0 - 8477);
                    int var11 = class85.field1559.method1031(3, (byte) 108);
                    var5.method1244(var11, true, 0);
                    int var12 = class85.field1559.method1031(1, (byte) -84);
                    if (var12 == 1) {
                        class6.field120[field3895++] = var4;
                    }
                } else if (var7 == 3) {
                    class35.field699[class82.field1510++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1304(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 >> 14 & 0x7FFF;
        field3892++;
        int var5 = class196.field3840.method878(class61.field1132, arg2, arg1, arg3);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class17 var8 = class138.method925(6, var4);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var9 = var8.field400;
                var10 = var8.field369;
            } else {
                var9 = var8.field369;
                var10 = var8.field400;
            }
            int var11 = var8.field364;
            if (var7 != 0) {
                var11 = (var11 << var7 & 0xF) + (var11 >> 4 - var7);
            }
            class161.method1037(true, -17868, class4.field79.field3734[0], arg2, 2, var9, class4.field79.field3729[0], 0, var11, 0, arg1, var10);
        } else {
            class161.method1037(true, -17868, class4.field79.field3734[0], arg2, 2, 0, class4.field79.field3729[0], var6 + 1, 0, var7, arg1, 0);
        }
        if (arg0 <= 32) {
            field3897 = null;
        }
        class65.field1205 = class178.field3480;
        class2.field47 = 2;
        class107.field1964 = 0;
        class121.field2229 = class42.field796;
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Z")
    public static final boolean method1305(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            method1303(-3);
        }
        field3891++;
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static void method1306(int arg0) {
        field3890 = null;
        field3887 = null;
        if (arg0 != 0) {
            return;
        }
        field3900 = null;
        field3898 = null;
        field3893 = null;
        field3897 = null;
        field3896 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLsg;Lsg;I)V")
    public static final void method1307(byte arg0, class169 arg1, class169 arg2, int arg3) {
        if (arg0 <= 117) {
            method1303(-2);
        }
        class112.method690(arg1, arg3, null, arg2, 0);
        field3888++;
    }
}
