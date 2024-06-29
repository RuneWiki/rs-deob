import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class21 {

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "F")
    public float field317 = 1.0F;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "F")
    public float field320 = 1.0F;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "F")
    public float field325 = 0.25F;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public int field324;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "F")
    public float field322;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "F")
    public float field327;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public int field310;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "F")
    public float field312;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Lva;")
    public class156 field315;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field311 = 0;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lkn;")
    public static class210 field313 = new class210(5000);

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "C")
    public static char field323;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "[I")
    public static int[] field316;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[[Lok;")
    public static class160[][] field309;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Lui;", line = 13)
    public static final class280 method137(int arg0, byte arg1) {
        class280 var2 = (class280) class161.field2632.method768((long) arg0, false);
        field314++;
        if (arg1 != 92) {
            field313 = (class210) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class163.field2654.method250(true, 1, arg0 & 0x7FFF);
        } else {
            var3 = class255.field4047.method250(true, 1, arg0);
        }
        class280 var4 = new class280();
        if (var3 != null) {
            var4.method1988(new class192(var3), true);
        }
        if (arg0 >= 32768) {
            var4.method1977((byte) -105);
        }
        class161.field2632.method770(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLim;)V", line = 59)
    public final void method138(boolean arg0, class192 arg1) {
        field318++;
        this.field317 = (float) (arg1.method1399(-1172389784) * 8) / 255.0F;
        this.field325 = (float) (arg1.method1399(-1172389784) * 8) / 255.0F;
        if (arg0) {
            this.field320 = (float) (arg1.method1399(-1172389784) * 8) / 255.0F;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 76)
    public static final void method139(int arg0) {
        field319++;
        if (arg0 <= 111) {
            method140(-127);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class126.field1887 - 1; var2++) {
                if (class50.field686[var2] < 1000 && class50.field686[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class147.field2199[var2];
                    class147.field2199[var2] = class147.field2199[var2 + 1];
                    class147.field2199[var2 + 1] = var3;
                    String var4 = class284.field4478[var2];
                    class284.field4478[var2] = class284.field4478[var2 + 1];
                    class284.field4478[var2 + 1] = var4;
                    int var5 = class19.field270[var2];
                    class19.field270[var2] = class19.field270[var2 + 1];
                    class19.field270[var2 + 1] = var5;
                    int var6 = class300.field4675[var2];
                    class300.field4675[var2] = class300.field4675[var2 + 1];
                    class300.field4675[var2 + 1] = var6;
                    int var7 = class56.field746[var2];
                    class56.field746[var2] = class56.field746[var2 + 1];
                    class56.field746[var2 + 1] = var7;
                    short var8 = class50.field686[var2];
                    class50.field686[var2] = class50.field686[var2 + 1];
                    class50.field686[var2 + 1] = var8;
                    long var9 = class214.field3464[var2];
                    class214.field3464[var2] = class214.field3464[var2 + 1];
                    class214.field3464[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 132)
    public static final void method140(int arg0) {
        class46.field629 = null;
        class208.field3410 = null;
        class63.field828 = null;
        class55.field732 = null;
        field326++;
        class158.field2431 = null;
        class44.field601 = null;
        class152.field2336 = null;
        class99.field1516 = null;
        class31.field435 = null;
        class59.field783 = null;
        class101.field1534 = null;
        class336.field5217 = null;
        class338.field5243 = null;
        class256.field4061 = null;
        class250.field3984 = null;
        class337.field5235 = null;
        if (arg0 == 8) {
            class295.field4628 = null;
            class4.field32 = null;
            class149.field2266 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 194)
    public class21() {
        this.field324 = class109.field1632;
        this.field322 = 1.1523438F;
        this.field321 = 0;
        this.field327 = 0.69921875F;
        this.field307 = class109.field1628;
        this.field310 = -50;
        this.field308 = -60;
        this.field312 = 1.2F;
        this.field306 = -50;
        if (class300.field4685 != null) {
            this.field315 = class156.method1084(class300.field4685[0], class300.field4685[1], class300.field4685[2], class300.field4685[3], class300.field4685[4], class300.field4685[5]);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lim;)V", line = 213)
    public class21(class192 arg0) {
        int var2 = arg0.method1399(-1172389784);
        if ((var2 & 0x1) == 0) {
            this.field324 = class109.field1632;
        } else {
            this.field324 = arg0.method1354((byte) 126);
        }
        if ((var2 & 0x2) == 0) {
            this.field322 = 1.1523438F;
        } else {
            this.field322 = (float) arg0.method1396(-90) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field327 = 0.69921875F;
        } else {
            this.field327 = (float) arg0.method1396(-72) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field312 = 1.2F;
        } else {
            this.field312 = (float) arg0.method1396(-51) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field306 = -50;
            this.field310 = -50;
            this.field308 = -60;
        } else {
            this.field310 = arg0.method1389(123);
            this.field308 = arg0.method1389(112);
            this.field306 = arg0.method1389(125);
        }
        if ((var2 & 0x20) == 0) {
            this.field307 = class109.field1628;
        } else {
            this.field307 = arg0.method1354((byte) -115);
        }
        if ((var2 & 0x40) == 0) {
            this.field321 = 0;
        } else {
            this.field321 = arg0.method1396(-84);
        }
        if ((var2 & 0x80) != 0) {
            this.field315 = class156.method1084(arg0.method1396(-52), arg0.method1396(-79), arg0.method1396(-59), arg0.method1396(-32), arg0.method1396(-79), arg0.method1396(-20));
        } else if (class300.field4685 != null) {
            this.field315 = class156.method1084(class300.field4685[0], class300.field4685[1], class300.field4685[2], class300.field4685[3], class300.field4685[4], class300.field4685[5]);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V", line = 182)
    public static void method141(int arg0) {
        int var1 = 66 % ((arg0 - 48) / 59);
        field316 = null;
        field309 = (class160[][]) null;
        field313 = null;
    }
}
