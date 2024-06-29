import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class561 {

    @OriginalMember(owner = "client!oha", name = "k", descriptor = "Laq;")
    private class494 field7774 = new class494(256);

    @OriginalMember(owner = "client!oha", name = "g", descriptor = "Llea;")
    private class573 field7770;

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "Ld;")
    private class103 field7768;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "Lin;")
    public static class380 field7764 = new class380(7, 16);

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!oha", name = "h", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!oha", name = "i", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!oha", name = "j", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!oha", name = "l", descriptor = "I")
    public static int field7775;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3263(boolean arg0) {
        if (!arg0) {
            field7764 = null;
        }
        field7764 = null;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V", line = 18)
    public final void method3264(int arg0) {
        field7771++;
        this.field7774.method2881((byte) -51);
        if (arg0 != 5) {
            this.field7770 = null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "([I[IZ)V", line = 29)
    public static final void method3265(int[] arg0, int[] arg1, boolean arg2) {
        field7765++;
        if (arg0 == null || arg1 == null) {
            class617.field8748 = null;
            class564.field7872 = null;
            class81.field1202 = null;
            return;
        }
        class81.field1202 = arg0;
        class617.field8748 = new int[arg0.length];
        class564.field7872 = new byte[arg0.length][][];
        if (arg2) {
            for (int var3 = 0; var3 < class81.field1202.length; var3++) {
                class564.field7872[var3] = new byte[arg1[var3]][];
            }
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(JJ)J", line = 60)
    public static long method3266(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)V", line = 70)
    public final void method3267(int arg0) {
        this.field7774.method2888(arg0, 126);
        field7769++;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V", line = 81)
    public static final void method3268(int arg0, int arg1, int arg2) {
        field7767++;
        class371 var3 = class490.method2867((byte) -123, 1, (long) arg1);
        var3.method2212(-76);
        if (arg2 > -109) {
            field7773 = -73;
        }
        var3.field5233 = arg0;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IIIII)V", line = 98)
    public static final void method3269(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 6408) {
            return;
        }
        field7775++;
        if (arg1 < arg4) {
            for (int var5 = arg1; var5 < arg4; var5++) {
                class74.field1144[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg4; var6 < arg1; var6++) {
                class74.field1144[var6][arg3] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Llea;Ld;)V", line = 137)
    public class561(class573 arg0, class103 arg1) {
        this.field7770 = arg0;
        this.field7768 = arg1;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IB)Lwi;", line = 146)
    public final class504 method3270(int arg0, byte arg1) {
        field7766++;
        Object var3 = this.field7774.method2882((long) arg0, (byte) -27);
        if (var3 != null) {
            return (class504) var3;
        } else if (this.field7768.method846(arg0, true)) {
            int var4 = 102 / ((arg1 - 51) / 57);
            class719 var5 = this.field7768.method847(arg0, -118);
            int var6 = var5.field10044 ? 64 : this.field7770.field8118;
            class504 var8;
            if (var5.field10049 && this.field7770.method99()) {
                float[] var7 = this.field7768.method848(var6, (byte) -84, false, var6, 0.7F, arg0);
                var8 = new class504(this.field7770, 3553, 34842, var6, var6, var5.field10034 != 0, var7, 6408);
            } else {
                int[] var9;
                if (var5.field10042 != 2 && class706.method3945(var5.field10031, -117)) {
                    var9 = this.field7768.method844(true, (byte) 122, 0.7F, var6, arg0, var6);
                } else {
                    var9 = this.field7768.method845(0.7F, arg0, false, (byte) 52, var6, var6);
                }
                var8 = new class504(this.field7770, 3553, 6408, var6, var6, var5.field10034 != 0, var9, 0, 0, false);
            }
            var8.method2952(var5.field10032, var5.field10048, false);
            this.field7774.method2890(-7307, (long) arg0, var8);
            return var8;
        } else {
            return null;
        }
    }
}
