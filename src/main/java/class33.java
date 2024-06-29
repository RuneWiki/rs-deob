import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class33 {

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    private int field484 = -1;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "Z")
    private boolean field497 = false;

    @OriginalMember(owner = "client!gs", name = "D", descriptor = "Z")
    private boolean field502 = false;

    @OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
    private int field490 = -32768;

    @OriginalMember(owner = "client!gs", name = "H", descriptor = "I")
    private int field506 = -1;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "B")
    private byte field487;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "B")
    private byte field473;

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "Z")
    private boolean field495;

    @OriginalMember(owner = "client!gs", name = "E", descriptor = "[I")
    public static int[] field503 = new int[100];

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "Lni;")
    public static class367 field491 = new class367(54, 3);

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "Ljava/lang/String;")
    public static String field512;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!gs", name = "A", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!gs", name = "B", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!gs", name = "C", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!gs", name = "F", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!gs", name = "G", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "Ljg;")
    public class228 field474;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "Lka;")
    private class334 field494;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "Lia;")
    private class423 field482;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "Lvr;")
    private class91 field479;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "[Z")
    private boolean[] field481;

    static {
        new class446("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field512 = "";
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)I", line = 6)
    public static final int method276(boolean arg0, int arg1) {
        if (arg0) {
            field503 = null;
        }
        field499++;
        return (arg1 & 0x3FBF0) >> 11;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)V", line = 20)
    private final void method277(int arg0, int arg1, int arg2) {
        field501++;
        if (arg2 != 0) {
            method288(74, -63);
        }
        label90: while (true) {
            if (this.field479 == null) {
                if (this.field502) {
                    return;
                }
                this.method284(1, -1);
                if (this.field479 == null) {
                    return;
                }
            }
            int var4 = class393.field6017 - this.field476;
            if (var4 > 100 && this.field479.field1325 > 0) {
                int var5 = this.field479.field1315.length - this.field479.field1325;
                while (var5 > this.field478 && var4 > this.field479.field1313[this.field478]) {
                    var4 -= this.field479.field1313[this.field478];
                    this.field478++;
                }
                if (this.field478 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field479.field1315.length; var7++) {
                        var6 += this.field479.field1313[var7];
                    }
                    var4 %= var6;
                }
                this.field480 = this.field478 + 1;
                if (this.field480 >= this.field479.field1315.length) {
                    this.field480 -= this.field479.field1325;
                    if (this.field480 < 0 || this.field479.field1315.length <= this.field480) {
                        this.field480 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field479.field1313[this.field478] >= var4) {
                            this.field476 = class393.field6017 - var4;
                            this.field500 = var4;
                            return;
                        }
                        class441.method2669(false, this.field479, this.field473, this.field478, arg1, arg0, false);
                        var4 -= this.field479.field1313[this.field478];
                        this.field478++;
                        if (this.field479.field1315.length <= this.field478) {
                            this.field478 -= this.field479.field1325;
                            if (this.field478 < 0 || this.field479.field1315.length <= this.field478) {
                                this.field479 = null;
                                continue label90;
                            }
                        }
                        this.field480 = this.field478 + 1;
                    } while (this.field479.field1315.length > this.field480);
                    this.field480 -= this.field479.field1325;
                } while (this.field480 >= 0 && this.field479.field1315.length > this.field480);
                this.field480 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Z", line = 121)
    public final boolean method278(int arg0) {
        field508++;
        return arg0 == -1 ? this.field495 : true;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)I", line = 132)
    public final int method279(int arg0) {
        field485++;
        return arg0 == -1 ? this.field490 : 1;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BIZIZILqa;)Lka;", line = 144)
    public final class334 method280(byte arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, class165 arg6) {
        field504++;
        class209 var8 = class432.field6575.method1872(this.field475, false);
        if (var8.field2934 != null) {
            var8 = var8.method1435(-1, class288.field4208);
        }
        if (var8 == null) {
            this.method282(false, arg6);
            this.field506 = -1;
            this.field484 = this.field478;
            return null;
        }
        if (!this.field502 && this.field506 != var8.field2936) {
            this.field494 = null;
            this.method284(arg0 ^ 0xFFFFFFE6, -1);
        }
        this.method277(arg1, arg3, 0);
        boolean var9 = arg4 & this.field495 & class203.field2716.method552(-4, class378.field5771) != 0;
        boolean var10 = var9 & (this.field506 != var8.field2936 || (this.field484 != this.field478 || this.field479 != null && (this.field479.field1327 || class275.field3867) && this.field480 != this.field478) && class203.field2716.method552(arg0 + 21, class378.field5771) >= 2);
        if (arg2 && !var10) {
            this.field484 = this.field478;
            this.field506 = var8.field2936;
            return null;
        }
        if (var10) {
            class235.method1562(this.field482, this.field487, this.field496, this.field483, this.field481);
        }
        class23 var11 = class306.field4447[this.field487];
        class23 var12;
        if (this.field497) {
            var12 = class414.field6317[0];
        } else {
            var12 = this.field487 < 3 ? class306.field4447[this.field487 + 1] : null;
        }
        class334 var13 = null;
        if (arg0 != -25) {
            this.field482 = null;
        }
        if (this.field479 != null) {
            if (var10) {
                arg5 |= 0x40000;
            }
            var13 = var8.method1445(var11, this.field492 == 11 ? 10 : this.field492, arg5, this.field492 == 11 ? this.field486 + 4 : this.field486, this.field496, this.field478, var11.method218(this.field496, this.field483), this.field479, var12, this.field483, arg6, this.field480, this.field500, (byte) 3);
            if (var13 == null) {
                this.field481 = null;
                this.field490 = 0;
                this.field482 = null;
            } else {
                if (var10) {
                    if (this.field481 == null) {
                        this.field481 = new boolean[4];
                    }
                    this.field482 = var13.method73(this.field482);
                    class335.method2169(this.field482, this.field487, arg3, arg1, this.field481);
                }
                this.field490 = var13.method77();
            }
            this.field494 = null;
        } else if (this.field494 != null && (this.field494.method46() & arg5) == arg5 && this.field506 == var8.field2936) {
            var13 = this.field494;
        } else {
            if (this.field494 != null) {
                arg5 |= this.field494.method46();
            }
            class404 var14 = var8.method1446(var12, this.field492 == 11 ? this.field486 + 4 : this.field486, var11.method218(this.field496, this.field483), arg5, 262144, arg6, var10, this.field492 == 11 ? 10 : this.field492, var11, this.field483, this.field496);
            if (var14 == null) {
                this.field494 = null;
                this.field490 = 0;
                this.field482 = null;
                this.field481 = null;
            } else {
                var13 = var14.field6128;
                this.field494 = var14.field6128;
                if (var10) {
                    this.field481 = null;
                    this.field482 = var14.field6124;
                    class335.method2169(this.field482, this.field487, arg3, arg1, null);
                }
                this.field490 = var13.method77();
            }
        }
        this.field506 = var8.field2936;
        this.field496 = arg3;
        this.field484 = this.field478;
        this.field483 = arg1;
        return var13;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)V", line = 269)
    public final void method281(int arg0, int arg1) {
        field493++;
        if (arg0 == -6) {
            this.field502 = true;
            this.method284(1, arg1);
        }
    }

    @OriginalMember(owner = "client!gs", name = "finalize", descriptor = "()V", line = 281)
    protected final void finalize() {
        field477++;
        if (this.field474 != null) {
            this.field474.method1526();
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZLqa;)V", line = 296)
    public final void method282(boolean arg0, class165 arg1) {
        if (arg0) {
            method286((byte) -103);
        }
        field488++;
        if (this.field482 != null) {
            class235.method1562(this.field482, this.field487, this.field496, this.field483, this.field481);
            this.field481 = null;
            this.field482 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lqa;I)V", line = 313)
    public final void method283(class165 arg0, int arg1) {
        this.method280((byte) -25, this.field483, true, this.field496, true, 262144, arg0);
        if (arg1 >= -106) {
            this.field495 = true;
        }
        field489++;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V", line = 326)
    private final void method284(int arg0, int arg1) {
        field510++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class209 var5 = class432.field6575.method1872(this.field475, false);
            class209 var6 = var5;
            if (var5.field2934 != null) {
                var5 = var5.method1435(-1, class288.field4208);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field2938 != null) {
                if (this.field479 != null && var5.method1444(false, this.field479.field1331)) {
                    return;
                }
                var3 = var5.method1436((byte) -127);
                if (this.field506 != var5.field2936) {
                    var4 = var5.field2971;
                }
            } else if (var5.field2917 == -1) {
                if (var6 != null && var6.field2938 != null) {
                    if (this.field479 != null && var6.method1444(false, this.field479.field1331)) {
                        return;
                    }
                    var3 = var6.method1436((byte) -91);
                    if (this.field506 != var6.field2936) {
                        var4 = var6.field2971;
                    }
                } else if (var6 != null && var6.field2917 != -1 && this.field506 != var6.field2936) {
                    var4 = var6.field2971;
                    var3 = var6.field2917;
                }
            } else if (this.field506 != var5.field2936) {
                var4 = var5.field2971;
                var3 = var5.field2917;
            }
        }
        if (var3 == -1) {
            this.field479 = null;
            return;
        }
        this.field494 = null;
        if (this.field479 == null || this.field479.field1331 != var3) {
            this.field479 = class201.field2707.method489(73, var3);
        } else if (this.field479.field1340 == 0) {
            return;
        }
        if (this.field479.field1315 == null) {
            this.field479 = null;
            return;
        }
        if (var4) {
            this.field478 = (int) ((double) this.field479.field1315.length * Math.random());
            this.field500 = (int) ((double) this.field479.field1313[this.field478] * Math.random()) + 1;
        } else {
            this.field500 = 1;
            this.field478 = 0;
        }
        this.field480 = this.field478 + 1;
        if (this.field480 < 0 || this.field480 >= this.field479.field1315.length) {
            this.field480 = -1;
        }
        this.field476 = class393.field6017 - this.field500;
        if (arg0 != 1) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIILqa;ZLka;II)V", line = 444)
    public final void method285(int arg0, int arg1, int arg2, class165 arg3, boolean arg4, class334 arg5, int arg6, int arg7) {
        field507++;
        class392[] var9 = arg5.method72();
        class531[] var10 = arg5.method87();
        if ((this.field474 == null || this.field474.field3237) && (var9 != null || var10 != null)) {
            class209 var11 = class432.field6575.method1872(this.field475, false);
            if (var11.field2934 != null) {
                var11 = var11.method1435(-1, class288.field4208);
            }
            if (var11 != null) {
                this.field474 = new class228(class393.field6017);
            }
        }
        if (this.field474 != null) {
            if (arg4) {
                this.field474.method1531(arg3, (long) class393.field6017, var9, var10, false);
            } else {
                this.field474.method1534((long) class393.field6017);
            }
            this.field474.method1530(this.field473, arg1, arg7, arg2, arg0);
        }
        if (arg6 != 0) {
            this.field483 = 26;
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lqa;Lcd;IIIIIIZI)V", line = 586)
    public class33(class165 arg0, class209 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field496 = arg6;
        this.field492 = arg2;
        this.field483 = arg7;
        this.field487 = (byte) arg5;
        this.field486 = arg3;
        this.field475 = arg1.field2936;
        this.field497 = arg8;
        this.field473 = (byte) arg4;
        this.field495 = arg0.method786() && arg1.field2889 && !this.field497;
        if (arg9 != -1) {
            this.field502 = true;
        }
        this.method284(1, arg9);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 496)
    public static void method286(byte arg0) {
        field512 = null;
        field503 = null;
        if (arg0 != 53) {
            field491 = null;
        }
        field491 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILco;)Z", line = 510)
    public static final boolean method287(int arg0, class77 arg1) {
        if (arg0 <= 72) {
            return true;
        } else {
            field509++;
            return class199.field2637 == arg1 || class511.field7498 == arg1 || class156.field2035 == arg1 || class350.field5398 == arg1;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(II)V", line = 522)
    public static final void method288(int arg0, int arg1) {
        class489.method2922(true);
        field498++;
        int var2 = class431.field6567.method189(arg1, 16).field2334;
        if (arg0 == var2) {
            return;
        }
        int var3 = class288.field4208.field1208[arg1];
        if (var2 == 6) {
            class332.field5174 = var3;
        }
        if (var2 == 5) {
            class259.field3661 = var3;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIII)I", line = 557)
    public static final int method289(int arg0, int arg1, int arg2, int arg3) {
        field505++;
        if (arg0 != 261104) {
            method287(-28, null);
        }
        if (arg1 > arg3) {
            return arg1;
        } else if (arg2 < arg3) {
            return arg2;
        } else {
            return arg3;
        }
    }
}
