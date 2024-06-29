import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public abstract class class165 {

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "Lep;")
    public class371 field2260;

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "Lqk;")
    public static class148 field2261 = new class148(17, 11);

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!eha", name = "e", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!eha", name = "f", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(B)Z")
    public abstract boolean method672(byte arg0);

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IBI)V")
    public abstract void method675(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IZLhl;)V")
    public abstract void method671(int arg0, boolean arg1, class396 arg2);

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1023(byte[] arg0, byte arg1) {
        field2264++;
        class26 var2 = new class26(arg0);
        int var3 = var2.method194((byte) 119);
        int var4 = var2.method189(255);
        if (var4 < 0 || class492.field6806 != 0 && class492.field6806 < var4) {
            throw new RuntimeException();
        }
        int var5 = 118 / ((arg1 - 28) / 61);
        if (var3 == 0) {
            byte[] var6 = new byte[var4];
            var2.method149(var6, 0, (byte) -57, var4);
            return var6;
        }
        int var7 = var2.method189(255);
        if (var7 < 0 || class492.field6806 != 0 && class492.field6806 < var7) {
            throw new RuntimeException();
        }
        byte[] var8 = new byte[var7];
        if (var3 == 1) {
            class89.method535(var8, var7, arg0, var4, 9);
        } else {
            class456 var9 = class109.field1550;
            synchronized (class109.field1550) {
                class109.field1550.method2741(var8, var2, (byte) -106);
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(Z)V")
    public static void method1024(boolean arg0) {
        field2261 = null;
        if (!arg0) {
            field2265 = 2;
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V")
    public static final void method1025(int arg0) {
        field2263++;
        for (int var1 = arg0; var1 < class429.field5916.length; var1++) {
            for (int var2 = 0; var2 < class429.field5916[0].length; var2++) {
                for (int var3 = 0; var3 < class429.field5916[0][0].length; var3++) {
                    class429.field5916[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(Lep;)V")
    public class165(class371 arg0) {
        this.field2260 = arg0;
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IZ)V")
    public abstract void method673(int arg0, boolean arg1);

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "(B)V")
    public abstract void method679(byte arg0);

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(ZI)V")
    public abstract void method678(boolean arg0, int arg1);
}
