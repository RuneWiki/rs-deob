import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class9 implements Runnable {

    @OriginalMember(owner = "client!n", name = "e", descriptor = "[Lq;")
    public volatile class169[] field137 = new class169[2];

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Z")
    public volatile boolean field141 = false;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Z")
    public volatile boolean field144 = false;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lhf;")
    public class154 field142;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lnh;")
    public static class302 field139;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLni;)V", line = 4)
    public static final void method98(byte arg0, class202 arg1) {
        class104.field1552 = arg1;
        if (arg0 < -100) {
            field138++;
        }
    }

    @OriginalMember(owner = "client!n", name = "run", descriptor = "()V", line = 16)
    public final void run() {
        this.field144 = true;
        field145++;
        try {
            while (!this.field141) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class169 var2 = this.field137[var1];
                    if (var2 != null) {
                        var2.method1118(9640);
                    }
                }
                class116.method759(-1, 10L);
                class113.method745((byte) -9, (Object) null, this.field142);
            }
        } catch (Exception var7) {
            class98.method630((String) null, -115, var7);
        } finally {
            this.field144 = false;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V", line = 52)
    public static final void method99(int arg0, int arg1) {
        field133++;
        if (arg0 != 29315) {
            field136 = -89;
        }
        for (class276 var2 = (class276) class270.field4629.method1379(true); var2 != null; var2 = (class276) class270.field4629.method1380((byte) 66)) {
            if ((var2.field5004 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method1997(arg0 - 56696);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 81)
    public static final void method100(int arg0) {
        class155 var1 = class265.field4536;
        synchronized (class265.field4536) {
            class122.field1844 = class133.field1982;
            class106.field1581++;
            class271.field4636 = class1.field1;
            class18.field308 = class245.field4069;
            class139.field2059 = class62.field962;
            class104.field1545 = class100.field1488;
            class289.field4915 = class221.field3650;
            class136.field2016 = class14.field265;
            class62.field962 = arg0;
        }
        field135++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lii;I)Lpd;", line = 106)
    public static final class100 method101(class221 arg0, int arg1) {
        int var2 = -58 / ((arg1 + 65) / 58);
        field140++;
        class100 var3 = new class100(arg0.method1501((byte) -56), arg0.method1501((byte) -56), arg0.method1524((byte) 90), arg0.method1524((byte) 50), arg0.method1517((byte) -121), arg0.method1509(true) == 1);
        int var4 = arg0.method1509(true);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field1489.method1485(-8564, new class230(arg0.method1524((byte) 48), arg0.method1524((byte) 63), arg0.method1524((byte) 120), arg0.method1524((byte) 47)));
        }
        var3.method640((byte) -96);
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZIIIII)V", line = 139)
    public static final void method102(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field143++;
        class240.field3984 = arg4;
        class23.field406 = arg2;
        class280.field4737 = arg5;
        class24.field424 = arg3;
        class303.field5099 = arg6;
        if (arg0 != -13303) {
            return;
        }
        if (arg1 && class303.field5099 >= 100) {
            class239.field3970 = class23.field406 * 128 + 64;
            class303.field5108 = class240.field3984 * 128 + 64;
            class27.field437 = class20.method161(class303.field5108, class239.field3970, arg0 ^ 0xFFFFCC08, class276.field4701) - class280.field4737;
        }
        class270.field4631 = 2;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 165)
    public static void method103(int arg0) {
        if (arg0 == -64) {
            field139 = null;
        }
    }
}
