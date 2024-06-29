import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class379 extends class4 {

    @OriginalMember(owner = "client!at", name = "A", descriptor = "Lio;")
    public class711 field5428;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "[I")
    public static int[] field5420 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!at", name = "z", descriptor = "[I")
    public static int[] field5427 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!at", name = "x", descriptor = "F")
    public static float field5425;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!at", name = "B", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "Lsg;")
    public static class17 field5426;

    // $FF: synthetic field
    @OriginalMember(owner = "client!at", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field5430;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method2374(int arg0) {
        field5427 = null;
        field5420 = null;
        field5426 = null;
        if (arg0 > -124) {
            field5420 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 17094) {
            return;
        }
        field5419++;
        if (arg6 < 0 || arg2 < 0 || (class277.field4036 - 1) <= arg6 || (class667.field9202 - 1) <= arg2) {
            return;
        }
        if (class137.field1948 == null) {
            return;
        }
        if (arg3 == 0) {
            class722 var8 = (class722) class376.method2357(arg1, arg6, arg2);
            class722 var9 = (class722) class310.method2040(arg1, arg6, arg2);
            if (var8 != null && arg0 != 2) {
                if ((var8 instanceof class746)) {
                    ((class746) var8).field10265.method3984(arg7, true);
                } else {
                    class193.method1201(arg7, var8.method782((byte) 91), arg1, arg4, arg6, arg2, arg3, (byte) 115, arg0);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class746)) {
                    class193.method1201(arg7, var9.method782((byte) 75), arg1, arg4, arg6, arg2, arg3, (byte) -72, arg0);
                    return;
                }
                ((class746) var9).field10265.method3984(arg7, true);
                return;
            }
            return;
        }
        if (arg3 != 1) {
            if (arg3 == 2) {
                class722 var11 = (class722) class141.method932(arg1, arg6, arg2, field5430 == null ? (field5430 = method2380("bda")) : field5430);
                if (var11 == null) {
                    return;
                }
                if (arg0 == 11) {
                    arg0 = 10;
                }
                if (var11 instanceof class352) {
                    ((class352) var11).field5081.method3984(arg7, true);
                    return;
                }
                class193.method1201(arg7, var11.method782((byte) -72), arg1, arg4, arg6, arg2, arg3, (byte) -89, arg0);
            } else if (arg3 == 3) {
                class722 var10 = (class722) class134.method851(arg1, arg6, arg2);
                if (var10 != null) {
                    if (!(var10 instanceof class129)) {
                        class193.method1201(arg7, var10.method782((byte) 88), arg1, arg4, arg6, arg2, arg3, (byte) 127, arg0);
                        return;
                    }
                    ((class129) var10).field1775.method3984(arg7, true);
                    return;
                }
            }
            return;
        }
        class722 var12 = (class722) class540.method3199(arg1, arg6, arg2);
        if (var12 == null) {
            return;
        }
        if (!(var12 instanceof class279)) {
            int var13 = var12.method782((byte) -87);
            if (arg0 == 4 || arg0 == 5) {
                class193.method1201(arg7, var13, arg1, arg4, arg6, arg2, arg3, (byte) 125, 4);
            } else if (arg0 == 6) {
                class193.method1201(arg7, var13, arg1, arg4 + 4, arg6, arg2, arg3, (byte) -26, 4);
                return;
            } else if (arg0 == 7) {
                class193.method1201(arg7, var13, arg1, (arg4 + 2 & 0x3) + 4, arg6, arg2, arg3, (byte) 9, 4);
                return;
            } else if (arg0 == 8) {
                class193.method1201(arg7, var13, arg1, arg4 + 4, arg6, arg2, arg3, (byte) 120, 4);
                class193.method1201(arg7, var13, arg1, (arg4 + 2 & 0x3) + 4, arg6, arg2, arg3, (byte) 127, 4);
                return;
            }
            return;
        }
        ((class279) var12).field4042.method3984(arg7, true);
        return;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "([BBII)Ljava/lang/String;")
    public static final String method2376(byte[] arg0, byte arg1, int arg2, int arg3) {
        field5429++;
        if (arg1 != -116) {
            field5425 = 0.37126303F;
        }
        char[] var4 = new char[arg2];
        int var5 = 0;
        int var6 = arg3;
        int var7 = arg2 + arg3;
        while (var7 > var6) {
            int var8 = arg0[var6++] & 0xFF;
            int var9;
            if (var8 < 128) {
                if (var8 == 0) {
                    var9 = 65533;
                } else {
                    var9 = var8;
                }
            } else if (var8 < 192) {
                var9 = 65533;
            } else if (var8 < 224) {
                if (var6 < var7 && (arg0[var6] & 0xC0) == 128) {
                    var9 = arg0[var6++] & 0x3F | (var8 & 0x1F) << 6;
                    if (var9 < 128) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 < 240) {
                if (var7 > (var6 + 1) && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128) {
                    var9 = var8 & 0xF << 12 | arg0[var6++] << 6 & 0xFC0 | arg0[var6++] & 0x3F;
                    if (var9 < 2048) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 >= 248) {
                var9 = 65533;
            } else if ((var6 + 2) < var7 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128 && (arg0[var6 + 2] & 0xC0) == 128) {
                int var10 = var8 & 0x7 << 18 | (arg0[var6++] & 0x3F) << 12 | (arg0[var6++] & 0x3F) << 6 | arg0[var6++] & 0x3F;
                if (var10 >= 65536 && var10 <= 1114111) {
                    var9 = 65533;
                } else {
                    var9 = 65533;
                }
            } else {
                var9 = 65533;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lco;I)V")
    public static final void method2377(class725 arg0, int arg1) {
        field5424++;
        if (arg0.field10053 != null) {
            arg0.field10053.field8574 = 0;
        }
        if (arg1 != 0) {
            field5427 = null;
        }
        arg0.field10051 = false;
        for (class725 var2 = arg0.method358(); var2 != null; var2 = arg0.method357()) {
            method2377(var2, 0);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BLni;III)V")
    public static final void method2378(byte arg0, class515 arg1, int arg2, int arg3, int arg4) {
        field5421++;
        if (arg0 <= 126) {
            return;
        }
        class32 var5 = arg1.method3084((byte) -92);
        int var6 = arg1.field7189 - arg1.field7125.field365 & 0x3FFF;
        if (arg3 == -1) {
            if (var6 != 0 || arg1.field7168 > 25) {
                if (arg4 < 0 && var5.field430 != -1) {
                    arg1.field7165 = false;
                    arg1.field7159 = var5.field430;
                } else if (arg4 <= 0 || var5.field397 == -1) {
                    arg1.field7159 = var5.field412;
                } else {
                    arg1.field7159 = var5.field397;
                }
                arg1.field7165 = false;
            } else if (!arg1.field7165 || !var5.method176(110, arg1.field7159)) {
                arg1.field7159 = var5.method180(-103);
                arg1.field7165 = arg1.field7159 != -1;
            }
        } else if (arg1.field7122 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class729.field10154[arg2] - arg1.field7125.field365 & 0x3FFF;
            if (arg3 == 2 && var5.field420 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field398 != -1) {
                    arg1.field7159 = var5.field398;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field414 != -1) {
                    arg1.field7159 = var5.field414;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field379 == -1) {
                    arg1.field7159 = var5.field420;
                } else {
                    arg1.field7159 = var5.field379;
                }
            } else if (arg3 == 0 && var5.field407 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field418 != -1) {
                    arg1.field7159 = var5.field418;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field421 != -1) {
                    arg1.field7159 = var5.field421;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field415 == -1) {
                    arg1.field7159 = var5.field407;
                } else {
                    arg1.field7159 = var5.field415;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field409 != -1) {
                arg1.field7159 = var5.field409;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field401 != -1) {
                arg1.field7159 = var5.field401;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field384 == -1) {
                arg1.field7159 = var5.field412;
            } else {
                arg1.field7159 = var5.field384;
            }
            arg1.field7165 = false;
        } else if (var6 == 0 && arg1.field7168 <= 25) {
            arg1.field7165 = false;
            if (arg3 == 2 && var5.field420 != -1) {
                arg1.field7159 = var5.field420;
            } else if (arg3 == 0 && var5.field407 != -1) {
                arg1.field7159 = var5.field407;
            } else {
                arg1.field7159 = var5.field412;
            }
        } else {
            arg1.field7165 = false;
            if (arg3 == 2 && var5.field420 != -1) {
                if (arg4 < 0 && var5.field389 != -1) {
                    arg1.field7159 = var5.field389;
                } else if (arg4 <= 0 || var5.field406 == -1) {
                    arg1.field7159 = var5.field420;
                } else {
                    arg1.field7159 = var5.field406;
                }
            } else if (arg3 == 0 && var5.field407 != -1) {
                if (arg4 < 0 && var5.field383 != -1) {
                    arg1.field7159 = var5.field383;
                } else if (arg4 <= 0 || var5.field381 == -1) {
                    arg1.field7159 = var5.field407;
                } else {
                    arg1.field7159 = var5.field381;
                }
            } else if (arg4 < 0 && var5.field417 != -1) {
                arg1.field7159 = var5.field417;
            } else if (arg4 <= 0 || var5.field382 == -1) {
                arg1.field7159 = var5.field412;
            } else {
                arg1.field7159 = var5.field382;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Z")
    public static final boolean method2379(int arg0, int arg1) {
        if (arg0 > -126) {
            return false;
        } else {
            field5423++;
            return arg1 == 10 || arg1 == 11 || arg1 == 12;
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lio;)V")
    public class379(class711 arg0) {
        this.field5428 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2380(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
