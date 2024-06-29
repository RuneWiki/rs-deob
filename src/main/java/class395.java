import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class395 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Loo;")
    private class652 field5435 = new class652(64);

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Loo;")
    public class652 field5445 = new class652(50);

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "Loo;")
    public class652 field5446 = new class652(5);

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lwia;")
    private class791 field5443;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Ldt;")
    public class252 field5432;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lwia;")
    public class791 field5434;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Z")
    public boolean field5438;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public int field5447;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lie;")
    public static class6 field5431;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 11)
    public final void method2437(int arg0) {
        field5440++;
        class652 var2 = this.field5445;
        synchronized (this.field5445) {
            this.field5445.method3735(arg0 - 25478);
        }
        if (arg0 != 25480) {
            this.method2437(-42);
        }
        class652 var3 = this.field5446;
        synchronized (this.field5446) {
            this.field5446.method3735(arg0 - 25478);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V", line = 27)
    public final void method2438(int arg0, int arg1) {
        field5444++;
        class652 var3 = this.field5435;
        synchronized (this.field5435) {
            this.field5435.method3741(arg1, arg0 - 15745);
        }
        class652 var4 = this.field5445;
        synchronized (this.field5445) {
            this.field5445.method3741(arg1, arg0 - 15745);
        }
        class652 var5 = this.field5446;
        synchronized (this.field5446) {
            this.field5446.method3741(arg1, arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)Lqha;", line = 43)
    public final class110 method2439(byte arg0, int arg1) {
        field5433++;
        class652 var3 = this.field5435;
        class110 var4;
        synchronized (this.field5435) {
            var4 = (class110) this.field5435.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field5443;
        byte[] var6;
        synchronized (this.field5443) {
            var6 = this.field5443.method4339(class155.method1064(127, arg1), 0, class589.method3433(arg1, -126));
            if (arg0 != 73) {
                this.method2443(-88);
            }
        }
        class110 var7 = new class110();
        var7.field1690 = arg1;
        var7.field1670 = this;
        if (var6 != null) {
            var7.method842(true, new class494(var6));
        }
        var7.method837((byte) -64);
        class652 var8 = this.field5435;
        synchronized (this.field5435) {
            this.field5435.method3739((long) arg1, (byte) 57, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 76)
    public static final void method2440(byte arg0) {
        field5437++;
        for (class244 var1 = (class244) class87.field961.method2243((byte) 100); var1 != null; var1 = (class244) class87.field961.method2248(-15690)) {
            if (var1.field3626) {
                var1.field3626 = false;
            } else {
                class13.method140(-257, var1.field3628);
            }
        }
        if (arg0 != -38) {
            field5431 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V", line = 107)
    public final void method2441(boolean arg0, int arg1) {
        field5442++;
        this.field5447 = arg1;
        class652 var3 = this.field5445;
        synchronized (this.field5445) {
            this.field5445.method3735(2);
        }
        class652 var4 = this.field5446;
        synchronized (this.field5446) {
            this.field5446.method3735(2);
            if (arg0) {
                method2440((byte) -45);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V", line = 124)
    public final void method2442(byte arg0) {
        field5441++;
        class652 var2 = this.field5435;
        synchronized (this.field5435) {
            this.field5435.method3743(8);
        }
        if (arg0 <= 10) {
            this.method2439((byte) -6, 31);
        }
        class652 var3 = this.field5445;
        synchronized (this.field5445) {
            this.field5445.method3743(8);
        }
        class652 var4 = this.field5446;
        synchronized (this.field5446) {
            this.field5446.method3743(8);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 145)
    public final void method2443(int arg0) {
        class652 var2 = this.field5435;
        synchronized (this.field5435) {
            this.field5435.method3735(2);
        }
        field5439++;
        class652 var3 = this.field5445;
        synchronized (this.field5445) {
            this.field5445.method3735(2);
        }
        class652 var4 = this.field5446;
        synchronized (this.field5446) {
            this.field5446.method3735(2);
        }
        if (arg0 != -1) {
            this.method2437(34);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BZ)V", line = 164)
    public final void method2444(byte arg0, boolean arg1) {
        if (arg0 < 95) {
            return;
        }
        field5436++;
        if (arg1 != this.field5438) {
            this.field5438 = arg1;
            this.method2443(-1);
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 179)
    public static void method2445(int arg0) {
        if (arg0 != 64) {
            method2445(-90);
        }
        field5431 = null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ldt;IZLwia;Lwia;)V", line = 202)
    public class395(class252 arg0, int arg1, boolean arg2, class791 arg3, class791 arg4) {
        this.field5443 = arg3;
        this.field5432 = arg0;
        this.field5434 = arg4;
        this.field5438 = arg2;
        if (this.field5443 != null) {
            int var6 = this.field5443.method4332((byte) 125) - 1;
            this.field5443.method4353(var6, true);
        }
    }
}
