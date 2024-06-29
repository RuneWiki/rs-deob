import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class652 {

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Ljava/lang/String;")
    public String field8315 = null;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    private int field8340 = 0;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    public int field8348 = -1;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public int field8350 = -1;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    public int field8342 = 0;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    public static int field8334 = 0;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "Luw;")
    public static class208 field8345 = new class208(46, 4);

    @OriginalMember(owner = "client!im", name = "V", descriptor = "Luaa;")
    public static class391 field8356 = null;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "B")
    public byte field8317;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "B")
    public byte field8319;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "B")
    public byte field8320;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "B")
    public byte field8324;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "I")
    public int field8333;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field8335;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    public static int field8337;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    public int field8346;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "J")
    public long field8352;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Lrda;")
    private class467 field8316;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "Lvha;")
    public static class71 field8357;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "Z")
    private boolean field8314;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "Z")
    public boolean field8321;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "Z")
    private boolean field8332;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "[B")
    public byte[] field8341;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "[I")
    private int[] field8339;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "[I")
    private int[] field8347;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "[J")
    private long[] field8325;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "[J")
    private long[] field8336;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field8343;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "[Ljava/lang/String;")
    public String[] field8353;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;)I", line = 15)
    public final int method3514(int arg0, String arg1) {
        field8330++;
        if (arg1 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field8346; var3++) {
            if (this.field8343[var3].equals(arg1)) {
                return var3;
            }
        }
        if (arg0 != 31987) {
            this.field8320 = -40;
        }
        return -1;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Ljava/lang/Long;", line = 41)
    public final Long method3515(int arg0, int arg1) {
        field8310++;
        if (arg0 != -1) {
            this.method3516(null, -70, 35L);
        }
        if (this.field8316 == null) {
            return null;
        } else {
            class337 var3 = this.field8316.method2616((long) arg1, (byte) 91);
            return var3 != null && var3 instanceof class599 ? Long.valueOf(((class599) var3).field7616) : null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;IJ)V", line = 64)
    public final void method3516(String arg0, int arg1, long arg2) {
        if (arg0 != null && arg0.length() == 0) {
            arg0 = null;
        }
        if (arg1 != 1) {
            return;
        }
        field8351++;
        if (arg2 > 0L != this.field8314) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field8314 + " but userhash:" + arg2);
        } else if (arg0 != null == this.field8332) {
            if (arg2 > 0L && (this.field8325 == null || this.field8325.length <= this.field8346) || arg0 != null && (this.field8343 == null || this.field8343.length <= this.field8346)) {
                this.method3524(this.field8346 + 5, 0);
            }
            if (this.field8325 != null) {
                this.field8325[this.field8346] = arg2;
            }
            if (this.field8343 != null) {
                this.field8343[this.field8346] = arg0;
            }
            if (this.field8348 == -1) {
                this.field8348 = this.field8346;
                this.field8341[this.field8346] = 126;
            } else {
                this.field8341[this.field8346] = 0;
            }
            this.field8347[this.field8346] = 0;
            this.field8339 = null;
            this.field8346++;
        } else {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field8332 + " but displayname:" + arg0);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 108)
    private final void method3517(byte arg0) {
        field8337++;
        if (this.field8346 == 0) {
            this.field8350 = -1;
            this.field8348 = -1;
            return;
        }
        this.field8350 = -1;
        this.field8348 = -1;
        int var2 = 0;
        byte var3 = this.field8341[0];
        int var4 = 1;
        if (arg0 > -88) {
            this.field8319 = -38;
        }
        while (this.field8346 > var4) {
            if (this.field8341[var4] > var3) {
                if (var3 == 125) {
                    this.field8350 = var2;
                }
                var3 = this.field8341[var4];
                var2 = var4;
            } else if (this.field8350 == -1 && this.field8341[var4] == 125) {
                this.field8350 = var4;
            }
            var4++;
        }
        this.field8348 = var2;
        if (this.field8348 != -1) {
            this.field8341[this.field8348] = 126;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;ZI)Z", line = 159)
    public final boolean method3518(String arg0, boolean arg1, int arg2) {
        field8318++;
        if (arg0 == null) {
            arg0 = "";
        } else if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        if (!arg1) {
            return false;
        }
        if (this.field8316 == null) {
            this.field8316 = new class467(4);
        } else {
            class337 var4 = this.field8316.method2616((long) arg2, (byte) -107);
            if (var4 != null) {
                if (var4 instanceof class55) {
                    class55 var5 = (class55) var4;
                    if (var5.field715.equals(arg0)) {
                        return false;
                    }
                    var5.field715 = arg0;
                    return true;
                }
                var4.method1946(-10364);
            }
        }
        this.field8316.method2619(new class55(arg0), (long) arg2, -1);
        return true;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(II)Ljava/lang/Integer;", line = 206)
    public final Integer method3519(int arg0, int arg1) {
        field8338++;
        if (this.field8316 == null) {
            return null;
        }
        class337 var3 = this.field8316.method2616((long) arg1, (byte) 68);
        if (arg0 == -1) {
            return var3 != null && var3 instanceof class405 ? Integer.valueOf(((class405) var3).field5378) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIII)I", line = 228)
    public final int method3520(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8344++;
        int var6 = (0x1 << arg4) - 1;
        int var7 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var8 = var7 ^ var6;
        int var9 = arg2 << arg4;
        int var10 = var9 & var8;
        int var11 = this.field8347[arg0];
        if ((var8 & var11) == var10) {
            return -1;
        }
        if (arg1 <= 39) {
            this.method3535(104, -8, -107);
        }
        int var12 = var11 & ~var8;
        this.field8347[arg0] = class77.method473(var12, var10);
        return arg0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)[I", line = 256)
    public final int[] method3521(boolean arg0) {
        if (arg0) {
            this.field8324 = -84;
        }
        field8312++;
        if (this.field8339 == null) {
            String[] var2 = new String[this.field8346];
            this.field8339 = new int[this.field8346];
            int var3 = 0;
            while (this.field8346 > var3) {
                var2[var3] = this.field8343[var3];
                this.field8339[var3] = var3++;
            }
            class347.method2012(this.field8339, (byte) 41, var2);
        }
        return this.field8339;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(II)V", line = 288)
    public final void method3522(int arg0, int arg1) {
        field8354++;
        if (arg1 < 0 || arg1 >= this.field8346) {
            throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg1 + " memberCount:" + this.field8346);
        } else if (arg0 == 1) {
            this.field8346--;
            this.field8339 = null;
            if (this.field8346 == 0) {
                this.field8343 = null;
                this.field8325 = null;
                this.field8350 = -1;
                this.field8341 = null;
                this.field8348 = -1;
                this.field8347 = null;
            } else {
                class642.method3480(this.field8341, arg1 + 1, this.field8341, arg1, this.field8346 - arg1);
                class642.method3475(this.field8347, arg1 + 1, this.field8347, arg1, this.field8346 - arg1);
                if (this.field8325 != null) {
                    class642.method3479(this.field8325, arg1 + 1, this.field8325, arg1, this.field8346 - arg1);
                }
                if (this.field8343 != null) {
                    class642.method3474(this.field8343, arg1 + 1, this.field8343, arg1, this.field8346 - arg1);
                }
                if (this.field8348 == arg1 || this.field8350 == arg1) {
                    this.method3517((byte) -116);
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lmc;Z)V", line = 333)
    private final void method3523(class234 arg0, boolean arg1) {
        field8322++;
        int var3 = arg0.method1509(true);
        if (var3 < 1 || var3 > 4) {
            throw new RuntimeException("Unsupported ClanSettings version: " + var3);
        }
        int var4 = arg0.method1509(true);
        if ((var4 & 0x2) != 0) {
            this.field8332 = true;
        }
        if ((var4 & 0x1) != 0) {
            this.field8314 = true;
        }
        if (!this.field8314) {
            this.field8336 = null;
            this.field8325 = null;
        }
        if (!this.field8332) {
            this.field8343 = null;
            this.field8353 = null;
        }
        this.field8342 = arg0.method1497((byte) 126);
        this.field8340 = arg0.method1497((byte) 89);
        if (arg1) {
            this.method3528(false, 96);
        }
        if (var3 <= 3 && this.field8340 != 0) {
            this.field8340 += 16912800;
        }
        this.field8346 = arg0.method1553((byte) 85);
        this.field8333 = arg0.method1509(!arg1);
        this.field8315 = arg0.method1540((byte) -126);
        if (var3 >= 4) {
            arg0.method1497((byte) 99);
        }
        this.field8321 = arg0.method1509(!arg1) == 1;
        this.field8320 = arg0.method1554(27806);
        this.field8317 = arg0.method1554(27806);
        this.field8319 = arg0.method1554(27806);
        this.field8324 = arg0.method1554(27806);
        if (this.field8346 > 0) {
            if (this.field8314 && (this.field8325 == null || this.field8325.length < this.field8346)) {
                this.field8325 = new long[this.field8346];
            }
            if (this.field8332 && (this.field8343 == null || this.field8346 > this.field8343.length)) {
                this.field8343 = new String[this.field8346];
            }
            if (this.field8341 == null || this.field8346 > this.field8341.length) {
                this.field8341 = new byte[this.field8346];
            }
            if (this.field8347 == null || this.field8347.length < this.field8346) {
                this.field8347 = new int[this.field8346];
            }
            for (int var5 = 0; var5 < this.field8346; var5++) {
                if (this.field8314) {
                    this.field8325[var5] = arg0.method1516(-11290);
                }
                if (this.field8332) {
                    this.field8343[var5] = arg0.method1508(8);
                }
                this.field8341[var5] = arg0.method1554(27806);
                if (var3 >= 2) {
                    this.field8347[var5] = arg0.method1497((byte) 99);
                }
            }
            this.method3517((byte) -120);
        }
        if (this.field8333 > 0) {
            if (this.field8314 && (this.field8336 == null || this.field8336.length < this.field8333)) {
                this.field8336 = new long[this.field8333];
            }
            if (this.field8332 && (this.field8353 == null || this.field8333 > this.field8353.length)) {
                this.field8353 = new String[this.field8333];
            }
            for (int var6 = 0; var6 < this.field8333; var6++) {
                if (this.field8314) {
                    this.field8336[var6] = arg0.method1516(-11290);
                }
                if (this.field8332) {
                    this.field8353[var6] = arg0.method1508(8);
                }
            }
        }
        if (var3 < 3) {
            return;
        }
        int var7 = arg0.method1553((byte) 32);
        if (var7 <= 0) {
            return;
        }
        this.field8316 = new class467(var7 >= 16 ? 16 : class483.method2714(var7, (byte) -122));
        while ((var7--) > 0) {
            int var8 = arg0.method1497((byte) 26);
            int var9 = var8 & 0x3FFFFFFF;
            int var10 = var8 >>> 30;
            if (var10 == 0) {
                int var14 = arg0.method1497((byte) 116);
                this.field8316.method2619(new class405(var14), (long) var9, -1);
            } else if (var10 == 1) {
                long var11 = arg0.method1516(-11290);
                this.field8316.method2619(new class599(var11), (long) var9, -1);
            } else if (var10 == 2) {
                String var13 = arg0.method1540((byte) -98);
                this.field8316.method2619(new class55(var13), (long) var9, -1);
            }
        }
        return;
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(II)V", line = 502)
    private final void method3524(int arg0, int arg1) {
        if (this.field8314) {
            if (this.field8325 == null) {
                this.field8325 = new long[arg0];
            } else {
                class642.method3479(this.field8325, 0, this.field8325 = new long[arg0], 0, this.field8346);
            }
        }
        field8323++;
        if (arg1 != 0) {
            return;
        }
        if (this.field8332) {
            if (this.field8343 == null) {
                this.field8343 = new String[arg0];
            } else {
                class642.method3474(this.field8343, 0, this.field8343 = new String[arg0], 0, this.field8346);
            }
        }
        if (this.field8341 == null) {
            this.field8341 = new byte[arg0];
        } else {
            class642.method3480(this.field8341, 0, this.field8341 = new byte[arg0], 0, this.field8346);
        }
        if (this.field8347 == null) {
            this.field8347 = new int[arg0];
        } else {
            class642.method3475(this.field8347, 0, this.field8347 = new int[arg0], 0, this.field8346);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBI)V", line = 541)
    public static final void method3525(int arg0, byte arg1, int arg2) {
        int var3 = -42 / ((26 - arg1) / 58);
        field8313++;
        if (class484.field6250 == 1) {
            class576.method3097(arg0, (byte) -81, arg2, class597.field7584);
        } else if (class484.field6250 == 2) {
            if (class602.field7657) {
                class774.method4229(102, arg2 + class498.method2765((byte) -68), class507.method2806((byte) -58) + arg0);
            } else {
                class774.method4229(121, arg2, arg0);
            }
        }
        class597.field7584 = null;
        class484.field6250 = 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;J)V", line = 566)
    public final void method3526(int arg0, String arg1, long arg2) {
        if (arg0 > -49) {
            this.field8342 = -26;
        }
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        field8328++;
        if (this.field8314 != arg2 > 0L) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field8314 + " but userhash:" + arg2);
        } else if (this.field8332 == (arg1 == null)) {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field8332 + " but displayname:" + arg1);
        } else {
            if (arg2 > 0L && (this.field8336 == null || this.field8333 >= this.field8336.length) || arg1 != null && (this.field8353 == null || this.field8333 >= this.field8353.length)) {
                this.method3528(false, this.field8333 + 5);
            }
            if (this.field8336 != null) {
                this.field8336[this.field8333] = arg2;
            }
            if (this.field8353 != null) {
                this.field8353[this.field8333] = arg1;
            }
            this.field8333++;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 605)
    public static void method3527(int arg0) {
        field8345 = null;
        field8356 = null;
        field8357 = null;
        if (arg0 != -23334) {
            field8356 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lmc;)V", line = 933)
    public class652(class234 arg0) {
        this.method3523(arg0, false);
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 942)
    private class652() {
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ZI)V", line = 624)
    private final void method3528(boolean arg0, int arg1) {
        if (arg0) {
            this.method3521(true);
        }
        if (this.field8314) {
            if (this.field8336 == null) {
                this.field8336 = new long[arg1];
            } else {
                class642.method3479(this.field8336, 0, this.field8336 = new long[arg1], 0, this.field8333);
            }
        }
        field8329++;
        if (!this.field8332) {
            return;
        }
        if (this.field8353 == null) {
            this.field8353 = new String[arg1];
        } else {
            class642.method3474(this.field8353, 0, this.field8353 = new String[arg1], 0, this.field8333);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)V", line = 662)
    public final void method3529(int arg0, byte arg1) {
        if (arg1 <= 110) {
            return;
        }
        this.field8333--;
        field8355++;
        if (this.field8333 == 0) {
            this.field8353 = null;
            this.field8336 = null;
            return;
        }
        if (this.field8336 != null) {
            class642.method3479(this.field8336, arg0 + 1, this.field8336, arg0, this.field8333 - arg0);
        }
        if (this.field8353 != null) {
            class642.method3474(this.field8353, arg0 + 1, this.field8353, arg0, this.field8333 - arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIII)Ljava/lang/Integer;", line = 703)
    public final Integer method3530(int arg0, int arg1, int arg2, int arg3) {
        field8309++;
        if (this.field8316 == null) {
            return null;
        } else if (arg3 == 32318) {
            class337 var5 = this.field8316.method2616((long) arg2, (byte) -88);
            if (var5 != null && var5 instanceof class405) {
                int var6 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
                return Integer.valueOf((var6 & ((class405) var5).field5378) >>> arg1);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(IBI)I", line = 728)
    public final int method3531(int arg0, byte arg1, int arg2) {
        field8311++;
        if (arg1 == 126 || arg1 == 127) {
            return -1;
        } else if (this.field8348 == arg0 && (this.field8350 == -1 || this.field8341[this.field8350] < 125)) {
            return -1;
        } else if (this.field8341[arg0] == arg1) {
            return -1;
        } else {
            this.field8341[arg0] = arg1;
            if (arg2 == 9111) {
                this.method3517((byte) -121);
                return arg0;
            } else {
                return -118;
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBII)I", line = 761)
    public final int method3532(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -49) {
            return 115;
        } else {
            field8349++;
            int var5 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
            return (this.field8347[arg2] & var5) >>> arg0;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(IIIII)Z", line = 778)
    public final boolean method3533(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8331++;
        int var6 = (arg3 << arg0) - 1;
        int var7 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        int var8 = var6 ^ var7;
        int var9 = arg4 << arg0;
        int var10 = var9 & var8;
        if (this.field8316 == null) {
            this.field8316 = new class467(4);
        } else {
            class337 var11 = this.field8316.method2616((long) arg1, (byte) 95);
            if (var11 != null) {
                if (var11 instanceof class405) {
                    class405 var12 = (class405) var11;
                    if ((var8 & var12.field5378) == var10) {
                        return false;
                    }
                    var12.field5378 &= ~var8;
                    var12.field5378 |= var10;
                    return true;
                }
                var11.method1946(-10364);
            }
        }
        this.field8316.method2619(new class405(var10), (long) arg1, -1);
        return true;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BIJ)Z", line = 828)
    public final boolean method3534(byte arg0, int arg1, long arg2) {
        field8326++;
        if (arg0 < 76) {
            this.method3515(-56, -18);
        }
        if (this.field8316 == null) {
            this.field8316 = new class467(4);
        } else {
            class337 var5 = this.field8316.method2616((long) arg1, (byte) -124);
            if (var5 != null) {
                if (var5 instanceof class599) {
                    class599 var6 = (class599) var5;
                    if (var6.field7616 == arg2) {
                        return false;
                    }
                    var6.field7616 = arg2;
                    return true;
                }
                var5.method1946(-10364);
            }
        }
        this.field8316.method2619(new class599(arg2), (long) arg1, -1);
        return true;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Z", line = 866)
    public final boolean method3535(int arg0, int arg1, int arg2) {
        field8335++;
        if (this.field8316 == null) {
            this.field8316 = new class467(4);
        } else {
            class337 var4 = this.field8316.method2616((long) arg2, (byte) 75);
            if (var4 != null) {
                if (var4 instanceof class405) {
                    class405 var5 = (class405) var4;
                    if (var5.field5378 == arg0) {
                        return false;
                    }
                    var5.field5378 = arg0;
                    return true;
                }
                var4.method1946(-10364);
            }
        }
        if (arg1 != 4) {
            this.method3522(-100, 22);
        }
        this.field8316.method2619(new class405(arg0), (long) arg2, -1);
        return true;
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(II)Ljava/lang/String;", line = 906)
    public final String method3536(int arg0, int arg1) {
        field8327++;
        int var3 = 112 / ((arg0 - 46) / 51);
        if (this.field8316 == null) {
            return null;
        } else {
            class337 var4 = this.field8316.method2616((long) arg1, (byte) 111);
            return var4 != null && var4 instanceof class55 ? ((class55) var4).field715 : null;
        }
    }
}
