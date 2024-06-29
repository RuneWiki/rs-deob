import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class426 {

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public int field5487 = 128;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public int field5485 = 128;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field5482;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public int field5489;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public int field5491;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public int field5492;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field5483 = 0;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field5481 = 0;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lha;")
    public static class52 field5484;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lve;B)V")
    public final void method2396(class426 arg0, byte arg1) {
        int var3 = 125 / ((arg1 + 60) / 52);
        this.field5492 = arg0.field5492;
        this.field5489 = arg0.field5489;
        this.field5485 = arg0.field5485;
        this.field5487 = arg0.field5487;
        this.field5482 = arg0.field5482;
        this.field5491 = arg0.field5491;
        field5488++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method2397(int arg0) {
        if (arg0 == 3863) {
            field5484 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
    public static final boolean method2398(int arg0, int arg1, int arg2) {
        field5494++;
        return arg0 > -27 ? true : (class478.method2790((byte) 13, arg2, arg1) | (arg2 & 0x2000) != 0 | class636.method3651(arg1, arg2, -5)) & class638.method3657(arg1, arg2, -14191);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Lve;")
    public final class426 method2399(int arg0) {
        int var2 = -65 % ((arg0 + 31) / 44);
        field5486++;
        return new class426(this.field5482, this.field5485, this.field5487, this.field5491, this.field5492, this.field5489);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
    public static final int method2400(int arg0, int arg1, int arg2, int arg3) {
        field5493++;
        if (class128.field1574 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (arg0 < ~var4 || var5 < 0 || var4 > class106.field1289 - 1 || (class422.field5452 - 1) < var5) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class330.field4304[1][var4][var5] & 0x2) != 0) {
            var6 = arg3 + 1;
        }
        return class128.field1574[var6].method847(arg2, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILqa;II)V")
    public static final void method2401(int arg0, class206 arg1, int arg2, int arg3) {
        class512.field7236 = arg1;
        field5490++;
        class69.field666 = new class310[arg2][arg0];
        if (class225.field2764 != null) {
            class450.field6234 = class184.method1007(class225.field2764[5], (byte) 17, class225.field2764[2], class225.field2764[3], class225.field2764[0], class225.field2764[1], class225.field2764[4]);
        }
        class290.field3764 = new class310();
        if (arg3 != 26879) {
            method2401(72, null, -97, -90);
        }
        class543.method3177((byte) 35);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V")
    public class426(int arg0) {
        this.field5482 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIII)V")
    private class426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5487 = arg2;
        this.field5489 = arg5;
        this.field5485 = arg1;
        this.field5491 = arg3;
        this.field5492 = arg4;
        this.field5482 = arg0;
    }
}
