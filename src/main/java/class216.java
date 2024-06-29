import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class216 {

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "Ldc;")
    private class5 field3037 = new class5(64);

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "Lhe;")
    private class239 field3039;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "Liu;")
    public static class390 field3036 = new class390(18, 12);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "[Ljf;")
    public static class137[] field3033;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)Lta;")
    public final class135 method1327(int arg0, int arg1) {
        field3032++;
        if (arg0 <= 112) {
            method1333(-51, -110, 111, true, false);
        }
        class5 var3 = this.field3037;
        class135 var4;
        synchronized (this.field3037) {
            var4 = (class135) this.field3037.method40(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3039.method1470(4, arg1, 31);
        class135 var6 = new class135();
        if (var5 != null) {
            var6.method843(87, new class156(var5));
        }
        class5 var7 = this.field3037;
        synchronized (this.field3037) {
            this.field3037.method36(-20960, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIILbn;II)V")
    public static final void method1328(int arg0, int arg1, int arg2, int arg3, class294 arg4, int arg5, int arg6) {
        class335.method2024(arg3, arg4.field2956, arg4.field2966, arg0, arg4.field2959, arg5, 1, arg1, arg2, arg6);
        field3038++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static void method1329(int arg0) {
        field3033 = null;
        if (arg0 == -29278) {
            field3036 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
    public final void method1330(boolean arg0) {
        class5 var2 = this.field3037;
        synchronized (this.field3037) {
            this.field3037.method38((byte) -66);
        }
        if (arg0) {
            field3031++;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Leq;IIIILhn;)V")
    public static final void method1331(class134 arg0, int arg1, int arg2, int arg3, int arg4, class486 arg5) {
        field3040++;
        class203 var6 = class281.field4023.method1264(arg5.field7069, (byte) -127);
        if (var6.field2817 == -1) {
            return;
        }
        int var7;
        if (arg5.field7066) {
            int var8 = arg5.field7047 + arg4;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class307 var9 = var6.method1250(arg0, arg3 ^ arg3, var7, arg5.field7050);
        if (var9 == null) {
            return;
        }
        int var10 = arg5.field7036;
        int var11 = arg5.field7096;
        if ((var7 & 0x1) == 1) {
            var10 = arg5.field7096;
            var11 = arg5.field7036;
        }
        int var12 = var9.method87();
        int var13 = var9.method94();
        if (var6.field2821) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field2818 == 0) {
            var9.method1844(arg1, arg2 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method86(arg1, arg2 + 4 - (var11 * 4), var12, var13, 0, var6.field2818 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1332(byte arg0, String arg1) {
        if (arg0 != 107) {
            field3033 = null;
        }
        field3029++;
        return class95.method582(arg1, true, 10, 115);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIZZ)Lhe;")
    public static final class239 method1333(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg1 != 2852) {
            method1329(-9);
        }
        field3030++;
        class334 var5 = null;
        if (class147.field1913 != null) {
            var5 = new class334(arg2, class147.field1913, class447.field6525[arg2], 1000000);
        }
        class375.field5606[arg2] = class138.field1802.method2547(var5, class294.field4204, arg2, -32078);
        if (arg4) {
            class375.field5606[arg2].method1414(104);
        }
        return new class239(class375.field5606[arg2], arg3, arg0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BI)V")
    public final void method1334(byte arg0, int arg1) {
        field3041++;
        class5 var3 = this.field3037;
        synchronized (this.field3037) {
            this.field3037.method39(false, arg1);
            int var4 = -44 % ((-arg0 - 76) / 48);
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
    public final void method1335(int arg0) {
        if (arg0 != 19871) {
            this.method1335(-13);
        }
        class5 var2 = this.field3037;
        synchronized (this.field3037) {
            this.field3037.method35((byte) -1);
        }
        field3034++;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lci;ILhe;)V")
    public class216(class298 arg0, int arg1, class239 arg2) {
        this.field3039 = arg2;
        this.field3039.method1473(4309, 31);
    }
}
