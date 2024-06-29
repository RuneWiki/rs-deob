import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class87 implements Runnable {

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Lia;")
    private class613 field1120 = new class222();

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "Lia;")
    private class613 field1142 = null;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "[[Ljava/lang/String;")
    public static String[][] field1123 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field1122 = 0;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field1139 = 0;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    private int field1137;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "J")
    private long field1136;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "J")
    private long field1138;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Ljf;")
    public static class224 field1131;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "Lnm;")
    private class496 field1143;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "Ljava/lang/String;")
    private String field1140;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Z")
    private volatile boolean field1126;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "Z")
    private boolean field1133;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 4)
    public final synchronized void method615(int arg0) {
        if (arg0 != 0) {
            this.method616(-54);
        }
        field1124++;
        this.field1133 = true;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I", line = 16)
    public final int method616(int arg0) {
        if (arg0 == -4604) {
            field1130++;
            return this.field1141;
        } else {
            return -119;
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)I", line = 33)
    public final int method617(int arg0) {
        if (arg0 != 16777215) {
            this.field1120 = null;
        }
        field1125++;
        return this.field1137;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V", line = 45)
    public final void method618(int arg0) {
        field1127++;
        if (arg0 != -32420) {
            field1123 = null;
        }
        this.field1126 = true;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)Lnm;", line = 56)
    public final class496 method619(int arg0) {
        if (arg0 != 0) {
            field1123 = null;
        }
        field1132++;
        return this.field1143;
    }

    @OriginalMember(owner = "client!kl", name = "run", descriptor = "()V", line = 68)
    public final void run() {
        field1116++;
        while (!this.field1126) {
            long var1 = class109.method731(80);
            synchronized (this) {
                try {
                    this.field1141++;
                    if (this.field1120 instanceof class222) {
                        this.field1120.method1529(-27763, this.field1133);
                    } else {
                        long var4 = class109.method731(54);
                        if (class638.field8979 == null || this.field1142 == null || this.field1142.method1537((byte) 127) == 0 || this.field1136 < (var4 - ((long) this.field1142.method1537((byte) -107)))) {
                            if (this.field1142 != null) {
                                this.field1133 = true;
                                this.field1142.method1528(-28323);
                                this.field1142 = null;
                            }
                            if (this.field1133) {
                                class127.method926(-1);
                                if (class638.field8979 != null) {
                                    class638.field8979.method417(0);
                                }
                            }
                            this.field1120.method1529(-27763, this.field1133 || class638.field8979 != null && class638.field8979.method424());
                        } else {
                            int var6 = (int) ((var4 - this.field1136) * 255L / (long) this.field1142.method1537((byte) -91));
                            int var7 = 255 - var6;
                            class127.method926(-1);
                            int var8 = var6 << 24 | 0xFFFFFF;
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class638.field8979.method417(0);
                            class112 var10 = class638.field8979.method502(class638.field8980, class512.field7325, true);
                            class638.field8979.method496((byte) 76, var10);
                            this.field1142.method1529(-27763, true);
                            class638.field8979.method413();
                            var10.method795(0, 0, 0, var9, 1);
                            class638.field8979.method496((byte) 94, var10);
                            class638.field8979.method417(0);
                            this.field1120.method1529(-27763, true);
                            class638.field8979.method413();
                            var10.method795(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class638.field8979 != null && !(this.field1120 instanceof class222)) {
                                class638.field8979.method416((byte) -63);
                            }
                        } catch (class138 var18) {
                            class329.method2129(var18.getMessage() + " (Recovered) " + class364.field5270.method2065((byte) -29), false, var18);
                            class226.method1559((byte) 7, true, 0);
                        }
                    }
                    Container var12;
                    if (class463.field6617 != null) {
                        var12 = class463.field6617;
                    } else if (class535.field7544 == null) {
                        var12 = class119.field1498;
                    } else {
                        var12 = class535.field7544;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class463.field6617 == var12) {
                        class463.field6617.getInsets();
                    }
                    this.field1133 = false;
                    if (class638.field8979 != null && !(this.field1120 instanceof class222) && this.field1143.method2901(127) < class496.field7056.method2901(116)) {
                        class151.method1077(128);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class109.method731(85);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class117.method820(false, (long) var15);
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)Z", line = 193)
    public final synchronized boolean method620(int arg0) {
        field1129++;
        int var2 = 96 / ((-arg0 - 3) / 48);
        return this.field1120.method1533(this.field1136, (byte) 104);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 207)
    public static void method621(byte arg0) {
        field1131 = null;
        field1123 = null;
        if (arg0 != -47) {
            field1122 = -87;
        }
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)I", line = 221)
    public final int method622(int arg0) {
        field1119++;
        if (this.field1143 == null) {
            return 0;
        }
        int var2 = this.field1143.method2901(120);
        if (this.field1143.field7032 && this.field1137 < this.field1143.field7036) {
            return this.field1137 + 1;
        } else if (var2 >= arg0 && var2 < class117.field1458.length - 1) {
            return this.field1143.field7037 == this.field1137 ? this.field1143.field7036 : this.field1143.field7037;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)Ljava/lang/String;", line = 250)
    public final String method623(byte arg0) {
        field1121++;
        if (arg0 != -104) {
            this.method625(-73L, null, null, true, 65);
        }
        return this.field1140;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(B)J", line = 261)
    public final long method624(byte arg0) {
        if (arg0 == 119) {
            field1128++;
            return this.field1138;
        } else {
            return 43L;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(JLnm;Ljava/lang/String;ZI)V", line = 284)
    public final synchronized void method625(long arg0, class496 arg1, String arg2, boolean arg3, int arg4) {
        field1134++;
        this.field1140 = arg2;
        if (!arg3) {
            this.field1126 = false;
        }
        this.field1137 = arg4;
        this.field1138 = arg0;
        this.field1143 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lia;B)V", line = 307)
    public final synchronized void method626(class613 arg0, byte arg1) {
        if (arg1 != 90) {
            field1123 = null;
        }
        this.field1142 = this.field1120;
        field1118++;
        this.field1120 = arg0;
        this.field1136 = class109.method731(arg1 ^ 0x6D);
    }
}
