import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class478 extends class10 {

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    private int field6730 = 0;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Lfa;")
    private class371 field6721 = new class371(16);

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    private int field6732 = 0;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "Lat;")
    private class412 field6733 = new class412();

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "J")
    private long field6736 = 0L;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "Lce;")
    private class302 field6722;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    private int field6712;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "Z")
    private boolean field6734;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "Lat;")
    private class412 field6731;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "Lgm;")
    private class95 field6727;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    private int field6717;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lce;")
    private class302 field6706;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Z")
    private boolean field6737;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    private int field6720;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Lwo;")
    private class303 field6710;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lkp;")
    private class355 field6711;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lje;")
    public static class178 field6708 = null;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Lo;")
    public static class332 field6713 = new class332("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Lms;")
    private class76 field6715;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "Z")
    private boolean field6735;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "[B")
    private byte[] field6716;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I", line = 3)
    public final int method109(int arg0, int arg1) {
        field6718++;
        if (arg1 == 0) {
            class355 var3 = (class355) this.field6721.method2305((long) arg0, (byte) 29);
            return var3 == null ? 0 : var3.method138(-92);
        } else {
            return 46;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)V", line = 25)
    public final void method106(byte arg0, int arg1) {
        field6729++;
        if (this.field6722 == null) {
            return;
        }
        for (class35 var3 = this.field6733.method2456(32101); var3 != null; var3 = this.field6733.method2461(301)) {
            if (((long) arg1) == var3.field436) {
                return;
            }
        }
        if (arg0 > -126) {
            this.field6716 = null;
        }
        class35 var4 = new class35();
        var4.field436 = (long) arg1;
        this.field6733.method2453((byte) -98, var4);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 55)
    public static void method2800(int arg0) {
        if (arg0 != 0) {
            field6713 = null;
        }
        field6713 = null;
        field6708 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)[B", line = 66)
    public final byte[] method108(int arg0, byte arg1) {
        if (arg1 != -127) {
            this.field6735 = true;
        }
        field6714++;
        class355 var3 = this.method2806(125, arg0, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method133(-1);
            var3.method283(arg1 ^ 0xFFFFFF83);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V", line = 88)
    public final void method2801(byte arg0) {
        field6707++;
        if (arg0 != 121) {
            method2800(94);
        }
        if (this.field6722 != null) {
            this.field6735 = true;
            if (this.field6731 == null) {
                this.field6731 = new class412();
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V", line = 113)
    public final void method2802(byte arg0) {
        if (arg0 != 48) {
            this.method2803(33);
        }
        field6723++;
        if (this.field6731 == null || this.method110((byte) -124) == null) {
            return;
        }
        for (class35 var2 = this.field6733.method2456(32101); var2 != null; var2 = this.field6733.method2461(301)) {
            int var3 = (int) var2.field436;
            if (var3 < 0 || this.field6715.field1077 <= var3 || this.field6715.field1084[var3] == 0) {
                var2.method283(2);
            } else {
                if (this.field6716[var3] == 0) {
                    this.method2806(126, var3, 1);
                }
                if (this.field6716[var3] == -1) {
                    this.method2806(126, var3, 2);
                }
                if (this.field6716[var3] == 1) {
                    var2.method283(2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)I", line = 157)
    public final int method2803(int arg0) {
        if (arg0 >= -55) {
            return 8;
        }
        field6728++;
        if (this.method110((byte) -127) == null) {
            return this.field6711 == null ? 0 : this.field6711.method138(-104);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 191)
    public static final void method2804(boolean arg0) {
        field6725++;
        for (int var1 = 0; var1 < 5; var1++) {
            client.field6675[var1] = false;
        }
        class415.field5987 = class452.field6418;
        class358.field5438 = 0;
        class401.field5860 = class283.field4287;
        class340.field5100 = class200.field3027;
        class100.field1423 = -1;
        class2.field26 = class433.field6156;
        class489.field6863 = class68.field920;
        class88.field1246 = 0;
        class147.field2085 = class344.field5191;
        class469.field6596 = 5;
        if (!arg0) {
            class258.field3855 = -1;
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)I", line = 229)
    public final int method2805(int arg0) {
        if (arg0 > -48) {
            this.field6722 = null;
        }
        field6726++;
        return this.field6730;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Lkp;", line = 240)
    private final class355 method2806(int arg0, int arg1, int arg2) {
        if (arg0 <= 124) {
            field6708 = null;
        }
        field6705++;
        class355 var4 = (class355) this.field6721.method2305((long) arg1, (byte) 23);
        if (var4 != null && arg2 == 0 && !var4.field5387 && var4.field5386) {
            var4.method283(2);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field6722 == null || this.field6716[arg1] == -1) {
                    if (this.field6727.method737(4)) {
                        return null;
                    }
                    var4 = this.field6727.method742(true, (byte) 2, arg1, this.field6712, true);
                } else {
                    var4 = this.field6710.method1892(arg1, this.field6722, 1);
                }
            } else if (arg2 == 1) {
                if (this.field6722 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field6710.method1890(this.field6722, 0, arg1);
            } else if (arg2 == 2) {
                if (this.field6722 == null) {
                    throw new RuntimeException();
                }
                if (this.field6716[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6727.method736((byte) -26)) {
                    return null;
                }
                var4 = this.field6727.method742(false, (byte) 2, arg1, this.field6712, true);
            } else {
                throw new RuntimeException();
            }
            this.field6721.method2307((long) arg1, var4, (byte) -124);
        }
        if (var4.field5386) {
            return null;
        }
        byte[] var5 = var4.method133(-1);
        if (!var4 instanceof class14) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class24.field314.reset();
                class24.field314.update(var5, 0, var5.length - 2);
                int var6 = (int) class24.field314.getValue();
                if (this.field6715.field1081[arg1] != var6) {
                    throw new RuntimeException();
                }
                this.field6727.field1368 = 0;
                this.field6727.field1365 = 0;
            } catch (RuntimeException var12) {
                this.field6727.method734(-107);
                var4.method283(2);
                if (var4.field5387 && !this.field6727.method737(4)) {
                    class24 var7 = this.field6727.method742(true, (byte) 2, arg1, this.field6712, true);
                    this.field6721.method2307((long) arg1, var7, (byte) 116);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field6715.field1080[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field6715.field1080[arg1];
            if (this.field6722 != null) {
                this.field6710.method1889(127, var5, this.field6722, arg1);
                if (this.field6716[arg1] != 1) {
                    this.field6730++;
                    this.field6716[arg1] = 1;
                }
            }
            if (!var4.field5387) {
                var4.method283(2);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class24.field314.reset();
            class24.field314.update(var5, 0, var5.length - 2);
            int var8 = (int) class24.field314.getValue();
            if (this.field6715.field1081[arg1] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field6715.field1080[arg1] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field6716[arg1] != 1) {
                this.field6730++;
                this.field6716[arg1] = 1;
            }
            if (!var4.field5387) {
                var4.method283(2);
            }
            return var4;
        } catch (Exception var11) {
            this.field6716[arg1] = -1;
            var4.method283(2);
            if (var4.field5387 && !this.field6727.method737(4)) {
                class24 var10 = this.field6727.method742(true, (byte) 2, arg1, this.field6712, true);
                this.field6721.method2307((long) arg1, var10, (byte) -79);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)I", line = 456)
    public final int method2807(boolean arg0) {
        if (arg0) {
            field6708 = null;
        }
        field6704++;
        return this.field6715 == null ? 0 : this.field6715.field1076;
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)I", line = 470)
    public final int method2808(int arg0) {
        if (arg0 > -100) {
            return 87;
        }
        field6719++;
        if (this.field6715 == null) {
            return 0;
        } else if (this.field6734) {
            class35 var2 = this.field6731.method2456(32101);
            return var2 == null ? 0 : (int) var2.field436;
        } else {
            return this.field6715.field1076;
        }
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V", line = 494)
    public final void method2809(int arg0) {
        field6709++;
        if (this.field6731 != null) {
            if (this.method110((byte) -112) == null) {
                return;
            }
            if (this.field6734) {
                boolean var6 = true;
                for (class35 var7 = this.field6731.method2456(32101); var7 != null; var7 = this.field6731.method2461(301)) {
                    int var9 = (int) var7.field436;
                    if (this.field6716[var9] == 0) {
                        this.method2806(125, var9, 1);
                    }
                    if (this.field6716[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method283(2);
                    }
                }
                while (this.field6715.field1084.length > this.field6732) {
                    if (this.field6715.field1084[this.field6732] == 0) {
                        this.field6732++;
                    } else {
                        if (this.field6710.field4520 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field6716[this.field6732] == 0) {
                            this.method2806(127, this.field6732, 1);
                        }
                        if (this.field6716[this.field6732] == 0) {
                            class35 var8 = new class35();
                            var8.field436 = (long) this.field6732;
                            this.field6731.method2453((byte) -113, var8);
                            var6 = false;
                        }
                        this.field6732++;
                    }
                }
                if (var6) {
                    this.field6732 = 0;
                    this.field6734 = false;
                }
            } else if (this.field6735) {
                boolean var2 = true;
                for (class35 var3 = this.field6731.method2456(32101); var3 != null; var3 = this.field6731.method2461(301)) {
                    int var5 = (int) var3.field436;
                    if (this.field6716[var5] != 1) {
                        this.method2806(125, var5, 2);
                    }
                    if (this.field6716[var5] == 1) {
                        var3.method283(2);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field6732 < this.field6715.field1084.length) {
                    if (this.field6715.field1084[this.field6732] == 0) {
                        this.field6732++;
                    } else {
                        if (this.field6727.method736((byte) -26)) {
                            var2 = false;
                            break;
                        }
                        if (this.field6716[this.field6732] != 1) {
                            this.method2806(126, this.field6732, 2);
                        }
                        if (this.field6716[this.field6732] != 1) {
                            class35 var4 = new class35();
                            var4.field436 = (long) this.field6732;
                            this.field6731.method2453((byte) -118, var4);
                            var2 = false;
                        }
                        this.field6732++;
                    }
                }
                if (var2) {
                    this.field6732 = 0;
                    this.field6735 = false;
                }
            } else {
                this.field6731 = null;
            }
        }
        int var10 = -62 / ((16 - arg0) / 55);
        if (!this.field6737 || class435.method2539(-10659) < this.field6736) {
            return;
        }
        for (class355 var11 = (class355) this.field6721.method2296((byte) 39); var11 != null; var11 = (class355) this.field6721.method2297(true)) {
            if (!var11.field5386) {
                if (var11.field5388) {
                    if (!var11.field5387) {
                        throw new RuntimeException();
                    }
                    var11.method283(2);
                } else {
                    var11.field5388 = true;
                }
            }
        }
        this.field6736 = class435.method2539(-10659) + 1000L;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(ILce;Lce;Lgm;Lwo;IIZ)V", line = 797)
    public class478(int arg0, class302 arg1, class302 arg2, class95 arg3, class303 arg4, int arg5, int arg6, boolean arg7) {
        this.field6722 = arg1;
        this.field6712 = arg0;
        if (this.field6722 == null) {
            this.field6734 = false;
        } else {
            this.field6734 = true;
            this.field6731 = new class412();
        }
        this.field6727 = arg3;
        this.field6717 = arg6;
        this.field6706 = arg2;
        this.field6737 = arg7;
        this.field6720 = arg5;
        this.field6710 = arg4;
        if (this.field6706 != null) {
            this.field6711 = this.field6710.method1892(this.field6712, this.field6706, 1);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Lms;", line = 693)
    public final class76 method110(byte arg0) {
        field6724++;
        if (arg0 >= -110) {
            this.method106((byte) -31, -54);
        }
        if (this.field6715 != null) {
            return this.field6715;
        }
        if (this.field6711 == null) {
            if (this.field6727.method737(4)) {
                return null;
            }
            this.field6711 = this.field6727.method742(true, (byte) 0, this.field6712, 255, true);
        }
        if (this.field6711.field5386) {
            return null;
        }
        byte[] var2 = this.field6711.method133(-1);
        if (this.field6711 instanceof class14) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6715 = new class76(var2, this.field6720);
                if (this.field6715.field1078 != this.field6717) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field6715 = null;
                if (this.field6727.method737(4)) {
                    this.field6711 = null;
                } else {
                    this.field6711 = this.field6727.method742(true, (byte) 0, this.field6712, 255, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6715 = new class76(var2, this.field6720);
            } catch (RuntimeException var4) {
                this.field6727.method734(-115);
                this.field6715 = null;
                if (this.field6727.method737(4)) {
                    this.field6711 = null;
                } else {
                    this.field6711 = this.field6727.method742(true, (byte) 0, this.field6712, 255, true);
                }
                return null;
            }
            if (this.field6706 != null) {
                this.field6710.method1889(127, var2, this.field6706, this.field6712);
            }
        }
        this.field6711 = null;
        if (this.field6722 != null) {
            this.field6730 = 0;
            this.field6716 = new byte[this.field6715.field1077];
        }
        return this.field6715;
    }
}
