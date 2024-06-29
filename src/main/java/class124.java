import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class124 {

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "Lh;")
    private class571 field2024 = new class571(64);

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "Lh;")
    public class571 field2035 = new class571(50);

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "Lkc;")
    public class113 field2038 = new class113(250);

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "Lap;")
    private class406 field2039 = new class406();

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "Lan;")
    public class21 field2033;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "Z")
    private boolean field2032;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Lan;")
    private class21 field2023;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "Lqt;")
    private class546 field2043;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field2017;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field2041;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field2044;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "Lcba;")
    public static class471 field2027 = new class471(49, 12);

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "Lej;")
    public static class104 field2028 = new class104("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V")
    public final void method863(boolean arg0, int arg1) {
        field2021++;
        if (arg0 == this.field2032) {
            return;
        }
        if (arg1 != -1) {
            this.method872(-26, 81);
        }
        this.field2032 = arg0;
        this.method865(69);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public final void method864(byte arg0) {
        field2036++;
        class571 var2 = this.field2024;
        synchronized (this.field2024) {
            this.field2024.method3248(0);
        }
        class571 var3 = this.field2035;
        synchronized (this.field2035) {
            this.field2035.method3248(0);
        }
        class113 var4 = this.field2038;
        synchronized (this.field2038) {
            int var5 = 111 / ((arg0 - 38) / 45);
            this.field2038.method783(1);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public final void method865(int arg0) {
        field2018++;
        class571 var2 = this.field2024;
        synchronized (this.field2024) {
            this.field2024.method3246(false);
        }
        class571 var3 = this.field2035;
        synchronized (this.field2035) {
            int var4 = -67 / ((arg0 + 9) / 34);
            this.field2035.method3246(false);
        }
        class113 var5 = this.field2038;
        synchronized (this.field2038) {
            this.field2038.method788(-16015);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)Lcm;")
    public final class621 method866(int arg0, byte arg1) {
        field2016++;
        class571 var3 = this.field2024;
        class621 var4;
        synchronized (this.field2024) {
            var4 = (class621) this.field2024.method3252((long) arg0, (byte) 80);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field2023;
        byte[] var6;
        synchronized (this.field2023) {
            var6 = this.field2023.method240(class223.method1427(arg0, 0), class193.method1197(255, arg0), (byte) -124);
        }
        class621 var7 = new class621();
        var7.field8908 = arg0;
        var7.field8927 = this;
        var7.field8898 = new String[] { null, null, class318.field4311.method739(this.field2026, 60), null, null };
        var7.field8938 = new String[] { null, null, null, null, class486.field6826.method739(this.field2026, arg1 - 11) };
        if (arg1 != 79) {
            this.method871(null, null, 87, -89, 39, 109, null, -98, -67, true, null, false);
        }
        if (var6 != null) {
            var7.method3625(0, new class11(var6));
        }
        var7.method3623(-24272);
        if (var7.field8910 != -1) {
            var7.method3622(this.method866(var7.field8926, (byte) 79), false, this.method866(var7.field8910, (byte) 79));
        }
        if (var7.field8909 != -1) {
            var7.method3613((byte) 115, this.method866(var7.field8897, (byte) 79), this.method866(var7.field8909, (byte) 79));
        }
        if (!this.field2032 && var7.field8956) {
            var7.field8924 = class245.field3414.method739(this.field2026, 93);
            var7.field8898 = this.field2041;
            var7.field8899 = 0;
            var7.field8892 = null;
            var7.field8938 = this.field2044;
            var7.field8903 = false;
            if (var7.field8901 != null) {
                boolean var8 = false;
                for (class176 var9 = var7.field8901.method1248(arg1 ^ 0xFFFFFFB0); var9 != null; var9 = var7.field8901.method1245((byte) 95)) {
                    class22 var10 = this.field2043.method3115(128, (int) var9.field2524);
                    if (var10.field325) {
                        var9.method1117(arg1 ^ 0x4F);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field8901 = null;
                }
            }
        }
        class571 var11 = this.field2024;
        synchronized (this.field2024) {
            this.field2024.method3243(var7, (long) arg0, -54);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method867(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field2020++;
        if (class590.field8430 == null) {
            return;
        }
        class33 var14 = null;
        if (arg9 < 0) {
            int var15 = -arg9 - 1;
            if (class97.field1472 == var15) {
                var14 = class645.field9372;
            } else {
                var14 = class349.field4696[var15];
            }
        } else {
            int var16 = arg9 - 1;
            class576 var17 = (class576) class278.field3837.method1242(0, (long) var16);
            if (var17 != null) {
                var14 = var17.field7929;
            }
        }
        if (var14 == null) {
            return;
        }
        class364 var18 = class18.field227.method1201((byte) -127, arg3);
        int var19;
        int var20;
        if (arg11 == 1 || arg11 == 3) {
            var20 = var18.field4910;
            var19 = var18.field4926;
        } else {
            var19 = var18.field4910;
            var20 = var18.field4926;
        }
        int var21 = (var19 >> 1) + arg8;
        int var22 = (arg7 + var19 >> 1) + arg8;
        int var23 = (var20 >> 1) + arg12;
        int var24 = (var20 + 1 >> 1) + arg12;
        class174 var25 = class590.field8430[arg10];
        int var26 = var25.method1104(var21, var23) - (-var25.method1104(var22, var23) - (var25.method1104(var21, var24) + var25.method1104(var22, var24))) >> 2;
        class336 var27 = new class336();
        var27.field4467 = arg3;
        var27.field4491 = arg12;
        var27.field4478 = class405.field5763 + arg1;
        if (arg0 > arg13) {
            int var28 = arg0;
            arg0 = arg13;
            arg13 = var28;
        }
        var27.field4468 = arg5;
        var27.field4469 = arg11;
        var27.field4479 = arg8;
        var27.field4488 = class405.field5763 + arg4;
        var27.field4473 = var14.field6035;
        var27.field4476 = arg8 + arg0;
        if (arg6 < arg2) {
            int var29 = arg2;
            arg2 = arg6;
            arg6 = var29;
        }
        var27.field4470 = arg8 + arg13;
        var27.field4474 = arg12 + arg6;
        var27.field4484 = var26;
        var27.field4490 = (var27.field4479 << 7) + (var19 << 6);
        var27.field4483 = arg2 + arg12;
        var27.field4480 = (var27.field4491 << 7) + (var20 << 6);
        class399.field5691.method463(var27, arg7 ^ 0xFFFFFF8C);
        var14.field615 = var27;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILco;ILqa;II)Lha;")
    public final class52 method868(int arg0, int arg1, int arg2, class101 arg3, int arg4, class207 arg5, int arg6, int arg7) {
        this.field2039.field5767 = arg5.field2923;
        this.field2039.field5768 = arg7;
        if (arg1 < 93) {
            this.method872(-60, 124);
        }
        this.field2039.field5772 = arg6;
        this.field2039.field5770 = arg4;
        this.field2039.field5765 = arg3 != null;
        this.field2039.field5766 = arg2;
        this.field2039.field5771 = arg0;
        field2022++;
        return (class52) this.field2038.method792(this.field2039, 1);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)I")
    public static final int method869(int arg0, int arg1) {
        if (arg1 != 932841964) {
            return -15;
        }
        field2040++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
    public static void method870(byte arg0) {
        if (arg0 != -93) {
            field2019 = 78;
        }
        field2027 = null;
        field2028 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lqa;Lco;IIIILqa;IIZLra;Z)Lha;")
    public final class52 method871(class207 arg0, class101 arg1, int arg2, int arg3, int arg4, int arg5, class207 arg6, int arg7, int arg8, boolean arg9, class91 arg10, boolean arg11) {
        field2030++;
        class52 var13 = this.method868(arg2, 120, arg4, arg1, arg5, arg6, arg3, arg7);
        if (arg8 != -19792) {
            this.method864((byte) 101);
        }
        if (var13 != null) {
            return var13;
        }
        class621 var14 = this.method866(arg7, (byte) 79);
        if (arg5 > 1 && var14.field8923 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg5 >= var14.field8906[var16] && var14.field8906[var16] != 0) {
                    var15 = var14.field8923[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method866(var15, (byte) 79);
            }
        }
        int[] var17 = var14.method3627(arg6, arg11, arg1, arg10, arg0, (byte) -90, arg2, arg5, arg3, arg4);
        if (var17 == null) {
            return null;
        }
        class52 var18;
        if (arg9) {
            var18 = arg0.method1363(var17, 0, 36, 36, 32);
        } else {
            var18 = arg6.method1363(var17, 0, 36, 36, 32);
        }
        if (!arg9) {
            class406 var19 = new class406();
            var19.field5766 = arg4;
            var19.field5767 = arg6.field2923;
            var19.field5772 = arg3;
            var19.field5768 = arg7;
            var19.field5770 = arg5;
            var19.field5765 = arg1 != null;
            var19.field5771 = arg2;
            this.field2038.method791(var19, 25078, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V")
    public final void method872(int arg0, int arg1) {
        field2031++;
        if (arg0 != 0) {
            field2027 = null;
        }
        this.field2042 = arg1;
        class571 var3 = this.field2035;
        synchronized (this.field2035) {
            this.field2035.method3246(false);
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(II)V")
    public final void method873(int arg0, int arg1) {
        field2037++;
        class571 var3 = this.field2024;
        synchronized (this.field2024) {
            this.field2024.method3253(arg0, -126);
        }
        class571 var4 = this.field2035;
        synchronized (this.field2035) {
            this.field2035.method3253(arg0, -122);
        }
        class113 var5 = this.field2038;
        synchronized (this.field2038) {
            this.field2038.method789(-15598, arg0);
        }
        if (arg1 != -448414484) {
            method869(119, -80);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    public final void method874(int arg0) {
        if (arg0 != -94427865) {
            return;
        }
        class571 var2 = this.field2035;
        synchronized (this.field2035) {
            this.field2035.method3246(false);
        }
        field2029++;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V")
    public final void method875(byte arg0) {
        if (arg0 >= -104) {
            this.method874(-83);
        }
        field2025++;
        class113 var2 = this.field2038;
        synchronized (this.field2038) {
            this.field2038.method788(-16015);
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lhu;IZLqt;Lan;Lan;)V")
    public class124(class111 arg0, int arg1, boolean arg2, class546 arg3, class21 arg4, class21 arg5) {
        this.field2026 = arg1;
        this.field2033 = arg5;
        this.field2032 = arg2;
        this.field2023 = arg4;
        this.field2043 = arg3;
        if (this.field2023 == null) {
            this.field2017 = 0;
        } else {
            int var7 = this.field2023.method239(-57) - 1;
            this.field2017 = this.field2023.method231(var7, -124) + var7 * 256;
        }
        this.field2041 = new String[] { null, null, class318.field4311.method739(this.field2026, -120), null, null };
        this.field2044 = new String[] { null, null, null, null, class486.field6826.method739(this.field2026, -117) };
    }
}
