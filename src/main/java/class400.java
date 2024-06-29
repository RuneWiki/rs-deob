import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class400 {

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "[S")
    public short[] field5721;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "[S")
    public short[] field5725;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "[I")
    public int[] field5724;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "J")
    public long field5726;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lofa;")
    public static class347 field5718 = null;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "[Lvf;")
    public static class162[] field5719;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI)I", line = 12)
    public static final int method2437(int arg0, byte arg1, int arg2) {
        field5723++;
        if (class171.field2237 == -1) {
            return 1;
        } else if (arg1 == -87) {
            if (class125.field1721.field5141.method2541(43) != arg2) {
                class546.method3144(class58.field710.method365(class55.field647, (byte) 73), -2, true, arg2);
                if (class125.field1721.field5141.method2541(43) != arg2) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class669.field8962.getSize();
                class316.method2017(0, true, class58.field710.method365(class55.field647, (byte) 124), class375.field5490, class355.field5157, class166.field2202);
                class625 var4 = class180.method1226(class171.field2237, class768.field10581, 0, true);
                long var5 = class401.method2440(false);
                class375.field5490.method526();
                class33.field312.method814(0, class281.field4067, 0);
                class375.field5490.method509(class33.field312);
                class375.field5490.method436(var3.width / 2, var3.height / 2, 512, 512);
                class375.field5490.method468(1.0F);
                class375.field5490.method555(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class497 var7 = class375.field5490.method484(var4, 2048, 64, 64, 768);
                int var8 = 0;
                label43: for (int var9 = 0; var9 < 500; var9++) {
                    class375.field5490.method493(0);
                    class375.field5490.method547();
                    for (int var10 = 15; var10 >= 0; var10--) {
                        for (int var11 = 0; var11 <= var10; var11++) {
                            class559.field7670.method814((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class30.field299), 0, (var10 + 1) * class30.field299);
                            var8++;
                            var7.method254(class559.field7670, null, 0);
                            if (((long) arg0) <= (class401.method2440(false) - var5)) {
                                break label43;
                            }
                        }
                    }
                }
                class375.field5490.method535();
                long var12 = (long) (var8 * 1000) / (class401.method2440(false) - var5);
                class375.field5490.method493(0);
                class375.field5490.method547();
                return (int) var12;
            } catch (Throwable var15) {
                var15.printStackTrace();
                return -1;
            }
        } else {
            return 114;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[FB)[F", line = 97)
    public static final float[] method2438(int arg0, float[] arg1, byte arg2) {
        if (arg2 <= 101) {
            method2437(-52, (byte) 99, 47);
        }
        field5720++;
        float[] var3 = new float[arg0];
        class421.method2537(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(J[I[S[S)V", line = 112)
    public class400(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field5721 = arg2;
        this.field5725 = arg3;
        this.field5724 = arg1;
        this.field5726 = arg0;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 123)
    public static void method2439(boolean arg0) {
        field5719 = null;
        field5718 = null;
        if (!arg0) {
            field5722 = 66;
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 133)
    protected class400() {
    }
}
