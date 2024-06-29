import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class444 extends class258 {

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    private int field5816 = -1;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "Lrda;")
    public static class467 field5811 = new class467(64);

    @OriginalMember(owner = "client!br", name = "t", descriptor = "J")
    public static long field5817 = 0L;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    private int field5810;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    private int field5812;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    private int field5813;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "Lpu;")
    public static class772 field5815;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lim;B)V", line = 5)
    public final void method547(class652 arg0, byte arg1) {
        field5818++;
        arg0.method3520(this.field5816, 52, this.field5813, this.field5812, this.field5810);
        if (arg1 <= 123) {
            this.field5810 = 93;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 17)
    public static void method2550(int arg0) {
        field5815 = null;
        field5811 = null;
        if (arg0 > -110) {
            method2551(null, null);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BLmc;)V", line = 28)
    public final void method546(byte arg0, class234 arg1) {
        this.field5816 = arg1.method1553((byte) -2);
        field5814++;
        int var3 = -70 / ((7 - arg0) / 41);
        this.field5813 = arg1.method1497((byte) 36);
        this.field5810 = arg1.method1509(true);
        this.field5812 = arg1.method1509(true);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Llq;[Lgu;)V", line = 53)
    public static final void method2551(class210 arg0, class757[] arg1) {
        if (class516.field6577) {
            int var2 = arg0.method719(arg1, 74);
            class398.field5275.method908(var2, arg1);
        }
        if (class735.field9973 == class116.field1542) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class620) {
                var5 = ((class620) arg0).field7852;
                var6 = ((class620) arg0).field7844;
            } else {
                var5 = arg0.field2896 >> class88.field1221;
                var6 = arg0.field2900 >> class88.field1221;
            }
            class398.field5275.method971(class383.field4790[0].method2072((byte) 107, arg0.field2896, arg0.field2900), class596.method3215(var5, var6), class415.method2398(var5, var6), class627.method3352(var5, var6));
        }
        class266 var7 = arg0.method187(-29562, class398.field5275);
        if (var7 == null) {
            return;
        }
        if (arg0.field2894) {
            class706[] var8 = var7.field3533;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class706 var10 = var8[var9];
                if (var10.field9324) {
                    class548.method2967(var10.field9321 - var10.field9325, var10.field9325 + var10.field9320, var10.field9323 - var10.field9325, (byte) -122, var10.field9325 + var10.field9322);
                }
            }
        }
        if (var7.field3527) {
            var7.field3528 = arg0;
            if (class70.field955) {
                class780 var11 = class108.field1468;
                synchronized (class108.field1468) {
                    class108.field1468.method4274(var7, -16115);
                    return;
                }
            }
            class108.field1468.method4274(var7, -16115);
            return;
        }
        class57.method348(var7, 18);
    }
}
