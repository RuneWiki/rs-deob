import jaclib.memory.Buffer;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class643 extends class558 implements class512 {

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Llc;")
    private class629 field9334;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "Lqp;")
    public static class586 field9331 = new class586(98, -2);

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Lwu;")
    public static class500 field9339;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field9338;

    static {
        new class487("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        new class487("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        new class487("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field9339 = new class500("LIVE", 0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V", line = 3)
    public final void method409(boolean arg0) {
        super.method409(arg0);
        field9333++;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(B)V", line = 11)
    public static void method3721(byte arg0) {
        field9339 = null;
        int var1 = 29 / ((76 - arg0) / 44);
        field9331 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 22)
    public final Buffer method410(boolean arg0, byte arg1) {
        if (arg1 != -56) {
            this.field9334 = null;
        }
        field9336++;
        return super.method410(arg0, (byte) -56);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)I", line = 49)
    public final int method404(int arg0) {
        field9335++;
        if (arg0 != -4469) {
            this.method404(-5);
        }
        return super.method404(-4469);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V", line = 65)
    public final void method464(boolean arg0, int arg1) {
        field9337++;
        super.method464(arg0, this.field9334.field9202 * arg1);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lqba;Llc;Z)V", line = 75)
    public class643(class540 arg0, class629 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field9334 = arg1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIILuf;I)Ljava/awt/Frame;", line = 86)
    public static final Frame method3722(int arg0, int arg1, int arg2, int arg3, class353 arg4, int arg5) {
        if (arg3 < 97) {
            field9339 = null;
        }
        field9338++;
        if (!arg4.method2178((byte) -120)) {
            return null;
        }
        if (arg2 == 0) {
            class155[] var6 = class455.method2732(-3, arg4);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1981 == arg1 && var6[var8].field1982 == arg0 && (arg5 == 0 || var6[var8].field1987 == arg5) && (!var7 || var6[var8].field1985 > arg2)) {
                    arg2 = var6[var8].field1985;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class286 var9 = arg4.method2162(arg2, arg5, (byte) 118, arg1, arg0);
        while (var9.field4208 == 0) {
            class428.method2624(1, 10L);
        }
        Frame var10 = (Frame) var9.field4213;
        if (var10 == null) {
            return null;
        } else if (var9.field4208 == 2) {
            class470.method2864(arg4, var10, 0);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Llc;", line = 159)
    public final class629 method465(byte arg0) {
        field9330++;
        if (arg0 != -62) {
            this.method409(false);
        }
        return this.field9334;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z", line = 180)
    public final boolean method411(int arg0) {
        field9332++;
        int var2 = -114 / ((39 - arg0) / 62);
        return super.method411(125);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)Z", line = 205)
    public static final boolean method3723(int arg0, int arg1, int arg2, int arg3) {
        if (!class239.method1539(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class179.field2726;
        int var5 = arg2 << class179.field2726;
        int var6 = class235.field3455[arg0].method1319(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class179.field2726 - 7);
        int var8 = var6 - (0xE6 << class179.field2726 - 7);
        int var9 = var6 - (0xEE << class179.field2726 - 7);
        if (arg3 == 1) {
            if (var4 > class100.field1278) {
                if (!class313.method1924(var4, var6, var5)) {
                    return false;
                }
                if (!class313.method1924(var4, var6, class605.field8913 + var5)) {
                    return false;
                }
                if (!class313.method1924(var4, var6, class177.field2692 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class313.method1924(var4, var7, var5)) {
                    return false;
                }
                if (!class313.method1924(var4, var7, class605.field8913 + var5)) {
                    return false;
                }
                if (!class313.method1924(var4, var7, class177.field2692 + var5)) {
                    return false;
                }
            }
            if (!class313.method1924(var4, var8, var5)) {
                return false;
            } else if (class313.method1924(var4, var8, class605.field8913 + var5)) {
                return class313.method1924(var4, var8, class177.field2692 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class420.field6034) {
                if (!class313.method1924(var4, var6, class177.field2692 + var5)) {
                    return false;
                }
                if (!class313.method1924(class605.field8913 + var4, var6, class177.field2692 + var5)) {
                    return false;
                }
                if (!class313.method1924(class177.field2692 + var4, var6, class177.field2692 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class313.method1924(var4, var7, class177.field2692 + var5)) {
                    return false;
                }
                if (!class313.method1924(class605.field8913 + var4, var7, class177.field2692 + var5)) {
                    return false;
                }
                if (!class313.method1924(class177.field2692 + var4, var7, class177.field2692 + var5)) {
                    return false;
                }
            }
            if (!class313.method1924(var4, var8, class177.field2692 + var5)) {
                return false;
            } else if (class313.method1924(class605.field8913 + var4, var8, class177.field2692 + var5)) {
                return class313.method1924(class177.field2692 + var4, var8, class177.field2692 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class100.field1278) {
                if (!class313.method1924(class177.field2692 + var4, var6, var5)) {
                    return false;
                }
                if (!class313.method1924(class177.field2692 + var4, var6, class605.field8913 + var5)) {
                    return false;
                }
                if (!class313.method1924(class177.field2692 + var4, var6, class177.field2692 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class313.method1924(class177.field2692 + var4, var7, var5)) {
                    return false;
                }
                if (!class313.method1924(class177.field2692 + var4, var7, class605.field8913 + var5)) {
                    return false;
                }
                if (!class313.method1924(class177.field2692 + var4, var7, class177.field2692 + var5)) {
                    return false;
                }
            }
            if (!class313.method1924(class177.field2692 + var4, var8, var5)) {
                return false;
            } else if (class313.method1924(class177.field2692 + var4, var8, class605.field8913 + var5)) {
                return class313.method1924(class177.field2692 + var4, var8, class177.field2692 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class420.field6034) {
                if (!class313.method1924(var4, var6, var5)) {
                    return false;
                }
                if (!class313.method1924(class605.field8913 + var4, var6, var5)) {
                    return false;
                }
                if (!class313.method1924(class177.field2692 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class313.method1924(var4, var7, var5)) {
                    return false;
                }
                if (!class313.method1924(class605.field8913 + var4, var7, var5)) {
                    return false;
                }
                if (!class313.method1924(class177.field2692 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class313.method1924(var4, var8, var5)) {
                return false;
            } else if (class313.method1924(class605.field8913 + var4, var8, var5)) {
                return class313.method1924(class177.field2692 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class313.method1924(class605.field8913 + var4, var9, class605.field8913 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class313.method1924(var4, var8, class177.field2692 + var5);
        } else if (arg3 == 32) {
            return class313.method1924(class177.field2692 + var4, var8, class177.field2692 + var5);
        } else if (arg3 == 64) {
            return class313.method1924(class177.field2692 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class313.method1924(var4, var8, var5);
        } else {
            return true;
        }
    }
}
