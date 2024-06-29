import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class139 {

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "Lfga;")
    private class569 field1803 = new class569();

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "[I")
    public static int[] field1805 = new int[2048];

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!fca", name = "i", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!fca", name = "j", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!fca", name = "k", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!fca", name = "l", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!fca", name = "n", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!fca", name = "m", descriptor = "Lfga;")
    private class569 field1812;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Z")
    public final boolean method796(int arg0) {
        if (arg0 == 17494) {
            field1809++;
            return this.field1803.field7966 == this.field1803;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLqj;)V")
    public static final void method797(boolean arg0, class548 arg1) {
        field1801++;
        if (class569.field7969 == null) {
            class693 var2 = new class693();
            byte[] var3 = var2.method3910(0, 128, 128, 16);
            class569.field7969 = class57.method357(-137, var3, false);
        }
        if (class188.field2360 == null) {
            class376 var4 = new class376();
            byte[] var5 = var4.method2042(12743, 16, 128, 128);
            class188.field2360 = class57.method357(-137, var5, false);
        }
        if (arg0) {
            method806(-72);
        }
        class619 var6 = arg1.field7476;
        if (var6.method3401((byte) -126) && class373.field4704 == null) {
            byte[] var7 = class383.method2067(0, 8, 16.0F, 16, 0.5F, 0.6F, 4.0F, 128, 128, new class475(419684), 4.0F);
            class373.field4704 = class57.method357(-137, var7, false);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BD)V")
    public static final void method798(byte arg0, double arg1) {
        if (class672.field9454 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class434.field5434[var3] = var4 <= 255 ? var4 : 255;
            }
            class672.field9454 = arg1;
        }
        field1804++;
        if (arg0 != 86) {
            field1805 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V")
    public final void method799(int arg0) {
        field1800++;
        if (arg0 != 128) {
            this.field1803 = null;
        }
        while (true) {
            class569 var2 = this.field1803.field7966;
            if (this.field1803 == var2) {
                this.field1812 = null;
                return;
            }
            var2.method3146(2);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)Lfga;")
    public final class569 method800(byte arg0) {
        field1813++;
        if (arg0 != -106) {
            method805(3, 74, null, true, -8, null);
        }
        class569 var2 = this.field1812;
        if (this.field1803 == var2) {
            this.field1812 = null;
            return null;
        } else {
            this.field1812 = var2.field7966;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lfga;I)V")
    public final void method801(class569 arg0, int arg1) {
        field1810++;
        if (arg0.field7971 != null) {
            arg0.method3146(2);
        }
        arg0.field7966 = this.field1803;
        arg0.field7971 = this.field1803.field7971;
        if (arg1 <= 39) {
            this.method802((byte) 22);
        }
        arg0.field7971.field7966 = arg0;
        arg0.field7966.field7971 = arg0;
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)Lfga;")
    public final class569 method802(byte arg0) {
        field1811++;
        if (arg0 <= 69) {
            field1805 = null;
        }
        class569 var2 = this.field1803.field7966;
        if (this.field1803 == var2) {
            this.field1812 = null;
            return null;
        } else {
            this.field1812 = var2.field7966;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)Lfga;")
    public final class569 method803(int arg0) {
        if (arg0 < 120) {
            return null;
        }
        field1807++;
        class569 var2 = this.field1803.field7971;
        if (this.field1803 == var2) {
            this.field1812 = null;
            return null;
        } else {
            this.field1812 = var2.field7971;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "(I)I")
    public final int method804(int arg0) {
        field1802++;
        int var2 = arg0;
        class569 var3 = this.field1803.field7966;
        while (this.field1803 != var3) {
            var3 = var3.field7966;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILqj;ZI[I)Lar;")
    public static final class4 method805(int arg0, int arg1, class548 arg2, boolean arg3, int arg4, int[] arg5) {
        if (arg0 != 26871) {
            method797(false, null);
        }
        field1808++;
        if (!arg2.field7586 && (!class4.method36(arg1, (byte) 98) || !class4.method36(arg4, (byte) 98))) {
            return arg2.field7540 ? new class4(arg2, 34037, arg1, arg4, arg3, arg5) : new class4(arg2, arg1, arg4, class391.method2101(arg1, 128), class391.method2101(arg4, 128), arg5);
        } else {
            return new class4(arg2, 3553, arg1, arg4, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "(I)V")
    public static void method806(int arg0) {
        if (arg0 == -13197) {
            field1805 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V")
    public class139() {
        this.field1803.field7966 = this.field1803;
        this.field1803.field7971 = this.field1803;
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)Lfga;")
    public final class569 method807(boolean arg0) {
        if (!arg0) {
            this.field1803 = null;
        }
        field1806++;
        class569 var2 = this.field1803.field7966;
        if (this.field1803 == var2) {
            return null;
        } else {
            var2.method3146(2);
            return var2;
        }
    }
}
