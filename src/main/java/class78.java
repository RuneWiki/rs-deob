import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class78 {

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "[S")
    public short[] field1096;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "[Ljava/lang/String;")
    public String[] field1112;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[B")
    public byte[] field1100;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
    public int[] field1095;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "[S")
    public short[] field1105;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1102 = "cyan:";

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Z")
    public static boolean field1109 = false;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[I")
    public static int[] field1097;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    public final int method523(int arg0, int arg1) {
        if (arg1 == 25488) {
            field1099++;
            return this.field1100[arg0] & 0x3;
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ldl;I)V")
    public static final void method524(class123 arg0, int arg1) {
        class153.field2269 = arg0;
        if (arg1 <= 7) {
            field1111 = 28;
        }
        field1101++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)V")
    public static final void method525(int arg0, int arg1, byte arg2) {
        int var3 = arg1--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class172.field2697[arg1];
        field1106++;
        int var5 = class137.field2040[arg1];
        if (arg0 == 0) {
            class13.field165.method892(72, (byte) -99);
            class45.field576++;
            class13.field165.method184(var3 + var3 + 3, 113);
        }
        if (arg0 == 1) {
            class189.field2983++;
            class13.field165.method892(80, (byte) -48);
            class13.field165.method184(var3 + var3 + 17, 105);
        }
        if (arg0 == 2) {
            class76.field1079++;
            class13.field165.method892(185, (byte) -28);
            class13.field165.method184(var3 + var3 + 3, 127);
        }
        class203.field3171 = class172.field2697[0];
        class79.field1142 = class137.field2040[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class13.field165.method183((byte) -124, class137.field2040[arg1] - var5);
            class13.field165.method183((byte) -126, class172.field2697[arg1] - var4);
        }
        if (arg2 < -1) {
            class13.field165.method212(-102, class123.field1844[82] ? 1 : 0);
            class13.field165.method223(-1720191288, var4 + class246.field3943);
            class13.field165.method193((byte) 112, class126.field1869 + var5);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ldl;ILdl;)V")
    public static final void method526(class123 arg0, int arg1, class123 arg2) {
        field1107++;
        int var3 = -7 % ((12 - arg1) / 41);
        class236.field3775 = arg2;
        class118.field1737 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method527(String arg0, int arg1) {
        field1113++;
        class162 var2 = (class162) class4.field63.method350(8240);
        if (arg1 != 185) {
            method526((class123) null, -59, (class123) null);
        }
        while (var2 != null) {
            if (var2.field2513.equals(arg0)) {
                class176.field2755 = var2;
                return;
            }
            var2 = (class162) class4.field63.method353((byte) -122);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Z")
    public final boolean method528(int arg0, byte arg1) {
        if (arg1 == -83) {
            field1098++;
            return (this.field1100[arg0] & 0x10) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Z")
    public final boolean method529(int arg0, int arg1) {
        if (arg0 <= 7) {
            return false;
        } else {
            field1104++;
            return (this.field1100[arg1] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)Z")
    public final boolean method530(int arg0, int arg1) {
        field1103++;
        int var3 = -53 % ((arg0 - 36) / 52);
        return (this.field1100[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
    public class78(int arg0) {
        this.field1110 = arg0;
        this.field1096 = new short[this.field1110];
        this.field1112 = new String[this.field1110];
        this.field1100 = new byte[this.field1110];
        this.field1095 = new int[this.field1110];
        this.field1105 = new short[this.field1110];
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method531(int arg0) {
        field1097 = null;
        int var1 = 57 % ((70 - arg0) / 55);
        field1102 = null;
    }
}
