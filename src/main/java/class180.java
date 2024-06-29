import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class180 {

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "Lge;")
    private class511 field2662 = new class511(64);

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Lci;")
    private class320 field2659;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "Lqv;")
    public static class316 field2658 = new class316(55, 9);

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "Z")
    public static volatile boolean field2665 = true;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 3)
    public static void method1249(int arg0) {
        field2658 = null;
        if (arg0 < 17) {
            method1249(84);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIBI)V", line = 14)
    public static final void method1250(int arg0, int arg1, byte arg2, int arg3) {
        field2663++;
        int var4 = class220.field3371.field2569 * arg1 >> 8;
        if (arg2 != -2) {
            field2658 = null;
        }
        if (arg0 == -1 && !class75.field1240) {
            class219.method1486(arg2 ^ 0xFFFFFFFE);
        } else if (arg0 != -1 && (class441.field6285 != arg0 || !class497.method2913(0)) && var4 != 0 && !class75.field1240) {
            class339.method2153(arg3, class425.field6000, true, false, arg0, var4, 0);
        }
        class441.field6285 = arg0;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V", line = 40)
    public final void method1251(int arg0) {
        if (arg0 != 55) {
            method1249(-20);
        }
        class511 var2 = this.field2662;
        synchronized (this.field2662) {
            this.field2662.method2980(-182819096);
        }
        field2657++;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V", line = 55)
    public final void method1252(byte arg0) {
        class511 var2 = this.field2662;
        synchronized (this.field2662) {
            this.field2662.method2990((byte) -56);
            if (arg0 != -59) {
                field2658 = null;
            }
        }
        field2661++;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Lsc;", line = 75)
    public final class236 method1253(int arg0, int arg1) {
        if (arg1 != -1065652600) {
            return null;
        }
        field2664++;
        class511 var3 = this.field2662;
        class236 var4;
        synchronized (this.field2662) {
            var4 = (class236) this.field2662.method2982(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field2659;
        byte[] var6;
        synchronized (this.field2659) {
            var6 = this.field2659.method2037(arg0, (byte) -62, 32);
        }
        class236 var7 = new class236();
        if (var6 != null) {
            var7.method1565(new class519(var6), 67);
        }
        class511 var8 = this.field2662;
        synchronized (this.field2662) {
            this.field2662.method2981(var7, 126, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)V", line = 105)
    public final void method1254(byte arg0, int arg1) {
        field2660++;
        class511 var3 = this.field2662;
        synchronized (this.field2662) {
            if (arg0 <= 60) {
                this.method1251(-22);
            }
            this.field2662.method2989(false, arg1);
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lsn;ILci;)V", line = 123)
    public class180(class453 arg0, int arg1, class320 arg2) {
        this.field2659 = arg2;
        this.field2659.method2030(-10914, 32);
    }
}
