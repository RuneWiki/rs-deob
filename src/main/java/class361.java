import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class361 extends class80 {

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    private int field5289;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "Lph;")
    public static class459 field5290;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BZLla;Ljava/lang/String;)V")
    public static final void method2216(byte arg0, boolean arg1, class317 arg2, String arg3) {
        ++field5292;
        byte var4 = 4;
        if (arg0 != -59) {
            method2218(41);
        }
        int var5 = var4 + 6;
        int var6 = 6 - -var4;
        int var7 = class398.field6038.method2813((class24[]) null, 250, true, arg3);
        int var8 = class398.field6038.method2815(arg3, -117, (class24[]) null, 250) * 13;
        class262.field4006.method327(-var4 + var5, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class262.field4006.method365(-var4 + var5, var6 - var4, var4 + var7 + var4, var4 + var8 - -var4, -1, 0);
        arg2.method2012((byte) 71, 0, 0, var6, 0, var5, arg3, 1, var8, 1, -1, (class24[]) null, var7, -1, (class144) null, (int[]) null);
        class205.method1403(arg0 ^ -59, var7 - -var4 + var4, -var4 + var6, var8 - (-var4 - var4), -var4 + var5);
        if (arg1) {
            class262.field4006.method355();
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(I)V")
    public class361(int arg0) {
        super(0, true);
        this.field5289 = 4096;
        this.field5289 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
    public class361() {
        this(4096);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field5294;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (arg1 != -16828) {
            field5290 = null;
        }
        if (super.field1601.field124) {
            class394.method2451(var3, 0, class137.field2308, this.field5289);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        if (arg0 == 0) {
            this.field5289 = (arg2.method1858(-3256) << 12) / 255;
        }
        int var5 = -74 / ((28 - arg1) / 53);
        ++field5291;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
    public static final void method2217(int arg0) {
        class399 var1 = class182.field2940;
        synchronized (class182.field2940) {
            class182.field2940.method2475((byte) 67);
        }
        ++field5293;
        class399 var2 = class522.field7581;
        synchronized (class522.field7581) {
            class522.field7581.method2475((byte) 67);
        }
        if (arg0 != 6) {
            method2218(8);
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V")
    public static void method2218(int arg0) {
        if (arg0 != 0) {
            field5290 = null;
        }
        field5290 = null;
    }
}
