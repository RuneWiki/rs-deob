import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class353 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    private int field5451 = 0;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Llp;")
    private class272 field5452;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Z")
    public static boolean field5456 = false;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lie;")
    private class5 field5454;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Lie;")
    public final class5 method2265(int arg0) {
        this.field5451 = arg0;
        field5448++;
        return this.method2269(0);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)Z")
    public static final boolean method2266(int arg0, int arg1, int arg2) {
        if (arg2 != -1007) {
            method2268(-0.28126332F, -0.55927014F, -91, 108, 0.43568566F, 61, (byte) -118, -0.6862427F, null, 0.59177905F, 84);
        }
        field5455++;
        if (!class139.field1850) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class263.field3690[var3] == null || class263.field3690[var3][var4] == null) {
            return false;
        }
        class282 var5 = class263.field3690[var3][var4];
        if (arg0 == -1 && var5.field4103 == 0) {
            for (class54 var6 = (class54) class131.field1769.method445(33); var6 != null; var6 = (class54) class131.field1769.method451(false)) {
                if (var6.field764 == 58 || var6.field764 == 1006 || var6.field764 == 10 || var6.field764 == 45 || var6.field764 == 60) {
                    for (class282 var7 = class21.method194(arg2 + 880, var6.field754); var7 != null; var7 = class357.method2291(var7, -1)) {
                        if (var5.field4029 == var7.field4029) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class54 var8 = (class54) class131.field1769.method445(33); var8 != null; var8 = (class54) class131.field1769.method451(false)) {
                if (var8.field762 == arg0 && var5.field4029 == var8.field754 && (var8.field764 == 58 || var8.field764 == 1006 || var8.field764 == 10 || var8.field764 == 45 || var8.field764 == 60)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public static final void method2267(int arg0, int arg1) {
        if (arg1 == -46) {
            field5449++;
            if (class78.field1124 == null || arg0 > class78.field1124.length) {
                class78.field1124 = new int[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Llp;)V")
    public class353(class272 arg0) {
        this.field5452 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(FFIIFIBFLag;FI)[B")
    public static final byte[] method2268(float arg0, float arg1, int arg2, int arg3, float arg4, int arg5, byte arg6, float arg7, class490 arg8, float arg9, int arg10) {
        if (arg6 == 90) {
            field5453++;
            byte[] var11 = new byte[arg2 * arg10 * arg3];
            class214.method1473(arg3, 0, arg0, 0, arg10, arg4, var11, arg1, arg5, arg8, arg9, arg2, arg7);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Lie;")
    public final class5 method2269(int arg0) {
        field5457++;
        if (arg0 != 0) {
            return null;
        } else if (this.field5451 <= 0 || this.field5452.field3777[this.field5451 - 1] == this.field5454) {
            while (this.field5451 < this.field5452.field3770) {
                class5 var3 = this.field5452.field3777[this.field5451++].field39;
                if (this.field5452.field3777[this.field5451 - 1] != var3) {
                    this.field5454 = var3.field39;
                    return var3;
                }
            }
            return null;
        } else {
            class5 var2 = this.field5454;
            this.field5454 = var2.field39;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public static final void method2270(int arg0) {
        field5450++;
        if (arg0 <= 6) {
            method2266(10, 93, 91);
        }
        class173.field2324.method2127((byte) -70);
    }

    static {
        new class446("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
