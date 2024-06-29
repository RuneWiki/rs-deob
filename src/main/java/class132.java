import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class132 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lhn;")
    private class509 field1744 = new class509(64);

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lfo;")
    private class361 field1743;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1742 = 0;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "[I")
    public static int[] field1746;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "[I")
    public static int[] field1749;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V", line = 9)
    public final void method800(int arg0, byte arg1) {
        class509 var3 = this.field1744;
        synchronized (this.field1744) {
            this.field1744.method3036(arg0, (byte) -33);
        }
        field1752++;
        if (arg1 != -92) {
            this.method800(26, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 22)
    public final void method801(int arg0) {
        class509 var2 = this.field1744;
        synchronized (this.field1744) {
            this.field1744.method3045(arg0 - 7518);
        }
        if (arg0 != 7566) {
            this.method800(-57, (byte) 47);
        }
        field1748++;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IB)Lqo;", line = 41)
    public final class19 method802(int arg0, byte arg1) {
        field1750++;
        class509 var3 = this.field1744;
        class19 var4;
        synchronized (this.field1744) {
            var4 = (class19) this.field1744.method3032(arg1 ^ 0xE65, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class361 var5 = this.field1743;
        byte[] var6;
        synchronized (this.field1743) {
            var6 = this.field1743.method2130(16, arg0, arg1 ^ 0xFFFFFFA2);
        }
        class19 var7 = new class19();
        if (var6 != null) {
            var7.method107(new class396(var6), (byte) -124);
        }
        class509 var8 = this.field1744;
        synchronized (this.field1744) {
            this.field1744.method3046((long) arg0, var7, arg1 ^ 0x61);
            if (arg1 != 96) {
                method803(-77);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 72)
    public static void method803(int arg0) {
        field1749 = null;
        field1746 = null;
        if (arg0 != 16) {
            field1742 = 21;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V", line = 85)
    public final void method804(boolean arg0) {
        field1751++;
        class509 var2 = this.field1744;
        synchronized (this.field1744) {
            this.field1744.method3034((byte) 83);
        }
        if (arg0) {
            this.method804(true);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ld;ILfo;)V", line = 105)
    public class132(class104 arg0, int arg1, class361 arg2) {
        this.field1743 = arg2;
        if (this.field1743 == null) {
            this.field1747 = 0;
        } else {
            this.field1747 = this.field1743.method2136(-83, 16);
        }
    }
}
