import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public abstract class class738 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field10352;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field10353;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field10354;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field10355;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public abstract void method763(int arg0);

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public abstract void method765(int arg0);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V")
    public abstract void method774(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([I)V")
    public abstract void method771(int[] arg0);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III[I)V")
    public abstract void method766(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III[I)V")
    public abstract void method776(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lql;)V")
    public abstract void method772(class738 arg0);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V")
    public abstract void method769();

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public abstract void method777(int arg0);

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
    public abstract void method768(int arg0);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Loda;Z)V")
    public static final void method4137(class119 arg0, boolean arg1) {
        for (int var2 = arg0.field1628; var2 <= arg0.field1632; var2++) {
            for (int var3 = arg0.field1626; var3 <= arg0.field1624; var3++) {
                class186 var4 = class80.field1136[arg0.field8429][var2][var3];
                if (var4 != null) {
                    class754 var5 = var4.field2830;
                    class754 var6 = null;
                    while (var5 != null) {
                        if (var5.field10542 == arg0) {
                            if (var6 == null) {
                                var4.field2830 = var5.field10537;
                            } else {
                                var6.field10537 = var5.field10537;
                            }
                            var5.method4201(true);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field10537;
                    }
                }
            }
        }
        if (!arg1) {
            class51.method371(arg0);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static final void method4138(byte arg0) {
        field10355++;
        class276.field3915.method3101(5, 45056);
        class257.field3690.method175(5, -17213);
        class582.field8291.method78(5, false);
        if (arg0 < 9) {
            method4137(null, true);
        }
        class239.field3470.method393(97, 5);
        class74.field1032.method3321((byte) -127, 5);
        class336.field4876.method2084(true, 5);
        class742.field10404.method2664(5, true);
        class499.field7100.method169(74, 5);
        class665.field9346.method3012(5, (byte) 27);
        class538.field7691.method1324(-75, 5);
        class95.field1354.method2830(5, 16);
        class637.field8949.method861((byte) -91, 5);
        class581.field8249.method4124(true, 5);
        class153.field2479.method1651(5, (byte) 122);
        class28.field273.method2436(75, 5);
        class684.field9464.method1745(5, true);
        class288.field4108.method3001(0, 5);
        class196.field2977.method695(5, -12004);
        class123.field1667.method1565((byte) -100, 5);
        class209.field3066.method3480(1, 5);
        class280.field3967.method626(73, 5);
        class92.method727((byte) 110, 5);
        class109.method813(121, 50);
        class350.method2209(30000, 50);
        class290.method1854((byte) -118, 5);
        class290.method1853(5, (byte) -32);
        class108.field1500.method807(5, -1);
        class335.field4831.method807(5, -1);
        class592.field8412.method807(5, -1);
        class27.field266.method807(5, -1);
        class709.field9992.method807(5, -1);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIII)V")
    public abstract void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)V")
    public abstract void method758(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V")
    public abstract void method764(int arg0);

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V")
    public abstract void method760(int arg0);

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(III[I)V")
    public abstract void method767(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()Lql;")
    public abstract class738 method759();

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
    public static final void method4139(byte arg0) {
        class457.field6749 = null;
        if (arg0 != 36) {
            field10353 = 105;
        }
        class732.field10245 = null;
        class76.field1063 = null;
        class427.field6332 = null;
        class358.field5201 = null;
        class667.field9350 = null;
        class452.field6681 = null;
        class385.field5817 = null;
        class25.field253 = null;
        class236.field3432 = null;
        class504.field7166 = null;
        class391.field5894 = null;
        class474.field6895 = null;
        class438.field6489 = null;
        class12.field169 = null;
        class195.field2970 = null;
        class298.field4225 = null;
        field10354++;
        class80.field1134 = null;
    }
}
