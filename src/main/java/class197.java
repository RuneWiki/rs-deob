import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class197 implements class183 {

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    private int field3914 = 50;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    private int field3912 = 128;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Lu;")
    private class184 field3909;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lu;")
    private class184 field3911;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lfc;")
    private class54 field3899;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Lrf;")
    public static class163 field3916 = class53.method392(-84, "Passwort: ");

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Lfc;")
    public static class54 field3905 = new class54(50);

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "[Lrf;")
    public static class163[] field3918 = new class163[500];

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lrf;")
    public static class163 field3917 = class53.method392(-53, "Sprites geladen)3");

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "Z")
    public static boolean field3919 = true;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field3920 = 127;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "Lu;")
    public static class184 field3921;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(BI)Z")
    public final boolean method1221(byte arg0, int arg1) {
        field3904++;
        return arg0 <= 3 ? false : this.method1307((byte) -103, arg1).method643(this.field3909, true, this);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)V")
    public final void method1304(int arg0, int arg1) {
        if (arg1 <= 23) {
            return;
        }
        for (class92 var3 = (class92) this.field3899.method397((byte) -121); var3 != null; var3 = (class92) this.field3899.method400(3)) {
            if (var3.field1984) {
                var3.method647(arg0, 60);
                var3.field1984 = false;
            }
        }
        field3915++;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)Z")
    public final boolean method1224(int arg0, int arg1) {
        if (arg1 <= 25) {
            this.method1220((byte) 64, 103, 0.35812783F);
        }
        field3901++;
        return this.field3912 == 64 || this.method1307((byte) -103, arg0).field1991 == 64;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BIF)[I")
    public final int[] method1220(byte arg0, int arg1, float arg2) {
        field3903++;
        if (arg0 > -73) {
            this.method1309((byte) -56);
        }
        class92 var4 = this.method1307((byte) -103, arg1);
        var4.field1984 = true;
        return var4.method645(-3, this.field3909, this.field3912, this, arg2);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)I")
    public static final int method1305(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        field3910++;
        int var4 = 105 / ((34 - arg1) / 35);
        return (arg3 >> 1) + (arg0 >> 2 << 10) + (arg2 >> 5 << 7);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(BI)[I")
    public final int[] method1223(byte arg0, int arg1) {
        if (arg0 < 20) {
            this.field3914 = -94;
        }
        field3897++;
        class52 var3 = new class52(this.field3911.method1235(arg1, (byte) -64, 0));
        class92 var4 = new class92(var3);
        return var4.method646(this.field3909, this.field3912, this, (byte) 94);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lrf;Z)[Lrf;")
    public static final class163[] method1306(class163[] arg0, boolean arg1) {
        class163[] var2 = new class163[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class180.method1216(new class163[] { class34.method217(var3, -102), class175.field3520 }, false);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class180.method1216(new class163[] { var2[var3], arg0[var3] }, !arg1);
            }
        }
        if (!arg1) {
            method1310(-107);
        }
        field3898++;
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(BI)Ljf;")
    private final class92 method1307(byte arg0, int arg1) {
        if (arg0 != -103) {
            return null;
        }
        class92 var3 = (class92) this.field3899.method401((long) arg1, (byte) 122);
        field3913++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3911.method1235(arg1, (byte) -64, 0);
        if (var4 == null) {
            return class190.method1284(-81);
        } else {
            class52 var5 = new class52(var4);
            class92 var6 = new class92(var5);
            this.field3899.method398(var6, (long) arg1, (byte) 104);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)Z")
    public final boolean method1219(byte arg0, int arg1) {
        if (arg0 == 97) {
            field3907++;
            return this.method1307((byte) -103, arg1).field1987;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
    public final int method1218(int arg0, int arg1) {
        if (arg1 >= -113) {
            method1310(-114);
        }
        field3908++;
        return this.method1307((byte) -103, arg0).field1995;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public static void method1308(boolean arg0) {
        field3916 = null;
        if (!arg0) {
            method1310(-63);
        }
        field3917 = null;
        field3921 = null;
        field3905 = null;
        field3918 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method1309(byte arg0) {
        this.field3899 = new class54(this.field3914);
        int var2 = -29 / ((35 - arg0) / 47);
        field3902++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Z")
    public final boolean method1222(int arg0, byte arg1) {
        if (arg1 > -15) {
            field3919 = false;
        }
        field3900++;
        return this.method1307((byte) -103, arg0).field1998;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lu;Lu;II)V")
    public class197(class184 arg0, class184 arg1, int arg2, int arg3) {
        this.field3914 = arg2;
        this.field3912 = arg3;
        this.field3909 = arg1;
        this.field3911 = arg0;
        this.field3899 = new class54(this.field3914);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Z")
    public static final boolean method1310(int arg0) {
        int var1 = 49 % ((arg0 + 41) / 52);
        field3906++;
        return class180.field3611 == 0 ? class49.field949.method733(0) : true;
    }
}
