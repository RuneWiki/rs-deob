import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class71 extends class137 {

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public int field1138;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lqe;")
    public static class103 field1140 = new class103(0, 0);

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Lja;")
    public static class61 field1143 = new class61();

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public static final void method492(int arg0) {
        if (arg0 != 12963) {
            field1140 = null;
        }
        field1142++;
        for (int var1 = 0; var1 < class91.field1439; var1++) {
            int var2 = class34.field556[var1];
            class104 var3 = class131.field2113[var2];
            if (var3 != null) {
                class23.method188(var3, var3.field1645.field3789, 24866);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZIIII)V")
    public static final void method493(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1141++;
        int var5 = -88 / ((arg3 - 36) / 38);
        if (class118.method816(arg1, 0)) {
            class179.method1261(arg0, -1, class208.field3315[arg1], 124, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    public static final int method494(int arg0, int arg1) {
        if (arg0 != -1264023672) {
            method493(true, 102, -55, 83, 56);
        }
        field1137++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public static final void method495(boolean arg0) {
        class311.field5027.field4458 = 0;
        field1135++;
        class84.field1342 = 0;
        class271.field4366 = 0;
        class192.field3139 = 0;
        class229.field3584.field4458 = 0;
        class291.field4776 = 0;
        class272.field4371 = -1;
        class251.field4126 = -1;
        class119.field1892 = -1;
        class41.field633 = arg0;
        class88.field1369 = -1;
        class95.method687(-14433);
        for (int var1 = 0; var1 < class28.field494.length; var1++) {
            if (class28.field494[var1] != null) {
                class28.field494[var1].field998 = -1;
            }
        }
        for (int var2 = 0; var2 < class131.field2113.length; var2++) {
            if (class131.field2113[var2] != null) {
                class131.field2113[var2].field998 = -1;
            }
        }
        class198.method1370(32);
        class231.field3613 = 1;
        class143.method983(30, 16590);
        for (int var3 = 0; var3 < 100; var3++) {
            class259.field4249[var3] = true;
        }
        class45.method299(113);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static final void method496(byte arg0) {
        field1136++;
        if (arg0 <= 120) {
            method494(50, 68);
        }
        class153.field2445.method1876((byte) 115);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lom;)V")
    public static final void method497(class90 arg0) {
        for (int var1 = arg0.field1405; var1 <= arg0.field1420; var1++) {
            for (int var2 = arg0.field1407; var2 <= arg0.field1399; var2++) {
                class116 var3 = class307.field4991[arg0.field1422][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1787; var4++) {
                        if (var3.field1782[var4] == arg0) {
                            var3.field1787--;
                            for (int var5 = var4; var5 < var3.field1787; var5++) {
                                var3.field1782[var5] = var3.field1782[var5 + 1];
                                var3.field1768[var5] = var3.field1768[var5 + 1];
                            }
                            var3.field1782[var3.field1787] = null;
                            break;
                        }
                    }
                    var3.field1779 = 0;
                    for (int var6 = 0; var6 < var3.field1787; var6++) {
                        var3.field1779 |= var3.field1768[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BJ)V")
    public static final void method498(byte arg0, long arg1) {
        field1139++;
        if (arg0 == -15 && arg1 != 0L) {
            class164.field2729++;
            class311.field5027.method2081(false, 126);
            class311.field5027.method1840((byte) 47, arg1);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class71() {
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
    public class71(int arg0) {
        this.field1138 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
    public static void method499(int arg0) {
        if (arg0 != 0) {
            field1140 = null;
        }
        field1143 = null;
        field1140 = null;
    }
}
