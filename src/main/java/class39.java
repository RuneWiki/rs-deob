import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class39 {

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    private int field766 = 0;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "[Laa;")
    public class35[] field751;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "[Z")
    public static boolean[] field747 = new boolean[5];

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "S")
    public static short field765 = 1;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field769 = new String[100];

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "J")
    private long field753;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Laa;")
    private class35 field746;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "Laa;")
    private class35 field767;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "[Lvk;")
    public static class197[] field758;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)Laa;", line = 5)
    public final class35 method300(int arg0) {
        field759++;
        if (this.field766 > 0 && this.field751[this.field766 - 1] != this.field767) {
            class35 var2 = this.field767;
            this.field767 = var2.field701;
            return var2;
        }
        class35 var3;
        do {
            if (this.field766 >= this.field752) {
                if (arg0 != 1) {
                    return (class35) null;
                }
                return null;
            }
            var3 = this.field751[this.field766++].field701;
        } while (this.field751[this.field766 - 1] == var3);
        this.field767 = var3.field701;
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B[Laa;)I", line = 39)
    public final int method301(byte arg0, class35[] arg1) {
        if (arg0 != 42) {
            field760 = 89;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field752; var4++) {
            class35 var5 = this.field751[var4];
            for (class35 var6 = var5.field701; var6 != var5; var6 = var6.field701) {
                arg1[var3++] = var6;
            }
        }
        field755++;
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 71)
    public final void method302(byte arg0) {
        for (int var2 = 0; var2 < this.field752; var2++) {
            class35 var3 = this.field751[var2];
            while (true) {
                class35 var4 = var3.field701;
                if (var3 == var4) {
                    break;
                }
                var4.method278((byte) -105);
            }
        }
        if (arg0 < 122) {
            this.field766 = 40;
        }
        this.field746 = null;
        field757++;
        this.field767 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(JB)Laa;", line = 103)
    public final class35 method303(long arg0, byte arg1) {
        this.field753 = arg0;
        class35 var4 = this.field751[(int) ((long) (this.field752 - 1) & arg0)];
        if (arg1 <= 100) {
            this.field753 = 70L;
        }
        this.field746 = var4.field701;
        field768++;
        while (this.field746 != var4) {
            if (this.field746.field702 == arg0) {
                class35 var5 = this.field746;
                this.field746 = this.field746.field701;
                return var5;
            }
            this.field746 = this.field746.field701;
        }
        this.field746 = null;
        return null;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)I", line = 131)
    public final int method304(int arg0) {
        field748++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 > -108) {
            return -46;
        }
        while (var3 < this.field752) {
            class35 var4 = this.field751[var3];
            for (class35 var5 = var4.field701; var5 != var4; var5 = var5.field701) {
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V", line = 165)
    public static void method305(int arg0) {
        if (arg0 == 6489) {
            field747 = null;
            field769 = null;
            field758 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)Laa;", line = 191)
    public final class35 method306(int arg0) {
        field750++;
        this.field766 = arg0;
        return this.method300(arg0 ^ 0x1);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(JI)V", line = 202)
    public static final void method307(long arg0, int arg1) {
        field754++;
        if (!class6.field136) {
            class120.field2090 += (float) arg0 * class69.field1467 / 40.0F;
            class95.field1709 += (float) arg0 * class199.field3185 / 40.0F;
        }
        int var3 = class307.field4651 + class66.field1265.field1869;
        int var4 = class66.field1265.field1872 + class26.field509;
        if ((class221.field3503 - var3) < -500 || class221.field3503 - var3 > 500 || class230.field3630 - var4 < -500 || class230.field3630 - var4 > 500) {
            class230.field3630 = var4;
            class221.field3503 = var3;
        }
        if (class221.field3503 != var3) {
            int var5 = var3 - class221.field3503;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class221.field3503 += var6;
        }
        if (class230.field3630 != var4) {
            int var7 = var4 - class230.field3630;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class230.field3630 += var8;
        }
        int var9 = -74 % ((arg1 + 60) / 37);
        class103.method670(true);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)I", line = 294)
    public final int method308(byte arg0) {
        field761++;
        if (arg0 != -87) {
            field747 = (boolean[]) null;
        }
        return this.field752;
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)V", line = 306)
    public static final void method309(int arg0) {
        class267.field4121 = (int[][][]) null;
        class269.field4162 = (byte[][][]) null;
        class46.field957 = (byte[][][]) null;
        class134.field2253 = null;
        class328.field5032 = null;
        class325.field4968 = (byte[][][]) null;
        class153.field2507 = (byte[][][]) null;
        field763++;
        if (arg0 != -24430) {
            field747 = (boolean[]) null;
        }
        class69.field1474 = null;
        class319.field4874 = null;
        class331.field5079 = null;
        class160.field2607 = (byte[][][]) null;
        class50.field1014 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(JLaa;I)V", line = 333)
    public final void method310(long arg0, class35 arg1, int arg2) {
        if (arg1.field703 != null) {
            arg1.method278((byte) -105);
        }
        if (arg2 != 25357) {
            method309(-85);
        }
        field756++;
        class35 var5 = this.field751[(int) ((long) (this.field752 - 1) & arg0)];
        arg1.field701 = var5;
        arg1.field703 = var5.field703;
        arg1.field702 = arg0;
        arg1.field703.field701 = arg1;
        arg1.field701.field703 = arg1;
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)Laa;", line = 356)
    public final class35 method311(int arg0) {
        field764++;
        if (this.field746 == null) {
            return null;
        }
        class35 var2 = this.field751[(int) ((long) (this.field752 - arg0) & this.field753)];
        while (this.field746 != var2) {
            if (this.field746.field702 == this.field753) {
                class35 var3 = this.field746;
                this.field746 = this.field746.field701;
                return var3;
            }
            this.field746 = this.field746.field701;
        }
        this.field746 = null;
        return null;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(I)V", line = 382)
    public class39(int arg0) {
        this.field751 = new class35[arg0];
        this.field752 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class35 var3 = this.field751[var2] = new class35();
            var3.field701 = var3;
            var3.field703 = var3;
        }
    }
}
