import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class115 extends class162 {

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    private int field1688 = -32768;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field1682 = -1;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Z")
    public static boolean field1680 = true;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "Z")
    public static boolean field1689 = false;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "Lme;")
    public static class82 field1686;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V", line = 4)
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1679++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()I", line = 11)
    public final int method192() {
        field1685++;
        return this.field1688;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 27)
    public static void method751(int arg0) {
        if (arg0 != 4) {
            method753(48, true);
        }
        field1686 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIJILdh;)V", line = 40)
    public final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class145 arg10) {
        class128 var13 = class322.method2311(this.field1687, -106).method725(this.field1684, -1, (class340) null, 0, 0, (class131) null, 86);
        field1683++;
        if (var13 != null) {
            var13.method180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1688 = var13.method192();
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)I", line = 71)
    public static final int method752(int arg0, boolean arg1) {
        field1681++;
        if (class346.field5545 != null) {
            class346.field5545.method674((byte) -83);
            class346.field5545 = null;
        }
        if (arg1) {
            return -17;
        }
        class216.field3329++;
        if (class216.field3329 > 4) {
            class221.field3387 = 0;
            class216.field3329 = 0;
            return arg0;
        }
        class221.field3387 = 0;
        if (class344.field5523 == class171.field2665) {
            class171.field2665 = class270.field4452;
        } else {
            class171.field2665 = class344.field5523;
        }
        return -1;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(IZ)V", line = 106)
    public static final void method753(int arg0, boolean arg1) {
        class153.field2482[1] = (float) class235.method1623(255, arg0 >> 8) / 255.0F;
        field1677++;
        class153.field2482[2] = (float) class235.method1623(255, arg0) / 255.0F;
        class153.field2482[0] = (float) (class235.method1623(arg0, 16746231) >> 16) / 255.0F;
        class192.method1324(3, (byte) 87);
        if (arg1) {
            field1680 = false;
        }
        class192.method1324(4, (byte) 87);
    }
}
