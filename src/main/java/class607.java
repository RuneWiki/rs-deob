import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class607 {

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public int field7691;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
    public int[] field7690;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "[I")
    public int[] field7688;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Z")
    public static boolean field7684 = false;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[BBIII)Z")
    public static final boolean method3259(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5, int arg6) {
        field7689++;
        int var7 = -64 % ((arg3 - 4) / 41);
        int var8 = arg0 % arg4;
        int var9;
        if (var8 == 0) {
            var9 = 0;
        } else {
            var9 = arg4 - var8;
        }
        int var10 = -((arg5 - (1 - arg4)) / arg4);
        int var11 = -((arg0 + arg4 - 1) / arg4);
        for (int var12 = var10; var12 < 0; var12++) {
            for (int var13 = var11; var13 < 0; var13++) {
                if (arg2[arg6] == 0) {
                    return true;
                }
                arg6 += arg4;
            }
            int var14 = arg6 - var9;
            if (arg2[var14 - 1] == 0) {
                return true;
            }
            arg6 = arg1 + var14;
        }
        return false;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lwm;I)V")
    public static final void method3260(class30 arg0, int arg1) {
        class570.field7195 = arg0.method135(arg1, "hitmarks");
        field7687++;
        class674.field8728 = arg0.method135(0, "hitbar_default");
        class547.field6840 = arg0.method135(0, "timerbar_default");
        class567.field7178 = arg0.method135(0, "headicons_pk");
        class195.field2704 = arg0.method135(arg1, "headicons_prayer");
        class562.field7148 = arg0.method135(0, "hint_headicons");
        class545.field6823 = arg0.method135(0, "hint_mapmarkers");
        class63.field828 = arg0.method135(0, "mapflag");
        class122.field1643 = arg0.method135(0, "cross");
        class755.field10292 = arg0.method135(0, "mapdots");
        class659.field8611 = arg0.method135(arg1, "scrollbar");
        class322.field3987 = arg0.method135(arg1, "name_icons");
        class264.field3520 = arg0.method135(arg1, "floorshadows");
        class369.field4529 = arg0.method135(0, "compass");
        class297.field3763 = arg0.method135(arg1, "otherlevel");
        class655.field8446 = arg0.method135(0, "hint_mapedge");
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ltia;I)V")
    public static final void method3261(class740 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        arg0.method1496(class383.field4788.method140(-15616), (byte) -119);
        field7686++;
        arg0.method1496(class154.field1959.method140(-15616), (byte) -4);
        arg0.method1496(class735.field9972.method140(-15616), (byte) -121);
        arg0.method1496(class622.field7868.method140(-15616), (byte) -123);
        arg0.method1496(class664.field8660.method140(arg1 ^ 0xFFFFC300), (byte) 59);
        arg0.method1496(class650.field8282.method140(-15616), (byte) -11);
        arg0.method1496(class788.field10798.method140(-15616), (byte) 72);
        arg0.method1496(class470.field6128.method140(-15616), (byte) 52);
        arg0.method1496(class172.field2270.method140(-15616), (byte) 108);
        arg0.method1496(class11.field120.method140(arg1 ^ 0xFFFFC300), (byte) 70);
        arg0.method1496(class778.field10633.method140(-15616), (byte) -121);
        arg0.method1496(class559.field7105.method140(-15616), (byte) -127);
        arg0.method1496(class67.field884.method140(-15616), (byte) -122);
        arg0.method1496(class171.field2264.method140(-15616), (byte) -122);
        arg0.method1496(class681.field8795.method140(-15616), (byte) 0);
        arg0.method1496(class407.field5402.method140(-15616), (byte) 84);
        arg0.method1496(class381.field4740.method140(arg1 ^ 0xFFFFC300), (byte) -122);
        arg0.method1496(class151.field1918.method140(arg1 ^ 0xFFFFC300), (byte) -121);
        arg0.method1496(class655.field8450.method140(arg1 - 15616), (byte) 44);
        arg0.method1496(class410.field5436.method140(-15616), (byte) -117);
        arg0.method1496(class29.field254.method140(-15616), (byte) -121);
        arg0.method1496(class654.field8390.method140(-15616), (byte) 73);
        arg0.method1496(class169.field2248.method140(arg1 ^ 0xFFFFC300), (byte) -121);
        arg0.method1496(class162.field2163.method140(arg1 - 15616), (byte) -119);
        arg0.method1496(class325.field4006.method140(-15616), (byte) -128);
        arg0.method1496(class356.field4344.method140(-15616), (byte) 38);
        arg0.method1496(class526.field6686.method140(-15616), (byte) 11);
        arg0.method1496(class740.field10029.method140(-15616), (byte) -125);
        arg0.method1496(class273.field3577.method140(-15616), (byte) -14);
        arg0.method1496(class580.field7337.method140(-15616), (byte) 96);
        arg0.method1496(class414.field5480.method140(arg1 - 15616), (byte) -120);
        arg0.method1496(class790.field10813.method140(-15616), (byte) 123);
        arg0.method1496(class786.method4307(-91), (byte) -116);
        arg0.method1496(class498.method2764(arg1 - 2), (byte) -3);
        arg0.method1496(class740.field10032.method140(arg1 ^ 0xFFFFC300), (byte) -126);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILoq;I)Ljava/awt/Frame;")
    public static final Frame method3262(int arg0, int arg1, int arg2, int arg3, class775 arg4, int arg5) {
        field7685++;
        if (!arg4.method4230(5601)) {
            return null;
        }
        if (arg0 == 0) {
            class264[] var6 = class76.method472(-19377, arg4);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3514 == arg5 && var6[var8].field3513 == arg2 && (arg3 == 0 || var6[var8].field3517 == arg3) && (!var7 || arg0 < var6[var8].field3512)) {
                    arg0 = var6[var8].field3512;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class339 var9 = arg4.method4231(115, arg5, arg0, arg2, arg3);
        while (var9.field4144 == 0) {
            class591.method3181(10L, 0);
        }
        Frame var10 = (Frame) var9.field4142;
        if (var10 == null) {
            return null;
        }
        int var11 = -63 / ((64 - arg1) / 55);
        if (var9.field4144 == 2) {
            class578.method3101(arg4, var10, -102);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
    public class607(int arg0) {
        this.field7691 = arg0;
        this.field7690 = new int[this.field7691];
        this.field7688 = new int[this.field7691];
    }
}
