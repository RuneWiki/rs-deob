import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class39 extends class317 {

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    private int field441 = 4096;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    private int field445 = 0;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field436 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "Ljava/lang/String;")
    public static String field444 = "Connection lost.";

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "Ljava/lang/String;")
    public static String field447 = "purple:";

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "Z")
    public static boolean field446 = false;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field448 = 0;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Lnj;")
    public static class223 field442;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)[I", line = 6)
    public final int[] method140(int arg0, int arg1) {
        field439++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -97);
        if (this.field4847.field2751) {
            int[] var4 = this.method2225((byte) 66, 0, arg1);
            for (int var5 = 0; var5 < class326.field4933; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field445 <= var6 && var6 <= this.field441 ? 4096 : 0;
            }
        }
        if (arg0 != 542) {
            method238(-101);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 43)
    public static final boolean method235(String arg0, String arg1, int arg2) {
        if (arg2 >= -39) {
            field436 = (BigInteger) null;
        }
        field437++;
        int var3 = arg0.length();
        int var4 = arg1.length();
        if (var4 > var3) {
            return false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            char var7 = arg1.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lkm;ILkm;)V", line = 77)
    public static final void method236(class133 arg0, int arg1, class133 arg2) {
        class123.field1670 = arg2;
        class279.field4189 = arg0;
        field438++;
        class239.field3390 = class279.field4189.method970(-86, 3);
        if (arg1 >= -101) {
            method236((class133) null, -39, (class133) null);
        }
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)Z", line = 91)
    public static final boolean method237(int arg0) {
        if (arg0 != 0) {
            method235((String) null, (String) null, 76);
        }
        field440++;
        if (class333.field5034) {
            try {
                return !(Boolean) class325.method2277(arg0 - 21230, class165.field2258.field1157, "showingVideoAd");
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)V", line = 113)
    public static void method238(int arg0) {
        field442 = null;
        field444 = null;
        field436 = null;
        if (arg0 != -13340) {
            method236((class133) null, 78, (class133) null);
        }
        field447 = null;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 126)
    public class39() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lcg;II)V", line = 146)
    public final void method60(class316 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field445 = arg0.method2220((byte) 124);
        } else if (arg2 == 1) {
            this.field441 = arg0.method2220((byte) 91);
        }
        int var5 = -22 % ((-arg1 - 17) / 40);
        field443++;
    }
}
