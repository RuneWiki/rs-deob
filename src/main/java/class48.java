import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class48 {

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    private int field602 = 0;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    private int field599 = 0;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    private int field594 = 128;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    private int field605 = 0;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public int field615 = -1;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Z")
    public boolean field601 = false;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    private int field619 = 128;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "[Lg;")
    public static class65[] field608 = new class65[50];

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field607 = 0;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Ljava/lang/String;")
    public static String field603 = "Please wait...";

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public int field617;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "Llm;")
    public static class210 field613;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[S")
    private short[] field596;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "[S")
    private short[] field600;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "[S")
    private short[] field606;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "[S")
    private short[] field618;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method328(int arg0, boolean arg1) {
        field609++;
        if (arg0 != 128) {
            method329((byte) 14);
        }
        for (class252 var2 = (class252) class162.field2444.method1109(55); var2 != null; var2 = (class252) class162.field2444.method1115((byte) 55)) {
            if (var2.field3776 != null) {
                class72.field936.method2230(var2.field3776);
                var2.field3776 = null;
            }
            if (var2.field3777 != null) {
                class72.field936.method2230(var2.field3777);
                var2.field3777 = null;
            }
            var2.method714(113);
        }
        if (!arg1) {
            return;
        }
        for (class252 var3 = (class252) class316.field4775.method1109(-108); var3 != null; var3 = (class252) class316.field4775.method1115((byte) 112)) {
            if (var3.field3776 != null) {
                class72.field936.method2230(var3.field3776);
                var3.field3776 = null;
            }
            var3.method714(arg0 ^ 0xFFFFFF52);
        }
        for (class252 var4 = (class252) class141.field2129.method1321((byte) -96); var4 != null; var4 = (class252) class141.field2129.method1330((byte) -95)) {
            if (var4.field3776 != null) {
                class72.field936.method2230(var4.field3776);
                var4.field3776 = null;
            }
            var4.method714(arg0 ^ 0xFFFFFF40);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)I", line = 72)
    public static final int method329(byte arg0) {
        field614++;
        if (class90.field1344 != null) {
            return 3;
        } else if (arg0 != 81) {
            return -51;
        } else if (class117.field1817 && class177.field2612) {
            return 2;
        } else if (class117.field1817 && !class177.field2612) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILre;I)V", line = 95)
    private final void method330(int arg0, class263 arg1, int arg2) {
        field611++;
        if (arg0 == 1) {
            this.field604 = arg1.method1830((byte) -77);
        } else if (arg0 == 2) {
            this.field615 = arg1.method1830((byte) -77);
        } else if (arg0 == 4) {
            this.field619 = arg1.method1830((byte) -77);
        } else if (arg0 == 5) {
            this.field594 = arg1.method1830((byte) -77);
        } else if (arg0 == 6) {
            this.field605 = arg1.method1830((byte) -77);
        } else if (arg0 == 7) {
            this.field602 = arg1.method1787(false);
        } else if (arg0 == 8) {
            this.field599 = arg1.method1787(false);
        } else if (arg0 == 9) {
            this.field601 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1787(false);
            this.field606 = new short[var6];
            this.field618 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field618[var7] = (short) arg1.method1830((byte) -77);
                this.field606[var7] = (short) arg1.method1830((byte) -77);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method1787(false);
            this.field600 = new short[var4];
            this.field596 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field596[var5] = (short) arg1.method1830((byte) -77);
                this.field600[var5] = (short) arg1.method1830((byte) -77);
            }
        }
        if (arg2 != 6) {
            this.method331(-64, true, -28, -68);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZII)Lnj;", line = 177)
    public final class100 method331(int arg0, boolean arg1, int arg2, int arg3) {
        field616++;
        if (!arg1) {
            return (class100) null;
        }
        class100 var5 = (class100) class223.field3396.method2180((long) this.field617, (byte) 31);
        if (var5 == null) {
            class119 var6 = class119.method843(class170.field2561, this.field604, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field618 != null) {
                for (int var7 = 0; var7 < this.field618.length; var7++) {
                    var6.method864(this.field618[var7], this.field606[var7]);
                }
            }
            if (this.field596 != null) {
                for (int var8 = 0; var8 < this.field596.length; var8++) {
                    var6.method844(this.field596[var8], this.field600[var8]);
                }
            }
            var5 = var6.method853(this.field602 + 64, this.field599 + 850, -30, -50, -30);
            class223.field3396.method2175((long) this.field617, var5, -18);
        }
        class100 var9;
        if (this.field615 == -1 || arg2 == -1) {
            var9 = var5.method510(true, true, true);
        } else {
            var9 = class72.method468(this.field615, 114).method1923(arg0, arg3, var5, -3, arg2);
        }
        if (this.field619 != 128 || this.field594 != 128) {
            var9.method507(this.field619, this.field594, this.field619);
        }
        if (this.field605 != 0) {
            if (this.field605 == 90) {
                var9.method496();
            }
            if (this.field605 == 180) {
                var9.method516();
            }
            if (this.field605 == 270) {
                var9.method504();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lre;B)V", line = 260)
    public final void method332(class263 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1787(false);
            if (var3 == 0) {
                if (arg1 != -96) {
                    this.method332((class263) null, (byte) 40);
                }
                field612++;
                return;
            }
            this.method330(var3, arg0, 6);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(B)V", line = 306)
    public static void method333(byte arg0) {
        if (arg0 <= 29) {
            method333((byte) 111);
        }
        field603 = null;
        field608 = null;
        field613 = null;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)V", line = 328)
    public static final void method334(byte arg0) {
        if (arg0 != -33) {
            field608 = (class65[]) null;
        }
        field610++;
        class73.field957.method2182(false);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)Lrh;", line = 343)
    public static final class110 method335(byte arg0, int arg1) {
        if (arg0 >= -25) {
            method328(10, false);
        }
        field598++;
        if (arg1 == 0) {
            return new class171();
        } else if (arg1 == 1) {
            return new class138();
        } else if (arg1 == 2) {
            return new class159();
        } else if (arg1 == 3) {
            return new class259();
        } else if (arg1 == 4) {
            return new class94();
        } else if (arg1 == 5) {
            return new class291();
        } else if (arg1 == 6) {
            return new class236();
        } else if (arg1 == 7) {
            return new class150();
        } else if (arg1 == 8) {
            return new class205();
        } else if (arg1 == 9) {
            return new class279();
        } else if (arg1 == 10) {
            return new class216();
        } else if (arg1 == 11) {
            return new class305();
        } else if (arg1 == 12) {
            return new class202();
        } else if (arg1 == 13) {
            return new class28();
        } else if (arg1 == 14) {
            return new class130();
        } else if (arg1 == 15) {
            return new class201();
        } else if (arg1 == 16) {
            return new class81();
        } else if (arg1 == 17) {
            return new class97();
        } else if (arg1 == 18) {
            return new class243();
        } else if (arg1 == 19) {
            return new class190();
        } else if (arg1 == 20) {
            return new class68();
        } else if (arg1 == 21) {
            return new class155();
        } else if (arg1 == 22) {
            return new class67();
        } else if (arg1 == 23) {
            return new class177();
        } else if (arg1 == 24) {
            return new class257();
        } else if (arg1 == 25) {
            return new class294();
        } else if (arg1 == 26) {
            return new class73();
        } else if (arg1 == 27) {
            return new class91();
        } else if (arg1 == 28) {
            return new class300();
        } else if (arg1 == 29) {
            return new class126();
        } else if (arg1 == 30) {
            return new class299();
        } else if (arg1 == 31) {
            return new class224();
        } else if (arg1 == 32) {
            return new class180();
        } else if (arg1 == 33) {
            return new class188();
        } else if (arg1 == 34) {
            return new class142();
        } else if (arg1 == 35) {
            return new class75();
        } else if (arg1 == 36) {
            return new class111();
        } else if (arg1 == 37) {
            return new class116();
        } else if (arg1 == 38) {
            return new class10();
        } else if (arg1 == 39) {
            return new class144();
        } else {
            return null;
        }
    }
}
