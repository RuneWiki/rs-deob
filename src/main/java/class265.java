import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class265 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Z")
    public static boolean field4531 = true;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lma;")
    public static class5 field4537 = class12.method119("headicons_prayer", (byte) 54);

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Z")
    public static boolean field4539 = false;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Lsg;")
    public static class155 field4536 = new class155();

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Lma;")
    public static class5 field4540 = class12.method119("::fps ", (byte) 62);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1821(byte arg0) {
        field4530++;
        int var1 = -109 / ((21 - arg0) / 63);
        int var2 = class288.field4880;
        int var3 = class48.field739 - class255.field4362 - var2;
        int var4 = class60.field932;
        int var5 = class239.field3977 - class156.field2314 - var4;
        if (var2 <= 0 && var3 <= 0 && var4 <= 0 && var5 <= 0) {
            return;
        }
        try {
            Container var6;
            if (class207.field3291 != null) {
                var6 = class207.field3291;
            } else if (class81.field1263 == null) {
                var6 = class267.field4597.field2262;
            } else {
                var6 = class81.field1263;
            }
            int var7 = 0;
            int var8 = 0;
            if (class81.field1263 == var6) {
                Insets var9 = class81.field1263.getInsets();
                var7 = var9.left;
                var8 = var9.top;
            }
            Graphics var10 = var6.getGraphics();
            var10.setColor(Color.black);
            if (var2 > 0) {
                var10.fillRect(var7, var8, var2, class239.field3977);
            }
            if (var4 > 0) {
                var10.fillRect(var7, var8, class48.field739, var4);
            }
            if (var3 > 0) {
                var10.fillRect(var7 + class48.field739 - var3, var8, var3, class239.field3977);
            }
            if (var5 > 0) {
                var10.fillRect(var7, class239.field3977 + var8 - var5, class48.field739, var5);
            }
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 69)
    public static final void method1822(int arg0) {
        field4529++;
        class101.field1515.method522(54);
        class24.field412.method522(94);
        if (arg0 > -121) {
            method1822(-125);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 93)
    public static void method1823(int arg0) {
        field4540 = null;
        field4537 = null;
        if (arg0 != -1) {
            field4531 = true;
        }
        field4536 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLii;)V", line = 106)
    public static final void method1824(byte arg0, class221 arg1) {
        field4535++;
        if (arg0 > -60) {
            method1821((byte) 19);
        }
        while (true) {
            while (arg1.field3617.length > arg1.field3610) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1509(true) == 1) {
                    var3 = arg1.method1509(true);
                    var2 = true;
                    var4 = arg1.method1509(true);
                }
                int var5 = arg1.method1509(true);
                int var6 = arg1.method1509(true);
                int var7 = var5 * 64 - class206.field3284;
                int var8 = class97.field1460 - (var6 * 64 + -class289.field4918) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && (var7 + 63) < class139.field2066 && class97.field1460 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < (var3 * 8 + 8) && var12 >= (var4 * 8) && var12 < (var4 * 8 + 8)) {
                                int var13 = arg1.method1509(true);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1509(true);
                                        if (class230.field3825[var9][var10] == null) {
                                            class230.field3825[var9][var10] = new byte[4096];
                                        }
                                        class230.field3825[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1524((byte) 109);
                                        if (class141.field2076[var9][var10] == null) {
                                            class141.field2076[var9][var10] = new short[4096];
                                        }
                                        class141.field2076[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg1.method1509(true) & 0xFF << 16) + (arg1.method1509(true) & 0xFF << 8) + (arg1.method1509(true) & 0xFF);
                                        if (class278.field4722[var9][var10] == null) {
                                            class278.field4722[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class185 var17 = class77.method536(var16, 118);
                                        if (var17.field2843 != null) {
                                            var17 = var17.method1216(0);
                                            if (var17 == null || var17.field2903 == -1) {
                                                continue;
                                            }
                                        }
                                        class278.field4722[var9][var10][(63 - var12 << 6) + var11] = var17.field2893 + 1;
                                        class260 var18 = new class260();
                                        var18.field4427 = var7;
                                        var18.field4440 = var8;
                                        var18.field4432 = var17.field2903;
                                        class59.field925.method1485(-8564, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1509(true);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field3610++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field3610 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field3610 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lni;I)V", line = 267)
    public static final void method1825(class202 arg0, int arg1) {
        class41.field627 = arg0;
        field4538++;
        int var2 = -29 % ((-arg1 - 67) / 54);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILma;I)V", line = 279)
    public static final void method1826(int arg0, class5 arg1, int arg2) {
        field4532++;
        class250 var3 = class282.method1912(384132640, arg2, arg0);
        var3.method1749(arg0 - 57);
        var3.field4135 = arg1;
    }
}
