import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class339 {

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    public int field4918;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "S")
    public short field4925;

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "S")
    public short field4921;

    @OriginalMember(owner = "client!mga", name = "m", descriptor = "I")
    public int field4929;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "S")
    public short field4927;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "B")
    public byte field4922;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public int field4917;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "Z")
    public boolean field4920;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public int field4924;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ZLjava/util/Random;I)I")
    public static final int method2095(boolean arg0, Random arg1, int arg2) {
        if (!arg0) {
            return 103;
        }
        field4919++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class346.method2145(-1, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class178.method1210(var4, false, arg2);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
    public static final void method2096(int arg0) {
        if (arg0 == 0) {
            field4926++;
            class168.method1170(75);
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B[Lf;)V")
    public static final void method2097(byte arg0, class256[] arg1) {
        class66.field1053 = arg1.length;
        field4928++;
        if (arg0 != -124) {
            return;
        }
        class224.field2975 = new int[class66.field1053 + 10];
        class386.field5772 = new class256[class66.field1053 + 10];
        class667.method3744(arg1, 0, class386.field5772, 0, class66.field1053);
        for (int var2 = 0; var2 < class66.field1053; var2++) {
            class224.field2975[var2] = class386.field5772[var2].method43();
        }
        for (int var3 = class66.field1053; var3 < class386.field5772.length; var3++) {
            class224.field2975[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4918 = arg2;
        this.field4923 = arg0;
        this.field4925 = (short) arg5;
        this.field4921 = (short) arg6;
        this.field4929 = arg1;
        this.field4927 = (short) arg4;
        this.field4922 = (byte) arg8;
        this.field4917 = arg11;
        this.field4920 = arg10;
        this.field4924 = arg3;
    }
}
