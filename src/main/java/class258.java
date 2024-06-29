import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class258 {

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    private int field3857 = 0;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "Lfa;")
    private class371 field3851;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "[I")
    public static int[] field3849 = new int[14];

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field3855 = -1;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "Lcc;")
    public static class320 field3853;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Lfi;")
    private class35 field3858;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 4)
    public static void method1707(int arg0) {
        field3849 = null;
        if (arg0 != 420487964) {
            field3855 = 11;
        }
        field3853 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V", line = 18)
    public static final void method1708(int arg0, int arg1, int arg2) {
        if (arg2 != -11351) {
            field3853 = null;
        }
        field3852++;
        class371 var3 = new class371(16);
        for (class31 var4 = (class31) class491.field6897.method2296((byte) 39); var4 != null; var4 = (class31) class491.field6897.method2297(true)) {
            var4.method283(2);
            int var5 = (int) (var4.field436 >> 28);
            int var6 = (int) (var4.field436 >> 14 & 0x3FFFL) - arg1;
            int var7 = (int) (var4.field436 & 0x3FFFL) - arg0;
            if (var7 >= 0 && var6 >= 0 && var7 < class379.field5642 && class456.field6477 > var6) {
                var3.method2307((long) (var7 | var5 << 28 | var6 << 14), var4, (byte) -118);
            }
        }
        class491.field6897 = var3;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Lfi;", line = 54)
    public final class35 method1709(boolean arg0) {
        field3850++;
        if (this.field3857 > 0 && this.field3851.field5581[this.field3857 - 1] != this.field3858) {
            class35 var2 = this.field3858;
            this.field3858 = var2.field434;
            return var2;
        }
        while (this.field3857 < this.field3851.field5595) {
            class35 var3 = this.field3851.field5581[this.field3857++].field434;
            if (this.field3851.field5581[this.field3857 - 1] != var3) {
                this.field3858 = var3.field434;
                return var3;
            }
        }
        return arg0 ? null : null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)Lfi;", line = 87)
    public final class35 method1710(byte arg0) {
        if (arg0 == -70) {
            field3856++;
            this.field3857 = 0;
            return this.method1709(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZII)I", line = 105)
    public static final int method1711(int arg0, boolean arg1, int arg2, int arg3) {
        field3854++;
        class341 var4 = class271.method1763(arg1, arg3, false);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            if (arg0 != 24677) {
                return -90;
            }
            for (int var6 = 0; var6 < var4.field5110.length; var6++) {
                if (var4.field5108[var6] == arg2) {
                    var5 += var4.field5110[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lfa;)V", line = 145)
    public class258(class371 arg0) {
        this.field3851 = arg0;
    }
}
