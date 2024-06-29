import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class787 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Laf;")
    private class39 field10798 = new class39(64);

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Laf;")
    public class39 field10810 = new class39(50);

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Laf;")
    public class39 field10811 = new class39(5);

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lae;")
    public class283 field10801;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
    public boolean field10805;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lae;")
    private class283 field10803;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Ljk;")
    public class788 field10799;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field10797;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field10800;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field10802;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field10804;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field10806;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field10807;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field10809;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public int field10812;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "Lak;")
    public static class762 field10808;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V", line = 4)
    public final void method4315(int arg0, int arg1) {
        this.field10812 = arg0;
        field10797++;
        class39 var3 = this.field10810;
        synchronized (this.field10810) {
            this.field10810.method314(-2);
        }
        class39 var4 = this.field10811;
        synchronized (this.field10811) {
            this.field10811.method314(-2);
            int var5 = 24 / ((arg1 - 38) / 43);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 26)
    public final void method4316(int arg0) {
        class39 var2 = this.field10798;
        synchronized (this.field10798) {
            this.field10798.method319(-123);
        }
        field10809++;
        class39 var3 = this.field10810;
        synchronized (this.field10810) {
            this.field10810.method319(-55);
        }
        class39 var4 = this.field10811;
        synchronized (this.field10811) {
            this.field10811.method319(-41);
            if (arg0 != 5) {
                this.method4320(54, 32);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)V", line = 46)
    public final void method4317(byte arg0, boolean arg1) {
        field10804++;
        if (arg0 > -117) {
            this.method4315(-60, 67);
        }
        if (arg1 != this.field10805) {
            this.field10805 = arg1;
            this.method4319((byte) -12);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)Lem;", line = 63)
    public final class636 method4318(int arg0, int arg1) {
        field10800++;
        class39 var3 = this.field10798;
        class636 var4;
        synchronized (this.field10798) {
            var4 = (class636) this.field10798.method312(arg1 + 197, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field10803;
        byte[] var6;
        synchronized (this.field10803) {
            var6 = this.field10803.method1849(class172.method1101((byte) -89, arg0), (byte) 120, class204.method1308(arg0, 103));
        }
        class636 var7 = new class636();
        var7.field8906 = this;
        var7.field8931 = arg0;
        if (var6 != null) {
            var7.method3648(new class511(var6), (byte) 91);
        }
        var7.method3652((byte) 127);
        if (arg1 != -197) {
            this.field10805 = false;
        }
        class39 var8 = this.field10798;
        synchronized (this.field10798) {
            this.field10798.method305(var7, (long) arg0, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 96)
    public final void method4319(byte arg0) {
        field10806++;
        class39 var2 = this.field10798;
        synchronized (this.field10798) {
            int var3 = 6 % ((50 - arg0) / 57);
            this.field10798.method314(-2);
        }
        class39 var4 = this.field10810;
        synchronized (this.field10810) {
            this.field10810.method314(-2);
        }
        class39 var5 = this.field10811;
        synchronized (this.field10811) {
            this.field10811.method314(-2);
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)V", line = 118)
    public final void method4320(int arg0, int arg1) {
        class39 var3 = this.field10798;
        synchronized (this.field10798) {
            this.field10798.method308(-1, arg0);
        }
        field10807++;
        class39 var4 = this.field10810;
        synchronized (this.field10810) {
            this.field10810.method308(-1, arg0);
        }
        class39 var5 = this.field10811;
        synchronized (this.field10811) {
            this.field10811.method308(arg1 ^ 0x50E, arg0);
            if (arg1 != -1295) {
                this.field10799 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V", line = 137)
    public static void method4321(byte arg0) {
        int var1 = 50 / ((2 - arg0) / 34);
        field10808 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 146)
    public final void method4322(int arg0) {
        class39 var2 = this.field10810;
        synchronized (this.field10810) {
            this.field10810.method314(-2);
        }
        field10802++;
        class39 var3 = this.field10811;
        synchronized (this.field10811) {
            this.field10811.method314(-2);
        }
        if (arg0 != 5) {
            this.field10812 = 50;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljk;IZLae;Lae;)V", line = 176)
    public class787(class788 arg0, int arg1, boolean arg2, class283 arg3, class283 arg4) {
        this.field10801 = arg4;
        this.field10805 = arg2;
        this.field10803 = arg3;
        this.field10799 = arg0;
        if (this.field10803 != null) {
            int var6 = this.field10803.method1866((byte) 80) - 1;
            this.field10803.method1867(var6, (byte) 49);
        }
    }
}
