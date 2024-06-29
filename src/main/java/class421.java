import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class421 {

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "Ld;")
    private class242 field6185 = new class242(64);

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Ld;")
    public class242 field6192 = new class242(30);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "Lum;")
    private class83 field6181;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lum;")
    public class83 field6186;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Z")
    public static boolean field6182 = false;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "F")
    public static float field6184;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2624(byte arg0) {
        for (class491 var1 = (class491) class410.field6066.method295((byte) -18); var1 != null; var1 = (class491) class410.field6066.method296(true)) {
            if (var1.field7181) {
                var1.method2958(true);
            }
        }
        if (arg0 <= 102) {
            method2626((byte) -39);
        }
        field6188++;
        for (class491 var2 = (class491) class351.field5231.method295((byte) 116); var2 != null; var2 = (class491) class351.field5231.method296(true)) {
            if (var2.field7181) {
                var2.method2958(true);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)Lek;", line = 37)
    public final class434 method2625(byte arg0, int arg1) {
        field6193++;
        class242 var3 = this.field6185;
        class434 var4;
        synchronized (this.field6185) {
            var4 = (class434) this.field6185.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field6181;
        byte[] var6;
        synchronized (this.field6181) {
            var6 = this.field6181.method731(0, class271.method1867(arg1, arg0 + 139), class136.method995(-128, arg1));
        }
        class434 var7 = new class434();
        var7.field6461 = arg1;
        var7.field6451 = this;
        if (var6 != null) {
            var7.method2696(new class194(var6), arg0 + 1932);
        }
        class242 var8 = this.field6185;
        synchronized (this.field6185) {
            if (arg0 == 116) {
                this.field6185.method1623((long) arg1, arg0 ^ 0x44A1, var7);
                return var7;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Z", line = 70)
    public static final boolean method2626(byte arg0) {
        field6191++;
        if (arg0 != -121) {
            method2624((byte) 15);
        }
        return class540.field7909 > 0;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V", line = 82)
    public final void method2627(byte arg0) {
        class242 var2 = this.field6185;
        synchronized (this.field6185) {
            this.field6185.method1630(-69);
        }
        field6183++;
        if (arg0 > -122) {
            method2626((byte) 64);
        }
        class242 var3 = this.field6192;
        synchronized (this.field6192) {
            this.field6192.method1630(-109);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V", line = 100)
    public final void method2628(int arg0, int arg1) {
        field6187++;
        class242 var3 = this.field6185;
        synchronized (this.field6185) {
            this.field6185.method1631(arg0, (byte) -19);
        }
        if (arg1 != 1) {
            method2624((byte) 49);
        }
        class242 var4 = this.field6192;
        synchronized (this.field6192) {
            this.field6192.method1631(arg0, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)V", line = 121)
    public final void method2629(int arg0, int arg1) {
        this.field6194 = arg1;
        field6190++;
        class242 var3 = this.field6192;
        synchronized (this.field6192) {
            this.field6192.method1637((byte) 13);
            if (arg0 != -1) {
                this.method2630((byte) 17);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V", line = 141)
    public final void method2630(byte arg0) {
        class242 var2 = this.field6185;
        synchronized (this.field6185) {
            this.field6185.method1637((byte) 13);
        }
        if (arg0 != 45) {
            field6182 = false;
        }
        field6189++;
        class242 var3 = this.field6192;
        synchronized (this.field6192) {
            this.field6192.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lpt;ILum;Lum;)V", line = 167)
    public class421(class308 arg0, int arg1, class83 arg2, class83 arg3) {
        this.field6181 = arg2;
        this.field6186 = arg3;
        int var5 = this.field6181.method754(false) - 1;
        this.field6181.method748(var5, 12408);
    }
}
