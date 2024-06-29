import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class13 {

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Ler;")
    private class157 field212 = new class157(64);

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Ler;")
    public class157 field218 = new class157(30);

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lns;")
    private class438 field211;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Lns;")
    public class438 field213;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lpg;")
    public static class492 field206 = new class492(33, 15);

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field207 = -1;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Lbr;")
    public static class380 field215;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public final void method105(boolean arg0) {
        class157 var2 = this.field212;
        synchronized (this.field212) {
            this.field212.method1015((byte) 101);
            if (arg0) {
                field208 = 41;
            }
        }
        field209++;
        class157 var3 = this.field218;
        synchronized (this.field218) {
            this.field218.method1015((byte) 82);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
    public final void method106(int arg0, int arg1) {
        this.field219 = arg0;
        field205++;
        if (arg1 == -1) {
            class157 var3 = this.field218;
            synchronized (this.field218) {
                this.field218.method1015((byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public final void method107(int arg0) {
        class157 var2 = this.field212;
        synchronized (this.field212) {
            this.field212.method1022((byte) -34);
        }
        field216++;
        if (arg0 < 95) {
            this.method109((byte) 116, 83);
        }
        class157 var3 = this.field218;
        synchronized (this.field218) {
            this.field218.method1022((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Lnh;")
    public final class372 method108(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        }
        field202++;
        class157 var3 = this.field212;
        class372 var4;
        synchronized (this.field212) {
            var4 = (class372) this.field212.method1013((long) arg0, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field211.method2650(class199.method1392(-1, arg0), -109, class15.method131(arg0, (byte) -39));
        class372 var6 = new class372();
        var6.field5704 = arg0;
        var6.field5706 = this;
        if (var5 != null) {
            var6.method2332(new class91(var5), 0);
        }
        class157 var7 = this.field212;
        synchronized (this.field212) {
            this.field212.method1012(arg1 ^ 0xFFFFFF88, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
    public final void method109(byte arg0, int arg1) {
        class157 var3 = this.field212;
        synchronized (this.field212) {
            this.field212.method1016(arg1, (byte) 116);
            if (arg0 != 28) {
                method111(null, 27);
            }
        }
        field214++;
        class157 var4 = this.field218;
        synchronized (this.field218) {
            this.field218.method1016(arg1, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static void method110(int arg0) {
        field206 = null;
        if (arg0 != 30) {
            field206 = null;
        }
        field215 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ltl;I)V")
    public static final void method111(class91 arg0, int arg1) {
        int var2 = 0;
        if (arg1 != 65535) {
            field208 = 40;
        }
        while (var2 < class58.field781) {
            int var3 = arg0.method598(false);
            int var4 = arg0.method631(10494);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class428.field6363[var3] != null) {
                class428.field6363[var3].field6184 = var4;
            }
            var2++;
        }
        field217++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method112(String arg0, int arg1, int arg2) {
        field210++;
        if (arg1 == -1) {
            class377 var3 = class99.method672(arg2, false, 3);
            var3.method2340((byte) 127);
            var3.field5758 = arg0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILof;Z)V")
    public static final void method113(int arg0, class321 arg1, boolean arg2) {
        class499.field7298 = 0;
        if (!arg2) {
            return;
        }
        field204++;
        class406.field6134 = false;
        class145.method959(arg1, (byte) -125);
        class83.method535(33985, arg1);
        if (class406.field6134) {
            System.out.println("---endgpp---");
        }
        if (arg1.field1292 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg1.field1292 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V")
    public static final void method114(int arg0, int arg1) {
        if (arg1 != 15) {
            method112(null, -91, -105);
        }
        class369.field5667 = -1;
        class466.field6795 = null;
        class32.field496 = false;
        class225.field3230 = -1;
        field203++;
        class388.field5899 = 0;
        class30.field464 = 1;
        class123.field1772 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lgo;ILns;Lns;)V")
    public class13(class331 arg0, int arg1, class438 arg2, class438 arg3) {
        this.field211 = arg2;
        this.field213 = arg3;
        int var5 = this.field211.method2649(44) - 1;
        this.field211.method2645(1, var5);
    }
}
