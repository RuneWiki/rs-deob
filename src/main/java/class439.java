import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class439 {

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Lmo;")
    private class336 field6222 = new class336(64);

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Lmo;")
    public class336 field6228 = new class336(2);

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Lnl;")
    private class435 field6221;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Lnl;")
    public class435 field6227;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Lmo;")
    public static class336 field6224 = new class336(4);

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "Z")
    public static boolean field6230 = false;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Lch;")
    public static class151 field6231 = new class151("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "Lch;")
    public static class151 field6232 = new class151("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "[I")
    public static int[] field6229;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 5)
    public static void method2671(int arg0) {
        field6224 = null;
        field6231 = null;
        field6229 = null;
        field6232 = null;
        int var1 = 43 / ((-arg0 - 7) / 48);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V", line = 18)
    public final void method2672(int arg0, int arg1) {
        field6223++;
        class336 var3 = this.field6222;
        synchronized (this.field6222) {
            this.field6222.method2120((byte) 108, arg1);
        }
        if (arg0 != 2) {
            this.method2673(-13);
        }
        class336 var4 = this.field6228;
        synchronized (this.field6228) {
            this.field6228.method2120((byte) -99, arg1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V", line = 34)
    public final void method2673(int arg0) {
        if (arg0 < 48) {
            field6232 = null;
        }
        class336 var2 = this.field6222;
        synchronized (this.field6222) {
            this.field6222.method2109(-1);
        }
        field6220++;
        class336 var3 = this.field6228;
        synchronized (this.field6228) {
            this.field6228.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)Lus;", line = 58)
    public final class212 method2674(int arg0, int arg1) {
        field6226++;
        class336 var3 = this.field6222;
        class212 var4;
        synchronized (this.field6222) {
            var4 = (class212) this.field6222.method2113(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6221.method2633(33, arg1, 116);
        class212 var6 = new class212();
        var6.field3084 = this;
        if (var5 != null) {
            var6.method1441(-127, new class161(var5));
        }
        class336 var7 = this.field6222;
        synchronized (this.field6222) {
            if (arg0 == -27765) {
                this.field6222.method2116((long) arg1, (byte) -122, var6);
                return var6;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Llo;ILnl;Lnl;)V", line = 111)
    public class439(class280 arg0, int arg1, class435 arg2, class435 arg3) {
        this.field6221 = arg2;
        this.field6227 = arg3;
        this.field6221.method2638(1, 33);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V", line = 93)
    public final void method2675(int arg0) {
        field6225++;
        class336 var2 = this.field6222;
        synchronized (this.field6222) {
            this.field6222.method2119(0);
        }
        class336 var3 = this.field6228;
        synchronized (this.field6228) {
            int var4 = -80 % ((64 - arg0) / 43);
            this.field6228.method2119(0);
        }
    }
}
