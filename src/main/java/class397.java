import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class397 {

    @OriginalMember(owner = "client!qha", name = "h", descriptor = "Laq;")
    private class494 field5479 = new class494(16);

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "Lgga;")
    private class513 field5474;

    @OriginalMember(owner = "client!qha", name = "i", descriptor = "Low;")
    public static class665 field5480 = new class665();

    @OriginalMember(owner = "client!qha", name = "k", descriptor = "F")
    public static float field5482;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!qha", name = "j", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!qha", name = "l", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "Lhia;")
    public static class49 field5473;

    @OriginalMember(owner = "client!qha", name = "g", descriptor = "Lgga;")
    public static class513 field5478;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIILjba;I)Lno;")
    public final class384 method2360(int arg0, int arg1, int arg2, int arg3, class158 arg4, int arg5) {
        field5481++;
        class82[] var7 = null;
        class414 var8 = this.method2362(arg1, arg0);
        if (var8.field5681 != null) {
            var7 = new class82[var8.field5681.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class481 var10 = arg4.method1222(var8.field5681[var9], (byte) -99);
                var7[var9] = new class82(var10.field6616, var10.field6604, var10.field6611, var10.field6607, var10.field6609, var10.field6608, var10.field6612, var10.field6614);
            }
        }
        return new class384(var8.field5682, var7, var8.field5679, arg3, arg5, arg2);
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)V")
    public final void method2361(int arg0, int arg1) {
        field5477++;
        if (arg1 == 29) {
            class494 var3 = this.field5479;
            synchronized (this.field5479) {
                this.field5479.method2888(arg0, 117);
            }
        }
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(II)Laka;")
    private final class414 method2362(int arg0, int arg1) {
        field5483++;
        class494 var3 = this.field5479;
        class414 var4;
        synchronized (this.field5479) {
            var4 = (class414) this.field5479.method2882((long) arg1, (byte) -98);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field5474;
        byte[] var6;
        synchronized (this.field5474) {
            var6 = this.field5474.method3019(arg0, arg1, 60);
        }
        class414 var7 = new class414();
        if (var6 != null) {
            var7.method2435(arg0 - 33, new class431(var6));
        }
        class494 var8 = this.field5479;
        synchronized (this.field5479) {
            this.field5479.method2890(-7307, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(B)V")
    public final void method2363(byte arg0) {
        int var2 = -64 % ((-arg0 - 50) / 49);
        class494 var3 = this.field5479;
        synchronized (this.field5479) {
            this.field5479.method2893((byte) -39);
        }
        field5472++;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(B)V")
    public static void method2364(byte arg0) {
        if (arg0 <= 85) {
            field5482 = -1.0186328F;
        }
        field5473 = null;
        field5480 = null;
        field5478 = null;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z)V")
    public final void method2365(boolean arg0) {
        if (arg0) {
            this.field5479 = null;
        }
        field5475++;
        class494 var2 = this.field5479;
        synchronized (this.field5479) {
            this.field5479.method2881((byte) -17);
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lpl;")
    public static final class242 method2366(Throwable arg0, String arg1) {
        field5476++;
        class242 var2;
        if (arg0 instanceof class242) {
            var2 = (class242) arg0;
            var2.field3472 = var2.field3472 + ' ' + arg1;
        } else {
            var2 = new class242(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Lmca;ILgga;)V")
    public class397(class41 arg0, int arg1, class513 arg2) {
        this.field5474 = arg2;
        this.field5474.method3007(-1, 29);
    }
}
