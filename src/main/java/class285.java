import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class285 extends class23 {

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    private int field5003 = 4096;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    private int field5007 = 0;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "Llc;")
    public static class143 field5000 = class66.method374("violet:", -1);

    @OriginalMember(owner = "client!al", name = "R", descriptor = "Z")
    public static boolean field5009 = true;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "Llc;")
    private static class143 field5006 = class66.method374("Connected to update server", -1);

    @OriginalMember(owner = "client!al", name = "N", descriptor = "Llc;")
    public static class143 field5005 = field5006;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "Lli;")
    public static class191 field5001 = new class191();

    @OriginalMember(owner = "client!al", name = "S", descriptor = "Lmg;")
    public static class134 field5010 = new class134(5000);

    @OriginalMember(owner = "client!al", name = "T", descriptor = "Llc;")
    private static class143 field5011 = class66.method374("Hidden", -1);

    @OriginalMember(owner = "client!al", name = "U", descriptor = "Llc;")
    public static class143 field5012 = field5011;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(II)I")
    public static final int method1870(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static void method1871(boolean arg0) {
        field5006 = null;
        field5010 = null;
        field5000 = null;
        field5012 = null;
        field5001 = null;
        if (!arg0) {
            field5011 = null;
            field5005 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field5002;
        if (arg0 > -13) {
            method1872((byte) -46, 13L);
        }
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int[] var4 = this.method155(arg1, (byte) 83, 0);
            for (int var5 = 0; var5 < class72.field1359; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field5007 && ~this.field5003 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BJ)V")
    public static final void method1872(byte arg0, long arg1) {
        ++field5004;
        if (~arg1 != -1L) {
            if (class184.field3338 >= 100) {
                class170.method1119(class21.field342, 4096, class141.field2463, 0);
            } else {
                class143 var3 = class64.method364((byte) 97, arg1).method878(-28102);
                if (arg0 <= 116) {
                    method1870(-28, 64);
                }
                for (int var4 = 0; ~class184.field3338 < ~var4; ++var4) {
                    if (class255.field4585[var4] == arg1) {
                        class170.method1119(class21.field342, 4096, class25.method179(0, new class143[] { var3, class208.field3829 }), 0);
                        return;
                    }
                }
                for (int var5 = 0; class25.field421 > var5; ++var5) {
                    if (class13.field251[var5] == arg1) {
                        class170.method1119(class21.field342, 4096, class25.method179(0, new class143[] { class22.field356, var3, class13.field246 }), 0);
                        return;
                    }
                }
                if (var3.method876((byte) -122, class229.field4195.field518)) {
                    class170.method1119(class21.field342, 4096, class17.field302, 0);
                } else {
                    ++class35.field605;
                    class255.field4585[class184.field3338] = arg1;
                    class153.field2769[class184.field3338++] = class64.method364((byte) 97, arg1);
                    class129.field2294 = class13.field249;
                    field5010.method799(103, 195);
                    field5010.method1243(arg1, 77);
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
    public class285() {
        super(1, true);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field5003 = arg0.method1275(128);
            }
        } else {
            this.field5007 = arg0.method1275(128);
        }
        if (arg2) {
            ++field5008;
        }
    }
}
