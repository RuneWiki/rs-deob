import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class46 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public int field686 = -1;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    private int field685 = -1;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "[Ljava/lang/String;")
    public String[] field694 = new String[5];

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    private int field691 = -1;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Z")
    public boolean field696 = true;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public int field688 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public int field710 = -1;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public int field702 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
    public boolean field687 = false;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public int field697 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public int field719 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "Z")
    public boolean field720 = true;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public int field690 = -1;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    private int field722 = -1;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public int field706 = -1;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    private int field707 = -1;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "Z")
    public boolean field721 = true;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    private int field725 = -1;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public int field708 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "[I")
    public static int[] field684 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!u", name = "E", descriptor = "Z")
    public static boolean field714 = true;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field718 = 0;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "I")
    public int field716;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    private int field728;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Ljava/lang/String;")
    public String field703;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Ljava/lang/String;")
    public String field711;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
    public int[] field698;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILeb;)V")
    private final void method321(int arg0, int arg1, class371 arg2) {
        if (arg1 == 1) {
            this.field690 = arg2.method2403((byte) 117);
        } else if (arg1 == 2) {
            this.field686 = arg2.method2403((byte) 62);
        } else if (arg1 == 3) {
            this.field711 = arg2.method2422(-1);
        } else if (arg1 == 4) {
            this.field716 = arg2.method2425(45);
        } else if (arg1 == 5) {
            this.field706 = arg2.method2425(-109);
        } else if (arg1 == 6) {
            this.field708 = arg2.method2429(0);
        } else if (arg1 == 7) {
            int var4 = arg2.method2429(0);
            if ((var4 & 0x1) == 0) {
                this.field721 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field687 = true;
            }
        } else if (arg1 == 8) {
            this.field696 = arg2.method2429(0) == 1;
        } else if (arg1 == 9) {
            this.field722 = arg2.method2403((byte) 124);
            if (this.field722 == 65535) {
                this.field722 = -1;
            }
            this.field691 = arg2.method2403((byte) 44);
            if (this.field691 == 65535) {
                this.field691 = -1;
            }
            this.field712 = arg2.method2413((byte) -30);
            this.field728 = arg2.method2413((byte) -30);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field694[arg1 - 10] = arg2.method2422(-1);
        } else if (arg1 == 15) {
            int var5 = arg2.method2429(arg0 ^ 0xFFFFFFEB);
            this.field698 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field698[var6] = arg2.method2378(-1);
            }
            this.field689 = arg2.method2413((byte) -30);
            this.field693 = arg2.method2413((byte) -30);
        } else if (arg1 == 16) {
            this.field720 = false;
        } else if (arg1 == 17) {
            this.field703 = arg2.method2422(-1);
        } else if (arg1 == 18) {
            this.field685 = arg2.method2403((byte) 49);
        } else if (arg1 == 19) {
            this.field710 = arg2.method2403((byte) 106);
        } else if (arg1 == 20) {
            this.field725 = arg2.method2403((byte) 124);
            if (this.field725 == 65535) {
                this.field725 = -1;
            }
            this.field707 = arg2.method2403((byte) 120);
            if (this.field707 == 65535) {
                this.field707 = -1;
            }
            this.field705 = arg2.method2413((byte) -30);
            this.field701 = arg2.method2413((byte) -30);
        } else if (arg1 == 21) {
            this.field704 = arg2.method2413((byte) -30);
        } else if (arg1 == 22) {
            this.field723 = arg2.method2413((byte) -30);
        }
        if (arg0 != -21) {
            this.method327(21);
        }
        field709++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Lur;")
    public static final class315 method322(int arg0, byte arg1) {
        field695++;
        class315 var2 = (class315) class406.field5893.method567((byte) 65, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 9) {
            method329((byte) 71, -42);
        }
        byte[] var3 = class318.field4371.method1920(class89.method605(0, arg0), false, class137.method946(arg0, -78));
        class315 var4 = new class315();
        if (var3 != null) {
            var4.method2004(new class371(var3), (byte) -121);
        }
        class406.field5893.method565(-1, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)I")
    public static final int method323(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field699++;
        int var5 = arg1 & 0xF;
        if (arg0 == -10) {
            int var6 = var5 >= 8 ? arg4 : arg2;
            int var7 = var5 < 4 ? arg4 : (var5 == 12 || var5 == 14 ? arg2 : arg3);
            return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
        } else {
            return -52;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZILaa;)Llf;")
    public final class130 method324(boolean arg0, int arg1, class281 arg2) {
        field724++;
        int var4 = arg0 ? this.field686 : this.field690;
        int var5 = arg2.field3847 << 29 | var4;
        class130 var6 = (class130) class167.field2391.method1246((byte) -126, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (class374.field5342.method1898(var4, 127)) {
            class18 var7 = class18.method119(class374.field5342, var4, arg1);
            if (var7 != null) {
                var6 = arg2.method1807(var7, true);
                class167.field2391.method1247((long) var5, (byte) -78, var6);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILaa;)Llf;")
    public final class130 method325(int arg0, class281 arg1) {
        field692++;
        class130 var3 = (class130) class167.field2391.method1246((byte) -14, (long) (arg1.field3847 << 29 | 0x20000 | this.field685));
        if (var3 != null) {
            return var3;
        }
        if (arg0 != -804606947) {
            this.field690 = 24;
        }
        class374.field5342.method1898(this.field685, 127);
        class18 var4 = class18.method119(class374.field5342, this.field685, 0);
        if (var4 != null) {
            var3 = arg1.method1807(var4, true);
            class167.field2391.method1247((long) (arg1.field3847 << 29 | this.field685 | 0x20000), (byte) 78, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
    public static final void method326(int arg0, int arg1) {
        class294 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class156 var4 = class156.field2213[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class371.field5311; var5++) {
                    for (int var6 = 0; var6 < class386.field5629; var6++) {
                        var2 = var4.method277(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class156 var10 = class156.field2213[var9];
                                if (var10 != null) {
                                    int var11 = var4.method275(var6, var5) - var10.method275(var6, var5);
                                    int var12 = var4.method275(var6 + 1, var5) - var10.method275(var6 + 1, var5);
                                    int var13 = var4.method275(var6 + 1, var5 + 1) - var10.method275(var6 + 1, var5 + 1);
                                    int var14 = var4.method275(var6, var5 + 1) - var10.method275(var6, var5 + 1);
                                    var10.method269(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public final void method327(int arg0) {
        if (this.field698 != null) {
            for (int var2 = 0; var2 < this.field698.length; var2 += 2) {
                if (this.field698[var2] < this.field719) {
                    this.field719 = this.field698[var2];
                } else if (this.field697 < this.field698[var2]) {
                    this.field697 = this.field698[var2];
                }
                if (this.field702 > this.field698[var2 + 1]) {
                    this.field702 = this.field698[var2 + 1];
                } else if (this.field698[var2 + 1] > this.field688) {
                    this.field688 = this.field698[var2 + 1];
                }
            }
        }
        if (arg0 > -10) {
            method329((byte) -34, -38);
        }
        field713++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Leb;I)V")
    public final void method328(class371 arg0, int arg1) {
        field717++;
        while (true) {
            int var3 = arg0.method2429(0);
            if (var3 == 0) {
                if (arg1 == -31463) {
                    return;
                } else {
                    method323(86, 83, -31, 120, 99);
                    return;
                }
            }
            this.method321(-21, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)C")
    public static final char method329(byte arg0, int arg1) {
        field715++;
        int var2 = arg0 & 0xFF;
        if (arg1 == var2) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class235.field3197[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)Z")
    public final boolean method330(byte arg0) {
        field700++;
        if (arg0 != 123) {
            return true;
        } else if (this.field691 == -1 && this.field722 == -1) {
            return true;
        } else {
            boolean var2 = false;
            int var3;
            if (this.field691 == -1) {
                var3 = class315.method2012(21375, this.field722);
            } else {
                var3 = class447.field6439[this.field691];
            }
            if (var3 < this.field712 || this.field728 < var3) {
                return false;
            } else if (this.field707 == -1 && this.field725 == -1) {
                return true;
            } else {
                boolean var4 = false;
                int var5;
                if (this.field707 == -1) {
                    var5 = class315.method2012(arg0 + 21252, this.field725);
                } else {
                    var5 = class447.field6439[this.field707];
                }
                return var5 >= this.field705 && var5 <= this.field701;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public static void method331(byte arg0) {
        if (arg0 < 15) {
            field718 = 125;
        }
        field684 = null;
    }
}
