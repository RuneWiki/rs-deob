import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class235 {

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "Lad;")
    private class11 field3057 = new class11(64);

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "Lad;")
    public class11 field3073 = new class11(30);

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "Ldn;")
    private class201 field3072;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "Ldn;")
    public class201 field3071;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "[I")
    public static int[] field3066 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public static int field3067 = 0;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "Ltu;")
    public static class7 field3065 = new class7();

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Ldn;")
    public static class201 field3059;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "[I")
    public static int[] field3062;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V", line = 9)
    public final void method1492(int arg0, int arg1) {
        class11 var3 = this.field3057;
        synchronized (this.field3057) {
            this.field3057.method80(-72, arg0);
        }
        field3060++;
        class11 var4 = this.field3073;
        synchronized (this.field3073) {
            this.field3073.method80(-122, arg0);
            int var5 = -70 / ((53 - arg1) / 61);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V", line = 24)
    public final void method1493(byte arg0) {
        field3061++;
        class11 var2 = this.field3057;
        synchronized (this.field3057) {
            int var3 = 101 / ((45 - arg0) / 57);
            this.field3057.method90((byte) -27);
        }
        class11 var4 = this.field3073;
        synchronized (this.field3073) {
            this.field3073.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V", line = 40)
    public final void method1494(byte arg0) {
        field3070++;
        class11 var2 = this.field3057;
        synchronized (this.field3057) {
            this.field3057.method84(107);
        }
        class11 var3 = this.field3073;
        synchronized (this.field3073) {
            this.field3073.method84(-81);
            if (arg0 != 35) {
                this.field3073 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BI)Lpk;", line = 59)
    public final class76 method1495(byte arg0, int arg1) {
        field3058++;
        class11 var3 = this.field3057;
        class76 var4;
        synchronized (this.field3057) {
            var4 = (class76) this.field3057.method78((long) arg1, (byte) -116);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3072.method1313((byte) -115, class7.method40(arg1, (byte) -76), class127.method814(-19177, arg1));
        class76 var6 = new class76();
        var6.field962 = this;
        var6.field951 = arg1;
        if (var5 != null) {
            var6.method438((byte) 105, new class88(var5));
        }
        class11 var7 = this.field3057;
        synchronized (this.field3057) {
            if (arg0 != 62) {
                method1500(null, -67, -51, -91);
            }
            this.field3057.method88((long) arg1, 29, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(II)V", line = 88)
    public final void method1496(int arg0, int arg1) {
        this.field3074 = arg1;
        field3063++;
        class11 var3 = this.field3073;
        synchronized (this.field3073) {
            this.field3073.method90((byte) -27);
            if (arg0 != 27220) {
                field3067 = 120;
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "([BZIIILgk;II)Lcw;", line = 103)
    public static final class386 method1497(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4, class463 arg5, int arg6, int arg7) {
        field3069++;
        if (arg6 != 1) {
            field3067 = 107;
        }
        if (!arg5.field6817 && (!class158.method1064(arg7, (byte) -85) || !class158.method1064(arg2, (byte) -55))) {
            return arg5.field6833 ? new class386(arg5, 34037, arg4, arg7, arg2, arg1, arg0, arg3) : new class386(arg5, arg4, arg7, arg2, class124.method788(arg7, arg6 - 118), class124.method788(arg2, -124), arg0, arg3);
        } else {
            return new class386(arg5, 3553, arg4, arg7, arg2, arg1, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIIIII)V", line = 124)
    public static final void method1498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3064++;
        int var8 = class141.method970(arg0, class456.field6365, 1150002076, class418.field5559);
        int var9 = class141.method970(arg3, class456.field6365, 1150002076, class418.field5559);
        int var10 = class141.method970(arg4, class281.field3589, 1150002076, class65.field827);
        int var11 = class141.method970(arg2, class281.field3589, 1150002076, class65.field827);
        int var12 = class141.method970(arg0 + arg6, class456.field6365, 1150002076, class418.field5559);
        int var13 = class141.method970(arg3 - arg6, class456.field6365, 1150002076, class418.field5559);
        for (int var14 = var8; var14 < var12; var14++) {
            class183.method1212(arg1, class333.field4265[var14], true, var10, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class183.method1212(arg1, class333.field4265[var15], true, var10, var11);
        }
        if (arg7 != 64) {
            field3067 = 54;
        }
        int var16 = class141.method970(arg4 + arg6, class281.field3589, 1150002076, class65.field827);
        int var17 = class141.method970(arg2 - arg6, class281.field3589, 1150002076, class65.field827);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class333.field4265[var18];
            class183.method1212(arg1, var19, true, var10, var16);
            class183.method1212(arg5, var19, true, var16, var17);
            class183.method1212(arg1, var19, true, var17, var11);
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V", line = 187)
    public static void method1499(byte arg0) {
        field3062 = null;
        field3066 = null;
        if (arg0 == 43) {
            field3059 = null;
            field3065 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Leo;III)V", line = 200)
    public static final void method1500(class423 arg0, int arg1, int arg2, int arg3) {
        class502.field7378 = arg0;
        class447.field6211 = arg1;
        field3068++;
        if (arg3 >= 47) {
            class371.field4809 = arg2;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lgt;ILdn;Ldn;)V", line = 229)
    public class235(class65 arg0, int arg1, class201 arg2, class201 arg3) {
        this.field3072 = arg2;
        this.field3071 = arg3;
        int var5 = this.field3072.method1309((byte) 31) - 1;
        this.field3072.method1302(-64, var5);
    }
}
