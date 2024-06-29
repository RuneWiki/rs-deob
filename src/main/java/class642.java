import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class642 extends class501 {

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "Z")
    public boolean field9344 = true;

    @OriginalMember(owner = "client!lo", name = "D", descriptor = "I")
    public int field9355 = -1;

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
    public int field9351 = 0;

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
    public int field9358 = 12800;

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
    public int field9357 = 12800;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
    public int field9361 = -1;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    public int field9360 = 0;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "Ljava/lang/String;")
    public String field9346;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "Ljava/lang/String;")
    public String field9347;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
    public int field9348;

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "I")
    public int field9350;

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "Lbu;")
    public class19 field9352;

    @OriginalMember(owner = "client!lo", name = "C", descriptor = "[I")
    public static int[] field9354 = new int[5];

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!lo", name = "F", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 219)
    public class642(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field9346 = arg2;
        this.field9344 = arg5;
        this.field9361 = arg6;
        this.field9347 = arg1;
        this.field9355 = arg4;
        this.field9348 = arg0;
        this.field9350 = arg3;
        if (this.field9361 == 255) {
            this.field9361 = 0;
        }
        this.field9352 = new class19();
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II[II)Z", line = 12)
    public final boolean method3709(int arg0, int arg1, int[] arg2, int arg3) {
        field9359++;
        if (arg0 < 69) {
            this.field9346 = null;
        }
        for (class278 var5 = (class278) this.field9352.method124((byte) 42); var5 != null; var5 = (class278) this.field9352.method120(87)) {
            if (var5.method1742((byte) -113, arg1, arg3)) {
                var5.method1744(arg3, 15874, arg2, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI[II)Z", line = 37)
    public final boolean method3710(byte arg0, int arg1, int[] arg2, int arg3) {
        int var5 = -75 % ((arg0 - 76) / 49);
        field9345++;
        for (class278 var6 = (class278) this.field9352.method124((byte) 42); var6 != null; var6 = (class278) this.field9352.method120(28)) {
            if (var6.method1746(arg1, arg3, 2)) {
                var6.method1740((byte) -82, arg3, arg2, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZI)Z", line = 67)
    public final boolean method3711(int arg0, boolean arg1, int arg2) {
        field9356++;
        if (arg1) {
            this.method3710((byte) 112, 52, null, -38);
        }
        for (class278 var4 = (class278) this.field9352.method124((byte) 42); var4 != null; var4 = (class278) this.field9352.method120(46)) {
            if (var4.method1742((byte) -93, arg0, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BII[II)Z", line = 90)
    public final boolean method3712(byte arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field9349++;
        class278 var6 = (class278) this.field9352.method124((byte) 42);
        if (arg0 <= 27) {
            this.field9357 = -7;
        }
        while (var6 != null) {
            if (var6.method1741(arg1, arg2, 5450, arg4)) {
                var6.method1744(arg4, 15874, arg3, arg2);
                return true;
            }
            var6 = (class278) this.field9352.method120(-124);
        }
        return false;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 118)
    public final void method3713(int arg0) {
        this.field9357 = 12800;
        this.field9358 = arg0;
        field9343++;
        this.field9351 = 0;
        this.field9360 = 0;
        for (class278 var2 = (class278) this.field9352.method124((byte) 42); var2 != null; var2 = (class278) this.field9352.method120(-97)) {
            if (this.field9358 > var2.field3900) {
                this.field9358 = var2.field3900;
            }
            if (var2.field3895 > this.field9360) {
                this.field9360 = var2.field3895;
            }
            if (var2.field3906 < this.field9357) {
                this.field9357 = var2.field3906;
            }
            if (this.field9351 < var2.field3903) {
                this.field9351 = var2.field3903;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V", line = 152)
    public static void method3714(int arg0) {
        field9354 = null;
        if (arg0 != 0) {
            method3715((byte) 109);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V", line = 176)
    public static final void method3715(byte arg0) {
        field9353++;
        int var1 = class551.field8224;
        int[] var2 = class314.field4332;
        for (int var3 = 0; var3 < var1; var3++) {
            class373 var4 = class293.field4036[var2[var3]];
            if (var4 != null) {
                class234.method1499(0, var4, var4.method940(-1));
            }
        }
        if (arg0 >= -50) {
            method3714(19);
        }
    }
}
