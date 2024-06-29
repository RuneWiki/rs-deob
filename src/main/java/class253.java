import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class253 {

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "[I")
    private int[] field3499 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "Lmc;")
    public static class114 field3513 = null;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "Lcba;")
    public static class471 field3515 = new class471(53, 8);

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "Lcba;")
    public static class471 field3517 = new class471(12, 6);

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "F")
    public static float field3503;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "Lea;")
    public class467 field3501;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "[I")
    private int[] field3506;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "[S")
    private short[] field3500;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "[S")
    private short[] field3509;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "[S")
    private short[] field3512;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "[S")
    private short[] field3516;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)Z")
    public final boolean method1572(int arg0) {
        field3510++;
        if (this.field3506 == null) {
            return true;
        }
        boolean var2 = true;
        class21 var3 = this.field3501.field6571;
        synchronized (this.field3501.field6571) {
            for (int var4 = arg0; var4 < this.field3506.length; var4++) {
                if (!this.field3501.field6571.method229(this.field3506[var4], -1, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)Lln;")
    public final class317 method1573(boolean arg0) {
        field3505++;
        if (this.field3506 == null) {
            return null;
        }
        class317[] var2 = new class317[this.field3506.length];
        class21 var3 = this.field3501.field6571;
        synchronized (this.field3501.field6571) {
            if (!arg0) {
                this.method1581(-77);
            }
            int var4 = 0;
            while (true) {
                if (this.field3506.length <= var4) {
                    break;
                }
                var2[var4] = class428.method2544(-78, 0, this.field3506[var4], this.field3501.field6571);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field3506.length; var5++) {
            if (var2[var5].field4281 < 13) {
                var2[var5].method1971(0, 124);
            }
        }
        class317 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class317(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field3512 != null) {
            for (int var7 = 0; var7 < this.field3512.length; var7++) {
                var6.method1983(this.field3512[var7], 27, this.field3509[var7]);
            }
        }
        if (this.field3516 != null) {
            for (int var8 = 0; var8 < this.field3516.length; var8++) {
                var6.method1981(this.field3500[var8], -27289, this.field3516[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIII)V")
    public static final void method1574(int arg0, int arg1, int arg2, int arg3) {
        field3507++;
        if (arg1 <= 88) {
            field3517 = null;
        }
        if (arg2 == 1003) {
            class123.method854(class435.field6193, arg3, arg0);
        } else if (arg2 == 1012) {
            class123.method854(class341.field4597, arg3, arg0);
        } else if (arg2 == 1001) {
            class123.method854(class283.field3912, arg3, arg0);
        } else if (arg2 == 1006) {
            class123.method854(class559.field7745, arg3, arg0);
        } else if (arg2 == 1004) {
            class123.method854(class122.field1980, arg3, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
    public static void method1575(int arg0) {
        if (arg0 == 1) {
            field3517 = null;
            field3515 = null;
            field3513 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IILdaa;)V")
    private final void method1576(int arg0, int arg1, class11 arg2) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 1) {
            arg2.method110((byte) 89);
        } else if (arg0 == 2) {
            int var4 = arg2.method110((byte) 125);
            this.field3506 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3506[var5] = arg2.method93((byte) 108);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg2.method110((byte) 32);
                this.field3509 = new short[var6];
                this.field3512 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3512[var7] = (short) arg2.method93((byte) 126);
                    this.field3509[var7] = (short) arg2.method93((byte) 72);
                }
            } else if (arg0 == 41) {
                int var8 = arg2.method110((byte) 88);
                this.field3516 = new short[var8];
                this.field3500 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field3516[var9] = (short) arg2.method93((byte) 104);
                    this.field3500[var9] = (short) arg2.method93((byte) 127);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field3499[arg0 - 60] = arg2.method93((byte) 116);
            }
        }
        field3502++;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLdaa;)V")
    public final void method1577(byte arg0, class11 arg1) {
        while (true) {
            int var3 = arg1.method110((byte) 46);
            if (var3 == 0) {
                field3511++;
                if (arg0 != -23) {
                    this.field3500 = null;
                    return;
                }
                return;
            }
            this.method1576(var3, arg0 + 23, arg1);
        }
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)V")
    public static final void method1578(int arg0) {
        field3508++;
        class210.field2962 = -1;
        if (arg0 > 11) {
            class145.field2248 = -1;
            class634.field9270 = 0;
            class118.field1943 = -1;
        }
    }

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)Lln;")
    public final class317 method1579(int arg0) {
        field3504++;
        class317[] var2 = new class317[5];
        int var3 = 0;
        class21 var4 = this.field3501.field6571;
        synchronized (this.field3501.field6571) {
            int var5 = -66 % ((22 - arg0) / 38);
            int var6 = 0;
            while (true) {
                if (var6 >= 5) {
                    break;
                }
                if (this.field3499[var6] != -1) {
                    var2[var3++] = class428.method2544(-120, 0, this.field3499[var6], this.field3501.field6571);
                }
                var6++;
            }
        }
        for (int var7 = 0; var7 < 5; var7++) {
            if (var2[var7] != null && var2[var7].field4281 < 13) {
                var2[var7].method1971(0, 118);
            }
        }
        class317 var8 = new class317(var2, var3);
        if (this.field3512 != null) {
            for (int var9 = 0; var9 < this.field3512.length; var9++) {
                var8.method1983(this.field3512[var9], -112, this.field3509[var9]);
            }
        }
        if (this.field3516 != null) {
            for (int var10 = 0; var10 < this.field3516.length; var10++) {
                var8.method1981(this.field3500[var10], -27289, this.field3516[var10]);
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(JJ)J")
    public static long method1580(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)Z")
    public final boolean method1581(int arg0) {
        field3514++;
        boolean var2 = true;
        class21 var3 = this.field3501.field6571;
        synchronized (this.field3501.field6571) {
            int var4 = 0;
            int var5 = -111 / ((-arg0 - 19) / 42);
            while (var4 < 5) {
                if (this.field3499[var4] != -1 && !this.field3501.field6571.method229(this.field3499[var4], -1, 0)) {
                    var2 = false;
                }
                var4++;
            }
            return var2;
        }
    }
}
