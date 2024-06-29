import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class315 extends class120 {

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    private int field5307 = 0;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    private int field5309 = 2048;

    @OriginalMember(owner = "client!ik", name = "fb", descriptor = "I")
    private int field5319 = 10;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "[Lok;")
    public static class41[] field5310 = new class41[100];

    @OriginalMember(owner = "client!ik", name = "hb", descriptor = "Lok;")
    private static class41 field5321 = class137.method956("Examine", 45);

    @OriginalMember(owner = "client!ik", name = "jb", descriptor = "Lok;")
    private static class41 field5323 = class137.method956("Loaded title screen", 45);

    @OriginalMember(owner = "client!ik", name = "ib", descriptor = "Lok;")
    public static class41 field5322 = field5323;

    @OriginalMember(owner = "client!ik", name = "lb", descriptor = "Lok;")
    public static class41 field5325 = class137.method956("::wm2", 45);

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "Lok;")
    public static class41 field5311 = field5321;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!ik", name = "Z", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!ik", name = "cb", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!ik", name = "db", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!ik", name = "eb", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!ik", name = "gb", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!ik", name = "kb", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!ik", name = "mb", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!ik", name = "ab", descriptor = "Lbc;")
    public static class302 field5314;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "[I")
    private int[] field5312;

    @OriginalMember(owner = "client!ik", name = "bb", descriptor = "[I")
    private int[] field5315;

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V", line = 133)
    public class315() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V", line = 22)
    public final void method31(int arg0) {
        if (arg0 != -31851) {
            this.field5312 = (int[]) null;
        }
        this.method2179(false);
        field5320++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILbc;IIIII)V", line = 36)
    public static final void method2176(int arg0, int arg1, class302 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 6149) {
            method2178(-57);
        }
        if (class171.field2760) {
            class122.field1817 = 32;
        } else {
            class122.field1817 = 0;
        }
        class171.field2760 = false;
        field5324++;
        if (class269.field4349 != 0) {
            if (arg1 >= arg3 && arg3 + 16 > arg1 && arg0 >= arg5 && (arg5 + 16) > arg0) {
                arg2.field4918 -= 4;
                class18.method91(28515, arg2);
            } else if (arg3 <= arg1 && (arg3 + 16) > arg1 && arg0 >= (arg5 + arg7 - 16) && arg0 < arg5 + arg7) {
                arg2.field4918 += 4;
                class18.method91(28515, arg2);
            } else if ((arg3 - class122.field1817) <= arg1 && arg1 < class122.field1817 + arg3 + 16 && arg0 >= (arg5 + 16) && arg0 < arg5 - (16 - arg7)) {
                int var8 = (arg7 - 32) * arg7 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - arg5 - (16 - -(var8 / 2));
                int var10 = arg7 - (var8 + 32);
                arg2.field4918 = (arg6 - arg7) * var9 / var10;
                class18.method91(arg4 + 22366, arg2);
                class171.field2760 = true;
            }
        }
        if (class160.field2514 == 0) {
            return;
        }
        int var11 = arg2.field4936;
        if ((arg3 - var11) <= arg1 && arg0 >= arg5 && arg3 + 16 > arg1 && arg0 <= (arg5 + arg7)) {
            arg2.field4918 += class160.field2514 * 45;
            class18.method91(28515, arg2);
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V", line = 102)
    public static void method2177(boolean arg0) {
        field5321 = null;
        field5314 = null;
        field5323 = null;
        if (arg0) {
            field5323 = (class41) null;
        }
        field5325 = null;
        field5322 = null;
        field5311 = null;
        field5310 = null;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V", line = 118)
    public static final void method2178(int arg0) {
        if (arg0 != -240) {
            return;
        }
        field5317++;
        if (class94.field1377 == 10 && class166.field2625) {
            class282.method1991(arg0 ^ 0xE8, 28);
        }
        if (class94.field1377 == 30) {
            class282.method1991(-8, 25);
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(Z)V", line = 137)
    private final void method2179(boolean arg0) {
        this.field5312 = new int[this.field5319 + 1];
        this.field5315 = new int[this.field5319 + 1];
        field5318++;
        if (arg0) {
            this.field5312 = (int[]) null;
        }
        int var2 = 0;
        int var3 = 4096 / this.field5319;
        int var4 = this.field5309 * var3 >> 12;
        for (int var5 = 0; var5 < this.field5319; var5++) {
            this.field5312[var5] = var2;
            this.field5315[var5] = var2 + var4;
            var2 += var3;
        }
        this.field5312[this.field5319] = 4096;
        this.field5315[this.field5319] = this.field5315[0] + 4096;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Llb;II)V", line = 180)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field5308++;
        if (arg1 != -1) {
            this.method31(-105);
        }
        if (arg2 == 0) {
            this.field5319 = arg0.method792(arg1 + 3);
        } else if (arg2 == 1) {
            this.field5309 = arg0.method759((byte) -112);
        } else if (arg2 == 2) {
            this.field5307 = arg0.method792(2);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIILlb;IZI)V", line = 224)
    public static final void method2180(int arg0, int arg1, int arg2, int arg3, int arg4, class112 arg5, int arg6, boolean arg7, int arg8) {
        if (arg6 >= 0 && arg6 < 104 && arg1 >= 0 && arg1 < 104) {
            if (!arg7) {
                class126.field1879[arg4][arg6][arg1] = 0;
            }
            while (true) {
                int var9 = arg5.method792(arg8 ^ 0xFFFFDD1E);
                if (var9 == 0) {
                    if (arg7) {
                        class278.field4548[0][arg6][arg1] = class214.field3443[0][arg6][arg1];
                    } else if (arg4 == 0) {
                        class278.field4548[0][arg6][arg1] = -class44.method322(arg6 + arg2 + 932731, arg1 + 556238 - -arg0, class26.method169(arg8, 8853)) * 8;
                    } else {
                        class278.field4548[arg4][arg6][arg1] = class278.field4548[arg4 - 1][arg6][arg1] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg5.method792(2);
                    if (arg7) {
                        class278.field4548[0][arg6][arg1] = var10 * 8 + class214.field3443[0][arg6][arg1];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg4 == 0) {
                            class278.field4548[0][arg6][arg1] = -var10 * 8;
                        } else {
                            class278.field4548[arg4][arg6][arg1] = class278.field4548[arg4 - 1][arg6][arg1] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class224.field3586[arg4][arg6][arg1] = arg5.method785((byte) -122);
                    class69.field1043[arg4][arg6][arg1] = (byte) ((var9 - 2) / 4);
                    class276.field4521[arg4][arg6][arg1] = (byte) class217.method1563(var9 + arg3 - 2, 3);
                } else if (var9 > 81) {
                    class277.field4542[arg4][arg6][arg1] = (byte) (var9 - 81);
                } else if (!arg7) {
                    class126.field1879[arg4][arg6][arg1] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg5.method792(2);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg5.method792(2);
                    break;
                }
                if (var11 <= 49) {
                    arg5.method792(2);
                }
            }
        }
        if (arg8 != -8932) {
            field5321 = (class41) null;
        }
        field5313++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[I", line = 356)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            this.field5315 = (int[]) null;
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int var4 = class16.field216[arg0];
            if (this.field5307 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field5319; var12++) {
                    if (this.field5312[var12] <= var4 && var4 < this.field5312[var12 + 1]) {
                        if (this.field5315[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class21.method143(var3, 0, class307.field5160, var11);
            } else {
                for (int var5 = 0; var5 < class307.field5160; var5++) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class203.field3278[var5];
                    int var9 = this.field5307;
                    if (var9 == 1) {
                        var7 = var8;
                    } else if (var9 == 2) {
                        var7 = (var8 - (4096 - var4) >> 1) + 2048;
                    } else if (var9 == 3) {
                        var7 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field5319; var10++) {
                        if (this.field5312[var10] <= var7 && this.field5312[var10 + 1] > var7) {
                            if (var7 < this.field5315[var10]) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            }
        }
        field5316++;
        return var3;
    }
}
