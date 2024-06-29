import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class146 extends class204 {

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "F")
    public float field2019;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "F")
    public float field2025;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "Z")
    public boolean field2022;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Lbh;")
    public static class538 field2024 = new class538(64);

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2027 = null;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "Lju;")
    public static class102 field2029 = new class102(70, -1);

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "[Lvs;")
    public static class519[] field2026;

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lep;IIIZ[III)V", line = 3)
    public class146(class371 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field5510 != -34038) {
            this.field2025 = this.field2019 = 1.0F;
            this.field2022 = true;
        } else {
            this.field2025 = (float) arg2;
            this.field2022 = false;
            this.field2019 = (float) arg3;
        }
        this.field2028 = arg3;
        this.field2023 = arg2;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lep;IIII)V", line = 24)
    public class146(class371 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2028 = arg4;
        if (super.field5510 == 34037) {
            this.field2022 = false;
            this.field2025 = (float) arg3;
            this.field2019 = (float) arg4;
        } else {
            this.field2025 = this.field2019 = 1.0F;
            this.field2022 = true;
        }
        this.field2023 = arg3;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lep;IIIIIIZ)V", line = 45)
    public class146(class371 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2019 = (float) arg4 / (float) arg6;
        this.field2028 = arg4;
        this.field2023 = arg3;
        this.field2025 = (float) arg3 / (float) arg5;
        this.field2022 = false;
        this.method1364(false, false, 10242);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lep;IIIIIZ)V", line = 58)
    public class146(class371 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field2028 = arg5;
        this.field2023 = arg4;
        if (~super.field5510 != -34038) {
            this.field2022 = true;
            this.field2025 = this.field2019 = 1.0F;
        } else {
            this.field2025 = (float) arg4;
            this.field2022 = false;
            this.field2019 = (float) arg5;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V", line = 81)
    public static void method949(byte arg0) {
        if (arg0 != -87) {
            method950(-18, -62);
        }
        field2029 = null;
        field2026 = null;
        field2024 = null;
        field2027 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V", line = 94)
    public static final void method950(int arg0, int arg1) {
        if (arg0 != 0) {
            method950(-87, 83);
        }
        ++field2020;
        class210.field2988 = arg1;
        class538 var2 = class111.field1592;
        synchronized (class111.field1592) {
            class111.field1592.method3210(false);
        }
        class538 var3 = class440.field6036;
        synchronized (class440.field6036) {
            class440.field6036.method3210(false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lep;IIIII)V", line = 113)
    public class146(class371 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2028 = arg3;
        this.field2025 = (float) arg2 / (float) arg4;
        this.field2019 = (float) arg3 / (float) arg5;
        this.field2023 = arg2;
        this.field2022 = false;
        this.method1364(false, false, 10242);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lep;IIII[I)V", line = 127)
    public class146(class371 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2023 = arg1;
        this.field2028 = arg2;
        this.method1368(-124, arg5, arg2, 0, 0, 0, 0, arg1, true);
        this.field2022 = false;
        this.field2019 = (float) arg2 / (float) arg4;
        this.field2025 = (float) arg1 / (float) arg3;
        this.method1364(false, false, 10242);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lep;IIIII[BI)V", line = 149)
    public class146(class371 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2023 = arg2;
        this.field2028 = arg3;
        this.method1366(0, (byte) 20, 0, 0, true, arg6, arg2, arg3, 0, arg7);
        this.field2025 = (float) arg2 / (float) arg4;
        this.field2019 = (float) arg3 / (float) arg5;
        this.field2022 = false;
        this.method1364(false, false, 10242);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lep;IIIIZ[BI)V", line = 171)
    public class146(class371 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field2028 = arg4;
        this.field2023 = arg3;
        if (super.field5510 == 34037) {
            this.field2025 = (float) arg3;
            this.field2019 = (float) arg4;
            this.field2022 = false;
        } else {
            this.field2025 = this.field2019 = 1.0F;
            this.field2022 = true;
        }
    }
}
