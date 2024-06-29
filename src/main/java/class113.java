import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class113 extends class425 {

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
    private int field2023;

    @OriginalMember(owner = "client!qea", name = "r", descriptor = "Z")
    private boolean field2029;

    @OriginalMember(owner = "client!qea", name = "t", descriptor = "I")
    private int field2031;

    @OriginalMember(owner = "client!qea", name = "p", descriptor = "I")
    private int field2027;

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "I")
    private int field2022;

    @OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
    private int field2025;

    @OriginalMember(owner = "client!qea", name = "x", descriptor = "I")
    private int field2035;

    @OriginalMember(owner = "client!qea", name = "u", descriptor = "Z")
    private boolean field2032;

    @OriginalMember(owner = "client!qea", name = "m", descriptor = "I")
    private int field2024;

    @OriginalMember(owner = "client!qea", name = "y", descriptor = "I")
    private int field2036;

    @OriginalMember(owner = "client!qea", name = "s", descriptor = "I")
    private int field2030;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
    private int field2021;

    @OriginalMember(owner = "client!qea", name = "o", descriptor = "S")
    public static short field2026 = 1;

    @OriginalMember(owner = "client!qea", name = "z", descriptor = "I")
    public static int field2037 = 0;

    @OriginalMember(owner = "client!qea", name = "q", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!qea", name = "v", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!qea", name = "w", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!qea", name = "A", descriptor = "Ld;")
    public static class136 field2038;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lqh;I)V")
    public final void method1011(class61 arg0, int arg1) {
        arg0.method693((byte) 106, 3);
        field2034++;
        arg0.method693((byte) 106, this.field2023);
        arg0.method693((byte) 106, this.field2029 ? 1 : 0);
        if (arg1 != 1) {
            method1012(12);
        }
        arg0.method693((byte) 106, this.field2031);
        arg0.method693((byte) 106, this.field2027);
        arg0.method693((byte) 106, this.field2022);
        arg0.method693((byte) 106, this.field2025);
        arg0.method693((byte) 106, this.field2036);
        arg0.method693((byte) 106, this.field2032 ? 1 : 0);
        arg0.method745(this.field2024, 128);
        arg0.method693((byte) 106, this.field2035);
        arg0.method691((byte) -101, this.field2030);
        arg0.method715(this.field2021, 1949991176);
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public static void method1012(int arg0) {
        if (arg0 < -116) {
            field2038 = null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1013(int arg0, int arg1, byte arg2) {
        field2033++;
        if (arg2 < 44) {
            return true;
        } else {
            return (arg1 & 0x10000) != 0;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V")
    public static final void method1014(byte arg0) {
        field2028++;
        if (class604.field8775.field795 && class180.field2911.field4419 != -1) {
            class22.method451(-85, class180.field2911.field4419, class180.field2911.field4425);
        }
        int var1 = -96 / ((32 - arg0) / 37);
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(ZLn;)V")
    public class113(boolean arg0, class17 arg1) {
        if (arg0) {
            if (class17.field780.startsWith("win")) {
                this.field2023 = 1;
            } else if (class17.field780.startsWith("mac")) {
                this.field2023 = 2;
            } else if (class17.field780.startsWith("linux")) {
                this.field2023 = 3;
            } else {
                this.field2023 = 4;
            }
            if (class17.field787.startsWith("amd64") || class17.field787.startsWith("x86_64")) {
                this.field2029 = true;
            } else {
                this.field2029 = false;
            }
            if (this.field2023 == 1) {
                if (class17.field781.indexOf("4.0") != -1) {
                    this.field2031 = 1;
                } else if (class17.field781.indexOf("4.1") != -1) {
                    this.field2031 = 2;
                } else if (class17.field781.indexOf("4.9") != -1) {
                    this.field2031 = 3;
                } else if (class17.field781.indexOf("5.0") != -1) {
                    this.field2031 = 4;
                } else if (class17.field781.indexOf("5.1") != -1) {
                    this.field2031 = 5;
                } else if (class17.field781.indexOf("6.0") != -1) {
                    this.field2031 = 6;
                } else if (class17.field781.indexOf("6.1") != -1) {
                    this.field2031 = 7;
                }
            } else if (this.field2023 == 2) {
                if (class17.field781.indexOf("10.4") != -1) {
                    this.field2031 = 20;
                } else if (class17.field781.indexOf("10.5") != -1) {
                    this.field2031 = 21;
                } else if (class17.field781.indexOf("10.6") != -1) {
                    this.field2031 = 22;
                }
            }
            if (class17.field778.toLowerCase().indexOf("sun") != -1) {
                this.field2027 = 1;
            } else if (class17.field778.toLowerCase().indexOf("microsoft") != -1) {
                this.field2027 = 2;
            } else if (class17.field778.toLowerCase().indexOf("apple") == -1) {
                this.field2027 = 4;
            } else {
                this.field2027 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class17.field793.length()) {
                    char var5 = class17.field793.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field2022 = var4;
            int var6 = class17.field793.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class17.field793.length() > var6) {
                    char var8 = class17.field793.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + var8 - 48;
                    var6++;
                }
            } catch (Exception var15) {
            }
            this.field2025 = var7;
            int var9 = 0;
            int var10 = class17.field793.indexOf(95, 4) + 1;
            try {
                while (class17.field793.length() > var10) {
                    char var11 = class17.field793.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10++;
                    var9 = var9 * 10 + var11 - 48;
                }
            } catch (Exception var14) {
            }
            if (this.field2022 > 3) {
                this.field2035 = class114.field2051;
            } else {
                this.field2035 = 0;
            }
            if (arg1.field795) {
                this.field2032 = false;
            } else {
                this.field2032 = true;
            }
            this.field2024 = class681.field9649;
            this.field2036 = var9;
            try {
                this.field2030 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var13) {
                this.field2030 = 0;
            }
            try {
                this.field2021 = HardwareInfo.getPackedBasicCPUInfo();
            } catch (Throwable var12) {
            }
        }
    }
}
