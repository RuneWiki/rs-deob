import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class186 {

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "Ljr;")
    private class112 field2795 = new class112(64);

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "Lin;")
    private class91 field2792;

    @OriginalMember(owner = "client!qga", name = "j", descriptor = "Lad;")
    public static class426 field2801 = new class426(9, 2);

    @OriginalMember(owner = "client!qga", name = "l", descriptor = "[I")
    public static int[] field2803 = new int[2];

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
    public final void method1350(byte arg0) {
        class112 var2 = this.field2795;
        synchronized (this.field2795) {
            this.field2795.method999(0);
            if (arg0 >= -20) {
                method1353((byte) -33);
            }
        }
        field2802++;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZZ)V")
    public static final void method1351(int arg0, boolean arg1, boolean arg2) {
        field2800++;
        class6 var3 = class284.method1863((byte) 42, arg0, arg1);
        if (var3 != null && arg2) {
            for (int var4 = 0; var4 < var3.field44.length; var4++) {
                var3.field44[var4] = -1;
                var3.field45[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)V")
    public static final void method1352(boolean arg0) {
        if (arg0) {
            class678.method3811((byte) -6);
            field2799++;
            class241.field3529 = false;
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)V")
    public static void method1353(byte arg0) {
        int var1 = 92 / ((-arg0 - 3) / 60);
        field2803 = null;
        field2801 = null;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)Lcq;")
    public final class467 method1354(int arg0, int arg1) {
        field2798++;
        class112 var3 = this.field2795;
        class467 var4;
        synchronized (this.field2795) {
            var4 = (class467) this.field2795.method992((long) arg1, 76);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field2792;
        byte[] var6;
        synchronized (this.field2792) {
            var6 = this.field2792.method863(-1860, 35, arg1);
        }
        class467 var7 = new class467();
        if (var6 != null) {
            var7.method2748(-125, new class215(var6));
        }
        if (arg0 != -12637) {
            this.field2795 = null;
        }
        var7.method2745((byte) 127);
        class112 var8 = this.field2795;
        synchronized (this.field2795) {
            this.field2795.method991(var7, (long) arg1, (byte) -99);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)V")
    public final void method1355(int arg0, int arg1) {
        class112 var3 = this.field2795;
        synchronized (this.field2795) {
            if (arg1 != -20721) {
                this.field2792 = null;
            }
            this.field2795.method987(arg1 + 20723, arg0);
        }
        field2797++;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
    public final void method1356(int arg0) {
        class112 var2 = this.field2795;
        synchronized (this.field2795) {
            if (arg0 != -27995) {
                this.method1355(-42, 23);
            }
            this.field2795.method996(-85);
        }
        field2796++;
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lsj;ILin;)V")
    public class186(class460 arg0, int arg1, class91 arg2) {
        this.field2792 = arg2;
        if (this.field2792 != null) {
            this.field2792.method860(0, 35);
        }
    }
}
