import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class11 extends class120 {

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    public int field179 = 0;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public int field169 = -1;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "Z")
    public boolean field182 = true;

    @OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
    public int field189 = -1;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "Lva;")
    public static class121 field178 = class107.method797("titlebutton", -10983);

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "Lva;")
    public static class121 field176 = class107.method797("redstone1", -10983);

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    public static int field183 = 0;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    public static int field181 = 500;

    @OriginalMember(owner = "client!bd", name = "jb", descriptor = "Lva;")
    private static class121 field191 = class107.method797("Enter name of friend to delete from list", -10983);

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "Lva;")
    public static class121 field168 = field191;

    @OriginalMember(owner = "client!bd", name = "nb", descriptor = "J")
    public static volatile long field195 = 0L;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "J")
    public static volatile long field180 = 0L;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!bd", name = "ib", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!bd", name = "kb", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!bd", name = "lb", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "J")
    public static long field187;

    @OriginalMember(owner = "client!bd", name = "mb", descriptor = "Lub;")
    public static class117 field194;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I", line = 3)
    public static final int method84(int arg0, int arg1, int arg2) {
        field184++;
        if (arg1 <= 122) {
            return -114;
        } else if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 0) {
                arg0 = 0;
            } else if (arg0 > 127) {
                arg0 = 127;
            }
            return 127 - arg0;
        } else {
            int var4 = (arg2 & 0x7F) * arg0 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg2 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBILtc;)V", line = 43)
    private final void method85(int arg0, byte arg1, int arg2, class113 arg3) {
        if (arg2 == 1) {
            this.field179 = arg3.method848(16711680);
        } else if (arg2 == 2) {
            this.field189 = arg3.method821(true);
        } else if (arg2 == 5) {
            this.field182 = false;
        } else if (arg2 == 7) {
            this.field169 = arg3.method848(16711680);
        }
        if (arg1 != -87) {
            this.method92(-25, false);
        }
        field173++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Component;IIZ)Lw;", line = 81)
    public static final class125 method86(Component arg0, int arg1, int arg2, boolean arg3) {
        field171++;
        try {
            Class var4 = Class.forName("de");
            class125 var5 = (class125) var4.getDeclaredConstructor().newInstance();
            if (arg3) {
                field194 = null;
            }
            var5.method195(arg0, arg2, arg1, false);
            return var5;
        } catch (Throwable var7) {
            class42 var6 = new class42();
            var6.method195(arg0, arg2, arg1, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(B)V", line = 129)
    public static void method87(byte arg0) {
        if (arg0 != 125) {
            method89(-58, 11, -84, 68);
        }
        field194 = null;
        field168 = null;
        field191 = null;
        field176 = null;
        field178 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V", line = 147)
    public final void method88(boolean arg0) {
        if (this.field169 != -1) {
            this.method92(this.field169, true);
            this.field172 = this.field193;
            this.field175 = this.field177;
            this.field190 = this.field185;
        }
        this.method92(this.field179, !arg0);
        field188++;
        if (arg0) {
            method91(58, -30);
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(IIII)I", line = 174)
    public static final int method89(int arg0, int arg1, int arg2, int arg3) {
        field192++;
        int var4 = arg3 & arg1;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLtc;I)V", line = 195)
    public final void method90(byte arg0, class113 arg1, int arg2) {
        int var4 = -10 % ((62 - arg0) / 54);
        while (true) {
            int var5 = arg1.method821(true);
            if (var5 == 0) {
                field170++;
                return;
            }
            this.method85(arg2, (byte) -87, var5, arg1);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V", line = 221)
    public static final void method91(int arg0, int arg1) {
        field174++;
        int[] var2 = class63.field1522.field164;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = arg1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class23.field613[arg0][var21][var5] & 0x18) == 0) {
                    class58.field1348.method720(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class23.field613[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class58.field1348.method720(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + 238 - (10 - ((int) (Math.random() * 20.0D) + 238 - 10 << 8)) + (int) (Math.random() * 20.0D);
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        class63.field1522.method75();
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class23.field613[arg0][var19][var8] & 0x18) == 0) {
                    class9.method56(var8, var19, var6, (byte) 19, var7, arg0);
                }
                if (arg0 < 3 && (class23.field613[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class9.method56(var8, var19, var6, (byte) 19, var7, arg0 + 1);
                }
            }
        }
        class4.field75 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class58.field1348.method761(class121.field2807, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class20.method179(6, var12).field1366;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class18.field385[class121.field2807].field276;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x1280108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var9 + 3 > var14 && (var16[var14 + 1][var15] & 0x1280180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x1280102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x1280120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class64.field1549[class4.field75] = class75.field1722[var13];
                        class42.field978[class4.field75] = var14;
                        class37.field875[class4.field75] = var15;
                        class4.field75++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)V", line = 382)
    private final void method92(int arg0, boolean arg1) {
        field186++;
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        if (var5 > var3) {
            var7 = var3;
        }
        double var11 = 0.0D;
        double var13 = var5;
        double var15 = 0.0D;
        if (var7 > var9) {
            var7 = var9;
        }
        if (var3 > var5) {
            var13 = var3;
        }
        if (!arg1) {
            this.method85(74, (byte) -13, -33, null);
        }
        if (var13 < var9) {
            var13 = var9;
        }
        double var17 = (var7 + var13) / 2.0D;
        if (var7 != var13) {
            if (var5 == var13) {
                var15 = (var3 - var9) / (var13 - var7);
            } else if (var3 == var13) {
                var15 = (var9 - var5) / (var13 - var7) + 2.0D;
            } else if (var9 == var13) {
                var15 = (var5 - var3) / (var13 - var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var11 = (var13 - var7) / (var7 + var13);
            }
            if (var17 >= 0.5D) {
                var11 = (var13 - var7) / (2.0D - var13 - var7);
            }
        }
        double var19 = var15 / 6.0D;
        this.field177 = (int) (var19 * 256.0D);
        this.field193 = (int) (var17 * 256.0D);
        this.field185 = (int) (var11 * 256.0D);
        if (this.field193 < 0) {
            this.field193 = 0;
        } else if (this.field193 > 255) {
            this.field193 = 255;
        }
        if (this.field185 < 0) {
            this.field185 = 0;
        } else if (this.field185 > 255) {
            this.field185 = 255;
        }
    }
}
