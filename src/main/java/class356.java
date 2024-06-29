import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class356 {

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Z")
    private boolean field5038 = false;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    private int field5041 = -1;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    private int field5039 = -1;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    private int field5045 = 0;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    private int field5060 = 0;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
    private boolean field5035 = false;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    private int field5064 = -1;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public int field5040;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Lnfa;")
    private class745 field5033;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public int field5067;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "B")
    private byte field5048;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "B")
    private byte field5044;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public int field5054;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Z")
    private boolean field5031;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Laq;")
    public static class494 field5053 = new class494(8);

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Lin;")
    public static class380 field5059 = new class380(44, 6);

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Z")
    public static boolean field5069 = true;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    private int field5046;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    private int field5055;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    private int field5061;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    private int field5063;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "Lr;")
    private class115 field5068;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "Leea;")
    public class187 field5071;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "Lka;")
    private class233 field5070;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Lpe;")
    private class685 field5052;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lje;")
    private class98 field5051;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "[Z")
    private boolean[] field5058;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
    public final void method2146(int arg0, int arg1) {
        this.field5035 = true;
        if (arg1 != 15601) {
            this.method2154((byte) 80, 0);
        }
        field5062++;
        this.method2154((byte) 114, arg0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
    public final int method2147(int arg0) {
        field5050++;
        if (arg0 < 45) {
            this.method2153(null, false);
        }
        return this.field5060;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBILdm;Lka;IZLha;I)V")
    public final void method2148(int arg0, byte arg1, int arg2, class765 arg3, class233 arg4, int arg5, boolean arg6, class475 arg7, int arg8) {
        field5066++;
        class335[] var10 = arg4.method590();
        if (arg1 != 111) {
            return;
        }
        class740[] var11 = arg4.method588();
        if ((this.field5071 == null || this.field5071.field2814) && (var10 != null || var11 != null)) {
            class416 var12 = class312.field4418.method369((byte) 122, this.field5054);
            if (var12.field5736 != null) {
                var12 = var12.method2458(class578.field8328, -1);
            }
            if (var12 != null) {
                this.field5071 = class187.method1349(class594.field8494, true);
            }
        }
        if (this.field5071 == null) {
            return;
        }
        arg4.method582(arg3);
        if (arg6) {
            this.field5071.method1347(arg7, (long) class594.field8494, var10, var11, false);
        } else {
            this.field5071.method1343((long) class594.field8494);
        }
        this.field5071.method1355(this.field5044, arg2, arg8, arg5, arg0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2149(int arg0, int arg1, byte arg2) {
        field5034++;
        if (arg2 != 99) {
            method2156(-22);
        }
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILnfa;)V")
    private final void method2150(int arg0, class745 arg1) {
        if (arg0 != 0) {
            this.field5070 = null;
        }
        field5065++;
        label92: while (true) {
            if (this.field5051 == null) {
                if (this.field5035) {
                    return;
                }
                this.method2154((byte) 113, -1);
                if (this.field5051 == null) {
                    return;
                }
            }
            int var3 = class594.field8494 - this.field5063;
            if (var3 > 100 && this.field5051.field1411 > 0) {
                int var4 = this.field5051.field1402.length - this.field5051.field1411;
                while (this.field5046 < var4 && this.field5051.field1388[this.field5046] < var3) {
                    var3 -= this.field5051.field1388[this.field5046];
                    this.field5046++;
                }
                if (var4 <= this.field5046) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field5051.field1402.length; var6++) {
                        var5 += this.field5051.field1388[var6];
                    }
                    var3 %= var5;
                }
                this.field5055 = this.field5046 + 1;
                if (this.field5055 >= this.field5051.field1402.length) {
                    this.field5055 -= this.field5051.field1411;
                    if (this.field5055 < 0 || this.field5055 >= this.field5051.field1402.length) {
                        this.field5055 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field5051.field1388[this.field5046] >= var3) {
                            this.field5061 = var3;
                            this.field5063 = class594.field8494 - var3;
                            return;
                        }
                        class324.method1958(this.field5051, (byte) 42, arg1, this.field5046);
                        var3 -= this.field5051.field1388[this.field5046];
                        this.field5046++;
                        if (this.field5046 >= this.field5051.field1402.length) {
                            this.field5046 -= this.field5051.field1411;
                            if (this.field5046 < 0 || this.field5051.field1402.length <= this.field5046) {
                                this.field5051 = null;
                                continue label92;
                            }
                        }
                        this.field5055 = this.field5046 + 1;
                    } while (this.field5051.field1402.length > this.field5055);
                    this.field5055 -= this.field5051.field1411;
                } while (this.field5055 >= 0 && this.field5055 < this.field5051.field1402.length);
                this.field5055 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2151(int arg0, byte arg1, int arg2) {
        if (arg1 >= -36) {
            return false;
        } else {
            field5037++;
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field5043++;
        if (this.field5071 != null) {
            this.field5071.method1344();
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLha;IIZ)Lka;")
    public final class233 method2152(boolean arg0, class475 arg1, int arg2, int arg3, boolean arg4) {
        field5036++;
        class416 var6 = class312.field4418.method369((byte) 125, this.field5054);
        if (var6.field5736 != null) {
            var6 = var6.method2458(class578.field8328, -1);
        }
        if (var6 == null) {
            this.method2158(arg1, -9152);
            this.field5039 = -1;
            this.field5041 = -1;
            this.field5064 = -1;
            return null;
        }
        if (!this.field5035 && this.field5064 != var6.field5746) {
            this.field5070 = null;
            this.method2154((byte) 109, -1);
        }
        this.method2150(0, this.field5033);
        if (arg0) {
            boolean var7 = arg0 & this.field5031 & class420.field5820.field9457.method3741(17539) != 0;
            arg0 = var7 & (this.field5041 != var6.field5746 || this.field5051 != null && class420.field5820.field9457.method3741(17539) >= 2 && (this.field5046 != this.field5039 || (this.field5051.field1400 || class568.field7904) && this.field5055 != this.field5046));
        }
        if (arg4 && !arg0) {
            this.field5064 = var6.field5746;
            return null;
        } else if (arg2 > -116) {
            return null;
        } else {
            if (arg0) {
                class460.method2686(this.field5068, this.field5048, this.field5033.field10347, this.field5033.field10350, this.field5058);
                this.field5041 = -1;
                this.field5039 = -1;
            }
            class419 var8 = class678.field9594[this.field5048];
            class419 var9;
            if (this.field5038) {
                var9 = class495.field6799[0];
            } else {
                var9 = this.field5048 >= 3 ? null : class678.field9594[this.field5048 + 1];
            }
            class233 var10 = null;
            if (this.field5051 != null) {
                if (arg0) {
                    arg3 |= 0x40000;
                }
                var10 = var6.method2445(this.field5067 == 11 ? this.field5040 + 4 : this.field5040, this.field5046, this.field5051, this.field5067 == 11 ? 10 : this.field5067, var9, var8.method2478(true, this.field5033.field10350, this.field5033.field10347), this.field5033.field10350, this.field5052, this.field5033.field10347, arg3, var8, arg1, this.field5061, -1361205725, this.field5055);
                if (var10 == null) {
                    this.field5045 = 0;
                    this.field5058 = null;
                    this.field5068 = null;
                    this.field5060 = 0;
                } else {
                    if (arg0) {
                        if (this.field5058 == null) {
                            this.field5058 = new boolean[4];
                        }
                        this.field5068 = var10.method539(this.field5068);
                        class632.method3610(this.field5068, this.field5048, this.field5033.field10347, this.field5033.field10350, this.field5058);
                        this.field5041 = var6.field5746;
                        this.field5039 = this.field5046;
                    }
                    this.field5060 = var10.method534();
                    this.field5045 = var10.method544();
                }
                this.field5070 = null;
            } else if (this.field5070 != null && arg3 == (arg3 & this.field5070.method591()) && this.field5064 == var6.field5746) {
                var10 = this.field5070;
            } else {
                if (this.field5070 != null) {
                    arg3 |= this.field5070.method591();
                }
                class529 var11 = var6.method2447(-106, this.field5067 == 11 ? this.field5040 + 4 : this.field5040, this.field5067 == 11 ? 10 : this.field5067, this.field5033.field10350, arg3, arg0, var8.method2478(true, this.field5033.field10350, this.field5033.field10347), var9, this.field5052, this.field5033.field10347, arg1, var8);
                if (var11 == null) {
                    this.field5060 = 0;
                    this.field5045 = 0;
                    this.field5070 = null;
                    this.field5068 = null;
                    this.field5058 = null;
                } else {
                    var10 = var11.field7375;
                    this.field5070 = var11.field7375;
                    if (arg0) {
                        this.field5068 = var11.field7377;
                        this.field5058 = null;
                        class632.method3610(this.field5068, this.field5048, this.field5033.field10347, this.field5033.field10350, null);
                        this.field5041 = var6.field5746;
                        this.field5039 = -1;
                    }
                    this.field5060 = var10.method534();
                    this.field5045 = var10.method544();
                }
            }
            this.field5064 = var6.field5746;
            return var10;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lpe;Z)V")
    public final void method2153(class685 arg0, boolean arg1) {
        this.field5052 = arg0;
        this.field5070 = null;
        if (!arg1) {
            this.field5068 = null;
        }
        field5057++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V")
    private final void method2154(byte arg0, int arg1) {
        field5056++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg0 < 42) {
            return;
        }
        if (arg1 == -1) {
            class416 var5 = class312.field4418.method369((byte) 125, this.field5054);
            class416 var6 = var5;
            if (var5.field5736 != null) {
                var5 = var5.method2458(class578.field8328, -1);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field5703 != null) {
                if (this.field5051 != null && var5.method2454(this.field5051.field1413, 0)) {
                    return;
                }
                var3 = var5.method2443(false);
                if (this.field5064 != var5.field5746) {
                    var4 = var5.field5699;
                }
            } else if (var5.field5744 == -1) {
                if (var6 != null && var6.field5703 != null) {
                    if (this.field5051 != null && var6.method2454(this.field5051.field1413, 0)) {
                        return;
                    }
                    var3 = var6.method2443(false);
                    if (this.field5064 != var6.field5746) {
                        var4 = var6.field5699;
                    }
                } else if (var6 != null && var6.field5744 != -1 && this.field5064 != var6.field5746) {
                    var4 = var6.field5699;
                    var3 = var6.field5744;
                }
            } else if (this.field5064 != var5.field5746) {
                var4 = var5.field5699;
                var3 = var5.field5744;
            }
        }
        if (var3 == -1) {
            this.field5051 = null;
            return;
        }
        this.field5070 = null;
        if (this.field5051 == null || this.field5051.field1413 != var3) {
            this.field5051 = class168.field2552.method3287(117, var3);
        } else if (this.field5051.field1392 == 0) {
            return;
        }
        if (this.field5051.field1402 == null) {
            this.field5051 = null;
            return;
        }
        if (var4) {
            this.field5046 = (int) (Math.random() * (double) this.field5051.field1402.length);
            this.field5061 = ((int) (Math.random() * (double) this.field5051.field1388[this.field5046])) + 1;
        } else {
            this.field5061 = 1;
            this.field5046 = 0;
        }
        this.field5055 = this.field5046 + 1;
        if (this.field5055 < 0 || this.field5051.field1402.length <= this.field5055) {
            this.field5055 = -1;
        }
        this.field5063 = class594.field8494 - this.field5061;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Z")
    public final boolean method2155(byte arg0) {
        field5049++;
        return arg0 >= -125 ? false : this.field5031;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method2156(int arg0) {
        if (arg0 >= -43) {
            method2151(-111, (byte) 53, 63);
        }
        field5053 = null;
        field5059 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;B)V")
    public final void method2157(class475 arg0, byte arg1) {
        this.method2152(true, arg0, -120, 262144, true);
        int var3 = 42 % ((arg1 - 9) / 44);
        field5047++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lha;I)V")
    public final void method2158(class475 arg0, int arg1) {
        field5032++;
        if (this.field5068 != null) {
            class460.method2686(this.field5068, this.field5048, this.field5033.field10347, this.field5033.field10350, this.field5058);
            this.field5058 = null;
            this.field5068 = null;
        }
        if (arg1 != -9152) {
            this.method2150(9, null);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)I")
    public final int method2159(int arg0) {
        field5042++;
        int var2 = 78 / ((arg0 - 64) / 55);
        return this.field5045;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lha;Lsea;IIIILnfa;ZI)V")
    public class356(class475 arg0, class416 arg1, int arg2, int arg3, int arg4, int arg5, class745 arg6, boolean arg7, int arg8) {
        this.field5040 = arg3;
        this.field5033 = arg6;
        this.field5038 = arg7;
        this.field5067 = arg2;
        this.field5048 = (byte) arg5;
        this.field5044 = (byte) arg4;
        this.field5054 = arg1.field5746;
        this.field5031 = arg0.method500() && arg1.field5770 && !this.field5038;
        if (arg8 != -1) {
            this.field5035 = true;
        }
        this.method2154((byte) 48, arg8);
    }
}
