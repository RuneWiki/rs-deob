import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public abstract class class54 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Lk;")
    public static class365 field728 = new class365(1);

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field729 = 0;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lnp;B)V")
    public abstract void method103(class313 arg0, byte arg1);

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(ILnp;)Lql;")
    public abstract class477 method120(int arg0, class313 arg1);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIILnp;)Z")
    public abstract boolean method113(int arg0, int arg1, int arg2, class313 arg3);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BIZIZ)Lb;")
    public static final class201 method340(byte arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field730++;
        if (arg0 >= -117) {
            method340((byte) 114, 39, false, 41, true);
        }
        class420 var5 = null;
        if (class225.field3402 != null) {
            var5 = new class420(arg3, class225.field3402, class244.field3636[arg3], 1000000);
        }
        class491.field6927[arg3] = class421.field5880.method1181(33, class153.field2259, var5, arg3);
        if (arg4) {
            class491.field6927[arg3].method2810((byte) 61);
        }
        return new class201(class491.field6927[arg3], arg2, arg1);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public abstract void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
    public abstract void method246(int arg0);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V")
    public static void method341(boolean arg0) {
        if (!arg0) {
            field728 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)Z")
    public abstract boolean method249(int arg0);

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILvg;)V")
    public static final void method342(int arg0, int arg1, int arg2, int arg3, class37 arg4) {
        class88 var5 = class257.method1605(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field490 = (arg1 << class216.field3242) + class248.field3674;
        arg4.field485 = arg3;
        arg4.field477 = (arg2 << class216.field3242) + class248.field3674;
        for (class93 var7 = var5.field1068; var7 != null; var7 = var7.field1178) {
            if (var7.field1177.field4316) {
                int var8 = var7.field1177.method323(0);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field485 += var6;
            arg4.field489 = true;
        }
        var5.field1086 = arg4;
    }
}
