import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class110 {

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "Z")
    public boolean field1952 = false;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Lfr;")
    private class231 field1942 = new class231(64);

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "Lfr;")
    public class231 field1955 = new class231(500);

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "Lfr;")
    public class231 field1956 = new class231(30);

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "Lfr;")
    public class231 field1957 = new class231(50);

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "Lqs;")
    private class496 field1948;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "Lqs;")
    public class496 field1945;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "Z")
    public boolean field1944;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "Lnk;")
    public static class326 field1940 = new class326(37, -1);

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "[I")
    public static int[] field1950;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public int field1958;

    static {
        new class306("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field1950 = new int[25];
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V", line = 6)
    public final void method786(int arg0, int arg1) {
        this.field1942 = new class231(arg1);
        if (arg0 == -646) {
            field1946++;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;IIIZIII)V", line = 17)
    public static final void method787(String arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1938++;
        class459 var8 = new class459();
        var8.field6810 = arg3;
        var8.field6808 = arg5;
        var8.field6811 = arg2;
        if (!arg4) {
            method795((byte) -55);
        }
        var8.field6813 = arg7;
        var8.field6812 = class504.field7348 + arg1;
        var8.field6815 = arg6;
        var8.field6814 = arg0;
        class194.field3020.method567(var8, 255);
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V", line = 38)
    public final void method788(int arg0, int arg1) {
        class231 var3 = this.field1942;
        synchronized (this.field1942) {
            this.field1942.method1603((byte) -105, arg1);
        }
        field1941++;
        class231 var4 = this.field1955;
        synchronized (this.field1955) {
            this.field1955.method1603((byte) -119, arg1);
        }
        class231 var5 = this.field1956;
        synchronized (this.field1956) {
            this.field1956.method1603((byte) -124, arg1);
        }
        if (arg0 < 46) {
            this.field1956 = null;
        }
        class231 var6 = this.field1957;
        synchronized (this.field1957) {
            this.field1957.method1603((byte) -110, arg1);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB)V", line = 62)
    public final void method789(int arg0, byte arg1) {
        this.field1958 = arg0;
        field1954++;
        class231 var3 = this.field1955;
        synchronized (this.field1955) {
            this.field1955.method1604(4);
        }
        class231 var4 = this.field1956;
        synchronized (this.field1956) {
            this.field1956.method1604(4);
        }
        class231 var5 = this.field1957;
        synchronized (this.field1957) {
            this.field1957.method1604(4);
        }
        int var6 = 91 % ((arg1 + 41) / 55);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II[II[Ljava/lang/Object;)V", line = 83)
    public static final void method790(int arg0, int arg1, int[] arg2, int arg3, Object[] arg4) {
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg1; var10++) {
                if ((var9 & var10) + var7 > arg2[var10]) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method790(arg0, var6 - 1, arg2, arg3, arg4);
            method790(var6 + 1, arg1, arg2, arg3, arg4);
        }
        field1949++;
        if (arg3 != 2) {
            field1940 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZ)Lp;", line = 149)
    public final class39 method791(int arg0, boolean arg1) {
        field1951++;
        class231 var3 = this.field1942;
        class39 var4;
        synchronized (this.field1942) {
            var4 = (class39) this.field1942.method1593((byte) -50, (long) arg0);
            if (!arg1) {
                this.method792((byte) -46);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field1948;
        byte[] var6;
        synchronized (this.field1948) {
            var6 = this.field1948.method2926(class332.method2091(-17427, arg0), -87, class404.method2502(arg0, false));
        }
        class39 var7 = new class39();
        var7.field587 = arg0;
        var7.field625 = this;
        if (var6 != null) {
            var7.method282(-11887, new class23(var6));
        }
        var7.method283(false);
        if (var7.field644) {
            var7.field614 = 0;
            var7.field658 = false;
        }
        if (!this.field1944 && var7.field622) {
            var7.field628 = null;
            var7.field632 = null;
        }
        class231 var8 = this.field1942;
        synchronized (this.field1942) {
            this.field1942.method1595(var7, (long) arg0, (byte) -128);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V", line = 199)
    public final void method792(byte arg0) {
        if (arg0 != -95) {
            return;
        }
        class231 var2 = this.field1942;
        synchronized (this.field1942) {
            this.field1942.method1598(117);
        }
        field1943++;
        class231 var3 = this.field1955;
        synchronized (this.field1955) {
            this.field1955.method1598(-81);
        }
        class231 var4 = this.field1956;
        synchronized (this.field1956) {
            this.field1956.method1598(arg0 ^ 0x12);
        }
        class231 var5 = this.field1957;
        synchronized (this.field1957) {
            this.field1957.method1598(117);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI)V", line = 222)
    public final void method793(boolean arg0, int arg1) {
        field1947++;
        if (arg1 == 1 && this.field1952 != arg0) {
            this.field1952 = arg0;
            this.method796(true);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZB)V", line = 244)
    public final void method794(boolean arg0, byte arg1) {
        field1939++;
        if (this.field1944 == arg0) {
            return;
        }
        this.field1944 = arg0;
        if (arg1 < 44) {
            this.method794(true, (byte) -1);
        }
        this.method796(true);
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lwv;IZLqs;Lqs;)V", line = 323)
    public class110(class535 arg0, int arg1, boolean arg2, class496 arg3, class496 arg4) {
        this.field1948 = arg3;
        this.field1945 = arg4;
        this.field1944 = arg2;
        if (this.field1948 != null) {
            int var6 = this.field1948.method2919((byte) 119) - 1;
            this.field1948.method2940(var6, -10511);
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V", line = 269)
    public static void method795(byte arg0) {
        field1950 = null;
        field1940 = null;
        if (arg0 != -42) {
            field1940 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V", line = 281)
    public final void method796(boolean arg0) {
        class231 var2 = this.field1942;
        synchronized (this.field1942) {
            this.field1942.method1604(4);
        }
        field1953++;
        class231 var3 = this.field1955;
        synchronized (this.field1955) {
            this.field1955.method1604(4);
        }
        class231 var4 = this.field1956;
        synchronized (this.field1956) {
            if (!arg0) {
                this.method791(-36, true);
            }
            this.field1956.method1604(4);
        }
        class231 var5 = this.field1957;
        synchronized (this.field1957) {
            this.field1957.method1604(4);
        }
    }
}
