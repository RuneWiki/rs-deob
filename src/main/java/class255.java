import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class255 extends class549 {

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3461 = null;

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "Z")
    public static boolean field3460 = false;

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
    public static int field3462 = 52;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "Z")
    public static boolean field3464;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)I", line = 4)
    public static final int method1555(int arg0) {
        field3465++;
        if (class641.field9159 == 0) {
            class411.field5821.method2480(32154, new class322("jaclib"));
            if (class411.field5821.method2479(-104).method365(88) != 100) {
                return 1;
            }
            if (!((class322) class411.field5821.method2479(-55)).method1872((byte) 12)) {
                class683.field9762.method3565((byte) -118);
            }
            class641.field9159 = 1;
        }
        if (class641.field9159 == 1) {
            class86.field1222 = class411.method2478((byte) 46);
            class411.field5810.method2480(32154, new class474(class384.field5116));
            class411.field5823.method2480(32154, new class322("jaggl"));
            class411.field5824.method2480(32154, new class322("jagdx"));
            class411.field5825.method2480(32154, new class322("jagmisc"));
            class411.field5826.method2480(32154, new class322("sw3d"));
            class411.field5827.method2480(32154, new class322("hw3d"));
            class411.field5828.method2480(32154, new class474(class561.field8099));
            class411.field5829.method2480(32154, new class474(class568.field8300));
            class411.field5830.method2480(32154, new class474(class474.field6631));
            class411.field5831.method2480(32154, new class474(class361.field4803));
            class411.field5832.method2480(32154, new class474(class163.field1998));
            class411.field5833.method2480(32154, new class474(class618.field8872));
            class411.field5834.method2480(32154, new class474(class187.field2287));
            class411.field5835.method2480(32154, new class474(class469.field6553));
            class411.field5836.method2480(32154, new class474(class672.field9662));
            class411.field5837.method2480(32154, new class474(class704.field9963));
            class411.field5838.method2480(32154, new class474(class70.field1068));
            class411.field5839.method2480(32154, new class474(class670.field9630));
            class411.field5840.method2480(32154, new class474(class216.field2812));
            class411.field5841.method2480(32154, new class474(class232.field3103));
            class411.field5842.method2480(32154, new class24(class6.field62, "huffman"));
            class411.field5843.method2480(32154, new class474(class502.field7007));
            class411.field5844.method2480(32154, new class474(class351.field4691));
            class411.field5845.method2480(32154, new class474(class420.field5953));
            class411.field5846.method2480(32154, new class203(class634.field9107, "details"));
            for (int var1 = 0; var1 < class86.field1222.length; var1++) {
                if (class86.field1222[var1].method2479(-103) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class411[] var3 = class86.field1222;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class411 var5 = var3[var4];
                int var6 = var5.method2475((byte) 86);
                int var7 = var5.method2479(-47).method365(87);
                var2 += var6 * var7 / 100;
            }
            class641.field9159 = 2;
            class269.field3682 = var2;
        }
        if (class86.field1222 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class411[] var11 = class86.field1222;
        int var12 = 0;
        int var13 = -83 % ((arg0 - 73) / 34);
        while (var12 < var11.length) {
            class411 var17 = var11[var12];
            int var18 = var17.method2475((byte) 86);
            int var19 = var17.method2479(-107).method365(104);
            var8 += var18;
            var9 += var18 * var19 / 100;
            if (var19 < 100) {
                var10 = false;
            }
            var12++;
        }
        if (var10) {
            if (!((class322) class411.field5825.method2479(-114)).method1872((byte) 12)) {
                class683.field9762.method3559(7087);
            }
            class86.field1222 = null;
        }
        int var14 = var8 - class269.field3682;
        int var15 = var9 - class269.field3682;
        int var16 = var14 > 0 ? var15 * 100 / var14 : 100;
        if (!var10 && var16 > 99) {
            var16 = 99;
        }
        return var16;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V", line = 150)
    public static void method1556(int arg0) {
        field3461 = null;
        if (arg0 != 99) {
            method1555(38);
        }
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V", line = 164)
    public static final void method1557(int arg0) {
        field3463++;
        class472 var1 = class230.field2993;
        synchronized (class230.field2993) {
            if (arg0 > -1) {
                field3464 = false;
            }
            class230.field2993.method2778((byte) 127);
        }
        class472 var2 = class277.field3783;
        synchronized (class277.field3783) {
            class277.field3783.method2778((byte) 110);
        }
    }
}
