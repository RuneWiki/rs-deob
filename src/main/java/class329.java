import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class329 {

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "Lwm;")
    private class399 field4989 = new class399(64);

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public int field4991 = 0;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "Lph;")
    private class459 field4986;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public int field4990;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "Lbj;")
    public static class162 field4987 = new class162(21, 3);

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "Lmo;")
    public static class531 field4993 = new class531(9, 7);

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "Lbj;")
    public static class162 field4995 = new class162(41, 3);

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public static int field4997 = 0;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "F")
    public static float field4996;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "[[Lgh;")
    public static class388[][] field4994;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)Lsb;", line = 6)
    public final class193 method2077(int arg0, byte arg1) {
        field4984++;
        class399 var3 = this.field4989;
        class193 var4;
        synchronized (this.field4989) {
            var4 = (class193) this.field4989.method2478(1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field4986;
        byte[] var6;
        synchronized (this.field4986) {
            var6 = this.field4986.method2757(4, arg0, (byte) -126);
        }
        class193 var7 = new class193();
        var7.field3117 = this;
        var7.field3119 = arg0;
        if (var6 != null) {
            var7.method1304(-21420, new class289(var6));
        }
        if (arg1 != 64) {
            this.method2080(17);
        }
        var7.method1306(23020);
        class399 var8 = this.field4989;
        synchronized (this.field4989) {
            this.field4989.method2472(-55, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 40)
    public static void method2078(int arg0) {
        field4987 = null;
        field4995 = null;
        field4993 = null;
        field4994 = null;
        if (arg0 > -34) {
            method2078(-38);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLza;)V", line = 61)
    public static final void method2079(byte arg0, class288 arg1) {
        field4985++;
        if (arg0 >= -86) {
            field4997 = -11;
        }
        if (class192.field3105) {
            class205.method1401((byte) -99, arg1);
        } else {
            class247.method1597(arg1, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V", line = 76)
    public final void method2080(int arg0) {
        field4992++;
        class399 var2 = this.field4989;
        synchronized (this.field4989) {
            this.field4989.method2477(-112);
        }
        if (arg0 != 5166) {
            this.method2082(-27);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)V", line = 89)
    public final void method2081(int arg0, int arg1) {
        class399 var3 = this.field4989;
        synchronized (this.field4989) {
            if (arg1 != 0) {
                method2078(12);
            }
            this.field4989.method2471((byte) 98, arg0);
        }
        field4988++;
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V", line = 102)
    public final void method2082(int arg0) {
        field4983++;
        class399 var2 = this.field4989;
        synchronized (this.field4989) {
            this.field4989.method2475((byte) 67);
        }
        if (arg0 != 64) {
            this.method2077(-69, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lkp;ILph;)V", line = 132)
    public class329(class341 arg0, int arg1, class459 arg2) {
        this.field4986 = arg2;
        this.field4990 = this.field4986.method2763(4, -3);
    }
}
