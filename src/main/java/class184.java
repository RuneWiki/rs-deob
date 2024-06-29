import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class184 {

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "Lgg;")
    private class114 field2412 = new class114(16);

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "Lkha;")
    private class687 field2415;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "Lmq;")
    public static class78 field2410 = new class78(28, 16);

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "Lmq;")
    public static class78 field2419 = new class78(96, 4);

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1172(boolean arg0) {
        class114 var2 = this.field2412;
        synchronized (this.field2412) {
            this.field2412.method781((byte) 47);
        }
        field2416++;
        if (!arg0) {
            this.method1178((byte) 96);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1173(int arg0) {
        class100.field1234 = null;
        class15.field219 = null;
        class543.field7644 = null;
        class229.field2990 = null;
        class560.field7826 = null;
        class756.field10535 = null;
        class100.field1233 = null;
        class637.field8811 = null;
        class376.field5268 = null;
        class487.field6935 = null;
        if (arg0 != 30) {
            return;
        }
        class524.field7408 = null;
        class48.field706 = null;
        class714.field10048 = null;
        class328.field4189 = null;
        class270.field3426 = null;
        field2411++;
        class88.field1115 = null;
        class188.field2469 = null;
        class22.field303 = null;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)V", line = 51)
    public static void method1174(boolean arg0) {
        if (arg0) {
            field2419 = null;
        }
        field2419 = null;
        field2410 = null;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V", line = 62)
    public static final void method1175(int arg0) {
        field2413++;
        class449.field6312 = null;
        if (arg0 != 16) {
            field2410 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)V", line = 79)
    public final void method1176(byte arg0, int arg1) {
        field2418++;
        class114 var3 = this.field2412;
        synchronized (this.field2412) {
            this.field2412.method775(1, arg1);
        }
        int var4 = -117 / ((18 - arg0) / 59);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Lld;", line = 91)
    public final class121 method1177(int arg0, int arg1) {
        field2414++;
        class114 var3 = this.field2412;
        class121 var4;
        synchronized (this.field2412) {
            var4 = (class121) this.field2412.method778((long) arg0, -36);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field2415;
        byte[] var6;
        synchronized (this.field2415) {
            var6 = this.field2415.method3810(arg1, -23360, arg0);
        }
        class121 var7 = new class121();
        if (var6 != null) {
            var7.method794(-80, new class179(var6));
        }
        class114 var8 = this.field2412;
        synchronized (this.field2412) {
            this.field2412.method774((long) arg0, -35, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V", line = 119)
    public final void method1178(byte arg0) {
        if (arg0 > -119) {
            this.field2415 = null;
        }
        field2417++;
        class114 var2 = this.field2412;
        synchronized (this.field2412) {
            this.field2412.method776((byte) -53);
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Ldh;ILkha;)V", line = 139)
    public class184(class286 arg0, int arg1, class687 arg2) {
        this.field2415 = arg2;
        this.field2415.method3812(0, 30);
    }
}
