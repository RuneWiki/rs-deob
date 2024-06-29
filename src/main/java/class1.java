import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "b", descriptor = "Len;")
    public static class322 field2 = new class322();

    @OriginalMember(owner = "client!us", name = "c", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3 = new Rectangle[100];

    @OriginalMember(owner = "client!us", name = "e", descriptor = "J")
    public static long field5 = 0L;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "Lmha;")
    public static class417 field4;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)V")
    public static final void method1(int arg0, int arg1, byte arg2) {
        if (arg2 != 13) {
            field5 = 107L;
        }
        field1++;
        if (class525.method3039(arg2 ^ 0x9, arg1)) {
            class337.method1940(arg0, class218.field2938[arg1], false);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lrba;ZZ)V")
    public static final void method2(class435 arg0, boolean arg1, boolean arg2) {
        arg0.field5795 = arg2;
        if (!class454.field6071) {
            class299.method1792(arg0, class634.field8747);
        } else if (arg1) {
            class160.field2211[class160.field2211.length - 1].method3458(-1, arg0);
        } else {
            int var3 = class269.method1601(arg0.field5803);
            int var4 = class312.field4091[2] * arg0.method84(1027) / arg0.field5798;
            int var5 = class269.method1601(arg0.field5803 - var4);
            int var6 = class269.method1601(arg0.field5803 + var4);
            if (var5 == var6) {
                class160.field2211[var3].method3458(-1, arg0);
            } else if (var6 - var5 == 1) {
                class160.field2211[class93.field1294 + var5].method3458(-1, arg0);
            } else {
                class160.field2211[class160.field2211.length - 1].method3458(-1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public static void method3(int arg0) {
        if (arg0 != 30730) {
            method3(106);
        }
        field3 = null;
        field4 = null;
        field2 = null;
    }
}
