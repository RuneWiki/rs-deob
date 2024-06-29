import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public abstract class class165 {

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "I")
    public static int field1846 = 0;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "I")
    public static int field1849;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field1850;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1037(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V", line = 21)
    public static final void method1029(byte arg0) {
        field1845++;
        int var1 = -57 % ((12 - arg0) / 59);
        if (class289.field3549.field7847) {
            class649.field9279 = 96;
            return;
        }
        try {
            Method var2 = (field1850 == null ? (field1850 = method1037("java.lang.Runtime")) : field1850).getMethod("maxMemory");
            if (var2 != null) {
                try {
                    Runtime var3 = Runtime.getRuntime();
                    Long var4 = (Long) var2.invoke(var3, (Object[]) null);
                    class649.field9279 = (int) (var4 / 1048576L) + 1;
                } catch (Throwable var5) {
                }
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lha;I)V", line = 55)
    public static final void method1031(class58 arg0, int arg1) {
        field1847++;
        class322.field4116 = class303.method1822(-3457, arg0, class613.field8770, true);
        if (arg1 != 0) {
            return;
        }
        class47.field511 = class633.method3638(78, arg0, class613.field8770);
        class720.field10104 = class303.method1822(arg1 - 3457, arg0, class630.field9062, true);
        class740.field10344 = class633.method3638(105, arg0, class630.field9062);
        class567.field8070 = class303.method1822(arg1 - 3457, arg0, class152.field1671, true);
        class96.field1014 = class633.method3638(123, arg0, class152.field1671);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)V", line = 74)
    public static final void method1034(int arg0, int arg1) {
        for (class134 var2 = class478.field6827.method1753(0); var2 != null; var2 = class478.field6827.method1755(-112)) {
            if ((var2.field1522 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method864(12983);
            }
        }
        field1848++;
        if (arg1 != -17029) {
            method1031(null, -80);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III)V")
    public abstract void method1019(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III[I)V")
    public abstract void method1020(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V")
    public abstract void method1021(int arg0);

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)V")
    public abstract void method1022(int arg0);

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(III[I)V")
    public abstract void method1023(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "()Ldfa;")
    public abstract class165 method1024();

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)V")
    public abstract void method1025(int arg0);

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "()V")
    public abstract void method1026();

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "([I)V")
    public abstract void method1027(int[] arg0);

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Ldfa;)V")
    public abstract void method1028(class165 arg0);

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(III[I)V")
    public abstract void method1030(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)V")
    public abstract void method1032(int arg0);

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(III)V")
    public abstract void method1033(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "(I)V")
    public abstract void method1035(int arg0);

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)V")
    public abstract void method1036(int arg0);
}
