import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class54 implements class32 {

    @OriginalMember(owner = "client!gja", name = "f", descriptor = "[Lrb;")
    private class372[] field678 = new class372[9];

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "I")
    private int field673 = 0;

    @OriginalMember(owner = "client!gja", name = "o", descriptor = "I")
    private int field687 = -1;

    @OriginalMember(owner = "client!gja", name = "t", descriptor = "Lqfa;")
    private class106 field692;

    @OriginalMember(owner = "client!gja", name = "y", descriptor = "I")
    private int field697;

    @OriginalMember(owner = "client!gja", name = "p", descriptor = "I")
    public static int field688 = 0;

    @OriginalMember(owner = "client!gja", name = "d", descriptor = "I")
    public static int field676 = 64;

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!gja", name = "e", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!gja", name = "g", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!gja", name = "h", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!gja", name = "i", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!gja", name = "j", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!gja", name = "k", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!gja", name = "l", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!gja", name = "m", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!gja", name = "n", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!gja", name = "q", descriptor = "I")
    private int field689;

    @OriginalMember(owner = "client!gja", name = "r", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!gja", name = "s", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!gja", name = "u", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!gja", name = "v", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!gja", name = "w", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!gja", name = "x", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!gja", name = "z", descriptor = "I")
    private int field698;

    @OriginalMember(owner = "client!gja", name = "A", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!gja", name = "B", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!gja", name = "C", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!gja", name = "D", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!gja", name = "E", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!gja", name = "F", descriptor = "Ld;")
    public static class160 field704;

    @OriginalMember(owner = "client!gja", name = "f", descriptor = "(I)I")
    private final int method371(int arg0) {
        if (arg0 < 18) {
            return 25;
        }
        field703++;
        if ((this.field673 & 0x4) != 0) {
            return 36160;
        } else if ((this.field673 & 0x2) == 0) {
            return (this.field673 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(II)V")
    public final void method372(int arg0, int arg1) {
        int var3 = -102 % ((arg1 - 27) / 60);
        if (this.field678[arg0] != null) {
            this.field678[arg0].method1319(-17115);
        }
        field701++;
        this.field674 &= ~(0x1 << arg0);
        this.field678[arg0] = null;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(ILkm;BI)V")
    private final void method373(int arg0, class373 arg1, byte arg2, int arg3) {
        field680++;
        if (this.field687 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg3;
        if ((~var5 & this.field674) == 0) {
            this.field689 = arg1.field5152;
            this.field698 = arg1.field5144;
        } else if (this.field698 != arg1.field5144 || this.field689 != arg1.field5152) {
            throw new RuntimeException();
        }
        int var6 = 78 % ((-arg2 - 6) / 53);
        arg1.method2312(arg0, class445.field6065[arg3], (byte) -126, this.field687);
        this.field678[arg3] = arg1;
        this.field674 |= var5;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lqba;III)V")
    public final void method374(class425 arg0, int arg1, int arg2, int arg3) {
        field696++;
        if (arg2 <= 65) {
            this.method375((byte) 63);
        }
        this.method379(arg0, (byte) -123, 0, arg1, arg3);
    }

    @OriginalMember(owner = "client!gja", name = "e", descriptor = "(I)V")
    public final void method265(int arg0) {
        field675++;
        OpenGL.glBindFramebufferEXT(36008, this.field697);
        this.field673 |= 0x1;
        if (arg0 != -25519) {
            this.method380(null, 103, -71);
        }
        this.field687 = this.method371(48);
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(B)V")
    public final void method262(byte arg0) {
        field700++;
        int var2 = -87 / ((arg0 - 56) / 62);
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field673 &= 0xFFFFFFFE;
        this.field687 = this.method371(97);
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(B)Z")
    public final boolean method375(byte arg0) {
        field691++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field687);
        if (var2 == 36053) {
            int var3 = -4 % ((arg0 - 22) / 49);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V")
    public final void method260(int arg0) {
        if (arg0 != 954) {
            this.field689 = -4;
        }
        OpenGL.glBindFramebufferEXT(36160, this.field697);
        field685++;
        this.field673 |= 0x4;
        this.field687 = this.method371(arg0 - 849);
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(II)V")
    public final void method376(int arg0, int arg1) {
        field686++;
        if (this.field687 == arg0) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class445.field6065[arg1]);
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)V")
    public final void method261(int arg0) {
        field694++;
        if (arg0 >= -60) {
            this.method381((byte) -19, -3, null);
        }
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field673 &= 0xFFFFFFFB;
        this.field687 = this.method371(68);
    }

    @OriginalMember(owner = "client!gja", name = "d", descriptor = "(I)V")
    public final void method264(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, 0);
        field693++;
        this.field673 &= 0xFFFFFFFD;
        if (arg0 != 25791) {
            method377(-49);
        }
        this.field687 = this.method371(arg0 ^ 0x64E0);
    }

    @OriginalMember(owner = "client!gja", name = "g", descriptor = "(I)V")
    public static void method377(int arg0) {
        if (arg0 != -1721922967) {
            method382(-108, (byte) 97);
        }
        field704 = null;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Z)V")
    public static final void method378(boolean arg0) {
        field683++;
        if (arg0 || class21.field353.field10073.method1614(-23) != 2) {
            return;
        }
        byte var1 = (byte) (class746.field10346 - 4 & 0xFF);
        int var2 = class746.field10346 % class768.field10571;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class350.field4898; var18++) {
                class724.field10022[var3][var2][var18] = var1;
            }
        }
        if (class368.field5113 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class152.field2159[var4] = -1000000;
            class606.field8481[var4] = 1000000;
            class503.field7131[var4] = 0;
            class437.field5898[var4] = 1000000;
            class371.field5134[var4] = 0;
        }
        int var5 = class210.field3250.field5742;
        int var6 = class210.field3250.field5746;
        if (class416.field5704 != 1 && class429.field5830 == -1) {
            int var7 = class702.method3970(class614.field8619, class368.field5113, -20103, class472.field6622);
            if ((var7 - class546.field7862) < 3200 && (class190.field2932[class368.field5113][class614.field8619 >> 9][class472.field6622 >> 9] & 0x4) != 0) {
                class559.method3304(class614.field8619 >> 9, class767.field10562, 1, -85, false, class472.field6622 >> 9);
                return;
            }
            return;
        }
        if (class416.field5704 != 1) {
            var5 = class429.field5830;
            var6 = class375.field5176;
        }
        if ((class190.field2932[class368.field5113][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class559.method3304(var5 >> 9, class767.field10562, 0, -105, false, var6 >> 9);
        }
        if (class589.field8310 >= 2560) {
            return;
        }
        int var8 = class614.field8619 >> 9;
        int var9 = class472.field6622 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var10 <= var8) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        int var13;
        if (var9 >= var11) {
            var13 = var9 - var11;
        } else {
            var13 = var11 - var9;
        }
        if (var12 == 0 && var13 == 0 || var12 <= -class768.field10571 || class768.field10571 <= var12 || var13 <= -class350.field4898 || class350.field4898 <= var13) {
            class678.method3848("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class124.field1922 + "," + class88.field999, null, false);
            return;
        }
        if (var13 < var12) {
            int var14 = var13 * 65536 / var12;
            int var15 = 32768;
            while (var8 != var10) {
                if (var10 > var8) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class190.field2932[class368.field5113][var8][var9] & 0x4) != 0) {
                    class559.method3304(var8, class767.field10562, 1, 95, false, var9);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var11 > var9) {
                        var9++;
                    } else if (var11 < var9) {
                        var9--;
                    }
                    if ((class190.field2932[class368.field5113][var8][var9] & 0x4) != 0) {
                        class559.method3304(var8, class767.field10562, 1, -119, false, var9);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var12 * 65536 / var13;
        int var17 = 32768;
        while (var9 != var11) {
            if (var9 < var11) {
                var9++;
            } else if (var11 < var9) {
                var9--;
            }
            if ((class190.field2932[class368.field5113][var8][var9] & 0x4) != 0) {
                class559.method3304(var8, class767.field10562, 1, 62, false, var9);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                if (var10 > var8) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                var17 -= 65536;
                if ((class190.field2932[class368.field5113][var8][var9] & 0x4) != 0) {
                    class559.method3304(var8, class767.field10562, 1, -116, false, var9);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lqba;BIII)V")
    private final void method379(class425 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field682++;
        if (this.field687 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg3;
        if ((this.field674 & ~var6) == 0) {
            this.field698 = arg0.field5802;
            this.field689 = arg0.field5802;
        } else if (this.field698 != arg0.field5802 || this.field689 != arg0.field5802) {
            throw new RuntimeException();
        }
        if (arg1 == -123) {
            arg0.method2569(class445.field6065[arg3], arg4, false, this.field687, arg2);
            this.field678[arg3] = arg0;
            this.field674 |= var6;
        }
    }

    @OriginalMember(owner = "client!gja", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field692.method749(this.field697, 118);
        field695++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lkm;II)V")
    public final void method380(class373 arg0, int arg1, int arg2) {
        field702++;
        int var4 = 43 % ((-arg2 - 10) / 45);
        this.method373(0, arg0, (byte) -103, arg1);
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(BILmw;)V")
    public final void method381(byte arg0, int arg1, class516 arg2) {
        field690++;
        if (this.field687 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if ((this.field674 & ~var4) == 0) {
            this.field698 = arg2.field7297;
            this.field689 = arg2.field7295;
        } else if (this.field698 != arg2.field7297 || this.field689 != arg2.field7295) {
            throw new RuntimeException();
        }
        if (arg0 <= -103) {
            arg2.method3112(this.field687, class445.field6065[arg1], (byte) 57);
            this.field678[arg1] = arg2;
            this.field674 |= var4;
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IB)I")
    public static final int method382(int arg0, byte arg1) {
        field681++;
        if (arg1 >= -57) {
            field688 = 101;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method383(String arg0, byte arg1) {
        if (arg1 <= 42) {
            method383(null, (byte) -89);
        }
        field677++;
        return class45.field572.containsKey(arg0);
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lqfa;)V")
    public class54(class106 arg0) {
        if (!arg0.field1577) {
            throw new IllegalStateException("");
        }
        this.field692 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class723.field10021, 0);
        this.field697 = class723.field10021[0];
    }

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "(I)V")
    public final void method263(int arg0) {
        if (arg0 != -15666) {
            this.method260(66);
        }
        field684++;
        OpenGL.glBindFramebufferEXT(36009, this.field697);
        this.field673 |= 0x2;
        this.field687 = this.method371(91);
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(IB)V")
    public final void method384(int arg0, byte arg1) {
        field699++;
        if (arg1 != 117) {
            return;
        }
        if (this.field687 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class445.field6065[arg0]);
    }
}
