import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class139 {

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Z")
    public boolean field1980 = false;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public int field1977;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public int field1978;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lb;")
    public static class183 field1976;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lqj;")
    public static class296 field1972;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z")
    public final boolean method953(int arg0) {
        if (arg0 < 12) {
            this.method954((class371) null, 109, 64, 96);
        }
        field1979++;
        return class293.field4049.method1898(this.field1978, 127);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Leb;III)V")
    private final void method954(class371 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.method953(82);
        }
        if (arg1 == 1) {
            this.field1978 = arg0.method2403((byte) 99);
        } else if (arg1 == 2) {
            this.field1977 = arg0.method2425(-110);
        } else if (arg1 == 3) {
            this.field1980 = true;
        } else if (arg1 == 4) {
            this.field1978 = -1;
        }
        field1974++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILaa;IZ)Llf;")
    public final class130 method955(int arg0, class281 arg1, int arg2, boolean arg3) {
        field1973++;
        long var5 = (long) ((arg3 ? 262144 : 0) | this.field1978 | arg2 << 16 | arg1.field3847 << 19);
        class130 var7 = (class130) class299.field4141.method1246((byte) -42, var5);
        if (var7 != null) {
            return var7;
        } else if (class293.field4049.method1898(this.field1978, 127)) {
            class18 var8 = class18.method119(class293.field4049, this.field1978, arg0);
            if (var8 != null) {
                var8.field248 = var8.field244 = var8.field241 = var8.field245 = 0;
                if (arg3) {
                    var8.method116();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method114();
                }
            }
            class130 var10 = arg1.method1807(var8, true);
            if (var10 != null) {
                class299.field4141.method1247(var5, (byte) -99, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Leb;II)V")
    public final void method956(class371 arg0, int arg1, int arg2) {
        field1981++;
        if (arg2 != -5) {
            this.field1978 = -6;
        }
        while (true) {
            int var4 = arg0.method2429(0);
            if (var4 == 0) {
                return;
            }
            this.method954(arg0, var4, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method957(byte arg0) {
        field1976 = null;
        field1972 = null;
        if (arg0 <= 15) {
            method957((byte) -21);
        }
    }
}
