import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class278 {

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    private int field4103 = -1;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    private int field4109 = 0;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Leb;")
    private class395 field4106 = new class395();

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Z")
    public boolean field4111 = false;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    private int field4108;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    private int field4105;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "[[I")
    private int[][] field4098;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[Lis;")
    private class41[] field4101;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Ldq;")
    public static class90 field4104 = new class90(32);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Lia;")
    public static class375 field4110;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 10)
    public final void method1885(boolean arg0) {
        for (int var2 = 0; var2 < this.field4108; var2++) {
            this.field4098[var2] = null;
        }
        if (!arg0) {
            this.method1888(1);
        }
        field4102++;
        this.field4101 = null;
        this.field4098 = null;
        this.field4106.method2477(-14221);
        this.field4106 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;", line = 33)
    public static final String[] method1886(char arg0, int arg1, String arg2) {
        field4107++;
        if (arg1 != -19369) {
            field4110 = null;
        }
        int var3 = class315.method2084(-124, arg0, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0 != arg2.charAt(var8); var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIILkg;)V", line = 69)
    public static final void method1887(int arg0, int arg1, int arg2, class223 arg3) {
        class363.field5259 = arg0;
        class319.field4707 = arg1;
        if (arg2 <= -96) {
            field4097++;
            class105.field1391 = arg3;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)[[I", line = 84)
    public final int[][] method1888(int arg0) {
        field4099++;
        if (this.field4108 != this.field4105) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field4108; var2++) {
            this.field4101[var2] = class368.field5313;
        }
        return this.field4098;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lwc;B)I", line = 103)
    public static final int method1889(class380 arg0, byte arg1) {
        field4094++;
        int var2 = arg0.field5582;
        class446 var3 = arg0.method450(0);
        if (arg0.field719) {
            var2 = arg0.field5565;
        } else if (arg0.field706 == var3.field6484 || arg0.field706 == var3.field6486 || arg0.field706 == var3.field6499 || arg0.field706 == var3.field6537) {
            var2 = arg0.field5550;
        } else if (arg0.field706 == var3.field6504 || arg0.field706 == var3.field6498 || arg0.field706 == var3.field6503 || arg0.field706 == var3.field6505) {
            var2 = arg0.field5561;
        }
        if (arg1 <= 16) {
            field4110 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 137)
    public static void method1890(int arg0) {
        if (arg0 != -5643) {
            method1890(97);
        }
        field4110 = null;
        field4104 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IC)Z", line = 151)
    public static final boolean method1891(int arg0, char arg1) {
        field4096++;
        if (arg0 != 0) {
            method1886((char) 65431, 75, (String) null);
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)[I", line = 165)
    public final int[] method1892(int arg0, byte arg1) {
        if (arg1 != -115) {
            method1889((class380) null, (byte) 51);
        }
        field4100++;
        if (this.field4108 == this.field4105) {
            this.field4111 = this.field4101[arg0] == null;
            this.field4101[arg0] = class368.field5313;
            return this.field4098[arg0];
        } else if (this.field4108 == 1) {
            this.field4111 = this.field4103 != arg0;
            this.field4103 = arg0;
            return this.field4098[0];
        } else {
            class41 var3 = this.field4101[arg0];
            if (var3 == null) {
                this.field4111 = true;
                if (this.field4108 > this.field4109) {
                    var3 = new class41(arg0, this.field4109);
                    this.field4109++;
                } else {
                    class41 var4 = (class41) this.field4106.method2479(-1);
                    var3 = new class41(arg0, var4.field548);
                    this.field4101[var4.field545] = null;
                    var4.method1820(arg1 ^ 0x62EF);
                }
                this.field4101[arg0] = var3;
            } else {
                this.field4111 = false;
            }
            this.field4106.method2474(-11725, var3);
            return this.field4098[var3.field548];
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(III)V", line = 247)
    public class278(int arg0, int arg1, int arg2) {
        this.field4108 = arg0;
        this.field4105 = arg1;
        this.field4098 = new int[this.field4108][arg2];
        this.field4101 = new class41[this.field4105];
    }
}
