import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class172 {

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Ld;")
    private class242 field2664 = new class242(64);

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Ld;")
    public class242 field2671 = new class242(50);

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Ld;")
    public class242 field2672 = new class242(5);

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "Lpt;")
    public class308 field2668;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Z")
    public boolean field2661;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "Lum;")
    private class83 field2652;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "Lum;")
    public class83 field2665;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "[I")
    public static int[] field2656 = new int[14];

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2663 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "Ljp;")
    public static class55 field2669 = new class55(88, 7);

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "Lpu;")
    public static class179 field2670 = new class179(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Lbn;")
    public static class307 field2666;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public final void method1228(int arg0) {
        class242 var2 = this.field2664;
        synchronized (this.field2664) {
            this.field2664.method1630(-40);
        }
        field2655++;
        class242 var3 = this.field2671;
        synchronized (this.field2671) {
            this.field2671.method1630(-75);
        }
        class242 var4 = this.field2672;
        synchronized (this.field2672) {
            this.field2672.method1630(arg0 + 5570);
            if (arg0 != -5610) {
                this.method1235(-91, (byte) -18);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)Lju;")
    public final class171 method1229(int arg0, int arg1) {
        field2653++;
        class242 var3 = this.field2664;
        class171 var4;
        synchronized (this.field2664) {
            var4 = (class171) this.field2664.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field2652;
        byte[] var6;
        synchronized (this.field2652) {
            var6 = this.field2652.method731(0, class508.method3026(arg1, arg0 ^ 0xFFFFAC05), class420.method2623(arg1, -77));
        }
        class171 var7 = new class171();
        if (arg0 != -21382) {
            this.method1228(-94);
        }
        var7.field2635 = this;
        var7.field2618 = arg1;
        if (var6 != null) {
            var7.method1225(new class194(var6), (byte) -106);
        }
        var7.method1223((byte) 71);
        class242 var8 = this.field2664;
        synchronized (this.field2664) {
            this.field2664.method1623((long) arg1, 17621, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public static void method1230(int arg0) {
        field2656 = null;
        field2666 = null;
        field2670 = null;
        if (arg0 != 5) {
            method1230(37);
        }
        field2663 = null;
        field2669 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)V")
    public final void method1231(boolean arg0, int arg1) {
        field2651++;
        if (this.field2661 == arg0) {
            return;
        }
        this.field2661 = arg0;
        this.method1232(87);
        if (arg1 != 14) {
            this.method1228(-110);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public final void method1232(int arg0) {
        field2657++;
        class242 var2 = this.field2664;
        synchronized (this.field2664) {
            this.field2664.method1637((byte) 13);
        }
        class242 var3 = this.field2671;
        synchronized (this.field2671) {
            int var4 = 91 / ((-arg0 - 75) / 49);
            this.field2671.method1637((byte) 13);
        }
        class242 var5 = this.field2672;
        synchronized (this.field2672) {
            this.field2672.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V")
    public final void method1233(int arg0, int arg1) {
        if (arg1 != 16946) {
            return;
        }
        class242 var3 = this.field2664;
        synchronized (this.field2664) {
            this.field2664.method1631(arg0, (byte) -19);
        }
        field2654++;
        class242 var4 = this.field2671;
        synchronized (this.field2671) {
            this.field2671.method1631(arg0, (byte) -19);
        }
        class242 var5 = this.field2672;
        synchronized (this.field2672) {
            this.field2672.method1631(arg0, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
    public final void method1234(int arg0) {
        class242 var2 = this.field2671;
        synchronized (this.field2671) {
            this.field2671.method1637((byte) 13);
            if (arg0 != 5) {
                field2662 = 36;
            }
        }
        field2659++;
        class242 var3 = this.field2672;
        synchronized (this.field2672) {
            this.field2672.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)V")
    public final void method1235(int arg0, byte arg1) {
        this.field2673 = arg0;
        field2660++;
        class242 var3 = this.field2671;
        synchronized (this.field2671) {
            this.field2671.method1637((byte) 13);
            if (arg1 < 79) {
                field2666 = null;
            }
        }
        class242 var4 = this.field2672;
        synchronized (this.field2672) {
            this.field2672.method1637((byte) 13);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([BB)Z")
    public static final boolean method1236(byte[] arg0, byte arg1) {
        field2658++;
        class194 var2 = new class194(arg0);
        if (arg1 != -65) {
            method1236(null, (byte) 2);
        }
        int var3 = var2.method1337((byte) 81);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method1337((byte) -128) == 1;
        if (var4) {
            class394.method2476(var2, -89);
        }
        class509.method3028(2, var2);
        return true;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lpt;IZLum;Lum;)V")
    public class172(class308 arg0, int arg1, boolean arg2, class83 arg3, class83 arg4) {
        this.field2668 = arg0;
        this.field2661 = arg2;
        this.field2652 = arg3;
        this.field2665 = arg4;
        if (this.field2652 != null) {
            int var6 = this.field2652.method754(false) - 1;
            this.field2652.method748(var6, 12408);
        }
    }
}
