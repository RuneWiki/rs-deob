import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class606 extends class66 {

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    private int field8607;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "Z")
    private boolean field8598;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    private int field8596;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    private int field8593;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    private int field8594;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    private int field8597;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    private int field8616;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "Z")
    private boolean field8612;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    private int field8617;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    private int field8601;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    private int field8599;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "Ljava/lang/String;")
    private String field8611;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "Ljava/lang/String;")
    private String field8602;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "Ljava/lang/String;")
    private String field8619;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Ljava/lang/String;")
    private String field8595;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "Lws;")
    public static class328 field8605 = new class328(3, 7);

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "Lsba;")
    public static class200 field8620 = new class200(8);

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    private int field8603;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    private int field8604;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    private int field8608;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    private int field8613;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "I")
    private int field8618;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    private int field8621;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)I")
    public final int method3525(byte arg0) {
        field8606++;
        byte var2 = 23;
        int var3 = var2 + class304.method2107(-94, this.field8619);
        int var4 = -83 / (-arg0 / 39);
        int var5 = var3 + class304.method2107(-90, this.field8611);
        int var6 = var5 + class304.method2107(47, this.field8595);
        return var6 + class304.method2107(98, this.field8602);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
    private final void method3526(byte arg0) {
        field8614++;
        if (this.field8619.length() > 40) {
            this.field8619 = this.field8619.substring(0, 40);
        }
        if (this.field8611.length() > 40) {
            this.field8611 = this.field8611.substring(0, 40);
        }
        if (this.field8595.length() > 10) {
            this.field8595 = this.field8595.substring(0, 10);
        }
        if (this.field8602.length() > 10) {
            this.field8602 = this.field8602.substring(0, 10);
        }
        if (arg0 <= 2) {
            this.method3526((byte) 88);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Lps;")
    public static final class82 method3527(boolean arg0, int arg1) {
        if (!arg0) {
            method3527(true, -23);
        }
        field8610++;
        if (arg1 == 0) {
            if ((double) class378.field5877 == 3.0D) {
                return class642.field9031;
            }
            if ((double) class378.field5877 == 4.0D) {
                return class238.field3776;
            }
            if ((double) class378.field5877 == 6.0D) {
                return class286.field4544;
            }
            if ((double) class378.field5877 >= 8.0D) {
                return class338.field5492;
            }
        } else if (arg1 == 1) {
            if ((double) class378.field5877 == 3.0D) {
                return class286.field4544;
            }
            if ((double) class378.field5877 == 4.0D) {
                return class338.field5492;
            }
            if ((double) class378.field5877 == 6.0D) {
                return class294.field4614;
            }
            if ((double) class378.field5877 >= 8.0D) {
                return class522.field7574;
            }
        } else if (arg1 == 2) {
            if ((double) class378.field5877 == 3.0D) {
                return class294.field4614;
            }
            if ((double) class378.field5877 == 4.0D) {
                return class522.field7574;
            }
            if ((double) class378.field5877 == 6.0D) {
                return class182.field3063;
            }
            if ((double) class378.field5877 >= 8.0D) {
                return class413.field6346;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILie;)V")
    public final void method3528(int arg0, class6 arg1) {
        arg1.method65(5, -77);
        field8615++;
        arg1.method65(this.field8607, -77);
        arg1.method65(this.field8598 ? 1 : 0, -77);
        arg1.method65(this.field8596, -77);
        arg1.method65(this.field8593, -77);
        arg1.method65(this.field8594, -77);
        arg1.method65(this.field8597, -77);
        arg1.method65(this.field8616, -77);
        arg1.method65(this.field8612 ? 1 : 0, -77);
        arg1.method25(true, this.field8617);
        arg1.method65(this.field8601, -77);
        arg1.method47(this.field8599, -1088828144);
        arg1.method25(true, this.field8621);
        arg1.method65(this.field8613, -77);
        arg1.method65(this.field8608, -77);
        arg1.method65(this.field8618, -77);
        arg1.method90(4, this.field8619);
        arg1.method90(4, this.field8611);
        arg1.method90(4, this.field8595);
        arg1.method90(4, this.field8602);
        arg1.method65(this.field8604, -77);
        arg1.method25(true, this.field8603);
        if (arg0 > -114) {
            method3527(true, 122);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII[B)Ljava/lang/String;")
    public static final String method3529(byte arg0, int arg1, int arg2, byte[] arg3) {
        field8600++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = arg2;
        int var7 = arg1 + arg2;
        while (var7 > var6) {
            int var8 = arg3[var6++] & 0xFF;
            int var9;
            if (var8 >= 128) {
                if (var8 < 192) {
                    var9 = 65533;
                } else if (var8 >= 224) {
                    if (var8 >= 240) {
                        if (var8 >= 248) {
                            var9 = 65533;
                        } else if (var7 > (var6 + 2) && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128 && (arg3[var6 + 2] & 0xC0) == 128) {
                            int var10 = (var8 & 0x7) << 18 | arg3[var6++] & 0x3F << 12 | arg3[var6++] & 0x3F << 6 | arg3[var6++] & 0x3F;
                            if (var10 >= 65536 && var10 <= 1114111) {
                                var9 = 65533;
                            } else {
                                var9 = 65533;
                            }
                        } else {
                            var9 = 65533;
                        }
                    } else if ((var6 + 1) < var7 && (arg3[var6] & 0xC0) == 128 && (arg3[var6 + 1] & 0xC0) == 128) {
                        var9 = (var8 & 0xF) << 12 | arg3[var6++] & 0x3F << 6 | arg3[var6++] & 0x3F;
                        if (var9 < 2048) {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var7 > var6 && (arg3[var6] & 0xC0) == 128) {
                    var9 = (var8 & 0x1F) << 6 | arg3[var6++] & 0x3F;
                    if (var9 < 128) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 == 0) {
                var9 = 65533;
            } else {
                var9 = var8;
            }
            var4[var5++] = (char) var9;
        }
        if (arg0 == 57) {
            return new String(var4, 0, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Z)V")
    public static final void method3530(String arg0, int arg1, int arg2, String arg3, boolean arg4) {
        field8609++;
        if (arg1 != -29374) {
            field8622 = -69;
        }
        class622.method3606(arg4, 121, -1, true, arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method3531(int arg0) {
        field8620 = null;
        if (arg0 != 128) {
            method3527(true, -42);
        }
        field8605 = null;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class606() {
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(ZLk;)V")
    public class606(boolean arg0, class525 arg1) {
        if (arg0) {
            if (class525.field7660.startsWith("win")) {
                this.field8607 = 1;
            } else if (class525.field7660.startsWith("mac")) {
                this.field8607 = 2;
            } else if (class525.field7660.startsWith("linux")) {
                this.field8607 = 3;
            } else {
                this.field8607 = 4;
            }
            if (class525.field7659.startsWith("amd64") || class525.field7659.startsWith("x86_64")) {
                this.field8598 = true;
            } else {
                this.field8598 = false;
            }
            if (this.field8607 == 1) {
                if (class525.field7664.indexOf("4.0") != -1) {
                    this.field8596 = 1;
                } else if (class525.field7664.indexOf("4.1") != -1) {
                    this.field8596 = 2;
                } else if (class525.field7664.indexOf("4.9") != -1) {
                    this.field8596 = 3;
                } else if (class525.field7664.indexOf("5.0") != -1) {
                    this.field8596 = 4;
                } else if (class525.field7664.indexOf("5.1") != -1) {
                    this.field8596 = 5;
                } else if (class525.field7664.indexOf("6.0") != -1) {
                    this.field8596 = 6;
                } else if (class525.field7664.indexOf("6.1") != -1) {
                    this.field8596 = 7;
                }
            } else if (this.field8607 == 2) {
                if (class525.field7664.indexOf("10.4") != -1) {
                    this.field8596 = 20;
                } else if (class525.field7664.indexOf("10.5") != -1) {
                    this.field8596 = 21;
                } else if (class525.field7664.indexOf("10.6") != -1) {
                    this.field8596 = 22;
                }
            }
            if (class525.field7663.toLowerCase().indexOf("sun") != -1) {
                this.field8593 = 1;
            } else if (class525.field7663.toLowerCase().indexOf("microsoft") != -1) {
                this.field8593 = 2;
            } else if (class525.field7663.toLowerCase().indexOf("apple") == -1) {
                this.field8593 = 4;
            } else {
                this.field8593 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class525.field7670.length()) {
                    char var5 = class525.field7670.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + (var5 - 48);
                    var3++;
                }
            } catch (Exception var15) {
            }
            this.field8594 = var4;
            int var6 = 0;
            int var7 = class525.field7670.indexOf(46, 2) + 1;
            try {
                while (var7 < class525.field7670.length()) {
                    char var8 = class525.field7670.charAt(var7);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7++;
                    var6 = var6 * 10 + (var8 - 48);
                }
            } catch (Exception var14) {
            }
            this.field8597 = var6;
            int var9 = 0;
            int var10 = class525.field7670.indexOf(95, 4) + 1;
            try {
                while (class525.field7670.length() > var10) {
                    char var11 = class525.field7670.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9 = var9 * 10 + var11 - 48;
                    var10++;
                }
            } catch (Exception var13) {
            }
            this.field8616 = var9;
            if (arg1.field7655) {
                this.field8612 = false;
            } else {
                this.field8612 = true;
            }
            this.field8617 = class204.field3324;
            if (this.field8594 > 3) {
                this.field8601 = class369.field5783;
            } else {
                this.field8601 = 0;
            }
            try {
                this.field8599 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field8599 = 0;
            }
        }
        if (this.field8611 == null) {
            this.field8611 = "";
        }
        if (this.field8602 == null) {
            this.field8602 = "";
        }
        if (this.field8619 == null) {
            this.field8619 = "";
        }
        if (this.field8595 == null) {
            this.field8595 = "";
        }
        this.method3526((byte) 58);
    }
}
