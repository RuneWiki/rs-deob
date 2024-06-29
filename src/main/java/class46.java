import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class class46 extends class187 {

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "Lwa;")
    public class407 field460;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIIIIIZ)V", line = 3)
    public static final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (arg8) {
            method212(-25, -14, -52, 11, 57, 106, -65, -110, false);
        }
        field458++;
        if (arg2 < 1 || arg5 < 1 || arg2 > (class315.field4214 - 2) || arg5 > class340.field4549 - 2) {
            return;
        }
        if (!class138.method758(-10762) && !class230.method1249(arg5, arg3, class351.field4891, arg2, -96)) {
            return;
        }
        if (class176.field2209 == null) {
            return;
        }
        int var9 = arg3;
        if (arg3 < 3 && class67.method381((byte) 111, arg5, arg2)) {
            var9 = arg3 + 1;
        }
        class65.method369(class88.field1003, var9, (byte) 74, arg2, arg0, class36.field352[arg3], arg5, arg3);
        if (arg7 < 0) {
            return;
        }
        boolean var10 = class216.field2905;
        class216.field2905 = true;
        client.method1414(false, arg5, arg2, var9, false, arg4, class36.field352[arg3], arg7, arg6, arg3, 0, class88.field1003, arg1);
        class216.field2905 = var10;
        return;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lwa;)V", line = 48)
    public class46(class407 arg0) {
        this.field460 = arg0;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V", line = 60)
    public static final void method213(int arg0, int arg1) {
        if (arg0 != -24091) {
            method212(-57, 88, -88, 108, -107, -49, -72, 106, true);
        }
        field461++;
        class40 var2 = class162.method872(arg1, (byte) 92, 4);
        var2.method193(-73);
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)V", line = 81)
    public static final void method216(int arg0, int arg1) {
        field462++;
        class67.field697 = arg0;
        class114 var2 = class131.field1689;
        synchronized (class131.field1689) {
            class131.field1689.method613(true);
        }
        class114 var3 = class333.field4426;
        synchronized (class333.field4426) {
            class333.field4426.method613(true);
            if (arg1 != 0) {
                method216(103, 2);
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "(I)Z")
    public abstract boolean method214(int arg0);

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method215(byte arg0);
}
