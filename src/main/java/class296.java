import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class296 {

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "Ltaa;")
    public static class409 field4207 = new class409(1);

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4211 = new BigInteger("92e708e2aa05abd02e67551ceb6b7d49acba5f20c524e8544b49f5900304006a2111eae1b57e38294fbc10f830f84262a3871d9ade0ac70b4ab604f3e6ac840c38409abe27906679c15a2a425b3ea0519194ff0980d599593ad2585333087414c20aeace3ea7d227bd624aca39f8054ae029ee7408be76ccf5d39048fc8732757533be428379d6dce2da93728f52baf249e81371e99fab2e565efb71434089fd68fa1074f5ebba2a5da8979738937c19e07a1b0d912d324a2112d71f81cb0affc663889c8c986f07750e1e8587dafb1853b9d63576af6756a64a81012d3bd1909f666fba2c0db85a10f2dd0c23194a087bf62b1806c08f0589c05d6e32d10904b01df1fcd7ab49b3196231a3665f611bfc76469ac2e705eec5c609cedcc3d904a855e1aa8b5f080363f6b35f51079e744cba70e7a7f59cd6669995a1492250c4b16cd1d95c195910652998a560853e5bafbafd1104becb09d1b95761260dd636aac122a9754c0476177d104a2d43610018c2aff03563e6a9cc9cc345c0f8d73cf10f9945d9304a0f77e8cbaee2e74442f696942da88b235ed643f3cd3eb1e60226d278e563c93190c95268dff0cee2ced3766a8b9768c49d1a8d4144c25d354f6cfea4b09146388c180a7662c98809765ec8fb6238a1dc931c79f9379842586b4fbe5a4d3d1fd7fc5167059c8fd826723884a63600fb0c695d8732c9476334f1", 16);

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
    public static int field4212 = -1;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
    public static int field4213 = -1;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V", line = 6)
    public static final void method1870(byte arg0) {
        if (arg0 == 12) {
            class59.field838.method809(true);
            field4209++;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZLjava/lang/String;)J", line = 19)
    public static final long method1871(boolean arg0, String arg1) {
        field4206++;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0) {
            method1872((byte) -56);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(B)V", line = 45)
    public static void method1872(byte arg0) {
        field4207 = null;
        field4211 = null;
        if (arg0 != 57) {
            method1874((byte) -4, 56);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)I", line = 60)
    public static final int method1873(int arg0, int arg1) {
        field4208++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg0 >= -82) {
            method1871(true, null);
        }
        return 0;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 111)
    public static final String method1874(byte arg0, int arg1) {
        field4210++;
        class194 var2 = (class194) class154.field2501.method2287((long) arg1, (byte) -117);
        if (var2 != null) {
            class377 var3 = var2.field2936.method1214(-17280);
            if (var3 != null) {
                double var4 = var2.field2936.method1215((byte) 84);
                if (var4 >= (double) var3.method2438(-121) && var4 <= (double) var3.method2439(false)) {
                    return var3.method2442((byte) -102);
                }
            }
        }
        if (arg0 <= 73) {
            field4212 = 9;
        }
        return null;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III)Z", line = 143)
    public static final boolean method1875(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            field4211 = null;
        }
        field4205++;
        return class221.method1483(true, arg1, arg0) || class530.method3099(arg1, -119, arg0);
    }
}
