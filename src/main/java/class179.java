import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class class179 extends class108 {

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "[Lff;")
    public static class480[] field2310 = new class480[1024];

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "Lpaa;")
    public static class317 field2306 = new class317(11, 7);

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public int field2303;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!hca", name = "u", descriptor = "Lha;")
    public static class116 field2313;

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "Lkr;")
    public static class329 field2312;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "[I")
    public int[] field2308;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)Lhn;")
    public static final class85 method1101(int arg0, int arg1) {
        field2305++;
        class85 var2 = (class85) class294.field3823.method323((long) arg1, -19814);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class105.field1369.method2054(true, 0, arg1);
        class85 var4 = new class85();
        if (var3 != null) {
            var4.method484(new class551(var3), arg1, 16843);
        }
        class294.field3823.method316((long) arg1, (byte) -120, var4);
        if (arg0 <= 3) {
            field2313 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V")
    public static void method1102(byte arg0) {
        field2306 = null;
        field2313 = null;
        field2312 = null;
        if (arg0 < -44) {
            field2310 = null;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILsa;)V")
    public static final void method1103(int arg0, class544 arg1) {
        class501.field6947[arg0] = arg1;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
    public static final boolean method1104(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            field2311++;
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)Z")
    public static final boolean method1105(byte arg0) {
        field2309++;
        class108 var1 = class57.field760.field7933.field1399;
        if (var1 == null || class57.field760.field7933 == var1) {
            return false;
        }
        if (arg0 != 3) {
            field2312 = null;
        }
        class245 var2 = (class245) var1;
        if (var2.field3094 >= 2000) {
            var2.field3094 -= 2000;
        }
        return var2.field3094 == 1009;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
    public abstract void method155(boolean arg0, Canvas arg1);

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method153(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method154(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)V")
    public static final void method1106(byte arg0) {
        if (arg0 <= 86) {
            method1102((byte) 74);
        }
        for (int var1 = 0; var1 < class310.field3971.length; var1++) {
            for (int var2 = 0; var2 < class310.field3971[0].length; var2++) {
                for (int var3 = 0; var3 < class310.field3971[0][0].length; var3++) {
                    class310.field3971[var1][var2][var3] = 0;
                }
            }
        }
        field2307++;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIII)V")
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2304++;
        float var5 = (float) class614.field8851 / (float) class614.field8856;
        int var6 = arg0;
        int var7 = arg2;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg4 - (arg2 - var7) / 2;
        int var9 = arg1 - (arg0 - var6) / 2;
        class2.field20 = class614.field8851 - (class614.field8851 * var8 / var7);
        class124.field1543 = -1;
        class217.field2771 = -1;
        if (arg3 == -30553) {
            class80.field1091 = class614.field8856 * var9 / var6;
            class168.method1000((byte) -27);
        }
    }
}
