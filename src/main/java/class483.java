import jaclib.memory.Buffer;
import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public abstract class class483 {

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "Ler;")
    public class92 field7093;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "Z")
    private boolean field7094;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    private int field7092;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    private int field7096;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public int field7098;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7091 = new BigInteger("f81a9bd83e1b8e3678882af6eafc821d6ca33d7c921982bb63b5de3bba72ec93803b4364b7810299fe94561c630c9d853cd37e1873becb61211f1b297c74a550fc7a3edfd3755a7bbf912033c97ff14de8343b4aa60cc5921b8d36c60e7cdeee67098d8d13f4291db006dbdba6650dc335517c67432f9be70177c3150c1dbc69cf38623890e0a1065f943340c7ef0374035f42aa1fce8e042e84c520e48318c0d040e513cc61ab854d8fd0c4ecc8ef02b225f945063075d9a4582bb71fedf6a164904550a16b7f5abe7181217d308d7fd5ebc920ac7e801de6c3f2b5242d7e04c699c4925de874bdf2c286452c6a2d19aaa25b2ce5d610faccdd7496fb4fbd1cbdd8e93b98d003f5cf5224fd53c12e10f4f31c25d473d3ddfc60bac2afbb95f2b87b18f35b1b04bec3033b6603cf37405e50c0c53fe82cb895fb0d560d3e3f10f5de6fe9e838c858b74e6350ae30329e193abc88387a56709ad3b65543407869a92eb9bfdb33f4404b2b255ff50bbc5a26d4173e48002d50853f581314d8e6f36ef9bc4e1e4bc636cfffd3988e0be940c0978df738fbaf4eec8ad7ef270c3c4abd57660aeafae6100a5cac7d5f84dcc097f20c9f9c4d02c57fffa657c9d62daa5a00f92604cb5ba266244ba925d3648cdb4a345fc8d6624ae61bebfabcd4f290ca73c4551a7e0e456728d700152cc32a56f78e9580fd5744674e1dc368e9e1d1", 16);

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!baa", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field7095++;
        this.field7093.method823((byte) 44, this.field7098, this.field7096);
        super.finalize();
    }

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "(I)V", line = 13)
    public static final void method2971(int arg0) {
        field7097++;
        if (arg0 != 1) {
            return;
        }
        while (class558.field8066.method3402(class344.field5550, (byte) -80) >= 15) {
            int var1 = class558.field8066.method3404(15, arg0 + 7);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class348 var3 = (class348) class592.field8395.method1558((long) var1, (byte) -93);
            if (var3 == null) {
                class589 var4 = new class589();
                var4.field4197 = var1;
                var3 = new class348(var4);
                class592.field8395.method1564((long) var1, var3, (byte) 100);
                var2 = true;
                class613.field8707[class289.field4581++] = var3;
            }
            class589 var5 = var3.field5577;
            class102.field1690[class283.field4523++] = var1;
            var5.field4223 = class562.field8084;
            if (var5.field8354 != null && var5.field8354.method3981(arg0 - 1)) {
                class301.method2080(-125, var5);
            }
            int var6 = class558.field8066.method3404(2, 8);
            int var7 = class558.field8066.method3404(1, 8);
            int var8 = class558.field8066.method3404(5, arg0 + 7);
            var5.method3442((byte) 104, class538.field7860.method3224(class558.field8066.method3404(14, 8), 50));
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = class558.field8066.method3404(5, 8);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = class558.field8066.method3404(3, 8) + 4 << 11 & 0x3B8E;
            int var11 = class558.field8066.method3404(1, 8);
            if (var11 == 1) {
                class326.field5075[class373.field5831++] = var1;
            }
            var5.method1846(var5.field8354.field9949, -114);
            var5.field4168 = var5.field8354.field9927 << 3;
            if (var2) {
                var5.method1845(true, arg0 ^ 0x1, var10);
            }
            var5.method3440(var5.method1841(20744), (byte) 114, var7 == 1, class567.field8141.field4264[0] + var8, var6, class567.field8141.field4265[0] + var9);
            if (var5.field8354.method3981(arg0 ^ 0x1)) {
                class24.method410(var5.field4265[0], null, var5, var5.field4264[0], 0, var5.field9695, (byte) -109, null);
            }
        }
        class558.field8066.method3398((byte) 104);
    }

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "(I)V", line = 96)
    public static void method2972(int arg0) {
        field7091 = null;
        if (arg0 != 0) {
            field7091 = null;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "([BIB)V", line = 109)
    public final void method2973(byte[] arg0, int arg1, byte arg2) {
        field7099++;
        this.method689((byte) 112);
        if (arg2 > -123) {
            this.field7094 = false;
        }
        if (this.field7096 >= arg1) {
            OpenGL.glBufferSubDataARBub(this.field7092, 0, arg1, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field7092, arg1, arg0, 0, this.field7094 ? 35040 : 35044);
            this.field7093.field1345 += arg1 - this.field7096;
            this.field7096 = arg1;
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Ler;I[BIZ)V", line = 143)
    public class483(class92 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field7093 = arg0;
        this.field7094 = arg4;
        this.field7092 = arg1;
        this.field7096 = arg3;
        OpenGL.glGenBuffersARB(1, class307.field4829, 0);
        this.field7098 = class307.field4829[0];
        this.method689((byte) 112);
        OpenGL.glBufferDataARBub(arg1, this.field7096, arg2, 0, this.field7094 ? 35040 : 35044);
        this.field7093.field1345 += this.field7096;
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Ler;ILjaclib/memory/Buffer;IZ)V", line = 162)
    public class483(class92 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field7092 = arg1;
        this.field7094 = arg4;
        this.field7096 = arg3;
        this.field7093 = arg0;
        OpenGL.glGenBuffersARB(1, class307.field4829, 0);
        this.field7098 = class307.field4829[0];
        this.method689((byte) 112);
        OpenGL.glBufferDataARBa(arg1, this.field7096, arg2.getAddress(), this.field7094 ? 35040 : 35044);
        this.field7093.field1345 += this.field7096;
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(B)V")
    public abstract void method689(byte arg0);
}
