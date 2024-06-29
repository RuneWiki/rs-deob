import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class173 {

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "Lad;")
    private class19 field1942 = new class19(64);

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "Ltf;")
    private class701 field1939;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "[J")
    public static long[] field1937 = new long[32];

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V", line = 8)
    public final void method1054(byte arg0) {
        if (arg0 != -57) {
            this.method1054((byte) -63);
        }
        class19 var2 = this.field1942;
        synchronized (this.field1942) {
            this.field1942.method88(77);
        }
        field1943++;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V", line = 23)
    public static final void method1055(int arg0) {
        class423.field5980 = true;
        field1938++;
        if (arg0 != 1678) {
            method1058(-61);
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)Lna;", line = 37)
    public final class349 method1056(int arg0, int arg1) {
        field1940++;
        class19 var3 = this.field1942;
        class349 var4;
        synchronized (this.field1942) {
            var4 = (class349) this.field1942.method78(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field1939;
        byte[] var6;
        synchronized (this.field1939) {
            var6 = this.field1939.method3854((byte) 87, arg1, arg0);
        }
        class349 var7 = new class349();
        if (var6 != null) {
            var7.method2074(new class115(var6), (byte) 47);
        }
        var7.method2071(arg1 ^ 0x455D);
        class19 var8 = this.field1942;
        synchronized (this.field1942) {
            this.field1942.method92(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(II)V", line = 71)
    public final void method1057(int arg0, int arg1) {
        if (arg0 != 32) {
            this.field1939 = null;
        }
        field1941++;
        class19 var3 = this.field1942;
        synchronized (this.field1942) {
            this.field1942.method83((byte) -2, arg1);
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lqh;ILtf;)V", line = 96)
    public class173(class320 arg0, int arg1, class701 arg2) {
        this.field1939 = arg2;
        if (this.field1939 != null) {
            this.field1939.method3883(35, 0);
        }
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V", line = 87)
    public static void method1058(int arg0) {
        if (arg0 <= -80) {
            field1937 = null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)V", line = 116)
    public final void method1059(int arg0) {
        int var2 = -100 % ((-arg0 - 28) / 36);
        field1944++;
        class19 var3 = this.field1942;
        synchronized (this.field1942) {
            this.field1942.method80((byte) 75);
        }
    }
}
