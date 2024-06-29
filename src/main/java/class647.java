import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class647 {

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "Lom;")
    private class642 field9212;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "J")
    public long field9211;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field9210 = -1;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lpe;Z)V", line = 5)
    public static final void method3653(class109 arg0, boolean arg1) {
        field9209++;
        if (arg0.field1616 == null && arg0.field1663 == null) {
            return;
        }
        boolean var2 = arg1;
        for (int var3 = 0; var3 < arg0.field1616.length; var3++) {
            int var4 = -1;
            if (arg0.field1616 != null) {
                var4 = arg0.field1616[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var10;
                int var11;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var7 = var4 & 0xFFFFFFF;
                    int var8 = var7 >> 14;
                    int var9 = var7 & 0x3FFF;
                    var10 = arg0.field9477 - ((var8 - class265.field4123) * 512) - 256;
                    var11 = arg0.field9475 - (var9 - class723.field10155) * 512 - 256;
                } else if ((var4 & 0x8000) == 0) {
                    class53 var12 = (class53) class332.field4881.method3512(true, (long) var4);
                    if (var12 == null) {
                        arg0.method898(0, -1, var3);
                        continue;
                    }
                    class461 var13 = var12.field847;
                    var10 = arg0.field9477 - var13.field9477;
                    var11 = arg0.field9475 - var13.field9475;
                } else {
                    int var14 = var4 & 0x7FFF;
                    class573 var15 = class279.field4271[var14];
                    if (var15 == null) {
                        arg0.method898(0, -1, var3);
                        continue;
                    }
                    var11 = arg0.field9475 - var15.field9475;
                    var10 = arg0.field9477 - var15.field9477;
                }
                if (var10 != 0 || var11 != 0) {
                    arg0.method898(0, (int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF, var3);
                }
            } else if (!arg0.method898(0, -1, var3)) {
                var2 = false;
            }
        }
        if (var2) {
            arg0.field1616 = null;
            arg0.field1663 = null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "finalize", descriptor = "()V", line = 107)
    protected final void finalize() throws Throwable {
        this.field9212.method3626(this.field9211, 27693);
        field9208++;
        super.finalize();
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lom;J[Lkea;)V", line = 121)
    public class647(class642 arg0, long arg1, class74[] arg2) {
        this.field9212 = arg0;
        this.field9211 = arg1;
    }
}
