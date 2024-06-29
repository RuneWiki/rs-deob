import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class601 {

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Lmga;")
    private class666 field7985 = new class666(64);

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public int field7986 = 0;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lbi;")
    private class449 field7982;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public int field7976;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[I")
    public static int[] field7980 = new int[3];

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "[[Lgba;")
    public static class625[][] field7977;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static final void method3312(byte arg0) {
        class115.field1980 = null;
        class270.field3760 = null;
        class391.field5159 = null;
        if (arg0 != 53) {
            method3318(true);
        }
        class226.field3189 = null;
        class683.field9617 = null;
        class672.field9513 = null;
        class55.field756 = null;
        class188.field2788 = null;
        class218.field3104 = null;
        class628.field8474 = null;
        class450.field6177 = null;
        class548.field7313 = null;
        field7983++;
        class284.field4022 = null;
        class179.field2737 = null;
        class379.field5083 = null;
        class618.field8205 = null;
        class700.field9851 = null;
        class153.field2419 = null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public final void method3313(byte arg0) {
        class666 var2 = this.field7985;
        synchronized (this.field7985) {
            this.field7985.method3739(0);
            if (arg0 <= 20) {
                field7980 = null;
            }
        }
        field7978++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public final void method3314(boolean arg0) {
        if (arg0) {
            this.method3317(-97, true);
        }
        class666 var2 = this.field7985;
        synchronized (this.field7985) {
            this.field7985.method3748(6);
        }
        field7984++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method3315(int arg0) {
        if (arg0 >= -32) {
            method3318(false);
        }
        field7977 = null;
        field7980 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    public final void method3316(int arg0, int arg1) {
        class666 var3 = this.field7985;
        synchronized (this.field7985) {
            this.field7985.method3740((byte) 60, arg1);
            if (arg0 != 4) {
                method3318(true);
            }
        }
        field7981++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)Lkb;")
    public final class647 method3317(int arg0, boolean arg1) {
        field7979++;
        class666 var3 = this.field7985;
        class647 var4;
        synchronized (this.field7985) {
            var4 = (class647) this.field7985.method3750((long) arg0, arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field7982;
        byte[] var6;
        synchronized (this.field7982) {
            var6 = this.field7982.method2537(false, 4, arg0);
        }
        class647 var7 = new class647();
        var7.field8672 = arg0;
        var7.field8680 = this;
        if (var6 != null) {
            var7.method3544(new class335(var6), -7);
        }
        var7.method3547(11534);
        class666 var8 = this.field7985;
        synchronized (this.field7985) {
            this.field7985.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)[Lcp;")
    public static final class679[] method3318(boolean arg0) {
        field7975++;
        if (!arg0) {
            field7980 = null;
        }
        return new class679[] { class591.field7814, class274.field3804, class345.field4737 };
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lpca;ILbi;)V")
    public class601(class671 arg0, int arg1, class449 arg2) {
        this.field7982 = arg2;
        this.field7976 = this.field7982.method2527(0, 4);
    }
}
