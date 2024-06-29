import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class551 {

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field7854 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V", line = 4)
    public static final void method3213(int arg0, int arg1, int arg2) {
        field7852++;
        class118 var3 = class86.method755(true, arg0, arg2);
        var3.method933((byte) 102);
        var3.field1811 = arg1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BJLha;)V", line = 18)
    public static final void method3214(byte arg0, long arg1, class544 arg2) {
        class377.field5675 = 0;
        class673.field9526 = class3.field17;
        field7855++;
        class413.field6087 = 0;
        class3.field17 = 0;
        long var4 = class18.method109(arg0 ^ 0x2B05);
        for (class627 var6 = (class627) class494.field7152.method3272(-126); var6 != null; var6 = (class627) class494.field7152.method3274(false)) {
            if (var6.method3554(arg2, arg1)) {
                class413.field6087++;
            }
        }
        if (arg0 != -118) {
            field7857 = 105;
        }
        if (class713.field10028 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class494.field7152.method3262(arg0 + 75) + ", running: " + class413.field6087);
            System.out.println("Emitters: " + class377.field5675 + " Particles: " + class3.field17 + ". Time taken: " + (class18.method109(-11121) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILfc;IIII)Ljava/awt/Frame;", line = 55)
    public static final Frame method3215(int arg0, class731 arg1, int arg2, int arg3, int arg4, int arg5) {
        field7851++;
        if (!arg1.method4061(-13127)) {
            return null;
        }
        if (arg5 != 0) {
            method3216(40, null, null);
        }
        if (arg0 == 0) {
            class300[] var6 = class377.method2382(arg1, -29631);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4523 == arg3 && var6[var8].field4527 == arg2 && (arg4 == 0 || var6[var8].field4525 == arg4) && (!var7 || arg0 < var6[var8].field4526)) {
                    arg0 = var6[var8].field4526;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class162 var9 = arg1.method4055(arg4, arg2, arg3, arg0, -75);
        while (var9.field2512 == 0) {
            class484.method2932(true, 10L);
        }
        Frame var10 = (Frame) var9.field2517;
        if (var10 == null) {
            return null;
        } else if (var9.field2512 == 2) {
            class714.method3947(var10, arg1, false);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[I[I)V", line = 129)
    public static final void method3216(int arg0, int[] arg1, int[] arg2) {
        field7853++;
        int var3 = -91 / ((arg0 + 1) / 38);
        if (arg2 == null || arg1 == null) {
            class85.field1251 = null;
            class355.field5380 = null;
            class219.field3584 = null;
            return;
        }
        class85.field1251 = arg2;
        class219.field3584 = new int[arg2.length];
        class355.field5380 = new byte[arg2.length][][];
        for (int var4 = 0; var4 < class85.field1251.length; var4++) {
            class355.field5380[var4] = new byte[arg1[var4]][];
        }
    }
}
