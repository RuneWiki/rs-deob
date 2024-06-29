import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class144 {

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lwi;")
    private class330 field1924 = new class330(128);

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Luu;")
    private class191 field1919;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lni;")
    public static class367 field1921 = new class367(62, -1);

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field1925 = 0;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 3)
    public final void method958(boolean arg0) {
        field1920++;
        if (arg0) {
            this.field1919 = null;
        }
        class330 var2 = this.field1924;
        synchronized (this.field1924) {
            this.field1924.method2127((byte) 124);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lbh;", line = 18)
    public final class27 method959(int arg0, int arg1) {
        field1923++;
        class330 var3 = this.field1924;
        class27 var4;
        synchronized (this.field1924) {
            var4 = (class27) this.field1924.method2133((long) arg1, (byte) 111);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field1919;
        byte[] var7;
        synchronized (this.field1919) {
            int var6 = -26 / ((57 - arg0) / 46);
            var7 = this.field1919.method1281(1, arg1, 127);
        }
        class27 var8 = new class27();
        if (var7 != null) {
            var8.method244(new class164(var7), false);
        }
        class330 var9 = this.field1924;
        synchronized (this.field1924) {
            this.field1924.method2131(var8, (long) arg1, false);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V", line = 47)
    public final void method960(int arg0, int arg1) {
        class330 var3 = this.field1924;
        synchronized (this.field1924) {
            this.field1924.method2140(-113, arg0);
        }
        if (arg1 == 1) {
            field1926++;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 62)
    public static void method961(int arg0) {
        if (arg0 <= -28) {
            field1921 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIBIIII)V", line = 77)
    public static final void method962(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1917++;
        int var8 = class33.method289(arg3 + 261073, class463.field6924, class369.field5628, arg7);
        int var9 = class33.method289(261104, class463.field6924, class369.field5628, arg4);
        int var10 = class33.method289(arg3 ^ 0x3FBEF, class377.field5760, class49.field701, arg6);
        int var11 = class33.method289(261104, class377.field5760, class49.field701, arg2);
        int var12 = class33.method289(arg3 + 261073, class463.field6924, class369.field5628, arg0 + arg7);
        int var13 = class33.method289(261104, class463.field6924, class369.field5628, arg4 - arg0);
        for (int var14 = var8; var14 < var12; var14++) {
            class221.method1489(class466.field6955[var14], var10, var11, (byte) -30, arg1);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class221.method1489(class466.field6955[var15], var10, var11, (byte) -30, arg1);
        }
        int var16 = class33.method289(261104, class377.field5760, class49.field701, arg0 + arg6);
        int var17 = class33.method289(261104, class377.field5760, class49.field701, arg2 - arg0);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class466.field6955[var18];
            class221.method1489(var19, var10, var16, (byte) -30, arg1);
            class221.method1489(var19, var16, var17, (byte) -30, arg5);
            class221.method1489(var19, var17, var11, (byte) -30, arg1);
        }
        if (arg3 != 31) {
            field1925 = 92;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 136)
    public final void method963(int arg0) {
        int var2 = 18 % ((arg0 - 57) / 48);
        class330 var3 = this.field1924;
        synchronized (this.field1924) {
            this.field1924.method2135(0);
        }
        field1918++;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Liv;ILuu;)V", line = 151)
    public class144(class65 arg0, int arg1, class191 arg2) {
        this.field1919 = arg2;
        this.field1919.method1290(false, 1);
    }
}
