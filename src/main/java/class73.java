import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class73 {

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "Lwi;")
    private class330 field1006 = new class330(256);

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "Ll;")
    private class15 field1011;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "Lnq;")
    private class325 field1009;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "Lla;")
    public static class319 field1005 = new class319(90, 8);

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "[[I")
    public static int[][] field1008;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V", line = 3)
    public final void method502(byte arg0) {
        this.field1006.method2140(-106, 5);
        if (arg0 != -120) {
            field1005 = null;
        }
        field1012++;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 14)
    public final void method503(int arg0) {
        field1010++;
        this.field1006.method2127((byte) 121);
        if (arg0 <= 84) {
            this.method505((byte) -125, -52);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V", line = 30)
    public static void method504(boolean arg0) {
        field1005 = null;
        field1008 = null;
        if (arg0) {
            field1005 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI)Lwv;", line = 46)
    public final class25 method505(byte arg0, int arg1) {
        field1003++;
        Object var3 = this.field1006.method2133((long) arg1, (byte) 87);
        if (var3 != null) {
            return (class25) var3;
        } else if (this.field1011.method160((byte) 23, arg1)) {
            class107 var4 = this.field1011.method157((byte) 113, arg1);
            int var5 = var4.field1516 ? 64 : this.field1009.field4889;
            if (arg0 != -117) {
                return null;
            }
            class25 var7;
            if (var4.field1500 && this.field1009.method823()) {
                float[] var6 = this.field1011.method159(var5, 0.7F, arg1, false, var5, (byte) 119);
                var7 = new class25(this.field1009, 3553, 34842, var5, var5, var4.field1504 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field1521) {
                    var8 = this.field1011.method158(arg1, var5, arg0 ^ 0x5E, false, var5, 0.7F);
                } else {
                    var8 = this.field1011.method156(arg1, false, var5, var5, 0.7F, (byte) -106);
                }
                var7 = new class25(this.field1009, 3553, 6408, var5, var5, var4.field1504 != 0, var8, false);
            }
            var7.method229((byte) 77, var4.field1510, var4.field1514);
            this.field1006.method2131(var7, (long) arg1, false);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lnq;Ll;)V", line = 102)
    public class73(class325 arg0, class15 arg1) {
        this.field1011 = arg1;
        this.field1009 = arg0;
    }
}
