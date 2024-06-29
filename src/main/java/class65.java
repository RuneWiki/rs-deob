import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class65 {

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "Lpr;")
    public static class407 field688 = new class407(101, 12);

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "Lpr;")
    public static class407 field690 = new class407(90, 4);

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "Lkfa;")
    public static class549 field692 = new class549(6, 15);

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "Lkh;")
    public static class15 field691;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method428(int arg0, int arg1, int arg2, int arg3) {
        field684++;
        class334.field4314.method2554(arg1, 255);
        int var4 = -72 % ((-arg2 - 86) / 36);
        class334.field4314.method2521(-1531903640, arg0);
        class334.field4314.method2521(-1531903640, arg3);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILoa;ZB)Lhq;", line = 21)
    public static final class145 method429(int arg0, class635 arg1, boolean arg2, byte arg3) {
        field686++;
        if (arg0 == -1) {
            return null;
        }
        if (class289.field3719 != null) {
            for (int var4 = 0; var4 < class289.field3719.length; var4++) {
                if (class289.field3719[var4] == arg0) {
                    return class431.field5697[var4];
                }
            }
        }
        class145 var5 = (class145) class13.field114.method3690((byte) -33, (long) arg0);
        if (var5 != null) {
            if (arg2 && var5.field1623 == null) {
                class645 var6 = class103.method624(class455.field6328, arg0, true);
                if (var6 == null) {
                    return null;
                }
                var5.field1623 = var6;
            }
            return var5;
        }
        class563[] var7 = class563.method3184(class359.field4705, arg0);
        if (arg3 <= 8) {
            method430((byte) 111);
        }
        if (var7 == null) {
            return null;
        }
        class645 var8 = class103.method624(class455.field6328, arg0, true);
        if (var8 == null) {
            return null;
        }
        class145 var9;
        if (arg2) {
            var9 = new class145(arg1.method349(var8, var7, true), var8);
        } else {
            var9 = new class145(arg1.method349(var8, var7, true));
        }
        class13.field114.method3683(var9, (byte) 6, (long) arg0);
        return var9;
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(II)V", line = 94)
    public class65(int arg0, int arg1) {
        this.field689 = arg0;
    }

    @OriginalMember(owner = "client!naa", name = "toString", descriptor = "()Ljava/lang/String;", line = 104)
    public final String toString() {
        field685++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V", line = 120)
    public static void method430(byte arg0) {
        field692 = null;
        field691 = null;
        field690 = null;
        field688 = null;
        if (arg0 != -117) {
            field691 = null;
        }
    }
}
