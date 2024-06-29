import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class264 implements Runnable {

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "Z")
    public boolean field3603 = true;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field3601 = new Object();

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "[I")
    public int[] field3605 = new int[500];

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public int field3607 = 0;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "[I")
    public int[] field3606 = new int[500];

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "Llf;")
    public static class130 field3600;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static final void method1631(int arg0) {
        field3599++;
        class308.field4230.method1733(class446.field6436, class280.field3843, class115.field1674);
        int var1 = 32 % ((arg0 + 15) / 32);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
    public static void method1632(int arg0) {
        field3600 = null;
        if (arg0 >= -75) {
            method1633(53, 32, 3, -47);
        }
    }

    @OriginalMember(owner = "client!sl", name = "run", descriptor = "()V")
    public final void run() {
        field3604++;
        while (this.field3603) {
            Object var1 = this.field3601;
            synchronized (this.field3601) {
                if (this.field3607 < 500) {
                    this.field3606[this.field3607] = class349.field4883;
                    this.field3605[this.field3607] = class162.field2269;
                    this.field3607++;
                }
            }
            class4.method28(50L, -101);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)V")
    public static final void method1633(int arg0, int arg1, int arg2, int arg3) {
        field3598++;
        class44 var4 = class184.field2571[arg2][arg3];
        class285.method1846(arg0, (byte) -28, var4 == null ? class439.field6376 : var4);
        if (arg1 != 500) {
            method1632(61);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
    public static final void method1634(boolean arg0) {
        field3602++;
        if (class237.field3228 != null) {
            class225 var1 = class237.field3228;
            synchronized (class237.field3228) {
                class237.field3228 = null;
            }
        }
        if (arg0) {
            field3600 = null;
        }
    }
}
