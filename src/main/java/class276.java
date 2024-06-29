import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class276 extends class217 {

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Lvj;")
    public static class106 field4239 = new class106(128);

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Ljava/lang/String;")
    public static String field4245 = "flash2:";

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Llb;")
    public static class211 field4244;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "Lcb;")
    public static class283 field4240;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIJ)Z", line = 4)
    public static final boolean method1925(int arg0, int arg1, int arg2, long arg3) {
        class99 var5 = class250.field3746[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1486 != null && var5.field1486.field91 == arg3) {
            return true;
        } else if (var5.field1474 != null && var5.field1474.field4550 == arg3) {
            return true;
        } else if (var5.field1472 != null && var5.field1472.field2568 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1488; var6++) {
                if (var5.field1471[var6].field1327 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(III)I", line = 39)
    public static final int method1926(int arg0, int arg1, int arg2) {
        field4242++;
        class278 var3 = (class278) class171.field2547.method203(1710, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else if (arg1 == -1) {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4274.length; var5++) {
                if (var3.field4272[var5] == arg2) {
                    var4 += var3.field4274[var5];
                }
            }
            return var4;
        } else {
            return -86;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIII)V", line = 73)
    public static final void method1927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4226++;
        int var9 = arg3 - arg4;
        int var10 = (arg7 - arg1 << 16) / var9;
        int var11 = arg5 - arg0;
        int var12 = (arg8 - arg2 << 16) / var11;
        if (arg6 == -1) {
            class141.method1062(0, arg1, arg2, 935664710, var12, 0, arg5, var10, arg4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Z", line = 96)
    public final boolean method1928(int arg0, byte arg1) {
        field4230++;
        if (arg1 != -60) {
            this.method1937(true);
        }
        return (this.field4234 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V", line = 108)
    public static void method1929(byte arg0) {
        field4244 = null;
        field4240 = null;
        field4245 = null;
        field4239 = null;
        if (arg0 != -103) {
            field4239 = (class106) null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V", line = 123)
    public static final void method1930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class45.field713 = -1;
        class257.field3832 = -1;
        field4228++;
        class12.field136 = class87.field1280 * arg4 / arg0;
        class241.field3631 = class193.field3089 * arg3 / arg2;
        class62.method546(arg1 ^ 0xFFFFB478);
        if (arg1 != 19446) {
            method1930(-96, 121, 0, -95, 112);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V", line = 140)
    public static final void method1931(int arg0, int arg1) {
        if (arg0 != 2) {
            method1925(-82, -46, -17, -77L);
        }
        if (arg1 == -1 && !class213.field3386) {
            class12.method94((byte) 13);
        } else if (arg1 != -1 && (class287.field4422 != arg1 || !class59.method527((byte) 117)) && class170.field2536 != 0 && !class213.field3386) {
            class227.method1612(arg1, 2, false, true, class178.field2663, class170.field2536, 0);
        }
        field4231++;
        class287.field4422 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)I", line = 163)
    public final int method1932(int arg0) {
        field4229++;
        if (arg0 != -1) {
            method1935((class70) null, (byte) -58);
        }
        return class205.method1472(this.field4234, (byte) -117);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Z", line = 175)
    public final boolean method1933(int arg0) {
        if (arg0 >= -53) {
            return false;
        } else {
            field4235++;
            return ((this.field4234 & 0x43DA93) >> 22) != 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)Z", line = 187)
    public final boolean method1934(byte arg0) {
        int var2 = -56 / ((arg0 - 75) / 43);
        field4236++;
        return (this.field4234 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lom;B)V", line = 200)
    public static final void method1935(class70 arg0, byte arg1) {
        for (int var2 = 0; var2 < class245.field3688.length; var2++) {
            class245.field3688[var2] = 0;
        }
        short var3 = 256;
        field4225++;
        if (arg1 != -109) {
            method1926(104, -99, 24);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var3);
            class245.field3688[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var3 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class142.field2194[var9] = (class245.field3688[var9 + 1] + class245.field3688[var9 - 128] + class245.field3688[var9 + -1] + class245.field3688[var9 + 128]) / 4;
                }
            }
            int[] var10 = class245.field3688;
            class245.field3688 = class142.field2194;
            class142.field2194 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field4595; var12++) {
            for (int var13 = 0; var13 < arg0.field4579; var13++) {
                if (arg0.field1021[var11++] != 0) {
                    int var14 = var13 + arg0.field4589 + 16;
                    int var15 = var12 + arg0.field4583 + 16;
                    int var16 = (var15 << 7) + var14;
                    class245.field3688[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)Z", line = 292)
    public final boolean method1936(int arg0) {
        if (arg0 != -24289) {
            this.field4237 = -75;
        }
        field4241++;
        return (this.field4234 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)I", line = 304)
    public final int method1937(boolean arg0) {
        if (arg0) {
            field4239 = (class106) null;
        }
        field4224++;
        return this.field4234 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(B)Z", line = 315)
    public final boolean method1938(byte arg0) {
        field4227++;
        if (arg0 <= 52) {
            this.field4237 = -29;
        }
        return (this.field4234 & 0x37F914) >> 21 != 0;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)Z", line = 328)
    public final boolean method1939(boolean arg0) {
        if (arg0) {
            field4238++;
            return (this.field4234 >> 30 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Llb;Llb;Llb;I)V", line = 342)
    public static final void method1940(class211 arg0, class211 arg1, class211 arg2, int arg3) {
        field4232++;
        class262.field3881 = arg2;
        class83.field1165 = arg0;
        class57.field853 = arg1;
        if (arg3 >= -81) {
            field4239 = (class106) null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)Z", line = 361)
    public final boolean method1941(int arg0) {
        field4243++;
        if (arg0 == 0) {
            return (this.field4234 >> 29 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)Z", line = 375)
    public final boolean method1942(int arg0) {
        field4233++;
        if (arg0 >= -94) {
            return true;
        } else {
            return (this.field4234 & 0x1A24075E) >> 28 != 0;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(II)V", line = 384)
    public class276(int arg0, int arg1) {
        this.field4234 = arg0;
        this.field4237 = arg1;
    }
}
