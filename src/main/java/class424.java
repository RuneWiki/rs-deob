import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class424 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lvj;")
    private class422 field5982;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "J")
    public long field5986;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field5981 = 0;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Ltf;")
    public static class701 field5983;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IBI)Z", line = 6)
    public static final boolean method2442(int arg0, byte arg1, int arg2) {
        if (arg1 != 111) {
            field5981 = 115;
        }
        field5984++;
        return (class372.method2164(arg2, arg0, 0) | class39.method200(arg2, (byte) 92, arg0) | class390.method2221(arg2, (byte) 125, arg0)) & class85.method442(arg2, arg0, (byte) 15);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I", line = 17)
    public static final int method2443(int arg0) {
        field5985++;
        if (class476.field6869 == 0) {
            class411.field5497.method2307(new class108("jaclib"), (byte) -9);
            if (class411.field5497.method2299(true).method587(9856) != 100) {
                return 1;
            }
            if (!((class108) class411.field5497.method2299(true)).method585(26152)) {
                class338.field4252.method2558((byte) 4);
            }
            class476.field6869 = 1;
        }
        if (class476.field6869 == 1) {
            class688.field9686 = class411.method2306(false);
            class411.field5490.method2307(new class672(class247.field3053), (byte) -9);
            class411.field5498.method2307(new class108("jaggl"), (byte) -9);
            class411.field5499.method2307(new class108("jagdx"), (byte) -9);
            class411.field5500.method2307(new class108("jagmisc"), (byte) -9);
            class411.field5501.method2307(new class108("sw3d"), (byte) -9);
            class411.field5502.method2307(new class108("hw3d"), (byte) -9);
            class411.field5503.method2307(new class672(class560.field7998), (byte) -9);
            class411.field5504.method2307(new class672(class220.field2624), (byte) -9);
            class411.field5505.method2307(new class672(class388.field5257), (byte) -9);
            class411.field5506.method2307(new class672(class240.field2973), (byte) -9);
            class411.field5507.method2307(new class672(class662.field9281), (byte) -9);
            class411.field5508.method2307(new class672(class364.field4874), (byte) -9);
            class411.field5509.method2307(new class672(class483.field6974), (byte) -9);
            class411.field5510.method2307(new class672(class196.field2269), (byte) -9);
            class411.field5511.method2307(new class672(class671.field9346), (byte) -9);
            class411.field5512.method2307(new class672(class361.field4839), (byte) -9);
            class411.field5513.method2307(new class672(class624.field8827), (byte) -9);
            class411.field5514.method2307(new class672(class617.field8703), (byte) -9);
            class411.field5515.method2307(new class672(class604.field8491), (byte) -9);
            class411.field5516.method2307(new class672(class677.field9499), (byte) -9);
            class411.field5517.method2307(new class488(class6.field76, "huffman"), (byte) -9);
            class411.field5518.method2307(new class672(class611.field8606), (byte) -9);
            class411.field5519.method2307(new class672(class637.field8971), (byte) -9);
            class411.field5520.method2307(new class672(class573.field8139), (byte) -9);
            class411.field5521.method2307(new class568(class178.field1989, "details"), (byte) -9);
            for (int var1 = 0; var1 < class688.field9686.length; var1++) {
                if (class688.field9686[var1].method2299(true) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class411[] var3 = class688.field9686;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class411 var5 = var3[var4];
                int var6 = var5.method2305(-21882);
                int var7 = var5.method2299(true).method587(9856);
                var2 += var6 * var7 / 100;
            }
            class476.field6869 = 2;
            class274.field3432 = var2;
        }
        if (class688.field9686 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class411[] var11 = class688.field9686;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class411 var16 = var11[var12];
            int var17 = var16.method2305(arg0 ^ 0x2F81);
            int var18 = var16.method2299(true).method587(9856);
            var8 += var17;
            if (var18 < 100) {
                var10 = false;
            }
            var9 += var17 * var18 / 100;
        }
        if (arg0 != -31481) {
            method2442(-56, (byte) -110, -30);
        }
        if (var10) {
            if (!((class108) class411.field5500.method2299(true)).method585(26152)) {
                class338.field4252.method2554(119);
            }
            class688.field9686 = null;
        }
        int var13 = var9 - class274.field3432;
        int var14 = var8 - class274.field3432;
        int var15 = var14 <= 0 ? 100 : var13 * 100 / var14;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!mc", name = "finalize", descriptor = "()V", line = 164)
    protected final void finalize() throws Throwable {
        this.field5982.method2391(-52, this.field5986);
        field5987++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lvj;JI)V", line = 176)
    public class424(class422 arg0, long arg1, int arg2) {
        this.field5982 = arg0;
        this.field5986 = arg1;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V", line = 187)
    public static void method2444(int arg0) {
        if (arg0 == 0) {
            field5983 = null;
        }
    }
}
