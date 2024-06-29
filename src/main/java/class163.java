import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class163 {

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Loo;")
    private class652 field2587 = new class652(64);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Lwia;")
    public class791 field2581;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lwia;")
    private class791 field2585;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lro;")
    public static class2 field2590 = new class2(0, 0);

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field2592 = 4;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Z")
    public static boolean field2588;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 3)
    public final void method1221(int arg0) {
        field2586++;
        class652 var2 = this.field2587;
        synchronized (this.field2587) {
            this.field2587.method3743(8);
            if (arg0 <= 66) {
                this.method1223(-100, (byte) 73);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 19)
    public static void method1222(byte arg0) {
        field2590 = null;
        int var1 = -100 / ((42 - arg0) / 55);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V", line = 35)
    public final void method1223(int arg0, byte arg1) {
        if (arg1 != -77) {
            this.method1221(81);
        }
        class652 var3 = this.field2587;
        synchronized (this.field2587) {
            this.field2587.method3741(arg0, arg1 + 77);
        }
        field2582++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 52)
    public static final int method1224(boolean arg0, String arg1) {
        if (arg0) {
            return -44;
        } else {
            field2591++;
            return class250.method1650(arg1, (byte) 31, true, 10);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 63)
    public final void method1225(int arg0) {
        if (arg0 != -12880) {
            return;
        }
        field2584++;
        class652 var2 = this.field2587;
        synchronized (this.field2587) {
            this.field2587.method3735(2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Ljj;", line = 76)
    public final class128 method1226(int arg0, int arg1) {
        field2583++;
        class652 var3 = this.field2587;
        class128 var4;
        synchronized (this.field2587) {
            var4 = (class128) this.field2587.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field2585;
        byte[] var6;
        synchronized (this.field2585) {
            var6 = this.field2585.method4339(arg1, 0, 3);
        }
        class128 var7 = new class128();
        var7.field1962 = this;
        if (var6 != null) {
            var7.method960(arg0 ^ 0x511D, new class494(var6));
        }
        if (arg0 != 20755) {
            return null;
        }
        class652 var8 = this.field2587;
        synchronized (this.field2587) {
            this.field2587.method3739((long) arg1, (byte) 74, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ldt;ILwia;Lwia;)V", line = 119)
    public class163(class252 arg0, int arg1, class791 arg2, class791 arg3) {
        this.field2581 = arg3;
        this.field2585 = arg2;
        this.field2585.method4353(3, true);
    }
}
