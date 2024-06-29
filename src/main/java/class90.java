import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class90 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Ljp;")
    private class236 field1369 = new class236(16);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lpc;")
    private class473 field1367;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Liu;IIBII)Luh;")
    public final class112 method652(class406 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1373++;
        if (arg3 != -69) {
            return null;
        }
        class190[] var7 = null;
        class167 var8 = this.method655(arg2, arg3 + 98);
        if (var8.field2419 != null) {
            var7 = new class190[var8.field2419.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class163 var10 = arg0.method2359(var8.field2419[var9], 30);
                var7[var9] = new class190(var10.field2393, var10.field2394, var10.field2382, var10.field2392, var10.field2388, var10.field2386, var10.field2391, var10.field2384);
            }
        }
        return new class112(var8.field2416, var7, var8.field2418, arg5, arg4, arg1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public final void method653(int arg0) {
        class236 var2 = this.field1369;
        synchronized (this.field1369) {
            if (arg0 != -24061) {
                this.method653(19);
            }
            this.field1369.method1458((byte) 107);
        }
        field1371++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public final void method654(int arg0, int arg1) {
        class236 var3 = this.field1369;
        synchronized (this.field1369) {
            this.field1369.method1461(-5, arg1);
        }
        if (arg0 == 16) {
            field1372++;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)Lse;")
    private final class167 method655(int arg0, int arg1) {
        field1368++;
        class236 var3 = this.field1369;
        class167 var4;
        synchronized (this.field1369) {
            var4 = (class167) this.field1369.method1456((long) arg0, arg1 + 80);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1367.method2708(arg1, arg0, (byte) 54);
        class167 var6 = new class167();
        if (var5 != null) {
            var6.method1118(new class379(var5), arg1 - 359);
        }
        class236 var7 = this.field1369;
        synchronized (this.field1369) {
            this.field1369.method1462(var6, (long) arg0, -99);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public final void method656(int arg0) {
        if (arg0 <= 24) {
            this.method652(null, 30, 59, (byte) -126, 69, -127);
        }
        class236 var2 = this.field1369;
        synchronized (this.field1369) {
            this.field1369.method1459(19088);
        }
        field1370++;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lrb;ILpc;)V")
    public class90(class234 arg0, int arg1, class473 arg2) {
        this.field1367 = arg2;
        this.field1367.method2710(29, (byte) -111);
    }
}
