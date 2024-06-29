import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class14 extends class172 {

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "[B")
    public byte[] field150;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field151 = -1;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Z")
    public static boolean field152 = true;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "Ljava/lang/String;")
    public static String field155 = null;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "Lwf;")
    public static class250 field153 = null;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "Lwf;")
    public static class250 field149;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)Lml;", line = 6)
    public static final class17 method78(byte arg0) {
        if (arg0 != 47) {
            return (class17) null;
        }
        field156++;
        int var1 = class322.field5132[0] * class221.field3595[0];
        byte[] var2 = class163.field2578[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class121.field2026[class343.method2418(255, var2[var4])];
        }
        class17 var5;
        if (class42.field607) {
            var5 = new class58(class164.field2595, class318.field5070, class189.field3035[0], class19.field211[0], class221.field3595[0], class322.field5132[0], var3);
        } else {
            var5 = new class351(class164.field2595, class318.field5070, class189.field3035[0], class19.field211[0], class221.field3595[0], class322.field5132[0], var3);
        }
        class211.method1592((byte) 41);
        return var5;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V", line = 37)
    public static void method79(byte arg0) {
        if (arg0 != -73) {
            method79((byte) 92);
        }
        field155 = null;
        field153 = null;
        field149 = null;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)Lem;", line = 50)
    public static final class285 method80(int arg0) {
        if (arg0 != 0) {
            method80(46);
        }
        field148++;
        class285 var1;
        if (class42.field607) {
            var1 = new class265(class164.field2595, class318.field5070, class189.field3035[0], class19.field211[0], class221.field3595[0], class322.field5132[0], class163.field2578[0], class121.field2026);
        } else {
            var1 = new class341(class164.field2595, class318.field5070, class189.field3035[0], class19.field211[0], class221.field3595[0], class322.field5132[0], class163.field2578[0], class121.field2026);
        }
        class211.method1592((byte) 41);
        return var1;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V", line = 78)
    public static final void method81(boolean arg0) {
        if (class4.field38 != null) {
            class208 var1 = class4.field38;
            synchronized (class4.field38) {
                class4.field38 = null;
            }
        }
        field154++;
        if (!arg0) {
            field151 = -128;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "([B)V", line = 94)
    public class14(byte[] arg0) {
        this.field150 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V", line = 111)
    public static final void method82(int arg0) {
        field147++;
        if (arg0 == 19775) {
            for (int var1 = 0; var1 < 100; var1++) {
                class270.field4498[var1] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BZ)V", line = 132)
    public static final void method83(byte arg0, boolean arg1) {
        class354.method2507(class304.field4870, class252.field4266, class298.field4779, (byte) -22, arg1);
        if (arg0 <= 52) {
            method79((byte) -15);
        }
        field157++;
    }
}
