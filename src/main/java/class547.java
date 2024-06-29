import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class class547 extends class375 {

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public int field7688;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "Llca;")
    public static class597 field7690 = new class597(1);

    @OriginalMember(owner = "client!vs", name = "y", descriptor = "Lnea;")
    public static class664 field7691 = new class664(16, -2);

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "F")
    public static float field7689;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "Lwo;")
    public static class691 field7692;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z")
    public static final boolean method3093(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method3094((byte) 76);
        }
        field7686++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "(B)V")
    public static void method3094(byte arg0) {
        field7691 = null;
        if (arg0 == -45) {
            field7690 = null;
            field7692 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(I)V")
    public class547(int arg0) {
        this.field7688 = arg0;
    }

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1161(byte arg0);

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZIZIZ)I")
    public static final int method3095(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field7687++;
        class138 var5 = class642.method3576(arg3, (byte) -67, arg2);
        if (var5 == null) {
            return 0;
        }
        if (arg0) {
            method3094((byte) 121);
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field2009.length; var7++) {
            if (var5.field2009[var7] >= 0 && var5.field2009[var7] < class41.field682.field5251) {
                class186 var8 = class41.field682.method2228(var5.field2009[var7], 0);
                int var9 = var8.method1246(arg1, class329.field4869.method3552(arg1, -47).field3986, (byte) 20);
                if (arg4) {
                    var6 += var5.field2008[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "(B)Z")
    public abstract boolean method1160(byte arg0);
}
