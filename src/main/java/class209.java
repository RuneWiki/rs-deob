import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class209 implements Runnable {

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Z")
    public boolean field3359 = true;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field3355 = new Object();

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "[I")
    public int[] field3363 = new int[500];

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "[I")
    public int[] field3364 = new int[500];

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public int field3362 = 0;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lsb;")
    public static class124 field3358;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[[I")
    public static int[][] field3352;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)V")
    public static final void method1393(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == -25174) {
            field3354++;
            String var4 = "::tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
            System.out.println(var4);
            class248.method1657(-1, var4);
        }
    }

    @OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3359) {
            Object var1 = this.field3355;
            synchronized (this.field3355) {
                if (this.field3362 < 500) {
                    this.field3364[this.field3362] = class269.field4311;
                    this.field3363[this.field3362] = class165.field2719;
                    this.field3362++;
                }
            }
            class234.method1550(-28773, 50L);
        }
        field3361++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1394(String arg0, int arg1, int arg2) {
        field3353++;
        class127.field2092++;
        class87.field1405.method607(arg2, (byte) 88);
        class87.field1405.method970(arg1, 128);
        class87.field1405.method1006(88, class260.method1739(false, arg0));
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
    public static final int method1395(int arg0, int arg1) {
        field3357++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 == 500) {
            int var3 = arg1 * 6 - 61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } else {
            return 21;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIIII)I")
    public static final int method1396(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3356++;
        if (arg0 < 50) {
            return -2;
        } else {
            int var5 = 65536 - class95.field1475[arg3 * 1024 / arg2] >> 1;
            return ((65536 - var5) * arg1 >> 16) + (arg4 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method1397(byte arg0) {
        field3358 = null;
        field3352 = null;
        int var1 = 79 % ((arg0 - 6) / 44);
    }
}
