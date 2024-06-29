import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class698 {

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "Lgga;")
    public static class265 field9875 = new class265();

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
    public static int field9879 = 0;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
    public static final void method3913(byte arg0) {
        field9876++;
        class683.field9762.method3559(7087);
        class295.method1745((byte) -45);
        class242.field3323 = 0;
        int var1 = -62 / ((arg0 + 30) / 43);
        class681.field9744 = null;
        class234.field3127 = 0;
        class470.field6572 = null;
        class29.field617.field5195 = 0;
        class268.field3674 = null;
        class142.method932((byte) 56);
        class700.field9897 = 0;
        class246.field3378 = 0;
        class417.field5915 = 0;
        class496.field6913 = null;
        class642.field9171 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
    public static void method3914(int arg0) {
        field9875 = null;
        if (arg0 != -27351) {
            field9875 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IB)I")
    public static final int method3915(int arg0, byte arg1) {
        field9878++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 != 93) {
            field9875 = null;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Llt;B)V")
    public static final void method3916(class626 arg0, byte arg1) {
        field9877++;
        arg0.field8984 = null;
        if (arg1 < 35) {
            return;
        }
        int var2 = arg0.field8985.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field8985[var3].field8717 = false;
        }
        class363[] var4 = class34.field680;
        synchronized (class34.field680) {
            if (class34.field680.length > var2 && class6.field59[var2] < 200) {
                class34.field680[var2].method2071((byte) 117, arg0);
                int var10002 = class6.field59[var2]++;
            }
        }
    }
}
