import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class49 extends class172 {

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "Lid;")
    public static class149 field887 = class60.method382("Chargement des textures )2 ", (byte) 49);

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "Lid;")
    public static class149 field884 = class60.method382("(U0a )2 in: ", (byte) 88);

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "Lid;")
    public static class149 field886 = class60.method382("gleiten:", (byte) 15);

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field883 = 0;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "Lid;")
    public static class149 field890 = class60.method382("name_icons", (byte) 22);

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field892 = 0;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "Lid;")
    public static class149 field894 = class60.method382("::mm", (byte) 8);

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    private int field895;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "Lid;")
    public class149 field891;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)Z")
    public final boolean method312(int arg0) {
        field896++;
        if (arg0 != -13492) {
            field887 = null;
        }
        return this.field895 == 115;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILgd;)V")
    public final void method313(int arg0, class74 arg1) {
        field897++;
        while (true) {
            int var3 = arg1.method489((byte) -23);
            if (var3 == 0) {
                if (arg0 == 4572) {
                    return;
                } else {
                    method317(-91, (byte) -122, (class230) null);
                    return;
                }
            }
            this.method315(var3, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(ILgd;)V")
    public static final void method314(int arg0, class74 arg1) {
        field881++;
        if (arg0 <= 56) {
            method316(true);
        }
        while (true) {
            while (arg1.field1321.length > arg1.field1340) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method489((byte) -11) == 1) {
                    var3 = arg1.method489((byte) -128);
                    var2 = true;
                    var4 = arg1.method489((byte) -44);
                }
                int var5 = arg1.method489((byte) 88);
                int var6 = arg1.method489((byte) 81);
                int var7 = var5 * 64 - class80.field1480;
                int var8 = class91.field1615 + class287.field5086 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && (var7 + 63) < class62.field1121 && var8 < class287.field5086) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && (var3 * 8 + 8) > var11 && (var4 * 8) <= var12 && var12 < (var4 * 8 + 8)) {
                                int var13 = arg1.method489((byte) 97);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method489((byte) -93);
                                        if (class118.field2026[var10][var9] == null) {
                                            class118.field2026[var10][var9] = new byte[4096];
                                        }
                                        class118.field2026[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method525(65280);
                                        if (class86.field1564[var10][var9] == null) {
                                            class86.field1564[var10][var9] = new int[4096];
                                        }
                                        class86.field1564[var10][var9][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg1.method525(65280);
                                        if (class147.field2661[var10][var9] == null) {
                                            class147.field2661[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class268 var17 = class108.method755(11525, var16);
                                        if (var17.field4767 != null) {
                                            var17 = var17.method1863((byte) -84);
                                            if (var17 == null || var17.field4772 == -1) {
                                                continue;
                                            }
                                        }
                                        class147.field2661[var10][var9][(63 - var12 << 6) + var11] = var17.field4773 + 1;
                                        class258 var18 = new class258();
                                        var18.field4508 = var17.field4772;
                                        var18.field4515 = var8;
                                        var18.field4520 = var7;
                                        class281.field4995.method1131(var18, false);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method489((byte) -105);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field1340++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field1340 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field1340 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILgd;I)V")
    private final void method315(int arg0, class74 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field895 = arg1.method489((byte) -125);
        } else if (arg0 == 2) {
            this.field882 = arg1.method498((byte) 127);
        } else if (arg0 == 5) {
            this.field891 = arg1.method529(-1);
        }
        field889++;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)V")
    public static void method316(boolean arg0) {
        if (arg0) {
            return;
        }
        field886 = null;
        field884 = null;
        field894 = null;
        field887 = null;
        field890 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBLal;)Lvc;")
    public static final class190 method317(int arg0, byte arg1, class230 arg2) {
        field885++;
        if (class39.method226(arg2, arg0, 58)) {
            return arg1 <= 96 ? null : class2.method12((byte) 57);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(Z)V")
    public static final void method318(boolean arg0) {
        field898++;
        class133.field2420 = null;
        if (arg0) {
            method317(-81, (byte) -50, (class230) null);
        }
        class246.field4320 = null;
        class248.field4347 = null;
        class106.field1842 = null;
        class231.field4069 = null;
    }
}
