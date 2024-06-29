import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class101 {

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Ljc;")
    public static class305 field1380 = new class305("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
    public final int method615(int arg0) {
        if (arg0 == -1) {
            field1377++;
            return this.field1382 & 0x3FFF;
        } else {
            return 126;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljk;ILza;)V")
    public static final void method616(class450 arg0, int arg1, class287 arg2) {
        field1386++;
        boolean var3 = class237.field3158.method238(arg0.field6572 ? class96.field1170.field7833 : null, arg0.field6672, 0, arg0.field6677 | 0xFF000000, arg0.field6661, arg0.field6561, arg2, arg0.field6689) == null;
        if (arg1 != -19845) {
            method618((byte) 19);
        }
        if (var3) {
            class469.field6953.method975(0, new class393(arg0.field6661, arg0.field6561, arg0.field6672, arg0.field6677 | 0xFF000000, arg0.field6689, arg0.field6572));
            class413.method2521(arg0, false);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZI)Z")
    public final boolean method617(int arg0, int arg1, boolean arg2, int arg3) {
        field1378++;
        int var5 = this.field1384;
        if (this.field1382 == arg1 && this.field1384 == 0) {
            return false;
        }
        if (!arg2) {
            this.method615(-47);
        }
        boolean var6;
        if (this.field1384 == 0) {
            if (this.field1382 < arg1 && (this.field1382 + arg0) >= arg1 || this.field1382 > arg1 && arg1 >= (this.field1382 - arg0)) {
                this.field1382 = arg1;
                return false;
            }
            var6 = true;
        } else if (this.field1384 > 0 && arg1 > this.field1382) {
            int var7 = this.field1384 * this.field1384 / (arg0 * 2);
            int var8 = this.field1382 + var7;
            if (var8 < arg1 && this.field1382 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field1384 < 0 && arg1 < this.field1382) {
            int var9 = this.field1384 * this.field1384 / (arg0 * 2);
            int var10 = this.field1382 - var9;
            if (arg1 < var10 && this.field1382 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg1 > this.field1382) {
                this.field1384 += arg0;
                if (arg3 != 0 && arg3 < this.field1384) {
                    this.field1384 = arg3;
                }
            } else {
                this.field1384 -= arg0;
                if (arg3 != 0 && this.field1384 < (-arg3)) {
                    this.field1384 = -arg3;
                }
            }
            if (this.field1384 != var5) {
                int var11 = this.field1384 * this.field1384 / (arg0 * 2);
                if (arg1 > this.field1382) {
                    if (arg1 < (this.field1382 + var11)) {
                        this.field1384 = var5;
                    }
                } else if (this.field1382 > arg1 && arg1 > (this.field1382 - var11)) {
                    this.field1384 = var5;
                }
            }
        } else if (this.field1384 > 0) {
            this.field1384 -= arg0;
            if (this.field1384 < 0) {
                this.field1384 = 0;
            }
        } else {
            this.field1384 += arg0;
            if (this.field1384 > 0) {
                this.field1384 = 0;
            }
        }
        this.field1382 += this.field1384 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method618(byte arg0) {
        if (arg0 > -18) {
            field1380 = null;
        }
        field1380 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)I")
    public static final int method619(int arg0, int arg1, int arg2) {
        if (arg2 != -5431) {
            method619(18, 2, 44);
        }
        field1381++;
        return arg0 == 1 || arg0 == 3 ? class520.field7660[arg1 & 0x3] : class527.field7735[arg1 & 0x3];
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
    public final void method620(boolean arg0, int arg1) {
        field1385++;
        this.field1382 = arg1;
        if (!arg0) {
            this.field1384 = -23;
        }
        this.field1384 = 0;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public final void method621(int arg0) {
        if (arg0 >= -27) {
            this.field1382 = -126;
        }
        this.field1382 &= 0x3FFF;
        field1383++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
    public static final boolean method622(int arg0, int arg1) {
        int var2 = -86 % ((-arg1 - 67) / 49);
        field1379++;
        return arg0 == 2 || arg0 == 6 || arg0 == 9;
    }
}
