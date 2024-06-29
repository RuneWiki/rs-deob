import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class38 {

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public int field547 = -1;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "Z")
    public boolean field555 = false;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    private int field553 = 0;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    private int field551 = 0;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    private int field562 = 128;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    private int field550 = 128;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "Z")
    public boolean field563 = false;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    private int field572 = 0;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
    public static int field564 = 0;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
    public static int field569 = 0;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "Z")
    public static boolean field558 = false;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field552 = -1;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lbi;")
    public static class215 field542;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "Ljm;")
    public static class314 field561;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "Ljd;")
    public static class95 field571;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[S")
    private short[] field544;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "[S")
    private short[] field546;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "[S")
    private short[] field549;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "[S")
    private short[] field560;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V", line = 5)
    public static void method289(boolean arg0) {
        field561 = null;
        field571 = null;
        if (arg0) {
            method295(-101);
        }
        field542 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILwm;)V", line = 40)
    private final void method290(int arg0, int arg1, class254 arg2) {
        field570++;
        if (arg0 != 0) {
            method294(false, -85, 125, -87, (class345[]) null, (byte[]) null);
        }
        if (arg1 == 1) {
            this.field545 = arg2.method1755(false);
        } else if (arg1 == 2) {
            this.field547 = arg2.method1755(false);
        } else if (arg1 == 4) {
            this.field562 = arg2.method1755(false);
        } else if (arg1 == 5) {
            this.field550 = arg2.method1755(false);
        } else if (arg1 == 6) {
            this.field553 = arg2.method1755(false);
        } else if (arg1 == 7) {
            this.field572 = arg2.method1774((byte) -126);
        } else if (arg1 == 8) {
            this.field551 = arg2.method1774((byte) -117);
        } else if (arg1 == 9) {
            this.field555 = true;
        } else if (arg1 == 10) {
            this.field563 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method1774((byte) 36);
            this.field546 = new short[var4];
            this.field544 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field544[var5] = (short) arg2.method1755(false);
                this.field546[var5] = (short) arg2.method1755(false);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method1774((byte) -91);
            this.field549 = new short[var6];
            this.field560 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field549[var7] = (short) arg2.method1755(false);
                this.field560[var7] = (short) arg2.method1755(false);
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)V", line = 126)
    public static final void method291(byte arg0, int arg1) {
        if (arg0 == 47) {
            field541++;
            class149.field2251.method741(arg1, (byte) -33);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)Lr;", line = 139)
    public final class74 method292(int arg0, int arg1, int arg2, int arg3) {
        field567++;
        class74 var5 = (class74) class240.field3655.method747((long) this.field568, (byte) 104);
        if (var5 == null) {
            class128 var6 = class128.method956(class262.field4031, this.field545, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field544 != null) {
                for (int var7 = 0; var7 < this.field544.length; var7++) {
                    var6.method978(this.field544[var7], this.field546[var7]);
                }
            }
            if (this.field549 != null) {
                for (int var8 = 0; var8 < this.field549.length; var8++) {
                    var6.method970(this.field549[var8], this.field560[var8]);
                }
            }
            var5 = var6.method967(this.field572 + 64, this.field551 + 850, -30, -50, -30);
            class240.field3655.method744(var5, arg2 ^ 0xFFFFC2EE, (long) this.field568);
        }
        class74 var9;
        if (this.field547 == -1 || arg3 == -1) {
            var9 = var5.method591(true, true, true);
        } else {
            var9 = client.method1010(this.field547, (byte) 104).method207(false, arg0, arg1, arg3, var5);
        }
        if (arg2 != 90) {
            return (class74) null;
        }
        if (this.field562 != 128 || this.field550 != 128) {
            var9.method588(this.field562, this.field550, this.field562);
        }
        if (this.field553 != 0) {
            if (this.field553 == 90) {
                var9.method574();
            }
            if (this.field553 == 180) {
                var9.method573();
            }
            if (this.field553 == 270) {
                var9.method570();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lwm;Z)V", line = 217)
    public final void method293(class254 arg0, boolean arg1) {
        if (arg1) {
            this.method292(-47, 110, -83, 26);
        }
        while (true) {
            int var3 = arg0.method1774((byte) -102);
            if (var3 == 0) {
                field566++;
                return;
            }
            this.method290(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZIII[Lf;[B)V", line = 269)
    public static final void method294(boolean arg0, int arg1, int arg2, int arg3, class345[] arg4, byte[] arg5) {
        field554++;
        if (arg3 != -502116606) {
            method295(62);
        }
        int var6 = -1;
        class254 var7 = new class254(arg5);
        while (true) {
            int var8 = var7.method1753(arg3 ^ 0xE2124F02);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var6 += var8;
            while (true) {
                int var10 = var7.method1730(false);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var7.method1774((byte) 60);
                int var14 = var9 >> 12;
                int var15 = var13 >> 2;
                int var16 = var11 + arg1;
                int var17 = var13 & 0x3;
                int var18 = arg2 + var12;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class345 var19 = null;
                    if (!arg0) {
                        int var20 = var14;
                        if ((class324.field5005[1][var16][var18] & 0x2) == 2) {
                            var20 = var14 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class278.method1928(var16, !arg0, var19, arg0, var15, var17, -83, var14, var14, var6, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 345)
    public static final void method295(int arg0) {
        class100.field1448.method750((byte) 75);
        if (arg0 != 180) {
            method294(true, -112, 27, 22, (class345[]) null, (byte[]) null);
        }
        field556++;
    }
}
