import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class465 extends class263 {

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public int field5770;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field5768;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[I")
    public int[] field5766;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "[Z")
    public boolean[] field5764;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "[[I")
    public int[][] field5771;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
    public int[] field5765;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5769 = new BigInteger("b8723b79d189873a9eccf9ec8dd00bbf9393b64e6cc79bc8b45e583f074bf82bdcbf22aa5c0dff9481f14cff10422de6bc4abd0a20050d2836985a16e28e1989050860a405fff1cd6161dbead76c2053c8da9df43378dfe05edcc0847202f957ae5045238cf2246d13862e1d04d20b476418b0c135e746b757ba742dda9161a4cfb7f4781593ed6c9cc3b0cb6622556bbafcd14f60cb71d5a2fa888c91f08fa00f9ebc3a12cc42c67dca60559aa66a7266603effde04004274d9a06bc76ce65639c07f0ed01aa51004a1d4dd0ba486ed5078a820c6d3e683bf3a5b886a69af4a1765812c7a520d9ae1e4d43815b814a2a1d849931f870dad08121d5aa6a9ba98abfccd1fdc98ffe15bef53864eebfe3cc79de84578dd01978eeed674a776d28e414d9f0dfcd3c16054853f28d8efac5680cfa5dc56eefc9229da06f3f1d0e5add02d46127bfc636b7c11c1c6e0c88bf9caf06306a0ac17b91637735eff3b056c44beb0ecbdc7893027d2fb0f54a08641f516713bc63fe32191a156e93d9010c030493d2075aef9603605b093dca16b551ca9de6e4869fb2a0d02636e14ceba72c2dd3a82b77c8c1d8155121f93845de743124f361ba5cd531b83167557652322f5a78187fb0eb042943c3a34f32933a350a2ad23c3160c8cd74d007e4c8e14d28fa5da2b1e1f397f8e5a3f36c3420ec25e3e9a0a0368607364ea852f71ced869", 16);

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Lcga;")
    public static class449 field5773 = new class449(45, 7);

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZZI)V")
    public static final void method2536(boolean arg0, boolean arg1, int arg2) {
        field5767++;
        if (arg0) {
            class591.field7943--;
            if (class591.field7943 == 0) {
                class76.field999 = null;
            }
        }
        if (arg2 != 0 || !arg1) {
            return;
        }
        class299.field3804--;
        if (class299.field3804 == 0) {
            class644.field8740 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method2537(int arg0) {
        field5773 = null;
        if (arg0 == 45) {
            field5769 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLrr;)V")
    public static final void method2538(byte arg0, class337 arg1) {
        if (arg0 < 20) {
            field5773 = null;
        }
        field5763++;
        if (class188.field2234 != arg1.field4298) {
            return;
        }
        if (class67.field815.field4673 == null) {
            arg1.field4313 = 0;
            arg1.field4266 = 0;
            return;
        }
        arg1.field4284 = 150;
        arg1.field4182 = (int) (Math.sin((double) class665.field9027 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field4266 = class350.field4523;
        arg1.field4158 = 5;
        arg1.field4313 = class346.method1996(class67.field815.field4673, (byte) 72);
        arg1.field4264 = 0;
        arg1.field4315 = class67.field815.field487;
        arg1.field4256 = class67.field815.field465;
        arg1.field4159 = class67.field815.field442;
        class207 var2 = arg1.field4256 == -1 ? null : class11.field110.method1141(arg1.field4256, (byte) 111);
        if (var2 != null) {
            class309.method1829(true, arg1.field4315, var2);
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I[B)V")
    public class465(int arg0, byte[] arg1) {
        this.field5770 = arg0;
        class572 var3 = new class572(arg1);
        this.field5768 = var3.method3097((byte) 12);
        this.field5766 = new int[this.field5768];
        this.field5764 = new boolean[this.field5768];
        this.field5771 = new int[this.field5768][];
        this.field5765 = new int[this.field5768];
        for (int var4 = 0; var4 < this.field5768; var4++) {
            this.field5766[var4] = var3.method3097((byte) 12);
            if (this.field5766[var4] == 6) {
                this.field5766[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field5768; var5++) {
            this.field5764[var5] = var3.method3097((byte) 12) == 1;
        }
        for (int var6 = 0; var6 < this.field5768; var6++) {
            this.field5765[var6] = var3.method3031(-1);
        }
        for (int var7 = 0; var7 < this.field5768; var7++) {
            this.field5771[var7] = new int[var3.method3097((byte) 12)];
        }
        for (int var8 = 0; var8 < this.field5768; var8++) {
            for (int var9 = 0; var9 < this.field5771[var8].length; var9++) {
                this.field5771[var8][var9] = var3.method3097((byte) 12);
            }
        }
    }
}
