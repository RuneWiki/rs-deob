import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class101 extends class11 implements class130 {

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    private int field1512 = -1;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    private int field1515 = -1;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public int field1505;

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "Lno;")
    private class658 field1517;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "Ldb;")
    public static class298 field1516 = new class298(33, 12);

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Leh;Z)Lqg;", line = 6)
    public static final class432 method769(class335 arg0, boolean arg1) {
        if (arg1) {
            field1516 = null;
        }
        field1504++;
        int var2 = arg0.method2045(-98);
        return new class432(var2);
    }

    @OriginalMember(owner = "client!bm", name = "finalize", descriptor = "()V", line = 21)
    protected final void finalize() throws Throwable {
        this.method770(-10660793);
        field1503++;
        super.finalize();
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V", line = 30)
    public final void method770(int arg0) {
        field1506++;
        if (this.field1507 > 0) {
            this.field1517.method3683((byte) 106, this.field1513, this.field1507);
            this.field1507 = 0;
        }
        if (arg0 != -10660793) {
            method771(38);
        }
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(I)V", line = 48)
    public static void method771(int arg0) {
        int var1 = -120 / ((39 - arg0) / 32);
        field1516 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)Z", line = 59)
    public static final boolean method772(int arg0, int arg1, int arg2) {
        if (arg1 != 1408) {
            method774(-98, null);
        }
        field1514++;
        return (arg2 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 70)
    public final void method773(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field1515, this.field1512, 36161, 0);
        field1511++;
        this.field1512 = arg0;
        this.field1515 = -1;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILoa;)V", line = 80)
    public static final void method774(int arg0, class651 arg1) {
        field1518++;
        int var2 = class259.field3566;
        int var3 = class340.field4703;
        int var4 = class483.field6540;
        int var5 = class342.field4707;
        int var6 = -10660793;
        arg1.method3567(var4, var2, var5, var3, var6, (byte) 124);
        arg1.method3567(var4 - 2, var2 - -1, arg0, var3 + 1, -16777216, (byte) 104);
        arg1.method3572((byte) -33, var2 + 1, -16777216, var5 + -19, var3 + 18, var4 + -2);
        class450.field6177.method1288((byte) 83, var2 + 3, var6, -1, class72.field1088.method546(class516.field6892, (byte) -35), var3 + 14);
        int var7 = class164.field2564.method1110((byte) 91);
        int var8 = class164.field2564.method1113(-6387);
        int var9 = 0;
        for (class117 var10 = (class117) class480.field6411.method3257(-84); var10 != null; var10 = (class117) class480.field6411.method3263((byte) -99)) {
            int var11 = var3 + ((-var9 + class398.field5290 - 1) * 16) + 31;
            short var12 = -1;
            if (var7 > var2 && var7 < var2 + var4 && var8 > (var11 - 13) && (var11 + 3) > var8 && var10.field2004) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class702.method3886(var10.field1993, (byte) 34)) {
                var13 = class193.field2826.method1047((int) var10.field1996, -1).field7654;
            } else if (var10.field1992 != -1) {
                var13 = class193.field2826.method1047(var10.field1992, -1).field7654;
            } else if (class264.method1611(var10.field1993, false)) {
                class280 var14 = (class280) class616.field8143.method2918((long) ((int) var10.field1996), (byte) -125);
                if (var14 != null) {
                    class287 var15 = var14.field3983;
                    class419 var16 = var15.field4052;
                    if (var16.field5753 != null) {
                        var16 = var16.method2401(false, class80.field1261);
                    }
                    if (var16 != null) {
                        var13 = var16.field5791;
                    }
                }
            } else if (class407.method2336(var10.field1993, (byte) 125)) {
                Object var17 = null;
                class58 var18;
                if (var10.field1993 == 1010) {
                    var18 = class470.field6288.method1258((int) var10.field1996, (byte) -41);
                } else {
                    var18 = class470.field6288.method1258((int) (var10.field1996 >>> 32 & 0x7FFFFFFFL), (byte) -127);
                }
                if (var18.field888 != null) {
                    var18 = var18.method486((byte) -113, class80.field1261);
                }
                if (var18 != null) {
                    var13 = var18.field811;
                }
            }
            String var19 = class690.method3834(var10, (byte) -106);
            if (var13 != null) {
                var19 = var19 + class179.method1201(-21130, var13);
            }
            class450.field6177.method1300(0, var11, var2 + 3, class651.field8812, 0, class690.field9713, var19, var12);
            var9++;
            if (var10.field2000) {
                class628.field8474.method2637(class193.field2823.method2847(var19, (byte) -116) + var2 + 5, var11 + -12);
            }
        }
        class92.method727(class483.field6540, (byte) -82, class340.field4703, class259.field3566, class342.field4707);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)V", line = 192)
    public final void method775(int arg0, int arg1, int arg2) {
        field1508++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field1507);
        this.field1515 = arg0;
        this.field1512 = arg2;
        if (arg1 <= 3) {
            field1516 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lno;III)V", line = 217)
    public class101(class658 arg0, int arg1, int arg2, int arg3) {
        this.field1509 = arg1;
        this.field1510 = arg3;
        this.field1505 = arg2;
        this.field1517 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class77.field1215, 0);
        this.field1507 = class77.field1215[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1507);
        OpenGL.glRenderbufferStorageEXT(36161, this.field1509, this.field1505, this.field1510);
        this.field1513 = this.field1510 * this.field1505 * this.field1517.method3682(this.field1509, 97);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lno;IIII)V", line = 232)
    public class101(class658 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1510 = arg3;
        this.field1505 = arg2;
        this.field1509 = arg1;
        this.field1517 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class77.field1215, 0);
        this.field1507 = class77.field1215[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1507);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field1509, this.field1505, this.field1510);
        this.field1513 = this.field1505 * this.field1510 * this.field1517.method3682(this.field1509, 116);
    }
}
