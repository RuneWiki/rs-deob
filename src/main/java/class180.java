import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class180 {

    @OriginalMember(owner = "client!js", name = "q", descriptor = "F")
    public float field2470 = 1.0F;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "F")
    public float field2456 = 0.25F;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "F")
    public float field2473 = 1.0F;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "F")
    public float field2466;

    @OriginalMember(owner = "client!js", name = "u", descriptor = "F")
    public float field2474;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "Lbm;")
    public class59 field2468;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!js", name = "s", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "F")
    public float field2469;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "[I")
    public static int[] field2464 = new int[500];

    @OriginalMember(owner = "client!js", name = "r", descriptor = "I")
    public static int field2471 = 1;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ldg;I)V")
    public final void method1213(class236 arg0, int arg1) {
        if (arg1 != 128) {
            method1216(29, 109);
        }
        field2467++;
        this.field2470 = (float) (arg0.method1574(-118) * 8) / 255.0F;
        this.field2456 = (float) (arg0.method1574(arg1 ^ 0xFFFFFF59) * 8) / 255.0F;
        this.field2473 = (float) (arg0.method1574(-117) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
    public static void method1214(boolean arg0) {
        if (!arg0) {
            field2471 = 50;
        }
        field2464 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljs;B)Z")
    public final boolean method1215(class180 arg0, byte arg1) {
        if (arg1 == -110) {
            field2460++;
            return this.field2472 == arg0.field2472 && this.field2466 == arg0.field2466 && this.field2469 == arg0.field2469 && this.field2474 == arg0.field2474 && this.field2456 == arg0.field2456 && this.field2470 == arg0.field2470 && this.field2473 == arg0.field2473 && this.field2461 == arg0.field2461 && this.field2458 == arg0.field2458 && this.field2468 == arg0.field2468;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
    public static final void method1216(int arg0, int arg1) {
        field2459++;
        if (arg1 <= 9) {
            return;
        }
        class360.field5134 = arg0;
        class237 var2 = class334.field4723;
        synchronized (class334.field4723) {
            class334.field4723.method1618(0);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lon;BII)V")
    public static final void method1217(class184 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > 93) {
            class148.field1821 = arg0;
            class211.field3004 = arg2;
            class204.field2932 = arg3;
            field2455++;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method1218(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != 15597) {
            method1217((class184) null, (byte) 41, 107, -73);
        }
        field2465++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg3[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class273.field3877[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
    public class180() {
        this.field2466 = 1.1523438F;
        this.field2474 = 1.2F;
        this.field2461 = class32.field371;
        this.field2458 = 0;
        this.field2468 = class335.field4740;
        this.field2457 = -60;
        this.field2472 = class39.field446;
        this.field2454 = -50;
        this.field2463 = -50;
        this.field2469 = 0.69921875F;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Ldg;)V")
    public class180(class236 arg0) {
        int var2 = arg0.method1574(-31);
        if (class272.field3859 && class305.field4288.method602() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field2472 = class39.field446;
            } else {
                this.field2472 = arg0.method1597(3641);
            }
            if ((var2 & 0x2) == 0) {
                this.field2466 = 1.1523438F;
            } else {
                this.field2466 = (float) arg0.method1617((byte) 48) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field2469 = 0.69921875F;
            } else {
                this.field2469 = (float) arg0.method1617((byte) 48) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field2474 = 1.2F;
            } else {
                this.field2474 = (float) arg0.method1617((byte) 48) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1597(3641);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1617((byte) 48);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1617((byte) 48);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1617((byte) 48);
            }
            this.field2474 = 1.2F;
            this.field2472 = class39.field446;
            this.field2469 = 0.69921875F;
            this.field2466 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2457 = -60;
            this.field2463 = -50;
            this.field2454 = -50;
        } else {
            this.field2463 = arg0.method1613(60);
            this.field2457 = arg0.method1613(109);
            this.field2454 = arg0.method1613(91);
        }
        if ((var2 & 0x20) == 0) {
            this.field2461 = class32.field371;
        } else {
            this.field2461 = arg0.method1597(3641);
        }
        if ((var2 & 0x40) == 0) {
            this.field2458 = 0;
        } else {
            this.field2458 = arg0.method1617((byte) 48);
        }
        if ((var2 & 0x80) == 0) {
            this.field2468 = class335.field4740;
        } else {
            this.field2468 = class274.method1808(arg0.method1617((byte) 48), arg0.method1617((byte) 48), arg0.method1617((byte) 48), arg0.method1617((byte) 48), arg0.method1617((byte) 48), 255, arg0.method1617((byte) 48));
        }
    }

    static {
        new class362("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }
}
