import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class143 {

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "B")
    private byte field2073;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public int field2070;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field2065 = 0;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "Ler;")
    public static class157 field2068 = new class157(8);

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I")
    public final int method952(int arg0) {
        if (arg0 == -6542) {
            field2067++;
            return this.field2073 & 0x7;
        } else {
            return -91;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BZLas;Z)V")
    public static final void method953(byte arg0, boolean arg1, class407 arg2, boolean arg3) {
        field2069++;
        int var4 = arg2.field6155;
        int var5 = (int) arg2.field6799;
        arg2.method2785((byte) -120);
        if (arg3) {
            class129.method818(-14241, var4);
        }
        class153.method1000(var4, (byte) -79);
        class499 var6 = class211.method1457(var5, 6687);
        if (var6 != null) {
            class338.method2189((byte) 116, var6);
        }
        class450.method2716(26);
        if (!arg1 && class329.field5062 != -1) {
            class336.method2169(class329.field5062, 22590, 1);
        }
        class304 var7 = new class304(class27.field449);
        if (arg0 > -24) {
            method954(true);
        }
        for (class407 var8 = (class407) var7.method1951(140); var8 != null; var8 = (class407) var7.method1949((byte) -93)) {
            if (!var8.method2788(-125)) {
                var8 = (class407) var7.method1951(140);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field6156 == 3) {
                int var9 = (int) var8.field6799;
                if (var9 >>> 16 == var4) {
                    method953((byte) -57, arg1, var8, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V")
    public static void method954(boolean arg0) {
        if (!arg0) {
            method954(false);
        }
        field2068 = null;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)I")
    public final int method955(int arg0) {
        if (arg0 == 1) {
            field2063++;
            return (this.field2073 & 0x8) == 8 ? 1 : 0;
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILns;II)Lro;")
    public static final class192 method956(int arg0, class438 arg1, int arg2, int arg3) {
        field2072++;
        if (arg3 != 22953) {
            method953((byte) -71, true, null, true);
        }
        byte[] var4 = arg1.method2650(arg2, arg3 - 23063, arg0);
        return var4 == null ? null : new class192(var4);
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
    public class143() {
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Ltl;)V")
    public class143(class91 arg0) {
        this.field2073 = arg0.method619((byte) -23);
        this.field2070 = arg0.method631(10494);
        this.field2062 = arg0.method626((byte) 100);
        this.field2064 = arg0.method626((byte) 100);
        this.field2066 = arg0.method626((byte) 100);
        this.field2071 = arg0.method626((byte) 100);
    }
}
