import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class391 {

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Z")
    public boolean field5496;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Z")
    public boolean field5500;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "[S")
    public short[] field5505;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public int field5492;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    private int field5495;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Ltn;")
    public static class60 field5499;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    private int field5486;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    private int field5490;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    private int field5493;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    private int field5501;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "Lls;")
    public class95 field5504;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "[I")
    public static int[] field5502;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BZLjava/lang/String;Loi;)Lku;")
    public static final class259 method2262(byte arg0, boolean arg1, String arg2, class53 arg3) {
        field5503++;
        int var4 = arg3.method429(arg2, -1);
        if (var4 == -1) {
            return new class259(0);
        }
        int[] var5 = arg3.method419(true, var4);
        int var6 = -71 % ((-arg0 - 34) / 35);
        class259 var7 = new class259(var5.length);
        int var8 = 0;
        int var9 = 0;
        while (true) {
            while (var8 < var7.field3839) {
                class403 var10 = new class403(arg3.method426(var4, (byte) 9, var5[var9++]));
                int var11 = var10.method2319((byte) 88);
                int var12 = var10.method2338(0);
                int var13 = var10.method2357((byte) 113);
                if (!arg1 && var13 == 1) {
                    var7.field3839--;
                } else {
                    var7.field3837[var8] = var11;
                    var7.field3840[var8] = var12;
                    var8++;
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static final void method2263(int arg0) {
        field5488++;
        class174 var1 = class311.field4524;
        synchronized (class311.field4524) {
            class311.field4524.method1096((byte) -108);
        }
        class174 var2 = class66.field842;
        synchronized (class66.field842) {
            class66.field842.method1096((byte) 112);
        }
        int var3 = -76 % ((arg0 + 61) / 37);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method2264(byte arg0) {
        field5502 = null;
        if (arg0 > -43) {
            method2268(-46, 19, 59);
        }
        field5499 = null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    private final void method2265(int arg0) {
        field5491++;
        int var2 = this.field5492;
        if (var2 == 2) {
            this.field5486 = 2048;
            this.field5490 = 2048;
            this.field5493 = 0;
            this.field5501 = 1;
        } else if (var2 == 3) {
            this.field5501 = 1;
            this.field5490 = 2048;
            this.field5493 = 0;
            this.field5486 = 4096;
        } else if (var2 == 4) {
            this.field5501 = 4;
            this.field5486 = 2048;
            this.field5490 = 2048;
            this.field5493 = 0;
        } else if (var2 == 5) {
            this.field5486 = 8192;
            this.field5490 = 2048;
            this.field5501 = 4;
            this.field5493 = 0;
        } else if (var2 == 12) {
            this.field5490 = 2048;
            this.field5493 = 0;
            this.field5501 = 2;
            this.field5486 = 2048;
        } else if (var2 == 13) {
            this.field5493 = 0;
            this.field5490 = 2048;
            this.field5501 = 2;
            this.field5486 = 8192;
        } else if (var2 == 10) {
            this.field5490 = 512;
            this.field5486 = 2048;
            this.field5493 = 1536;
            this.field5501 = 3;
        } else if (var2 == 11) {
            this.field5493 = 1536;
            this.field5490 = 512;
            this.field5501 = 3;
            this.field5486 = 4096;
        } else if (var2 == 6) {
            this.field5490 = 768;
            this.field5493 = 1280;
            this.field5501 = 3;
            this.field5486 = 2048;
        } else if (var2 == 7) {
            this.field5493 = 1280;
            this.field5501 = 3;
            this.field5490 = 768;
            this.field5486 = 4096;
        } else if (var2 == 8) {
            this.field5490 = 1024;
            this.field5493 = 1024;
            this.field5501 = 3;
            this.field5486 = 2048;
        } else if (var2 == 9) {
            this.field5490 = 1024;
            this.field5493 = 1024;
            this.field5501 = 3;
            this.field5486 = 4096;
        } else if (var2 == 14) {
            this.field5501 = 1;
            this.field5486 = 2048;
            this.field5490 = 768;
            this.field5493 = 1280;
        } else if (var2 == 15) {
            this.field5493 = 1536;
            this.field5486 = 4096;
            this.field5490 = 512;
            this.field5501 = 1;
        } else if (var2 == 16) {
            this.field5501 = 1;
            this.field5486 = 8192;
            this.field5490 = 256;
            this.field5493 = 1792;
        } else {
            this.field5486 = 2048;
            this.field5490 = 2048;
            this.field5493 = 0;
            this.field5501 = 0;
        }
        if (arg0 != 0) {
            this.field5486 = 42;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILza;IIII)V")
    private final void method2266(int arg0, int arg1, class290 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= 100) {
            this.field5504 = arg2.method380(arg0, arg4, arg5, arg6, arg1, 1.0F);
            field5487++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)V")
    public final void method2267(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5498++;
        this.field5493 = arg4;
        this.field5486 = arg0;
        this.field5490 = arg3;
        if (arg2 != 0) {
            this.method2266(61, -37, null, -19, 75, -50, -86);
        }
        this.field5501 = arg1;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    protected class391() {
        if (class427.field6009 == null) {
            class264.method1677((byte) 100);
        }
        this.method2265(0);
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lza;Lwm;I)V")
    public class391(class290 arg0, class403 arg1, int arg2) {
        if (class427.field6009 == null) {
            class264.method1677((byte) 100);
        }
        this.field5494 = arg1.method2357((byte) 110);
        this.field5496 = (this.field5494 & 0x10) != 0;
        this.field5500 = (this.field5494 & 0x8) != 0;
        this.field5494 &= 0x7;
        int var4 = arg1.method2338(0) << arg2;
        int var5 = arg1.method2338(0) << arg2;
        int var6 = arg1.method2338(0) << arg2;
        int var7 = arg1.method2357((byte) 123);
        int var8 = var7 * 2 + 1;
        this.field5505 = new short[var8];
        for (int var9 = 0; var9 < this.field5505.length; var9++) {
            short var13 = (short) arg1.method2338(0);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field5505[var9] = (short) class170.method1067(var15, var14 << 8);
        }
        int var10 = (var7 << class493.field6970) + class534.field7832;
        int var11 = field5502 == null ? class538.field7872[class517.method3068((byte) -4, arg1.method2338(0)) & 0xFFFF] : field5502[arg1.method2338(0)];
        int var12 = arg1.method2357((byte) 116);
        this.field5492 = var12 & 0x1F;
        this.field5495 = var12 & 0xE0 << 3;
        if (this.field5492 != 31) {
            this.method2265(0);
        }
        this.method2266(var4, var11, arg0, 103, var6, var5, var10);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
    public static final void method2268(int arg0, int arg1, int arg2) {
        class188.field2698++;
        field5497++;
        class61.method498(class294.field4308, arg2);
        class30.field357.method2331(32196, arg1);
        class30.field357.method2327((byte) -30, arg0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZII)V")
    public final void method2269(boolean arg0, int arg1, int arg2) {
        int var4 = -99 % ((34 - arg1) / 52);
        field5506++;
        int var7;
        if (arg0) {
            var7 = 2048;
        } else {
            int var5 = this.field5486 * arg2 / 50 + this.field5495 & 0x7FF;
            int var6 = this.field5501;
            if (var6 == 1) {
                var7 = (class95.field1242[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var7 = class427.field6009[var5] >> 1;
            } else if (var6 == 4) {
                var7 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var7 = var5;
            } else if (var6 == 5) {
                var7 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var7 = 2048;
            }
        }
        this.field5504.method677((float) ((this.field5490 * var7 >> 11) + this.field5493) / 2048.0F, -24673);
    }

    static {
        new class530("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field5499 = new class60(43, 4);
    }
}
