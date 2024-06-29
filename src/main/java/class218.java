import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class218 {

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "Laj;")
    private class287 field3312 = new class287(16);

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "Lom;")
    private class344 field3310;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "Lsb;")
    public static class266 field3308 = new class266(23, 3);

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
    public static int field3314 = -1;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "I")
    public static int field3316 = 104;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)Lpa;")
    private final class341 method1515(int arg0, byte arg1) {
        field3313++;
        class287 var3 = this.field3312;
        class341 var4;
        synchronized (this.field3312) {
            var4 = (class341) this.field3312.method1900((long) arg0, -109);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field3310;
        byte[] var6;
        synchronized (this.field3310) {
            var6 = this.field3310.method2216(29, arg0, true);
        }
        class341 var7 = new class341();
        if (var6 != null) {
            var7.method2189(new class61(var6), -1);
        }
        class287 var8 = this.field3312;
        synchronized (this.field3312) {
            if (arg1 != 126) {
                this.field3310 = null;
            }
            this.field3312.method1904(var7, (long) arg0, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIIILvfa;)Lof;")
    public final class577 method1516(int arg0, int arg1, int arg2, int arg3, int arg4, class625 arg5) {
        field3315++;
        class412[] var7 = null;
        int var8 = -75 % (arg3 / 63);
        class341 var9 = this.method1515(arg4, (byte) 126);
        if (var9.field5065 != null) {
            var7 = new class412[var9.field5065.length];
            for (int var10 = 0; var10 < var7.length; var10++) {
                class447 var11 = arg5.method3563(30, var9.field5065[var10]);
                var7[var10] = new class412(var11.field6437, var11.field6431, var11.field6440, var11.field6427, var11.field6428, var11.field6430, var11.field6436, var11.field6438);
            }
        }
        return new class577(var9.field5072, var7, var9.field5066, arg2, arg1, arg0);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V")
    public final void method1517(byte arg0) {
        if (arg0 != -26) {
            this.field3312 = null;
        }
        class287 var2 = this.field3312;
        synchronized (this.field3312) {
            this.field3312.method1912(-2552);
        }
        field3311++;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)V")
    public final void method1518(int arg0, int arg1) {
        class287 var3 = this.field3312;
        synchronized (this.field3312) {
            this.field3312.method1908(arg1, (byte) -11);
        }
        int var4 = 120 / ((arg0 + 70) / 55);
        field3307++;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V")
    public final void method1519(int arg0) {
        class287 var2 = this.field3312;
        synchronized (this.field3312) {
            this.field3312.method1913(true);
        }
        field3309++;
        if (arg0 != -1) {
            this.method1515(10, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)V")
    public static void method1520(byte arg0) {
        field3308 = null;
        if (arg0 < 96) {
            field3314 = -74;
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class218(class398 arg0, int arg1, class344 arg2) {
        this.field3310 = arg2;
        this.field3310.method2236(29, 0);
    }
}
