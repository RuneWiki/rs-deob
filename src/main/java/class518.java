import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class518 {

    @OriginalMember(owner = "client!po", name = "k", descriptor = "Lmf;")
    private class382 field7312 = new class382(256);

    @OriginalMember(owner = "client!po", name = "h", descriptor = "Lpu;")
    private class522 field7309;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "Ljava/lang/String;")
    public static String field7315 = null;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "Lpu;")
    public static class522 field7311;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "[Lmw;")
    public static class454[] field7307;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "[Z")
    public static boolean[] field7302;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 6)
    public static void method2956(int arg0) {
        field7311 = null;
        field7302 = null;
        field7315 = null;
        field7307 = null;
        if (arg0 != -21968) {
            method2957(85);
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 20)
    public static final void method2957(int arg0) {
        if (arg0 >= -10) {
            method2960(-87, (byte) -38, 19);
        }
        class382 var1 = class341.field5007;
        synchronized (class341.field5007) {
            class341.field5007.method2285((byte) -100);
        }
        field7310++;
        class382 var2 = class622.field8668;
        synchronized (class622.field8668) {
            class622.field8668.method2285((byte) -80);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lr;IZI)Lfu;", line = 44)
    public static final class355 method2958(class166 arg0, int arg1, boolean arg2, int arg3) {
        field7303++;
        if (arg3 == -1) {
            return null;
        }
        if (class254.field3898 != null) {
            for (int var4 = 0; var4 < class254.field3898.length; var4++) {
                if (class254.field3898[var4] == arg3) {
                    return class185.field2592[var4];
                }
            }
        }
        class355 var5 = (class355) class229.field3593.method2287(1, (long) arg3);
        if (var5 != null) {
            if (arg2 && var5.field5105 == null) {
                class146 var6 = class412.method2482(70, class558.field7879, arg3);
                if (var6 == null) {
                    return null;
                }
                var5.field5105 = var6;
            }
            return var5;
        }
        if (arg1 != -14005) {
            field7302 = null;
        }
        class113[] var7 = class113.method880(class141.field2086, arg3);
        if (var7 == null) {
            return null;
        }
        class146 var8 = class412.method2482(32, class558.field7879, arg3);
        if (var8 == null) {
            return null;
        }
        class355 var9;
        if (arg2) {
            var9 = new class355(arg0.method128(var8, var7, true), var8);
        } else {
            var9 = new class355(arg0.method128(var8, var7, true));
        }
        class229.field3593.method2291(var9, (long) arg3, 1);
        return var9;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V", line = 108)
    public final void method2959(boolean arg0) {
        class382 var2 = this.field7312;
        synchronized (this.field7312) {
            this.field7312.method2279(0);
        }
        field7314++;
        if (arg0) {
            field7307 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IBI)Z", line = 123)
    public static final boolean method2960(int arg0, byte arg1, int arg2) {
        if (arg1 == -37) {
            field7313++;
            return (arg2 & 0x84080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)Ltt;", line = 136)
    public final class78 method2961(byte arg0, int arg1) {
        if (arg0 != 6) {
            field7304 = -118;
        }
        field7308++;
        class382 var3 = this.field7312;
        class78 var4;
        synchronized (this.field7312) {
            var4 = (class78) this.field7312.method2287(arg0 ^ 0x7, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field7309;
        byte[] var6;
        synchronized (this.field7309) {
            var6 = this.field7309.method3007(26, arg1, 5);
        }
        class78 var7 = new class78();
        if (var6 != null) {
            var7.method717(new class695(var6), 99);
        }
        class382 var8 = this.field7312;
        synchronized (this.field7312) {
            this.field7312.method2291(var7, (long) arg1, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)V", line = 166)
    public final void method2962(int arg0, byte arg1) {
        class382 var3 = this.field7312;
        synchronized (this.field7312) {
            this.field7312.method2290(false, arg0);
        }
        if (arg1 >= -58) {
            field7311 = null;
        }
        field7305++;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V", line = 180)
    public final void method2963(byte arg0) {
        if (arg0 > -41) {
            return;
        }
        field7306++;
        class382 var2 = this.field7312;
        synchronized (this.field7312) {
            this.field7312.method2285((byte) -112);
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lkr;ILpu;)V", line = 195)
    public class518(class693 arg0, int arg1, class522 arg2) {
        this.field7309 = arg2;
        this.field7309.method2988(103, 26);
    }
}
