import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class37 {

    @OriginalMember(owner = "client!it", name = "c", descriptor = "Ltq;")
    private class536 field406 = new class536(64);

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Lwm;")
    private class30 field408;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "[F")
    public static float[] field405 = new float[2];

    @OriginalMember(owner = "client!it", name = "l", descriptor = "[[I")
    public static int[][] field415 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!it", name = "f", descriptor = "Luw;")
    public static class208 field409 = new class208(35, 4);

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method220(boolean arg0, int arg1) {
        field404++;
        class536 var3 = this.field406;
        synchronized (this.field406) {
            this.field406.method2919(0);
            this.field406 = new class536(arg1);
            if (!arg0) {
                this.field406 = null;
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BILuaa;I)V", line = 17)
    public static final void method221(byte arg0, int arg1, class391 arg2, int arg3) {
        class571.field7225 = arg3;
        if (arg0 > -99) {
            field417 = -42;
        }
        class207.field2861 = arg1;
        class264.field3521 = arg2;
        field410++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIII)V", line = 34)
    public static final void method222(int arg0, int arg1, int arg2, int arg3) {
        field416++;
        if (arg1 != 18185) {
            field409 = null;
        }
        class614 var4 = class497.method2759(11, 5977, (long) arg2);
        var4.method3277(639);
        var4.field7746 = arg0;
        var4.field7742 = arg3;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V", line = 54)
    public final void method223(byte arg0) {
        field414++;
        if (arg0 != 49) {
            method222(-4, 22, -108, -125);
        }
        class536 var2 = this.field406;
        synchronized (this.field406) {
            this.field406.method2919(0);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)V", line = 74)
    public static void method224(boolean arg0) {
        if (arg0) {
            field415 = null;
        }
        field415 = null;
        field405 = null;
        field409 = null;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(B)V", line = 87)
    public final void method225(byte arg0) {
        field413++;
        if (arg0 >= -123) {
            this.field406 = null;
        }
        class536 var2 = this.field406;
        synchronized (this.field406) {
            this.field406.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)Lo;", line = 102)
    public final class186 method226(int arg0, byte arg1) {
        field407++;
        class536 var3 = this.field406;
        class186 var4;
        synchronized (this.field406) {
            var4 = (class186) this.field406.method2931((long) arg0, (byte) -73);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -45 / ((arg1 - 41) / 60);
        class30 var6 = this.field408;
        byte[] var7;
        synchronized (this.field408) {
            var7 = this.field408.method139(class505.method2800(arg0, true), (byte) -94, class520.method2871(1023, arg0));
        }
        class186 var8 = new class186();
        if (var7 != null) {
            var8.method1308(32, new class234(var7));
        }
        class536 var9 = this.field406;
        synchronized (this.field406) {
            this.field406.method2918((long) arg0, var8, 125);
            return var8;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B[B)V", line = 134)
    public static final void method227(byte arg0, byte[] arg1) {
        field411++;
        int var2 = 76 / ((arg0 - 12) / 41);
        class234 var3 = new class234(arg1);
        boolean var4 = false;
        while (true) {
            while (true) {
                int var5 = var3.method1509(true);
                if (var5 == 0) {
                    if (var4) {
                        return;
                    }
                    if (class468.field6087 == null) {
                        class468.field6087 = new int[4];
                        class181.field2476 = 4;
                        class614.field7751 = new int[4];
                    }
                    for (int var6 = 0; var6 < class468.field6087.length; var6++) {
                        class468.field6087[var6] = 0;
                        class614.field7751[var6] = var6 * 20;
                    }
                    return;
                }
                if (var5 == 1) {
                    if (class468.field6087 == null) {
                        class181.field2476 = 4;
                        class614.field7751 = new int[4];
                        class468.field6087 = new int[4];
                    }
                    for (int var7 = 0; var7 < class468.field6087.length; var7++) {
                        class468.field6087[var7] = var3.method1542(27067);
                        class614.field7751[var7] = var3.method1542(27067);
                    }
                    var4 = true;
                } else if (var5 == 2) {
                    class20.field190 = var3.method1553((byte) 63);
                } else if (var5 == 3) {
                    class181.field2476 = var3.method1509(true);
                    class468.field6087 = new int[class181.field2476];
                    class614.field7751 = new int[class181.field2476];
                }
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lega;ILwm;)V", line = 228)
    public class37(class473 arg0, int arg1, class30 arg2) {
        this.field408 = arg2;
        if (this.field408 != null) {
            int var4 = this.field408.method143((byte) 106) - 1;
            this.field408.method138(0, var4);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V", line = 216)
    public final void method228(byte arg0, int arg1) {
        field412++;
        class536 var3 = this.field406;
        synchronized (this.field406) {
            this.field406.method2928(true, arg1);
        }
        if (arg0 != 111) {
            field415 = null;
        }
    }
}
