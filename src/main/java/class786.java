import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class786 extends class379 {

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public int field10843 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public int field10846 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public int field10850 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public int field10848 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public int field10841 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public int field10845 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
    public int field10852 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
    public int field10847 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "Lke;")
    public class625 field10851;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "Lhj;")
    public static class596 field10853 = new class596(2, 1);

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "Lhj;")
    public static class596 field10854 = new class596(108, 7);

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field10839;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public static int field10840;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public static int field10844;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public static int field10849;

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "J")
    public static long field10855;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "Lqh;")
    public static class75 field10838;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "[[B")
    public static byte[][] field10842;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(Z)V")
    public static void method4350(boolean arg0) {
        field10853 = null;
        field10842 = null;
        field10854 = null;
        field10838 = null;
        if (!arg0) {
            method4352(true);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBI)Z")
    public static final boolean method4351(int arg0, byte arg1, int arg2) {
        field10849++;
        if (arg1 <= 88) {
            method4351(-18, (byte) -55, 38);
        }
        return class597.method3412(arg2, arg0, -4) & class12.method189(-103, arg0, arg2);
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(Z)V")
    public static final void method4352(boolean arg0) {
        field10839++;
        class573 var1 = null;
        try {
            var1 = class675.method3798("2", (byte) 120);
            class403 var2 = new class403(class248.field2915 * 6 + 3);
            var2.method2353(-68, 1);
            var2.method2369(-18090, class248.field2915);
            for (int var3 = 0; var3 < class480.field6716.length; var3++) {
                if (class307.field3801[var3]) {
                    var2.method2369(-18090, var3);
                    var2.method2391(54, class480.field6716[var3]);
                }
            }
            var1.method3323(var2.field5262, var2.field5275, arg0, 0);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3319(126);
            }
        } catch (Exception var4) {
        }
        class86.field1153 = class349.method2069(arg0);
        class485.field6770 = false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BII)Z")
    public final boolean method4353(byte arg0, int arg1, int arg2) {
        field10840++;
        if (arg1 >= this.field10848 && arg1 <= this.field10846 && this.field10841 <= arg2 && arg2 <= this.field10852) {
            return true;
        } else if (arg0 == 33) {
            return this.field10845 <= arg1 && arg1 <= this.field10847 && this.field10850 <= arg2 && arg2 <= this.field10843;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lke;)V")
    public class786(class625 arg0) {
        this.field10851 = arg0;
    }
}
