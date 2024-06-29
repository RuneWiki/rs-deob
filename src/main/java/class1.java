import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class1 implements Runnable {

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Z")
    public boolean field4 = true;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field8 = new Object();

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "[I")
    public int[] field12 = new int[500];

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public int field11 = 0;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "[I")
    public int[] field13 = new int[500];

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Lsk;")
    public static class199 field2 = new class199(4);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "[I")
    public static int[] field10;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "[Lwj;")
    public static class135[] field5;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1(int arg0) {
        if (arg0 != -1803) {
            field5 = (class135[]) null;
        }
        field6++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class46.method302(true, var1, var3, var2, (byte) 40, class256.field4320)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)Lsg;", line = 41)
    public static final class191 method2(int arg0, byte arg1) {
        field7++;
        if (arg1 != -37) {
            field2 = (class199) null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class275.field4713[var2] == null || class275.field4713[var2][var3] == null) {
            boolean var4 = class20.method95(true, var2);
            if (!var4) {
                return null;
            }
        }
        return class275.field4713[var2][var3];
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lpi;BLpi;)V", line = 68)
    public static final void method3(class203 arg0, byte arg1, class203 arg2) {
        field3++;
        if (arg0.field3431 != null) {
            arg0.method1421(-124);
        }
        arg0.field3425 = arg2.field3425;
        if (arg1 <= 86) {
            method2(32, (byte) 115);
        }
        arg0.field3431 = arg2;
        arg0.field3431.field3425 = arg0;
        arg0.field3425.field3431 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "run", descriptor = "()V", line = 95)
    public final void run() {
        while (this.field4) {
            Object var1 = this.field8;
            synchronized (this.field8) {
                if (this.field11 < 500) {
                    this.field13[this.field11] = class275.field4725;
                    this.field12[this.field11] = class221.field3795;
                    this.field11++;
                }
            }
            class99.method792(-1, 50L);
        }
        field1++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V", line = 119)
    public static void method4(boolean arg0) {
        field5 = null;
        field10 = null;
        field2 = null;
        if (arg0) {
            field9 = -6;
        }
    }
}
