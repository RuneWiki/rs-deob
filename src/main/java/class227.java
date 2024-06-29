import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class227 implements Runnable {

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Z")
    public boolean field3195 = true;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field3193 = new Object();

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "[I")
    public int[] field3203 = new int[500];

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "[I")
    public int[] field3202 = new int[500];

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public int field3205 = 0;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field3199 = 0;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Lwe;")
    public static class24 field3192 = new class24(64);

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    public static int field3206 = 0;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "[[I")
    public static int[][] field3201;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
    public static final void method1408(byte arg0) {
        int var1 = 99 % ((arg0 - 15) / 34);
        field3196++;
        if (class116.method810((byte) -101) || class431.field6368 == class193.field2688) {
            class231.method1429(class35.field574, -1262);
            if (class193.field2688 != class155.field2037) {
                class152.method990((byte) -101);
            }
        } else {
            class78.method495(false, class249.field3539, false, class93.field1276, class100.field1350.field306[0], class193.field2688, 24, class100.field1350.field303[0]);
        }
    }

    @OriginalMember(owner = "client!fo", name = "run", descriptor = "()V")
    public final void run() {
        field3197++;
        while (this.field3195) {
            Object var1 = this.field3193;
            synchronized (this.field3193) {
                if (this.field3205 < 500) {
                    this.field3203[this.field3205] = class34.field555;
                    this.field3202[this.field3205] = class316.field4522;
                    this.field3205++;
                }
            }
            class404.method2628(-38, 50L);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI)I")
    public static final int method1409(int arg0, byte arg1, int arg2) {
        if (arg1 != -33) {
            method1409(36, (byte) 14, 127);
        }
        field3198++;
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;Lqj;BZ)Lsc;")
    public static final class396 method1410(String arg0, class238 arg1, byte arg2, boolean arg3) {
        field3194++;
        int var4 = arg1.method1467(113, arg0);
        if (var4 == -1) {
            return new class396(0);
        }
        int[] var5 = arg1.method1457((byte) -114, var4);
        if (arg2 < 60) {
            method1409(-37, (byte) -91, 39);
        }
        class396 var6 = new class396(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field5943) {
                class265 var9 = new class265(arg1.method1472(var5[var8++], var4, 0));
                int var10 = var9.method1666(-2);
                int var11 = var9.method1685(8104);
                int var12 = var9.method1697(91);
                if (!arg3 && var12 == 1) {
                    var6.field5943--;
                } else {
                    var6.field5945[var7] = var10;
                    var6.field5946[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIZIB)V")
    public static final void method1411(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field3200++;
        if (class126.method864((byte) -92, arg3)) {
            if (arg4 < 115) {
                method1409(-121, (byte) -16, 122);
            }
            class264.method1652(arg2, class119.field1607[arg3], -36, arg0, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method1412(int arg0) {
        field3192 = null;
        if (arg0 < 90) {
            field3199 = 113;
        }
        field3201 = null;
    }
}
