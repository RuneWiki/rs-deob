import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class65 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "J")
    public long field785;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Ljaa;")
    private class576 field788;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lvf;")
    public static class141 field789 = new class141(11, 0, 1, 2);

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[I")
    public static int[] field790 = new int[200];

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!sh", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field788.method3118(this.field785, -29131);
        field786++;
        super.finalize();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method520(boolean arg0) {
        class295.field3763 = -1;
        class536.field6752 = -1;
        field787++;
        if (arg0) {
            method520(true);
        }
        class129.field1566 = -1;
        class666.field9038 = 0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BILji;)Ljava/lang/String;", line = 29)
    public static final String method521(byte arg0, int arg1, class572 arg2) {
        field791++;
        try {
            int var3 = 17 / ((67 - arg0) / 43);
            int var4 = arg2.method3033((byte) 91);
            if (var4 > arg1) {
                var4 = arg1;
            }
            byte[] var5 = new byte[var4];
            arg2.field7313 += class2.field12.method3752(0, var5, arg2.field7318, var4, (byte) 127, arg2.field7313);
            return class115.method785(var4, 0, var5, (byte) 101);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 62)
    public static void method522(int arg0) {
        field790 = null;
        if (arg0 == 206) {
            field789 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Ljaa;J[Lhr;)V", line = 81)
    public class65(class576 arg0, long arg1, class491[] arg2) {
        this.field785 = arg1;
        this.field788 = arg0;
    }
}
