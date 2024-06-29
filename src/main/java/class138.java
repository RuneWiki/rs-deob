import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class138 {

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "Lpca;")
    private class714 field1997 = new class714(64);

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "Lpca;")
    public class714 field2001 = new class714(60);

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "Lfp;")
    private class323 field1996;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "Lfp;")
    public class323 field1994;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Lqfa;")
    public static class98 field2000 = new class98(92, -2);

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "[I")
    public static int[] field2002 = new int[13];

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "Lqfa;")
    public static class98 field2003 = new class98(28, 16);

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field2004 = 0;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "[C")
    public static char[] field2006 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V")
    public final void method973(int arg0, int arg1) {
        field1993++;
        class714 var3 = this.field1997;
        synchronized (this.field1997) {
            this.field1997.method4016(arg1, (byte) -73);
            if (arg0 < 121) {
                this.method975(24);
            }
        }
        class714 var4 = this.field2001;
        synchronized (this.field2001) {
            this.field2001.method4016(arg1, (byte) -73);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIZ)V")
    public static final void method974(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1999++;
        if (class557.field7812.field6521.method2556(false) == 0) {
            class673.method3679((byte) 113, false);
        } else {
            class210.field2774 = class557.field7812.field6521.method2556(false);
            class759.method4212(true, arg3, 0);
        }
        class440.field6260 = arg4;
        if (arg3 != 0) {
            method976((byte) -5);
        }
        class110.field1343 = arg1;
        class211.field2785 = arg0;
        class678.method3798(arg2);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public final void method975(int arg0) {
        class714 var2 = this.field1997;
        synchronized (this.field1997) {
            this.field1997.method4024(0);
        }
        field1991++;
        if (arg0 != 121) {
            this.method978((byte) 117);
        }
        class714 var3 = this.field2001;
        synchronized (this.field2001) {
            this.field2001.method4024(0);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method976(byte arg0) {
        field2003 = null;
        field2006 = null;
        field2002 = null;
        field2000 = null;
        if (arg0 < 108) {
            method976((byte) -78);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB)Llo;")
    public final class752 method977(int arg0, byte arg1) {
        field1998++;
        class714 var3 = this.field1997;
        class752 var4;
        synchronized (this.field1997) {
            var4 = (class752) this.field1997.method4022((long) arg0, (byte) -63);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -54 % ((arg1 + 7) / 52);
        class323 var6 = this.field1996;
        byte[] var7;
        synchronized (this.field1996) {
            var7 = this.field1996.method2100(class116.method810(-115, arg0), (byte) 112, class184.method1162(arg0, (byte) -128));
        }
        class752 var8 = new class752();
        var8.field10454 = this;
        var8.field10461 = arg0;
        if (var7 != null) {
            var8.method4181(87, new class675(var7));
        }
        class714 var9 = this.field1997;
        synchronized (this.field1997) {
            this.field1997.method4018((byte) 127, var8, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
    public final void method978(byte arg0) {
        field1992++;
        class714 var2 = this.field1997;
        synchronized (this.field1997) {
            if (arg0 != 78) {
                return;
            }
            this.field1997.method4023((byte) -128);
        }
        class714 var3 = this.field2001;
        synchronized (this.field2001) {
            this.field2001.method4023((byte) -31);
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(IB)V")
    public final void method979(int arg0, byte arg1) {
        this.field2005 = arg0;
        if (arg1 <= 102) {
            this.method978((byte) -10);
        }
        field1995++;
        class714 var3 = this.field2001;
        synchronized (this.field2001) {
            this.field2001.method4023((byte) -128);
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lsaa;ILfp;Lfp;)V")
    public class138(class326 arg0, int arg1, class323 arg2, class323 arg3) {
        this.field1996 = arg2;
        this.field1994 = arg3;
        int var5 = this.field1996.method2098((byte) 20) - 1;
        this.field1996.method2084(var5, 0);
    }
}
