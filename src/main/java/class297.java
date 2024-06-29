import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class297 extends class292 {

    @OriginalMember(owner = "client!li", name = "F", descriptor = "I")
    public int field4678 = 0;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public int field4685 = -1;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public int field4684 = -1;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    public int field4696 = 12800;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    public int field4693 = 0;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "I")
    public int field4691 = 12800;

    @OriginalMember(owner = "client!li", name = "cb", descriptor = "Z")
    public boolean field4701 = true;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "Ljava/lang/String;")
    public String field4689;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public int field4677;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "Ljava/lang/String;")
    public String field4698;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    public int field4699;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "Lgb;")
    public class149 field4683;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "Lsc;")
    public static class256 field4680 = new class256(64);

    @OriginalMember(owner = "client!li", name = "N", descriptor = "Z")
    public static boolean field4686 = false;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "Ljava/lang/String;")
    public static String field4692 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    public static int field4687 = 0;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    public final void method1989(int arg0) {
        this.field4693 = 0;
        this.field4691 = 12800;
        this.field4678 = 0;
        field4676++;
        this.field4696 = 12800;
        if (arg0 <= 36) {
            return;
        }
        for (class244 var2 = (class244) this.field4683.method1010(121); var2 != null; var2 = (class244) this.field4683.method1008((byte) 88)) {
            if (this.field4693 < var2.field3789) {
                this.field4693 = var2.field3789;
            }
            if (this.field4691 > var2.field3793) {
                this.field4691 = var2.field3793;
            }
            if (var2.field3778 < this.field4696) {
                this.field4696 = var2.field3778;
            }
            if (this.field4678 < var2.field3787) {
                this.field4678 = var2.field3787;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)[I")
    public final int[] method1990(int arg0, int arg1, int arg2) {
        field4694++;
        for (class244 var4 = (class244) this.field4683.method1010(108); var4 != null; var4 = (class244) this.field4683.method1008((byte) 88)) {
            if (var4.method1655((byte) -108, arg2, arg0)) {
                return var4.method1656(arg0, arg2, (byte) 118);
            }
        }
        if (arg1 != -1) {
            this.field4698 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)[I")
    public final int[] method1991(int arg0, int arg1, int arg2, int arg3) {
        field4697++;
        for (class244 var5 = (class244) this.field4683.method1010(arg2 ^ 0x6E); var5 != null; var5 = (class244) this.field4683.method1008((byte) 88)) {
            if (var5.method1654(arg0, false, arg3, arg1)) {
                return var5.method1653(118, arg0, arg1);
            }
        }
        return arg2 == 0 ? null : null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIZ)Z")
    public final boolean method1992(int arg0, int arg1, boolean arg2) {
        field4681++;
        for (class244 var4 = (class244) this.field4683.method1010(113); var4 != null; var4 = (class244) this.field4683.method1008((byte) 88)) {
            if (var4.method1657(arg1, (byte) 96, arg0)) {
                return true;
            }
        }
        if (arg2) {
            field4686 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLuf;IILuf;)Lkc;")
    public static final class286 method1993(boolean arg0, class176 arg1, int arg2, int arg3, class176 arg4) {
        field4679++;
        boolean var5 = true;
        int[] var6 = arg1.method1157(arg3, false);
        int var7 = 0;
        if (arg2 <= 62) {
            field4687 = -19;
        }
        while (var7 < var6.length) {
            byte[] var8 = arg1.method1154(var6[var7], (byte) -79, arg3);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg4.method1154(var9, (byte) -79, 0);
                } else {
                    var10 = arg4.method1154(0, (byte) -79, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
            var7++;
        }
        if (!var5) {
            return null;
        }
        try {
            return new class286(arg1, arg4, arg3, arg0);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
    public static void method1994(int arg0) {
        int var1 = -28 % ((-arg0 - 35) / 37);
        field4680 = null;
        field4692 = null;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(III)[I")
    public final int[] method1995(int arg0, int arg1, int arg2) {
        field4682++;
        if (arg1 != 0) {
            this.method1995(-98, 110, -1);
        }
        for (class244 var4 = (class244) this.field4683.method1010(109); var4 != null; var4 = (class244) this.field4683.method1008((byte) 88)) {
            if (var4.method1657(arg0, (byte) 96, arg2)) {
                return var4.method1653(86, arg2, arg0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class297(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4689 = arg1;
        this.field4677 = arg3;
        this.field4685 = arg6;
        if (this.field4685 == 255) {
            this.field4685 = 0;
        }
        this.field4684 = arg4;
        this.field4698 = arg2;
        this.field4699 = arg0;
        this.field4701 = arg5;
        this.field4683 = new class149();
    }
}
