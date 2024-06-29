import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class572 extends OutputStream {

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "[I")
    public static int[] field7985 = new int[8];

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "[Lvt;")
    public static class377[] field7993 = new class377[50];

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Lpl;")
    public static class612 field7994;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "[I")
    public static int[] field7992;

    @OriginalMember(owner = "client!tn", name = "write", descriptor = "(I)V", line = 5)
    public final void write(int arg0) throws IOException {
        field7990++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)V", line = 13)
    public static final void method3155(int arg0, byte arg1) {
        class236.field2951.method2411(true, arg0);
        field7989++;
        if (arg1 != -89) {
            method3160(109, -86);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 27)
    public static void method3156(int arg0) {
        field7985 = null;
        if (arg0 > -109) {
            field7992 = null;
        }
        field7992 = null;
        field7994 = null;
        field7993 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILes;)Lnn;", line = 41)
    public static final class230 method3157(int arg0, class630 arg1) {
        field7987++;
        String var2 = arg1.method3500((byte) 119);
        class414 var3 = class349.method1929((byte) 87)[arg1.method3501(-9268)];
        class29 var4 = class20.method132(95)[arg1.method3501(arg0 - 10291)];
        int var5 = arg1.method3510(75);
        if (arg0 != 1023) {
            method3161((byte) 17);
        }
        int var6 = arg1.method3510(51);
        int var7 = arg1.method3501(-9268);
        int var8 = arg1.method3501(-9268);
        int var9 = arg1.method3501(-9268);
        int var10 = arg1.method3470(13111);
        int var11 = arg1.method3470(13111);
        int var12 = arg1.method3483(73);
        int var13 = arg1.method3483(arg0 - 907);
        int var14 = arg1.method3483(71);
        return new class230(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lkp;I)V", line = 81)
    public static final void method3158(class507 arg0, int arg1) {
        if (class412.field5149 == arg0.field6829) {
            class413.field5168[arg0.field6800] = true;
        }
        field7986++;
        if (arg1 != 1023) {
            field7992 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIII)V", line = 96)
    public static final void method3159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7988++;
        if (arg4 == arg5) {
            class242.method1449(arg0, arg1, arg2, arg4, (byte) 37);
            return;
        }
        if (class263.field3294 <= (arg0 - arg4) && (arg0 + arg4) <= class314.field4052 && (arg1 - arg5) >= class289.field3595 && (arg1 + arg5) <= class159.field2063) {
            class11.method86(1641, arg5, arg4, arg2, arg1, arg0);
        } else {
            class265.method1534(arg2, arg3 ^ 0x4AE3, arg0, arg5, arg4, arg1);
        }
        if (arg3 != -19170) {
            field7992 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)I", line = 119)
    public static final int method3160(int arg0, int arg1) {
        field7991++;
        if (arg1 != 1023) {
            field7985 = null;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 130)
    public static final void method3161(byte arg0) {
        class23.field362 = null;
        class627.field8740 = null;
        if (arg0 <= 23) {
            method3156(-44);
        }
        field7984++;
    }
}
