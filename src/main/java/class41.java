import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class41 {

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Z")
    private boolean field598 = true;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    private int field611 = -1;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    private int field597;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "[Lhe;")
    private class240[] field606;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "[Lhe;")
    private class240[] field613;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lhe;")
    private class240 field604;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field601 = 0;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[S")
    public static short[] field617 = new short[256];

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lig;")
    private class154 field609;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V", line = 11)
    public static final void method285(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class463.field7116.field2960 * arg3 >> 8;
        if (arg2 != -5417) {
            return;
        }
        field605++;
        if (var4 != 0 && arg1 != -1) {
            class88.method657(class395.field5765, var4, 0, (byte) 93, false, arg1);
            class127.field2053 = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lqq;II)Z", line = 32)
    public final boolean method286(class318 arg0, int arg1, int arg2) {
        if (this.field611 != arg2) {
            this.field611 = arg2;
            int var4 = class99.method749(arg2, -23866);
            if (var4 > arg2) {
                var4 = class339.method2093(-128, arg2);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field600 != var4) {
                this.field609 = null;
                this.field600 = var4;
            }
            if (this.field606 != null) {
                this.field603 = 0;
                int[] var5 = new int[this.field606.length];
                for (int var6 = 0; var6 < this.field606.length; var6++) {
                    class240 var7 = this.field606[var6];
                    if (var7.method1440(this.field597, this.field596, this.field608, this.field611)) {
                        var5[this.field603] = var7.field3627;
                        this.field613[this.field603++] = var7;
                    }
                }
                class175.method1100(this.field613, 0, this.field603 - 1, var5, 14677);
            }
            this.field598 = true;
        }
        field614++;
        boolean var8 = false;
        if (this.field598) {
            this.field598 = false;
            for (int var9 = this.field603 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field613[var9].method1436(arg0, this.field604);
                var8 |= var10;
                this.field598 |= !var10;
            }
        }
        return arg1 == 0 ? var8 : true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V", line = 110)
    public static final void method287(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            return;
        }
        if (class355.field5296 <= arg3 - arg1 && class320.field4818 >= arg1 + arg3 && class248.field3808 <= arg4 - arg1 && arg1 + arg4 <= class478.field7310) {
            class392.method2334(arg4, arg1, (byte) 21, arg3, arg0);
        } else {
            class307.method1847(arg1, (byte) -128, arg4, arg3, arg0);
        }
        field612++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZI)V", line = 131)
    public static final void method288(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        field615++;
        class174 var3 = class152.field2427[arg2][arg0];
        if (var3 != null) {
            class2.field14 = var3.field2717;
            class446.field6866 = var3.field2712;
            class245.field3728 = var3.field2724;
        }
        class307.method1845(4765);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)V", line = 154)
    public static final void method289(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field602++;
        if (class376.method2264((byte) -119, arg0)) {
            class396.method2350((byte) -32, arg4, class409.field5933[arg0], arg2, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I[Lhe;IIII)V", line = 278)
    public class41(int arg0, class240[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field595 = arg0;
        this.field608 = arg5;
        this.field597 = arg3;
        this.field606 = arg1;
        this.field596 = arg4;
        if (arg1 == null) {
            this.field613 = null;
            this.field604 = null;
        } else {
            this.field613 = new class240[arg1.length];
            this.field604 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V", line = 170)
    public static final void method290(int arg0, boolean arg1) {
        if (arg1) {
            if (class375.field5475 != -1) {
                class42.method298((byte) -23, class375.field5475);
            }
            for (class394 var2 = (class394) class245.field3741.method2415((byte) -67); var2 != null; var2 = (class394) class245.field3741.method2416((byte) -124)) {
                if (!var2.method1124(-121)) {
                    var2 = (class394) class245.field3741.method2415((byte) 69);
                    if (var2 == null) {
                        break;
                    }
                }
                class217.method1332(false, true, var2, arg0 + 8996);
            }
            class375.field5475 = -1;
            class245.field3741 = new class407(8);
            class394.method2338(arg0 ^ 0x1BC9);
            class375.field5475 = class315.field4750;
            class440.method2568(false, 111);
            class119.method831(0);
            class94.method703(class375.field5475);
        }
        field610++;
        class427.method2504(0);
        client.field3001 = -1;
        class349.method2128(class392.field5740, (byte) 12);
        class286.field4329 = new class47();
        class286.field4329.field2232[0] = class150.field2422 / 2;
        class286.field4329.field3218 = class150.field2422 * 128 / 2;
        class286.field4329.field3222 = class21.field272 * 128 / 2;
        class290.field4403 = 0;
        class243.field3655 = 0;
        class286.field4329.field2239[0] = class21.field272 / 2;
        if (class408.field5928 == 2) {
            class243.field3655 = class282.field4278 << 7;
            class290.field4403 = class161.field2530 << 7;
        } else {
            class85.method600(59);
        }
        if (arg0 != -19875) {
            field601 = -27;
        }
        class216.method1330(true);
        if (class243.field3655 == 0 || class290.field4403 == 0) {
            class189.method1196(10, -12254);
        } else {
            class160.method1029((byte) 84);
            class189.method1196(28, -12254);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 246)
    public static final void method291(byte arg0) {
        field607++;
        class6.field58++;
        class400.method2379((byte) -75, class263.field3985);
        class230.field3508.method221(-1, class331.method2058(-5576));
        class230.field3508.method246((byte) -122, class482.field7368);
        if (arg0 < 18) {
            field601 = 87;
        }
        class230.field3508.method246((byte) -97, class147.field2384);
        class230.field3508.method221(-1, class463.field7116.field2970);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V", line = 268)
    public static void method292(byte arg0) {
        if (arg0 < -14) {
            field617 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILqq;IIIIII)V", line = 301)
    public final void method293(int arg0, int arg1, int arg2, class318 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg1 + arg5 & 0x3FFF;
        field594++;
        if (this.field595 == -1) {
            arg3.method1971(arg4, arg6, arg7, arg8, arg2, 0);
        } else {
            class48 var12 = class505.field7629.method59(this.field595, 21645);
            if (this.field609 == null && class505.field7629.method61(this.field595, (byte) -65)) {
                int[] var13 = var12.field739 ? class505.field7629.method60(this.field600, false, this.field595, 0.7F, 112, this.field600) : class505.field7629.method58(this.field600, 0.7F, false, this.field595, this.field600, arg0 + 19908);
                this.field609 = arg3.method1924(var13, 0, this.field600, this.field600, this.field600);
            }
            if (!var12.field739) {
                arg3.method1971(arg4, arg6, arg7, arg8, arg2, 0);
            }
            if (this.field609 != null) {
                int var14 = var12.field739 ? 0 : 1;
                int var15 = arg8 * arg9 / -4096;
                int var16;
                for (var16 = arg8 * var11 / 4096 + (arg7 - arg8) / 2; var16 > arg8; var16 -= arg8) {
                }
                while (var15 > arg8) {
                    var15 -= arg8;
                }
                while (var16 < 0) {
                    var16 += arg8;
                }
                while (var15 < 0) {
                    var15 += arg8;
                }
                for (int var17 = var16 - arg8; var17 < arg7; var17 += arg8) {
                    for (int var18 = var15 - arg8; var18 < arg8; var18 += arg8) {
                        this.field609.method572(arg4 + var17, arg6 + var18, arg8, arg8, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field603 + arg0; var19 >= 0; var19--) {
            this.field613[var19].method1443(arg3, arg4, arg6, arg7, arg8, arg9, var11);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 375)
    public final void method294(int arg0) {
        field616++;
        if (this.field606 != null) {
            for (int var2 = 0; var2 < this.field606.length; var2++) {
                this.field606[var2].method1442();
            }
        }
        this.field609 = null;
        int var3 = -98 % ((49 - arg0) / 61);
    }
}
