import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class530 {

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Ljt;")
    private class106 field7556 = new class106(64);

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public int field7560 = 0;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Lvd;")
    private class39 field7557;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public int field7558;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Lqe;")
    public static class469 field7549 = new class469(119, -1);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 3)
    public final void method3095(byte arg0) {
        field7552++;
        if (arg0 > 19) {
            class106 var2 = this.field7556;
            synchronized (this.field7556) {
                this.field7556.method809(true);
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)Lrca;", line = 17)
    public final class456 method3096(int arg0, byte arg1) {
        field7559++;
        class106 var3 = this.field7556;
        class456 var4;
        synchronized (this.field7556) {
            if (arg1 != 28) {
                method3098((byte) -76);
            }
            var4 = (class456) this.field7556.method803(125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field7557;
        byte[] var6;
        synchronized (this.field7557) {
            var6 = this.field7557.method211(true, 4, arg0);
        }
        class456 var7 = new class456();
        var7.field6735 = this;
        var7.field6734 = arg0;
        if (var6 != null) {
            var7.method2795(new class645(var6), arg1 ^ 0x743D);
        }
        var7.method2791(false);
        class106 var8 = this.field7556;
        synchronized (this.field7556) {
            this.field7556.method801(arg1 ^ 0x1D, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 52)
    public static final void method3097(int arg0) {
        field7553++;
        if (class31.field316 != null) {
            for (int var1 = 0; var1 < class44.field480; var1++) {
                class31.field316[var1] = null;
            }
            class31.field316 = null;
        }
        if (arg0 != 0) {
            field7549 = null;
        }
        if (class240.field3494 != null) {
            for (int var2 = 0; var2 < class411.field6179; var2++) {
                class240.field3494[var2] = null;
            }
            class240.field3494 = null;
        }
        if (class315.field4461 != null) {
            for (int var3 = 0; var3 < class233.field3398; var3++) {
                class315.field4461[var3] = null;
            }
            class315.field4461 = null;
        }
        class394.field5922 = -1;
        class270.field3864 = -1;
        class255.field3667 = null;
        class70.field986 = null;
        class85.field1210 = null;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 112)
    public static void method3098(byte arg0) {
        field7549 = null;
        if (arg0 != 1) {
            field7549 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Z", line = 128)
    public static final boolean method3099(int arg0, int arg1, int arg2) {
        field7550++;
        int var3 = 51 % ((arg1 + 60) / 50);
        if (class510.method3023(arg2, arg0, 31169)) {
            return class221.method1483(true, arg0, arg2) | (arg0 & 0xB000) != 0 | class59.method411(arg0, 123, arg2) ? true : (arg2 & 0x37) == 0 & (class41.method293(arg2, arg0, -19909) | class745.method4167((byte) -37, arg2, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V", line = 148)
    public final void method3100(byte arg0) {
        class106 var2 = this.field7556;
        synchronized (this.field7556) {
            this.field7556.method800(79);
            if (arg0 <= 0) {
                method3098((byte) 30);
            }
        }
        field7551++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V", line = 164)
    public final void method3101(int arg0, int arg1) {
        class106 var3 = this.field7556;
        synchronized (this.field7556) {
            if (arg1 != 45056) {
                this.field7558 = 55;
            }
            this.field7556.method807(arg0, -1);
        }
        field7555++;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(III)Z", line = 177)
    public static final boolean method3102(int arg0, int arg1, int arg2) {
        int var3 = -86 % ((arg2 - 55) / 46);
        field7554++;
        return (class263.method1696(arg0, -25072, arg1) | class629.method3630(-116, arg0, arg1) | class724.method4085((byte) 60, arg0, arg1)) & class741.method4149(arg1, arg0, 1);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lqg;ILvd;)V", line = 193)
    public class530(class464 arg0, int arg1, class39 arg2) {
        this.field7557 = arg2;
        this.field7558 = this.field7557.method229(4, 0);
    }
}
