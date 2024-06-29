import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class167 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lni;")
    public static class367 field2253 = new class367(25, 15);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 14)
    public static void method1132(byte arg0) {
        if (arg0 == -15) {
            field2253 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 24)
    public static final void method1133(boolean arg0) {
        field2254++;
        for (int var1 = 0; var1 < class303.field4434; var1++) {
            class153 var2 = class475.field7049[var1];
            boolean var3 = false;
            if (var2.field1997 == null) {
                var2.field1998--;
                if ((var2.field2002 == 2 ? -1500 : -10) > var2.field1998) {
                    var3 = true;
                } else {
                    if (var2.field2002 == 1 && var2.field1999 == null) {
                        var2.field1999 = class314.method1976(class149.field1964, var2.field2000, 0);
                        if (var2.field1999 == null) {
                            continue;
                        }
                        var2.field1998 += var2.field1999.method1975();
                    } else if (var2.field2002 == 2 && (var2.field1994 == null || var2.field2001 == null)) {
                        if (var2.field1994 == null) {
                            var2.field1994 = class494.method2951(class359.field5511, var2.field2000);
                        }
                        if (var2.field1994 == null) {
                            continue;
                        }
                        if (var2.field2001 == null) {
                            var2.field2001 = var2.field1994.method2947(new int[] { 22050 });
                            if (var2.field2001 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field1998 < 0) {
                        int var11;
                        if (var2.field1996 == 0) {
                            var11 = class203.field2716.field1173 * var2.field1995 >> 8;
                        } else {
                            int var4 = (var2.field1996 & 0x3654B5E) >> 24;
                            if (class56.field800.field1866 == var4) {
                                int var5 = (var2.field1996 & 0xFF) << 7;
                                int var6 = (var2.field1996 & 0xFF2BEB) >> 16;
                                int var7 = (var6 << 7) + 64 - class56.field800.field1867;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = var2.field1996 >> 8 & 0xFF;
                                int var9 = (var8 << 7) + 64 - class56.field800.field1862;
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 128;
                                if (var5 < var10) {
                                    var2.field1998 = -99999;
                                    continue;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var11 = (var5 - var10) * class203.field2716.field1183 * var2.field1995 / var5 >> 8;
                            } else {
                                var11 = 0;
                            }
                        }
                        if (var11 > 0) {
                            class242 var12 = null;
                            if (var2.field2002 == 1) {
                                var12 = var2.field1999.method1977().method1588(class533.field7840);
                            } else if (var2.field2002 == 2) {
                                var12 = var2.field2001;
                            }
                            class481 var13 = var2.field1997 = class481.method2883(var12, 100, var11);
                            var13.method2869(var2.field1993 - 1);
                            class31.field463.method879(var13);
                        }
                    }
                }
            } else if (!var2.field1997.method24(-25618)) {
                var3 = true;
            }
            if (var3) {
                class303.field4434--;
                for (int var14 = var1; var14 < class303.field4434; var14++) {
                    class475.field7049[var14] = class475.field7049[var14 + 1];
                }
                var1--;
            }
        }
        if (class539.field7905 && !class429.method2622(-1)) {
            if (class203.field2716.field1157 != 0 && class513.field7536 != -1) {
                class448.method2736(0, class513.field7536, 0, false, class162.field2111, class203.field2716.field1157);
            }
            class539.field7905 = false;
        } else if (class203.field2716.field1157 != 0 && class513.field7536 != -1 && !class429.method2622(-1)) {
            class424.method2582(class120.field1646, -1);
            class404.field6126++;
            class538.field7879.method1073(326170192, class513.field7536);
            class513.field7536 = -1;
        }
        if (!arg0) {
            method1132((byte) 56);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z", line = 195)
    public static final boolean method1134(int arg0, int arg1, int arg2) {
        field2255++;
        if (class179.method1200(arg0 - 85, arg1, arg2)) {
            if (arg0 != 55) {
                method1133(false);
            }
            return (arg2 & 0xB000) != 0 | class17.method165(arg2, 0, arg1) | class465.method2800(arg1, arg2, -123) ? true : (class24.method226(false, arg1, arg2) | class63.method449(arg1, -3463, arg2)) & (arg1 & 0x37) == 0;
        } else {
            return false;
        }
    }
}
