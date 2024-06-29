import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class329 {

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "Lkh;")
    private class13 field4946 = new class13(64);

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public int field4951 = 0;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "Lul;")
    private class406 field4944;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public int field4947;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4937 = new String[100];

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "[Lab;")
    public static class476[] field4948 = new class476[6];

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "[[I")
    public static int[][] field4950 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "[I")
    public static int[] field4945;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "[[[J")
    public static long[][][] field4942;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method2085(byte arg0, int arg1) {
        field4941++;
        if (arg0 != -122) {
            field4937 = null;
        }
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF4B1F) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V")
    public static void method2086(boolean arg0) {
        field4950 = null;
        field4942 = null;
        if (!arg0) {
            field4937 = null;
        }
        field4945 = null;
        field4937 = null;
        field4948 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
    public final void method2087(byte arg0) {
        class13 var2 = this.field4946;
        synchronized (this.field4946) {
            int var3 = 123 / ((arg0 - 11) / 54);
            this.field4946.method88(102);
        }
        field4940++;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public final void method2088(int arg0) {
        field4949++;
        class13 var2 = this.field4946;
        synchronized (this.field4946) {
            if (arg0 != 2) {
                field4945 = null;
            }
            this.field4946.method93((byte) 109);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)Lst;")
    public final class300 method2089(int arg0, byte arg1) {
        if (arg1 < 22) {
            return null;
        }
        field4938++;
        class13 var3 = this.field4946;
        class300 var4;
        synchronized (this.field4946) {
            var4 = (class300) this.field4946.method87((long) arg0, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field4944;
        byte[] var6;
        synchronized (this.field4944) {
            var6 = this.field4944.method2536(4, 0, arg0);
        }
        class300 var7 = new class300();
        var7.field4567 = arg0;
        var7.field4553 = this;
        if (var6 != null) {
            var7.method1939(-1, new class217(var6));
        }
        var7.method1937(11115);
        class13 var8 = this.field4946;
        synchronized (this.field4946) {
            this.field4946.method84((long) arg0, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
    public static final void method2090(int arg0) {
        field4939++;
        if (!class245.field3859) {
            return;
        }
        class114 var1 = class181.method1210(class358.field5318, -2, class371.field5524);
        if (var1 != null && var1.field1683 != null) {
            class405 var2 = new class405();
            var2.field6004 = var1;
            var2.field6008 = var1.field1683;
            class192.method1356(var2);
        }
        class245.field3859 = false;
        class287.field4348 = -1;
        class71.field1028 = arg0;
        if (var1 != null) {
            class262.method1747(20556, var1);
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IB)V")
    public final void method2091(int arg0, byte arg1) {
        field4943++;
        class13 var3 = this.field4946;
        synchronized (this.field4946) {
            this.field4946.method91(35, arg0);
            if (arg1 <= 97) {
                this.method2088(-34);
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lee;ILul;)V")
    public class329(class480 arg0, int arg1, class406 arg2) {
        this.field4944 = arg2;
        this.field4947 = this.field4944.method2551(4, -26070);
    }
}
