import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class358 {

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "Lld;")
    private class561 field4988 = new class561();

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "Lvda;")
    public static class311 field4993 = new class311();

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "Z")
    public static boolean field4998 = true;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "Lvt;")
    public static class344 field4999 = new class344(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 200.", null, null);

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "Lwg;")
    public static class58 field5001 = new class58(5);

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "Lkr;")
    public static class329 field5000;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "Lld;")
    private class561 field4996;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)V")
    public static void method2219(byte arg0) {
        field5001 = null;
        field4993 = null;
        field5000 = null;
        if (arg0 > -12) {
            method2221((byte) -124, null);
        }
        field4999 = null;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)I")
    public final int method2220(int arg0) {
        field4990++;
        int var2 = arg0;
        for (class561 var3 = this.field4988.field7831; var3 != this.field4988; var3 = var3.field7831) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(BLdc;)I")
    public static final int method2221(byte arg0, class23 arg1) {
        field4995++;
        if (arg1.field334 == 0) {
            return 0;
        }
        if (arg1.field399 != -1) {
            class23 var2 = null;
            if (arg1.field399 < 32768) {
                class480 var3 = (class480) class131.field1619.method3476((long) arg1.field399, (byte) 28);
                if (var3 != null) {
                    var2 = var3.field6729;
                }
            } else if (arg1.field399 >= 32768) {
                var2 = class364.field5092[arg1.field399 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field6362 - var2.field6362;
                int var5 = arg1.field6368 - var2.field6368;
                if (var4 != 0 || var5 != 0) {
                    arg1.method130(-109, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg1 instanceof class20) {
            class20 var6 = (class20) arg1;
            if (var6.field262 != -1 && (var6.field421 == 0 || var6.field420 > 0)) {
                var6.method130(-113, var6.field262);
                var6.field262 = -1;
            }
        } else if (arg1 instanceof class585) {
            class585 var7 = (class585) arg1;
            if (var7.field8461 != -1 && (var7.field421 == 0 || var7.field420 > 0)) {
                int var8 = var7.field6362 - ((var7.field8461 - class525.field7310 - class525.field7310) * 256);
                int var9 = var7.field6368 - ((var7.field8457 - class58.field786 - class58.field786) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method130(-125, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field8461 = -1;
            }
        }
        return arg0 < 64 ? -49 : arg1.method134(-1);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)Lld;")
    public final class561 method2222(byte arg0) {
        field4994++;
        class561 var2 = this.field4988.field7831;
        if (this.field4988 == var2) {
            this.field4996 = null;
            return null;
        } else if (arg0 > -32) {
            return null;
        } else {
            this.field4996 = var2.field7831;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
    public static final void method2223(boolean arg0) {
        class118.method650(arg0, class515.field7167);
        class509.field7090++;
        field4991++;
        class272.field3457.method3060(0, -25098);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
    public static final void method2224(int arg0) {
        class444.method2586(24201);
        if (arg0 == 12644) {
            field4989++;
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
    public class358() {
        this.field4988.field7831 = this.field4988;
        this.field4988.field7834 = this.field4988;
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)Lld;")
    public final class561 method2225(int arg0) {
        field4992++;
        class561 var2 = this.field4996;
        if (this.field4988 == var2) {
            this.field4996 = null;
            return null;
        } else {
            this.field4996 = var2.field7831;
            return arg0 < 25 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "(I)Lld;")
    public final class561 method2226(int arg0) {
        field4987++;
        class561 var2 = this.field4988.field7831;
        if (this.field4988 == var2) {
            return null;
        }
        if (arg0 != 0) {
            method2221((byte) 111, null);
        }
        var2.method3149(-18724);
        return var2;
    }

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "(I)V")
    public final void method2227(int arg0) {
        if (arg0 != 16383) {
            field5000 = null;
        }
        field4986++;
        while (true) {
            class561 var2 = this.field4988.field7831;
            if (this.field4988 == var2) {
                this.field4996 = null;
                return;
            }
            var2.method3149(-18724);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(BLld;)V")
    public final void method2228(byte arg0, class561 arg1) {
        if (arg0 <= 24) {
            field4993 = null;
        }
        if (arg1.field7834 != null) {
            arg1.method3149(-18724);
        }
        field4997++;
        arg1.field7834 = this.field4988.field7834;
        arg1.field7831 = this.field4988;
        arg1.field7834.field7831 = arg1;
        arg1.field7831.field7834 = arg1;
    }
}
