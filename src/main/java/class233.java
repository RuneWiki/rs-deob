import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class233 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lwi;")
    private class330 field3311 = new class330(64);

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Luu;")
    private class191 field3318;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lni;")
    public static class367 field3313 = new class367(40, 7);

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "Lof;")
    public static class446 field3319 = new class446("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
    public final void method1555(int arg0, int arg1) {
        class330 var3 = this.field3311;
        synchronized (this.field3311) {
            if (arg0 != 32) {
                method1558((byte) 21);
            }
            this.field3311.method2140(-111, arg1);
        }
        field3316++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)Llt;")
    public final class485 method1556(int arg0, boolean arg1) {
        field3315++;
        if (arg1) {
            field3319 = null;
        }
        class330 var3 = this.field3311;
        class485 var4;
        synchronized (this.field3311) {
            var4 = (class485) this.field3311.method2133((long) arg0, (byte) 118);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field3318;
        byte[] var6;
        synchronized (this.field3318) {
            var6 = this.field3318.method1281(32, arg0, 65);
        }
        class485 var7 = new class485();
        if (var6 != null) {
            var7.method2905(new class164(var6), -1);
        }
        class330 var8 = this.field3311;
        synchronized (this.field3311) {
            this.field3311.method2131(var7, (long) arg0, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public final void method1557(int arg0) {
        class330 var2 = this.field3311;
        synchronized (this.field3311) {
            if (arg0 < 51) {
                return;
            }
            this.field3311.method2135(0);
        }
        field3314++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static void method1558(byte arg0) {
        field3313 = null;
        field3319 = null;
        if (arg0 != -37) {
            method1558((byte) 93);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILqa;)V")
    public static final void method1559(int arg0, class165 arg1) {
        field3312++;
        if (class129.field1739.method446(4090) == 0) {
            return;
        }
        if (arg0 <= 63) {
            field3319 = null;
        }
        if (class378.field5771 == 0) {
            for (class316 var4 = (class316) class129.field1739.method445(33); var4 != null; var4 = (class316) class129.field1739.method451(false)) {
                class103.field1489.method1592(arg1, 64, class536.field7867, var4.field4592, var4.field4596, var4.field4593 ? class56.field800.field1401 : null, arg1, var4.field4601, var4.field4595, false, false, var4.field4598);
                var4.method25(-13489);
            }
            class141.method950(0);
            return;
        }
        if (class531.field7811 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class531.field7811 = class165.method1130(class312.field4572, 0, (byte) 118, var2, class56.field816, 0);
            class382.field5822 = class531.field7811.method839(class7.method92(class381.field5811, 0, -15471, class73.field1013), class252.method1638(class266.field3709, class73.field1013, 0), true);
        }
        for (class316 var3 = (class316) class129.field1739.method445(33); var3 != null; var3 = (class316) class129.field1739.method451(false)) {
            class103.field1489.method1592(arg1, 64, class382.field5822, var3.field4592, var3.field4596, var3.field4593 ? class56.field800.field1401 : null, class531.field7811, var3.field4601, var3.field4595, false, false, var3.field4598);
            var3.method25(-13489);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public final void method1560(boolean arg0) {
        field3310++;
        if (!arg0) {
            field3319 = null;
        }
        class330 var2 = this.field3311;
        synchronized (this.field3311) {
            this.field3311.method2127((byte) 122);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1561(String arg0, String arg1, String arg2, byte arg3) {
        if (arg3 <= 47) {
            field3319 = null;
        }
        field3317++;
        for (int var4 = arg2.indexOf(arg0); var4 != -1; var4 = arg2.indexOf(arg0, arg1.length() + var4)) {
            arg2 = arg2.substring(0, var4) + arg1 + arg2.substring(var4 + arg0.length());
        }
        return arg2;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Liv;ILuu;)V")
    public class233(class65 arg0, int arg1, class191 arg2) {
        this.field3318 = arg2;
        this.field3318.method1290(false, 32);
    }
}
