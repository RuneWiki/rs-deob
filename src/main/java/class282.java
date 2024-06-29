import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class282 implements class196 {

    @OriginalMember(owner = "client!hfa", name = "j", descriptor = "I")
    public int field3857;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lma;")
    public class12 field3850;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public int field3853;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lor;")
    public class594 field3851;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "J")
    public static long field3848 = -1L;

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!hfa", name = "k", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)Loh;")
    public class370 method640(int arg0) {
        if (arg0 != 58) {
            method1730(121, 38);
        }
        field3858++;
        return class444.field6144;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)V")
    public static final void method1730(int arg0, int arg1) {
        field3852++;
        if (arg1 != 25231) {
            method1730(-82, 41);
        }
        for (class401 var2 = class322.field4400.method977(0); var2 != null; var2 = class322.field4400.method975(-1)) {
            if ((long) arg0 == (var2.field5623 >> 48 & 0xFFFFL)) {
                var2.method2340(119);
            }
        }
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)V")
    public static final void method1731(int arg0) {
        field3855++;
        class81 var1 = (class81) class645.field8903.method1436(28964);
        if (arg0 != 0) {
            field3848 = -29L;
        }
        while (var1 != null) {
            if (var1.field1213 == -1) {
                var1.field1222 = 0;
                if (var1.field1219 >= 0 && var1.field1220 >= 0 && class401.field5620 > var1.field1219 && var1.field1220 < class257.field3508) {
                    class80.method627(-5, var1);
                }
            } else {
                var1.method2340(126);
            }
            var1 = (class81) class645.field8903.method1443((byte) 6);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
    public static final void method1732(File arg0, String arg1, byte arg2) {
        field3856++;
        class206.field2875.put(arg1, arg0);
        if (arg2 == -91) {
            ;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(III)Z")
    public static final boolean method1733(int arg0, int arg1, int arg2) {
        if (arg2 == 262144) {
            field3854++;
            return class645.method3597(arg1, arg0, false) | (arg1 & 0x40000) != 0 || class66.method559(arg1, arg0, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(ILor;Lma;II)V")
    public class282(int arg0, class594 arg1, class12 arg2, int arg3, int arg4) {
        this.field3857 = arg4;
        this.field3849 = arg3;
        this.field3850 = arg2;
        this.field3853 = arg0;
        this.field3851 = arg1;
    }
}
