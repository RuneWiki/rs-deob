import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class419 {

    @OriginalMember(owner = "client!et", name = "m", descriptor = "I")
    public int field6299;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "Z")
    public boolean field6307;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "Z")
    public boolean field6304;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "[S")
    public short[] field6293;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "I")
    public int field6302;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    private int field6300;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "[B")
    public static byte[] field6298 = new byte[16384];

    @OriginalMember(owner = "client!et", name = "k", descriptor = "[I")
    public static int[] field6297 = new int[32];

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    private int field6287;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    private int field6290;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    private int field6295;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "I")
    private int field6303;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "Lkt;")
    public class107 field6301;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "Ltl;")
    public static class436 field6306;

    static {
        new class475("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V", line = 5)
    private final void method2513(int arg0) {
        field6291++;
        int var2 = this.field6302;
        if (var2 == 2) {
            this.field6303 = 2048;
            this.field6287 = 2048;
            this.field6295 = 0;
            this.field6290 = 1;
        } else if (var2 == 3) {
            this.field6287 = 2048;
            this.field6290 = 1;
            this.field6303 = 4096;
            this.field6295 = 0;
        } else if (var2 == 4) {
            this.field6295 = 0;
            this.field6290 = 4;
            this.field6303 = 2048;
            this.field6287 = 2048;
        } else if (var2 == 5) {
            this.field6287 = 2048;
            this.field6295 = 0;
            this.field6290 = 4;
            this.field6303 = 8192;
        } else if (var2 == 12) {
            this.field6303 = 2048;
            this.field6295 = 0;
            this.field6287 = 2048;
            this.field6290 = 2;
        } else if (var2 == 13) {
            this.field6295 = 0;
            this.field6287 = 2048;
            this.field6290 = 2;
            this.field6303 = 8192;
        } else if (var2 == 10) {
            this.field6295 = 1536;
            this.field6287 = 512;
            this.field6290 = 3;
            this.field6303 = 2048;
        } else if (var2 == 11) {
            this.field6295 = 1536;
            this.field6290 = 3;
            this.field6303 = 4096;
            this.field6287 = 512;
        } else if (var2 == 6) {
            this.field6295 = 1280;
            this.field6287 = 768;
            this.field6303 = 2048;
            this.field6290 = 3;
        } else if (var2 == 7) {
            this.field6290 = 3;
            this.field6295 = 1280;
            this.field6303 = 4096;
            this.field6287 = 768;
        } else if (var2 == 8) {
            this.field6287 = 1024;
            this.field6303 = 2048;
            this.field6290 = 3;
            this.field6295 = 1024;
        } else if (var2 == 9) {
            this.field6290 = 3;
            this.field6287 = 1024;
            this.field6295 = 1024;
            this.field6303 = 4096;
        } else if (var2 == 14) {
            this.field6303 = 2048;
            this.field6287 = 768;
            this.field6295 = 1280;
            this.field6290 = 1;
        } else if (var2 == 15) {
            this.field6287 = 512;
            this.field6303 = 4096;
            this.field6295 = 1536;
            this.field6290 = 1;
        } else if (var2 == 16) {
            this.field6295 = 1792;
            this.field6303 = 8192;
            this.field6287 = 256;
            this.field6290 = 1;
        } else {
            this.field6295 = 0;
            this.field6303 = 2048;
            this.field6290 = 0;
            this.field6287 = 2048;
        }
        if (arg0 != 13439) {
            this.method2519(120, false, -77);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V", line = 206)
    public static final void method2514(int arg0) {
        field6289++;
        class71 var1 = null;
        try {
            if (arg0 != 29472) {
                method2514(76);
            }
            class281 var2 = class483.field7077.method2589("2", true);
            while (var2.field4032 == 0) {
                class246.method1659((byte) 117, 1L);
            }
            if (var2.field4032 == 1) {
                var1 = (class71) var2.field4030;
                byte[] var3 = new byte[(int) var1.method409((byte) -75)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method411(var4, (byte) -110, var3.length - var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class434.method2612(false, new class209(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method410(-122);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V", line = 263)
    public static void method2515(int arg0) {
        if (arg0 != 4096) {
            method2517(92);
        }
        field6297 = null;
        field6306 = null;
        field6298 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lqa;IBIIII)V", line = 275)
    private final void method2516(class162 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6301 = arg0.method1084(arg6, arg3, arg1, arg5, arg4, 1.0F);
        field6288++;
        if (arg2 <= 66) {
            this.field6290 = -56;
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)I", line = 291)
    public static final int method2517(int arg0) {
        if (arg0 != 1000) {
            field6298 = null;
        }
        field6292++;
        try {
            if (class164.field2420 == 0) {
                if (class256.method1708((byte) 118) - 5000L < class217.field3176) {
                    return 0;
                }
                class59.field887 = class483.field7077.method2598(class375.field5717, class484.field7104, (byte) 123);
                class8.field109 = class256.method1708((byte) 118);
                class164.field2420 = 1;
            }
            if (class8.field109 + 30000L < class256.method1708((byte) 118)) {
                return class307.method1933(1000, 32033);
            }
            if (class164.field2420 == 1) {
                if (class59.field887.field4032 == 2) {
                    return class307.method1933(1001, 32033);
                }
                if (class59.field887.field4032 != 1) {
                    return -1;
                }
                class90.field1361 = new class376((Socket) class59.field887.field4030, class483.field7077);
                class59.field887 = null;
                int var1 = 0;
                class356.field5471.field3037 = 0;
                if (class76.field1131) {
                    var1 = class411.field6176;
                }
                class356.field5471.method1410(class46.field742.field4730, -27645);
                class356.field5471.method1415(var1, (byte) -78);
                class90.field1361.method2311(class356.field5471.field3037, class356.field5471.field3036, 4900, 0);
                class107.method664(128);
                int var2 = class90.field1361.method2306((byte) 77);
                class107.method664(128);
                if (var2 != 0) {
                    return class307.method1933(var2, arg0 + 31033);
                }
                class164.field2420 = 2;
            }
            if (class164.field2420 == 2) {
                if (class90.field1361.method2310(arg0 - 1092) < 2) {
                    return -1;
                }
                class487.field7205 = class90.field1361.method2306((byte) -128);
                class487.field7205 <<= 0x8;
                class487.field7205 += class90.field1361.method2306((byte) -93);
                class426.field6399 = new byte[class487.field7205];
                class169.field2508 = 0;
                class164.field2420 = 3;
            }
            if (class164.field2420 != 3) {
                return -1;
            }
            int var3 = class90.field1361.method2310(arg0 - 897);
            if (var3 < 1) {
                return -1;
            }
            if ((class487.field7205 - class169.field2508) < var3) {
                var3 = class487.field7205 - class169.field2508;
            }
            class90.field1361.method2308(class426.field6399, class169.field2508, var3, 100);
            class169.field2508 += var3;
            if (class169.field2508 < class487.field7205) {
                return -1;
            } else if (class139.method925(arg0 - 1110, class426.field6399)) {
                class92.field1377 = new class412[class213.field3113];
                int var4 = 0;
                for (int var5 = class89.field1355; var5 <= class26.field278; var5++) {
                    class412 var6 = class450.method2717((byte) 86, var5);
                    if (var6 != null) {
                        class92.field1377[var4++] = var6;
                    }
                }
                class474.field6986 = 0;
                class367.field5610 = null;
                class90.field1361.method2312(false);
                class353.field5404 = 0;
                class164.field2420 = 0;
                class426.field6399 = null;
                class90.field1361 = null;
                class217.field3176 = class256.method1708((byte) 118);
                return 0;
            } else {
                return class307.method1933(1002, arg0 ^ 0x7EC9);
            }
        } catch (IOException var7) {
            return class307.method1933(1003, 32033);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIII)V", line = 420)
    public final void method2518(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6308++;
        if (arg4 != 768) {
            this.field6299 = 76;
        }
        this.field6295 = arg1;
        this.field6303 = arg0;
        this.field6287 = arg2;
        this.field6290 = arg3;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IZI)V", line = 437)
    public final void method2519(int arg0, boolean arg1, int arg2) {
        field6305++;
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field6303 * arg2 / 50 + this.field6300 & 0x7FF;
            int var6 = this.field6290;
            if (var6 == 1) {
                var4 = (class457.field6760[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class471.field6948[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        if (arg0 != 2) {
            this.field6303 = -9;
        }
        this.field6301.method659((float) (this.field6295 + (this.field6287 * var4 >> 11)) / 2048.0F, (byte) -9);
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V", line = 519)
    public static final void method2520(int arg0) {
        int var1 = -61 % ((-arg0 - 52) / 58);
        if (class76.field1130 == null || class318.field4564 == null) {
            class76.field1130 = new int[256];
            class318.field4564 = new int[256];
            for (int var2 = 0; var2 < 256; var2++) {
                double var3 = (double) var2 / 255.0D * 6.283185307179586D;
                class76.field1130[var2] = (int) (Math.sin(var3) * 4096.0D);
                class318.field4564[var2] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        field6294++;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V", line = 548)
    protected class419() {
        if (class471.field6948 == null) {
            class474.method2835((byte) -111);
        }
        this.method2513(13439);
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lqa;Ldh;I)V", line = 568)
    public class419(class162 arg0, class209 arg1, int arg2) {
        if (class471.field6948 == null) {
            class474.method2835((byte) -103);
        }
        this.field6299 = arg1.method1428(32122);
        this.field6307 = (this.field6299 & 0x8) != 0;
        this.field6304 = (this.field6299 & 0x10) != 0;
        this.field6299 &= 0x7;
        int var4 = arg1.method1450((byte) 111) << arg2;
        int var5 = arg1.method1450((byte) 98) << arg2;
        int var6 = arg1.method1450((byte) 66) << arg2;
        int var7 = arg1.method1428(32122);
        int var8 = var7 * 2 + 1;
        this.field6293 = new short[var8];
        for (int var9 = 0; var9 < this.field6293.length; var9++) {
            short var13 = (short) arg1.method1450((byte) 41);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field6293[var9] = (short) class18.method119(var15, var14 << 8);
        }
        int var10 = (var7 << class192.field2815) + class143.field2134;
        int var11 = class508.field7410 == null ? class263.field3858[class491.method2935(arg1.method1450((byte) 118), 0) & 0xFFFF] : class508.field7410[arg1.method1450((byte) 105)];
        int var12 = arg1.method1428(32122);
        this.field6302 = var12 & 0x1F;
        this.field6300 = (var12 & 0xE0) << 3;
        if (this.field6302 != 31) {
            this.method2513(13439);
        }
        this.method2516(arg0, var5, (byte) 103, var6, var11, var10, var4);
    }
}
