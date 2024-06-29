import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class217 {

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "Z")
    public boolean field3125 = false;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    private int field3136 = 0;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    private int field3132 = 128;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    private int field3141 = 0;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    private int field3138 = 128;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public int field3129 = -1;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Z")
    public boolean field3128 = false;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    private int field3127 = 0;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "[I")
    public static int[] field3135;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Lap;")
    public static class310 field3131;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    private int field3130;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Lno;")
    public class238 field3133;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cl", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field3146;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "Z")
    public static boolean field3139;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "[I")
    public static int[] field3142;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "[S")
    private short[] field3124;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "[S")
    private short[] field3140;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "[S")
    private short[] field3143;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "[S")
    private short[] field3144;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static void method1494(int arg0) {
        field3142 = null;
        field3135 = null;
        if (arg0 >= 59) {
            field3131 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BIIILvk;Lvc;I)Ln;")
    public final class468 method1495(byte arg0, int arg1, int arg2, int arg3, class276 arg4, class89 arg5, int arg6) {
        field3145++;
        int var8 = 105 / ((-arg0 - 59) / 58);
        int var9 = arg2;
        class303 var10 = this.field3129 == -1 || arg1 == -1 ? null : arg4.method1856(16, this.field3129);
        if (var10 != null) {
            var9 = arg2 | var10.method1950(false, -13533, arg3, arg1);
        }
        if (this.field3138 != 128) {
            var9 |= 0x2;
        }
        if (this.field3132 != 128 || this.field3136 != 0) {
            var9 |= 0x5;
        }
        class336 var11 = this.field3133.field3491;
        class468 var12;
        synchronized (this.field3133.field3491) {
            var12 = (class468) this.field3133.field3491.method2113(0, (long) (this.field3126 |= arg5.field1262 << 29));
        }
        if (var12 == null || arg5.method362(var12.method1574(), var9) != 0) {
            if (var12 != null) {
                var9 = arg5.method355(var9, var12.method1574());
            }
            int var13 = var9;
            if (this.field3143 != null) {
                var13 = var9 | 0x2000;
            }
            if (this.field3144 != null) {
                var13 |= 0x4000;
            }
            class430 var14 = class424.method2521(this.field3133.field3488, this.field3130, (byte) 39, 0);
            if (var14 == null) {
                return null;
            }
            var12 = arg5.method327(var14, var13, this.field3133.field3492, this.field3141 + 64, this.field3127 + 850);
            if (this.field3143 != null) {
                for (int var15 = 0; var15 < this.field3143.length; var15++) {
                    var12.method1615(this.field3143[var15], this.field3140[var15]);
                }
            }
            if (this.field3144 != null) {
                for (int var16 = 0; var16 < this.field3144.length; var16++) {
                    var12.method1575(this.field3144[var16], this.field3124[var16]);
                }
            }
            var12.method1588(var9);
            class336 var17 = this.field3133.field3491;
            synchronized (this.field3133.field3491) {
                this.field3133.field3491.method2116((long) (this.field3126 |= arg5.field1262 << 29), (byte) -58, var12);
            }
        }
        class468 var18 = var10 == null ? var12.method1600((byte) 2, var9, true) : var10.method1945(var9, var12, (byte) 2, 0, arg6, (byte) -67, arg1, arg3);
        if (this.field3132 != 128 || this.field3138 != 128) {
            var18.method1562(this.field3132, this.field3138, this.field3132);
        }
        if (this.field3136 != 0) {
            if (this.field3136 == 90) {
                var18.method1578(4096);
            }
            if (this.field3136 == 180) {
                var18.method1578(8192);
            }
            if (this.field3136 == 270) {
                var18.method1578(12288);
            }
        }
        var18.method1588(arg2);
        return var18;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lve;B)V")
    public static final void method1496(class399 arg0, byte arg1) {
        field3137++;
        if (class385.field5285 == null) {
            return;
        }
        class210 var2 = null;
        if (arg0.field5478 == 0) {
            var2 = (class210) class133.method991(arg0.field5475, arg0.field5474, arg0.field5482);
        }
        if (arg0.field5478 == 1) {
            var2 = (class210) class418.method2504(arg0.field5475, arg0.field5474, arg0.field5482);
        }
        if (arg0.field5478 == 2) {
            var2 = (class210) class106.method847(arg0.field5475, arg0.field5474, arg0.field5482, field3146 == null ? (field3146 = method1499("dc")) : field3146);
        }
        if (arg0.field5478 == 3) {
            var2 = (class210) class86.method730(arg0.field5475, arg0.field5474, arg0.field5482);
        }
        if (var2 == null) {
            arg0.field5483 = -1;
            arg0.field5468 = 0;
            arg0.field5472 = 0;
        } else {
            arg0.field5483 = var2.method80(10143);
            arg0.field5472 = var2.method83((byte) 104);
            arg0.field5468 = var2.method71((byte) 124);
        }
        if (arg1 > -6) {
            field3135 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILkk;)V")
    public final void method1497(int arg0, class161 arg1) {
        field3123++;
        while (true) {
            int var3 = arg1.method1172((byte) -113);
            if (var3 == 0) {
                if (arg0 <= 45) {
                    method1496((class399) null, (byte) -69);
                    return;
                } else {
                    return;
                }
            }
            this.method1498(-114, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILkk;I)V")
    private final void method1498(int arg0, class161 arg1, int arg2) {
        field3134++;
        if (arg2 == 1) {
            this.field3130 = arg1.method1134(-16848);
        } else if (arg2 == 2) {
            this.field3129 = arg1.method1134(-16848);
        } else if (arg2 == 4) {
            this.field3132 = arg1.method1134(-16848);
        } else if (arg2 == 5) {
            this.field3138 = arg1.method1134(-16848);
        } else if (arg2 == 6) {
            this.field3136 = arg1.method1134(-16848);
        } else if (arg2 == 7) {
            this.field3141 = arg1.method1172((byte) -128);
        } else if (arg2 == 8) {
            this.field3127 = arg1.method1172((byte) 127);
        } else if (arg2 == 9) {
            this.field3125 = true;
        } else if (arg2 == 10) {
            this.field3128 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1172((byte) 59);
            this.field3140 = new short[var6];
            this.field3143 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3143[var7] = (short) arg1.method1134(-16848);
                this.field3140[var7] = (short) arg1.method1134(-16848);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1172((byte) 90);
            this.field3144 = new short[var4];
            this.field3124 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3144[var5] = (short) arg1.method1134(-16848);
                this.field3124[var5] = (short) arg1.method1134(-16848);
            }
        }
        if (arg0 >= -33) {
            this.method1497(120, (class161) null);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1499(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class151("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field3135 = new int[100];
        field3131 = new class310(8, 8);
    }
}
