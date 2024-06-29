import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Z")
    public boolean field511 = true;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field508 = new Object();

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public int field513 = 0;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "[I")
    public int[] field515 = new int[500];

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "[I")
    public int[] field514 = new int[500];

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Lbo;")
    public static class453 field507 = new class453(16);

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field512 = 0;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "[I")
    public static int[] field510 = new int[100];

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "F")
    public static float field509;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIILjava/lang/Class;)Lro;", line = 4)
    public static final class407 method243(int arg0, int arg1, int arg2, Class arg3) {
        class77 var4 = class106.field1405[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class356 var5 = var4.field1064; var5 != null; var5 = var5.field5275) {
            class407 var6 = var5.field5274;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field5917 == arg1 && var6.field5918 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 31)
    public static void method244(byte arg0) {
        if (arg0 <= -17) {
            field507 = null;
            field510 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(JI)V", line = 44)
    public static final void method245(long arg0, int arg1) {
        field505++;
        if (arg0 <= 0L) {
            return;
        }
        int var3 = -9 / ((arg1 + 14) / 47);
        if ((arg0 % 10L) == 0L) {
            class232.method1502((byte) -57, arg0 - 1L);
            class232.method1502((byte) -46, 1L);
        } else {
            class232.method1502((byte) -81, arg0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "run", descriptor = "()V", line = 73)
    public final void run() {
        field506++;
        while (this.field511) {
            Object var1 = this.field508;
            synchronized (this.field508) {
                if (this.field513 < 500) {
                    this.field515[this.field513] = class277.field4060;
                    this.field514[this.field513] = class217.field3032;
                    this.field513++;
                }
            }
            method245(50L, 68);
        }
    }
}
