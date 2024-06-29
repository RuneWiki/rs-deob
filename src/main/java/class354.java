import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class354 extends class260 {

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public int field5185;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public int field5188;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public static int field5189 = 0;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "Lbm;")
    public static class75 field5187;

    static {
        new class466("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lco;BZ)V", line = 7)
    public static final void method2118(class77 arg0, byte arg1, boolean arg2) {
        field5186++;
        class93 var3 = arg0.method616((byte) -83);
        if (arg0.field1123 == 0) {
            arg0.field1118 = 0;
            class343.field4947 = -1;
            class455.field6698 = 0;
            return;
        }
        if (arg0.field1064 != -1 && arg0.field1037 == 0) {
            class104 var4 = class222.field3168.method126(-76, arg0.field1064);
            if (arg0.field1119 > 0 && var4.field1561 == 0) {
                class343.field4947 = -1;
                arg0.field1118++;
                class455.field6698 = 0;
                return;
            }
            if (arg0.field1119 <= 0 && var4.field1574 == 0) {
                class455.field6698 = 0;
                class343.field4947 = -1;
                arg0.field1118++;
                return;
            }
        }
        if (arg0.field1049 != -1 && class441.field6516 >= arg0.field1094) {
            class398 var5 = class27.field357.method1479(arg0.field1049, (byte) -121);
            if (var5.field5820 && var5.field5824 != -1) {
                class104 var6 = class222.field3168.method126(-88, var5.field5824);
                if (arg0.field1119 > 0 && var6.field1561 == 0) {
                    class455.field6698 = 0;
                    class343.field4947 = -1;
                    arg0.field1118++;
                    return;
                }
                if (arg0.field1119 <= 0 && var6.field1574 == 0) {
                    class455.field6698 = 0;
                    class343.field4947 = -1;
                    arg0.field1118++;
                    return;
                }
            }
        }
        if (arg0.field1049 != -1 && class441.field6516 >= arg0.field1094) {
            class398 var7 = class27.field357.method1479(arg0.field1049, (byte) -114);
            if (var7.field5820 && var7.field5824 != -1) {
                class104 var8 = class222.field3168.method126(-73, var7.field5824);
                if (arg0.field1119 > 0 && var8.field1561 == 0) {
                    class343.field4947 = -1;
                    class455.field6698 = 0;
                    arg0.field1118++;
                    return;
                }
                if (arg0.field1119 <= 0 && var8.field1574 == 0) {
                    class455.field6698 = 0;
                    arg0.field1118++;
                    class343.field4947 = -1;
                    return;
                }
            }
        }
        int var9 = arg0.field1732;
        int var10 = arg0.field1735;
        if (arg1 <= 16) {
            return;
        }
        int var11 = arg0.field1127[arg0.field1123 - 1] * 128 + arg0.method626((byte) 120) * 64;
        int var12 = arg0.field1117[arg0.field1123 - 1] * 128 + arg0.method626((byte) 120) * 64;
        if (var9 >= var11) {
            if (var11 >= var9) {
                if (var12 > var10) {
                    arg0.method619(-18477, 8192);
                } else if (var10 > var12) {
                    arg0.method619(-18477, 0);
                }
            } else if (var10 < var12) {
                arg0.method619(-18477, 6144);
            } else if (var12 >= var10) {
                arg0.method619(-18477, 4096);
            } else {
                arg0.method619(-18477, 2048);
            }
        } else if (var10 < var12) {
            arg0.method619(-18477, 10240);
        } else if (var12 < var10) {
            arg0.method619(-18477, 14336);
        } else {
            arg0.method619(-18477, 12288);
        }
        byte var13 = arg0.field1121[arg0.field1123 - 1];
        if (!arg2 && (var11 - var9 > 256 || (var11 - var9) < -256 || (var12 - var10) > 256 || var12 - var10 < -256)) {
            arg0.field1735 = var12;
            arg0.field1732 = var11;
            arg0.method612((byte) -102, arg0.field1060);
            arg0.field1123--;
            class455.field6698 = 0;
            class343.field4947 = -1;
            if (arg0.field1119 > 0) {
                arg0.field1119--;
            }
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg0 instanceof class502) {
            var15 = ((class502) arg0).field7387.field1212;
        }
        if (var15) {
            int var16 = arg0.field1060 - arg0.field1085.field1453;
            if (var16 != 0 && arg0.field1069 == -1 && arg0.field1036 != 0) {
                var14 = 2;
            }
            if (!arg2 && arg0.field1123 > 2) {
                var14 = 6;
            }
            if (!arg2 && arg0.field1123 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg2 && arg0.field1123 > 1) {
                var14 = 6;
            }
            if (!arg2 && arg0.field1123 > 2) {
                var14 = 8;
            }
        }
        if (arg0.field1118 > 0 && arg0.field1123 > 1) {
            var14 = 8;
            arg0.field1118--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class455.field6698 = 0;
        if (var3.field1369 != -1) {
            int var17 = var14 << 7;
            if (arg0.field1123 == 1) {
                int var18 = arg0.field1122 * arg0.field1122;
                int var19 = (var11 >= arg0.field1732 ? var11 - arg0.field1732 : -var11 + arg0.field1732) << 7;
                int var20 = (arg0.field1735 <= var12 ? var12 - arg0.field1735 : -var12 + arg0.field1735) << 7;
                int var21 = var20 < var19 ? var19 : var20;
                int var22 = var3.field1369 * var21 * 2;
                if (var22 < var18) {
                    arg0.field1122 /= 2;
                } else if (var18 / 2 > var21) {
                    arg0.field1122 -= var3.field1369;
                    if (arg0.field1122 < 0) {
                        arg0.field1122 = 0;
                    }
                } else if (var17 > arg0.field1122) {
                    arg0.field1122 += var3.field1369;
                    if (arg0.field1122 > var17) {
                        arg0.field1122 = var17;
                    }
                }
            } else if (arg0.field1122 < var17) {
                arg0.field1122 += var3.field1369;
                if (arg0.field1122 > var17) {
                    arg0.field1122 = var17;
                }
            } else if (arg0.field1122 > 0) {
                arg0.field1122 -= var3.field1369;
                if (arg0.field1122 < 0) {
                    arg0.field1122 = 0;
                }
            }
            var14 = arg0.field1122 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var9 < var11) {
            class455.field6698 |= 0x4;
            arg0.field1732 += var14;
            if (arg0.field1732 > var11) {
                arg0.field1732 = var11;
            }
        } else if (var9 > var11) {
            class455.field6698 |= 0x8;
            arg0.field1732 -= var14;
            if (var11 > arg0.field1732) {
                arg0.field1732 = var11;
            }
        }
        if (var10 < var12) {
            arg0.field1735 += var14;
            class455.field6698 |= 0x1;
            if (arg0.field1735 > var12) {
                arg0.field1735 = var12;
            }
        } else if (var10 > var12) {
            arg0.field1735 -= var14;
            class455.field6698 |= 0x2;
            if (var12 > arg0.field1735) {
                arg0.field1735 = var12;
            }
        }
        if (var14 >= 8) {
            class343.field4947 = 2;
        } else {
            class343.field4947 = var13;
        }
        if (arg0.field1732 == var11 && arg0.field1735 == var12) {
            if (arg0.field1119 > 0) {
                arg0.field1119--;
            }
            arg0.field1123--;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILmg;)V", line = 343)
    public static final void method2119(int arg0, class101 arg1) {
        if (arg0 == 2048) {
            class30.field400 = arg1;
            field5184++;
        }
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)V", line = 359)
    public static void method2120(int arg0) {
        field5187 = null;
        if (arg0 <= 116) {
            method2119(70, null);
        }
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(II)V", line = 369)
    public class354(int arg0, int arg1) {
        this.field5185 = arg1;
        this.field5188 = arg0;
    }
}
