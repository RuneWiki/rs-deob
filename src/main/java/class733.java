import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public abstract class class733 extends class668 {

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "I")
    public static int field10312;

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
    public static int field10313;

    @OriginalMember(owner = "client!mo", name = "B", descriptor = "I")
    public static int field10314;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
    public static int field10315;

    @OriginalMember(owner = "client!mo", name = "F", descriptor = "I")
    public static int field10317;

    @OriginalMember(owner = "client!mo", name = "G", descriptor = "I")
    public static int field10318;

    @OriginalMember(owner = "client!mo", name = "H", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "I")
    public static int field10320;

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "Lfc;")
    public static class731 field10316;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "(I)V", line = 5)
    public final void method102(int arg0) {
        if (arg0 != 0) {
            this.method1468((byte) -19);
        }
        ++field10315;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 18)
    public static void method4092(int arg0) {
        field10316 = null;
        if (arg0 != -2) {
            method4095(true);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBIII)V", line = 28)
    public static final void method4093(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field10319;
        class118 var5 = class86.method755(true, 10, arg3);
        var5.method933((byte) 83);
        var5.field1811 = arg4;
        var5.field1817 = arg2;
        var5.field1821 = arg0;
        if (arg1 >= -1) {
            field10316 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILha;)Z", line = 44)
    public final boolean method1467(int arg0, class544 arg1) {
        ++field10321;
        class291 var3 = class210.method1524(super.field9470, super.field9477 >> class662.field9425, super.field9475 >> class662.field9425);
        if (arg0 >= -26) {
            field10316 = null;
        }
        return var3 != null && var3.field4482.field7928 ? class16.method90(true, super.field9477 >> class662.field9425, super.field9470, super.field9475 >> class662.field9425, var3.field4482.method100((byte) -114) - -this.method100((byte) -59)) : class429.method2671(super.field9470, (byte) -68, super.field9477 >> class662.field9425, super.field9475 >> class662.field9425);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)[Lwk;", line = 61)
    public static final class430[] method4094(byte arg0) {
        ++field10313;
        int var1 = 64 % ((arg0 - 53) / 50);
        return new class430[] { class515.field7468, class398.field5913, class474.field6883, class756.field10533, class53.field845, class379.field5698, class539.field7701, class100.field1475, class229.field3701, class475.field6900, class466.field6797, class98.field1456, class97.field1427, class32.field302 };
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZILha;Lov;IIZ)V", line = 71)
    public final void method104(boolean arg0, int arg1, class544 arg2, class668 arg3, int arg4, int arg5, boolean arg6) {
        if (arg0) {
            this.method1467(36, (class544) null);
        }
        ++field10320;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(B)Z", line = 83)
    public final boolean method1468(byte arg0) {
        ++field10318;
        if (arg0 >= -82) {
            method4092(-28);
        }
        return class52.field838[(super.field9477 >> class662.field9425) + -class336.field4923 + class155.field2405][(super.field9475 >> class662.field9425) + class155.field2405 - class63.field996];
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)Z", line = 102)
    public final boolean method92(int arg0) {
        if (arg0 != 2) {
            return true;
        } else {
            ++field10312;
            return false;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V", line = 116)
    public static final void method4095(boolean arg0) {
        if (arg0) {
            class488.field7062 = class576.field8160;
            class211.field3511 = class152.field2374;
        } else {
            class488.field7062 = class475.field6899;
            class211.field3511 = class121.field1867;
        }
        class386.field5782 = class488.field7062.length;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V", line = 131)
    public static final void method4096(int arg0) {
        if (arg0 != 0) {
            field10316 = null;
        }
        ++field10314;
        class327 var1 = null;
        try {
            class162 var2 = class706.field9962.method4056((byte) -83, true, "2");
            while (var2.field2512 == 0) {
                class484.method2932(true, 1L);
            }
            if (~var2.field2512 == -2) {
                var1 = (class327) var2.field2517;
                byte[] var3 = new byte[(int) var1.method2113(-1)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2109(var3.length + -var4, (byte) 92, var4, var3);
                    if (~var5 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class19.method116(new class301(var3), -89);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2110((byte) 52);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([Lvt;I)I", line = 180)
    public final int method1469(class759[] arg0, int arg1) {
        if (arg1 <= 104) {
            return 58;
        } else {
            ++field10317;
            return this.method3746(super.field9477 >> class662.field9425, 0, arg0, super.field9475 >> class662.field9425);
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIII)V", line = 190)
    public class733(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field9470 = (byte) arg3;
        super.field9475 = arg2;
        super.field9477 = arg0;
        super.field9474 = arg1;
        super.field9469 = (byte) arg4;
    }
}
