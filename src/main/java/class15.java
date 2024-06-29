import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Z")
    public static boolean field201 = false;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lcr;")
    public static class575 field202;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 5)
    public static void method93(int arg0) {
        if (arg0 == 4) {
            field202 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lsca;IZI)V", line = 20)
    public static final void method94(class46 arg0, int arg1, boolean arg2, int arg3) {
        field200++;
        if (class609.field8613 != null || class483.field6967 || arg0 == null || class608.method3527(arg0, 28) == null) {
            return;
        }
        class609.field8613 = arg0;
        class531.field7570 = class608.method3527(arg0, 28);
        class289.field4114 = arg1;
        class439.field6503 = arg2;
        class95.field1353 = 0;
        class612.field8649 = arg3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILge;IIII)Ljava/awt/Frame;", line = 40)
    public static final Frame method95(int arg0, class711 arg1, int arg2, int arg3, int arg4, int arg5) {
        field204++;
        if (!arg1.method4041(arg0 - 15004)) {
            return null;
        }
        if (arg2 == 0) {
            class141[] var6 = class46.method343(arg1, (byte) -24);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1860 == arg4 && var6[var8].field1861 == arg5 && (arg3 == 0 || var6[var8].field1862 == arg3) && (!var7 || arg2 < var6[var8].field1863)) {
                    arg2 = var6[var8].field1863;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class197 var9 = arg1.method4049(arg3, (byte) 7, arg5, arg4, arg2);
        while (var9.field2986 == 0) {
            class277.method1759(10L, -119);
        }
        if (arg0 != 0) {
            return null;
        }
        Frame var10 = (Frame) var9.field2990;
        if (var10 == null) {
            return null;
        } else if (var9.field2986 == 2) {
            class295.method1869(var10, (byte) -34, arg1);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILcq;)[I", line = 114)
    public static final int[] method96(int arg0, class468 arg1) {
        field203++;
        class645 var2 = new class645(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method3730(123, 10);
        var2.method3695(var3[0], 255);
        var2.method3695(var3[1], 255);
        var2.method3695(var3[2], 255);
        var2.method3695(var3[3], 255);
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method3695((int) (Math.random() * 9.9999999E7D), 255);
        }
        var2.method3702((int) ((double) arg0 * Math.random()), (byte) -109);
        var2.method3707(class516.field7312, class354.field5145, arg0 - 99999970);
        arg1.field6839.method3703(0, var2.field9068, var2.field9084, 128);
        return var3;
    }
}
