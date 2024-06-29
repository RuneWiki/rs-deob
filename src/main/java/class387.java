import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class387 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public int field5706 = -1;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public int field5710 = -1;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field5705 = 1403;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "[I")
    public int[] field5709;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBLre;)V")
    private final void method2340(int arg0, byte arg1, class446 arg2) {
        if (arg0 == 1) {
            this.field5710 = arg2.method2631(2530);
        } else if (arg0 == 2) {
            this.field5709 = new int[arg2.method2628(49152)];
            for (int var4 = 0; var4 < this.field5709.length; var4++) {
                this.field5709[var4] = arg2.method2631(2530);
            }
        } else if (arg0 == 3) {
            this.field5706 = arg2.method2628(49152);
        }
        field5711++;
        if (arg1 > -123) {
            this.method2342((class446) null, true);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([[[Lke;ZIIII)Z")
    public static final boolean method2341(class337[][][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field5708++;
        if (arg4 != 18524) {
            field5713 = -19;
        }
        byte var6 = arg1 ? 1 : (byte) (class281.field4249 & 0xFF);
        if (class134.field1954[class486.field6836][arg2][arg3] == var6) {
            return false;
        } else if ((class246.field3532[class486.field6836][arg2][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class51.field745[var7] = arg2;
            int var35 = var7 + 1;
            class315.field4738[var7] = arg3;
            class134.field1954[class486.field6836][arg2][arg3] = var6;
            while (var35 != var8) {
                int var9 = class51.field745[var8] & 0xFFFF;
                int var10 = class51.field745[var8] >> 16 & 0xFF;
                int var11 = class51.field745[var8] >> 24 & 0xFF;
                int var12 = class315.field4738[var8] & 0xFFFF;
                int var13 = (class315.field4738[var8] & 0xFFBB59) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class246.field3532[class486.field6836][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class486.field6836 + 1; var16 <= 3; var16++) {
                    if ((class246.field3532[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field5044 != null) {
                                int var20 = class414.method2469(var10, -15836);
                                if (arg0[var16][var9][var12].field5044.field1425 == var20 || arg0[var16][var9][var12].field5047 != null && arg0[var16][var9][var12].field5047.field1425 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class414.method2469(var11, -15836);
                                    if (arg0[var16][var9][var12].field5044.field1425 == var21 || arg0[var16][var9][var12].field5047 != null && arg0[var16][var9][var12].field5047.field1425 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class414.method2469(var13, arg4 ^ 0xFFFF8A78);
                                    if (arg0[var16][var9][var12].field5044.field1425 == var22 || arg0[var16][var9][var12].field5047 != null && arg0[var16][var9][var12].field5047.field1425 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class337 var23 = arg0[var16][var9][var12];
                            if (var23.field5054 != null) {
                                for (class448 var24 = var23.field5054; var24 != null; var24 = var24.field6340) {
                                    class305 var25 = var24.field6343;
                                    if (var25 instanceof class218) {
                                        class218 var26 = (class218) var25;
                                        int var27 = var26.method250((byte) -121);
                                        int var28 = var26.method244((byte) -99);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class337 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field5054 != null) {
                            for (class448 var31 = var30.field5054; var31 != null; var31 = var31.field6340) {
                                class305 var32 = var31.field6343;
                                if (var32.field4542 != var32.field4541 || var32.field4552 != var32.field4547) {
                                    for (int var33 = var32.field4542; var33 <= var32.field4541; var33++) {
                                        for (int var34 = var32.field4547; var34 <= var32.field4552; var34++) {
                                            class134.field1954[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class134.field1954[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class479.field6745[class486.field6836 + 1].method199(var9, var12);
                    if (var17 > class145.field2050[arg5]) {
                        class145.field2050[arg5] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class31.field412[arg5]) {
                        class31.field412[arg5] = var18;
                    } else if (class356.field5405[arg5] < var18) {
                        class356.field5405[arg5] = var18;
                    }
                    int var19 = var12 << 7;
                    if (class225.field3262[arg5] > var19) {
                        class225.field3262[arg5] = var19;
                    } else if (var19 > class180.field2688[arg5]) {
                        class180.field2688[arg5] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class134.field1954[class486.field6836][var9 - 1][var12] != var6) {
                        class51.field745[var35] = class347.method2139(-754974720, class347.method2139(1179648, var9 - 1));
                        class315.field4738[var35] = class347.method2139(var12, 1245184);
                        class134.field1954[class486.field6836][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    int var10000 = ~class456.field6477;
                    var12++;
                    if (var10000 < ~var12) {
                        if ((var9 - 1) >= 0 && class134.field1954[class486.field6836][var9 - 1][var12] != var6 && (class246.field3532[class486.field6836][var9][var12] & 0x4) == 0 && (class246.field3532[class486.field6836][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class51.field745[var35] = class347.method2139(class347.method2139(1179648, var9 - 1), 1375731712);
                            class315.field4738[var35] = class347.method2139(1245184, var12);
                            class134.field1954[class486.field6836][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class134.field1954[class486.field6836][var9][var12] != var6) {
                            class51.field745[var35] = class347.method2139(class347.method2139(5373952, var9), 318767104);
                            class315.field4738[var35] = class347.method2139(var12, 5439488);
                            class134.field1954[class486.field6836][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class379.field5642 > var9 + 1 && class134.field1954[class486.field6836][var9 + 1][var12] != var6 && (class246.field3532[class486.field6836][var9][var12] & 0x4) == 0 && (class246.field3532[class486.field6836][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class51.field745[var35] = class347.method2139(-1845493760, class347.method2139(5373952, var9 + 1));
                            class315.field4738[var35] = class347.method2139(var12, 5439488);
                            class134.field1954[class486.field6836][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class379.field5642 > var9 + 1 && class134.field1954[class486.field6836][var9 + 1][var12] != var6) {
                        class51.field745[var35] = class347.method2139(1392508928, class347.method2139(var9 + 1, 9568256));
                        class315.field4738[var35] = class347.method2139(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class134.field1954[class486.field6836][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class134.field1954[class486.field6836][var9 - 1][var12] != var6 && (class246.field3532[class486.field6836][var9][var12] & 0x4) == 0 && (class246.field3532[class486.field6836][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class51.field745[var35] = class347.method2139(301989888, class347.method2139(var9 - 1, 13762560));
                            class315.field4738[var35] = class347.method2139(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class134.field1954[class486.field6836][var9 - 1][var12] = var6;
                        }
                        if (class134.field1954[class486.field6836][var9][var12] != var6) {
                            class51.field745[var35] = class347.method2139(class347.method2139(13762560, var9), -1828716544);
                            class315.field4738[var35] = class347.method2139(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class134.field1954[class486.field6836][var9][var12] = var6;
                        }
                        if (class379.field5642 > var9 + 1 && class134.field1954[class486.field6836][var9 + 1][var12] != var6 && (class246.field3532[class486.field6836][var9][var12] & 0x4) == 0 && (class246.field3532[class486.field6836][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class51.field745[var35] = class347.method2139(-771751936, class347.method2139(var9 + 1, 9568256));
                            class315.field4738[var35] = class347.method2139(9633792, var12);
                            class134.field1954[class486.field6836][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class145.field2050[arg5] != -1000000) {
                class145.field2050[arg5] += 10;
                class31.field412[arg5] -= 50;
                class356.field5405[arg5] += 50;
                class180.field2688[arg5] += 50;
                class225.field3262[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lre;Z)V")
    public final void method2342(class446 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method2628(49152);
            if (var3 == 0) {
                field5707++;
                return;
            }
            this.method2340(var3, (byte) -126, arg0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILe;II)V")
    public static final void method2343(int arg0, int arg1, class267 arg2, int arg3, int arg4) {
        field5712++;
        long var5 = (long) (arg3 << 28 | arg0 << 14 | arg1);
        class31 var7 = (class31) class491.field6897.method2305(var5, (byte) 53);
        if (var7 == null) {
            class31 var8 = new class31();
            class491.field6897.method2307(var5, var8, (byte) -48);
            var8.field407.method2453((byte) -114, arg2);
            return;
        }
        if (arg4 != -16431) {
            method2343(-25, -120, (class267) null, 28, -54);
        }
        class184 var9 = class23.field309.method2364((byte) 118, arg2.field3963);
        int var10 = var9.field2769;
        if (var9.field2768 == 1) {
            var10 = (arg2.field3961 + 1) * var10;
        }
        for (class267 var11 = (class267) var7.field407.method2456(32101); var11 != null; var11 = (class267) var7.field407.method2461(301)) {
            class184 var12 = class23.field309.method2364((byte) 118, var11.field3963);
            int var13 = var12.field2769;
            if (var12.field2768 == 1) {
                var13 = (var11.field3961 + 1) * var13;
            }
            if (var13 < var10) {
                class313.method1936(-63, arg2, var11);
                return;
            }
        }
        var7.field407.method2453((byte) -110, arg2);
    }

    static {
        new class332("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        new class332("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
