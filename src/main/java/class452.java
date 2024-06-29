import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class452 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lmq;")
    private class472 field6345 = new class472(64);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Ljn;")
    private class668 field6347;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Ljk;")
    public static class585 field6351 = new class585(37, 8);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public final void method2675(int arg0) {
        field6346++;
        class472 var2 = this.field6345;
        synchronized (this.field6345) {
            this.field6345.method2776(false);
            if (arg0 < 12) {
                method2680((byte) 114, null, null);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)Lio;")
    public static final class404 method2676(int arg0, boolean arg1) {
        if (!arg1) {
            field6351 = null;
        }
        field6350++;
        return class659.field9373 && arg0 >= class28.field615 && class31.field635 >= arg0 ? class487.field6815[arg0 - class28.field615] : null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method2677(byte arg0) {
        field6351 = null;
        if (arg0 <= 107) {
            method2680((byte) -17, null, null);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public final void method2678(int arg0, int arg1) {
        field6348++;
        class472 var3 = this.field6345;
        synchronized (this.field6345) {
            if (arg1 != -1) {
                this.method2678(14, -51);
            }
            this.field6345.method2777(arg0, 62);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)V")
    public final void method2679(byte arg0, int arg1) {
        class472 var3 = this.field6345;
        synchronized (this.field6345) {
            this.field6345.method2776(false);
            if (arg0 > -122) {
                return;
            }
            this.field6345 = new class472(arg1);
        }
        field6349++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B[I[I)V")
    public static final void method2680(byte arg0, int[] arg1, int[] arg2) {
        field6353++;
        if (arg1 == null || arg2 == null) {
            class378.field5076 = null;
            class564.field8152 = null;
            class74.field1106 = null;
            return;
        }
        class564.field8152 = arg1;
        class378.field5076 = new int[arg1.length];
        class74.field1106 = new byte[arg1.length][][];
        if (arg0 == -15) {
            for (int var3 = 0; var3 < class564.field8152.length; var3++) {
                class74.field1106[var3] = new byte[arg2[var3]][];
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Ler;ILjn;)V")
    public class452(class90 arg0, int arg1, class668 arg2) {
        this.field6347 = arg2;
        if (this.field6347 != null) {
            int var4 = this.field6347.method3779(5) - 1;
            this.field6347.method3805(var4, false);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Laga;")
    public final class617 method2681(int arg0, int arg1) {
        field6344++;
        class472 var3 = this.field6345;
        class617 var4;
        synchronized (this.field6345) {
            var4 = (class617) this.field6345.method2766(-126, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field6347;
        byte[] var6;
        synchronized (this.field6347) {
            var6 = this.field6347.method3800(class443.method2627(arg1, 28818), class295.method1754(arg1, 4), (byte) -92);
        }
        if (arg0 != 27020) {
            return null;
        }
        class617 var7 = new class617();
        if (var6 != null) {
            var7.method3533(new class389(var6), arg0 - 27022);
        }
        class472 var8 = this.field6345;
        synchronized (this.field6345) {
            this.field6345.method2772(var7, true, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public final void method2682(int arg0) {
        field6352++;
        class472 var2 = this.field6345;
        synchronized (this.field6345) {
            if (arg0 != 64) {
                this.method2678(-86, -75);
            }
            this.field6345.method2778((byte) 108);
        }
    }
}
