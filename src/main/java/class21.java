import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class21 extends class19 {

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "Lsb;")
    private class110 field623;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field600 = 0;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "Lwb;")
    public static class130 field602 = class26.method212("Bitte entfernen Sie ", -32376);

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public static int field596 = 0;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "[I")
    public static int[] field616 = new int[2000];

    @OriginalMember(owner = "client!db", name = "S", descriptor = "Lwb;")
    private static class130 field613 = class26.method212("Please use a different world)3", -32376);

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field605 = 0;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Lwb;")
    public static class130 field614 = field613;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    public static int field622 = 0;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "Lwb;")
    public static class130 field617 = class26.method212("redstone1", -32376);

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "Lwb;")
    public static class130 field625 = class26.method212("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>", -32376);

    @OriginalMember(owner = "client!db", name = "db", descriptor = "Lwb;")
    public static class130 field624 = class26.method212("gleiten:", -32376);

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "Lda;")
    public static class20 field621;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Lec;")
    public static class28 field606;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Lgb;")
    private class39 field612;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "Z")
    private boolean field609;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "Z")
    private boolean field619;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "[B")
    private byte[] field599;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)Lsd;", line = 5)
    public static final class112 method190(int arg0, int arg1) {
        field597++;
        class112 var2 = (class112) class48.field1273.method402((long) arg0, -114);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -9101) {
            method194((byte) -98);
        }
        byte[] var3 = class30.field851.method508(arg0, 0, 13);
        class112 var4 = new class112();
        var4.field2756 = arg0;
        if (var3 != null) {
            var4.method862(new class36(var3), -88);
        }
        class48.field1273.method403((long) arg0, var4, (byte) -101);
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 36)
    public final void method176(int arg0) {
        int var2 = -24 % ((-arg0 - 73) / 52);
        if (this.field609) {
            try {
                class125.method940("midibox.src=\"c:/silence.mid\";", this.field623.field2712, -12396);
            } catch (Throwable var3) {
            }
            this.field609 = false;
        }
        field607++;
        this.field612 = null;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V", line = 58)
    public static void method191(int arg0) {
        field602 = null;
        field613 = null;
        field616 = null;
        if (arg0 < 62) {
            field625 = null;
        }
        field606 = null;
        field624 = null;
        field614 = null;
        field617 = null;
        field621 = null;
        field625 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 93)
    public final void method170(byte arg0) {
        if (arg0 >= 119) {
            field611++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V", line = 103)
    public final void method179(byte arg0, int arg1) {
        field595++;
        int var3 = -34 / ((-arg0 - 66) / 60);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V", line = 113)
    public static final void method192(int arg0, int arg1, int arg2, int arg3) {
        field615++;
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            client.field523 = -1;
            class115.field2826 = -1;
            return;
        }
        int var4 = class27.method219(arg2 + 336137320, class71.field1818, arg1, arg0) - arg3;
        int var5 = arg1 - class58.field1465;
        int var6 = var4 - class29.field815;
        int var7 = class102.field2514[class10.field337];
        int var8 = class102.field2502[class10.field337];
        if (arg2 != -1) {
            return;
        }
        int var9 = arg0 - class103.field2528;
        int var10 = class102.field2514[class113.field2780];
        int var11 = class102.field2502[class113.field2780];
        int var12 = var5 * var11 + var9 * var10 >> 16;
        int var13 = var5 * var10 - var9 * var11 >> 16;
        int var15 = var6 * var7 - var8 * var13 >> 16;
        int var16 = var6 * var8 + var7 * var13 >> 16;
        if (var16 < 50) {
            class115.field2826 = -1;
            client.field523 = -1;
        } else {
            class115.field2826 = (var12 << 9) / var16 + 256;
            client.field523 = (var15 << 9) / var16 + 167;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([BZIZ)V", line = 165)
    public final void method177(byte[] arg0, boolean arg1, int arg2, boolean arg3) {
        this.field612 = this.field623.method847(0);
        field610++;
        if (this.field612 == null) {
            return;
        }
        if (arg2 == 0) {
            arg2 = 1;
        }
        this.field603 = class97.method725(arg2, -4456);
        this.field599 = arg0;
        this.field619 = arg3;
        if (arg1) {
            this.field609 = false;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V", line = 193)
    public final void method171(int arg0, int arg1, int arg2) {
        field620++;
        if (arg1 != 19029) {
            this.method179((byte) 94, -99);
        }
        if (arg0 == 0) {
            arg0 = 1;
        }
        int var4 = class97.method725(arg0, -4456) - arg2;
        if (this.field612 != null) {
            this.field603 = var4;
        } else if (this.field609) {
            try {
                class125.method940("midibox.volume=" + var4 + ";", this.field623.field2712, -12396);
            } catch (Throwable var5) {
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(III)Lwb;", line = 234)
    public static final class130 method193(int arg0, int arg1, int arg2) {
        field618++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return class47.field1259;
        } else if (var3 < -6) {
            return class20.field588;
        } else if (var3 < -3) {
            return class94.field2275;
        } else if (var3 < 0) {
            return class119.field2914;
        } else if (var3 > 9) {
            return class53.field1399;
        } else if (var3 > 6) {
            return class24.field707;
        } else if (arg0 > ~var3) {
            return class47.field1262;
        } else if (var3 > 0) {
            return class35.field987;
        } else {
            return class115.field2836;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)I", line = 271)
    public static final int method194(byte arg0) {
        field601++;
        if (arg0 <= 20) {
            method190(82, -8);
        }
        return class60.field1557++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 282)
    public final void method172(int arg0) {
        field608++;
        if (this.field612 == null || this.field612.field1099 == 0) {
            return;
        }
        if (this.field612.field1099 == 1) {
            class80 var2 = (class80) this.field612.field1100;
            try {
                var2.method613(0, 1, this.field599, this.field599.length);
                var2.method614(-62);
                try {
                    class125.method940("midibox.loop=" + (this.field619 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method611(124).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field603 + ";", this.field623.field2712, -12396);
                    this.field609 = true;
                } catch (Throwable var5) {
                }
            } catch (Exception var6) {
                try {
                    var2.method614(-73);
                } catch (Exception var4) {
                }
            }
        }
        this.field612 = null;
        int var3 = 65 % ((-arg0 - 41) / 61);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lsb;)V", line = 348)
    public class21(class110 arg0) {
        this.field623 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V", line = 356)
    public static final void method195(byte arg0) {
        field598++;
        class20.field575.method84(-1450);
        for (int var1 = 0; var1 < 32; var1++) {
            class4.field155[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class72.field1833[var2] = 0L;
        }
        if (arg0 < -37) {
            class35.field1011 = 0;
        }
    }
}
