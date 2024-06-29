import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class24 {

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public int field359 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "[Ljava/lang/String;")
    public String[] field368 = new String[5];

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public int field370 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "Z")
    public boolean field371 = false;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public int field376 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    private int field362 = -1;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "Z")
    public boolean field378 = true;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "Z")
    public boolean field366 = true;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public int field379 = -1;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
    private int field386 = -1;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public int field364 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
    public int field381 = -1;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    private int field367 = -1;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "Z")
    public boolean field374 = true;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
    private int field380 = -1;

    @OriginalMember(owner = "client!bo", name = "G", descriptor = "I")
    public int field389 = 0;

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
    public int field393 = -1;

    @OriginalMember(owner = "client!bo", name = "Q", descriptor = "I")
    public int field399 = -1;

    @OriginalMember(owner = "client!bo", name = "U", descriptor = "I")
    private int field403 = -1;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field360 = 20;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "[Z")
    public static boolean[] field363 = new boolean[8];

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "[I")
    public static int[] field398;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "client!bo", name = "I", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!bo", name = "N", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!bo", name = "T", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "Lqo;")
    private class141 field365;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "Lqq;")
    public class52 field382;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "Ljava/lang/String;")
    public String field375;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "Ljava/lang/String;")
    public String field383;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "[I")
    public int[] field358;

    static {
        new class375("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field398 = new int[1];
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V", line = 7)
    public final void method190(boolean arg0) {
        if (this.field358 != null) {
            for (int var2 = 0; var2 < this.field358.length; var2 += 2) {
                if (this.field358[var2] < this.field370) {
                    this.field370 = this.field358[var2];
                } else if (this.field376 < this.field358[var2]) {
                    this.field376 = this.field358[var2];
                }
                if (this.field359 > this.field358[var2 + 1]) {
                    this.field359 = this.field358[var2 + 1];
                } else if (this.field364 < this.field358[var2 + 1]) {
                    this.field364 = this.field358[var2 + 1];
                }
            }
        }
        if (!arg0) {
            this.field370 = 71;
        }
        field385++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;", line = 45)
    public final String method191(String arg0, int arg1, byte arg2) {
        field401++;
        if (this.field365 == null) {
            return arg0;
        }
        class44 var4 = (class44) this.field365.method943((long) arg1, -1);
        if (var4 == null) {
            return arg0;
        } else if (arg2 >= -40) {
            return null;
        } else {
            return var4.field652;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IILtl;)V", line = 66)
    private final void method192(int arg0, int arg1, class91 arg2) {
        if (arg1 != -1) {
            this.field394 = -74;
        }
        field402++;
        if (arg0 == 1) {
            this.field381 = arg2.method631(10494);
        } else if (arg0 == 2) {
            this.field399 = arg2.method631(10494);
        } else if (arg0 == 3) {
            this.field375 = arg2.method621(2029169511);
        } else if (arg0 == 4) {
            this.field390 = arg2.method641(32455);
        } else if (arg0 == 5) {
            this.field379 = arg2.method641(32455);
        } else if (arg0 == 6) {
            this.field389 = arg2.method618((byte) 100);
        } else if (arg0 == 7) {
            int var4 = arg2.method618((byte) 100);
            if ((var4 & 0x1) == 0) {
                this.field378 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field371 = true;
                return;
            }
        } else if (arg0 == 8) {
            this.field366 = arg2.method618((byte) 100) == 1;
            return;
        } else if (arg0 == 9) {
            this.field403 = arg2.method631(10494);
            if (this.field403 == 65535) {
                this.field403 = -1;
            }
            this.field380 = arg2.method631(10494);
            if (this.field380 == 65535) {
                this.field380 = -1;
            }
            this.field400 = arg2.method626((byte) 100);
            this.field394 = arg2.method626((byte) 100);
        } else if (arg0 < 10 || arg0 > 14) {
            if (arg0 != 15) {
                if (arg0 != 16) {
                    if (arg0 != 17) {
                        if (arg0 != 18) {
                            if (arg0 != 19) {
                                if (arg0 == 20) {
                                    this.field367 = arg2.method631(10494);
                                    if (this.field367 == 65535) {
                                        this.field367 = -1;
                                    }
                                    this.field362 = arg2.method631(arg1 ^ 0xFFFFD701);
                                    if (this.field362 == 65535) {
                                        this.field362 = -1;
                                    }
                                    this.field384 = arg2.method626((byte) 100);
                                    this.field372 = arg2.method626((byte) 100);
                                } else if (arg0 == 21) {
                                    this.field391 = arg2.method626((byte) 100);
                                    return;
                                } else if (arg0 == 22) {
                                    this.field396 = arg2.method626((byte) 100);
                                    return;
                                } else if (arg0 == 249) {
                                    int var7 = arg2.method618((byte) 100);
                                    if (this.field365 == null) {
                                        int var8 = class353.method2231(var7, (byte) -84);
                                        this.field365 = new class141(var8);
                                    }
                                    for (int var9 = 0; var9 < var7; var9++) {
                                        boolean var10 = arg2.method618((byte) 100) == 1;
                                        int var11 = arg2.method641(32455);
                                        class467 var12;
                                        if (var10) {
                                            var12 = new class44(arg2.method621(2029169511));
                                        } else {
                                            var12 = new class74(arg2.method626((byte) 100));
                                        }
                                        this.field365.method940((long) var11, -75, var12);
                                    }
                                    return;
                                }
                                return;
                            }
                            this.field393 = arg2.method631(10494);
                            return;
                        }
                        this.field386 = arg2.method631(10494);
                        return;
                    }
                    this.field383 = arg2.method621(2029169511);
                    return;
                }
                this.field374 = false;
                return;
            }
            int var5 = arg2.method618((byte) 100);
            this.field358 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field358[var6] = arg2.method643((byte) 107);
            }
            this.field395 = arg2.method626((byte) 100);
            this.field369 = arg2.method626((byte) 100);
            return;
        } else {
            this.field368[arg0 - 10] = arg2.method621(arg1 + 2029169512);
            return;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lqa;I)Lf;", line = 237)
    public final class191 method193(class496 arg0, int arg1) {
        if (arg1 != -19452) {
            method199(-92);
        }
        field377++;
        class191 var3 = (class191) this.field382.field705.method1013((long) (this.field386 | 0x20000 | arg0.field7242 << 29), (byte) -106);
        if (var3 != null) {
            return var3;
        }
        this.field382.field698.method2624(-103, this.field386);
        class476 var4 = class476.method2845(this.field382.field698, this.field386, 0);
        if (var4 != null) {
            var3 = arg0.method1117(var4, true);
            this.field382.field705.method1012(-114, (long) (this.field386 | 0x20000 | arg0.field7242 << 29), var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLfb;)Z", line = 264)
    public final boolean method194(byte arg0, class365 arg1) {
        field397++;
        int var3;
        if (this.field380 == -1) {
            if (this.field403 == -1) {
                return true;
            }
            var3 = arg1.method1187(102, this.field403);
        } else {
            var3 = arg1.method1193(this.field380, false);
        }
        if (var3 < this.field400 || var3 > this.field394) {
            return false;
        }
        boolean var4 = false;
        int var5 = 69 / ((arg0 + 35) / 32);
        int var6;
        if (this.field362 == -1) {
            if (this.field367 == -1) {
                return true;
            }
            var6 = arg1.method1187(101, this.field367);
        } else {
            var6 = arg1.method1193(this.field362, false);
        }
        return this.field384 <= var6 && this.field372 >= var6;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB)I", line = 312)
    public final int method195(int arg0, int arg1, byte arg2) {
        field392++;
        if (this.field365 == null) {
            return arg0;
        }
        class74 var4 = (class74) this.field365.method943((long) arg1, -1);
        if (arg2 != 71) {
            this.field379 = -107;
        }
        return var4 == null ? arg0 : var4.field998;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 331)
    public static final String method196(byte arg0, long arg1) {
        field361++;
        class289.field4298.setTime(new Date(arg1));
        int var3 = class289.field4298.get(7);
        if (arg0 >= -126) {
            field360 = -78;
        }
        int var4 = class289.field4298.get(5);
        int var5 = class289.field4298.get(2);
        int var6 = class289.field4298.get(1);
        int var7 = class289.field4298.get(11);
        int var8 = class289.field4298.get(12);
        int var9 = class289.field4298.get(13);
        return class392.field5968[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class348.field5426[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIZZIII)V", line = 357)
    public static final void method197(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg5 > arg4) {
            int var7 = (arg4 + arg5) / 2;
            int var8 = arg4;
            class349 var9 = class485.field7076[var7];
            class485.field7076[var7] = class485.field7076[arg5];
            class485.field7076[arg5] = var9;
            for (int var10 = arg4; var10 < arg5; var10++) {
                if (class1.method7(arg3, class485.field7076[var10], arg2, 4096, arg1, var9, arg0) <= 0) {
                    class349 var11 = class485.field7076[var10];
                    class485.field7076[var10] = class485.field7076[var8];
                    class485.field7076[var8++] = var11;
                }
            }
            class485.field7076[arg5] = class485.field7076[var8];
            class485.field7076[var8] = var9;
            method197(arg0, arg1, arg2, arg3, arg4, var8 - 1, 408247197);
            method197(arg0, arg1, arg2, arg3, var8 + 1, arg5, 408247197);
        }
        field388++;
        if (arg6 != 408247197) {
            field398 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lqa;IZ)Lf;", line = 414)
    public final class191 method198(class496 arg0, int arg1, boolean arg2) {
        field373++;
        int var4 = arg2 ? this.field399 : this.field381;
        int var5 = arg0.field7242 << 29 | var4;
        class191 var6 = (class191) this.field382.field705.method1013((long) var5, (byte) -106);
        if (var6 != null) {
            return var6;
        } else if (this.field382.field698.method2624(-112, var4)) {
            class476 var7 = class476.method2845(this.field382.field698, var4, 0);
            if (var7 != null) {
                var6 = arg0.method1117(var7, true);
                this.field382.field705.method1012(-69, (long) var5, var6);
            }
            if (arg1 <= 48) {
                this.field391 = 37;
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 496)
    public static void method199(int arg0) {
        if (arg0 != -1) {
            field398 = null;
        }
        field398 = null;
        field363 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILtl;)V", line = 509)
    public final void method200(int arg0, class91 arg1) {
        while (true) {
            int var3 = arg1.method618((byte) 100);
            if (var3 == 0) {
                field357++;
                if (arg0 != -65536) {
                    this.field367 = -120;
                    return;
                }
                return;
            }
            this.method192(var3, arg0 ^ 0xFFFF, arg1);
        }
    }
}
