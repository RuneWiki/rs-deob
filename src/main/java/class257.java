import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class257 extends class260 {

    @OriginalMember(owner = "client!ln", name = "p", descriptor = "Leg;")
    private class70 field3570;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "F")
    public float field3576;

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "I")
    public int field3583;

    @OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!ln", name = "s", descriptor = "Lef;")
    private class338 field3573;

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "[I")
    private int[] field3578;

    @OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "Lgu;")
    private class409 field3565;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "Lem;")
    public static class150 field3566 = null;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ln", name = "D", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "Lwc;")
    private class48 field3582;

    @OriginalMember(owner = "client!ln", name = "t", descriptor = "Ljaggl/memory/NativeBuffer;")
    private NativeBuffer field3574;

    @OriginalMember(owner = "client!ln", name = "r", descriptor = "Ljaggl/memory/NativeStream;")
    private NativeStream field3572;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "[[I")
    public static int[][] field3581;

    static {
        new class466("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1543(byte arg0) {
        field3584++;
        if (arg0 != -72) {
            field3566 = null;
        }
        if (class269.field3721 == null) {
            return;
        }
        class296.field4069.method2457(8165);
        class117.method830();
        class214.method1327(5743);
        class419.method2498(-20);
        class348.method2057(true);
        class427.method2527(6571);
        if (class294.field4052 != null) {
            class294.field4052.method1808(0);
        }
        class236.method1455((byte) -126);
        class142.method959(-21808);
        class494.method2894(72);
        class96.method706(arg0 ^ 0x121B, false);
        class50.method444(17755);
        for (int var1 = 0; var1 < 2048; var1++) {
            class438 var5 = class12.field182[var1];
            if (var5 != null) {
                var5.field1125 = null;
                for (int var6 = 0; var6 < var5.field1126.length; var6++) {
                    var5.field1126[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class378.field5533.length; var2++) {
            class502 var3 = class378.field5533[var2];
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field1126.length; var4++) {
                    var3.field1126[var4] = null;
                }
            }
        }
        class269.field3721.method267(arg0 - 46);
        class269.field3721 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)V", line = 80)
    public final void method1544(int arg0, boolean arg1) {
        this.field3572.method2599();
        field3569++;
        class334 var3 = this.field3573.method1940(4, false, arg0 * 4, this.field3574, -84);
        this.field3582 = new class48(var3, 5121, 4, 0);
        this.field3572 = null;
        this.field3574 = null;
        if (!arg1) {
            this.field3565 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)V", line = 96)
    public final void method1545(int arg0, byte arg1) {
        int var3 = 90 % ((arg1 + 54) / 43);
        field3585++;
        this.field3572.method2597(arg0 * 4 + 3);
        this.field3572.method2593(-1);
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V", line = 107)
    public static void method1546(int arg0) {
        field3566 = null;
        if (arg0 != 16711680) {
            field3566 = null;
        }
        field3581 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[I)V", line = 122)
    public final void method1547(int arg0, int arg1, int[] arg2) {
        if (arg1 != -65536) {
            this.field3571 = 37;
        }
        field3577++;
        int var4 = 0;
        class391 var5 = class194.field2768;
        var5.field5719 = 0;
        if (this.field3573.field4772) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg2[var12];
                int var14 = this.field3578[var13];
                short[] var15 = this.field3570.field969[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var15.length > var17) {
                        if ((var14 & 0x1 << var16++) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method2355(1686288168, var15[var17++] & 0xFFFF);
                            var5.method2355(1686288168, var15[var17++] & 0xFFFF);
                            var4++;
                            var5.method2355(arg1 ^ 0x9B7DB728, var15[var17++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg2[var6];
                int var8 = this.field3578[var7];
                short[] var9 = this.field3570.field969[var7];
                if (var8 != 0 && var9 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var9.length) {
                        if ((0x1 << var10++ & var8) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method2310((byte) 99, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method2310((byte) 56, var9[var11++] & 0xFFFF);
                            var4++;
                            var5.method2310((byte) 119, var9[var11++] & 0xFFFF);
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field3565.method1016(var5.field5719, var5.field5678, 5123, (byte) -87);
        this.field3573.method1968(this.field3570.field979, this.field3582, arg1 + 65645, this.field3570.field978, this.field3570.field985);
        this.field3573.method2002((this.field3570.field963 & 0x8) != 0, (byte) -126, (this.field3570.field963 & 0x7) != 0, this.field3571);
        if (this.field3573.field4856) {
            this.field3573.method305(Integer.MAX_VALUE, this.field3568, this.field3583, this.field3575);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field3576, 1.0F / this.field3576, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field3573.method1968(this.field3570.field979, this.field3582, 106, this.field3570.field978, this.field3570.field985);
        this.field3573.method1981((byte) 81, var4, 0, 4, this.field3565);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(FIIIZ)V", line = 245)
    public final void method1548(float arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3580++;
        if (this.field3571 != -1) {
            class166 var6 = this.field3573.field471.method1654(42, this.field3571);
            int var7 = var6.field2486 & 0xFF;
            if (var7 != 0 && var6.field2492 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 <= 127) {
                    var8 = arg1 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field2499 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg3 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var14 >> 8) + ((var12 & 0x2600FF00) << 8) + (var13 & 0xFF00);
            }
        }
        if (arg0 != 1.0F) {
            int var15 = arg3 >> 16 & 0xFF;
            int var16 = (arg3 & 0xFFF4) >> 8;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg0);
            int var19 = (int) ((float) var16 * arg0);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var17 * arg0);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var20 | var19 << 8 | var18 << 16;
        }
        this.field3572.method2597(arg2 * 4);
        if (!arg4) {
            field3566 = null;
        }
        this.field3572.method2593((byte) (arg3 >> 16));
        this.field3572.method2593((byte) (arg3 >> 8));
        this.field3572.method2593((byte) arg3);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)V", line = 358)
    public final void method1549(int arg0, int arg1, int arg2, int arg3) {
        this.field3578[this.field3570.field2037 * arg1 + arg0] = class255.method1532(this.field3578[this.field3570.field2037 * arg1 + arg0], arg2 << arg3);
        field3567++;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V", line = 366)
    public final void method1550(int arg0, int arg1) {
        this.field3574 = this.field3573.field4742.method2602(arg0 * 4);
        if (arg1 != 18481) {
            this.field3582 = null;
        }
        field3586++;
        this.field3572 = new NativeStream(this.field3574);
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V", line = 387)
    public static final void method1551(int arg0) {
        field3579++;
        if (arg0 != 5890) {
            field3566 = null;
        }
        if (class420.field6137) {
            return;
        }
        if (class20.field269.field7654) {
            class252.field3498 = ((int) class252.field3498 - 17 & 0xFFFFFFF0);
        } else {
            class187.field2712 += (-class187.field2712 - 12.0F) / 2.0F;
        }
        class463.field6805 = true;
        class420.field6137 = true;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Leg;IIIII)V", line = 421)
    public class257(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3570 = arg0;
        this.field3576 = arg2;
        this.field3583 = arg4;
        this.field3571 = arg1;
        this.field3568 = arg3;
        this.field3573 = this.field3570.field957;
        this.field3578 = new int[this.field3570.field2037 * this.field3570.field2031];
        this.field3575 = arg5;
        this.field3565 = new class409(this.field3573, 5123, null, 1);
    }
}
