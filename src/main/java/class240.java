import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class240 extends class25 {

    @OriginalMember(owner = "client!md", name = "J", descriptor = "[Lmd;")
    public class240[] field4116;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "Z")
    public boolean field4113;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Lcd;")
    private static class64 field4100 = class44.method335((byte) 71, "Checking for updates )2 ");

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lcd;")
    public static class64 field4099 = class44.method335((byte) 71, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!md", name = "w", descriptor = "[I")
    public static int[] field4103 = new int[1000];

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Lcd;")
    public static class64 field4102 = class44.method335((byte) 71, " (X");

    @OriginalMember(owner = "client!md", name = "D", descriptor = "Lcd;")
    public static class64 field4110 = class44.method335((byte) 71, "Untersuchen");

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lcd;")
    public static class64 field4098 = class44.method335((byte) 71, "<img=0>");

    @OriginalMember(owner = "client!md", name = "H", descriptor = "Lcd;")
    public static class64 field4114 = field4100;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Lcd;")
    public static class64 field4106 = class44.method335((byte) 71, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!md", name = "N", descriptor = "Lcd;")
    private static class64 field4120 = class44.method335((byte) 71, "Close");

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Lcd;")
    public static class64 field4112 = field4120;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public int field4117;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lrj;")
    public class17 field4094;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Lfi;")
    public class250 field4095;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)I", line = 14)
    public int method1038(int arg0) {
        field4104++;
        if (arg0 != 1000) {
            this.method1019((byte) 11);
        }
        return -1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lcd;I)I", line = 26)
    public static final int method1742(class64 arg0, int arg1) {
        field4109++;
        if (arg0 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg1 <= 99) {
            field4114 = (class64) null;
        }
        while (var2 < class202.field3453) {
            if (arg0.method515(-64, class29.field493[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V", line = 54)
    public static void method1743(byte arg0) {
        field4100 = null;
        field4110 = null;
        field4098 = null;
        if (arg0 != -63) {
            return;
        }
        field4114 = null;
        field4099 = null;
        field4102 = null;
        field4120 = null;
        field4103 = null;
        field4112 = null;
        field4106 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BZLja;)V", line = 74)
    public static final void method1744(byte arg0, boolean arg1, class60 arg2) {
        if (arg0 > -84) {
            method1744((byte) -92, false, (class60) null);
        }
        int var3 = arg2.field1112 == 0 ? arg2.field1163 : arg2.field1112;
        field4118++;
        int var4 = arg2.field1171 == 0 ? arg2.field1016 : arg2.field1171;
        class264.method1853(var3, class272.field4675[arg2.field1080 >> 16], arg2.field1080, var4, (byte) 45, arg1);
        if (arg2.field1100 != null) {
            class264.method1853(var3, arg2.field1100, arg2.field1080, var4, (byte) 45, arg1);
        }
        class172 var5 = (class172) class159.field2805.method1151((long) arg2.field1080, 0);
        if (var5 != null) {
            class76.method605(arg1, var5.field2967, var4, (byte) -114, var3);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)[I", line = 129)
    public final int[] method1745(int arg0, int arg1, byte arg2) {
        field4101++;
        if (arg2 <= 103) {
            method1744((byte) -84, false, (class60) null);
        }
        return this.field4116[arg1].field4113 ? this.field4116[arg1].method12(64, arg0) : this.field4116[arg1].method286((byte) 72, arg0)[0];
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[I", line = 151)
    public int[] method12(int arg0, int arg1) {
        field4115++;
        if (arg0 == 64) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return (int[]) null;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V", line = 165)
    public void method288(int arg0) {
        if (arg0 != 17772) {
            field4100 = (class64) null;
        }
        field4105++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILkh;)V", line = 177)
    public void method16(int arg0, int arg1, class13 arg2) {
        field4093++;
        if (arg0 != 2) {
            field4112 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)[[I", line = 195)
    public final int[][] method1746(int arg0, int arg1, int arg2) {
        field4111++;
        int var4 = 16 / ((-arg0 - 30) / 33);
        if (this.field4116[arg2].field4113) {
            int[] var5 = this.field4116[arg2].method12(64, arg1);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field4116[arg2].method286((byte) 45, arg1);
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V", line = 231)
    public void method1012(byte arg0) {
        if (this.field4113) {
            this.field4094.method180(19290);
            this.field4094 = null;
        } else {
            this.field4095.method1795(true);
            this.field4095 = null;
        }
        if (arg0 > -74) {
            this.method1019((byte) -1);
        }
        field4107++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)[[I", line = 266)
    public int[][] method286(byte arg0, int arg1) {
        if (arg0 <= 34) {
            field4100 = (class64) null;
        }
        field4119++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)I", line = 277)
    public int method1019(byte arg0) {
        if (arg0 > -126) {
            field4114 = (class64) null;
        }
        field4096++;
        return -1;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IZ)V", line = 296)
    public class240(int arg0, boolean arg1) {
        this.field4116 = new class240[arg0];
        this.field4113 = arg1;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(III)V", line = 327)
    public final void method1747(int arg0, int arg1, int arg2) {
        int var4 = ~this.field4117 == arg2 ? arg0 : this.field4117;
        field4108++;
        if (this.field4113) {
            this.field4094 = new class17(var4, arg0, arg1);
        } else {
            this.field4095 = new class250(var4, arg0, arg1);
        }
    }
}
