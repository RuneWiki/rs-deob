import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class76 extends class137 {

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    private int field1218;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static volatile int field1237 = 0;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "[I")
    public static int[] field1233;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lal;Lal;I)V")
    public static final void method545(class252 arg0, class252 arg1, int arg2) {
        if (arg0.field4142 != null) {
            arg0.method1708((byte) 90);
        }
        arg0.field4140 = arg1.field4140;
        arg0.field4142 = arg1;
        field1217++;
        if (arg2 == 0) {
            arg0.field4142.field4140 = arg0;
            arg0.field4140.field4142 = arg0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI[II)V")
    public final void method546(byte arg0, int arg1, int[] arg2, int arg3) {
        if (arg0 == -112) {
            arg2[2] = this.field1219 + arg3 - this.field1221;
            field1235++;
            arg2[1] = this.field1223 + arg1 - this.field1232;
            arg2[0] = this.field1224;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBI)Z")
    public final boolean method547(int arg0, byte arg1, int arg2) {
        field1236++;
        if (arg1 <= 2) {
            this.field1232 = 98;
        }
        return arg2 >= this.field1223 && arg2 <= this.field1231 && arg0 >= this.field1219 && arg0 <= this.field1234;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Luh;")
    public static final class107 method548(int arg0, int arg1) {
        int var2 = -99 % ((9 - arg0) / 62);
        field1228++;
        if (arg1 == 0) {
            return new class117();
        } else if (arg1 == 1) {
            return new class188();
        } else if (arg1 == 2) {
            return new class59();
        } else if (arg1 == 3) {
            return new class304();
        } else if (arg1 == 4) {
            return new class249();
        } else if (arg1 == 5) {
            return new class232();
        } else if (arg1 == 6) {
            return new class53();
        } else if (arg1 == 7) {
            return new class36();
        } else if (arg1 == 8) {
            return new class256();
        } else if (arg1 == 9) {
            return new class24();
        } else if (arg1 == 10) {
            return new class153();
        } else if (arg1 == 11) {
            return new class297();
        } else if (arg1 == 12) {
            return new class203();
        } else if (arg1 == 13) {
            return new class110();
        } else if (arg1 == 14) {
            return new class174();
        } else if (arg1 == 15) {
            return new class272();
        } else if (arg1 == 16) {
            return new class75();
        } else if (arg1 == 17) {
            return new class290();
        } else if (arg1 == 18) {
            return new class311();
        } else if (arg1 == 19) {
            return new class300();
        } else if (arg1 == 20) {
            return new class85();
        } else if (arg1 == 21) {
            return new class157();
        } else if (arg1 == 22) {
            return new class169();
        } else if (arg1 == 23) {
            return new class186();
        } else if (arg1 == 24) {
            return new class170();
        } else if (arg1 == 25) {
            return new class225();
        } else if (arg1 == 26) {
            return new class211();
        } else if (arg1 == 27) {
            return new class89();
        } else if (arg1 == 28) {
            return new class244();
        } else if (arg1 == 29) {
            return new class81();
        } else if (arg1 == 30) {
            return new class132();
        } else if (arg1 == 31) {
            return new class48();
        } else if (arg1 == 32) {
            return new class296();
        } else if (arg1 == 33) {
            return new class163();
        } else if (arg1 == 34) {
            return new class191();
        } else if (arg1 == 35) {
            return new class238();
        } else if (arg1 == 36) {
            return new class229();
        } else if (arg1 == 37) {
            return new class46();
        } else if (arg1 == 38) {
            return new class173();
        } else if (arg1 == 39) {
            return new class143();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)Z")
    public static final boolean method549(byte arg0) {
        field1220++;
        class253 var1 = class171.field2801;
        synchronized (class171.field2801) {
            if (class296.field4834 == class281.field4573) {
                return false;
            }
            class290.field4737 = class166.field2737[class281.field4573];
            if (arg0 < 90) {
                method554((byte) 44);
            }
            class233.field3645 = class62.field957[class281.field4573];
            class281.field4573 = class281.field4573 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIII)Z")
    public final boolean method550(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            method552(127, -87L, (int[]) null, -54);
        }
        field1216++;
        return this.field1215 == arg1 && this.field1232 <= arg2 && this.field1225 >= arg2 && arg3 >= this.field1221 && this.field1218 >= arg3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[III)V")
    public final void method551(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 < 20) {
            this.field1223 = 76;
        }
        arg1[0] = this.field1215;
        arg1[1] = arg3 - (this.field1223 - this.field1232);
        arg1[2] = this.field1221 + arg0 - this.field1219;
        field1229++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
    public static final String method552(int arg0, long arg1, int[] arg2, int arg3) {
        field1230++;
        if (class70.field1125 != null) {
            String var5 = class70.field1125.method1651(arg1, arg2, -12, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg0 != 64) {
            field1226 = 20;
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public static void method553(int arg0) {
        if (arg0 > 111) {
            field1233 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1232 = arg2;
        this.field1234 = arg9;
        this.field1215 = arg0;
        this.field1218 = arg5;
        this.field1221 = arg3;
        this.field1223 = arg6;
        this.field1219 = arg7;
        this.field1224 = arg1;
        this.field1225 = arg4;
        this.field1231 = arg8;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V")
    public static final void method554(byte arg0) {
        field1227++;
        class21.method165(false, 120);
        class52.field770 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class158.field2563.length; var2++) {
            if (class236.field3705[var2] != -1 && class158.field2563[var2] == null) {
                class158.field2563[var2] = class175.field2919.method1156(class236.field3705[var2], 0, (byte) -16);
                if (class158.field2563[var2] == null) {
                    var1 = false;
                    class52.field770++;
                }
            }
            if (class33.field544[var2] != -1 && class197.field3176[var2] == null) {
                class197.field3176[var2] = class175.field2919.method1157(-2, class33.field544[var2], 0, class304.field4955[var2]);
                if (class197.field3176[var2] == null) {
                    var1 = false;
                    class52.field770++;
                }
            }
            if (class295.field4819 != null && class251.field4125[var2] == null && class295.field4819[var2] != -1) {
                class251.field4125[var2] = class175.field2919.method1157(-2, class295.field4819[var2], 0, class304.field4955[var2]);
                if (class251.field4125[var2] == null) {
                    var1 = false;
                    class52.field770++;
                }
            }
        }
        if (class68.field1092 == null) {
            if (class144.field2318 == null || !class236.field3710.method1143(-127, class144.field2318.field2752 + "_labels")) {
                class68.field1092 = new class198(0);
            } else if (class236.field3710.method1163(-122, class144.field2318.field2752 + "_labels")) {
                class68.field1092 = client.method1127(class144.field2318.field2752 + "_labels", class213.field3383, (byte) -78, class236.field3710);
            } else {
                class52.field770++;
                var1 = false;
            }
        }
        if (!var1) {
            class173.field2904 = 1;
            return;
        }
        class210.field3345 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class158.field2563.length; var4++) {
            byte[] var20 = class197.field3176[var4];
            if (var20 != null) {
                int var21 = (class122.field1938[var4] >> 8) * 64 - class75.field1211;
                int var22 = (class122.field1938[var4] & 0xFF) * 64 - class145.field2327;
                if (class128.field2056) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class117.method807(89, var21, var22, var20);
            }
        }
        if (!var3) {
            class173.field2904 = 2;
        } else if (arg0 < -79) {
            if (class173.field2904 != 0) {
                class247.method1671(class115.field1755 + "<br>(100%)", true, -436);
            }
            class243.method1653(false);
            class290.method2001((byte) 119);
            boolean var5 = false;
            class287.method1950(4, 104, 104, 25, var5);
            for (int var6 = 0; var6 < 4; var6++) {
                class310.field5021[var6].method353(-111);
            }
            for (int var7 = 0; var7 < 4; var7++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    for (int var19 = 0; var19 < 104; var19++) {
                        class214.field3386[var7][var18][var19] = 0;
                    }
                }
            }
            class97.method696((byte) 113, false);
            class243.method1653(false);
            System.gc();
            class21.method165(true, 120);
            class7.method71(false, false);
            if (!class128.field2056) {
                class101.method712(15921, false);
                class21.method165(true, -33);
                class134.method922(false, (byte) -6);
                if (class251.field4125 != null) {
                    class108.method763(false);
                }
            }
            if (class128.field2056) {
                class63.method418(false, 5000);
                class21.method165(true, 117);
                class263.method1777(121, false);
            }
            class290.method2001((byte) 127);
            class21.method165(true, 123);
            class80.method578(class128.field2056 ? class290.field4757 : null, class310.field5021, false, -45);
            class21.method165(true, -84);
            int var8 = class272.field4390;
            if (var8 > class214.field3389) {
                var8 = class214.field3389;
            }
            if (class214.field3389 - 1 > var8) {
                int var9 = class214.field3389 - 1;
            }
            if (class143.method981(22351)) {
                class58.method373(0);
            } else {
                class58.method373(class272.field4390);
            }
            class182.method1289(-28);
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var17 = 0; var17 < 104; var17++) {
                    class63.method409(var17, (byte) -23, var10);
                }
            }
            class89.method623((byte) 117);
            class243.method1653(false);
            class186.method1314(14986);
            class290.method2001((byte) 96);
            if (class53.field776 != null && class18.field322 != null && class238.field3741 == 25) {
                class155.field2476++;
                class311.field5027.method2081(false, 54);
                class311.field5027.method1831(1057001181, 119690440);
            }
            if (!class128.field2056) {
                int var11 = (class296.field4824 - 6) / 8;
                int var12 = (class311.field5030 - 6) / 8;
                int var13 = (class311.field5030 + 6) / 8;
                int var14 = (class296.field4824 + 6) / 8;
                for (int var15 = var11 - 1; var15 <= (var14 + 1); var15++) {
                    for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                        if (var11 > var15 || var14 < var15 || var16 < var12 || var13 < var16) {
                            class175.field2919.method1150("m" + var15 + "_" + var16, -11);
                            class175.field2919.method1150("l" + var15 + "_" + var16, -119);
                        }
                    }
                }
            }
            if (class238.field3741 == 28) {
                class143.method983(10, 16590);
            } else {
                class143.method983(30, 16590);
                if (class18.field322 != null) {
                    class311.field5027.method2081(false, 29);
                }
            }
            class304.method2072(-1);
            class243.method1653(false);
            class92.method639(51);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)I")
    public static int method555(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(IBI)Z")
    public final boolean method556(int arg0, byte arg1, int arg2) {
        field1222++;
        int var4 = 45 / ((-arg1 - 20) / 38);
        return this.field1232 <= arg2 && this.field1225 >= arg2 && arg0 >= this.field1221 && arg0 <= this.field1218;
    }
}
