import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class241 {

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    private int field4217 = 0;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    private int field4222 = 0;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Z")
    public boolean field4224 = false;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    private int field4231 = 128;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public int field4210 = -1;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    private int field4232 = 128;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    private int field4234 = 0;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lp;")
    private static class280 field4207 = class18.method140((byte) -127, "Loading textures )2 ");

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "[I")
    public static int[] field4218 = new int[4096];

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Lp;")
    public static class280 field4228 = class18.method140((byte) -124, "<br>");

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Lp;")
    private static class280 field4223 = class18.method140((byte) -122, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lp;")
    public static class280 field4216 = field4223;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lp;")
    public static class280 field4221 = class18.method140((byte) -118, "Ablegen");

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lp;")
    public static class280 field4211 = field4207;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lp;")
    public static class280 field4226 = class18.method140((byte) -126, "scrollbar");

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public int field4205;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    private int field4225;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "[I")
    public static int[] field4227;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[Lde;")
    public static class108[] field4212;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[S")
    private short[] field4206;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "[S")
    private short[] field4208;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "[S")
    private short[] field4213;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "[S")
    private short[] field4214;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "[S")
    public static short[] field4220;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIBIZ)V")
    public static final void method1635(boolean arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        class199.method1372(0, arg0, arg1, arg4, arg2 + 79, class96.field1534.length + -1, arg3);
        if (arg2 != -78) {
            method1639(-111, -108, 14, -100, 27);
        }
        field4219++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field4221 = null;
        field4228 = null;
        field4227 = null;
        field4207 = null;
        field4218 = null;
        field4223 = null;
        field4220 = null;
        if (arg0 > 51) {
            field4212 = null;
            field4226 = null;
            field4211 = null;
            field4216 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Lik;")
    public final class256 method1637(int arg0, int arg1) {
        field4230++;
        class256 var3 = (class256) class116.field2101.method1480((byte) 50, (long) this.field4205);
        if (arg1 != -50) {
            return null;
        }
        if (var3 == null) {
            class114 var4 = class114.method819(class60.field975, this.field4225, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field4214 != null) {
                for (int var5 = 0; var5 < this.field4214.length; var5++) {
                    var4.method835(this.field4214[var5], this.field4213[var5]);
                }
            }
            if (this.field4206 != null) {
                for (int var6 = 0; var6 < this.field4206.length; var6++) {
                    var4.method818(this.field4206[var6], this.field4208[var6]);
                }
            }
            var3 = var4.method806(this.field4222 + 64, this.field4234 + 850, -30, -50, -30);
            class116.field2101.method1483((byte) -128, (long) this.field4205, var3);
        }
        class256 var7;
        if (this.field4210 == -1 || arg0 == -1) {
            var7 = var3.method1623(true, true);
        } else {
            var7 = class207.method1401((byte) -22, this.field4210).method581(var3, true, arg0);
        }
        if (this.field4231 != 128 || this.field4232 != 128) {
            var7.method1612(this.field4231, this.field4232, this.field4231);
        }
        if (this.field4217 != 0) {
            if (this.field4217 == 90) {
                var7.method1621();
            }
            if (this.field4217 == 180) {
                var7.method1607();
            }
            if (this.field4217 == 270) {
                var7.method1615();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Llj;I)V")
    public final void method1638(class25 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method189((byte) -103);
            if (var3 == 0) {
                field4233++;
                if (arg1 != -1) {
                    field4218 = null;
                    return;
                }
                return;
            }
            this.method1640(var3, arg0, (byte) 9);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
    public static final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4229++;
        class277.field4818 = arg1;
        class97.field1558 = -1;
        class47.field780 = class74.field1222 * arg3 / arg2;
        class266.field4684 = class47.field779 * arg4 / arg0;
        class133.method922(-1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILlj;B)V")
    private final void method1640(int arg0, class25 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field4225 = arg1.method193((byte) 77);
        } else if (arg0 == 2) {
            this.field4210 = arg1.method193((byte) 77);
        } else if (arg0 == 4) {
            this.field4231 = arg1.method193((byte) 77);
        } else if (arg0 == 5) {
            this.field4232 = arg1.method193((byte) 77);
        } else if (arg0 == 6) {
            this.field4217 = arg1.method193((byte) 77);
        } else if (arg0 == 7) {
            this.field4222 = arg1.method189((byte) -103);
        } else if (arg0 == 8) {
            this.field4234 = arg1.method189((byte) -103);
        } else if (arg0 == 9) {
            this.field4224 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method189((byte) -103);
            this.field4213 = new short[var6];
            this.field4214 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4214[var7] = (short) arg1.method193((byte) 77);
                this.field4213[var7] = (short) arg1.method193((byte) 77);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method189((byte) -103);
            this.field4206 = new short[var4];
            this.field4208 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4206[var5] = (short) arg1.method193((byte) 77);
                this.field4208[var5] = (short) arg1.method193((byte) 77);
            }
        }
        if (arg2 != 9) {
            field4218 = null;
        }
        field4209++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Loe;I)V")
    public static final void method1641(class142 arg0, int arg1) {
        field4215++;
        if (arg1 < 36) {
            method1636(66);
        }
        class23 var2 = (class23) class83.field1370.method150(arg0.field2458.method1896(77), 111);
        if (var2 == null) {
            class127.method877(arg0.field4792[0], arg0.field4837[0], 128, class231.field4013, arg0, 0, (class61) null, (class130) null);
        } else {
            var2.method174((byte) -73);
        }
    }
}
