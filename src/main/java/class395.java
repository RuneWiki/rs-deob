import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class395 implements class365 {

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "[Lwo;")
    private class526[] field5885 = new class526[9];

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    private int field5896 = 0;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    private int field5895 = -1;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "Lkd;")
    private class188 field5882;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    private int field5888;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5880 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "[I")
    public static int[] field5892 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    private int field5881;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    private int field5887;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!tv", name = "u", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!tv", name = "v", descriptor = "I")
    private int field5901;

    @OriginalMember(owner = "client!tv", name = "w", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!tv", name = "x", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!tv", name = "C", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!tv", name = "D", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lfo;III)V")
    private final void method2480(class361 arg0, int arg1, int arg2, int arg3) {
        field5906++;
        if (this.field5895 == -1) {
            throw new RuntimeException();
        }
        int var5 = arg1 << arg2;
        if ((this.field5881 & ~var5) == 0) {
            this.field5887 = arg0.field5353;
            this.field5901 = arg0.field5357;
        } else if (this.field5887 != arg0.field5353 || this.field5901 != arg0.field5357) {
            throw new RuntimeException();
        }
        arg0.method2266(0, arg3, class276.field4204[arg2], this.field5895);
        this.field5885[arg2] = arg0;
        this.field5881 |= var5;
    }

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "(I)V")
    public static void method2481(int arg0) {
        field5892 = null;
        field5880 = null;
        if (arg0 != 12577) {
            field5892 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZZLcl;)V")
    public static final void method2482(boolean arg0, boolean arg1, class177 arg2) {
        field5891++;
        if (!arg0 || class382.field5752 >= 400) {
            return;
        }
        if (class398.field5947 != arg2) {
            String var9;
            if (arg2.field2679 == 0) {
                boolean var3 = true;
                if (class398.field5947.field2661 != -1 && arg2.field2661 != -1) {
                    int var4 = arg2.field2636 >= class398.field5947.field2636 ? arg2.field2636 : class398.field5947.field2636;
                    int var5 = class398.field5947.field2661 < arg2.field2661 ? class398.field5947.field2661 : arg2.field2661;
                    int var6 = (var4 * 10 / 100) + var5 + 5;
                    int var7 = class398.field5947.field2636 - arg2.field2636;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var6 < var7) {
                        var3 = false;
                    }
                }
                String var8 = class86.field1228 == class312.field4691 ? class32.field357.method1635(class224.field3673, (byte) 122) : class201.field3337.method1635(class224.field3673, (byte) 125);
                if (arg2.field2655 <= arg2.field2636) {
                    var9 = arg2.method1185(true, (byte) -104) + (var3 ? class46.method472(2988, class398.field5947.field2636, arg2.field2636) : "<col=ffffff>") + " (" + var8 + arg2.field2636 + ")";
                } else {
                    var9 = arg2.method1185(true, (byte) -74) + (var3 ? class46.method472(2988, class398.field5947.field2636, arg2.field2636) : "<col=ffffff>") + " (" + var8 + arg2.field2636 + "+" + (arg2.field2655 - arg2.field2636) + ")";
                }
            } else {
                var9 = arg2.method1185(true, (byte) -75) + " (" + class108.field1513.method1635(class224.field3673, (byte) -60) + arg2.field2679 + ")";
            }
            if (class245.field3859) {
                if (!arg1 && (class366.field5390 & 0x8) != 0) {
                    class168.method1127(-1, class190.field3206 + " -> <col=ffffff>" + var9, 0, 0, true, 17, false, class412.field6176, -55, class424.field6317, (long) arg2.field1881);
                    class491.field7067++;
                }
            } else if (arg1) {
                class168.method1127(0, "", 0, 0, false, -1, true, "<col=cccccc>" + var9, -94, -1, 0L);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class18.field232[var10] != null) {
                        short var11 = 0;
                        if (class312.field4691 == class282.field4297 && class18.field232[var10].equalsIgnoreCase(class421.field6270.method1635(class224.field3673, (byte) -29))) {
                            if (arg2.field2636 > class398.field5947.field2636) {
                                var11 = 2000;
                            }
                            if (class398.field5947.field2653 != 0 && arg2.field2653 != 0) {
                                if (class398.field5947.field2653 == arg2.field2653) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class53.field657[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class28.field331[var10] + var11);
                        int var13 = class118.field1790[var10] == -1 ? class273.field4187 : class118.field1790[var10];
                        class168.method1127(-1, "<col=ffffff>" + var9, 0, 0, true, var12, false, class18.field232[var10], -111, var13, (long) arg2.field1881);
                        class342.field5076++;
                    }
                }
            }
            if (!arg1) {
                for (class295 var14 = (class295) class456.field6644.method1004((byte) -56); var14 != null; var14 = (class295) class456.field6644.method996(1)) {
                    if (var14.field4498 == 8) {
                        var14.field4491 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class245.field3859 && (class366.field5390 & 0x10) != 0) {
            class168.method1127(-1, class190.field3206 + " -> <col=ffffff>" + class299.field4539.method1635(class224.field3673, (byte) 125), 0, 0, true, 21, false, class412.field6176, -73, class424.field6317, 0L);
            class501.field7187++;
        }
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)V")
    public final void method2287(int arg0) {
        if (arg0 == 4509) {
            field5909++;
            OpenGL.glBindFramebufferEXT(36009, this.field5888);
            this.field5896 |= 0x2;
            this.field5895 = this.method2486(true);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
    public final void method2283(boolean arg0) {
        field5908++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field5896 &= 0xFFFFFFFE;
        this.field5895 = this.method2486(arg0);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IB)V")
    public final void method2483(int arg0, byte arg1) {
        if (arg1 != 124) {
            this.method2484(-93, null, -95);
        }
        field5898++;
        if (this.field5895 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class276.field4204[arg0]);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILgb;I)V")
    public final void method2484(int arg0, class146 arg1, int arg2) {
        field5890++;
        if (this.field5895 == -1) {
            throw new RuntimeException();
        } else if (arg0 <= -32) {
            int var4 = 0x1 << arg2;
            if ((~var4 & this.field5881) == 0) {
                this.field5887 = arg1.field2216;
                this.field5901 = arg1.field2219;
            } else if (this.field5887 != arg1.field2216 || this.field5901 != arg1.field2219) {
                throw new RuntimeException();
            }
            arg1.method1034(class276.field4204[arg2], -9307, this.field5895);
            this.field5885[arg2] = arg1;
            this.field5881 |= var4;
        }
    }

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "(I)I")
    public final int method2485(int arg0) {
        if (arg0 == -20648) {
            field5904++;
            return this.field5901;
        } else {
            return 39;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)I")
    private final int method2486(boolean arg0) {
        field5886++;
        if ((this.field5896 & 0x4) != 0) {
            return 36160;
        } else if ((this.field5896 & 0x2) != 0) {
            return 36009;
        } else if ((this.field5896 & 0x1) == 0) {
            if (!arg0) {
                this.field5896 = 127;
            }
            return -1;
        } else {
            return 36008;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lgl;IZI)V")
    public final void method2487(class428 arg0, int arg1, boolean arg2, int arg3) {
        field5897++;
        this.method2492(arg1, (byte) 36, 0, arg0, arg3);
        if (!arg2) {
            this.method2484(99, null, -38);
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
    public final void method2285(int arg0) {
        field5902++;
        OpenGL.glBindFramebufferEXT(36160, this.field5888);
        if (arg0 != -27017) {
            this.field5887 = 37;
        }
        this.field5896 |= 0x4;
        this.field5895 = this.method2486(true);
    }

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "(I)Z")
    public final boolean method2488(int arg0) {
        if (arg0 <= 5) {
            this.method2285(-59);
        }
        field5905++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field5895);
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "(I)V")
    public final void method2288(int arg0) {
        field5899++;
        OpenGL.glBindFramebufferEXT(36008, this.field5888);
        this.field5896 |= 0x1;
        if (arg0 == 21884) {
            this.field5895 = this.method2486(true);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public final void method2284(int arg0) {
        int var2 = -4 % ((arg0 + 14) / 52);
        field5883++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field5896 &= 0xFFFFFFFB;
        this.field5895 = this.method2486(true);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZ)V")
    public final void method2489(int arg0, boolean arg1) {
        field5907++;
        if (this.field5885[arg0] != null) {
            this.field5885[arg0].method1031(117);
        }
        if (!arg1) {
            this.method2288(-123);
        }
        this.field5881 &= ~(0x1 << arg0);
        this.field5885[arg0] = null;
    }

    @OriginalMember(owner = "client!tv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5882.method1250(this.field5888, 8448);
        field5903++;
        super.finalize();
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(IB)V")
    public final void method2490(int arg0, byte arg1) {
        field5889++;
        if (this.field5895 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class276.field4204[arg0]);
        if (arg1 > -53) {
            this.method2288(65);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IBLfo;)V")
    public final void method2491(int arg0, byte arg1, class361 arg2) {
        if (arg1 > -127) {
            this.field5896 = -67;
        }
        field5884++;
        this.method2480(arg2, 1, arg0, 0);
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
    public final void method2286(int arg0) {
        field5894++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field5896 &= 0xFFFFFFFD;
        if (arg0 == -30213) {
            this.field5895 = this.method2486(true);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IBILgl;I)V")
    private final void method2492(int arg0, byte arg1, int arg2, class428 arg3, int arg4) {
        field5893++;
        if (this.field5895 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if ((~var6 & this.field5881) == 0) {
            this.field5901 = arg3.field6368;
            this.field5887 = arg3.field6368;
        } else if (this.field5887 != arg3.field6368 || this.field5901 != arg3.field6368) {
            throw new RuntimeException();
        }
        arg3.method2669(false, arg2, this.field5895, class276.field4204[arg0], arg4);
        this.field5885[arg0] = arg3;
        if (arg1 != 36) {
            this.field5901 = 53;
        }
        this.field5881 |= var6;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lkd;)V")
    public class395(class188 arg0) {
        if (!arg0.field3145) {
            throw new IllegalStateException("");
        }
        this.field5882 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class494.field7132, 0);
        this.field5888 = class494.field7132[0];
    }
}
