import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class43 extends class151 {

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Z")
    public boolean field746;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "[Ldi;")
    public class43[] field772;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field752 = 0;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "[I")
    public static int[] field757 = new int[100];

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    public static int field761 = 0;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public static int field754 = 20;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "Lmb;")
    public static class132 field763 = class166.method1092("<col=00ff80>", 118);

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public static int field762 = 0;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "Lmb;")
    public static class132 field771 = class166.method1092("Schrifts-=tze geladen)3", 126);

    @OriginalMember(owner = "client!di", name = "L", descriptor = "Lmb;")
    private static class132 field765 = class166.method1092("Allocating memory", 115);

    @OriginalMember(owner = "client!di", name = "P", descriptor = "Lmb;")
    public static class132 field769 = class166.method1092("Abbrechen", 112);

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
    public static int field770 = 0;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "Lmb;")
    public static class132 field748 = field765;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "Lpi;")
    public class172 field768;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "Lub;")
    public class216 field764;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILpb;I)Z")
    public static final boolean method293(int arg0, class165 arg1, int arg2) {
        field760++;
        byte[] var3 = arg1.method1072(arg0, 1);
        if (arg2 != -20993) {
            method296(false);
        }
        if (var3 == null) {
            return false;
        } else {
            class100.method622(var3, true);
            return true;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBLkd;)V")
    public void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 != -73) {
            this.method295(109);
        }
        field747++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BJ)Lmb;")
    public static final class132 method294(byte arg0, long arg1) {
        if (arg0 == 88) {
            field751++;
            return class12.method61(10, arg1, false, -118);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[[I")
    public int[][] method203(int arg0, int arg1) {
        if (arg0 != -1893) {
            method293(-10, null, 51);
        }
        field749++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
    public void method295(int arg0) {
        int var2 = -52 % ((8 - arg0) / 38);
        if (this.field746) {
            this.field768.method1125(109);
            this.field768 = null;
        } else {
            this.field764.method1352((byte) 87);
            this.field764 = null;
        }
        field756++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public static void method296(boolean arg0) {
        field769 = null;
        field765 = null;
        field771 = null;
        if (!arg0) {
            field763 = null;
        }
        field757 = null;
        field748 = null;
        field763 = null;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)I")
    public int method297(int arg0) {
        if (arg0 == -1) {
            field753++;
            return -1;
        } else {
            return -93;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)V")
    public static final void method298(boolean arg0) {
        if (!arg0) {
            return;
        }
        for (int var1 = -1; var1 < class160.field2906; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class33.field527[var1];
            }
            class159 var6 = class68.field1120[var5];
            if (var6 != null && var6.field729 > 0) {
                var6.field729--;
                if (var6.field729 == 0) {
                    var6.field668 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class131.field2423; var2++) {
            int var3 = class226.field4098[var2];
            class65 var4 = class11.field145[var3];
            if (var4 != null && var4.field729 > 0) {
                var4.field729--;
                if (var4.field729 == 0) {
                    var4.field668 = null;
                }
            }
        }
        field742++;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)[I")
    public int[] method64(int arg0, int arg1) {
        if (arg1 == 0) {
            field759++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)I")
    public int method299(int arg0) {
        field745++;
        return arg0 > -36 ? 82 : -1;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)[I")
    public final int[] method300(int arg0, int arg1, int arg2) {
        field758++;
        int var4 = -50 % ((arg0 + 1) / 52);
        return this.field772[arg1].field746 ? this.field772[arg1].method64(arg2, 0) : this.field772[arg1].method203(-1893, arg2)[0];
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)[[I")
    public final int[][] method301(int arg0, byte arg1, int arg2) {
        field750++;
        int var4 = -115 / ((arg1 + 12) / 44);
        if (this.field772[arg2].field746) {
            int[] var5 = this.field772[arg2].method64(arg0, 0);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field772[arg2].method203(-1893, arg0);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILpb;)V")
    public static final void method302(int arg0, class165 arg1) {
        field767++;
        class104.field1957 = arg1;
        if (arg0 != 0) {
            field748 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        int var4 = this.field744 == arg2 ? arg0 : this.field744;
        if (this.field746) {
            this.field768 = new class172(var4, arg0, arg1);
        } else {
            this.field764 = new class216(var4, arg0, arg1);
        }
        field755++;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(IZ)V")
    public class43(int arg0, boolean arg1) {
        this.field746 = arg1;
        this.field772 = new class43[arg0];
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V")
    public void method234(int arg0) {
        if (arg0 <= 21) {
            field769 = null;
        }
        field743++;
    }
}
