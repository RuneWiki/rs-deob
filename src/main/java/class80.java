import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class80 {

    @OriginalMember(owner = "client!os", name = "a", descriptor = "Z")
    public static boolean field1205 = true;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "Z")
    public static boolean field1209 = false;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "Lfn;")
    public static class52 field1211;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field1210;

    static {
        new class112((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field1211 = new class52(2, -1);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 3)
    public static void method551(int arg0) {
        field1211 = null;
        int var1 = 125 % ((arg0 - 1) / 49);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZBLqr;)V", line = 12)
    public static final void method552(boolean arg0, byte arg1, class23 arg2) {
        if (arg1 != 106) {
            method551(7);
        }
        field1207++;
        if (class161.field2310 >= 400 || class2.field21 == arg2) {
            return;
        }
        String var9;
        if (arg2.field422 == 0) {
            boolean var3 = true;
            if (class2.field21.field418 != -1 && arg2.field418 != -1) {
                int var4 = class2.field21.field392 <= arg2.field392 ? arg2.field392 : class2.field21.field392;
                int var5 = class2.field21.field418 < arg2.field418 ? class2.field21.field418 : arg2.field418;
                int var6 = var4 * 10 / 100 + var5 + 5;
                int var7 = class2.field21.field392 - arg2.field392;
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var7 > var6) {
                    var3 = false;
                }
            }
            String var8 = class307.field4208 == class172.field2553 ? class22.field375.method695(-128, class487.field6867) : class15.field262.method695(arg1 - 221, class487.field6867);
            if (arg2.field392 >= arg2.field416) {
                var9 = arg2.method207(102, true) + (var3 ? class417.method2433(class2.field21.field392, arg2.field392, -102) : "<col=ffffff>") + " (" + var8 + arg2.field392 + ")";
            } else {
                var9 = arg2.method207(arg1 - 19, true) + (var3 ? class417.method2433(class2.field21.field392, arg2.field392, -80) : "<col=ffffff>") + " (" + var8 + arg2.field392 + "+" + (arg2.field416 - arg2.field392) + ")";
            }
        } else {
            var9 = arg2.method207(117, true) + " (" + class82.field1231.method695(-115, class487.field6867) + arg2.field422 + ")";
        }
        if (class184.field2678) {
            if (!arg0 && (class416.field5733 & 0x8) != 0) {
                class250.field3507++;
                class225.method1415(false, 0, class357.field4981 + " -> <col=ffffff>" + var9, 0, 17, (long) arg2.field1119, class90.field1346, -1, class238.field3363, arg1 ^ 0x6A, true);
            }
        } else if (arg0) {
            class225.method1415(true, 0, "", 0, -1, 0L, -1, 0, "<col=cccccc>" + var9, 0, false);
        } else {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (class13.field207[var10] != null) {
                    short var11 = 0;
                    if (class305.field4173 == class172.field2553 && class13.field207[var10].equalsIgnoreCase(class115.field1623.method695(arg1 - 224, class487.field6867))) {
                        if (class2.field21.field392 < arg2.field392) {
                            var11 = 2000;
                        }
                        if (class2.field21.field383 != 0 && arg2.field383 != 0) {
                            if (class2.field21.field383 == arg2.field383) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (class43.field726[var10]) {
                        var11 = 2000;
                    }
                    short var12 = (short) (class237.field3350[var10] + var11);
                    int var13 = class155.field2231[var10] == -1 ? class19.field314 : class155.field2231[var10];
                    class338.field4631++;
                    class225.method1415(false, 0, "<col=ffffff>" + var9, 0, var12, (long) arg2.field1119, var13, -1, class13.field207[var10], 0, true);
                }
            }
        }
        if (arg0) {
            return;
        }
        for (class106 var14 = (class106) class250.field3514.method1544(arg1 ^ 0xFFFFFFCB); var14 != null; var14 = (class106) class250.field3514.method1546((byte) -42)) {
            if (var14.field1517 == 9) {
                var14.field1522 = "<col=ffffff>" + var9;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Llm;III)Lni;", line = 151)
    public static final class33 method553(class84 arg0, int arg1, int arg2, int arg3) {
        field1206++;
        int var4 = 39 % ((arg1 + 45) / 33);
        int var5 = arg3 << 8 | arg0.field1255;
        class33 var6 = (class33) class241.field3415.method1209(false, (long) var5 << 16);
        if (var6 != null) {
            return var6;
        }
        byte[] var7 = class451.field6193.method2038((byte) -58, class451.field6193.method2025((byte) 74, var5));
        if (var7 == null) {
            int var9 = arg0.field1255 | arg2 + 65536 << 8;
            class33 var10 = (class33) class241.field3415.method1209(false, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class451.field6193.method2038((byte) -58, class451.field6193.method2025((byte) 74, var9));
            if (var11 == null) {
                int var13 = arg0.field1255 | 0xFFFF00;
                class33 var14 = (class33) class241.field3415.method1209(false, (long) var13 << 16);
                if (var14 != null) {
                    return var14;
                }
                byte[] var15 = class451.field6193.method2038((byte) -58, class451.field6193.method2025((byte) 74, var13));
                if (var15 == null) {
                    return null;
                } else if (var15.length <= 1) {
                    return null;
                } else {
                    class33 var16 = class10.method102((byte) 30, var15);
                    var16.field539 = arg0;
                    class241.field3415.method1207(-1, (long) var13 << 16, var16);
                    return var16;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class33 var12 = class10.method102((byte) 30, var11);
                var12.field539 = arg0;
                class241.field3415.method1207(-1, (long) var9 << 16, var12);
                return var12;
            }
        } else if (var7.length <= 1) {
            return null;
        } else {
            class33 var8 = class10.method102((byte) 30, var7);
            var8.field539 = arg0;
            class241.field3415.method1207(-1, (long) var5 << 16, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([IIIII)V", line = 234)
    public static final void method554(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field1208++;
        arg4--;
        if (arg1 < 90) {
            return;
        }
        int var6 = arg3 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var12 = var11 + 1;
            arg0[var12] = arg2;
            int var13 = var12 + 1;
            arg0[var13] = arg2;
            arg4 = var13 + 1;
            arg0[arg4] = arg2;
        }
        while (arg4 < var6) {
            arg4++;
            arg0[arg4] = arg2;
        }
    }
}
