import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class423 extends class82 {

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "Lnv;")
    public class44 field6217 = new class44();

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "Lnw;")
    public class255 field6219 = new class255();

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Ljq;")
    private class370 field6209;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "[S")
    public static short[] field6215 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "Lnn;")
    public static class173 field6214;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()Lms;", line = 3)
    public final class82 method719() {
        field6218++;
        class197 var1;
        do {
            var1 = (class197) this.field6217.method296(true);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3085 == null);
        return var1.field3085;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()Lms;", line = 23)
    public final class82 method720() {
        field6213++;
        class197 var1 = (class197) this.field6217.method295((byte) 115);
        if (var1 == null) {
            return null;
        } else if (var1.field3085 == null) {
            return this.method719();
        } else {
            return var1.field3085;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "()I", line = 42)
    public final int method722() {
        field6216++;
        return 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILuu;)V", line = 50)
    public static final void method2633(int arg0, class428 arg1) {
        int var2 = 0;
        int var3 = -9 / ((78 - arg0) / 45);
        while (var2 < class342.field5111) {
            int var4 = class132.field1944[var2];
            class511 var5 = class530.field7747[var4];
            int var6 = arg1.method1337((byte) -108);
            if ((var6 & 0x10) != 0) {
                var6 += arg1.method1337((byte) -119) << 8;
            }
            if ((var6 & 0x800) != 0) {
                var6 += arg1.method1337((byte) 29) << 16;
            }
            class402.method2527(var6, arg1, var5, var4, (byte) -122);
            var2++;
        }
        field6207++;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 85)
    public static void method2634(int arg0) {
        field6214 = null;
        if (arg0 < -71) {
            field6215 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILjs;)V", line = 96)
    private final void method2635(int arg0, int arg1, class197 arg2) {
        if ((this.field6209.field5466[arg2.field3070] & 0x4) != 0 && arg2.field3074 < 0) {
            int var4 = this.field6209.field5471[arg2.field3070] / class193.field2961;
            int var5 = (var4 + 1048575 - arg2.field3087) / var4;
            arg2.field3087 = arg1 * var4 + arg2.field3087 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field6209.field5462[arg2.field3070] == 0) {
                    arg2.field3085 = class248.method1704(arg2.field3083, arg2.field3085.method1683(), arg2.field3085.method1688(), arg2.field3085.method1687());
                } else {
                    arg2.field3085 = class248.method1704(arg2.field3083, arg2.field3085.method1683(), 0, arg2.field3085.method1687());
                    this.field6209.method2358(-1, arg2.field3092.field7041[arg2.field3075] < 0, arg2);
                }
                if (arg2.field3092.field7041[arg2.field3075] < 0) {
                    arg2.field3085.method1697(-1);
                }
                arg1 = arg2.field3087 / var4;
            }
        }
        if (arg0 == 22464) {
            field6206++;
            arg2.field3085.method721(arg1);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "([III)V", line = 135)
    public final void method725(int[] arg0, int arg1, int arg2) {
        field6212++;
        this.field6219.method725(arg0, arg1, arg2);
        for (class197 var4 = (class197) this.field6217.method295((byte) 11); var4 != null; var4 = (class197) this.field6217.method296(true)) {
            if (!this.field6209.method2353((byte) -101, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field3081) {
                        this.method2636(arg0, var5, true, var4, var6, var6 + var5);
                        var4.field3081 -= var5;
                        break;
                    }
                    this.method2636(arg0, var4.field3081, true, var4, var6, var5 + var6);
                    var6 += var4.field3081;
                    var5 -= var4.field3081;
                } while (!this.field6209.method2372(arg0, var6, var4, var5, false));
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 178)
    public final void method721(int arg0) {
        this.field6219.method721(arg0);
        field6208++;
        for (class197 var2 = (class197) this.field6217.method295((byte) 18); var2 != null; var2 = (class197) this.field6217.method296(true)) {
            if (!this.field6209.method2353((byte) -101, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field3081 >= var3) {
                        this.method2635(22464, var3, var2);
                        var2.field3081 -= var3;
                        break;
                    }
                    this.method2635(22464, var2.field3081, var2);
                    var3 -= var2.field3081;
                } while (!this.field6209.method2372(null, 0, var2, var3, false));
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([IIZLjs;II)V", line = 220)
    private final void method2636(int[] arg0, int arg1, boolean arg2, class197 arg3, int arg4, int arg5) {
        field6211++;
        if ((this.field6209.field5466[arg3.field3070] & 0x4) != 0 && arg3.field3074 < 0) {
            int var7 = this.field6209.field5471[arg3.field3070] / class193.field2961;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field3087) / var7;
                if (var8 > arg1) {
                    arg3.field3087 += arg1 * var7;
                    break;
                }
                arg3.field3085.method725(arg0, arg4, var8);
                arg4 += var8;
                arg1 -= var8;
                arg3.field3087 += var7 * var8 - 1048576;
                int var9 = class193.field2961 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class248 var11 = arg3.field3085;
                if (this.field6209.field5462[arg3.field3070] == 0) {
                    arg3.field3085 = class248.method1704(arg3.field3083, var11.method1683(), var11.method1688(), var11.method1687());
                } else {
                    arg3.field3085 = class248.method1704(arg3.field3083, var11.method1683(), 0, var11.method1687());
                    this.field6209.method2358(-1, ~arg3.field3092.field7041[arg3.field3075] > -1, arg3);
                    arg3.field3085.method1695(var9, var11.method1688());
                }
                if (arg3.field3092.field7041[arg3.field3075] < 0) {
                    arg3.field3085.method1697(-1);
                }
                var11.method1669(var9);
                var11.method725(arg0, arg4, arg5 - arg4);
                if (var11.method1677()) {
                    this.field6219.method1807(var11);
                }
            }
        }
        arg3.field3085.method725(arg0, arg4, arg1);
        if (!arg2) {
            field6215 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JIIBZILjava/lang/String;IZILjava/lang/String;)V", line = 285)
    public static final void method2637(long arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, String arg6, int arg7, boolean arg8, int arg9, String arg10) {
        field6210++;
        if (arg3 != -113) {
            method2634(-76);
        }
        if (!class256.field4112 && class540.field7909 < 500) {
            int var12 = arg7 == -1 ? class282.field4402 : arg7;
            class376 var13 = new class376(arg6, arg10, var12, arg5, arg1, arg0, arg2, arg9, arg4, arg8);
            class154.field2370.method292((byte) 121, var13);
            class540.field7909++;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljq;)V", line = 311)
    public class423(class370 arg0) {
        this.field6209 = arg0;
    }
}
