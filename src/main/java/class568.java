import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class568 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lfc;")
    private class262 field8001 = new class262(256);

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lni;")
    private class522 field8005;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field8003;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static final void method3192(byte arg0) {
        class531.field7219 = class294.field3954.field5239 - (-class294.field3954.field5236 - 2);
        class73.field784 = new String[500];
        field8007++;
        class437.field6130 = class616.field8643.field5239 + class616.field8643.field5236 + 2;
        int var1 = 0;
        if (arg0 != -43) {
            field8006 = 15;
        }
        while (class73.field784.length > var1) {
            class73.field784[var1] = "";
            var1++;
        }
        class392.method2288(class755.field10478.method4201(class723.field10095, (byte) 25), arg0 ^ 0xFFFFFF84);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public final void method3193(byte arg0) {
        if (arg0 != 17) {
            this.method3193((byte) 86);
        }
        field8004++;
        class262 var2 = this.field8001;
        synchronized (this.field8001) {
            this.field8001.method1563(arg0 + 58);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lhd;")
    public final class742 method3194(int arg0, int arg1) {
        field8008++;
        class262 var3 = this.field8001;
        class742 var4;
        synchronized (this.field8001) {
            var4 = (class742) this.field8001.method1571(-127, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field8005;
        byte[] var6;
        synchronized (this.field8005) {
            var6 = this.field8005.method2885(arg1, arg0, false);
        }
        class742 var7 = new class742();
        if (var6 != null) {
            var7.method4154(0, new class611(var6));
        }
        class262 var8 = this.field8001;
        synchronized (this.field8001) {
            this.field8001.method1574((long) arg1, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static void method3195(boolean arg0) {
        field8003 = null;
        if (!arg0) {
            field8006 = 51;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public final void method3196(int arg0) {
        field8010++;
        int var2 = 7 / ((-arg0 - 48) / 57);
        class262 var3 = this.field8001;
        synchronized (this.field8001) {
            this.field8001.method1575((byte) -115);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)V")
    public final void method3197(int arg0, int arg1) {
        field8009++;
        class262 var3 = this.field8001;
        synchronized (this.field8001) {
            this.field8001.method1569((byte) 62, arg0);
        }
        if (arg1 > -28) {
            this.field8005 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lrga;ILni;)V")
    public class568(class242 arg0, int arg1, class522 arg2) {
        this.field8005 = arg2;
        this.field8005.method2901(0, 26);
    }
}
